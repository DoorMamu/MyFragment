package com.example.myfragment;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
View view;
Button btnToFrag1,btnToFrag2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnToFrag1=findViewById( R.id.buttonToFrag1 );
        btnToFrag2=findViewById( R.id.buttonToFrag2 );
        btnToFrag1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment( new SimpleFrag1());

            }
        } );
        btnToFrag2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment( new SimpleFrag2());

            }
        } );
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm= getFragmentManager();
        FragmentTransaction fragmentTransaction= fm.beginTransaction();
        fragmentTransaction.replace( R.id.frameLayout,fragment );
        fragmentTransaction.commit();

    }
}
