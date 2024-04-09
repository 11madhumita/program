import java.util.Scanner;;
class Sample
{
	int n,r,s=0,temp;
	void readData(int num)
	{
		n=num;
	}
	int armstrong()
	{
		temp=n;
		while(n>0)
		{
			r=n%10;
			s+=r*r*r;
			n=n/10;
		}
		if(temp==s)
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
		res=ob.armstrong();
		if(res==1)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
	}
}
	
	