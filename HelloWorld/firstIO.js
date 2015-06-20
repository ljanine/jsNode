var fs = require('fs');
var array=fs.readFileSync(process.argv[2]);
var str =array.toString();
var cuenta=str.split("\n");

console.log(cuenta.length - 1);



