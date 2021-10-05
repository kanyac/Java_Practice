package Practice_One;

public class PrimeNumber {

	public static void main(String[] args) {
		int num =13;
		boolean prime = false;
		for(int i = 2;i<num/2;i++ )
		{
			if(num%i==0)
			{
				prime = true;
			  break;
			}
		}
		if(prime==true) System.out.println(num +"  Not a prime");
		else System.out.println(num+" is Prime ");
	}

}
