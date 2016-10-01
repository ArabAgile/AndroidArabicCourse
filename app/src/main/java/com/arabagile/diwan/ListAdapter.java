package com.arabagile.diwan;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by trainer on 10/1/16.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private List<Post> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {

        // each data item is just a string in this case
        public TextView tvAuthorName;
        public TextView tvDate;
        public TextView tvBodyText;
        public TextView tvComments;
        public ImageView ivPhoto;


        public ViewHolder(View v) {
            super(v);

            tvAuthorName = (TextView) v.findViewById(R.id.tvAuthorName);
            tvDate       = (TextView) v.findViewById(R.id.tvAuthorName);
            tvBodyText   = (TextView) v.findViewById(R.id.tvAuthorName);
            tvComments   = (TextView) v.findViewById(R.id.tvAuthorName);

            ivPhoto      = (ImageView) v.findViewById(R.id.ivPhoto);

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
//        holder.mTextView.setText(mDataset[position]);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public void add(Post post) {
        mDataset.add(post);
    }


}
