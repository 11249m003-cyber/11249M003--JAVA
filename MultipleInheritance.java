interface Salary {
    void getSalary();
}
interface Bonus {
    void getBonus();
}
class Employee implements Salary, Bonus {
    String name;
    double salary;
    double bonus;
    Employee(String name, double salary, double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }
    public void getSalary() {
        System.out.println("Salary: " + salary);
    }
    public void getBonus() {
        System.out.println("Bonus: " + bonus);
    }
    void display() {
        System.out.println("Employee Name: " + name);
        getSalary();
        getBonus();
        System.out.println("Total Salary: " + (salary + bonus));
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Employee emp = new Employee("Arun", 30000, 5000);
        emp.display();
    }
}
