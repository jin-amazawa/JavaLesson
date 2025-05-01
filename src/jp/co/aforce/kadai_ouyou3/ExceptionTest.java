package jp.co.aforce.kadai_ouyou3;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("計算結果: " + result);
        } catch (ArithmeticException e) {
            System.out.println("0で割ることはできません");
        }
    }
}
