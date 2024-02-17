package inheritance;

public class SalariedEmployee extends Employee {
    private int weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurity, int weeklySalary) {
        super(firstName, lastName, socialSecurity);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public void printEmployeeData() {
        System.out.println(
                "First name: " + getFirstName() + "\n" +
                "Last name: " + getLastName() + "\n" +
                "SSN: " + getSocialSecurity() + "\n" +
                "Weekly Salary: $" + weeklySalary + "\n");
    }

    public void setWeeklySalary(int weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public int getWeeklySalary() {
        return weeklySalary;
    }
}
