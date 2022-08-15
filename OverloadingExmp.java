 class Emplo{   //parent class it has 2 methods  (final class Emplo=> if you give final in start then it will not allow you to extend )
    public void getDetails()
    {
        System.out.println("get details");
    }

    public void getAddress()
    {
        System.out.println("get address");
    }

    

    /* 
    Method overloading is nothing but having same method names but different arguments is known 
    as overloading
    Return type is same
    
    
    */
     public void getAllDetails(String name, int id) 
    {
        
    }

    public void getAllDetails(String S)
    {

    }

    public void getAllDetails(int a,float f)
    {

    }


    //method overriding

    //method return type is same method name is same method arguments is also same is 
    //call overriding


    public void sellData(String s)  // even if you use final then you cannot use metod overriding you 
    {
        System.out.println("selldata");
    }
}




public class OverloadingExmp extends Emplo{
    
        public void getManagerdetails()
        {
            System.out.println("managr details");
        }

        public void sellData(String f)
        {
            System.out.println("sellMGRdata");
        }

    public static void main(String[] args) {
        Emplo obj1 = new Emplo();
        OverloadingExmp obj2=new OverloadingExmp();
        // obj1.getAddress();
        // obj1.getDetails();

        // obj2.getManagerdetails();
        // obj2.getDetails();  //since its parent class is employess
        // obj2.getAddress();


        obj1.sellData("ABC");
        obj2.sellData("MGR");


        Emplo obj3 = new OverloadingExmp();  //creating object of Overloading so exmple for run time polysomis
        obj3.sellData("asd");
    }
    
}
