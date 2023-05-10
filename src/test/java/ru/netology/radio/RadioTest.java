package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
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

    @Test
    public void testStationSelectionConstructorSuperMax() {
        Radio radio = new Radio(100);

        radio.setStationSelection(19);

        int expected = 0;
        int actual = radio.getStationSelection();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationSelectionConstructorMiddle() {
        Radio radio = new Radio(9);

        radio.setStationSelection(6);

        int expected = 6;
        int actual = radio.getStationSelection();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testStationSelectionConstructor() {
        Radio radio = new Radio(9);

        radio.setStationSelection(6);

        int expected = 6;
        int actual = radio.getStationSelection();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeControlSuperMax() {
        Radio radio = new Radio(100);

        radio.setVolumeControl(110);

        int expected = 0;
        int actual = radio.getVolumeControl();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeControlMiddle() {
        Radio radio = new Radio(100);

        radio.setVolumeControl(100);

        int expected = 100;
        int actual = radio.getVolumeControl();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testVolumeControlConstructor() {
        Radio radio = new Radio(100);

        radio.setVolumeControl(10);

        int expected = 10;
        int actual = radio.getVolumeControl();
        Assertions.assertEquals(expected, actual);
    }

}
