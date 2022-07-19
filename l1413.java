public class l1413 {
    public int minStartValue(int[] nums) {
        int res = 0, tot = 0;
        for(int num: nums){
            tot+=num;
            res = Math.min(res,tot);
        }
        return -res+1;
    }
}
