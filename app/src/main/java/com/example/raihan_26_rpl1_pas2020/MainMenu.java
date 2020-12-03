package com.example.raihan_26_rpl1_pas2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.raihan_26_rpl1_pas2020.ListData;
import com.example.raihan_26_rpl1_pas2020.ListDataFavourite;
import com.example.soccerapps.R;

public class MainMenu extends AppCompatActivity {
    CardView menu1;
    CardView menu2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main_menu );
        menu1 = (CardView)findViewById(R.id.menu1);
        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ListData.class));
            }
        });
        menu2 = (CardView)findViewById( R.id.menu2 );
        menu2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( getApplicationContext(), ListDataFavourite.class ) );
            }
        } );
    }
}