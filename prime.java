import java.util.Scanner;;
class Sample
{
	int n,r,s=0;
	void readData(int num)
	{
		n=num;
	}
	int prime()
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0){
				s=1;
				break;
			}
		}
		return s;
			
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
		res=ob.prime();
		if(res==1)
			System.out.println("The number is a not prime");
		else	
			System.out.println("The number is prime");
	}
}
	
	