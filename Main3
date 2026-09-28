class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double highSalary(Employee e) {
        if (this.salary > e.salary) {
            return this.salary;
        } else {
            return e.salary;
        }
    }
}

public class Main2 {
    public static void main(String[] args) {

        Employee e1 = new Employee("Yemen", 10);
        Employee e2 = new Employee("penaldo", 7);

        System.out.println("Higher salary between both of them are : " + e1.highSalary(e2));
    }
}
