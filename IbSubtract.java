import java.util.ArrayDeque;

/**
 * Created on 1/12/17.
 */

public class IbSubtract {

    public ListNode subtract(ListNode a) {
	    
	ListNode h = a;

        int size = getListSize(h);
        int loops = size / 2;
        boolean even = size % 2 == 0;

        ArrayDeque<Integer> vals = new ArrayDeque<>();

        ListNode rhp = a;

        // move rhp (right half pointer) to starting point
        for (int i = 0; i < loops; i++) {
            rhp = rhp.next;
        }

        if (even) {
            vals.push(rhp.val);
        }

        while(rhp.next != null) {
            rhp = rhp.next;
            vals.push(rhp.val);
        }

        h = a;

        // subtract first half elements from popped val of stack
        for (int i = 0; i < loops; i++) {
            h.val = vals.pop() - h.val;
            h = h.next;
        }

        return a;
	    
    }
	
    private int getListSize(ListNode h) {
        int size = 0;
        while (h != null) {
	    size++;
	    h = h.next;
        }
        return size;
    }
}
