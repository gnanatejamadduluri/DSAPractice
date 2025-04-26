package stackAndQueue;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache extends LinkedHashMap<Integer, Integer> {
	    /**
	 * 
	 */
	private static final long serialVersionUID = 8105089690336365386L;
		private int capacity;

	    public LRUCache(int capacity) {
	        super(capacity, 0.75f, true); // true = access-order
	        this.capacity = capacity;
	    }

	    public int get(int key) {
	        return super.getOrDefault(key, -1);
	    }

	    public void put(int key, int value) {
	        super.put(key, value);
	    }

	    @Override
	    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
	        return size() > capacity;
	    }
}
