package mx.rafuru.excercises;

import java.util.Scanner;


/**
 * Create an algorithm that given a number print the same number inverted
 * Can't use arrays, Strings, ONLY math operations
 */
public class Rearrangenumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();

        System.out.println(rearrangeNumber(input));

    }

    private static long rearrangeNumber(long input) {
        long result = 0;
        while(input>=1){
            long div = input/10;
            long res = input%10;
            input = div;
            if (res > 1) {
                result = (res + result) * 10;
            }else{
                result=result+1;
            }


        }
        return result;
    }

}
