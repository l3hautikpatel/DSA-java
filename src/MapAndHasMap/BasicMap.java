package MapAndHasMap;

import java.util.HashMap;
import java.util.Map;

public class BasicMap {
    public static void main(String[] args) {
        // Creating a HashMap to store String keys and Integer values
        Map<String, Integer> map = new HashMap<>();
        // Adding a key-value pair
        map.put("Bhautik", 123456);
        map.put("Bhautik", 123456);

        // Trying to put the same key with the same value multiple times has no effect
        // since a HashMap does not allow duplicate keys.
        // The map will still have one entry: {"Bhautik": 123456}

        System.out.println(map); // Output: {Bhautik=123456}

        // Incrementing the value associated with the key "Bhautik"
        // This will not work directly as expected; we need to fetch, increment, and put back.
        map.put("Bhautik", map.get("Bhautik") + 1); // Correctly incrementing the value

        // Display the updated map
        System.out.println(map); // Output: {Bhautik=123457}

        // Creating another HashMap to store Integer keys and Integer values
        Map<Integer, Integer> intMap = new HashMap<>();
        intMap.put(0, 23);
        System.out.println(intMap);
        // You cannot directly use `++` on the value in the map like this
        // Instead, retrieve the value, increment it, and put it back
        intMap.put(0, intMap.get(0) + 1); // Incrementing the value at key 0

        // Display the updated intMap
        System.out.println(intMap); // Output: {0=24}

        /*  Method	   =>    Action Performed

clear()	=> This method is used in Java Map Interface to clear and remove all of the elements or mappings from a specified Map collection.

containsKey(Object) =>	This method is used in Map Interface in Java to check whether a particular key is being mapped into the Map or not. It takes the key element as a parameter and returns True if that element is mapped in the map.

containsValue(Object) => 	This method is used in Map Interface to check whether a particular value is being mapped by a single or more than one key in the Map. It takes the value as a parameter and returns True if that value is mapped by any of the keys in the map.

entrySet()	=> This method is used in Map Interface in Java to create a set out of the same elements contained in the map. It basically returns a set view of the map or we can create a new set and store the map elements into them.

equals(Object) => 	This method is used in Java Map Interface to check for equality between two maps. It verifies whether the elements of one map passed as a parameter is equal to the elements of this map or not.
get(Object) => 	This method is used to retrieve or fetch the value mapped by a particular key mentioned in the parameter. It returns NULL when the map contains no such mapping for the key.
hashCode()	=>  This method is used in Map Interface to generate a hashCode for the given map containing keys and values.
isEmpty() =>	This method is used to check if a map is having any entry for key and value pairs. If no mapping exists, then this returns true.
keySet()	=>	This method is used in Map Interface to return a Set view of the keys contained in this map. The set is backed by the map, so changes to the map are reflected in the set, and vice-versa.
put(Object, Object)	=>	This method is used in Java Map Interface to associate the specified value with the specified key in this map.
putAll(Map)	=>	This method is used in Map Interface in Java to copy all of the mappings from the specified map to this map.
remove(Object)	=>	This method is used in Map Interface to remove the mapping for a key from this map if it is present in the map.
size()	=>	This method is used to return the number of key/value pairs available in the map.
values()	=>	This method is used in Java Map Interface to create a collection out of the values of the map. It basically returns a Collection view of the values in the HashMap.
getOrDefault(Object key, V defaultValue)	=>	Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)	=>	If the specified key is not already associated with a value or is associated with null, associate it with the given non-null value.
putIfAbsent(K key, V value)	=>	If the specified key is not already associated with a value (or is mapped to null) associates it with the given value and returns null, else returns the current associate value.

        * */

        Map<Integer , Integer> map2 = new HashMap<>(intMap);
        map2.put(12,324);
        intMap.put(23,45);
        System.out.println(map2);

        System.out.println("equals"+intMap.equals(map2));
        System.out.println("hashcode"+intMap.hashCode());
        System.out.println("keyset"+intMap.keySet());
        System.out.println("entryset"+intMap.entrySet()); // this is
        System.out.println("size"+ intMap.size()) ;
        System.out.println("values"+ intMap.values()) ;

        // this is all about how to iterate in to the map
        HashMap<Integer , Integer> map3  = new HashMap<>() ;
        map3.put(1,234);
        map3.put(4,124);
        map3.put(5,23);
        map3.put(3,124);
        map3.put(2,23);
        map3.put(41,124);
        map3.put(52,23);
        map3.put(34,3124);
        map3.put(223,23);

        for(int key : map3.keySet()){
            System.out.println(key +" : " + map3.get(key));
        }
        System.out.println();
        map3.forEach((key , value)->{
            System.out.println(key + " : " + value);
        });
        System.out.println();
        for(Map.Entry<Integer , Integer> entry : map3.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " : " + value);
        }
        System.out.println();

        //nested map and iteration in it ;

        Map< String ,HashMap<String ,Integer>> mapMap = new HashMap<>();

        HashMap<String , Integer> internalMap1 = new HashMap<>();
        internalMap1.put("bhautik05" , 12313);
        internalMap1.put("bhautik01" , 13533);
        internalMap1.put("bhautik03" , 13424);
        internalMap1.put("bhautik04" , 13243);
        internalMap1.put("bhautik02" , 12354);
        mapMap.put("epmloyee" , internalMap1);

        HashMap<String , Integer> internalMap2 = new HashMap<>();
        internalMap2.put("computer01" , 12313);
        internalMap2.put("computer02" , 13533);
        internalMap2.put("computer03" , 13424);
        internalMap2.put("computer04" , 13243);
        internalMap2.put("computer02" , 12354);
        mapMap.put("department" , internalMap2);

        System.out.println(mapMap);

        for(Map.Entry<String ,HashMap<String ,Integer>> entry : mapMap.entrySet()){
            System.out.println(entry.getKey());
            entry.getValue().forEach((key , val) ->{
                System.out.println(key +" : " + val);
            });
            System.out.println();
        }


    }
}
