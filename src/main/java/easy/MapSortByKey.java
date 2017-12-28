package easy;

import java.util.*;

/**
 * User: chanson-pro
 * Date-Time: 2017-12-28 10:53
 * Description:将map中的key按照字母进行排序，通过匿名类实现接口Comparator
 */
public class MapSortByKey {
    public static void main(String[] args) {
        Map<String,String> map = new TreeMap<String, String>(
                new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        // 降序排序
                        return o2.compareTo(o1);
                        //升序
                        //return o1.compareTo(o1);
                    }
                });
        map.put("a","hangzhou");
        map.put("b","beijing");
        map.put("c","chaina");
        map.put("d","asdffh");

        Set<String> keySet = map.keySet();//使用keySet()方法获取所有的key值
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.print(key + "=" + map.get(key)+":");
        }
    }

}
