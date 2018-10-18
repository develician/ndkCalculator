package com.killi8n.sumwithndk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @BindView(R.id.num1EditText)
    EditText num1EditText;

    @BindView(R.id.num2EditText)
    EditText num2EditText;

    @BindView(R.id.sumButton)
    Button sumButton;

    @BindView(R.id.subButton)
    Button subButton;

    @BindView(R.id.mulButton)
    Button mulButton;

    @BindView(R.id.divButton)
    Button divButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);


        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(num1EditText.getText().toString());
                double num2 = Double.parseDouble(num2EditText.getText().toString());

                Toast.makeText(MainActivity.this, sum(num1, num2) + "", Toast.LENGTH_SHORT).show();
            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(num1EditText.getText().toString());
                double num2 = Double.parseDouble(num2EditText.getText().toString());

                Toast.makeText(MainActivity.this, sub(num1, num2) + "", Toast.LENGTH_SHORT).show();
            }
        });

        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(num1EditText.getText().toString());
                double num2 = Double.parseDouble(num2EditText.getText().toString());

                Toast.makeText(MainActivity.this, mul(num1, num2) + "", Toast.LENGTH_SHORT).show();
            }
        });

        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(num1EditText.getText().toString());
                double num2 = Double.parseDouble(num2EditText.getText().toString());

                Toast.makeText(MainActivity.this, div(num1, num2) + "", Toast.LENGTH_SHORT).show();
            }
        });



    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native double sum(double num1, double num2);
    public native double sub(double num1, double num2);
    public native double mul(double num1, double num2);
    public native double div(double num1, double num2);

}
