public class MyClock {

    public static void main(String[] args) {
        MyClock obj1 = new MyClock();

        ClockDemo obj =new ClockDemo();
        obj.hours=10;
        obj.minutes=20;
        System.out.println(obj.hours);
        System.out.println(obj.minutes);

        obj.addNum(2,3);
    }
}

class ClockDemo{
    int hours;
    int minutes;

    public void addNum(int num1, int num2)
    {
        int res=num1+num2;
        System.out.println("Addition of two numbers " + res);
    }
}
