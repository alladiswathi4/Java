package sample;

public class StringReverse {

	public static void main(String[] args) {
		String temp="water";
		String reverse="";
		for(int i=temp.length()-1;i>=0;i--)
		{
			reverse=reverse+temp.charAt(i);
		}
		System.out.println(reverse.toString());
	}

}
