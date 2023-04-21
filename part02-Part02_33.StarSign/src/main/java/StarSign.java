
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(5);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    } 

    public static void printStars(int number) {
        // first part of the exercise
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        // second part of the exercise
        int j = 0;
        while (j < size) {
            printStars(size);
            j++;
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        int k = 0;
        while (k < height) {
            printStars(width);
            k++;
        }
        
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        int l = 0;
        while (l < size) {
            printStars(l + 1);
            l++;
        }
    }
}
