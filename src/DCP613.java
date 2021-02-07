import java.util.HashMap;

/*
Implement a PrefixMapSum class with the following methods:

    insert(key: str, value: int): Set a given key's value in the map. If the key already exists, overwrite the value.
    sum(prefix: str): Return the sum of all values of keys that begin with a given prefix.

For example, you should be able to run the following code:

mapsum.insert("columnar", 3)
assert mapsum.sum("col") == 3

mapsum.insert("column", 2)
assert mapsum.sum("col") == 5

 */
public class DCP613 {

    public static void main(String[] args) {

    }

    public class PrefixMapSum {
        HashMap<String, Integer> set = new HashMap<>();

        public void insert(String key, int value){
            set.put(key, value);
        }

        public void sum(){

        }
    }
}
