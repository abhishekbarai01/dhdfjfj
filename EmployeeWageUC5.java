package employeeWageBuilder.EmployeeWageBuilder;

public class EmployeeWageUC5 {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        double randomcheck = Math.floor(Math.random() * 10) % 3;
        System.out.println("Random Check:" + randomcheck);
        int empWagePerHr = 20;
        int empFullDayHr = 8;
        int empPartTimeHr = 5;
        int empWagePerMonth = 20;
        if (IS_FULL_TIME == randomcheck){
            int salary = (empWagePerHr * empWagePerMonth * empFullDayHr);
            System.out.println(salary);

        }
        else if (IS_PART_TIME == randomcheck){
            int salary = (empWagePerHr * empWagePerMonth * empPartTimeHr);
            System.out.println(salary);
        }

        else{
            int salary = 0;
            System.out.println(salary);
        }
    }
}

