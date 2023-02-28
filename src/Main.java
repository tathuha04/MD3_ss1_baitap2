import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        System.out.println("Nhập số tiền USD :");
        int USD = scanner.nextInt();
        int result = rate * USD;
        System.out.println(USD + " USD" +" = "+ result + " VNĐ: " );
    }
}