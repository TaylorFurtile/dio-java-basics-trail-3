package com.acme.desafio;

import com.acme.desafio.core.IPhone;
import com.acme.desafio.core.Smartphone;

public class ModelagemIPhoneUML {
    public static void main(String[] args) {
        Smartphone smartphone = new IPhone();

        System.out.println("new smartphone started.");
        System.err.println("IPhone is ready to be used.");
    }
}
