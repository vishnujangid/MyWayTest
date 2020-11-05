let faker = require('faker')
const { execSync } = require("child_process");

const express = require('express')
const app = express()
const port = 3000

app.get('/redis-glb', (req, res) => {
    let user = faker.random.number(2000000);
    let result = execSync(redis-cli GEORADIUSBYMEMBER glb USER_${user} 10 km).toString();

    res.send({user, result})
})

app.get('/redis-lb', (req, res) => {
    let user = faker.random.number(1999950);
    let result = execSync(redis-cli ZRANGE lb ${user} ${user + 20} WITHSCORES).toString();

    res.send({user, result})
})


app.listen(port, () => {
    console.log(Example app listening at http://localhost:${port})
})