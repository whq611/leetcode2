public class l215_2 {
    int[] nums;
    int k;
    public int findKthLargest(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
        int n = nums.length;
        quick_sort(0,n-1);
        return nums[n-k];
    }
    public void quick_sort(int l, int r){
        if(r>l){
            int m = partition(l,r);
            if(m==nums.length-k) return;
            quick_sort(l,m-1);
            quick_sort(m+1,r);
        }
    }
    public int partition(int l, int r){
        int pivot = nums[r];
        int i = l;
        for(int j = l; j<r; j++){
            if(nums[j]<=pivot){
                swap(i,j);
                i++;
            }
        }
        swap(i,r);
        return i;
    }
    public void swap(int l, int r){
        int tmp = nums[l];
        nums[l] = nums[r];
        nums[r] = tmp;
    }
}
