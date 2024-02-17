package inheritance;

public class CommissionEmployee extends Employee {
    private int commissionRate;
    private int grossSales;

    public CommissionEmployee(String firstName, String lastName, String socialSecurity, int commissionRate, int grossSales) {
        super(firstName, lastName, socialSecurity);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    @Override
    public void printEmployeeData() {
        System.out.println(
                "First name: " + getFirstName() + "\n" +
                "Last name: " + getLastName() + "\n" +
                "SSN: " + getSocialSecurity() + "\n" +
                "Commission Rate: " + commissionRate + "%\n" +
                "Gross Salary: $" + grossSales + "\n");
    }

    public void setCommissionRate(int commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }

    public int getCommissionRate() {
        return commissionRate;
    }

    public int getGrossSales() {
        return grossSales;
    }
}
