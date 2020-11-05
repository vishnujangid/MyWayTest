let faker = require('faker')


// console.log(faker.random.alphaNumeric(5), faker.random.number(1000))
const { execSync } = require("child_process");

const USERS = 2000000;

for (let i = 0; i < (USERS / 500); i++) {
    let u = '';
    for (let j = 0; j < 500; j++) {
        u +=  ${faker.random.number(1000) * 5} USER_${(i * 500) + j};
    }
    execSync(redis-cli zadd lb ${u});
}

// redis-benchmark -n 100000 -q script load "redis.call('zrange','lb', '20911', '20931', 'WITHSCORES)"