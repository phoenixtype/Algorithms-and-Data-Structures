/**
 * Variation of inserton sort
 * Insertion sort chooses which element to insert using a gap of 1
 * Shell Sort starts out using a larger gap value
 * As the algorithm runs, the gap is reduced
 * Goal is to reduce the amount of shifting required
 * As the algorithm progresses the gap value is reduced
 * The last gap value is alwaays 1
 * A gap value of 1 is equivalent to insertion sort
 * So the algorithm does some preliminary work (using gap values greater than 1), and then becomes insertion sort
 * By the time we get to insertion sort, the array has been partially sorted, so there's less shifting required
 *
 *
 * Knuth Sequence
 */


public class ShellSortImpl {
    /**
     * intArray = [20, 35, -15, 7, 55, 1, -22]
     * We'll base the gap on the array's length. We'll initialize the gap (or interval) to array.length/2
     * On each iteration, we'll divide the gap value by 2 to get the next gap value
     * For our array, the gap will be initialized to 3
     * On the next iteration, it will be 1 - insertion sort
     * gap = intArray.length/2
     * i = gap = 3 (initialize i = gap) then increment i
     * j = i = 3 (initialize j = i)
     * j = j - gap
     * newElement = intArray[i] = 7
     * Compare intArray[j - gap] with newElement
     */

}
