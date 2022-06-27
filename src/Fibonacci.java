import java.util.*;
public class Fibonacci{
	public int fibonacci(int n)
	{
		if(n==0 ||n==1)
		{
			return n;
		}
		if(n<0)
		{
			return -1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
public static void main(String[] args) {
	Fibonacci f=new Fibonacci();
	int f1=f.fibonacci(9);
	System.out.println(f1);


	}

}
