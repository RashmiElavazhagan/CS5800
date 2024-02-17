package inheritance;

public class BaseEmployee extends Employee {
    private int baseSalary;

    public BaseEmployee(String firstName, String lastName, String socialSecurity, int baseSalary) {
        super(firstName, lastName, socialSecurity);
        this.baseSalary = baseSalary;
    }

    @Override
    public void printEmployeeData() {
        System.out.println(
                "First name: " + getFirstName() + "\n" +
                        "Last name: " + getLastName() + "\n" +
                        "SSN: " + getSocialSecurity() + "\n" +
                        "Base Salary: $" + baseSalary + "\n");
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}
