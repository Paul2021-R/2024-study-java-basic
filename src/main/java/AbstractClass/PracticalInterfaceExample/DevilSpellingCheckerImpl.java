package AbstractClass.PracticalInterfaceExample;

public class DevilSpellingCheckerImpl implements SpellingChecker {
    private String[] words;
    private String[] glossaries = {"미움", "전쟁", "불행"};

    @Override
    public void setWords(String[] words) {
        this.words = words;
    }

    @Override
    public String[] check() {
        String[] errors = new String[words.length];
        int count = 0;
        for (String word : words) {
            boolean bFound = false;
            for (String glossary : glossaries) {
                if (word.equals(glossary)) {
                    bFound = true;
                    break;
                }
            }
            if (!bFound)
                errors[count++] = word;
        }
        return errors;
    }
}
