package mx.rafuru.excercises;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a method to replace all spaces in a string with ‘%20’.
 */
public class ReplaceSpaces {

    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        if(input==null){
            return;
        }
        System.out.println(replaceSpaces(input));
    }

    private static String replaceSpaces(String input){

        char[] arr = input.toCharArray();
        int numSpaces=0;
        // O(n)
        for(char c : arr){
            if(c==' '){
                numSpaces++;
            }
        }
        if(numSpaces == 0){
            return input;
        }
        //O(n)
        char[] newString = new char[arr.length+(numSpaces*2)];
        int pointer = 0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==' '){
                newString[pointer]='%';
                newString[pointer+1]='2';
                newString[pointer+2]='0';
                pointer+=3;
            }else {
                newString[pointer] = arr[i];
                pointer++;
            }
        }

        // Worst case O(n^2) needs to be improved. But it can be?
        return new String(newString);
    }
}
