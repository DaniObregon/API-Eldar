package com.danio.eldar.model;

import javax.persistence.*;

@Entity
@Table(name = "card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(name = "cardNumber")
    private int cardNumber;

    @Column(name = "cardHolder")
    private String cardHolder;

    @Column(name = "taza")
    private double taza;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public double getTaza() {
        return taza;
    }

    public void setTaza(double taza) {
        this.taza = taza;
    }
}
