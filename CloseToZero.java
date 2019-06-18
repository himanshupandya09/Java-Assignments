
import java.util.*;
import java.lang.*;
public class CloseToZero
{
   public static void main (String[] args) 
    {
      int arr[] = {1, 5, -4, 7, 8, -6};
      int size = arr.length;
      int l, r, minsum, sum, minleftnum, minrightnum;
    
      if(size < 2)
      {
        System.out.println("Invalid Input");
        return;
      }
      
      minleftnum = 0;
      minrightnum= 1;
      minsum = arr[0] + arr[1];
      
      for(l = 0; l < size - 1; l++)
      {
        for(r = l+1; r < size; r++)
        {
          sum = arr[l] + arr[r];
          if(Math.abs(minsum) > Math.abs(sum))
          {
            minsum = sum;
            minleftnum = l;
            minrightnum = r;
          }
        }
      }
      
      System.out.println("Two elements whose sum is minimum are "+
                        arr[minleftnum]+ " and "+arr[minrightnum]);
    }
}
