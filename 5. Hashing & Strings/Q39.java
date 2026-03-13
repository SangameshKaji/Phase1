//39. Integer to Roman
import java.util.*;

public class Q39 {
    static String intToRoman(int num) {
        int values[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String word[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<values.length;i++){
            while(num>=values[i]){
                num -= values[i];
                sb.append(word[i]);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int num = sc.nextInt();
            System.out.println(intToRoman(num));
        }
    }
}
