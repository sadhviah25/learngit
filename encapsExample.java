public class encapsExample {
    public static void main(String[] args) {

        //example for implementing encapsulatn
        encpasTest obj = new encpasTest();
        obj.id=2345;

        obj.setId(2354);
        int res = obj.getId();
        System.out.println(res);  //we are hiding the implementation details

        
    }
}

class encpasTest
{
    public int id=1234;
    
    public int getId()   //setting getters in encspsulatin
    {
        return id;
    }

    public void setId(int id)  //setting setters in encspsulatin
    {
        this.id =id;
    } 

}
