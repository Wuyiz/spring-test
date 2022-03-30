package com.wuyiz.springtest.test;

import static java.util.stream.IntStream.range;

/**
 * TODO
 *
 * @author wyz
 * @version 1.0.0 v
 * @date 2021-06-02 10:13
 */
public class StreamTest {
    public static void main(String[] args) {
        range(0, 10).forEach(System.out::println);
        repeat(10, StreamTest::hi);
    }

    public static void repeat(int n, Runnable action) {
        range(0, n).forEach(i -> action.run());
    }

    static void hi() {
        System.out.println("hi");
    }
}
