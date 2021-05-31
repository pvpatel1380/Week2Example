/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carddemo;

/**
 * model class- define card details
 * @author ASUS
 */
public class Card 
{
    private String suit;
    private int value;
    
    public Card(String s, int v)
    {
        this.suit= s;
        this.value = v;
    }
    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
}
