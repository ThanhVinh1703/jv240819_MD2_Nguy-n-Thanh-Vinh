import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài của cạnh hình vuông: ");
        float a = scanner.nextFloat();

        if (a > 0){
            float area = a * a;
            float perimeter = 4 * a;
            System.out.println("Diện tích hình vuông là: "+ area);
            System.out.println("Chu vi hình vuông là: "+ perimeter);
        }else {
            System.out.println("chiều dài không hợp lệ");
        }
    }
}
