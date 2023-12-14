package tns;

public class prime {
	public static void main(String[] args) {
        // Loop through numbers from 2 to 20
        for (int num = 2; num <= 20; num++) {
            boolean isPrime = true;

            // Check if the number is divisible by any number from 2 to its square root
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If the number is prime, print it
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
