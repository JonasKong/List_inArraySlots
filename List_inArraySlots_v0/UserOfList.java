/** 
 Test list features.
 */
public class UserOfList {
	
     public static void main( String[] args ) {
		 List_inArraySlots list = new List_inArraySlots();
         System.out.println( "number of elements: " + list.size() );
         System.out.println( "empty list:" + list);

         /* Populate the list with elements, but with a small enough
           number that we expect no invocation of expand().
         */
         int i = 0;
         for(i = 0; i < 5; i++ ) {
             list.add( -i); // differs from index, but similar
             System.out.println( "number of elements: " + list.size() );
         }
         System.out.println("initial population of " + list.size() + " elements:");
         System.out.println( list);
        
         // Add enough elements that expansion is expected
         for( i = 5; i < 15; i++ ) {
             if( i == 10) System.out.println( "expansion expected");
             list.add( -i);
             System.out.println( "number of elements: " + list.size() );
         }
         System.out.println("result of second population: " + list.size() + " elements:");
         System.out.println( list);
        
         // Trust no one.
         for( ; i < 35; i++ ) 
             list.add( -i);
         System.out.println("after second expansion: " + list.size() + " elements:");
         System.out.println( list.size());
		 System.out.println( "sample elements from list:");
         for(int elemIndex = 1; elemIndex < list.size(); elemIndex *= 2 ) {
             System.out.println( "element " + elemIndex + ": "
                             + list.get( elemIndex)
                             );
		 }					  
		 //setTest(  8);
         //setTest( 16);
		
		 //addAtTest( 0, 29); // beginning of the list
		 //addAtTest( list.size(), 17); // end of the list using the new add method
		 //addAtTest( 2, 19); // middle of a small list
		 //addAtTest( 2, 23); // force an expansion 
		
		// --------- end of "code that worked in v0" ---------

        // test accessor
        System.out.println( "sample elements from list:");
        for( int elemIndex = 1; elemIndex < list.size(); elemIndex *= 2 ) {
            System.out.println( "element " + elemIndex + ": "
                              + list.get( elemIndex)
                              );
        }
	 }
}