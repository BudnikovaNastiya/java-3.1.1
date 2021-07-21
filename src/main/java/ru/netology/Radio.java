package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentRadioStation;
    private int radioStationNumber = 10;
    private int minRadioStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int maxRadioStation = radioStationNumber - 1;


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