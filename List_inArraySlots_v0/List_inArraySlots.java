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

	public int get( int index ) {
		return refArray[index];
    }

	public int set( int index, int newValue ) {
		int oldValue = refArray[index];
		refArray[index] = newValue;
		return oldValue;
    }
	
    /** 
      Double the capacity of the List_inArraySlots, 
      preserving existing data
     */
    private void expand() {
        System.out.println( "expand... (for debugging)");
		int[] newArray = new int [refArray.length*2];
		for (int i = 0; i < refArray.length; i++){
			newArray [i] = refArray [i];
		}
		refArray = newArray;
    }
	
	
	
	
	/**
      Insert @value at position @index in this list.

      Shift the element currently at that position (if any)
      and any subsequent elements to the right
      (that is, increase the index associated with each).
     */
     public void add( int index, int value) {
		for (int i = index; i < this.refArray.length; i ++){
			if (i == this.refArray.length - 1) {
				this.expand();
			}
			int x = this.refArray[i];
			this.refArray[i] = value;
			value = x;
		}
     }
	
	public void addAsHead(int val) {
		for (int i = 0; i < this.refArray.length; i++) {
			if (i == this.refArray.length - 1) {
				this.expand();
			}
			int x = this.refArray[i];
			this.refArray[i] = value;
			value = x;
		}
	}
	
	/**
      Remove the element at position @index in this list.

      Shift any subsequent elements to the left (that is,
      decrease the index associated with each).

      @return the value that was removed from the list
     */
     public int remove( int index) {
		 int length = this.refArray.length;
		 int removed = this.refArray[index];
		 for (int i = index; i < length; i ++){
			 if (i == length - 1) {
				 this.refArray[i] = 0;
			 } else {
				this.refArray[i] = this.refArray[i + 1];
			 }
		 }
		 return removed;
     }
	 
}
