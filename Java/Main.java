// Sum of Highest and Lowest Frequency 
class Solution {
    public int sumHighestAndLowestFrequency(int[] nums) {
      Map<Integer,Integer> mpp = new HashMap<>();
      for(int k: nums){
        mpp.put(k,mpp.getOrDefault(k,0)+1);
      }
      int maxFreq = 0;
      int minFre = Integer.MAX_VALUE;
      for(Map.Entry<Integer,Integer> it: mpp.entrySet()){
        minFre = Math.min(minFre,it.getValue());
        maxFreq = Math.max(maxFreq,it.getValue());
      }
      return minFre+maxFreq;
    }
}
