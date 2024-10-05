import java.util.Scanner;
class HelloWorld{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age<18){
            System.out.println("Teen");
        }
        else{
            System.out.println("Adult");
        }
        
    }
}