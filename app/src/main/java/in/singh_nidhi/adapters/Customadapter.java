package in.singh_nidhi.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import in.singh_nidhi.awesomequotes.R;
import in.singh_nidhi.awesomequotes.model.Quote;

/**
 * Created by HOME on 15-07-2016.
 */
public class Customadapter extends RecyclerView.Adapter <Customadapter.CustomViewHolder> {
    ArrayList<Quote> quotesList;

    public Customadapter(ArrayList<Quote> quotesList) {

        this.quotesList = quotesList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);

        CustomViewHolder cv = new CustomViewHolder(v);

        return cv;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {

        holder.quoteText.setText(quotesList.get(position).getTitleText());
        holder.authorName.setText(quotesList.get(position).getAuthorName());

    }

    @Override
    public int getItemCount() {
        return quotesList.size();
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView quoteText;
        TextView authorName;

        public CustomViewHolder(View itemView) {
            super(itemView);
            quoteText = (TextView) itemView.findViewById(R.id.quoteText);
            authorName = (TextView) itemView.findViewById(R.id.authorName);

        }
    }

}