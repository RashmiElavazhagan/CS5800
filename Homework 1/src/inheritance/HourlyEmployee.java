package inheritance;

public class HourlyEmployee extends Employee {
    private int wage;
    private int hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurity, int wage, int hoursWorked) {
        super(firstName, lastName, socialSecurity);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void printEmployeeData() {
        System.out.println(
                "First name: " + getFirstName() + "\n" +
                "Last name: " + getLastName() + "\n" +
                "SSN: " + getSocialSecurity() + "\n" +
                "Wage: $" + wage + "\n" +
                "Hours worked: " + hoursWorked + "\n");
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getWage() {
        return wage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
}
