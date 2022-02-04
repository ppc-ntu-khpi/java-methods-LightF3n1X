public class TestResult {

    public static void main(String[] args) {
        int decimal = 123456;
        String[] converted = Exercise.Calculate(decimal);
        System.out.println(String.valueOf(decimal) + " in binary = " + converted[0]);
        System.out.println(String.valueOf(decimal) + " in octal = " + converted[1]);
        System.out.println(String.valueOf(decimal) + " in hex = " + converted[2]);
    }
}
