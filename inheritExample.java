class Employee{   //parent class it has 2 methods
    public void getDetails()
    {
        System.out.println("get details");
    }

    public void getAddress()
    {
        System.out.println("get address");
    }
}



public class inheritExample extends Employee{  //child class inherits parent class if we write extend then we are creating parent child relation ship

public void getManagerdetails()
{
    System.out.println("managr details");
}

    public static void main(String[] args) {
        Employee obj1 = new Employee();
        inheritExample obj2=new inheritExample();
        obj1.getAddress();
        obj1.getDetails();

        obj2.getManagerdetails();
        obj2.getDetails();  //since its parent class is employess
        obj2.getAddress();
    }
}
