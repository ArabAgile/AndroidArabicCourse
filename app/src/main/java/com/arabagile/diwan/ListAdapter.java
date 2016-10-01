package com.arabagile.diwan;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.value;

/**
 * Created by trainer on 10/1/16.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private List<Post> mDataset;

    View.OnClickListener openDetailsClickListener;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {

        // each data item is just a string in this case
        public CardView cardViewList;
        public TextView tvAuthorName;
        public TextView tvDate;
        public TextView tvBodyText;
        public TextView tvComments;
        public ImageView ivPhoto;


        public ViewHolder(View v) {
            super(v);

            tvAuthorName = (TextView) v.findViewById(R.id.tvAuthorName);
            tvDate       = (TextView) v.findViewById(R.id.tvDate);
            tvBodyText   = (TextView) v.findViewById(R.id.tvBodyText);
            tvComments   = (TextView) v.findViewById(R.id.tvComments);

            ivPhoto      = (ImageView) v.findViewById(R.id.ivPhoto);

            cardViewList = (CardView) v.findViewById(R.id.cardViewList);

        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public ListAdapter() {
        mDataset = new ArrayList<>();
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public ListAdapter(List<Post> dataset) {
        mDataset = dataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        final Post post = mDataset.get(position);

        holder.tvAuthorName.setText(post.getAuthor());
        holder.tvDate.setText(post.getDate().toString());
        holder.tvBodyText.setText(post.getBodyText());

        holder.cardViewList.setOnClickListener(openDetailsClickListener);

        // TODO: set photo

    }


    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public void add(Post post) {
        mDataset.add(post);
    }

    public View.OnClickListener getOpenDetailsClickListener() {
        return openDetailsClickListener;
    }

    public void setOpenDetailsClickListener(View.OnClickListener openDetailsClickListener) {
        this.openDetailsClickListener = openDetailsClickListener;
    }
}
