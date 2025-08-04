// 4th Aug 25
import java.util.*;
class Main{
    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<>();
        hset.add(23);
        hset.add(69);
        hset.add(43);
        hset.add(23);
        hset.add(69);
        System.out.println(hset);
        Iterator<Integer> it = hset.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}