//38. Simplify Path
import java.util.*;

public class Q38 {
    static String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        for(String s : path.split("/")){
            if(s.equals("..")){
                if(!st.isEmpty()) st.pop();
            }else if(s.length()>0 && !s.equals(".")) st.push(s);
        }
        return "/"+String.join("/",st);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String path = sc.nextLine();
            System.out.println(simplifyPath(path));
        }
    }
}
