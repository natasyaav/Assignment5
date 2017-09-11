/**
 * @author Natasya Virgichalia
 * Date: 09/10/2017
 * CSC-201
 * Professor Tanes Kanchanawanchai
 * Assignment 5.13
 * This program finds the largest integer n such that n^3 (n to the power of 3) is less than 12,000.
 */
public class largestN {
    public static void main(String[]args) {
        int n = 0;
        //calls largestNum method
        n = largestNum(n);
        System.out.print(n + " is the largest integer n such that n^3 is less than 12,000");
    }
    /**
     * This method finds the largest n such that n^3 < 12,000
     * @param n an integer
     * @return n
     */
    public static int largestNum (int n) {
        while (Math.pow(n +1,3) < 12000) {
            n++;
        }
        return n;
    }

}
