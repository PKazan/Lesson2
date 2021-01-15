public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(greetPerson("Paweł"));
        System.out.println(addTwoNumbers(1L, 2L));
        System.out.println(divideTwoNumbers(10,0));
    }
    public static String greetPerson(String name) {
        return "Hello " + name + "!";
    }

    public static long addTwoNumbers(long first, long second) {
        return first+second;
    }

    public static int divideTwoNumbers(int first, int second) {
        if (second == 0) {
            return -1;
        } else {
            return first / second;
        }

    }
}
