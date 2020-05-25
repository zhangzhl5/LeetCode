package item.difficulty.medium;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author zhangzhl
 *
 */
public class LRUCache {

	static class LRU<K, V> extends LinkedHashMap<K, V> {
		private int capacity;

		public LRU(int capacity) {
			super(capacity, 0.75f, true);
			this.capacity = capacity;
		}

		@Override
		protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
			return size() > capacity;
		}
	}

	private LRU lru;

	public LRUCache(int capacity) {
		lru = new LRU(capacity);
	}

	public int get(int key) {
		if (lru.containsKey(key)) {
			return (int) lru.get(key);
		}
		return -1;

	}

	public void put(int key, int value) {
		lru.put(key, value);
	}

}
