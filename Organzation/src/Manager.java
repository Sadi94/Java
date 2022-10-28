public class Manager extends Employee {
    private String TerritoryName;
    public Manager(int employeeID,String employeeName,double salary,String TerritoryName)
    {
        this.employeeID=employeeID;
        this.employeeName=employeeName;
        this.salary=salary;
        this.TerritoryName=TerritoryName;
    }
    public void ShowManagerDetails()
    {
        System.out.println("Manager Name is : "+employeeName);
        System.out.println("Manager Id is : "+employeeID);
        System.out.println("Manager Salary is : "+salary);
        System.out.println("Territory Name is : "+TerritoryName);
    }

    public void incrementSalary(Salesman s,int amount)
    {
        s.salary=s.salary+amount;
    }
}
