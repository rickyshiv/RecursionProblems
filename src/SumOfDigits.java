public class SumOfDigits {

	public static void main(String[] args) {
		SumOfDigits n=new SumOfDigits();
		int n1=n.SumOf(57);
		System.out.println(n1);
		
		
	
	

	}


public int SumOf(int n)
{
	if(n<0)
	{
		return 0;
	}
	if(n==0)
	{
		return 0;
	}
	return n%10+SumOf(n/10);
}
}
