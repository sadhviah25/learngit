public class StaticExample 
{
    public static void main(String[] args) 
    {
        scoreCard obj1 = new scoreCard();
        scoreCard obj2 = new scoreCard();
        obj1.get(30);
        obj2.get(20);
        obj1.put();
        obj2.put();

        scoreCard.put_total_Score();   //calling the static variable
    }
    
}


class scoreCard
{
    int score;      //score is instance variable 
    static int total;   //total is static variable  or global variable
    void get(int s)
    {
        score=s;
        total=total+score;
    }

    void put()
    {
        System.out.println("score is: "+score);
    }

    static void put_total_Score()
    {
        System.out.println("Total score is "+total);
    } 
}