package Generic;

public class DoubleGenericMapKeyRestrict {

    public static class Map<K extends String, V> {
        // extends 예약 키워드를 통해 써야 하는 타입을 제한을 걸어 줄 수 있다.
        // 이를 통해 Generic을 설계 하더라도 훨씬 깔끔하게 제한을 걸 수 있다.
        private K[] key;
        private V[] value;
        private int count;
        private int capacity;

        public Map(int size) {
            this.key = (K[]) new String[size];
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
