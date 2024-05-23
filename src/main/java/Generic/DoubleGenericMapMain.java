package Generic;

import Generic.DoubleGenericMap;

public class DoubleGenericMapMain {
    public static void main(String[] args) {
        // var 타입은 타입 추론 기능으로 변수 명을 심플하게 하면서도,
        // 컴파일러가 타입을 잘 관리할 수 있어서
        // 복잡한 타입의 경우 다음과 같이 써먹는게 편리할 수 있다.
        var IS = new DoubleGenericMap.Map<Integer, String>(100);
        IS.put(1, "hello world!");
        IS.put(2, "Plz, LOL!");
        IS.put(3, "This is Double GenericMap");

        for (int i = 1; i <= IS.size(); i++) {
            System.out.println(IS.get(i));
        }

        var SS = new DoubleGenericMapKeyRestrict.Map<String, String>(100);
        var SI = new DoubleGenericMapKeyRestrict.Map<String, Integer>(100);
//        var IS2 = new DoubleGenericMapKeyRestrict.Map<Integer, Integer>(100); 에러 발생
        SS.put("hello", "World!");
        SI.put("hello", 2123123141);

        System.out.println(SS.get("hello"));
        System.out.println(SI.get("hello"));
    }

}
