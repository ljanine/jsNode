var fs = require('fs');
var array=fs.readFile(process.argv[2], 'utf8', callback );

function callback(err, array){
	if (err)
	{
		console.log("Error existente");
	}
	else
	{
		var cuenta=array.split("\n");
		console.log(cuenta.length - 1);
	}
}