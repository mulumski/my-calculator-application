package com.example.midmorningsimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //Instantiate the User Interface elements
    lateinit var mAns: TextView
    lateinit var mFNUm: EditText
    lateinit var mSNum: EditText
    lateinit var mAdd: Button
    lateinit var mSub: Button
    lateinit var mDiv: Button
    lateinit var mMul: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAns = findViewById(R.id.mTvAns)
        mFNUm = findViewById(R.id.mEdtFirstNo)
        mSNum = findViewById(R.id.mEdtSNum)
        mAdd = findViewById(R.id.mBtnAdd)
        mSub = findViewById(R.id.mBtnSub)
        mDiv = findViewById(R.id.mBtDiv)
        mMul = findViewById(R.id.mBtnMul)

        mAdd.setOnClickListener {
            var FirstNumber = mFNUm.text.toString().trim()
            var SecondNumber = mSNum.text.toString().trim()
            if (FirstNumber.isEmpty() || SecondNumber.isEmpty()) {
                mAns.text = "Please enter valid numbers"
            } else {
                //proceed to compute numbers
                var jibu = FirstNumber.toDouble() + SecondNumber.toDouble()
                //display ans on textview answer
                mAns.text = jibu.toString()
            }
        }
        mSub.setOnClickListener {
            var FirstNumber = mFNUm.text.toString().trim()
            var SecondNumber = mSNum.text.toString().trim()
            if (FirstNumber.isEmpty() || SecondNumber.isEmpty()) {
                mAns.text = "Please enter valid numbers"
            } else {
                //proceed to compute numbers
                var jibu = FirstNumber.toDouble() - SecondNumber.toDouble()
                //display ans on textview answer
                mAns.text = jibu.toString()

            }
            mDiv.setOnClickListener {
                var FirstNumber = mFNUm.text.toString().trim()
                var SecondNumber = mSNum.text.toString().trim()
                if (FirstNumber.isEmpty() || SecondNumber.isEmpty()) {
                    mAns.text = "Please enter valid numbers"
                } else {
                    //proceed to compute numbers
                    var jibu = FirstNumber.toDouble() / SecondNumber.toDouble()
                    //display ans on textview answer
                    mAns.text = jibu.toString()

                }
                mMul.setOnClickListener {
                    var FirstNumber = mFNUm.text.toString().trim()
                    var SecondNumber = mSNum.text.toString().trim()
                    if (FirstNumber.isEmpty() || SecondNumber.isEmpty()) {
                        mAns.text = "Please enter valid numbers"
                    } else {
                        //proceed to compute numbers
                        var jibu = FirstNumber.toDouble() * SecondNumber.toDouble()
                        //display ans on textview answer
                        mAns.text = jibu.toString()

                    }


                }
            }
        }
    }
}