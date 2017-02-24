package com.natukwasa.asenanth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayActivityMessage extends AppCompatActivity {
    Button b2;
    TextView t1,t2;

    String getnam,getadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        b2=(Button)findViewById(R.id.btt);
        t2=(TextView)findViewById(R.id.textView5);
        t1=(TextView)findViewById(R.id.textView4);

        getnam=getIntent().getExtras().getString("value");
        t2.setText(getnam);

        getadd=getIntent().getExtras().getString("values");
        t1.setText(getadd);
    }
    public void close(View view){
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
        finish();
    }
}
