import java.util.ArrayList;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(69);
        arr.add(42);
        arr.add(123);
        arr.add(7979);
        System.out.println(arr);
        arr.set(2,321);
        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr);
        arr.add(1,6969);
        System.out.println(arr);  
    }
}