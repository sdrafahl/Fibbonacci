package com.regnum.shane.fibbonacciapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.math.BigInteger;
import android.support.v7.app.AppCompatActivity;
import android.R;
import com.jirbo.adcolony.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.math.BigInteger;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdColonyVideoAd ad = new AdColonyVideoAd("vz895e3b2e21af4bd0af");
        ad.show();
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calc();
            }
        });

    }


    public void calc(){
        EditText text = (EditText) findViewById(R.id.lim);
        String val = text.getText().toString();
        int d = Integer.parseInt(val);
        BigInteger a= new BigInteger("1");

        BigInteger b = new BigInteger ("1");

        BigInteger c = new BigInteger("2");

        if(d==0){
            EditText text1 = (EditText) findViewById(R.id.editText3);
            text1.isInEditMode();
            text1.setText("1");
            return;
        }
        if(d==1){
            EditText text1 = (EditText) findViewById(R.id.editText3);
            text1.isInEditMode();
            text1.setText("1\n1");
            return;
        }
        if(d==2){
            EditText text1 = (EditText) findViewById(R.id.editText3);
            text1.isInEditMode();
            text1.setText("1\n1\n2");
            return;
        }
        EditText text1 = (EditText) findViewById(R.id.editText3);
        text1.isInEditMode();
        text1.setText("1\n1\n2");
        for(int q=3;q<d;q++){
            a=b;
            b=c;
            c = new BigInteger(a.add(b).toString());
            text1.setText(text1.getText()+"\n"+c);
        }

    }


}
