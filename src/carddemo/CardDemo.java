/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carddemo;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class CardDemo {

    /** view class - user interaction
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Card[] deck = new Card[4];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter card details:");
        
        for(int i=0; i<deck.length; i++)
        {
//            Card s1= new Card();
//            deck[i]=s1;
           deck[i]= new Card(sc.next(),sc.nextInt()); 
        }
        
        for(int i=0; i<deck.length; i++)
        {
//            Card s1= new Card();
//            deck[i]=s1;
           //deck[i]= new Card(sc.next(),sc.nextInt()); 
            System.out.println(deck[i].getSuit()+" " + deck[i].getValue());
        }
        System.out.println("hello, how are you?");
             
                
// TODO code application logic here
    }
    
}
