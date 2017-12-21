package easy;

import java.util.HashMap;

/**
 * User: chanson-pro
 * Date-Time: 2017-11-22 21:16
 * Description:数组中最长连续序列，返回其中最长的连续序列的长度,参考博文
 * http://blog.csdn.net/u013309870/article/details/70242770
 */
public class LongestConsecutive {
    public static int longConsecutive(int[] arr){
        //Arrays.sort(arr);
        if(arr == null || arr.length < 1) {
            return 0;
        }
        //如果数组长度超过1
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        int max = 1;
        for (int i=0; i<arr.length; i++){
            if (!map.containsKey(arr[i])) {
                map.put(arr[i],1);
                if (map.containsKey(arr[i]-1)) {
                    max = Math.max(max, merge(map,arr[i-1],arr[i]));
                }
                if (map.containsKey(arr[i]+1)) {
                    max = Math.max(max, merge(map,arr[i],arr[i+1]));
                }
            }
        }
        return max;
    }

    private static int merge(HashMap<Integer, Integer> map, int less, int more) {
        int left = less - map.get(less) + 1;
        int right = more + map.get(more) - 1;
        int len = right -left + 1;
        map.put(left, len);
        map.put(right, len);
        return len;
    }

}
