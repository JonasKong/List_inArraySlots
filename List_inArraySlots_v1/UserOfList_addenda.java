Test methods newly-added to List_inArraySlots.

Start by marking the end the code that has been tested.
I am reluctant to delete working code (since working 
code is rare in my life, and I might have further use 
for these tests. But I'd like make it easy to find new tests,
for myself and other readers. I'd use a comment like...

        // --------- end of "code that worked in v0" ---------

        // test accessor
        System.out.println( "sample elements from list:");
        for( elemIndex = 1; elemIndex < list.size(); elemIndex *= 2 ) {
            System.out.println( "element " + elemIndex + ": "
                              + list.get( elemIndex)
                              );
        }
        
-------------------------------------------
     Local method and invocations of it to...
        // test set
        setTest(  8);
        setTest( 16);
          
    /**
      Test the set() method, reporting and
      changing the value at index @modifyAt.
     */
    private static void setTest( int modifyAt
                              ) {
        System.out.println(
            "changed element " + modifyAt + " from "
          + list.set( modifyAt, modifyAt + 1000) + " to "
          + list.get( modifyAt)
          );
     }
     
     
-------------------------------------------
     Local method and invocations of it to
     test adding an element at a specified position.
     
        addAtTest( 0, 29); // beginning of the list

        // end of the list using the new add method
        addAtTest( list.size(), 17);

        addAtTest( 2, 19); // middle of a small list

        Check this test. Is the array full?
        addAtTest( 2, 23); // force an expansion 


    /**
      Test the 2-argument add( index, value) method.
     */
    private static void addAtTest( int addAt
                                 , int value
                                 ) {
        System.out.println(
            "insert " + value 
          + " at position " + addAt
          + ", resulting in "  + list.size() + " elements:"
          + System.lineSeparator()
          + list
          + System.lineSeparator()
        );
    }
