package com.danio.eldar.controller;

import com.danio.eldar.model.Card;
import com.danio.eldar.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/tarjeta")
public class CardController {

    @Autowired
    CardService cardService;

    @GetMapping()
    public ArrayList<Card> obtenerTarjetas(){
        return cardService.obtenerTarjetas();
    }

    @PostMapping()
    public Card guardarTatjeta(@RequestBody Card card){
        return this.cardService.guardarTarjeta(card);
    }
}
