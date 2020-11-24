package ru.netology;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'current station = 5', 5, 6",
                    "'current station = max station', 9, 0",
                    "'current station = min station', 0, 1"
            }
    )
    public void shouldNextRadioStation(String test, int currentRadioStation, int expectedRadioStation) {
        radio.setCurrentNumberRadioStation(currentRadioStation);
        radio.nextRadioStation();

        assertEquals(expectedRadioStation, radio.getCurrentNumberRadioStation());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'current station = 5', 5, 4",
                    "'current station = max station', 9, 8",
                    "'current station = min station', 0, 9"
            }
    )
    public void shouldPrevRadioStation(String test, int currentRadioStation, int expectedRadioStation) {
        radio.setCurrentNumberRadioStation(currentRadioStation);
        radio.prevRadioStation();

        assertEquals(expectedRadioStation, radio.getCurrentNumberRadioStation());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'current volume = 5', 5, 6",
                    "'current volume = max volume', 10, 10",
                    "'current volume = min volume', 0, 1"
            }
    )
    public void shouldIncreaseVolume(String test, int currentVolume, int expectedVolume) {
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();

        assertEquals(expectedVolume, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'current volume = 5', 5, 4",
                    "'current volume = max volume', 10, 9",
                    "'current volume = min volume', 0, 0"
            }
    )
    public void shouldDecreaseVolume(String test, int currentVolume, int expectedVolume) {
        radio.setCurrentVolume(currentVolume);
        radio.decreaseVolume();

        assertEquals(expectedVolume, radio.getCurrentVolume());
    }
}