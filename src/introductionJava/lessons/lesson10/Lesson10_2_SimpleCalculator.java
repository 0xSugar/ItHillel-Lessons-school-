package introductionJava.lessons.lesson10;

/*
    Мой мак быо разрушен полностью, пришлось купить БУ за 600$ и переставить жесткий диск
    На эти дни выпал из программирования чуть чуть)
 */
public class Lesson10_2_SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public Lesson10_2_SimpleCalculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public double getAdditionalResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return secondNumber - firstNumber;
    }

    public double getMultiplicationResult() {
        return secondNumber * firstNumber;
    }

    public double getDivisionResult() {
        return firstNumber / secondNumber;
    }
}
