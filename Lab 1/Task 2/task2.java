class Area{
	int length;
	int breadth;
	public void setDim(int length,int breadth){
     this.length = length;
     this.breadth = breadth;
	}
	public int getArea(){
      return this.length*this.breadth;
	}
	public static void main(String args[]){
		Area rec = new Area();
		rec.setDim(5,3);
		rec.getArea();
	}
}