package com.example.kotas.funnycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnDot, btnResult, btnPlus, btnMinus, btnMultiply, btnDivide, btnDel;
    TextView tvResult, tvExpession;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = (TextView)findViewById(R.id.tvResult);
        tvExpession = (TextView)findViewById(R.id.tvExpresion);

        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnZero = (Button)findViewById(R.id.btnZero);
        btnDot = (Button)findViewById(R.id.btnDot);
        btnResult = (Button)findViewById(R.id.btnResult);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMultiply = (Button)findViewById(R.id.btnMultiply);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnDel = (Button) findViewById(R.id.btnDelete);


        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnZero.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnResult.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnDel.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {



        switch (v.getId()) {
            case R.id.btnOne:
                tvExpession.setText("1");
                break;
            case R.id.btnTwo:
                tvExpession.setText("2");
                break;
            case R.id.btnThree:
                tvExpession.setText("3");
                break;
            case R.id.btnFour:
                tvExpession.setText("4");
                break;
            case R.id.btnFive:
                tvExpession.setText("5");
                break;
            case R.id.btnSix:
                tvExpession.setText("6");
                break;
            case R.id.btnSeven:
                tvExpession.setText("7");
                break;
            case R.id.btnEight:
                tvExpession.setText("8");
                break;
            case R.id.btnNine:
                tvExpession.setText("9");
                break;
            case R.id.btnZero:
                tvExpession.setText("0");
                break;
            case R.id.btnDelete:
                tvExpession.setText("0");
                break;
            case R.id.btnDot:
                tvExpession.setText(".");
                break;
        }


    }

}
