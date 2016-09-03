package com.example.asheransari.colawars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    //    public void voteCoke(View v)
//    {
//
//        TextView t1 = (TextView)findViewById(R.id.txtcoke);
//        int coca = Integer.valueOf(t1.getText().toString());
//        coca = coca+1;
//        t1.setText(coca);
//    }
//    public void votePepsi(View v)
//    {
//        int pepsi=0;
//        TextView t1 = (TextView)findViewById(R.id.txtpepsi);
//        pepsi = Integer.valueOf(t1.getText().toString());
//        pepsi=pepsi+1;
//        t1.setText(pepsi);
//    }
//
//    public void showVotes(View v)
//    {
//        String msg = null;
//        String coca=null, pepsi=null;
//        TextView t1 = (TextView)findViewById(R.id.txtcoke);
//        TextView t2 = (TextView)findViewById(R.id.txtpepsi);
//
//        msg = "Cocacola vs Pepsi\n"+t1.getText() + "VS"+ t2.getText()+"";
//        TextView t3 = (TextView)findViewById(R.id.result);
//        t3.setText(msg);
//    }

}
