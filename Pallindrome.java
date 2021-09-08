package week1.day2.assignment;

public class Pallindrome {
	public static void main(String[] args) {
		int num=454
				;
		int pallin=num;
		int reverse=0;
		int quotient,remainder;
	
	while(num!=0)
	{
		remainder=num%10;
		quotient=num/10;
		reverse=reverse*10+remainder;
		num=quotient;
		System.out.println(reverse);
		
	}
	
	
		if(pallin==reverse)
		{
			System.out.println(pallin+ "is a pallindrome number");
		}
		else
		{
			System.out.println(pallin+ "is not a pallindrome number");
		}
		
		}

}
