package com.example.myfragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button activityBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityBtn=findViewById(R.id.button);
        activityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setMessage(activityBtn.getText());
                builder.setTitle("MainActi1");
                builder.setCancelable(true);
                builder.show();
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate( R.menu.menu,menu );
        return super.onCreateOptionsMenu( menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.me_set:
                startActivity( new Intent( Settings.ACTION_SETTINGS ) );
                // Toast.makeText( this, "set clicked", Toast.LENGTH_SHORT ).show();
                // Intent intent=new Intent( SimpleFragment.this,MainActivity2.class );
                // startActivity( intent );
                break;
            case R.id.me_frag:
                Intent intent=new Intent( MainActivity.this,Main2Activity.class);
                startActivity( intent );
                break;
        }
        return super.onOptionsItemSelected( item );
    }

}
