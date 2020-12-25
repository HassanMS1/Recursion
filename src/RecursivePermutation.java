import java.lang.reflect.Array;
import java.util.Arrays;

public class RecursivePermutation {

    static void recursive_permuation(int [] array, int k){

        if(k==array.length-1){
            System.out.println(Arrays.toString(array));
        }



        for (int i=k;i<array.length;++i)
        {

            swap(array,i,k); // bytter første tall til andre posistion
            // vi skal printer byttting gjennom rekursiv

            // den printer først 2,1,3 som ble byttet og kommer tilbake  til først dimensjon fordi k != < a.length
            // neste runde i løkke i første dimensjon så 3,2,1 og rekursive printer 3,1,2 og returnerer igjen
            recursive_permuation(array,k+1);
            //System.out.println(Arrays.toString(array));
            // legger k eller første tilbake til sin gammle stedt
            swap(array,k,i);


        }


    }
    public static void swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a]=arr[b];
        arr[b]=tmp;

    }


    public static void main(String[] args) {
        int[] arrayet ={1,2,3};
        recursive_permuation(arrayet,0);
       // System.out.println(arrayet.length);

    }

}
