package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTestTest {
    RadioTest radio = new RadioTest();

    @Test
    void shouldSwitchStationUpToRound() {
        radio.switchStationUp(); // 0~1
        radio.switchStationUp(); // 1~2
        radio.switchStationUp(); // 2~3
        radio.switchStationUp(); // 3~4
        radio.switchStationUp(); // 4~5
        radio.switchStationUp(); // 5~6
        radio.switchStationUp(); // 6~7
        radio.switchStationUp(); // 7~8
        radio.switchStationUp(); // 8~9
        radio.switchStationUp(); // 9~0
        assertEquals(0, radio.getStation());
    }

    @Test
    void shouldSwitchStationDownToRound() {
        radio.switchStationDown(); // 0~9
        radio.switchStationDown(); // 9~8
        assertEquals(8, radio.getStation());
    }

    @Test
    void shouldSpecifyStationPositive() {
        radio.setStation(5);
        assertEquals(5, radio.getStation());
    }

    @Test
    void shouldSpecifyStationNegative() {
        radio.setStation(50);
        assertEquals(0, radio.getStation());
    }

    @Test
    void shouldSpecifyStationNegative2() {
        radio.setStation(-50);
        assertEquals(0, radio.getStation());
    }

    @Test
    void shouldIncreaseVolume() {
        radio.increaseVolume(); // 3~4
        radio.increaseVolume(); // 4~5
        radio.increaseVolume(); // 5~6
        radio.increaseVolume(); // 6~7
        radio.increaseVolume(); // 7~8
        radio.increaseVolume(); // 8~9
        radio.increaseVolume(); // 9~10
        radio.increaseVolume(); // 10~10
        assertEquals(10, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        radio.decreaseVolume(); // 3~2
        radio.decreaseVolume(); // 2~1
        radio.decreaseVolume(); // 1~0
        radio.decreaseVolume(); // 0~0
        assertEquals(0, radio.getVolume());
    }
}
