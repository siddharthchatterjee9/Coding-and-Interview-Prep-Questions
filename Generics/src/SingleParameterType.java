class Test<T> {
    T obj;
    Test(T obj) {
        this.obj = obj;
    }
    public T getObj() {
        return this.obj;
    }
}

public class SingleParameterType {
    public static void main(String[] args) {
        // instance of Integer type
        Test<Integer> object1 = new Test<Integer>(21);
        System.out.println(object1.getObj());

        // instance of String type
        Test<String> object2 = new Test<String>("Wassup");
        System.out.println(object2.getObj());
    }
}