import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
public class l399 {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[] res = new double[queries.size()];
        HashMap<String, List<List<String>>> dic = new HashMap<>();
        for(int i=0; i<values.length; i++){
            final int k = i;
            List<List<String>> tm = dic.getOrDefault(equations.get(i).get(0), new ArrayList<>());
            tm.add(new ArrayList<>(){{
                add(equations.get(k).get(1));
                add(String.valueOf(values[k]));
            }});
            dic.put(equations.get(k).get(0), tm);
            List<List<String>> tp = dic.getOrDefault(equations.get(k).get(1), new ArrayList<>());
            tp.add(new ArrayList<>(){{
                add(equations.get(k).get(0));
                add(String.valueOf(1.0/values[k]));
            }});
            dic.put(equations.get(k).get(1), tp);
        int a=0, b=0;
        for(List<String> q: queries){
            a++;
            if(!dic.containsKey(q.get(0)) || !dic.containsKey(q.get(1))){
                res[b] = -1.0;
                b++;
                continue;
            }
            else if(q.get(0).equals(q.get(1))){
                res[b] = 1.0;
                b++;
                continue;
            }
            Deque<List<String>> queue = new LinkedList<>();
            queue.offer(new ArrayList<>(){{
                add(q.get(0));
                add("1.0");
            }});
            HashSet<String> visited = new HashSet<>();
            while(!queue.isEmpty()){
                if(a==b) break;
                List<String> tmp = queue.poll();
                String cur = tmp.get(0);
                double num = Double.valueOf(tmp.get(1));
                if(visited.contains(cur)) continue;
                visited.add(cur);
                if(dic.containsKey(cur)){
                    List<List<String>> value = dic.get(cur);
                    HashMap<String, Double> nex = new HashMap<>();
                    for(List<String> val: value){
                        nex.put(val.get(0), Double.valueOf(val.get(1)));
                    }
                    for(String key: nex.keySet()){
                        if(!visited.contains(key)){
                            if(key.equals(q.get(1))){
                                res[b] = num*nex.get(key);
                                b++;
                                break;
                            }
                            queue.offer(new ArrayList<>(){{
                                add(key);
                                add(String.valueOf(num*nex.get(key)));
                            }});
                        }
                    }
                }
            }
            if(b<a){
                res[b] = -1.0;
                b++;
            }
        }
        }
        return res;
        
    }
}
