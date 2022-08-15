public class arrayTwodim {
    public static void main(String[] args) 
    {
        int a[][]= new int[2][2];

        System.out.println(a.length);

        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                a[i][j]=i+j;
                // System.out.println(a[i].length);
            }
        }
        
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                System.out.println(a[i][j]);
            }
            // System.out.println();
        }

    }
}
