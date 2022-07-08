import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class l720 {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        String res = "";
        Set<String> set = new HashSet<>();
        for(String word: words){
            if(word.length()==1 || set.contains(word.substring(0,word.length()-1))){
                if(word.length()>res.length()) res = word;
                set.add(word);
            }
        }
        return res;
    }
}
