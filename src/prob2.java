public class prob2 {

    private int instanceField1=3;
    private String instanceField2="Unicorn";
    private static int staticField = 7;
    public void instanceMethod1() {
        System.out.println("instanceMethod1");
        System.out.println(instanceField1);
    }

    public void instanceMethod2() {
        System.out.println("instanceMethod2");
        System.out.println(instanceField2);
    }
    public static void staticMethod1() {
        System.out.println("staticMethod1");
        System.out.println("Static Priority 3");
    }

    public static void staticMethod2() {
        System.out.println("staticMethod2");
        System.out.println("Static Priority 4");
    }
    {
        System.out.println("Instance init block 1");
    }
    {
        System.out.println("Instance init block 2");
    }
    static {
        System.out.println("Static init block 1");
        System.out.println("Static Priority 1");
    }
    static {
        System.out.println("Static init block 2");
        System.out.println("Static Priority 2");
    }
    prob2(){
        System.out.println("Constructor 1 no parameter");
    }
    prob2(String x){
        System.out.println("Constructor 2 with parameter ");
        System.out.println(x+" "+instanceField2);
    }

    public static void main(String[] args) {
        prob2 pb1 = new prob2();
        pb1.instanceMethod1();
        pb1.instanceMethod2();

        prob2 pb2 = new prob2("I am");
        pb2.instanceMethod1();
        pb2.instanceMethod2();

    }
}
