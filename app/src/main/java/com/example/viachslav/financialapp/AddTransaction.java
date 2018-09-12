package com.example.viachslav.financialapp;

import android.inputmethodservice.ExtractEditText;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class AddTransaction extends AppCompatActivity {
       TextView tv;
       Switch switch1;
       ExtractEditText DatePlain;
       TextView textView6;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_transaction);
            tv = (TextView) findViewById(R.id.textView);
            switch1 = (Switch)findViewById(R.id.switch1);
        DatePlain = (ExtractEditText)findViewById(R.id.DatePlain);
        //скрываем окно с запланированной датой
        DatePlain.setVisibility(View.GONE);
        //описываем события свитчера
            switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    //проверяем свитчер если он активен, то окно с датой появляется
                    if (isChecked){
                        DatePlain.setVisibility(View.VISIBLE);
                    } else {
                        DatePlain.setVisibility(View.GONE);

                    }
                }
            });


    }

    public void onRadioButtonClicked (View view){
            boolean checked = ((RadioButton)view).isChecked();



    }



}
