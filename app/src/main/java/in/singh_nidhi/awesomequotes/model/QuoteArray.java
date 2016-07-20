package in.singh_nidhi.awesomequotes.model;

import java.util.ArrayList;

/**
 * Created by HOME on 16-07-2016.
 */
public class QuoteArray {
    public ArrayList<Quote> quotesList = new ArrayList();


    public QuoteArray(){
        quotesList.add(new Quote("Salim Ali", "Ornithology"));
        quotesList.add(new Quote("S.Raman","Number Theory"));
        quotesList.add(new Quote("C V Raman","Raman Effect"));
        quotesList.add(new Quote("H J Bhabha","Indian atomic Energy Program"));
        quotesList.add(new Quote("APJ Abdul Kalam","Indian Missile and Nuclear Program" ));
    }
}
