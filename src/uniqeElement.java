import java.util.HashSet;
import org.apache.commons.lang3.ArrayUtils;

public class uniqeElement {

    public static int  count (int []a){

        if(!isSorted(a)) throw new IllegalStateException("Ikke sortert");


        HashSet<Integer> elements = new HashSet<>();
        for (Integer element: a) {
            elements.add(element);
        }
        return elements.size();

    }

    public static boolean isSorted (int[] a) {
        // works with v3.4 or above
        return ArrayUtils.isSorted(a);
    }

    public static int antallUlike(int [] arr)
    {
        int antall =1;
         for(int i=0; i<arr.length-1;i++ ){

             if(arr[i]!=arr[i+1]){
                 antall++;
             }
         }
         return antall;

    }

    public static int ulikeUsortert (int [] arr){
        if (arr.length==0) return 0;
        else if (arr.length==1) return 1;

        int result =1;
        for (int i=1;i<arr.length;i++)
        {
            int j=0;
            for (j=0;j<i;j++)
            {
                if(arr[j]==arr[i])break;
            }

            if(j==i) result++;
        }

        return result;

    }

    public static void main(String[] args) {
        int [] array = {2,2,5,3,3};
        //System.out.println(count(array));
        System.out.println(ulikeUsortert(array));
    }




}
