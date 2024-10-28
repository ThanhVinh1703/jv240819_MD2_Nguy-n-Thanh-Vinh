import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Điểm môn toán của bạn là: ");
        float math = scanner.nextFloat();
        System.out.println("Điểm môn văn của bạn là: ");
        float literature = scanner.nextFloat();
        System.out.println("Điểm môn anh văn của bạn là: ");
        float english = scanner.nextFloat();
        if ( math > 0 && literature > 0 && english > 0){
            float avgMark = ( math + literature + english) / 3;
            System.out.print("Điểm trung bình 3 môn của bạn là:" + avgMark );
        }else {
            System.out.println("Điểm phải là số dương");
        }
    }
}
