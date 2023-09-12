package ru.netology.javaqa;

public class Radio {
    public void next() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
    }

    public void prev() {
        if (currentStation < 9) {
            currentStation = currentStation - 1;
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

   private int currentStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        this.currentVolume = currentVolume;
    }

    private int currentVolume;
}
