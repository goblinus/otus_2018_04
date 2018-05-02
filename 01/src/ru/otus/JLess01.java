package ru.otus;

import com.google.common.base.Joiner;

public class JLess01 {
    static public void main(String[] args) {
        System.out.println(
            "Введенные параметры будут слиты в  одну строку с разделителем ';'"
        );

        Joiner joiner = Joiner.on("; ")
                                .skipNulls();

        System.out.println(joiner.join(args));
    }
}