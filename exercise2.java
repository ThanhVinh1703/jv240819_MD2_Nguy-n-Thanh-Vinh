import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int DOLLAR = 25000;
        System.out.println("Nhập số tiền Dollar mà bạn muốn đổi sang VND: ");
        int VND = scanner.nextInt();
        if (VND > 0 ){
            float moneyVND = DOLLAR * VND;
            System.out.println("Tiền Việt Nam sau khi quy đổi là: " + moneyVND);
        }else {
            System.out.println("Số tiền ko hợp lệ");
        }
    }
}
