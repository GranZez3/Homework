package tasks;

import java.util.Arrays;

public class First {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }
 // comment for bro
    public static int[] removeLocalMaxima(int[] array){
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        for(int i = 0; i < array.length; i++){
            if(i==0){
                if(array[i] <= array[i+1]) list.add(array[i]);
            } else if (i == array.length - 1) {
                if(array[i] <= array[i-1]) list.add(array[i]);
            } else{
                if(!(array[i] > array[i-1] && array[i]> array[i+1])){
                    list.add(array[i]);
                }
            }
        }
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i]= list.get(i);
        }
        return result;
    }
}