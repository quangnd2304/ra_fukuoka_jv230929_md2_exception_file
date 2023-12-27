package ra.file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileDemo {
    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<>();
        Student student1 = new Student("SV001", "Nguyễn Văn A", 20);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 25);
        Student student3 = new Student("SV003", "Nguyễn Văn C", 22);
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        writeDataToFile(listStudent);
        //Đọc dữ liệu từ file
        List<Student> listRead = readDataFromFile();
        listRead.forEach(student -> System.out.println(student.toString()));

    }

    //Xây dựng phương thức ghi dữ liệu danh sách sinh viên ra file demo.txt
    public static void writeDataToFile(List<Student> listStudent) {
        //1. Khởi tạo đối tượng file
        File file = new File("demo.txt");
        //2. Khởi tạo đối tượng FileOutputStream từ file
        try {
            FileOutputStream fos = new FileOutputStream(file);
            //3. Khởi tạo đối tượng ObjectOutputStream để ghi dữ liệu ra file kiểu object
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //4. Sử dụng phương thức writeObject() để ghi dữ liệu ra file
            oos.writeObject(listStudent);
            //5. Đẩy dữ liệu từ stream xuống file
            oos.flush();
            //6. Đóng stream
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Xây dựng phương thức đọc dữ liệu từ file demo.txt
    public static List<Student> readDataFromFile() {
        List<Student> listStudentRead = null;
        //1. Khởi tạo đôi tượng file
        File file = new File("demo.txt");
        //2. Khởi tạo đối tượng FileInputStream
        try {
            FileInputStream fis = new FileInputStream(file);
            //3. Khởi tạo đối tượng ObjectInputStream để đọc dữ liệu theo object
            ObjectInputStream ois = new ObjectInputStream(fis);
            //4. Đọc dữ liệu file demo.txt và lưu vào 1 biến
            listStudentRead = (List<Student>) ois.readObject();
            //5. Đóng stream
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listStudentRead;
    }
}
