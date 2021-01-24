import java.util.Scanner;
class Program1
{
	public static void main(String[] args) 
	{
	Scanner input=new Scanner(System.in);
	System.out.println("enter a number");
	int n=input.nextInt();
	if(digit(n))
		{
			System.out.println("the digits in "+n+ " are in raising order");
		}
		else
		{
			System.out.println("the digits in "+n+ " are not in raising order");
		}
	}
	public static boolean digit(int n)
	{
		int temp=n;
	while(temp>0)
		{
			int d=temp%10;
			temp=temp/10;
				if((temp%10>d))
			{
					return false;
			}
		}
		return true;
	}
}
