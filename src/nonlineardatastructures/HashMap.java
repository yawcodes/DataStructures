package nonlineardatastructures;

import lineardatastructures.LinkedList;

public class HashMap {
    // This is a visual representation of a hashmap
    /**
     *  [] <- represents an array
     *  () <- represents a linkedlist
     *
     *             0                                           1                          2                             3
     *  [(->->->)(->->->)(->->->)(->->->)]   [(->->->)(->->->)(->->->)]   [(->->->)(->->->)(->->->)]    [(->->->)(->->->)(->->->)]
     *
     *
     *
     */
    private LinkedList[] hashmap;

    public HashMap(int size) {
        this.hashmap = new LinkedList[size];
        for (int i = 0; i < this.hashmap.length; i ++) {
            // Each array in the hashmap is populated with linkedList to avoid collision
            // This method of collision avoidance is called linked chaining
            this.hashmap[i] = new LinkedList();
        }
    }

    public int hash(String key) {
        int hashCode = 0;
        /**
         * Loop through each character in the string and find their codePoint which is unique for every character
         */
        for (int i = 0; i < key.length(); i ++) {
            hashCode += Character.codePointAt(key, i);
        }
        return hashCode % this.hashmap.length;
    }

    public void assign(String key, String value) {
        /**
         * find the hash of the key
         * modulo the hash to fit in index in array
         */
        int hash = hash(key);
        int arrayIndex;

    }

    public static void main(String[] args) {

        HashMap mymap = new HashMap(3);
        System.out.println(mymap.hash("car"));
        System.out.println(mymap.hash("c"));
        System.out.println(mymap.hash("a"));
        System.out.println(mymap.hash("r"));

    }
}
