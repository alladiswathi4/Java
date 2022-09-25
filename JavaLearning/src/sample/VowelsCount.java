package sample;

public class VowelsCount {

	public static void main(String[] args) {
		String text="water";
	int count=0;
		for(int i=0;i<text.length();i++) {
			if(text.charAt(i)=='a'||text.charAt(i)=='e'||text.charAt(i)=='i'||text.charAt(i)=='o'||text.charAt(i)=='u')
			{
				count++;
			}
		}
		
		System.out.println("count"+count);
		

	}

}
