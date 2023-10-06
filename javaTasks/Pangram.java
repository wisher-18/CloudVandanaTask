package javaTasks;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = sc.next();

        boolean isPangram = checkPangram(input);

        if(isPangram){
            System.out.println("The input is a pangram.");
        }
        else{
            System.out.println("The input is not a pangram");
        }
    }
    public static boolean checkPangram(String input){
        input = input.toLowerCase();

        Set<Character> uniqueLetters = new HashSet<>();

        for(int i = 0; i< input.length(); i++){
            char ch = input.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                uniqueLetters.add(ch);
            }
        }

        return uniqueLetters.size() == 26;
    }
}
