/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // declare fields here
    public int[] refArray;
    public int filledElements = 0;


    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
		refArray = new int[10];
    }


    /** 
      @return the number of elements in this list
    */
    public int size() {
		return refArray.length;
    }


     /** 
       @return a string representation of this list,
       in [a,b,c,] format
      */ 
    public String toString() {
		String array = "[";
		for (int i = 0; i< refArray.length - 1 ; i++){
			array += refArray[i] + ",";
		}
		array += refArray[refArray.length - 1] + "]";
		return array;   
    }

    
    /* 
      Appends @value to the end of this list.
      
      @return true, in keeping with conventions yet to be discussed
     */
    public boolean add( int value) {
		if (filledElements > refArray.length - 1) {
			expand();
		}
		refArray[filledElements] = value;
		filledElements++;
		return true;
	}


    /** 
      Double the capacity of the List_inArraySlots, 
      preserving existing data
     */
    private void expand() {
        System.out.println( "expand... (for debugging)");
        int newCapacity = refArray.length * 2;
		int[] newArray = new int [newCapacity];
		for (int i = 0; i < refArray.length; i++){
			newArray [i] = refArray [i];
		}
		refArray = new int[newCapacity];
		refArray = newArray;
    }
}
