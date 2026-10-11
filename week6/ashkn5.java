public class ashkn5 {
    public static void main(String args[]) {
        System.out.println("------------------------");
        System.out.println("Prime numbers between the range 0-100 are:");
        for (int i=2; i<=100; i++) {
            boolean isPrime = true;
            for (int j=2; j<=Math.sqrt(i); j++) {
                if(i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(i);
        }
    }
}
