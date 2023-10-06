package javaTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Roman Number: ");
        String roman = sc.next();

        int result = romanToInt(roman);
        System.out.println("Roman number "+roman+" is equivalent to integer "+result);


    }

    public static int romanToInt(String s){
        Map<Character, Integer> romanValue = new HashMap<>();
        romanValue.put('I', 1);
        romanValue.put('V', 5);
        romanValue.put('X', 10);
        romanValue.put('L', 50);
        romanValue.put('C', 100);
        romanValue.put('D', 500);
        romanValue.put('M', 1000);

        int result = 0;
        int preValue = 0;

        for(int i = s.length()-1; i>=0 ; i--){
            char currentChar = s.charAt(i);
            int currentValue = romanValue.get(currentChar);
            
            if(currentValue < preValue){
                result -= currentValue;
            }else{
                result += currentValue;
            }
            preValue = currentValue;
        }
        return result;
        
    }
}
