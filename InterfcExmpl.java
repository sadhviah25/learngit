public interface InterfcExmpl {  //an interface is created
   public static final int i =10;  //by default it is public static final so you cannot change the varibale i below
    int j=20; //same as above
   // whatever the method we write inside interface its by default public abstract

   public abstract void start(); //if you put body then you will get error

    void stop();  //even here if we dont write public abstract it still means same in interface 
    
}


class carA implements InterfcExmpl{

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("Satrt method inside cara");
        
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub

        System.out.println("stop method inside cara");
        System.out.println(i);
        
    }

}

abstract class carB implements InterfcExmpl{
    // in case abstract class there is no need to override method indide interfaceemcpl
    /*Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces */
}

class carC extends carB{

    @Override
    public void start() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        
    }
    
}