package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/StationSelection.csv")
    public void testStationSelection (int expected, int station) {
        Radio radio = new Radio();
        radio.setStationSelection(station);

        int actual = radio.getStationSelection();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1,0",
            "2,1",
            "3,2",
            "5,4",
            "8,7",
            "9,8",
            "0,9"

    })
    public void testButtonNextStationSelection(int expected, int station) {
        Radio radio = new Radio();
        radio.setStationSelection(station);

        radio.nextStation();

        int actual = radio.getStationSelection();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "9,0",
            "0,1",
            "1,2",
            "4,5",
            "8,9",
            "7,8",
            "6,7"
    })
    public void testButtonPrevStationSelection(int expected, int station) {
        Radio radio = new Radio();
        radio.setStationSelection(station);

        radio.prevStation();

        int actual = radio.getStationSelection();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "5,6",
            "0,0",
            "0,1",
            "1,2",
            "9,10",
            "8,9",
            "7,8"
    })
    public void testVolumeControlReduce(int expected, int level) {
        Radio radio = new Radio();
        radio.setVolumeControl(level);

        radio.reduceVolume();

        int actual = radio.getVolumeControl();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "6,5",
            "1,0",
            "2,1",
            "3,2",
            "10,10",
            "10,9",
            "9,8"
    })
    public void testVolumeControlIncrease(int expected, int level) {
        Radio radio = new Radio();
        radio.setVolumeControl(level);

        radio.increaseVolume();

        int actual = radio.getVolumeControl();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,-5",
            "0,0",
            "1,1",
            "2,2",
            "0,15",
            "10,10",
            "9,9",
            "8,8"
    })
    public void testVolumeControl(int expected, int level) {
        Radio radio = new Radio();
        radio.setVolumeControl(level);

        int actual = radio.getVolumeControl();
        Assertions.assertEquals(expected, actual);
    }


}
