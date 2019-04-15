package com.tax_anubhattarai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tvOutput;
    private EditText etSalary;
    private Button btnCalc;
    private float YearlySalary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOutput = findViewById(R.id.tvOutput);
        etSalary = findViewById(R.id.etSalary);
        btnCalc = findViewById(R.id.btnCalc);

        btnCalc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (!isEmpty()) {
            float amount = Float.parseFloat(etSalary.getText().toString());
            Anu_Tax at = new Anu_Tax(amount);
            float totalamt1 = at.totalAmount();
            float totalamt2 = at.totalAmount2();
            float totalamt3 = at.totalAmount3();
            YearlySalary = amount * 12;
            if (YearlySalary <= 200000) {
                tvOutput.setText(Float.toString(totalamt1));
            } else if (YearlySalary > 200000 && YearlySalary <= 350000) {
                tvOutput.setText(Float.toString(totalamt2));
            } else {
                tvOutput.setText(Float.toString(totalamt3));
            }

        }
    }


    public boolean isEmpty() {
        if (TextUtils.isEmpty(etSalary.getText().toString())) {
            etSalary.setError("Please enter your salary");
            etSalary.requestFocus();
            return true;
        } else return false;
    }
}
