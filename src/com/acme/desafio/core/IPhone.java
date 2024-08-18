package com.acme.desafio.core;

import com.acme.desafio.abstraction.InternetBrowser;
import com.acme.desafio.abstraction.MusicPlayer;
import com.acme.desafio.abstraction.PhoneModel;

public class IPhone 
    extends Smartphone 
    implements MusicPlayer, PhoneModel, InternetBrowser {

    public IPhone() {
        super();
    }

    @Override
    public void viewPage(String url) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'viewPage'");
    }

    @Override
    public void refreshPage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'refreshPage'");
    }

    @Override
    public void addNewTrack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addNewTrack'");
    }

    @Override
    public void call(String number) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'call'");
    }

    @Override
    public void hangIn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hangIn'");
    }

    @Override
    public void startVoiceMail() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'startVoiceMail'");
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'play'");
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pause'");
    }

    @Override
    public void setTrack(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTrack'");
    }

    @Override
    public void connectToInternet() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'connectToInternet'");
    }  
}
