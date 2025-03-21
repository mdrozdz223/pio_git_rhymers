package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int EMPTY_INDEX = -1;
    private static final int MAX_SIZE = 12;
    private static final int FULL_INDEX = MAX_SIZE - 1;

    private final int[] numbers = new int[MAX_SIZE];

    private int total = EMPTY_INDEX;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_INDEX;
    }

    public boolean isFull() {
        return total == FULL_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_INDEX;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_INDEX;
        return numbers[total--];
    }
}
