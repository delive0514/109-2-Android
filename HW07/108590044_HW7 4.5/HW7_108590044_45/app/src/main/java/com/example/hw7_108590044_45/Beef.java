package com.example.hw7_108590044_45;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.LinkedList;

public class Beef extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    private ImageView image;
    LinkedList<String> mWordList =
            new LinkedList<String>(Arrays.asList(
                    "1. 2 x 400g beef fillets",
                    "2. Olive oil, for frying",
                    "3. 500g mixture of wild mushrooms, cleaned",
                    "4. 1 thyme sprig, leaves only",
                    "5. 500g puff pastry",
                    "6. 8 slices of Parma ham",
                    "7. 2 egg yolks, beaten with 1 tbsp water and a pinch of salt",
                    "8. Sea salt and freshly ground black pepper"));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycleview_main);
        image = findViewById(R.id.imageView);
        image.setImageResource(R.drawable.mc_beef_wellington_articlelarge);
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
