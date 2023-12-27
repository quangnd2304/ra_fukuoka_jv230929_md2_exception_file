package ra.exception;

import java.util.Scanner;

public class Throw_Throws_Exception {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất:");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số thứ hai:");
        int number2 = Integer.parseInt(scanner.nextLine());
        int result = divide(number1, number2);
        System.out.println("Thương 2 số là: " + result);
    }

    public static int divide(int firstNumber, int secondNumber) throws ArithmeticException,NumberFormatException,Exception {
        if (secondNumber==0){
            throw new ArithmeticException("Không thể chia cho 0");
        }
        int result = firstNumber / secondNumber;
        return result;
    }
}
