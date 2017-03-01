package bitwise.operators.tasks;

public class DecimalToBinary {

    public static void main(String[] args) {

        System.out.println(decimalToBinary(7));
    }

    private static String decimalToBinary(int decimal) {
        String result = "";

        while(decimal > 0) {
            result += decimal % 2;
            decimal /= 2;
        }

        return new StringBuilder(result).reverse().toString();
    }
}
