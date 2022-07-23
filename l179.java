import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class l179 {
    public String largestNumber(int[] nums) {
        
        List<String> a = new ArrayList<>();
        for(int i: nums){
            a.add(String.valueOf(i));
        }
        Collections.sort(a, new Comparator<>(){
            public int compare(String x, String y){
                return (y+x).compareTo(x+y);
            }
        });
        String res = String.join("",a);
        return String.valueOf(Integer.parseInt(res));
    }
}
