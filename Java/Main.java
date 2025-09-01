class Solution {    
    public String largeOddNum(String s) {
        //your code goes here
        int j = 0;
        while(s.charAt(j)=='0' && j<s.length()){
            j++;
        }

        for(int i=s.length();i>j;i--){
            if(Integer.parseInt(s.substring(j,i))%2==1) return s.substring(j,i);
        }
        return "0";
    }
}

class Main{
    public static void main(String[] args){
    //    Solution s1 = new Solution();
    //    System.out.println(s1.largeOddNum("00005"));
    }
}