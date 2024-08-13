/*
Implement the RandomizedSet class:

RandomizedSet() Initializes the RandomizedSet object.
bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.
You must implement the functions of the class such that each function works in average O(1) time complexity.

 Input
["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
[[], [1], [2], [2], [], [1], [2], []]
Output
[null, true, false, true, 2, true, false, 2]
*/

class RandomizedSet {
  //create a new set to stored
    HashSet<Integer> set;
    public RandomizedSet() {
      //initialize set
        set = new HashSet<>();
    }
    
    public boolean insert(int val) {
      //if set contain value return false
        if(set.contains(val))return false;
        set.add(val);
      //add value in set  and return true
        return true;
    }
    
    public boolean remove(int val) {
      //remove value from set if it contains
        if(!set.contains(val))return  false;
        set.remove(val);
        return true;
    }
    
    public int getRandom() {
      //get set size
        int size = set.size();
      //get  random value from 1 to  size
         int idx = new Random().nextInt(size);

      //convert set into integer  array
        Integer[] arr = set.toArray(new Integer[set.size()]);
      //return random value from array
        return arr[idx];

    }
}
