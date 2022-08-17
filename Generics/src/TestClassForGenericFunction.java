public class TestClassForGenericFunction {
    static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }
    public static void main (String[] args) {
        genericDisplay(1); // Integer argument
        genericDisplay("Siddharth Chatterjee"); // String argument
        genericDisplay(1.0); // Double argument
    }
}
