public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        if (number < 0) return -1;

        int lastdigit = number % 10;
        int firstdigit= number;

        while (firstdigit>9){
            firstdigit/=10;
        }

        return firstdigit + lastdigit;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }
}
