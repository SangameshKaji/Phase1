//37. Group Anagrams
import java.util.*;

public class Q37 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String word : strs){
            char c[] = word.toCharArray();
            Arrays.sort(c);
            String key = new String(c);

            if(!map.containsKey(key)) map.put(key,new ArrayList<>());

            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            String strs[] = new String[n];
            for(int i = 0;i<n;i++) strs[i] = sc.next();
            System.out.println(groupAnagrams(strs));
        }
    }    
}
