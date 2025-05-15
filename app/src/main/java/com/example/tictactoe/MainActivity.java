package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9;
    boolean isXTap;
    int moveCount = 0;
    boolean isSuccess ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        isXTap= true;
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        tv7 = findViewById(R.id.tv7);
        tv8 = findViewById(R.id.tv8);
        tv9 = findViewById(R.id.tv9);


        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(!tv1.getText().toString().equals("") && !tv4.getText().toString().equals("") && !tv7.getText().toString().equals("") || !tv1.getText().toString().equals("") && !tv2.getText().toString().equals("") && !tv3.getText().toString().equals("") || !tv1.getText().toString().equals("") &&  !tv5.getText().toString().equals("") && !tv9.getText().toString().equals("") ){
                    if(tv1.getText().toString().equals(tv4.getText().toString()) && tv1.getText().toString().equals(tv7.getText().toString())  || tv1.getText().toString().equals(tv2.getText().toString()) && tv1.getText().toString().equals(tv3.getText().toString()) || tv1.getText().toString().equals(tv5.getText().toString()) && tv1.getText().toString().equals(tv9.getText().toString()) ){
                        Toast.makeText(MainActivity.this, tv1.getText().toString()+" is Winner", Toast.LENGTH_SHORT).show();
                        clearText();
                    }

                }
                else {
                    moveCount++;
                    if(isXTap){

                        tv1.setText("X");
                        tv1.setEnabled(false);
                        if(!tv1.getText().toString().equals("") && !tv4.getText().toString().equals("") && !tv7.getText().toString().equals("") || !tv1.getText().toString().equals("") && !tv2.getText().toString().equals("") && !tv3.getText().toString().equals("") || !tv1.getText().toString().equals("") &&  !tv5.getText().toString().equals("") && !tv9.getText().toString().equals("") ){
                            if(tv1.getText().toString().equals(tv4.getText().toString()) && tv1.getText().toString().equals(tv7.getText().toString())  || tv1.getText().toString().equals(tv2.getText().toString()) && tv1.getText().toString().equals(tv3.getText().toString()) || tv1.getText().toString().equals(tv5.getText().toString()) && tv1.getText().toString().equals(tv9.getText().toString()) ){
                                Toast.makeText(MainActivity.this, tv1.getText().toString()+" is Winner", Toast.LENGTH_SHORT).show();
                                clearText();
                            }

                        }
                        isXTap = false;
                    }
                    else {
                        isXTap = true;

                        tv1.setText("0");
                        tv1.setEnabled(false);

                        if(!tv1.getText().toString().equals("") && !tv4.getText().toString().equals("") && !tv7.getText().toString().equals("") || !tv1.getText().toString().equals("") && !tv2.getText().toString().equals("") && !tv3.getText().toString().equals("") || !tv1.getText().toString().equals("") &&  !tv5.getText().toString().equals("") && !tv9.getText().toString().equals("") ){
                            if(tv1.getText().toString().equals(tv4.getText().toString()) && tv1.getText().toString().equals(tv7.getText().toString())  || tv1.getText().toString().equals(tv2.getText().toString()) && tv1.getText().toString().equals(tv3.getText().toString()) || tv1.getText().toString().equals(tv5.getText().toString()) && tv1.getText().toString().equals(tv9.getText().toString()) ){
                                Toast.makeText(MainActivity.this, tv1.getText().toString()+" is Winner", Toast.LENGTH_SHORT).show();
                                clearText();
                            }

                        }
                    }
                }

                if(moveCount == 9){
                    clearText();
                    Toast.makeText(MainActivity.this, "Draw Match", Toast.LENGTH_SHORT).show();
                }


            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv2.getText().toString().equals("") && !tv5.getText().toString().equals("") && !tv8.getText().toString().equals("") || !tv1.getText().toString().equals("") && !tv2.getText().toString().equals("") && !tv3.getText().toString().equals("")  ) {

                    if (tv2.getText().toString().equals(tv5.getText().toString()) && tv2.getText().toString().equals(tv8.getText().toString()) || tv2.getText().toString().equals(tv1.getText().toString()) && tv2.getText().toString().equals(tv3.getText().toString())) {
                        Toast.makeText(MainActivity.this, tv2.getText().toString() + " is Winner", Toast.LENGTH_SHORT).show();
                        clearText();
                    }
                }
                else {
                    moveCount++;
                    if(isXTap){
                        tv2.setText("X");
                        tv2.setEnabled(false);

                        if(!tv2.getText().toString().equals("") && !tv5.getText().toString().equals("") && !tv8.getText().toString().equals("") || !tv1.getText().toString().equals("") && !tv2.getText().toString().equals("") && !tv3.getText().toString().equals("")  ) {

                            if (tv2.getText().toString().equals(tv5.getText().toString()) && tv2.getText().toString().equals(tv8.getText().toString()) || tv2.getText().toString().equals(tv1.getText().toString()) && tv2.getText().toString().equals(tv3.getText().toString())) {
                                Toast.makeText(MainActivity.this, tv2.getText().toString() + " is Winner", Toast.LENGTH_SHORT).show();
                                clearText();
                            }
                        }
                        isXTap = false;
                    }
                    else {
                        isXTap = true;

                        tv2.setText("0");
                        tv2.setEnabled(false);

                        if(!tv2.getText().toString().equals("") && !tv5.getText().toString().equals("") && !tv8.getText().toString().equals("") || !tv1.getText().toString().equals("") && !tv2.getText().toString().equals("") && !tv3.getText().toString().equals("")  ) {

                            if (tv2.getText().toString().equals(tv5.getText().toString()) && tv2.getText().toString().equals(tv8.getText().toString()) || tv2.getText().toString().equals(tv1.getText().toString()) && tv2.getText().toString().equals(tv3.getText().toString())) {
                                Toast.makeText(MainActivity.this, tv2.getText().toString() + " is Winner", Toast.LENGTH_SHORT).show();
                                clearText();
                            }
                        }
                    }
                }
                if(moveCount == 9){
                    clearText();
                    Toast.makeText(MainActivity.this, "Draw Match", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!tv3.getText().toString().equals("") && !tv5.getText().toString().equals("") && !tv7.getText().toString().equals("") || !tv1.getText().toString().equals("") && !tv2.getText().toString().equals("") && !tv3.getText().toString().equals("") || !tv3.getText().toString().equals("") && !tv6.getText().toString().equals("") && !tv9.getText().toString().equals("") ) {

                    if (tv3.getText().toString().equals(tv6.getText().toString()) && tv6.getText().toString().equals(tv9.getText().toString()) || tv1.getText().toString().equals(tv2.getText().toString()) && tv2.getText().toString().equals(tv3.getText().toString()) || tv3.getText().toString().equals(tv5.getText().toString()) && tv3.getText().toString().equals(tv7.getText().toString())) {
                        Toast.makeText(MainActivity.this, tv3.getText().toString() + " is Winner", Toast.LENGTH_SHORT).show();
                    clearText();
                    }
                }
                else {
                    moveCount++;
                    if(isXTap){
                        tv3.setText("X");
                        tv3.setEnabled(false);

                        if(!tv3.getText().toString().equals("") && !tv5.getText().toString().equals("") && !tv7.getText().toString().equals("") || !tv1.getText().toString().equals("") && !tv2.getText().toString().equals("") && !tv3.getText().toString().equals("") || !tv3.getText().toString().equals("") && !tv6.getText().toString().equals("") && !tv9.getText().toString().equals("") ) {

                            if (tv3.getText().toString().equals(tv6.getText().toString()) && tv6.getText().toString().equals(tv9.getText().toString()) || tv1.getText().toString().equals(tv2.getText().toString()) && tv2.getText().toString().equals(tv3.getText().toString()) || tv3.getText().toString().equals(tv5.getText().toString()) && tv3.getText().toString().equals(tv7.getText().toString())) {
                                Toast.makeText(MainActivity.this, tv3.getText().toString() + " is Winner", Toast.LENGTH_SHORT).show();
                                clearText();
                            }
                        }
                        isXTap = false;
                    }
                    else {
                        isXTap = true;

                        tv3.setText("0");
                        tv3.setEnabled(false);

                        if(!tv3.getText().toString().equals("") && !tv5.getText().toString().equals("") && !tv7.getText().toString().equals("") || !tv1.getText().toString().equals("") && !tv2.getText().toString().equals("") && !tv3.getText().toString().equals("") || !tv3.getText().toString().equals("") && !tv6.getText().toString().equals("") && !tv9.getText().toString().equals("") ) {

                            if (tv3.getText().toString().equals(tv6.getText().toString()) && tv6.getText().toString().equals(tv9.getText().toString()) || tv1.getText().toString().equals(tv2.getText().toString()) && tv2.getText().toString().equals(tv3.getText().toString()) || tv3.getText().toString().equals(tv5.getText().toString()) && tv3.getText().toString().equals(tv7.getText().toString())) {
                                Toast.makeText(MainActivity.this, tv3.getText().toString() + " is Winner", Toast.LENGTH_SHORT).show();
                                clearText();
                            }
                        }
                    }
                }
                if(moveCount == 9){
                    clearText();
                    Toast.makeText(MainActivity.this, "Draw Match", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv4.getText().toString().equals("") && !tv1.getText().toString().equals("") && !tv7.getText().toString().equals("") || !tv4.getText().toString().equals("") && !tv5.getText().toString().equals("") && !tv6.getText().toString().equals("")  ) {

                    if (tv6.getText().toString().equals(tv4.getText().toString()) && tv4.getText().toString().equals(tv5.getText().toString()) || tv4.getText().toString().equals(tv1.getText().toString()) && tv4.getText().toString().equals(tv7.getText().toString())) {
                        Toast.makeText(MainActivity.this, tv4.getText().toString() + " is Winner", Toast.LENGTH_SHORT).show();
                        clearText();
                    }
                }
                else {
                    moveCount++;
                    if(isXTap){
                        tv4.setText("X");
                        tv4.setEnabled(false);

                        if(!tv4.getText().toString().equals("") && !tv1.getText().toString().equals("") && !tv7.getText().toString().equals("") || !tv4.getText().toString().equals("") && !tv5.getText().toString().equals("") && !tv6.getText().toString().equals("")  ) {

                            if (tv6.getText().toString().equals(tv4.getText().toString()) && tv4.getText().toString().equals(tv5.getText().toString()) || tv4.getText().toString().equals(tv1.getText().toString()) && tv4.getText().toString().equals(tv7.getText().toString())) {
                                Toast.makeText(MainActivity.this, tv4.getText().toString() + " is Winner", Toast.LENGTH_SHORT).show();
                                clearText();
                            }
                        }
                        isXTap = false;
                    }
                    else {
                        isXTap = true;

                        tv4.setText("0");
                        tv4.setEnabled(false);

                        if(!tv4.getText().toString().equals("") && !tv1.getText().toString().equals("") && !tv7.getText().toString().equals("") || !tv4.getText().toString().equals("") && !tv5.getText().toString().equals("") && !tv6.getText().toString().equals("")  ) {

                            if (tv6.getText().toString().equals(tv4.getText().toString()) && tv4.getText().toString().equals(tv5.getText().toString()) || tv4.getText().toString().equals(tv1.getText().toString()) && tv4.getText().toString().equals(tv7.getText().toString())) {
                                Toast.makeText(MainActivity.this, tv4.getText().toString() + " is Winner", Toast.LENGTH_SHORT).show();
                                clearText();
                            }
                        }
                    }
                }
                if(moveCount == 9){
                    clearText();
                    Toast.makeText(MainActivity.this, "Draw Match", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv5.getText().toString().equals("") && !tv1.getText().toString().equals("") && !tv9.getText().toString().equals("") || !tv4.getText().toString().equals("") && !tv5.getText().toString().equals("") && !tv6.getText().toString().equals("") || !tv5.getText().toString().equals("") && !tv3.getText().toString().equals("") && !tv7.getText().toString().equals("") || !tv5.getText().toString().equals("") && !tv2.getText().toString().equals("") && !tv8.getText().toString().equals("") ) {

                    if (tv6.getText().toString().equals(tv4.getText().toString()) && tv4.getText().toString().equals(tv5.getText().toString()) || tv4.getText().toString().equals(tv1.getText().toString()) && tv4.getText().toString().equals(tv7.getText().toString()) || tv5.getText().toString().equals(tv1.getText().toString()) && tv5.getText().toString().equals(tv9.getText().toString()) || tv5.getText().toString().equals(tv3.getText().toString()) && tv5.getText().toString().equals(tv7.getText().toString())) {
                        Toast.makeText(MainActivity.this, tv5.getText().toString() + " is Winner", Toast.LENGTH_SHORT).show();
                        clearText();
                    }
                }
                else {
                    moveCount++;
                    if(isXTap){
                        tv5.setText("X");
                        tv5.setEnabled(false);

                        if(!tv5.getText().toString().equals("") && !tv1.getText().toString().equals("") && !tv9.getText().toString().equals("") || !tv4.getText().toString().equals("") && !tv5.getText().toString().equals("") && !tv6.getText().toString().equals("") || !tv5.getText().toString().equals("") && !tv3.getText().toString().equals("") && !tv7.getText().toString().equals("") || !tv5.getText().toString().equals("") && !tv2.getText().toString().equals("") && !tv8.getText().toString().equals("") ) {

                            if (tv6.getText().toString().equals(tv4.getText().toString()) && tv4.getText().toString().equals(tv5.getText().toString()) || tv4.getText().toString().equals(tv1.getText().toString()) && tv4.getText().toString().equals(tv7.getText().toString()) || tv5.getText().toString().equals(tv1.getText().toString()) && tv5.getText().toString().equals(tv9.getText().toString()) || tv5.getText().toString().equals(tv3.getText().toString()) && tv5.getText().toString().equals(tv7.getText().toString())) {
                                Toast.makeText(MainActivity.this, tv5.getText().toString() + " is Winner", Toast.LENGTH_SHORT).show();
                                clearText();
                            }
                        }
                        isXTap = false;
                    }
                    else {
                        isXTap = true;

                        tv5.setText("0");
                        tv5.setEnabled(false);

                        if(!tv5.getText().toString().equals("") && !tv1.getText().toString().equals("") && !tv9.getText().toString().equals("") || !tv4.getText().toString().equals("") && !tv5.getText().toString().equals("") && !tv6.getText().toString().equals("") || !tv5.getText().toString().equals("") && !tv3.getText().toString().equals("") && !tv7.getText().toString().equals("") || !tv5.getText().toString().equals("") && !tv2.getText().toString().equals("") && !tv8.getText().toString().equals("") ) {

                            if (tv6.getText().toString().equals(tv4.getText().toString()) && tv4.getText().toString().equals(tv5.getText().toString()) || tv4.getText().toString().equals(tv1.getText().toString()) && tv4.getText().toString().equals(tv7.getText().toString()) || tv5.getText().toString().equals(tv1.getText().toString()) && tv5.getText().toString().equals(tv9.getText().toString()) || tv5.getText().toString().equals(tv3.getText().toString()) && tv5.getText().toString().equals(tv7.getText().toString())) {
                                Toast.makeText(MainActivity.this, tv5.getText().toString() + " is Winner", Toast.LENGTH_SHORT).show();
                                clearText();                           
                            }
                        }
                    }
                }
                if(moveCount == 9){
                    clearText();
                    Toast.makeText(MainActivity.this, "Draw Match", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv6.getText().toString().equals("") && !tv3.getText().toString().equals("") && !tv9.getText().toString().equals("") || !tv4.getText().toString().equals("") && !tv5.getText().toString().equals("") && !tv6.getText().toString().equals("")  ) {

                    if (tv6.getText().toString().equals(tv4.getText().toString()) && tv4.getText().toString().equals(tv5.getText().toString()) || tv6.getText().toString().equals(tv3.getText().toString()) && tv6.getText().toString().equals(tv9.getText().toString())) {
                        Toast.makeText(MainActivity.this, tv6.getText().toString() + " is Winner", Toast.LENGTH_SHORT).show();
                        clearText();
                    }
                }
                else {
                    moveCount++;
                    if(isXTap){
                        tv6.setText("X");
                        tv6.setEnabled(false);

                        if(!tv6.getText().toString().equals("") && !tv3.getText().toString().equals("") && !tv9.getText().toString().equals("") || !tv4.getText().toString().equals("") && !tv5.getText().toString().equals("") && !tv6.getText().toString().equals("")  ) {

                            if (tv6.getText().toString().equals(tv4.getText().toString()) && tv4.getText().toString().equals(tv5.getText().toString()) || tv6.getText().toString().equals(tv3.getText().toString()) && tv6.getText().toString().equals(tv9.getText().toString())) {
                                Toast.makeText(MainActivity.this, tv6.getText().toString() + " is Winner", Toast.LENGTH_SHORT).show();
                                clearText();
                            }
                        }
                        isXTap = false;
                    }
                    else {
                        isXTap = true;

                        tv6.setText("0");
                        tv6.setEnabled(false);

                        if(!tv6.getText().toString().equals("") && !tv3.getText().toString().equals("") && !tv9.getText().toString().equals("") || !tv4.getText().toString().equals("") && !tv5.getText().toString().equals("") && !tv6.getText().toString().equals("")  ) {

                            if (tv6.getText().toString().equals(tv4.getText().toString()) && tv4.getText().toString().equals(tv5.getText().toString()) || tv6.getText().toString().equals(tv3.getText().toString()) && tv6.getText().toString().equals(tv9.getText().toString())) {
                                Toast.makeText(MainActivity.this, tv6.getText().toString() + " is Winner", Toast.LENGTH_SHORT).show();
                                clearText();
                            }
                        }
                    }
                }
                if(moveCount == 9){
                    clearText();
                    Toast.makeText(MainActivity.this, "Draw Match", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv7.getText().toString().equals("") && !tv4.getText().toString().equals("") && !tv1.getText().toString().equals("") || !tv7.getText().toString().equals("") && !tv5.getText().toString().equals("") && !tv3.getText().toString().equals("") || !tv7.getText().toString().equals("") && !tv8.getText().toString().equals("") && !tv9.getText().toString().equals("")   ) {

                    if (tv7.getText().toString().equals(tv8.getText().toString()) && tv7.getText().toString().equals(tv9.getText().toString()) || tv7.getText().toString().equals(tv1.getText().toString()) && tv7.getText().toString().equals(tv4.getText().toString()) || tv7.getText().toString().equals(tv5.getText().toString()) && tv7.getText().toString().equals(tv3.getText().toString())) {
                        Toast.makeText(MainActivity.this, tv7.getText().toString() + " is Winner", Toast.LENGTH_SHORT).show();
                        clearText();
                    }
                }
                else {
                    moveCount++;
                    if(isXTap){
                        tv7.setText("X");
                        tv7.setEnabled(false);

                        if(!tv7.getText().toString().equals("") && !tv4.getText().toString().equals("") && !tv1.getText().toString().equals("") || !tv7.getText().toString().equals("") && !tv5.getText().toString().equals("") && !tv3.getText().toString().equals("") || !tv7.getText().toString().equals("") && !tv8.getText().toString().equals("") && !tv9.getText().toString().equals("")   ) {

                            if (tv7.getText().toString().equals(tv8.getText().toString()) && tv7.getText().toString().equals(tv9.getText().toString()) || tv7.getText().toString().equals(tv1.getText().toString()) && tv7.getText().toString().equals(tv4.getText().toString()) || tv7.getText().toString().equals(tv5.getText().toString()) && tv7.getText().toString().equals(tv3.getText().toString())) {
                                Toast.makeText(MainActivity.this, tv7.getText().toString() + " is Winner", Toast.LENGTH_SHORT).show();
                                clearText();
                            }
                        }
                        isXTap = false;
                    }
                    else {
                        isXTap = true;

                        tv7.setText("0");
                        tv7.setEnabled(false);

                        if(!tv7.getText().toString().equals("") && !tv4.getText().toString().equals("") && !tv1.getText().toString().equals("") || !tv7.getText().toString().equals("") && !tv5.getText().toString().equals("") && !tv3.getText().toString().equals("") || !tv7.getText().toString().equals("") && !tv8.getText().toString().equals("") && !tv9.getText().toString().equals("")   ) {

                            if (tv7.getText().toString().equals(tv8.getText().toString()) && tv7.getText().toString().equals(tv9.getText().toString()) || tv7.getText().toString().equals(tv1.getText().toString()) && tv7.getText().toString().equals(tv4.getText().toString()) || tv7.getText().toString().equals(tv5.getText().toString()) && tv7.getText().toString().equals(tv3.getText().toString())) {
                                Toast.makeText(MainActivity.this, tv7.getText().toString() + " is Winner", Toast.LENGTH_SHORT).show();
                                clearText();
                            }
                        }
                    }
                }
                if(moveCount == 9){
                    clearText();
                    Toast.makeText(MainActivity.this, "Draw Match", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv8.getText().toString().equals("") && !tv5.getText().toString().equals("") && !tv2.getText().toString().equals("") || !tv7.getText().toString().equals("") && !tv8.getText().toString().equals("") && !tv9.getText().toString().equals("")   ) {

                    if (tv9.getText().toString().equals(tv8.getText().toString()) && tv8.getText().toString().equals(tv7.getText().toString()) || tv8.getText().toString().equals(tv5.getText().toString()) && tv8.getText().toString().equals(tv2.getText().toString())) {
                        Toast.makeText(MainActivity.this, tv8.getText().toString() + " is Winner", Toast.LENGTH_SHORT).show();
                        clearText();
                    }
                }
                else {
                    moveCount++;
                    if(isXTap){
                        tv8.setText("X");
                        tv8.setEnabled(false);

                        if(!tv8.getText().toString().equals("") && !tv5.getText().toString().equals("") && !tv2.getText().toString().equals("") || !tv7.getText().toString().equals("") && !tv8.getText().toString().equals("") && !tv9.getText().toString().equals("")   ) {

                            if (tv9.getText().toString().equals(tv8.getText().toString()) && tv8.getText().toString().equals(tv7.getText().toString()) || tv8.getText().toString().equals(tv5.getText().toString()) && tv8.getText().toString().equals(tv2.getText().toString())) {
                                Toast.makeText(MainActivity.this, tv8.getText().toString() + " is Winner", Toast.LENGTH_SHORT).show();
                                clearText();
                            }
                        }
                        isXTap = false;
                    }
                    else {
                        isXTap = true;

                        tv8.setText("0");
                        tv8.setEnabled(false);

                        if(!tv8.getText().toString().equals("") && !tv5.getText().toString().equals("") && !tv2.getText().toString().equals("") || !tv7.getText().toString().equals("") && !tv8.getText().toString().equals("") && !tv9.getText().toString().equals("")   ) {

                            if (tv9.getText().toString().equals(tv8.getText().toString()) && tv8.getText().toString().equals(tv7.getText().toString()) || tv8.getText().toString().equals(tv5.getText().toString()) && tv8.getText().toString().equals(tv2.getText().toString())) {
                                Toast.makeText(MainActivity.this, tv8.getText().toString() + " is Winner", Toast.LENGTH_SHORT).show();
                                clearText();
                            }
                        }
                    }
                }
                if(moveCount == 9){
                    clearText();
                    Toast.makeText(MainActivity.this, "Draw Match", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tv9.getText().toString().equals("") && !tv5.getText().toString().equals("") && !tv1.getText().toString().equals("") || !tv7.getText().toString().equals("") && !tv8.getText().toString().equals("") && !tv9.getText().toString().equals("") || !tv9.getText().toString().equals("") && !tv6.getText().toString().equals("") && !tv3.getText().toString().equals("")   ) {

                    if (tv9.getText().toString().equals(tv8.getText().toString()) && tv8.getText().toString().equals(tv7.getText().toString()) || tv9.getText().toString().equals(tv6.getText().toString()) && tv9.getText().toString().equals(tv3.getText().toString()) || tv9.getText().toString().equals(tv5.getText().toString()) && tv9.getText().toString().equals(tv1.getText().toString())) {
                        Toast.makeText(MainActivity.this, tv9.getText().toString() + " is Winner", Toast.LENGTH_SHORT).show();
                        clearText();
                    }
                }
                else {
                    moveCount++;
                    if(isXTap){
                        tv9.setText("X");
                        tv9.setEnabled(false);

                        if(!tv9.getText().toString().equals("") && !tv5.getText().toString().equals("") && !tv1.getText().toString().equals("") || !tv7.getText().toString().equals("") && !tv8.getText().toString().equals("") && !tv9.getText().toString().equals("") || !tv9.getText().toString().equals("") && !tv6.getText().toString().equals("") && !tv3.getText().toString().equals("")   ) {

                            if (tv9.getText().toString().equals(tv8.getText().toString()) && tv8.getText().toString().equals(tv7.getText().toString()) || tv9.getText().toString().equals(tv6.getText().toString()) && tv9.getText().toString().equals(tv3.getText().toString()) || tv9.getText().toString().equals(tv5.getText().toString()) && tv9.getText().toString().equals(tv1.getText().toString())) {
                                Toast.makeText(MainActivity.this, tv9.getText().toString() + " is Winner", Toast.LENGTH_SHORT).show();
                                clearText();
                            }
                        }
                        isXTap = false;
                    }
                    else {
                        isXTap = true;

                        tv9.setText("0");
                        tv9.setEnabled(false);

                        if(!tv9.getText().toString().equals("") && !tv5.getText().toString().equals("") && !tv1.getText().toString().equals("") || !tv7.getText().toString().equals("") && !tv8.getText().toString().equals("") && !tv9.getText().toString().equals("") || !tv9.getText().toString().equals("") && !tv6.getText().toString().equals("") && !tv3.getText().toString().equals("")   ) {

                            if (tv9.getText().toString().equals(tv8.getText().toString()) && tv8.getText().toString().equals(tv7.getText().toString()) || tv9.getText().toString().equals(tv6.getText().toString()) && tv9.getText().toString().equals(tv3.getText().toString()) || tv9.getText().toString().equals(tv5.getText().toString()) && tv9.getText().toString().equals(tv1.getText().toString())) {
                                Toast.makeText(MainActivity.this, tv9.getText().toString() + " is Winner", Toast.LENGTH_SHORT).show();
                                clearText();
                                
                            }
                        }
                    }
                }
                if(moveCount == 9){
                    clearText();
                    Toast.makeText(MainActivity.this, "Draw Match", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
    public void clearText(){
        tv1.setText("");
        tv2.setText("");
        tv3.setText("");
        tv4.setText("");
        tv5.setText("");
        tv6.setText("");
        tv7.setText("");
        tv8.setText("");
        tv9.setText("");
        isXTap = false;
        tv1.setEnabled(true);
        tv2.setEnabled(true);
        tv3.setEnabled(true);
        tv4.setEnabled(true);
        tv5.setEnabled(true);
        tv6.setEnabled(true);
        tv7.setEnabled(true);
        tv8.setEnabled(true);
        tv9.setEnabled(true);
        moveCount=0;
    }
}