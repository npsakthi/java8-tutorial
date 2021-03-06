package com.winterbe.java8.samples.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author onlyone
 */
public class Stream_skip {
    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        // 扔掉前三个元素
        stringCollection
                .stream()
                .skip(3)
                .forEach(System.out::println);

    }
}
