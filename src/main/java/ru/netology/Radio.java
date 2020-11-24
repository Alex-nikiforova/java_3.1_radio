package ru.netology;

public class Radio {
    private int currentNumberRadioStation;
    private int currentVolume;
    private int maxNumberRadioStation = 9;
    private int minNumberRadioStation = 0;
    private int maxVolume = 10;
    private int minVolume = 0;

    public int getCurrentNumberRadioStation() {
        return currentNumberRadioStation;
    }

    public void setCurrentNumberRadioStation(int currentNumberRadioStation) {
        if (currentNumberRadioStation > maxNumberRadioStation) {
            return;
        }
        if (currentNumberRadioStation < minNumberRadioStation) {
            return;
        }
        this.currentNumberRadioStation = currentNumberRadioStation;
    }

    public int getMaxNumberRadioStation() {
        return maxNumberRadioStation;
    }

    public void setMaxNumberRadioStation(int maxNumberRadioStation) {
        this.maxNumberRadioStation = maxNumberRadioStation;
    }

    public int getMinNumberRadioStation() {
        return minNumberRadioStation;
    }

    public void setMinNumberRadioStation(int minNumberRadioStation) {
        this.minNumberRadioStation = minNumberRadioStation;
    }

    public void nextRadioStation() {
        if (currentNumberRadioStation == maxNumberRadioStation) {
            this.currentNumberRadioStation = minNumberRadioStation;
        } else {
            this.currentNumberRadioStation++;
        }
    }

    public void prevRadioStation() {
        if (currentNumberRadioStation == minNumberRadioStation) {
            this.currentNumberRadioStation = maxNumberRadioStation;
        } else {
            this.currentNumberRadioStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void increaseVolume() {
        if (currentVolume >= maxVolume) {
            return;
        }
        this.currentVolume++;
    }

    public void decreaseVolume() {
        if (currentVolume <= minVolume) {
            return;
        }
        this.currentVolume--;
    }

}
