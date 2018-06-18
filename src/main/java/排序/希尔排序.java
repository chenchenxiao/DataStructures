package 排序;

/**
 * @author Blse
 * @date 2018/6/16
 * @description
        缩小增量的排序
        每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，
        分别对各子表进行直接插入排序。仅增量因子为1 时，将整个序列进行一次直接插入排序。
        时间复杂度：O(nlogn)
 */
public class 希尔排序 {

    public static void main(String[] args) {
        int[] arrs = ArraysUtils.getArrs(10, 100);
        ArraysUtils.print(arrs);
        int length = arrs.length;
        //第一个循环表示每次遍历数组的增量是多少
        for (int i = length / 2; i > 0; i /= 2){
            //根据增量进行插入排序
            for (int j = 0; j < length - i; j++) {
                if (i == 1) {
                    for (int k = j; k >= 0; k--) {
                        if (arrs[k + i] < arrs[k]) {
                            int temp = arrs[k];
                            arrs[k] = arrs[k + i];
                            arrs[k + i] = temp;
                        }
                    }
                } else {
                    if (arrs[j] > arrs[j + i]) {
                        int temp = arrs[j];
                        arrs[j] = arrs[j + i];
                        arrs[j + i] = temp;
                    }
                }
            }
            ArraysUtils.print(arrs);
        }


    }

//    public static void main(String[] args) {
//        int[] data = ArraysUtils.getArrs(10, 100);
//        int j = 0;
//        int temp = 0;
//        for (int increment = data.length / 2; increment > 0; increment /= 2) {
//            System.out.println("increment:" + increment);
//            for (int i = increment; i < data.length; i++) {
//                temp = data[i];
//                for (j = i - increment; j >= 0; j -= increment) {
//                    if (temp < data[j]) {
//                        data[j + increment] = data[j];
//                    } else {
//                        break;
//                    }
//                }
//                data[j + increment] = temp;
//            }
//            for (int i = 0; i < data.length; i++)
//                System.out.print(data[i] + " ");
//        }
//    }
}
