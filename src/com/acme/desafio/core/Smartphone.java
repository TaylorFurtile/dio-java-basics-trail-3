package com.acme.desafio.core;

public abstract class Smartphone {
    protected boolean lights;
    protected boolean mute;
    protected int volumeLevel;
    protected int brightLevel;

    protected Smartphone() {
        lights = false;
        mute = false;
        volumeLevel = 50;
        brightLevel = 50;
    }

    public void turnOn() {
        lights = true;
    }

    public void turnOff() {
        lights = false;
    }

    public void setBright(int volume) {
        if (volume > 100 || volume < 0) return;
        brightLevel = volume;
    }

    public void setVolume(int volume) {
        if (volume > 100 || volume < 0) return;
        volumeLevel = volume;
        mute = volume == 0;
    }

    public abstract void connectToInternet();
}
