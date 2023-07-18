
// **Q.8** Create a Backend For Counter Web App with Api Endpoint for Managing Counter Using Express

// - ‘/’ → send counter data as {counter:counter}
// - `/increment` → increment counter by 1 and send in response latest data as {counter:counter}
// - `/decrement` → decrement counter by 1 and send in response latest data as {counter:counter}

// **Note:** Using Express is Mandatory for this Question


const express = require("express");

const app = express();

const PORT = 3040;

const HOSTNAME = 'localhost';

app.get('/', (req, res) => {
    res.send(JSON.stringify({ counter: counter }));
})

app.get('/increment', (req, res) => {
    res.send(JSON.stringify({ counter: increment()}));
})

app.get('/decrement', (req, res) => {
    res.send(JSON.stringify({ counter: decrement()}));
})

app.listen(PORT, () => {
    console.log(`Server is running at http://${HOSTNAME}:${PORT}`);
})

let counter = 0;

increment = () => {
    counter++;
    return counter;
}

decrement = () => {
    counter--;
    return counter;
}