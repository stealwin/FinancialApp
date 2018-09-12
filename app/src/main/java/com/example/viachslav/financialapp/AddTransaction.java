package com.example.viachslav.financialapp;

import android.inputmethodservice.ExtractEditText;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class AddTransaction extends AppCompatActivity {
        TextView tv;
        Switch switch1;
        ExtractEditText DatePlain;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_transaction);
        tv = (TextView) findViewById(R.id.textView);
         if (switch1.isChecked()){
             DatePlain.setVisibility(View.VISIBLE);
         } else {
             DatePlain.setVisibility(View.GONE);
         }

    }

    public void onRadioButtonClicked (View view){
            boolean checked = ((RadioButton)view).isChecked();

    }



}
