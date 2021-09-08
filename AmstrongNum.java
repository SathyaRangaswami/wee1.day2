package week1.day2.assignment;

public class AmstrongNum {
public static void main(String[] args) {
	int num=153;
	int calculated=0;
	int remainder,original,quotient;
	original=num;
	while(num>0)
	{
		remainder=num%10;
		quotient=num/10;
		calculated=(remainder*remainder*remainder)+ calculated;
		num=quotient;
		
	}
	if(calculated==original)
	{
		System.out.println(original+" is a Amstrong number");
	}
	else
	{
		System.out.println(original + "is a not  Amstrong number");
	}
}
}
