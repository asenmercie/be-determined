package com.natukwasa.asenanth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b;
    String nam,addr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
    }
    public void click(View view){
        Intent i=new Intent(this,DisplayActivityMessage.class);

        nam=e1.getText().toString();
        if (nam.length()<5){
            e1.setText("the name should be atleast 5 characters");
        }

        else {
            i.putExtra("value", nam);
        }

        addr=e2.getText().toString();
        i.putExtra("values",addr);


        startActivity(i);
        finish();
    }
}
