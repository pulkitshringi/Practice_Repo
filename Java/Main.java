
import java.io.*;

// other way of taking input using input stream.
class Main{
    public static void main(String[] args) throws IOException {
        InputStreamReader io = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(io);
        int no= Integer.parseInt(br.readLine());
        float no2=Float.parseFloat(br.readLine());
        char no3=br.readLine().charAt(0);
        System.out.println(no);
        System.out.println(no2);
        System.out.println(no3);
    }
}