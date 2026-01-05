Program-3: A class called Employee, which models an employee with an ID, name and salary, is 
designed. The method raiseSalary(percent) increases the salary by the given percentage. Develop 
the Employee class and suitable main method for demonstration.
*******************************************************************************/
class Employee 
{
String EmpID; 
String EmpName; 
double EmpSalary; 
Employee (String ID, String Name, double Salary)
{
EmpID = ID; 
EmpName = Name; 
EmpSalary = Salary;
} 
void dispEmp()
{
 System.out.println("\nEmployee Details:");
System.out.println("Employee ID="+ EmpID);
System.out.println("Employee Name="+ EmpName);
System.out.println("Employee Salary="+ EmpSalary);
}
void raiseSalary(float percent)
{
 EmpSalary = EmpSalary*(1+percent/100.00);
} 
}
public class EmployeeTest 
{
 public static void main(String[] args) 
{
 Employee emp1 = new Employee( "ID001", "Smith", 5000.00 );
Employee emp2 = new Employee( "ID002", "Doe", 8000.00 );
 emp1.dispEmp();
emp2.dispEmp();
emp1.raiseSalary(10);
emp2.raiseSalary(20);
emp1.dispEmp();
emp2.dispEmp();
 }
}