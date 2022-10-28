public class Main {
    public static void main(String[] args) {
        Employee emp=new Employee(4334,"Mr. ABC",80000.89);
        emp.EmployeeDetails();
        Manager mng=new Manager(1234,"Mr. ABC Manager",50000.89,"xyz");
        mng.ShowManagerDetails();
        Salesman s1=new Salesman(4321,"Abdullah",20000.98,"Dhaka","Bags",1234);
        s1.showSalesmanDetails();
        mng.incrementSalary(s1,1000);
        s1.showSalesmanDetails();

    }
}