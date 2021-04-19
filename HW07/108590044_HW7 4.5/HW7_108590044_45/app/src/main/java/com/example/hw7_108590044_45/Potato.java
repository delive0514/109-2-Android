package com.example.hw7_108590044_45;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.LinkedList;

public class Potato extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    private ImageView image;
    LinkedList<String> mWordList =
            new LinkedList<String>(Arrays.asList(
                    "1. 20 oz (600g) potatoes.",
                    "2. 2 tbsp (about 4g) chives, chopped.",
                    "3. 1/2 tsp (2g) salt.",
                    "4. 2 tbsp (28g) grapeseed oil.",
                    "5. 2 tbsp (28g) unsalted butter.",
                    "6. 2 sea bass fillets - (about 6 oz-a170g each).",
                    "7. Salt and Pepper.",
                    "8. peel from 5 lemons."));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycleview_main);
        image = findViewById(R.id.imageView);
        image.setImageResource(R.drawable.potato_crusted_sea_bass_main1);
        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordListAdapter(this, mWordList);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
