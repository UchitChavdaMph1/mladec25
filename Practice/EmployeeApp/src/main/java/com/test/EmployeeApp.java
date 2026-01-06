package com.test;
 
 
import java.util.Scanner;
 
public class EmployeeApp {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDao dao = new EmployeeDaoImpl();
 
        while (true) {
        	System.out.print("\nChoose an option from below : ");
            System.out.println("\n\t 1. Add an employee\n\t 2. Update employee details\n\t 3. Delete an employee\n\t 4. View all employee data\n\t 5. Exit");
            int choice = sc.nextInt();
 
            switch (choice) {
                case 1:
                    System.out.println("Enter id, name, salary and dept of the employee(press enter after each data): ");
                    dao.addEmployee(new Employee(
                            sc.nextInt(),
                            sc.next(),
                            sc.nextDouble(),
                            sc.next()
                    ));
                    System.out.println("Employee Added");
                    break;
 
                case 2:
                    System.out.println("Enter id, name, salary and dept of the employee(press enter after each data): ");
                    dao.updateEmployee(new Employee(
                            sc.nextInt(),
                            sc.next(),
                            sc.nextDouble(),
                            sc.next()
                    ));
                    System.out.println("Employee Updated");
                    break;
 
                case 3:
                    System.out.print("Enter id: ");
                    dao.deleteEmployee(sc.nextInt());
                    System.out.println("Employee Deleted");
                    break;
 
                case 4:
                	System.out.println("Employee Details:");
                    dao.getAllEmployee().forEach(System.out::println);
                    break;
 
                case 5:
                	System.out.println("App exited, thank you.");
                    System.exit(0);
            }
        }
    }
}
 