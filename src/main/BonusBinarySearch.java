package main;

public class BonusBinarySearch {

    /**
     * A binary search implementation for integer arrays.
     *
     * Info about binary search: https://www.geeksforgeeks.org/binary-search/
     *
     * @param sortedNumbers - must be sorted from least to greatest
     * @param n - number to search for
     * @return index of search item if it's found, -1 if not found
     */
    public static int binarySearch(int[] sortedNumbers, int n) {
        int min = 0;
        int max = sortedNumbers.length - 1;

        int guess = (min + max) / 2;

        while (min <= max) {
            if (sortedNumbers[guess] == n) {
                return guess;
            } else if (sortedNumbers[guess] < n) {
                min = ++guess;
            } else {
                max = --guess;
            }
        }
        return -1;
    }
}