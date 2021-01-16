class StaticFieldTest {
    static int i = 0;
}

public class exercise8 {
    public static void main(String[] args) {
        StaticFieldTest sft = new StaticFieldTest();
        StaticFieldTest sft2 = new StaticFieldTest();
        StaticFieldTest sft3 = new StaticFieldTest();
        StaticFieldTest sft4 = new StaticFieldTest();

        System.out.println("Values before modification:");
        System.out.println(sft.i);
        System.out.println(sft2.i);
        System.out.println(sft3.i);
        System.out.println(sft4.i);

        StaticFieldTest.i++;

        System.out.println("Values after modification:");
        System.out.println(sft.i);
        System.out.println(sft2.i);
        System.out.println(sft3.i);
        System.out.println(sft4.i);
    }
}
