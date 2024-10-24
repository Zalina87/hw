package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void test() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);

        int expected = 15;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

}