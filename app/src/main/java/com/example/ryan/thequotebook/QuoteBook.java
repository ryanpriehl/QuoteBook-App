package com.example.ryan.thequotebook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class QuoteBook extends AppCompatActivity {

   private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote_book);

        RelativeLayout touch = (RelativeLayout) findViewById(R.id.touch);
        final TextView quoteText = (TextView) findViewById(R.id.quote);
        final TextView personText = (TextView) findViewById(R.id.person);

        final ArrayList<Quote> quoteList = new ArrayList<>();

        Quote quote1 = new Quote("Cool beans.", "Rod Kimble");
        quoteList.add(quote1);

        Quote quote2 = new Quote("How can mirrors be real if our eyes aren't real?", "Jaden Smith");
        quoteList.add(quote2);

        Quote quote3 = new Quote("That's like me blaming owls for how bad I suck at analogies.", "Britta Perry");
        quoteList.add(quote3);

        Quote quote4 = new Quote("You're more of a fun vampire. You don't suck blood, you just suck.", "Troy Barnes");
        quoteList.add(quote4);

        Quote quote5 = new Quote("I was gonna be the first person in my family to graduate from community college. Everyone else graduated from normal college.", "Troy Barnes");
        quoteList.add(quote5);

        touch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Quote q = quoteList.get(count);
                quoteText.setText(q.getQuote());
                personText.setText(q.getPerson());
                count++;

                if(count > quoteList.size() - 1){
                    count = 0;
                }
            }
        });
    }
}
