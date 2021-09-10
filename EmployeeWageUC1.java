package employeeWageBuilder;

public class EmployeeWageUC1 {
    public static void main(String[] args) {

        int IS_FULL_TIME = 1;  // Constants

        double empCheck = Math.floor(Math.random() * 10) % 2;  // generate random number 0 and 1

        System.out.println(empCheck); // print random number

        if (empCheck == IS_FULL_TIME)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
    }
}
