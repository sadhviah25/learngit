public class ConstrDemo 
{
    public static void main(String[] args) 
    {
        constructOne obj = new constructOne();
        constructOne obj1 = new constructOne(20, 30);
        constructOne obj2 = new constructOne(20, 30, 40);
        constructOne obj3 = new constructOne("sadhvi", 30);
        System.out.println("Area is "+ obj.calculateArea());

        // System.out.println("printing first val of constructor"+ obj1);
      
    }
}


//default constructor
class constructOne
{
    int width;
    int height;

    //default constructor
    constructOne()            //created constructor 
    {
        width=10;
        height=20;
    }

    //parameterised constructor
    constructOne(int a, int b)     //always the construcor name should be same as class
    {
        System.out.println("Printing first value of constructor "+a);
        System.out.println("Printing second value of constructor "+b);
    }


    constructOne(int a , int b, int c)
    {
        System.out.println("* Printing first value of constructor "+a);
        System.out.println("* Printing second value of constructor "+b);
        System.out.println("* Printing second value of constructor "+c);
    }


    constructOne(String str, int b)
    {
        System.out.println("## Printing first value of constructor "+ str);
        System.out.println("## Printing second value of constructor "+b);
    }


    public int calculateArea()
    {
        return width * height;
    }
}
