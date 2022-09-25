package sample;

class Parent{
	public void add(int a,int b) {
		
		System.out.println("parent class"+(a+b));
	}
}
class Child extends Parent{
	public void add(int a,int b) {
		System.out.println("child class"+(a+b));
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public void test() {
		
	}
}
public class MethodOverridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parentObj=new Parent();
		parentObj.add(1, 2);
		Child childObj=new Child();
		childObj.add(2, 3);
		

	}

}
