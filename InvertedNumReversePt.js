/*
	Print Inverted Number Pattern
	Description: Write a program to print an inverted number pattern.
	Input: n = 5
	Output:
	 Copy
	5 4 3 2 1
	4 3 2 1
	3 2 1
	2 1
	1
*/
for(let i=1;i<=5;i++)
{
	let srt="";
	let a=6-i;
	for(let j=1;j<6;j++)
	{
		if(j<=6-i)
		{
			srt+=a--;
		}
	}
	console.log(srt);
}