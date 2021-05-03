class Task5
{
	public static void main(String [] arrgs)
	{
		int [] arr={5,6,8};
		int max=arr[0];
		for (int x=1;x<arr.length;x++)
		{
			if (max<arr[x])
			{
				max=arr[x];
			}

		}
		System.out.print("Largest number "+max);
	}
}