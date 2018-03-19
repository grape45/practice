import java.util.Scanner;

public class IntRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int add = sc.nextInt();

        int value = 2147483647;
        value = value + add;
        System.err.println("value:" +value);
    }
}
