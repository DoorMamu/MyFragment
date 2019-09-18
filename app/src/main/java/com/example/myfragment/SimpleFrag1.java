package com.example.myfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import android.app.Fragment;

public class SimpleFrag1 extends Fragment {
    View view;
    Button firstbuttonOne;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate( R.layout.simplefrag1, container, false );
        firstbuttonOne = view.findViewById( R.id.fragBtn1);
        firstbuttonOne.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent intent = new Intent( view.getContext(), MainActivity2.class );
                //startActivity( intent );
                Toast.makeText( getActivity(), "Fragment Button", Toast.LENGTH_SHORT ).show();


            }
        } );
        return view;
    }

}
