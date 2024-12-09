public class SquareCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Square: " + square(number));
    }

    public static int square(int number) {
        return number * number;
    }
}





