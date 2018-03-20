import java.util.Scanner;

public class UseBoolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean under100 = num < 100;
        if (under100) {
            System.out.println(num + "은 100보다 작습니다.");
        } else {
            System.out.println(num + "은 100보다 크거나 같습니다.");
        }
    }
}