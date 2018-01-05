package com.przemolec;

public class Stos<E> {
    //Basic, not OutOfBoundsProof
    Object[] stos;
    int counter = 0;

    public Stos(int size) {
        this.stos = new Object[size];
    }

    public void put(E o) {
        this.stos[counter] = o;
        this.counter += 1;
    }

    public E pull() {
        this.counter -= 1;
        return (E) this.stos[this.counter];
    }
}
