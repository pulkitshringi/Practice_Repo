// 15th July 25
import java.util.ArrayList;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch ='g';
        System.out.println(ch);
       ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(25);
        arr.add(36);
        arr.add(46);
        arr.remove(1);
        System.out.println(arr);
    }
}