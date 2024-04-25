package AbstractClass.PracticalInterfaceExample;

public class WordProcessor {
    private SpellingChecker spellingChecker;
    public WordProcessor(SpellingChecker spellingChecker) {
        this.spellingChecker = spellingChecker;
    }

    public void changeSpellingChecker(SpellingChecker spellingChecker) {
        this.spellingChecker = spellingChecker;
    }

    public void translate(String word) {
        Dictionary dictionary = (Dictionary) spellingChecker;
        String english = dictionary.find(word);
        System.out.println(word + " = " + english);
    }

    public void checkSpelling(String[] words) {
        spellingChecker.setWords(words);
        String[] errors = spellingChecker.check();
        System.out.println("잘못된 단어 목록: ");
        for (String error : errors) {
            if (error != null)
                System.out.println(error);
        }

    }
}
