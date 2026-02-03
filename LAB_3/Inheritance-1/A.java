// A class extends it's properties using the properties of an other class
class A {
	static int view;
	public static void display(){
		System.out.println("This is a static method from A");
		System.out.println(view);
	}
	public int show(){
		System.out.println("This is a non-static method");
		return view;
	}
}














