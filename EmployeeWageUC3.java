package employeeWageBuilder.EmployeeWageBuilder;

public class EmployeeWageUC3 {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        double randomCheck = Math.floor(Math.random() * 10) % 3;
        int empWagePerHr = 20;
        int empFullDayHr = 8;
        int empPartTimeHr = 5;
        if (IS_FULL_TIME == randomCheck) {
            int salary = (empWagePerHr * empFullDayHr);
            System.out.println(salary);

        } else if (IS_PART_TIME == randomCheck) {
            int salary = (empWagePerHr * empPartTimeHr);
            System.out.println(salary);
        } else {
            int salary = 0;
            System.out.println(salary);
        }
    }
}
