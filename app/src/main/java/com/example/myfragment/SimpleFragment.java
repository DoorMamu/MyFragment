package com.example.myfragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class SimpleFragment extends Fragment {
View view;
Button firstButton;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //inflate layout for this fragment
        view=inflater.inflate(R.layout.fragment_simple,container,false);

        //get the ref of button
        firstButton=view.findViewById(R.id.firstButton);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(),Main2Activity.class);
                startActivity(intent);
                Toast.makeText(view.getContext(), "Enter Lesson", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
