public class lj2_38_1 {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length, hottest = 0;
        int[] res = new int[n];

        for(int i=n-1; i>-1; i--){
            if(temperatures[i]>=hottest){
                hottest = temperatures[i];
                continue;
            }
            int days = 1;
            while(temperatures[i+days]<=temperatures[i]){
                days += res[i+days];
            }
            res[i] = days;
        }
        return res;
    }
}
