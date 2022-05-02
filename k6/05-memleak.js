import http from 'k6/http';
import { sleep } from 'k6';
export const options = {
    vus: 2,
    duration: '60s',
};
export default function () {
    const res = http.get('http://localhost:8080/process-order/');
}