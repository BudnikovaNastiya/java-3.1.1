package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int maxRadioStation = 10;
    private int minRadioStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
    }
    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }
    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int volumeUp() {
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume + 1;
        } else {
            this.currentVolume = maxVolume;
        }
        return currentVolume;
    }

    public int volumeDown() {
        if (currentVolume > minVolume) {
            this.currentVolume = currentVolume - 1;
        } else {
            this.currentVolume = minVolume;
        }
        return currentVolume;
    }

    // Переключение станций
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int changeNextRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            this.currentRadioStation = currentRadioStation + 1;
        } else {
            this.currentRadioStation = minRadioStation;
        }
        return currentRadioStation;
    }

    public int changePrevRadioStation() {
        if (currentRadioStation > minRadioStation) {
            this.currentRadioStation = currentRadioStation - 1;
        } else {
            this.currentRadioStation = maxRadioStation;
        }
        return currentRadioStation;
    }
}