import java.util.*;
class Main{
    public static void main(String[] args) {
        int[] arr = {23,43,69,55,33,23,43,69,69};
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int x: arr){
            mpp.put(x,mpp.getOrDefault(x, 0)+1);
        }
        int maxFreq = Integer.MIN_VALUE;
        int minNo = Integer.MAX_VALUE;

        for(Map.Entry<Integer,Integer> it : mpp.entrySet()){
            if(it.getValue()>maxFreq) {
                maxFreq = it.getValue();
                minNo = it.getKey();
            }
            else if(it.getValue()==maxFreq) minNo = Math.min(minNo,it.getKey());
        }
        System.out.println("Max Frequency no. is : " + minNo);
    }   
}