import java.util.HashMap;

public class l953 {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> dic = new HashMap<>();
        for(int i=0; i<order.length(); i++){
            dic.put(order.charAt(i), i);
        }
        for(int i=0; i<words.length-1; i++){
            for(int j=0; j<words[i].length(); j++){
                if(j==words[i+1].length()) return false;
                if(dic.get(words[i].charAt(j))>dic.get(words[i+1].charAt(j))) return false;
                if(dic.get(words[i].charAt(j))<dic.get(words[i+1].charAt(j))) break;
            }
        }
        return true;
    }
}
