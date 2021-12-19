package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.IntStream;

import static java.util.Collections.*;

public class AssociationTable<S extends Comparable<S>,T> {

    private ArrayList<Tuple<S,T>> pairs = new ArrayList<>();

    public AssociationTable(S[] keys, T[] values) {
        IntStream.range(0, keys.length)
                .mapToObj(i -> new Tuple<>(keys[i], values[i]))
                .forEach(pairs::add);
        bubbleSort();
    }
    public AssociationTable(){}

    public void add(Tuple<S,T> tuple){
        pairs.add(tuple);
        bubbleSort();
    }

    public Tuple<S,T> get(int key){
        return key < pairs.size() ? pairs.get(key) : null;
    }

    public boolean contains(S key) {
        return pairs.stream()
                .anyMatch(pair -> pair.getX().equals(key));
    }

    public boolean remove(S key){
        for (int i = 0; i < pairs.size(); i++) {
            if (pairs.get(i).getX().equals(key)) {
                pairs.remove(i);
                return true;
            }
        }
        return false;
    }

    public int size(){
        return pairs.size();
    }

    public Iterator<Tuple<S,T>> keyIterator(){
        return pairs.iterator();
    }

    private void bubbleSort() {
        int n = pairs.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (pairs.get(j).getX()
                        .compareTo(pairs.get(j+1).getX()) > 0){
                    swap(pairs, j, j+1);
                }

    }

}
