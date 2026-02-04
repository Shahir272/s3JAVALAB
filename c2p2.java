
class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;
    
  
    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}


class Officer extends Employee {
    String specialization;
}

class Manager extends Employee {
    String department;
}
public class Main {
    public static void main(String[] args) {
        Officer officer = new Officer();
        officer.name = "John Smith";
        officer.age = 30;
        officer.phoneNumber = "1234567890";
        officer.address = "123 Main St";
        officer.salary = 50000;
        officer.specialization = "IT Security";
        Manager manager = new Manager();
        manager.name = "Sarah Johnson";
        manager.age = 35;
        manager.phoneNumber = "0987654321";
        manager.address = "456 Park Ave";
        manager.salary = 75000;
        manager.department = "Sales";
        System.out.println("Officer Details:");
        System.out.println("Name: " + officer.name);
        System.out.println("Age: " + officer.age);
        System.out.println("Phone: " + officer.phoneNumber);
        System.out.println("Address: " + officer.address);
        System.out.println("Specialization: " + officer.specialization);
        officer.printSalary();
        
        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        System.out.println("Department: " + manager.department);
        manager.printSalary();
    }
}