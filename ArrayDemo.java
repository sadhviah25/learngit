public class ArrayDemo {
    public static void main(String[] args) 
    {
        int arr[]={10,20,30,40};
        // Data type arrayname[]=list of values [ index strt from 0 1 2..]
        //single dimensional array
        System.out.println(arr[3]);
        System.out.println("length of an array is :"+ arr.length);

        for(int i=0; i< arr.length; i++)  //arr.lengt print the length of array
        {
            System.out.println(arr[i]);
        }

        //array for string

        String bookName[]={"book1","book2","book3","book4"};
        System.out.println("length of bookName array string is :"+bookName.length);
        for(int i=0; i<(bookName.length); i++)
        {
            System.out.println(bookName[i]);
        }



        //creating array with new keywrd

        int a[]=new int[5];   //instead of defining like {2,3,4,5,6}
        System.out.println(a.length);
        for(int i=0; i<a.length; i++)
        {
            a[i]=i+5;
        }

        for(int i=0; i<a.length; i++)
        {
            System.out.println("position at "+i+" is "+a[i]);
        }
    }
}
