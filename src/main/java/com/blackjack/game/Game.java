package com.blackjack.game;

import com.blackjack.model.Deck;
import com.blackjack.model.Hand;

public class Game {
    private Deck deck;
    private Hand playerHand;
    private Hand dealerHand;

    public Game() {
        deck = new Deck();
        deck.shuffle();
        playerHand = new Hand();
        dealerHand = new Hand();
    }

    public void startGame() {
        playerHand.addCard(deck.drawCard());
        dealerHand.addCard(deck.drawCard());
        playerHand.addCard(deck.drawCard());
        dealerHand.addCard(deck.drawCard());
    }

    // Геттеры для просмотра состояния игры (понадобятся позже)
    public Hand getPlayerHand() { return playerHand; }
    public Hand getDealerHand() { return dealerHand; }
}