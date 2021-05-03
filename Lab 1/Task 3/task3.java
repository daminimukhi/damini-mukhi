
class Area{
	int length;
	int breadth;

	Area(int length,int breadth){
     this.length = length;
     this.breadth = breadth;
	}
	public int getArea(){
      return this.length*this.breadth;
	}
	public static void main(String args[]){

		Area rec = new Area(5,4);
		System.out.print(rec.getArea());
	}
}