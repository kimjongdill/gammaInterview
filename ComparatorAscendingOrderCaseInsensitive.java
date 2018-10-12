import java.util.Comparator;

public class ComparatorAscendingOrderCaseInsensitive implements Comparator<String> {

    @Override
    public int compare(String first, String second) {
        return first.compareToIgnoreCase(second);
    }
}
