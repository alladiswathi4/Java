package sample;

public class PersonAge {

	public void checkPersonAge(int age) {
		if(age<13&&age>0) {
			System.out.println("kid");
		}
		else if(age>19) {
			System.out.println("adult");
		}
		else if(age>13&&age<19) {
		System.out.println("teen");
		}
		else {
			System.out.println("outofrange");
		}
	}
    public static void main(String[] args) {
		PersonAge obj=new PersonAge();
		obj.checkPersonAge(10);
		obj.checkPersonAge(21);
		obj.checkPersonAge(15);
		obj.checkPersonAge(-5);

		
	}

}
