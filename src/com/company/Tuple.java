package com.company;

// I began the Maman before watching the last lecture, so instead
//of a HashMap, I declared a simple tuple. For this task it does the job just fine.
public class Tuple<X, Y> {
    private final X x;
    private final Y y;
    public Tuple(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public X getX() {
        return x;
    }

    public Y getY() {
        return y;
    }

    @Override
    public String toString() {
        return x.toString() + " " + y.toString();
    }
}

