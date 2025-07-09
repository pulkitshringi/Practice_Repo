// 9th July 25
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        Pattern p = new Pattern();
        p.pattern17(n);
    }
}
 class Pattern{
    public void pattern17(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            char ch = 'A';
            int size = i*2-1;
            for(int j=1;j<=size;j++){
                System.out.print(ch);
                if(j<=size/2) ch++;
                else ch--;
            }
            System.out.println();
        }
    }
}
