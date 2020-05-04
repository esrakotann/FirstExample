public class Main {

    public static void main(String[] args) {

        int number = 4;
        for (int cycle = 0; cycle < number; cycle++) {

            for (int space = number - 1; space > cycle; space--) {
                System.out.print(" ");
            }
            for (int star = 0; star < (2 * cycle + 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}