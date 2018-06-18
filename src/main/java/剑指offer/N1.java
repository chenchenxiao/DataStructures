package 剑指offer;

/**
 * @author Blse
 * @date 2018/6/17
 * @description 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 *               请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class N1 {

   public boolean find(int target, int[][] array) {
       int row = array.length - 1;
       int line = array[0].length;
       int i = 0;
       while (row >= 0 && i < line) {
           if (array[row][i] > target) {
               row--;
           } else if (array[row][i] < target) {
               i++;
           } else {
               return true;
           }
       }
       return false;
   }
   
}
