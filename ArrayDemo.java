package question1;

public class ArrayDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDemo ad = new ArrayDemo();
		
		int arr1[] = ad.manipulateIntegerArray();
		
		for( int i = 0 ; i < arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
	}
	
	int[] manipulateIntegerArray()
	{
		int array[]= {10,20,30,40,50};
		
		for(int i=0; i<array.length;i++)
		{
			array[i]= array[i]+5; 
		}
		
		return array;
	}

}
