class Task6
{
	public static void main(String [] args)
	{
	/*int num=Integer.parseInt(args[0]);
	int find = -1;

	int arr[]={2,4,6};
	for (int x=0; x<arr.length; x++)
	{
	
	if (num==arr[x])
		{
			find=x;
			break;
		}
	}
		if (find!=-1)
		{
			System.out.print("found at positon " + (find+1));
		}
		else 
		{
			System.out.print("Not found");
		}
	
	}
}*/
int find =Integer.parseInt(args[0]);
        int count=0;
        int arr[] = {1,6,7,8,4,20,10};
        for(int i=0; i<arr.length; i++)
        {
        	if (find==arr[i])
        	{
        		System.out.println("Number found at Postion no:" + (i+1));
                count++;
        	}
        }
        if(count==0)
            {
                System.out.println("Number not Found");

            }
	}
}
