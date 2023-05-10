package ru.netology.radio;

public class Radio {

    private int minStation = 0;
    private int maxStation = 9;
    private int stationSelection = minStation;
    private int minLevelVolume = 0;
    private int maxLevelVolume = 100;
    private int volumeControl = minLevelVolume;

    public Radio(int quantityStation) {

    }

    public Radio() {

    }


    public void nextStation() {
        if (stationSelection != maxStation) {
            stationSelection++;
        } else {
            stationSelection = minStation;
        }
    }

    public void prevStation() {
        if (stationSelection != minStation) {
            stationSelection--;
        } else {
            stationSelection = maxStation;
        }
    }

    public void increaseVolume() {
        if (volumeControl < maxLevelVolume) {
            volumeControl = volumeControl + 1;
        }
    }

    public void reduceVolume() {
        if (volumeControl > minLevelVolume) {
            volumeControl = volumeControl - 1;
        }
    }
    public int getStationSelection() {
        return stationSelection;
    }
    public void setStationSelection(int stationSelection) {
        if (stationSelection < minStation) {
            return;
        }
        if (stationSelection > maxStation) {
            return;
        }
        this.stationSelection = stationSelection;
    }
    public int getVolumeControl() {
        return volumeControl;
    }
    public void setVolumeControl(int volumeControl) {
        if (volumeControl < minLevelVolume) {
            return;
        }
        if (volumeControl > maxLevelVolume) {
            return;
        }
        this.volumeControl = volumeControl;
    }
}
