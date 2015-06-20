var n=0;
for(i=2;i<process.argv.length; i++)
{
	var num=Number(process.argv[i]);
	n += num;

}

console.log(n);