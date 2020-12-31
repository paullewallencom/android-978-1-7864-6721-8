package com.example.kyle.prototypepattern;

import java.util.Hashtable;


public class SequenceCache {

    private static Hashtable<String, Sequence> sequenceHashtable = new Hashtable<String, Sequence>();

    public static Sequence getSequence(String sequenceId) {

        Sequence cachedSequence = sequenceHashtable.get(sequenceId);
        return (Sequence) cachedSequence.clone();
    }

    public static void loadCache() {

        Prime prime = new Prime();
        prime.setId("1");
        sequenceHashtable.put(prime.getId(), prime);

        Fibonacci fib = new Fibonacci();
        fib.setId("2");
        sequenceHashtable.put(fib.getId(), fib);
    }
}
