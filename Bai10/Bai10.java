package ss18.Bai10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai10 {
    private static final Map<Integer, Employee> employeeMap = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("===== Quản lý lương nhân viên =====");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Hiển thị danh sách nhân viên");
            System.out.println("3. Tính tổng lương nhân viên");
            System.out.println("4. Tính lương trung bình");
            System.out.println("5. Nhân viên có lương cao nhất");
            System.out.println("6. Nhân viên có lương thấp nhất");
            System.out.println("7. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    calculateTotalSalary();
                    break;
                case 4:
                    calculateAverageSalary();
                    break;
                case 5:
                    findHighestSalaryEmployee();
                    break;
                case 6:
                    findLowestSalaryEmployee();
                    break;
                case 7:
                    System.out.println("Chương trình kết thúc.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
                    break;
            }
        }
    }

    private static void addEmployee() {
        scanner.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        String name = scanner.nextLine();

        double salary;
        do {
            System.out.print("Nhập lương nhân viên: ");
            salary = scanner.nextDouble();
            if (salary < 0) System.out.println("Lương không hợp lệ! Nhập lại.");
        } while (salary < 0);

        Employee employee = new Employee(name, salary);
        employeeMap.put(employee.getId(), employee);
        System.out.println("Thêm nhân viên thành công!");
    }

    private static void displayEmployees() {
        if (employeeMap.isEmpty()) {
            System.out.println("Danh sách nhân viên trống!");
            return;
        }
        System.out.println("Danh sách nhân viên:");
        employeeMap.values().forEach(System.out::println);
    }

    private static void calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employeeMap.values()) {
            totalSalary += employee.getSalary();
        }
        System.out.println("Tổng lương của tất cả nhân viên: " + totalSalary);
    }


    private static void calculateAverageSalary() {
        if (employeeMap.isEmpty()) {
            System.out.println("Không có nhân viên nào để tính lương trung bình.");
            return;
        }
        double totalSalary = 0;
        int count = 0;
        for (Employee employee : employeeMap.values()) {
            totalSalary += employee.getSalary();
            count++;
        }
        double averageSalary = totalSalary / count;
        System.out.println("Lương trung bình của nhân viên: " + averageSalary);
    }


    private static void findHighestSalaryEmployee() {
        if (employeeMap.isEmpty()) {
            System.out.println("Không có nhân viên nào.");
            return;
        }

        Employee highestSalaryEmployee = null;
        double maxSalary = 0;

        for (Employee employee : employeeMap.values()) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                highestSalaryEmployee = employee;
            }
        }

        System.out.println("Nhân viên có lương cao nhất: " + highestSalaryEmployee);
    }


    private static void findLowestSalaryEmployee() {
        if (employeeMap.isEmpty()) {
            System.out.println("Không có nhân viên nào.");
            return;
        }

        Employee lowestSalaryEmployee = null;
        double minSalary = 0;

        for (Employee employee : employeeMap.values()) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                lowestSalaryEmployee = employee;
            }
        }

        System.out.println("Nhân viên có lương thấp nhất: " + lowestSalaryEmployee);
    }


}
