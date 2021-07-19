package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldVolumeUpUnderMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int actual = radio.volumeUp();

        assertEquals (100, actual);

    }
    @Test
    public void shouldVolumeUpMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int actual = radio.volumeUp();

        assertEquals (100, actual);

    }
    @Test
    public void shouldVolumeUpOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int actual = radio.volumeUp();

        assertEquals (100, actual);

    }

    @Test
    public void shouldVolumeDowUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int actual = radio.volumeDown();

        assertEquals (0, actual);
    }
    @Test
    public void shouldVolumeDowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int actual = radio.volumeDown();

        assertEquals (0, actual);
    }

    @Test
    public void shouldVolumeDowOverMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int actual = radio.volumeDown();

        assertEquals (0, actual);
    }
    //Тесты для переключения радиостанций
    @Test
    public void shouldNextStationUnderMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        int actual = radio.changeNextRadioStation();

        assertEquals (9, actual);

    }
    @Test
    public void shouldNextStationMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        int actual = radio.changeNextRadioStation();

        assertEquals (0, actual);

    }

    @Test
    public void shouldNextStationOverMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        int actual = radio.getCurrentRadioStation();

        assertEquals (0, actual);

    }

    @Test
    public void shouldPrevStationUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        int actual = radio.changePrevRadioStation();

        assertEquals (0, actual);
    }
    @Test
    public void shouldPrevStationMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        int actual = radio.changePrevRadioStation();

        assertEquals (10, actual);
    }

    @Test
    public void shouldPrevStationOverMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int actual = radio.changePrevRadioStation();

        assertEquals (10, actual);
    }
}