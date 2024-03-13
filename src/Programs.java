public class Programs {
    private String word;

    public Programs() {
    }

    public Programs(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }


    public int vowelsLetter(String word) {
        int count = 0;
        for (char a : word.toLowerCase().toCharArray()) {
            if (" ".indexOf(a) != -1) {
                count++;
            }
        }
        return count;
    }

    public boolean isPalindrome(String word) {
        return new StringBuilder(word).reverse().toString().equalsIgnoreCase(word);
    }

    public String upperCaseLetter(String sentence) {
        String[] words = sentence.split("\\s");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        return result.toString().trim();
    }

    public int countWords(String sentence) {
        return sentence.split("\\s+").length;
    }

    public String replaceToAscii(String word) {
        StringBuilder result = new StringBuilder();
        for (char a : word.toCharArray()) {
            result.append((int) a).append(" ");
        }
        return result.toString().trim();
    }
    public String deleteSpaces(String sentence) {
        StringBuilder result = new StringBuilder();
        for (char a : sentence.toCharArray()) {
            if (!Character.isWhitespace(a)) {
                result.append(a);
            }
        }
        return result.toString();
    }
}
