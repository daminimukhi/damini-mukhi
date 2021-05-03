import java.util.ArrayList;
import java.util.*;
class HotelReservation{
	Scanner sc=new Scanner(System.in);
		List name=new ArrayList(5);
		List bed= new LinkedList();
		int[]arr=new int[5];
		int[]n=new int[5];
		int num=0;
	HotelReservation(){
		
		String k="",j="";
		System.out.println("enter number of rooms you want to reserve:");//reserving number of rooms
        num=sc.nextInt();
        if(num<=10){
        for(int i=0;i<num;i++){
         System.out.println("Enter you name:");//name of reserver
         k=sc.nextLine();
         name.add(k);//adding name into array list
         k="";
         System.out.println("Enter floor number:");//room on which floor we want to reserve 
         arr[i]=sc.nextInt();
         System.out.println("Enter number of bed");//number of beds required
         j=sc.nextLine();
         bed.add(j);//adding number of bed in linked list
         j="";
         System.out.println("enter number of days you want to reserve room");
         n[i]=sc.nextInt();
        }
    }
	
	else{
		System.out.println("You can reserve upto 5 rooms at a time.....");
		
	}
}
//public Object search(Object ob){

//}
public void show(){
	System.out.println(num+" rooms are reserved successfully!!");
      for (int i=0;i<num;i++) {
      		System.out.println("Order num:"+i);
      		System.out.println("Name:"+name.get(i));//getting element on that index in array list
      		System.out.println("Num of beds:"+bed.get(i));//getting element on that index in linked list
      		System.out.println("Floor number:"+arr[i]);
      		System.out.println("Total charge:"+(n[i]*5000));
      }
     /* do{
        String c;
      	System.out.println("Do you want to see your reservation(y/n:");
        c=sc.nextLine();
        while(c!="n" || c!="N"){
        
        }
      }*/

}

}