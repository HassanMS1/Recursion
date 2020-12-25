import java.util.Arrays;

public class sortInTwo {


    static void sort (int [] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0){
                for (int j=arr.length-1;j!=0;j--)
                {
                    if(arr[j]%2==1) swap(arr,i,j);

                }
            }
        }
    }

    public static void swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a]=arr[b];
        arr[b]=tmp;

    }

    public static void arrangeSort (int [] arr)
    {
        int left=0;
        int right=arr.length-1;

        while (left<right)
        {
            while (arr[left]%2==0 && left<right)
            {
                left++;
            }

            while (arr[right]%2==1 && right>left){
                right--;
            }
            if(left<right){
                swap(arr, right,left);
                right--;
                left++;

            }


        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {


        int [] array = {11,10,13,12,15};
        sort(array);
        //System.out.println(Arrays.toString(array));
        arrangeSort(array);
    }
}
