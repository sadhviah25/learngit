public class controlsStructureDemo {
    public static void main(String[] args) {
        int a = 9;
        int b = 2;   // = is assignmnt operator
        int result = 0;
        result = a % b;
        System.out.println(result);

        int x=10+10;
        int y=20;
        int z=0;

        z=+x;    //same as z=z+x or z += x

        System.out.println(z);

        /* if else statement */
        if(x==y)
        {
            System.out.println("X is lesser then y");
        }
        else
        {
            System.out.println("X is greater then y");
        }


        /* Switch statement  */

        int var1=10;
        switch(var1)
        {
            case 1:
                System.out.println("case one is executed");
                break;

            case 2:
                System.out.println("case two is executed");
                break;

            case 3:
                System.out.println("case three is executed");
                break;

            case 4:
                System.out.println("case 4 is executed");
                break;

            default:
                System.out.println("defaultcase is executed");
                // break;
        }



        /* While loop */

        int num1=30;
        int num2=20;

        while(num1<num2)
        {
            System.out.println("inside of while loop "+num2);
            num2++;     //increment operator
        }

        /* Do while loop*/
        /* in do while loop it first displys the thing in do brackets and then it goto the while stmt */
        do{
            System.out.println("inside of do while loop "+num2);
        }while(num1<num2);






        // continue statement


        // for loop


        for(int i=0; i<10; i++)  //initialling variable then condition then incrementing
        {
            if(i % 2 == 0)
            continue;
                System.out.println(i+" printing odd numbers");
            
        }

        //simpe for loop

        System.out.println("simple for loop example");
        for(int j=0; j<5; j++)
        {
            System.out.println(j);
        }




    }
}
