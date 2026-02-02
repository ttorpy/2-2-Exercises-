public class Text03 {
    public static void drawLegs(){
        System.out.println("     ||     ||      ");
        System.out.println("     ||     ||      ");
        System.out.println("    (||)   (||)     ");
    }

    public static void drawHead(){
        System.out.println("   /\\         /\\   ");
        System.out.println("  /  \\_______/  \\  ");
        System.out.println(" /               \\ ");
        System.out.println("(  /\\         /\\  )");
        System.out.println("====     V     ====");
        System.out.println("======(__|__)======");
        System.out.println("  (             )  ");
        System.out.println("   (___________)   ");
    }
    
    public static void main(String[] args) {
        drawHead();
        drawLegs();
        drawHead();
        drawLegs();
        drawHead();
        drawLegs();
        drawHead();
        drawLegs();
    }    
}
