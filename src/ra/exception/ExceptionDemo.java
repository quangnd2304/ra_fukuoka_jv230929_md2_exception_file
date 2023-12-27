package ra.exception;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Exception xảy ra trong quá trình runtime
        //try{block statement}catch{Block}finally{Block}
        int firstNumber;
        int secondNumber;
        int div;
        try {
            System.out.println("Nhập vào số nguyên thứ nhất:");
            firstNumber = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập vào số nguyên thứ hai:");
            secondNumber = Integer.parseInt(scanner.nextLine());
            div = firstNumber / secondNumber;
            System.out.println("Thương 2 số là: " + div);
        } catch (NumberFormatException nfe) {
            System.err.println("Không đúng định dạng số");
        } catch (ArithmeticException are) {
            System.err.println("Lỗi chia cho 0");
        } catch (Exception ex) {
            System.err.println("Có lỗi xảy ra trong quá trình xử lý");
        } finally {
            System.out.println("Kết thúc chương trình");
        }
    }
}
