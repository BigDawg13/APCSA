public class Start {
    public static void main(String[] args) {
        try {
            IntVector test = new IntVector(); // Throw Illegal

            System.out.println("Size: " + test.size()); // Size: 0

            for(int i = 0; i < 20; i++) {
                test.add(1);
            }

            // set first vaue to 50, shifts everything right
            test.add(7, 50); // [50, 0, 1, 2, ... 19]
            test.add(9, 50);
            System.out.println(test); // [0...19]
            test.remove(50);
            System.out.println(test);

            // remove thre first zero value found at index 1
            //test.remove(0); // [50, 1, 2, ... 19]

        } catch(IllegalArgumentException ex) {
            System.out.println("That's illegal");
        } catch(ArithmeticException ex) {
            System.out.println("Bad math");
        } catch(Exception ex) { // catch everything, last effort
            System.out.println("Generic exceptionm");
        }
    }
}