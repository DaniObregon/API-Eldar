package com.danio.eldar.service;

import com.danio.eldar.model.Card;
import com.danio.eldar.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CardService {

    @Autowired
    CardRepository cardRepository;

    public ArrayList<Card> obtenerTarjetas(){
        return (ArrayList<Card>) cardRepository.findAll();
    }

    public Card guardarTarjeta(Card card){
        return cardRepository.save(card);
    }
}
