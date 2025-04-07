package edu.kis.vh.nursery;

/**
 * Klasa jest rozszerzeniem DefaultCountingOutRhymer
 * oraz zajmuje się obsługą wartości większych niż szczytowy element stosu.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {
    /**
     * licznik wartości odrzuconych
     */
    private int totalRejected = 0;

    /**
     * Zwraca liczbę odrzuconych wartości
     * @return liczb odrzuconych wartości
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Przechowuje w strukturze wartość, jeżeli ta nie jest większa niż wartość na szczycie stosu
     * W przypadku większej wartości licznik totalRejected zostaje zwiększony a wartość odrzucona
     * W przypadku pustego stosu wartość również jest odrzucana a licznik zostaje zwiększony
     * @param in to wartość do dodania do struktury
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}