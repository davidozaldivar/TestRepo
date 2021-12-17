public class MainClass {

    public static void main(String[] args) {
        System.out.println("Hi! This is main");

        TestTwo();

        PrintNum();

    }

    public static void TestTwo() {
        System.out.println("TestTwo!");
    }

    public static void PrintNum() {

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ");
        }

    }
}
