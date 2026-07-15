package JavaTraining;

class Employee {  //polymorphism overriding

    void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {

    @Override
    void work() {
        System.out.println("Manager is managing the team");
    }
}

public class OverridingDemo {

    public static void main(String[] args) {

        Manager m = new Manager();

        m.work();
    }
}