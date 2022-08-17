class Test3<T> {
    T obj;
    Test3(T obj) {
        this.obj = obj;
    }
    public T getObject() {
        return obj;
    }
}

public class TestClassToShowTypeSafety {
    public static void main (String[] args) {
        // instance of Integer type
        Test3<Integer> object4 = new Test3<Integer>(45);
        System.out.println(object4.getObject());

        // instance of String type
        Test3<String> object5 = new Test3<String>("VIT");
        System.out.println(object5.getObject());
        // object4 = object5; // this results in an "incompatible types" error

    }
}
