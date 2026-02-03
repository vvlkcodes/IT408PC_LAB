class B extends A {
	static int neu;
	
	public static void display(){
		System.out.println(neu+view);
	}
	@Override
	public int show(){
		return neu+view;
	}
	public void pearl(){
		System.out.println("Iam B, Child of A");
	}
	public void displayA(){
		super.display();
	}
}

