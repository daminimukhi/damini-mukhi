class Task4
{
	public static void main(String [] args )
	{
		int arr1[][]={{2,2},{2,2}};
		int arr2[][]={{2,2},{2,2}};
		int sum[][]= new int [2][2];

		for (int x=0;x<arr1.length;x++)
		{
			for (int y=0;y<arr2.length; y++)
			{
				sum[x][y]=arr1[x][y]+arr2[x][y];
				System.out.print(sum[x][y]+ " ");
			}
		System.out.println();
	}
	}
}