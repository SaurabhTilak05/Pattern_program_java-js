/*
	Print Hollow Square
	Description: Write a program to print a hollow square pattern.
	Input: n = 5


		Output:
		*****
		*   *
		*   *
		*   *
		*****
*/

for(let i=1;i<6;i++)
{
	let srt="";
	for(let j=1;j<6;j++)
	{
		if(i==1 || i==5 || j==1 || j==5)
		{
			srt+="*";
		}
		else{
			srt+=" ";
		}
	}
	console.log(srt);
}