public class TowerOfHanoi {

	public static void tower(int n,char a,char b,char c)
	{
		if(n==1)
		{
			System.out.println("Moves disks from"+a+"to"+c);
			
		}
		else
		{
		tower(n-1,a,c,b);
		tower(1,a,b,c);
		tower(n-1,b,a,c);
	}
	}
	public static void main(String[] args) {
		int n=3;
		tower(n,'A','B','C');
		

	}

}
