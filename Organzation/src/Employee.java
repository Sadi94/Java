public class Employee {
    protected int employeeID;
    protected String employeeName;
    protected double salary;

    public Employee()
    {

    }

    public Employee(int employeeID,String employeeName,double salary )
    {
        this.employeeID=employeeID;
        this.employeeName=employeeName;
        this.salary=salary;
    }

    public void EmployeeDetails()
    {
        System.out.println("Employee Id is : "+employeeID);
        System.out.println("Employee Name is : "+employeeName);
        System.out.println("Employee Salary is : "+salary);
    }
}
