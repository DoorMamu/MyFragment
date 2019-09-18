package com.example.myfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.app.Fragment;

public class SimpleFrag2 extends Fragment {
    View view;
    Button btnFrag2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //inflate layout for the frag
        view=inflater.inflate(R.layout.simplefrag2,container,false);
        //get the ref button
        btnFrag2 = view.findViewById( R.id.fragBtn2 );
        btnFrag2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent( view.getContext(), MainActivity2.class );
                //startActivity( intent );
                Toast.makeText( getActivity(), "Fragment Second's", Toast.LENGTH_SHORT ).show();
        }
    });
        return view;
    }
}