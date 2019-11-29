public class Exercise_10_4 {
    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint();
        MyPoint myPoint2 = new MyPoint(10, 30.5);
        System.out.println(myPoint1.distance(myPoint2));
    }
}

class MyPoint{
    private double x;
    private double y;

    public MyPoint(){
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint myPoint){
        return Math.sqrt(Math.pow(myPoint.getX() - x, 2) +
                Math.pow(myPoint.getY() - y, 2));
    }

    public double distance(double x, double y){
        return Math.sqrt(Math.pow(x - this.x, 2) +
                Math.pow(x - this.y, 2));
    }

    public static double distance(MyPoint myPoint1, MyPoint myPoint2){
        return Math.sqrt(Math.pow(myPoint2.getX() - myPoint1.getX(), 2) +
                Math.pow(myPoint2.getY() - myPoint1.getX(), 2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}