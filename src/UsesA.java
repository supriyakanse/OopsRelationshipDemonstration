// Worker interface
interface Worker {
    void work();
}

// Employee class implementing the Worker interface
class Employee implements Worker {
    @Override
    public void work() {
        System.out.println("Employee is working");
    }
}

// Main class to demonstrate the program
public class UsesA{
    public static void main(String[] args) {
        Employee john = new Employee(); 

        john.work();  
    }
}
