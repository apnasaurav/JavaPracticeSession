public class PrimeNumber {//Findim=ng Element along the Diagonals.
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int maxPrime = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    if (isPrime(arr[i][j]) && arr[i][j] > maxPrime) {
                        maxPrime = arr[i][j];
                    }
                }
            }
        }
        System.out.println("Largest prime number among all diagonal elements: " + maxPrime);
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
