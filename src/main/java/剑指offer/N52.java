package 剑指offer;

/**
 * @author Blse
 * @date 2018/7/17
 * @description 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 */
public class N52 {

    public int[] multiply(int[] A) {
        int length = A.length;
        int[] B = new int[length];
        for (int i = 0; i < length; i++) {
            int temp = 1;
            for (int j = 0; j < length; j++) {
                if (j != i) {
                    temp *= A[j];
                }
            }
            B[i] = temp;
        }
        return B;
    }

}
