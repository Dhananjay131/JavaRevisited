
public class EmployeeTest{
  public static void main(String[] args){

    Employee e1 = new Employee();
    Employee e2 = new Employee();

    e1.setName("DJ1");
    e1.setDesn("SSE");
    e1.setSalary(100.00);
    e1.print();

    e2.setName("DJ2");
    e2.setDesn("SE");
    e2.setSalary(50.00);
    e2.print();

  }
}

class Employee{
  String name;
  double salary;
  String designation;

  public void setName(String name){
    this.name = name;
  }

  public void setSalary(Double amt){
    this.salary = amt;
  }

  public void setDesn(String designation){
    this.designation = designation;
  }
  public void print(){
    System.out.println("Name: " + this.name);
    System.out.println("Designation: " + this.designation);
    System.out.println("Salary: " + this.salary);
  }
}
