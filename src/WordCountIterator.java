import java.util.*;

public class WordCountIterator implements Iterator<Map.Entry<String, Integer>> {
    private List<String> words;
    private int currentIndex;

    public WordCountIterator(List<String> words) {
        this.words = words;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < words.size();
    }

    @Override
    public Map.Entry<String, Integer> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        String currentWord = words.get(currentIndex);
        int count = 1;
        currentIndex++;

        // Count consecutive occurrences of the current word
        while (currentIndex < words.size() && words.get(currentIndex).equals(currentWord)) {
            count++;
            currentIndex++;
        }

        return new AbstractMap.SimpleEntry<>(currentWord, count);
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("foo", "foo", "foo", "bar", "foo");

        WordCountIterator iterator = new WordCountIterator(input);

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("{" + entry.getKey() + ":" + entry.getValue() + "}");
        }
    }
}
