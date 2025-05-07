/* Print Star Pyramid
Description: Write a program to print a pyramid using stars.
Input: n = 5
Output:

     *
   ***
  *****
 *******
*********

*/

for(let i=1;i<=5;i++)
{
	let srt="";
	for(let j=1;j<=9;j++)
	{
		if(j<=6-i && j>=4+i)
		{
			srt+="*";
		}
		else{
			srt+=" ";
		}
	}
	console.log(srt);
}