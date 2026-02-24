//24. Letter Combinations of a Phone Number
import java.util.*;

public class Q24 {
  static List<String> letterCombinations(String digits) {
    if (digits.isEmpty())
      return new ArrayList<>();

    List<String> ans = new ArrayList<>();

    dfs(digits, 0, new StringBuilder(), ans);
    return ans;
  }

  private static final String[] digitToLetters = {"",    "",    "abc",  "def", "ghi",
                                                  "jkl", "mno", "pqrs", "tuv", "wxyz"};

  static void dfs(String digits, int i, StringBuilder sb, List<String> ans) {
    if (i == digits.length()) {
      ans.add(sb.toString());
      return;
    }

    for (final char c : digitToLetters[digits.charAt(i) - '0'].toCharArray()) {
      sb.append(c);
      dfs(digits, i + 1, sb, ans);
      sb.deleteCharAt(sb.length() - 1);
    }
  }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String digits = sc.nextLine();
            System.out.println(letterCombinations(digits));
        }
    }    
}
