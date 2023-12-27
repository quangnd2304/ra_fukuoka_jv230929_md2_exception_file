package ra.exception;

import java.util.Scanner;

public class Exception_UD {
    public static void main(String[] args) {
        /*
         * Nhập vào điểm sinh viên có kiểu dữ liệu là số thực, giá trị từ 0-10
         * Nhập vào tuổi sinh viên có kiểu dữ liệu là số nguyên, giá trị >=18
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào điểm sinh viên:");
        float mark;
        do {
            try {
                mark = Float.parseFloat(scanner.nextLine());
                if (mark >= 0 && mark <= 10) {
                    break;
                } else {
                    System.err.println("Điểm có giá trị trong khoảng 0-10, vui lòng nhập lại");
                }
            } catch (NumberFormatException | ArithmeticException ex) {
                System.err.println("Điểm có định dạng là số thực, vui lòng nhập lại");
            }
        } while (true);
        System.out.println("Điểm vừa nhập là: " + mark);
    }
}
