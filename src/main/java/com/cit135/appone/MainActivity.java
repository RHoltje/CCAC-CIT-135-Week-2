package com.cit135.appone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    //call onSubmitText() when the button is clicked
    public void onSubmitText(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(getText(R.id.editText));

        }

    }
}
