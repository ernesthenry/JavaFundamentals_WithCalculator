package Basics;

/**
 * BUBBLE SORT ALGORITHM
 * A simple sorting algorithm that repeatedly steps through the list,
 * compares adjacent elements and swaps them if they're in wrong order
 * From lecture notes - sorting arrays
 */
public class BubbleSort {

    /**
     * Bubble Sort Method
     * Time Complexity: O(n²) - not efficient for large arrays
     * Space Complexity: O(1) - sorts in place
     * 
     * HOW IT WORKS:
     * 1. Compare adjacent elements
     * 2. Swap if they're in wrong order (left > right)
     * 3. After each pass, the largest element "bubbles up" to the end
     * 4. Repeat until array is sorted
     */
    static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop: controls number of passes
        // We need (n-1) passes to sort n elements
        for (int i = 0; i < n - 1; i++) {

            // Inner loop: compares adjacent elements
            // After each pass, last i elements are already sorted
            // So we check up to (n-i-1)
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap if left element is greater than right
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Optimized Bubble Sort
     * Stops early if array becomes sorted before all passes complete
     */
    static void bubbleSortOptimized(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;  // Track if any swaps occurred

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps occurred, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * Helper method to print array
     */
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * Main method - demonstrates bubble sort
     */
    public static void main(String[] args) {
        System.out.println("=== BUBBLE SORT DEMONSTRATION ===\n");

        // Example from lecture notes
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        printArray(arr);

        // Perform bubble sort
        bubbleSort(arr);

        System.out.println("\nSorted array:");
        printArray(arr);

        System.out.println("\n--- Step-by-Step Example ---");
        // Show how bubble sort works step by step
        int[] arr2 = {5, 2, 8, 1, 9};
        System.out.println("Original: ");
        printArray(arr2);

        // Manual demonstration of first pass
        System.out.println("\nPass 1:");
        System.out.println("Compare 5 and 2: Swap → 2, 5, 8, 1, 9");
        System.out.println("Compare 5 and 8: No swap → 2, 5, 8, 1, 9");
        System.out.println("Compare 8 and 1: Swap → 2, 5, 1, 8, 9");
        System.out.println("Compare 8 and 9: No swap → 2, 5, 1, 8, 9");
        System.out.println("Largest element (9) is now at the end!");

        // Test with optimized version
        System.out.println("\n--- Testing Optimized Version ---");
        int[] arr3 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        printArray(arr3);

        bubbleSortOptimized(arr3);
        
        System.out.println("Sorted array (optimized):");
        printArray(arr3);
        
        // Test with already sorted array
        System.out.println("\n--- Already Sorted Array ---");
        int[] sortedArr = {1, 2, 3, 4, 5};
        System.out.println("Original (already sorted):");
        printArray(sortedArr);
        
        bubbleSortOptimized(sortedArr);
        System.out.println("After bubble sort:");
        printArray(sortedArr);
        System.out.println("(Optimized version detected it was sorted and stopped early!)");
    }
}

/*
 * BUBBLE SORT ANALYSIS:
 * ----------------------
 * ADVANTAGES:
 * - Simple to understand and implement
 * - No extra memory needed (in-place sorting)
 * - Stable sort (maintains relative order of equal elements)
 * 
 * DISADVANTAGES:
 * - Very slow for large arrays
 * - Time complexity: O(n²)
 * - Not suitable for production use with large datasets
 * 
 * WHEN TO USE:
 * - Small arrays (less than 10 elements)
 * - Educational purposes
 * - When array is nearly sorted
 * 
 * EXAM TIPS:
 * ----------
 * 1. Remember the nested loop structure
 * 2. Outer loop: (i < n-1) for passes
 * 3. Inner loop: (j < n-i-1) for comparisons
 * 4. Understand why largest element "bubbles" to the end
 * 5. Know how to optimize with the swapped flag
 */