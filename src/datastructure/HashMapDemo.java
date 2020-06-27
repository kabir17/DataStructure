package datastructure;

/*
    What is HasMap : It is a key value paired data structure.
                     Index known as a key in hashMap.
                     HashMap is super class of LinkedHasMap,and implements Map interface.
                     It doesnt maintain the index order but LinkedHasMap maintain the index order.
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        //Using HasMap do not maintain the index order while executed.
        Map<String,String> map = new HashMap<>();
        map.put("USA       ","NY      ");
        map.put("UK        ","London  ");
        map.put("Canada    ","Montreal");
        map.put("Bangladesh","Dhaka   ");

        for(Map.Entry<String,String> data : map.entrySet()){
            System.out.println(data.getKey()+"  "+data.getValue());
        }
        System.out.println("----------------------------------------");

        //Using LinkedHasMap and maintain the index order while executed.
        Map<String,String> map1 = new LinkedHashMap<String, String>();
        map1.put("USA       ","NY      ");
        map1.put("UK        ","London  ");
        map1.put("Canada    ","Montreal");
        map1.put("Bangladesh","Dhaka   ");

        for(Map.Entry<String,String> data1 : map1.entrySet()){
            System.out.println(data1.getKey()+"  "+data1.getValue());
        }
        System.out.println("-------------------------------------------");

        //Using string and integer value.
        Map<String,Integer> map2 = new LinkedHashMap<String, Integer>();
        map2.put("Ullah  ",101);
        map2.put("Velerie",102);
        map2.put("Poppy  ",103);
        map2.put("Mafi   ",105);

        for (Map.Entry<String,Integer> data2 : map2.entrySet()){
            System.out.println(data2.getKey()+"  "+data2.getValue());
        }
        System.out.println("-----------------------------------------");

        System.out.println("Using String and Double value : ");
        Map<String,Double> map3 = new LinkedHashMap<String, Double>();
        map3.put("ullah  ",85000.00);
        map3.put("Velerie",75000.00);
        map3.put("Poppy  ",70000.00);
        map3.put("kabir  ",50000.00);

        for (Map.Entry<String,Double> data3 : map3.entrySet()){
            System.out.println(data3.getKey()+ "   "+data3.getValue());
        }
    }
}
