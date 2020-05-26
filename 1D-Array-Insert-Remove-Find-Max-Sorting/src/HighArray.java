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

public class HighArray 
{
	private long[] a;                 // ref to array a
	private int nElems;               // number of data items
	//-----------------------------------------------------------
	public HighArray(int max)         // constructor
	{
		a = new long[max]; // Disadvantage: fixed size  // create the array
		nElems = 0;                        // no items yet
	}
	//-----------------------------------------------------------
	public int size()
	{ 
		return nElems;        // returning the number of elements
	}
	//-----------------------------------------------------------
	// Advantage: Insertion is quick.
	public void insert(long value)    // put element into array
	{
		a[nElems] = value;             // insert it
		nElems++;                      // increment size
	}
	//-----------------------------------------------------------
	// Disadvantage: Deletion is slow. - using the find method
	public boolean delete(long value)
	{
		int j = find(value);
		if(j == -1)                 // can't find it
			return false;
		else                           // found it
			for(int k=j; k<nElems; k++)  // move higher ones down
				a[k] = a[k+1];
		nElems--;                   // decrement size
		return true;
	}  // end delete()
	//-----------------------------------------------------------
	// Disadvantage: Search is slow.
	public int find(long searchKey)
	{                              // find specified value
		int j;
		for(j=0; j<nElems; j++)            // for each element,
			if(a[j] == searchKey)           // found item?
				break;                       // exit loop before end
		if(j == nElems)                    // gone to end?
			return -1;                   // yes, can't find it
		else
			return j;                    // no, found it
	}  // end find()
	//-----------------------------------------------------------

	public void display()             // displays array contents
	{
		for(int j=0; j<nElems; j++)       // for each element,
			System.out.print(a[j] + " "); // Advantage: Access is very fast if the index is known. // display it
		System.out.println("");
	}

	//-------------------------------------------------------------------------------------------
	//----------------------------- Programming Project 2.1 -------------------------------------
	public long getMax()               // gets the maximum key value
	{
		long max = -1;
		for(int i = 0; i < nElems; i++)  // look for it
			if(a[i] > max)         // max value is replaced if a greater key value is found
				max = a[i];
		return max;
	} // end getMax()
	//------------------------------ Programming Project 2.2 --------------------------------------
	public long removeMax()           // removes the maximum value
	{
		long max = getMax();          // getting the maximum key value from getMax() method
		delete(max);                  // deleting it
		return max;
	} //end removeMax
	//----------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------
}  // end class HighArray

////////////////////////////////////////////////////////////////

