package Generic;

public class DoubleGenericMap {

    public static class Map<K, V> {
        private K[] key;
        private V[] value;
        private int count;
        private int capacity;

        public Map(int size) {
            this.key = (K[]) new Object[size];
            this.value = (V[]) new Object[size];
            this.count = 0;
            this.capacity = size;
        }

        public void put(K key, V value) {
            if (count == capacity)
                return;
            this.key[count] = key;
            this.value[count] = value;
            count++;
        }

        public V get(K key) {
            for (int i = 0; i < count; i++) {
                if (this.key[i].equals(key))
                    return this.value[i];
            }
            return null;
        }

        public int size() {
            return count;
        }
    }


}
