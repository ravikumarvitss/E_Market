package com.market.e_market;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

/**
 * Created by Lenovo on 09-Jun-17.
 */
public class Slashscreen extends Activity {

    Button signin,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.splashscreen);

       signin=(Button)findViewById(R.id.signn);
        signup=(Button)findViewById(R.id.signuu);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inn=new Intent(Slashscreen.this,MainActivity.class);
                startActivity(inn);
            }
        });
    }
}
