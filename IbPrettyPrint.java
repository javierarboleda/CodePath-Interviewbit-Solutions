import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created on 1/11/17.
 */

public class IbPrettyPrint {

    public ArrayList<ArrayList<Integer>> prettyPrint(int a) {

        int size = a + a - 1;
        ArrayList<ArrayList<Integer>> resultArray = new ArrayList<>();

        for (int i = 0; i < size; i++) {

            Integer[] integers = new Integer[size];

            int x = a - 1;
            int stepperMax = Math.abs(Math.abs(i - x) - x);
            int stepper = 0;

            for (int j = 0, k = size - 1; k >= j; j++, k--) {
                Integer integer = a - stepper;
                integers[j] = integers[k] = integer;
                if (stepper != stepperMax) {
                    stepper++;
                }
            }

            resultArray.add(new ArrayList<Integer>(Arrays.asList(integers)));

        }

        return resultArray;
    }

}
