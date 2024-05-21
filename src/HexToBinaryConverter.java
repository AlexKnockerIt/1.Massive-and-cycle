import java.util.Scanner;

public class HexToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите шестнадцатеричное число: ");
        String hexNumber = scanner.nextLine().toUpperCase();

        String binaryNumber = hexToBinary(hexNumber);
        System.out.println("Двоичное представление: " + binaryNumber);
    }

    public static String hexToBinary(String hexNumber) {
        StringBuilder binaryNumber = new StringBuilder();
        for (int i = 0; i < hexNumber.length(); i++) {
            char hexDigit = hexNumber.charAt(i);
            int decimalValue = Character.digit(hexDigit, 16);
            String binaryDigit = Integer.toBinaryString(decimalValue);
            binaryNumber.append(String.format("%4s", binaryDigit).replace(' ', '0'));
        }
        return binaryNumber.toString();
    }
}
