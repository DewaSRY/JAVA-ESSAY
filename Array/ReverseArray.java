package Array;

import java.util.Arrays;

public class ReverseArray {
    

    public static void run() {

        System.out.println( Arrays.toString( new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(Arrays.toString(reverse.reverseCopy(new int[]{1,2,3,4,5})));
    }
}

class reverse {
    
    static public int[] runt(int[] numbers) {
        int maxIdx = numbers.length - 1;
        int halfLength = Math.round(maxIdx / 2);

        for (int num = 0; num < halfLength; num++) {
            int temp = numbers[num];
            numbers[num] = numbers[maxIdx - num];
            numbers[maxIdx - num] = temp;
        }
        return numbers;
    }

    static public int[] reverseCopy(int[] numbers){
        
        int[] reverseArr= new int[numbers.length];
        int maxIdx= numbers.length-1;
        for(int el: numbers){
            reverseArr[maxIdx--]= el;
        }
        return reverseArr;


    }
} 