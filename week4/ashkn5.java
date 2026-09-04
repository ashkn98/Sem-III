
public class ashkn5 {

    
    public static void main(String args[]) {
        int x1 = 4;
        int y1 = 2;
        int x2 = 6;
        int y2 = 5;
        double dist = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("The distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2+ ") is " + dist);
    }
}
