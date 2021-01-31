package ru.evgeny.simpleboot.config;

import java.util.Random;

public class NameProvider {

    private final Random random = new Random();
    private final String name = "Name:" + random.nextInt();

    public String getName() {
        return name;
    }

}
