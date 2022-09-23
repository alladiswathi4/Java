package sample;

public class PalindromeTest {
	public static void main(String[]args) {
		String text="Noon";
		String reverse="";
		int size=text.length();
		System.out.println(size);
		for(int i=(size-1);i>=0;--i) {
			reverse=reverse+text.charAt(i);
		}
		System.out.println(reverse);
		if(text.equalsIgnoreCase(reverse)){
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
