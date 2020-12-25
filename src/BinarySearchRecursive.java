public class BinarySearchRecursive {

    static int binarysearch (int [] array, int search_value, int left, int right){
        int middle = (left+right) /2; // finner midt punktet til array
      
        // check if array has only one element, basically first index==last index

        //Remember! Divide & Conquer basics is used in binary search. We divide or split the array until one element is left
        // if the middle element does not equal the search element we divide again until the last element
        // the search value must equal either the middle element until there is only one element left,
        // where start and end index are same, if the not the the element does not exist in the array



        if(right==left){
           if(array[left]==search_value) {
               return left;  
           }
           else {return -1; } // element not in the array
       }



        if (array[middle] <= search_value)
        {
            if(array[middle]==search_value) {return middle;}

            return binarysearch(array,search_value,middle+1,right);


        }
        return  binarysearch(array,search_value,left, middle-1);


    }



    public static void main(String[] args) {
        int values [] ={1,2,4,8,17,19,22};
        System.out.println(binarysearch(values,0,0,values.length-1));
    }


}
