public class CheckretnStmt {
    public static void main(String[] args) {
        Check obj = new Check();
        obj.checkData();

        obj.printDetails(2020, 222);

        int finalverifn = obj.verificn(4554);

        System.out.println(finalverifn);
    }
}
class Check{
    int accNo;
    int custID;
    int verificncode;

    void checkData()
    {
        System.out.println("checking stmt");
    }

    void printDetails(int Loannum, int cust)
    {
        accNo=Loannum;
        custID=cust;
        System.out.println("Printing details "+accNo+" customerid "+custID);
    }

    public int verificn(int verificncod)   //if public can acces anywhere
    {
        verificncode=verificncod;
        // System.out.println("verification code id "+verificncode);
        return verificncode;
    }
}