import java.util.*;
public class Factorial {
	public int factorial(int n)
	{
		if(n==0||n==1)
		{
			return 1;
			
		}
		if(n<0)
		{
			return -1;
		}
		return n*factorial(n-1);
	}
public static void main(String[] args) {
	Factorial n=new Factorial();
	int rec=n.factorial(5);
	System.out.println(rec);
	

	}

}
