import java.util.Scanner;;
class Sample
{
	int n,r,s=0;
	void readData(int num)
	{
		n=num;
	}
	int palindrome()
	{
		int temp=n;
		while(n>0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		if(s==temp)
			return 1;
		else
			return 0;
	}
	
}
class Demo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Sample ob=new Sample();
		int num,res;
		System.out.println("Enter a number:");
		num=sc.nextInt();
		ob.readData(num);
		res=ob.palindrome();
		if(res==1)
			System.out.println("The number is a palindrome");
		else	
			System.out.println("The number is not a palindrome");
		
	}
}
	
	