package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Radio {
    private int currentNumberRadioStation;
    private int currentVolume;
    private int maxNumberRadioStation = 10;
    private int minNumberRadioStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int maxNumberRadioStation) {
        this.maxNumberRadioStation = maxNumberRadioStation;
    }

    public void nextRadioStation() {
        if (currentNumberRadioStation >= maxNumberRadioStation) {
            this.currentNumberRadioStation = minNumberRadioStation;
        } else {
            this.currentNumberRadioStation++;
        }
    }

    public void prevRadioStation() {
        if (currentNumberRadioStation <= minNumberRadioStation) {
            this.currentNumberRadioStation = maxNumberRadioStation;
        } else {
            this.currentNumberRadioStation--;
        }
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
