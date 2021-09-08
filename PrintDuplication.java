package week1.day2.assignment;

public class PrintDuplication {
public static void main(String[] args) {
	int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	int arr1=arr.length;
	System.out.println("length :"+arr1);
	int count;
	for (int i = 0; i < arr.length-1; i++)
	{		
		count=0;
		for (int j = i+1; j < arr.length-1; j++)
		{
			 
			if(arr[i]==arr[j]) // compare both the loop variables & check they're equal
			{
				count=count+1;		// increase the count if both the arrays are equal
			}	
		// Out of the inner loop, check and print the first array variable if count is more than 0
				
		}
		if(count>0)
		{
		System.out.println(arr[i]);
		}
	}
}
}
