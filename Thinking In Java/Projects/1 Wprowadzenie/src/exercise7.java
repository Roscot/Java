class StaticTest {
    static int i = 47;
}

class StaticFun {
    static void incr() {
        StaticTest.i++;
    }
}

public class exercise7 {
    public static void main(String[] args) {
        StaticFun sf = new StaticFun();
        System.out.println(StaticTest.i);
        sf.incr();
        System.out.println(StaticTest.i);
        StaticFun.incr();
        System.out.println(StaticTest.i);
    }
}
