package in.singh_nidhi.awesomequotes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import in.singh_nidhi.adapters.Customadapter;
import in.singh_nidhi.awesomequotes.model.QuoteArray;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      RecyclerView rv = (RecyclerView) findViewById(R.id.recyclerview);

        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new Customadapter(new QuoteArray().quotesList));

    }
}
