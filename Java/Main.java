// Highest Occurring Element in an Array
import java.util.*;
class Main{
  public static void main(String[] args) {
            Solution s1 = new Solution();
            int[] nums = {12,33,44,56,43,33,55,55,55};
            System.out.println(s1.mostFrequentElement(nums));
  }}

class Solution {
    public int mostFrequentElement(int[] nums) {
     Map<Integer,Integer> mpp = new HashMap<>();
     for(int x:nums){
        mpp.put(x,mpp.getOrDefault(x,0)+1);
     }
     int maxFreq = 0;
     int minEle = Integer.MAX_VALUE;
     for(Map.Entry<Integer,Integer> it:mpp.entrySet()){
        if(it.getValue()>maxFreq){
            maxFreq = it.getValue();
            minEle= it.getKey();
        }
        else if(it.getValue()==maxFreq){
            minEle = Math.min(it.getKey(),minEle);
        }
     }
     return minEle;
    }
}

