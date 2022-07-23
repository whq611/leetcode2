import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class l386 {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        for(int i=1; i<=n; i++){
            res.add(i);
        }
        Collections.sort(res, new Comparator<>(){
            public int compare(Integer x, Integer y){
                return String.valueOf(x).compareTo(String.valueOf(y));
            }
        });
        return res;
    }
}
