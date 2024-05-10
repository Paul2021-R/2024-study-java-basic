package EnumExample;

public enum DayOfWeek {
    SUN(100), MON(200), TUE(300), WED(400), THU(500), FRI(600), SAT(700);
    int value;

    DayOfWeek(int value) {
        this.value = value;
//        System.out.println(this.name() + ":" + value);
    }

    int getValue() {
        return this.value;
    }

    // 내부 value 와 ordinal의 차이를 알아야 한다.
    /**
     * 기본적으로 내부 ordinal은 열거형이 생성됨과 동시에 매겨지는 숫자다.
     * 그렇기에 항상 0부터 시작되는 구조를 가진다.
     * 이에 비해 value는 개발자가 직접 넣을 수 있는 구분자의 역할을 하는 값이다.
     * 개발 상황에서는 ordinal은 가능하면 쓰지 않는게 당연히 좋다.
     */
}

