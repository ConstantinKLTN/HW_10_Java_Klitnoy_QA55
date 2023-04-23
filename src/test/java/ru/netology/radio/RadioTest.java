package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

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
    @CsvFileSource(files="src/test/resources/ButtonNext.csv")
    public void testButtonNextStationSelection(int expected, int station) {
        Radio radio = new Radio();
        radio.setStationSelection(station);

        radio.nextStation();

        int actual = radio.getStationSelection();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/ButtonPrev.csv")
    public void testButtonPrevStationSelection(int expected, int station) {
        Radio radio = new Radio();
        radio.setStationSelection(station);

        radio.prevStation();

        int actual = radio.getStationSelection();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/VolumeControlReduce.csv")
    public void testVolumeControlReduce(int expected, int level) {
        Radio radio = new Radio();
        radio.setVolumeControl(level);

        radio.reduceVolume();

        int actual = radio.getVolumeControl();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/VolumeControlIncrease.csv")
    public void testVolumeControlIncrease(int expected, int level) {
        Radio radio = new Radio();
        radio.setVolumeControl(level);

        radio.increaseVolume();

        int actual = radio.getVolumeControl();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/VolumeControl.csv")
    public void testVolumeControl(int expected, int level) {
        Radio radio = new Radio();
        radio.setVolumeControl(level);

        int actual = radio.getVolumeControl();
        Assertions.assertEquals(expected, actual);
    }


}
