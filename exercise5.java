import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final float PI = 3.14F;
        System.out.println("Nhập bán kính hình tròn: ");
        float radius = scanner.nextFloat();
        if (radius > 0){
            float area = PI * radius * radius;
            float perimeter = 2 * PI * radius;
            System.out.println("Diện tích hinh tròn là: "+ area);
            System.out.println("Chu vi hình tròn là: " + perimeter);
        }else {
            System.out.println("Bán kinh phải là số dương");
        }
    }
}
