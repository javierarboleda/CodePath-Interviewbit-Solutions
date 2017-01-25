import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/**
 * Created on 1/12/17.
 */

public class IbAllUniquePermutations {

    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
        Set<ArrayList<Integer>> listSet = new HashSet<>();

        Integer[] b = new Integer[a.size()];
        b = a.toArray(b);

        permuteIt(b, 0, b.length - 1, listSet);

        return new ArrayList<>(listSet);
    }

    public void permuteIt(Integer[] a, int l, int r, Set<ArrayList<Integer>> list) {

        if (l == r) {
            list.add(new ArrayList<Integer>(Arrays.asList(a)));
        } else {
            for (int i = l; i <= r; i++) {
                swap(a, l, i);
                permuteIt(a, l + 1, r, list);
                swap(a, l, i);
            }
        }
    }

    public static void swap (Integer[] a, int i, int j) {
        Integer temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
