package AbstractClass.PracticalInterfaceExample;

public class main {
    public static void main(String[] args) {
        // 인터페이스를 활용한 모듈화
        // 인터페이스를 활용해 정의 내린 뒤
        // 그것을 활용한 Impl  클래스를 구현하고 사용하게 되면
        // 부품처럼 끼워넣기를 하고, 내부의 비즈니스로직이 다르더라도 결과적인 입/ 출구만 같다면 문제 없이 동작한다.
        // 다형성을 활용한 방식이며, 인터페이스의 원리를 응용한 기술이다.
        // 이러한 점에서 컴포넌트 기반 개발(CBD, Component-Based Development)이 가능하다.
        SpellingChecker spellingChecker = new SpellingCheckerImpl();
        WordProcessor wordProcessor = new WordProcessor(spellingChecker);
        String[] words = {"사랑", "미움", "평화", "불행", "전쟁"};
        wordProcessor.checkSpelling(words);

        System.out.println("=================");

        SpellingChecker spellingChecker2 = new DevilSpellingCheckerImpl();
        wordProcessor.changeSpellingChecker(spellingChecker2);
        wordProcessor.checkSpelling(words);

        System.out.println("=================");

        // SpellingCheckerImpl 은 Dictionary interface 를 상속 받고 있다.
        // 따라서 interface로 다형성으로 형변환도 가능하다.
        wordProcessor.changeSpellingChecker(spellingChecker);
        wordProcessor.translate("사랑");
    }
}
