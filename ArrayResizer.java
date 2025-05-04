public class ArrayResizer 
{
   /**
    * Returns true if and only if every value in row r
    * of array2D is non-zero.
    * Precondition: r is a valid row index in array2D.
    * Postcondition: array2D is unchanged.
    */
   public static boolean isNonZeroRow(int[][] array2D, int r) 
   {
      for(int i : array2D[r])
      {
       if(i == 0) return false;
      }
      return true;
       }

   /**
    * Returns the number of rows in array2D that contain
    * all non-zero values.
    * Postcondition: array2D is unchanged.
    */
   public static int numNonZeroRows(int[][] array2D) 
   {
      int rows = 0;
      for(int rows = 0; row < array2D.length; row++)
       if(isNonZeroRow(array2D, row)) rows++;
      return rows;
   }

   public static int[][] resize(int[][] array2D) 
   {
       int rows = numNonZeroRows(array2D);
       int cols = array2D[0].length;
       int [][]arr = new int[rows][cols];
       int r = 0;
       for(int row = 0; row < array2D.length; row++)
       {
        if(isNonZeroRow(array2D,row)) arr[r] = array2D[row];
       r++;    
       }
      return arr;
       }
}
