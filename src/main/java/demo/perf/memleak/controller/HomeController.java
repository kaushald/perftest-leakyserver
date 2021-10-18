package demo.perf.memleak.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
public class HomeController {

    // Define the logger object for this class
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public static String getResourceFileAsString(String fileName) {
        InputStream is = getResourceFileAsInputStream(fileName);
        if (is != null) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            return reader.lines().collect(Collectors.joining(System.lineSeparator()));
        } else {
            throw new RuntimeException("resource not found");
        }
    }

    public static InputStream getResourceFileAsInputStream(String fileName) {
        ClassLoader classLoader = HomeController.class.getClassLoader();
        return classLoader.getResourceAsStream(fileName);
    }

    @GetMapping(value = "/process-order")
    public UUID loadHomePage(HttpSession session, Model model) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }

        String str = getResourceFileAsString("large-file.txt");
        str.intern();

        session.setAttribute("uid", uid);
        model.addAttribute("uid", uid);
        try {
            long time = (long) (Math.random() * 1000);
            Thread.sleep(time);
            // log.info("slept for : " + time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return UUID.randomUUID();
    }

    @GetMapping(value = "/login")
    public String login(HttpSession session, Model model) {
        return "Login successful";
    }

}
