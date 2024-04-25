package AbstractClass.PracticalInterfaceExample;

public class SpellingCheckerImpl implements SpellingChecker, Dictionary {
    private String[] words;
    private String[] glossaries = {"사랑", "평화", "행복"};
    private String[] englishes = {"love", "peace", "happiness"};

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

    @Override
    public String find(String word) {
        for (int i = 0; i < glossaries.length; i++) {
            if (word.equals(glossaries[i]))
                return englishes[i];
        }
        return null;
    }
}
