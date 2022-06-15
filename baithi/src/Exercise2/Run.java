package Exercise2;

import java.util.Scanner;

public class Run {
    private static Scanner input = new Scanner(System.in);
    private static FlightList list;

    public static void menu(){
        System.out.println("1.Nhập chuyến bay của bạn.");
        System.out.println("2.Hiển thị những chuyến bay.");
        System.out.println("3.Thoát.");
    }

    public static void main(String[] args) {
        list = new FlightList();
        menu();

        while (true) {
            int choice;
            System.out.println("Lựa chọn của bạn: ");
            choice = input.nextInt();
            if (choice == 1){
                addFlight();
                menu();
            } else if (choice == 2) {
                showFlight();
                menu();
            } else if (choice == 3) {
                System.exit(0);
            } else {
                System.out.println("Bạn hãy nhập đúng!");
            }
        }
    }
    public static void addFlight(){
        int number = 0;
        String d ;
        System.out.println("Nhập mã chuyến bay: ");
        number = input.nextInt();
        if (number <= 0 ){
            System.out.println("Mã chuyến bay phải lớn hơn > 0");
        } else if (number >0){
            System.out.println("Nhập điểm đến: ");
            d = input.next();
            Flight f = new Flight(number,d);
            list.add(f);
        }
    }
    public static void showFlight(){
        list.showList();
    }

}