//import java packages
import java.util.Arrays;
import java.util.Scanner;

//defining the IdenticalArrays class
public class IdenticalArrays 
{
	// defining the main mathod
	public static void main(String[] args)
	{
	//initialising the data type,variables and values
	//int i = 0 ,j = 0;
	int array1 = 0;
	int array2 = 0;
	int [][] a = new int[array1][array2];
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter an array list: ");	
	array1 = scan.nextInt();

	System.out.println("Enter second array list: ");
	array2 = scan.nextInt();

	// if else statement to confirm the results from arrays
		if (array1 != array2 )
		{
			System.out.println("Not Identical Arrays");
		}
		else if (array1 == array2)
		{
			
			System.out.println("Identical Arrays");
		}
		scan.close();
	}
}