public class SubsetSum {
	static boolean isSubset(int arr[],int n,int sum)
	{
		if(sum==0)
		{
			return true;
		}
		if(n==0 && sum!=0)
		{
			return false;
		}
		if(arr[n-1]>sum)
		{
			return isSubset(arr,n-1,sum);
		}
		return isSubset(arr,n-1,sum) || isSubset(arr,n-1,sum-arr[n-1]);
	}

public static void main(String[] args) {
	int arr[]= {1,3,5,6,8,9};
	int sum=9;
	int n=arr.length;
	if(isSubset(arr,n,sum)==true)
	{
		System.out.println("Subset found");
	}
	else
	{
		System.out.println("Subset  not found");
	}
			
			
}
	
}

