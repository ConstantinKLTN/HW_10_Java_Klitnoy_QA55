package ru.netology.radio;

public class Radio {
    private int stationSelection;
    private int volumeControl;

    public void nextStation() {
        if (stationSelection != 9) {
            stationSelection++;
        } else {
            stationSelection = 0;
        }
    }

    public void prevStation() {
        if (stationSelection != 0) {
            stationSelection--;
        } else {
            stationSelection = 9;
        }
    }

    public void increaseVolume() {
        if (volumeControl < 10) {
            volumeControl = volumeControl + 1;
        }
    }

    public void reduceVolume() {
        if (volumeControl > 0) {
            volumeControl = volumeControl - 1;
        }
    }
    public int getStationSelection() {
        return stationSelection;
    }
    public void setStationSelection(int stationSelection) {
        if (stationSelection < 0) {
            return;
        }
        if (stationSelection > 9) {
            return;
        }
        this.stationSelection = stationSelection;
    }
    public int getVolumeControl() {
        return volumeControl;
    }
    public void setVolumeControl(int volumeControl) {
        if (volumeControl < 0) {
            return;
        }
        if (volumeControl > 10) {
            return;
        }
        this.volumeControl = volumeControl;
    }
}
