public class Salesman extends Employee{
    private String salesArea,ProductName;
    private int managerID;

    public Salesman(int employeeID,String employeeName,double salary,String salesArea, String ProductName,int managerID)
    {
        this.employeeID=employeeID;
        this.employeeName=employeeName;
        this.salary=salary;
        this.salesArea=salesArea;
        this.ProductName=ProductName;
        this.managerID=managerID;
    }
    public void showSalesmanDetails()
    {
        System.out.println("Salesman Name is: "+employeeName);
        System.out.println("Salesman Id is: "+employeeID);
        System.out.println("Salesman Salary is: "+salary);
        System.out.println("Sales Area is : "+salesArea);
        System.out.println("Product Name is : "+ProductName);

    }
}
