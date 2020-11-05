let faker = require('faker')


// console.log(faker.random.alphaNumeric(5), faker.random.number(1000))
const { execSync } = require("child_process");

const USERS = 2000000;

for (let i = 0; i < (USERS / 500); i++) {
    let u = '';
    for (let j = 0; j < 500; j++) {
        u +=   ${faker.address.longitude(73, 92, 4)} ${faker.address.latitude(11, 32, 4)} USER_${(i * 500) + j};
    }
    // console.log(redis-cli geoadd glb ${u});
    execSync(redis-cli geoadd glb ${u});
}