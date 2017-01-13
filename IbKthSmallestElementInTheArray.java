import java.util.Arrays;
import java.util.List;

/**
 * Created on 1/11/17.
 */

public class IbKthSmallestElementInTheArray {

    public static int kthsmallest(final List<Integer> a, int k) {

        if (k < 1 || k > a.size())
            throw new ArrayIndexOutOfBoundsException("Input needs to be within array size bounds!");

        if (a.isEmpty())
            throw new IllegalArgumentException("Do not pass an empty list!");

        Integer[] b = new Integer[a.size()];

        b = a.toArray(b);
        Arrays.sort(b);

        return b[k - 1];
    }
}
