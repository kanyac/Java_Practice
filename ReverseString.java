package Practice_One;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Hello Java";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			//System.out.println(s.charAt(i));
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	
	}

}
