package com.os.operando.guild;

/**
 * A tuple of seven elements.
 *
 * @param <F>  first element type
 * @param <S>  second element type
 * @param <T>  third element type
 * @param <FO> fourth element type
 * @param <FI> five element type
 * @param <SI> six element type
 * @param <SE> seven element type
 */
public class Septet<F, S, T, FO, FI, SI, SE> {

    private final F first;
    private final S second;
    private final T third;
    private final FO fourth;
    private final FI five;
    private final SI six;
    private final SE seven;

    private Septet(final F first, final S second, final T third, final FO fourth, final FI five, final SI six, SE seven) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.five = five;
        this.six = six;
        this.seven = seven;
    }

    public static <F, S, T, FO, FI, SI, SE> Septet<F, S, T, FO, FI, SI, SE> create(F first, S second, T third, FO fourth, FI five, SI six, SE seven) {
        return new Septet<>(first, second, third, fourth, five, six, seven);
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    public FO getFourth() {
        return fourth;
    }

    public FI getFive() {
        return five;
    }

    public SI getSix() {
        return six;
    }

    public SE getSeven() {
        return seven;
    }

    @Override
    public String toString() {
        return "Septet{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", fourth=" + fourth +
                ", five=" + five +
                ", six=" + six +
                ", seven=" + seven +
                '}';
    }
}