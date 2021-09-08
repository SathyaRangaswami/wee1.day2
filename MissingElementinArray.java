package week1.day2.assignment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingElementinArray {
	public static void main(String[] args) {
	
		int[] arr ={0, 1,2,3,4,7,6,8};
		Arrays.sort(arr);
		
		int arr1=Array.getLength(arr);
		System.out.println("length "+arr1);
		for (int i = 0; i <=arr1; i++)
		{
			System.out.println("sorted :"+arr[i]);
		
			if(i!=arr[i])
			{
				
				System.out.println("Element is missing" +i);
				break;
			}
			
			
	}
	}

}
