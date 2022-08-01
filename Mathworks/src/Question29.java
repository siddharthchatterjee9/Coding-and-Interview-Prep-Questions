interface Writable {
    public String write(String data);
}
abstract class Pen implements Writable {
    public void printString(String str) {
        System.out.println(str) ;
    }
}
class FountainPen implements Writable {
    public String write (String s) {
        System.out .println (" Fountain Pen" + s);
        return "MathWorks";
    }
    public static void main(String [] args) {
        new FountainPen () . write (" Blue ");
    }
}
