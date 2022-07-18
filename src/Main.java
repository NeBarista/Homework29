public class Main {
    public static void main(String[] args) {
        rectangle(7, 7, 7, 7);
        rectangle(8, 9, 4, 3);
        rectangle(2, 5, 2, 5);
    }
    private static void rectangle(int AB, int BC, int CD, int DA) {
        if(AB == BC && BC == CD && CD == DA) {
            System.out.println("square");
        }
        else if(AB == CD && BC == DA) {
            System.out.println("rectangle");
        }
        else{
            System.out.println("quadrilateral");
        }
    }
}