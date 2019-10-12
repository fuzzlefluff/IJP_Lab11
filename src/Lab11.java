import java.util.Scanner;
public class Lab11 {

	public static void main(String[] args) {
		//calling methods to create, sort and print our array
		double[] myArray = inputArray();
		selectionSort(myArray);
		printArray(myArray);
		//print a header
		System.out.print("\nPlease enter a search key: ");
		//take the search key input
		Scanner input = new java.util.Scanner(System.in);
		double key = input.nextDouble();
		//call the search method
		int searchresult= binarySearch(myArray,key);
		//check to see if our failstate value was returned
		if(searchresult == -1)
		{
			//print an error message
			System.out.println(key+" is not in the list");
		}
		if(0 < searchresult & searchresult< myArray.length){
		//print the returned search with its value
		System.out.print("List["+searchresult+"] = "+myArray[searchresult]);
		}
	}
	//a method that prompts and saves user input into an array
	public static double[] inputArray()
	{
		//we setup an array with a value of 10
		double[] myArray= new double[10];
		//setup our input object and print a header
		Scanner input = new java.util.Scanner(System.in);
		System.out.print("Please enter the 10 double terms: ");
		//take and save input into the entire array
		for(int c=0; c<myArray.length; c++)
		{
			myArray[c] = input.nextDouble();
		}
		//return our data filled array
		return myArray;
	}
	//a method that sorts a double array from smallest to largest
	public static void selectionSort( double[] list )
	{
		//setup a loop to go through the array
		for(int current= 0; current<list.length; current++)
		{
			//setup a loop to go through the array again for comparison
			for(int c=0; c<list.length; c++)
			{
				//test to see which value is larger and swap accordingly
				if(list[current]<list[c])
				{
					double temp;
					temp =list[current];
					list[current] = list[c];
					list[c] = temp;
				}
			}
		}
	}
	//a method that prints the inputed array
	public static void printArray ( double[] list )
	{
		//print some headers
		System.out.println("\nPrinting Array:");
		//a loop that prints the entire array
		for(int c=0; c<list.length; c++)
		{
			System.out.println("list["+c+"] ="+list[c]);
		}
	}
	//a search that returns the location of an inputed key in the array if it is found
	static int binarySearch( double[] list, double key )
	{
		int min=0;
		int max= list.length-1;
		while(min<max)
		{
		int middle= (min+max)/2;
			if(list[middle] == key)
			{
				return middle;
			}
			if(list[middle]<key)
				{
				min = middle + 1;
				continue;
				}
			if(list[middle]>key)
			{
				max = middle -1;
				continue;
			}
		}
		 return -1;
	}
}

