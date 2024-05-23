package Generic;

public class GenericMethod {

    public static <T extends  Comparable<T>> T min (T x, T y) {
        // Generic 으로 편리하게 비교를 만들어낼 수 있다.
        //
        return x.compareTo(y) < 0 ? x : y;
    }

    public static <T extends Comparable<T>> T add (T x, T y) {
        return switch (x) {
            case Integer i -> (T) Integer.valueOf(i.intValue() + (Integer) y);
            case Long l -> (T) Long.valueOf(l.longValue() + (Long) y);
            case Float v -> (T) Float.valueOf(v.floatValue() + (Float) y);
            case Double v -> (T) Double.valueOf(v.doubleValue() + (Double) y);
            case null, default -> throw new IllegalArgumentException();
        };
    }

    public static void main(String[] args) {
        Long a = 10L;
        Long b = 25L;

        int j = 20;
        int k = 19;

        System.out.println(min(a, b));
        System.out.println(min(j, k));

        Float z = 3.14f;
        Float x = 22.51f;
        System.out.println(add(z, x));
    }
}
