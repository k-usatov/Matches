import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        double length = 0, width = 0;
        length = Math.floor(Math.sqrt(n));
        width = Math.ceil(n/length);
        k = (int) (2 * n + length + width);
        System.out.print(k);
    }
}
