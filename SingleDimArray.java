package day4;

public class SingleDimArray {

	public static void main(String[] args) {
		 
		/*int a[] = new int[5]; // declared array with size 5; starting index is 0; last index is 4 
		
		// storing or inserting values into array
		a[0] = 12;
		a[1] = 10;
		a[2] = 25;
		a[3] = 32;
		a[4] = 64;
		
		System.out.println(a[0]);*/
		
		int a[] = {10,20,30,40,50}; //Declare an array without specifying size(dynamic size)
		System.out.println("Siz of array :"+a.length); //prints size of an array
		System.out.println(a[3]); //prints specified value from array
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("reading values using enhanced for loop");
		for(int i : a)
		{
			System.out.println(i);
		}
				
	}

}







