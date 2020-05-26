/*******************************************************************
 * New York Institute of Technology  
 * Elis Cucka                       
 * Data Structures - CSCI 260 M05 
 * Spring 2019 Semester                 
 * Assignment 1: Chapter 2 Programming Projects
 * Goal: Performing different operations to the elements of the array.
 * Editing the HighArray class.
 * Instructor's name: Michael Kadri    
 * Date of program's creation:      
 * January 23, 2019     Version 0.13 
 ********************************************************************/

class HighArrayApp
{
	public static void main(String[] args)
	{
		int maxSize = 12;            // array size
		HighArray arr;                // reference to array
		arr = new HighArray(maxSize); // create the array


		arr.insert(77);               // insert 10 items
		arr.insert(99);
		arr.insert(24);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		arr.insert(113);

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("The elements of the array are: ");  
		arr.display();                // display items
		System.out.println("\nThe max value is: " + arr.getMax());   // displaying the max value
		System.out.println("\nAfter removing the maximum value, which is: " + arr.removeMax() + ", the array is left with: "); //removing one element of the array
		arr.display();

		//---------------------------------------------------------------- Programming Project 2.3 ---------------------------------------------------------------
		System.out.println("\nNow the final sorted array is: ");   
		//System.out.println(arr.size());
		int num = arr.size();
		for (int i = 0; i < num; i++) //sorting the elements of the array
		{ 
			System.out.print(arr.getMax() + " ");           
			arr.removeMax();
		} 
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	}  // end main() 	   	
}