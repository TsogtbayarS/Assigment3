public class prob1 {
    private static prob1 instance1 = null;
    private static prob1 instance2 = null;
    private static prob1 instance3 = null;

    private prob1() {
    }

    public static prob1 getInstance1() {
        if (instance1 == null) {
            instance1 = new prob1();
        }
        return instance1;
    }

    public static prob1 getInstance2() {
        if (instance2 == null) {
            instance2 = new prob1();
        }
        return instance2;
    }

    public static prob1 getInstance3() {
        if (instance3 == null) {
            instance3 = new prob1();
        }
        return instance3;
    }


}
