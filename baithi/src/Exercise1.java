import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args)
    {
        double balance, rate, interset, time;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so tien vay: ");
        balance = scan.nextDouble();
        System.out.print("Nhap lai xuat hang nam : ");
        rate = scan.nextDouble();
        System.out.print("Nhap thoi gian theo gio: ");
        time = scan.nextDouble();
        scan.close();
        interset = balance*(rate/time);
        System.out.print("Số tiền lãi là: " +interset);
    }
}
