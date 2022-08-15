public class DatatypeDemo 
{
    public static void main(String[] args) 
    {
    EmpID objn =new EmpID();   //an object is created here & objn is object reference variable
    System.out.println(objn.employeeID);
    }
}

class EmpID
{
    int employeeID;  //if variable in class level it will be initialised only when you create object of that class
    void addme()
    {
        int sum=10;    //if you want to create local variable you need to initilize

        System.out.println(sum);
    }
}
