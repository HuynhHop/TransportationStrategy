import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo đối tượng TransportationManager
        TransportationManager manager = new TransportationManager();

        // Chọn chiến lược tính toán (ví dụ: CarStrategy)
//        manager.setStrategy(new CarStrategy());
        manager.setStrategy(new BusStrategy());
        // Nhập khoảng cách và thời gian di chuyển
        System.out.print("Nhập khoảng cách (km): ");
        double distance = scanner.nextDouble();
        System.out.print("Nhập thời gian di chuyển (giờ): ");
        double duration = scanner.nextDouble();

        // Tính toán chi phí
        double cost = manager.calculateCost(distance, duration);
        System.out.println("Chi phí: $" + cost);

        scanner.close();
    }
}