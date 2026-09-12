class employee{
        private String name ;
        private int employeeID;
        private String designation;
        private String department;  
        private static final int MIN_EMPLOYEE_ID = 1000000;

      public employee(){
    this.name =null;
        this.employeeID=MIN_EMPLOYEE_ID;
        this.designation=null;
        this.department=null;  
          
    }
     /*employee(String name, int employeeID, String designation, String department){
        this.name = name;
        this.employeeID = employeeID;
        this.designation = designation;
        this.department = department;
    } */
   public employee(String name){
    this.name = name;
   }
   public employee(String name , int employeeID){
    this.name = name;
    this.employeeID = employeeID;
   }    

   public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public int getemployeeID(){
        return employeeID;
    }
    public void setemployeeID(int employeeID){
        this.employeeID = employeeID;

    }
    public String getdesi(){
        return designation;

    }
    public void setdesi(String designation){
        this.designation = designation;

    }
    public String getdep(){
        return department;

    }
    public void setdep(String department){
        this.department = department;

    }
}
public void display(){
System.out.println(name);
System.out.println(employeeID);
System.out.println(designation);
System.out.println(department);

}


    public class Employee{
    public static void main(String[] args){
        employee obj = new employee();
       obj.setname("sherlin");
       obj.setemployeeID(711557);
       obj.setdesi("Employer");
       obj.setdep("CSE");

       System.out.println(obj.getname());
obj.display();

    }
}