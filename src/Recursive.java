public class Recursive {


    public  static int sum (int number){
        if (number==0){
            return 0;
        }
        return number+sum(number-1);
    }
    public static int sumInArray(int [] array, int position){

        if(array.length-1==position){
            return array[position];
        }
        System.out.println(array[position]);

        return array[position]+sumInArray(array,position+1);
    }

    public static int faculity(int n){
        if(n==1) {return 1;}
        return n*faculity(n-1);
    }


    public static void main(String[] args) {

        int [] a = {1, 2, 3, 4};
        System.out.println(sumInArray(a, 0));
        System.out.println(faculity(5));
        //System.out.println(sum(2));

    }


}
