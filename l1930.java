public class l1930 {
    public int countPalindromicSubsequence(String s) {
        int num=0;    
        for(int i=0;i<26;i++){
            int[] arr=new int[26];
            char index=(char)(i+97);
            int left=s.indexOf(index);
            int right=s.lastIndexOf(index);
            for(int j=left+1;j<right;j++){
                arr[s.charAt(j)-97]++;
            }
            for(int j=0;j<26;j++){
                if(arr[j]!=0){
                    num++;
                }
            }
        }
        return num;

    }
}
