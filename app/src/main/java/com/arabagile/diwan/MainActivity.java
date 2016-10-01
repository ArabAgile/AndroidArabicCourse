package com.arabagile.diwan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ListAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerViewList);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new ListAdapter();

        List<Post> mDataset = new ArrayList<>();

        for (int i=0; i<10; i++) {
            Post dummyPost = new Post();
            dummyPost.setAuthor("Sample author " + i);
            dummyPost.setDate(new Date());
            dummyPost.setAuthorPicture("https://dummyimage.com/70x70/25d9be/ffffff.png&text=" + i);
            dummyPost.setBodyText("Sample Text for this post. It's dummy content " +
                    "with multi lines to show how the post will be visible in the list of " +
                    "items for Diwan app!");
            dummyPost.setComments_count(2);

//            if (mAdapter == null) {
//                Log.d("AG_LOG", "null!");
//            }

            mAdapter.add(dummyPost);
        }

        mAdapter.setOpenDetailsClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPostDetails();
            }
        });

        mRecyclerView.setAdapter(mAdapter);

    }

    public void showPostDetails() {
        Intent myIntent = new Intent(this, DetailsActivity.class);
        startActivity(myIntent);
    }
}
