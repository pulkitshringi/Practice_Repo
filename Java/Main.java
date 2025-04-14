import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<>();
        for(int i=0;i<5;i++){
            int n = sc.nextInt();
            l1.add(n);
        };
        for(int i = 0;i<5;i++){
            System.out.println("Your no's are : " + l1.get(i));
        }
}
}