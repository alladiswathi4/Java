package sample;

public class MethodOverloading {
	
	public  int add(int a,int b) {
		return a+b;
	}
	
	
	public  int add(int a, int b, int c) {
		return a+b+c;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		System.out.println(obj.add(1, 2));
		System.out.println(obj.add(1, 2,3));

	}

}
