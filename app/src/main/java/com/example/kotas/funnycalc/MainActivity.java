package com.example.kotas.funnycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {

    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnDot, btnResult, btnPlus, btnMinus, btnMultiply, btnDivide, btnDel;
    TextView tvResult, tvExpession;
    String strExpression, strTempNum, strValueOne, strValueTwo;
    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;
    Integer lengthOfFirstValue;
    float mValueOne , mValueTwo ;


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


        strExpression="";





    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.btnOne:
                strTempNum = "1";
                strExpression += strTempNum;
                tvExpession.setText(strExpression);
                break;
            case R.id.btnTwo:
                strTempNum = "2";
                strExpression += strTempNum;
                tvExpession.setText(strExpression);
                break;
            case R.id.btnThree:
                strTempNum = "3";
                strExpression += strTempNum;
                tvExpession.setText(strExpression);
                break;
            case R.id.btnFour:
                strTempNum = "4";
                strExpression += strTempNum;
                tvExpession.setText(strExpression);
                break;
            case R.id.btnFive:
                strTempNum = "5";
                strExpression += strTempNum;
                tvExpession.setText(strExpression);
                break;
            case R.id.btnSix:
                strTempNum = "6";
                strExpression += strTempNum;
                tvExpession.setText(strExpression);
                break;
            case R.id.btnSeven:
                strTempNum = "7";
                strExpression += strTempNum;
                tvExpession.setText(strExpression);
                break;
            case R.id.btnEight:
                strTempNum = "8";
                strExpression += strTempNum;
                tvExpession.setText(strExpression);
                break;
            case R.id.btnNine:
                strTempNum = "9";
                strExpression += strTempNum;
                tvExpession.setText(strExpression);
                break;
            case R.id.btnZero:
                strTempNum = "0";
                strExpression += strTempNum;
                tvExpession.setText(strExpression);
                break;
            case R.id.btnDot:
                strTempNum = ".";
                strExpression += strTempNum;
                tvExpession.setText(strExpression);
                break;
            case R.id.btnDelete:
                strTempNum = "";
                strExpression = strExpression.substring(0, strExpression.length() - 1);
                strExpression += strTempNum;
                tvExpession.setText(strExpression);
                break;

            case R.id.btnPlus:

                if (tvExpession == null) {
                    tvExpession.setText("");
                } else {
                    mValueOne = Float.parseFloat(tvExpession.getText() + "");
                    mAddition = true;
                    tvResult.setText(mValueOne + "");
                    strExpression = "";
                    tvExpession.setText(strExpression);
                }
                break;

            case R.id.btnMinus:
                if (tvExpession == null) {
                    tvExpession.setText("");
                } else {
                    mValueOne = Float.parseFloat(tvExpession.getText() + "");
                    mSubtract = true;
                    tvResult.setText(mValueOne + "");
                    strExpression = "";
                    tvExpession.setText(strExpression);
                }
                break;

            case R.id.btnDivide:
                if (tvExpession == null) {
                    tvExpession.setText("");
                } else {
                    mValueOne = Float.parseFloat(tvExpession.getText() + "");
                    mDivision = true;
                    tvResult.setText(mValueOne + "");
                    strExpression = "";
                    tvExpession.setText(strExpression);
                }
                break;
            case R.id.btnMultiply:
                if (tvExpession == null) {
                    tvExpession.setText("");
                } else {
                    mValueOne = Float.parseFloat(tvExpession.getText() + "");
                    mMultiplication = true;
                    tvResult.setText(mValueOne + "");
                    strExpression = "";
                    tvExpession.setText(strExpression);
                }
                break;

            case R.id.btnResult:

                mValueTwo = Float.parseFloat(tvExpession.getText() + "");

                if (mAddition == true) {

                    tvResult.setText(mValueOne + mValueTwo + "");
                    mAddition = false;
                }


                if (mSubtract == true) {
                    tvResult.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (mMultiplication == true) {
                    tvResult.setText(mValueOne * mValueTwo + "");
                    mMultiplication = false;
                }

                if ((mDivision == true) & (mValueTwo != 0)) {

                    tvResult.setText(mValueOne / mValueTwo + "");
                    mDivision = false;
                    break;


                } else {
                    tvResult.setText("ERROR!!! Division by Zero!" );
                    mDivision = false;
                    break;
                }


        }
    }

    @Override
    public boolean onLongClick(View v) {
        switch (v.getId()) {
            case R.id.btnDelete:
                strExpression = "";
                tvExpession.setText("0");

        }
        return false;
    }
}
