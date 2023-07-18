// Q.7 Build a Server that Generate Random Number Using Express
// ‘/random’ → send random number in response {random:10}

const express = require("express");

const app = express();

const PORT = 3030;

const HOSTNAME = 'localhost';

app.get('/', (req, res) => {
    res.send('hello world')
})

app.get('/random', (req, res) => {
    res.send(JSON.stringify({ random : random()}));
})

app.listen(3030, () => {
    console.log(`Server is running at http://${HOSTNAME}:${PORT}`);
})

random = () => {
    return Math.floor(Math.random() * 100);
}