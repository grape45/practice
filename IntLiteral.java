public class IntLiteral {
    public static void main(String[] args) {
        int literal1 = 10000;
        int literal2 = 1_0_0_0_0;
        int literal3 = 10__000;
        int literal4 = 10_______________000;
        System.out.println("literal1:" + literal1);
        System.out.println("literal2:" + literal2);
        System.out.println("literal3:" + literal3);
        System.out.println("literal4:" + literal4);
    }
}
