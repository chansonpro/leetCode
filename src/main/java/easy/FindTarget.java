package easy;

/**
 * User: chanson-pro
 * Date-Time: 2017-11-6 23:22
 * Description:在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *  1  2  8   9
    2  4  9   12
    4  7  10  13
    6  8  11  15
 */
public class FindTarget {
    private static boolean findTarget(int target,int[][] array) {
        int rows = array.length;//行数
        int colums = array[0].length;//列数
        int start = 0;//从右上角开始
        int end   = colums - 1;
        boolean flag = false;
        while ((start < rows )&& (end >=0 )) {
            if(array[start][end] == target){
                flag =  true;
                break;// 跳出循环
            }
            else if (array[start][end] > target){
                end--;
            }
            else{
                start++;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2 ,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int target = 121;
        boolean result = findTarget(target,arr);
        System.out.println(result);
    }

}
