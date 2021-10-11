package com.tugcearas.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*

            CONTEXT : App içinde neler olduğunu , hangi durumların var olduğunu,... gibi olayların tutulduğu yapı.
             
            1) Activity Context
                this ya da MainActivity.this kullanılır

            2) App Context
                getApplicationContext() kullanılır


            ne zaman hangisi kullanılır ?
                Genel app' i ilgilendiren konularda App Context kullanılır. Diğer durumlarda Activity Context kullanılır.

        */

        // küçük pop-up mesaj oluşturmak için ;
        Toast.makeText(MainActivity.this,"Toast message",Toast.LENGTH_LONG).show();

    }


    public void save(View view){

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Save");
        alert.setMessage("Are you sure?");

        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                // save
                Toast.makeText(MainActivity.this,"Saved",Toast.LENGTH_LONG).show();

            }
        });


        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(MainActivity.this,"Not Saved",Toast.LENGTH_LONG).show();
            }
        });

        alert.show();


    }


}