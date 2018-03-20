import java.util.Scanner;

public class DoubleMoney {
    public static void main(String...args) {
        System.out.println("InputDollar :");
        Scanner sc = new Scanner(System.in);
        int dollar = sc.nextInt();
        double money = (dollar*1.071);
        System.out.println("Money:" + (dollar*1.071));
        System.out.println("Money:" + money);
    }
}
