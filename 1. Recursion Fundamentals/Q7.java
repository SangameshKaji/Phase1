//7. Printing only vowels within a String using recursion 
import java.util.*;

class Q7{
    static boolean isVowel(char ch) {
    return String.valueOf(ch).matches("(?i)[aeiou]");
}

    static void printVowels(String s, int idx) {
        if (idx == s.length()) return;
        if (isVowel(s.charAt(idx))) {
            System.out.print(s.charAt(idx));
        }
        printVowels(s, idx + 1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            printVowels(s, 0);
        }
    }
}

// import java.util.*;

// public class Q7 {

//     static boolean isVowel(char ch) {
//         ch = Character.toLowerCase(ch);
//         return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//     }

//     static void printVowels(String s, int idx) {
//         if (idx == s.length()) return;

//         if (isVowel(s.charAt(idx))) {
//             System.out.print(s.charAt(idx) + " ");
//         }

//         printVowels(s, idx + 1);
//     }

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             String s = sc.nextLine();
//             printVowels(s, 0);
//         }
//     }
// }