class Box2 {
	double width;
	double height;
	double depth;
	
	void volume() {
		System.out.println("Volume is ");
		System.out.println(width*height*depth);
	}
}
public class BoxDemo3 {
	public static void main(String args[]) {
		Box2 mybox = new Box2();
		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 15;
		mybox.volume();
	}

}
