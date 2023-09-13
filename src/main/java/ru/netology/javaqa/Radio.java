package ru.netology.javaqa;

public class Radio {

    private int currentStation;
    private int currentVolume;
    public void next() {
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 9) {
            currentStation--;
        } else {
            currentStation = 0;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        this.currentVolume = currentVolume;
    }

}
