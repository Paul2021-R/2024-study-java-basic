package Generic;

import java.util.HashMap;
import java.util.Map;

public class MapWithWild <K, V> {
    public static boolean compareSize(Map<?, ?> map1, Map<?,?> map2) {
        return map1.size() > map2.size();
    }

    // extends 키워드를 활용하면 그 와중에도 타입 자체의 제한을 걸수는 있다.
    public static boolean compareSize2(Map<?, ? extends Number> map1, Map<?,? extends Number> map2) {
        return map1.size() > map2.size();
    }

    public static boolean compareSize3(Map<? extends Number, ?> map1, Map<? extends Number,? > map2) {
        return map1.size() > map2.size();
    }

    // 이 방식으로 하는 경우는 수용하는 상위클래스를 지정해주는 방식으로, 이렇게 지정하게 되면
    // Integer, Number, Object 클래스만을 수용할 수 있게 된다.
    // 이러한 형태는 공변성(covariance), 반공변성(contravariance)의 개념과 관련된다.
    // 자바의 제네릭은 기본적으로 클래스의 상속 관계가 그대로 유지되지 않는다. 이것이 불변성(invariance)이라고 한다. 443p
    // 즉, 예를 들어ㅏ Integer - Number는 형변환 및 대입이 가능하지만 Stack<Integer>, Stack<Number> 는 코드가 에러를 발생시킨다.
    public static boolean compareSize4(Map<? , ? super Integer> map1, Map<? ,? super Integer> map2) {
        return map1.size() > map2.size();
    }

    // 와일드카드 인수는 타입 매개변수를 ? 로 사용한다.
    // 이러한 형태는 기존의 Generic의 경우 타입 안정성은 보장하지만, 경우에 따라선 방해가 되는 경우가 있다.
    // 지금같이 단순히 사이즈 비교만 한다면 내부의 타입이 다르다고 큰 문제는 아니다.
    // 이런 경우 ? 를 통해 와일드 카드를 이용해 내부의 타입을 무시하고, 접근이 가능해진다.
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("key1", "value1");
        map1.put("key2", "value2");
        map1.put("key3", "value3");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "value1");
        map2.put(2, "value2");
        map2.put(3, "value3");
        map2.put(4, "value4");
        map2.put(5, "value5");

        System.out.println(compareSize(map1, map2));
//        System.out.println(compareSize2(map2, map1)); 에러가 발생한다(타입이 안맞아서)

        Map<Integer, Integer> map3 = new HashMap<>();
        Map<Long, Integer> map4 = new HashMap<>();
        map3.put(1, 1);
        map3.put(2, 2);
        map3.put(3, 3);
        map3.put(4, 4);

        map4.put(100L, 1);
        map4.put(200L, 2);
        map4.put(300L, 3);

        System.out.println(compareSize2(map4, map3));// 이러면 문제가 없다.
        System.out.println(compareSize3(map2, map4)); // 이러면 키만 Number면 문제 없다.

//        System.out.println(compareSize4(map2, map4)); // String은 상위클래스가 아니므로 안된다.
        Map<Integer, Long> map5 = new HashMap<>();
        map5.put(1, 100L);
        map5.put(2, 200L);
//        System.out.println(compareSize4(map3, map5)); // Long 은 Integer 하위에 다른 클래스이므로 허용되지 못한다.
        System.out.println(compareSize4(map4, map3));
    }
}
