package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * User: chanson-pro
 * Date-Time: 2017-11-2 9:56
 * Description:   // 使用hash table
 * Given an array of integers,
 * return indices of the two numbers such that they add up to a specific target.
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {
    private static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        int size = nums.length;//求数组长度
        //添加数组元素到hashMap
        for (int i=0;i<size;i++){
            map.put(nums[i],i);
        }
        for (int j=0;j<size;j++){
            //目标值减去数组的第j个元素的value,判断com是否在hash map中存在
            int com = target - nums[j];
            if (map.containsKey(com) && map.get(com) != j){
                return new int[]{j,map.get(com)};
            }
        }
        throw new IllegalArgumentException("不存在");
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 18;
        int[] result = twoSum(arr,target);
        System.out.println(Arrays.toString(result));
    }

}
