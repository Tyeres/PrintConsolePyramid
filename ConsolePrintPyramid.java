public class ConsolePrintPyramid {
    static final int SIZE = 11;

    public static void main(String[] args) {
        /* pyramidSideLength refers to the number of stars (*) to the left and the right
        of the center of a layer, or the center star. */
        for (int pyramidSideLength = 0; pyramidSideLength < SIZE; pyramidSideLength++) {
            // Print the initial spaces to keep the layers centered
            printSpaces(pyramidSideLength);
            // The following three statements print a layer of the pyramid.
            // Print the left side            // Print the center star   // Print the right side
            printSide(pyramidSideLength);     System.out.print("*");     printSide(pyramidSideLength);
            System.out.println();
        }
    }
    static void printSpaces(int pyramidSideLength) {
        /* As more stars are being printed per layer, fewer spaces will be needed.
        The number of spaces is found by the difference of variable SIZE and the
        number of stars printed on a side from the center star (AKA, pyramidSideLength). */
        for (int i = 0; i < SIZE - pyramidSideLength; i++) {
            System.out.print(" ");
        }
    }
    static void printSide(int pyramidSideLength) {
        for (int i = 0; i < pyramidSideLength; i++) {
            System.out.print("*");
        }
    }
}