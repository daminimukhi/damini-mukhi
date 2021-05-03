class Task51
{
	public static void main(String [] args)
	{
		int [] arr = new int [3];
		 arr[0] = 5;
		 arr[1] = 2;
		 arr[2]= 6;
		if (arr[0]>arr[1] && arr[0]>arr[2])
		{
			System.out.print(arr[0]);
		}
		if (arr[1]>arr[0] && arr[1]>arr[2])
		{
			System.out.print(arr[1]);
		}
		if (arr[2]>arr[0] && arr[2]>arr[1])
		{
			System.out.print (arr[2]);
		}
	}
	}
