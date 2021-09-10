package employeeWageBuilder;

public class EmployeeWageUC2 {

    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        double randomCheck = Math.floor(Math.random() * 10) % 2;
        if (IS_FULL_TIME == randomCheck){
            int empWagePerHr = 20;
            int empFullDayHr = 8;
            int salary = (empWagePerHr * empFullDayHr);
            System.out.println(salary);

        }
        else{
            int salary = 0;
            System.out.println(salary);
        }

    }
}
