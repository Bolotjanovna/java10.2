package ru.netology.javaqa;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;
    private int maxVolume = 100;
    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != maxStation) {
            currentStation--;
        } else {
            currentStation = 0;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        this.currentVolume = currentVolume;
    }

}
