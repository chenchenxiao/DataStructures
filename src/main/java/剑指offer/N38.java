package 剑指offer;

/**
 * @author Blse
 * @date 2018/6/21
 * @description 统计一个数字在排序数组中出现的次数。
 */
public class N38 {
    public static void main(String[] args) {
        int[] arrs = {1,2,3,3,3,4,5,6};
        new N38().GetNumberOfK(arrs, 3);
    }
    public int GetNumberOfK(int [] array , int k) {
        int first = getFirst(array, k);
        int last = getLast(array, k);
        int result = last - first;
        return result + 1;
    }

    private int getFirst(int[] array, int k) {
        int start = 0;
        int end = array.length - 1;
        int mid = (start + end) >> 1;
        while (start <= end) {
            if (array[mid] >= k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) >> 1;
        }
        return start;
    }

    private int getLast(int[] array, int k) {
        int start = 0;
        int end = array.length - 1;
        int mid = (start + end) >> 1;
        while (start <= end) {
            if (array[mid] <= k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) >> 1;
        }
        return end;
    }
}
