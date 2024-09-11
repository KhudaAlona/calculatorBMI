public class Main {
    public static void main(String[] args) {
        BodyMassIndexCalculator calculator = new BodyMassIndexCalculator(10, 1.52, "female", 25);
        System.out.println(calculator.getResult());
    }
}
