
package Student;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class assignment10 {
        String id;
        String fullName;
        float GPA;
        String major;
        Date dateofBirth;
    assignment10(String id, String fullName, float GPA, String major, Date dateofBirth){
        this.id = id;
        this.fullName = fullName;
        this.GPA = GPA;
        this.major = major;
        this.dateofBirth = dateofBirth;
    }
    assignment10(){
    }
    void enterStudentInfo(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Nhap ID: ");
        this.id = keyboard.nextLine();
        System.out.println("Nhap ten: ");
        this.fullName = keyboard.nextLine();
        System.out.println("Nhap GPA: ");
        this.GPA = keyboard.nextFloat();
        keyboard.nextLine();
        System.out.println("Nhap nganh hoc: ");
        this.major = keyboard.nextLine();
        System.out.println("Nhap ngay thang nam sinh: ");
        String dateString = keyboard.nextLine();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dateofBirth = formatter.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Định dạng ngày không hợp lệ!");
        }
    }
    void display(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(dateofBirth);
        System.out.println("ID la: " + id);
        System.out.println("Ten la: " + fullName);
        System.out.println("GPA la: " + GPA);
        System.out.println("Nganh hoc la: " + major);
        System.out.println("Ngay thang nam sinh la: " + formattedDate);
    }
    public static void main(String[] args) {
        assignment10 s = new assignment10();
        s.enterStudentInfo();
        s.display();
    }
}
