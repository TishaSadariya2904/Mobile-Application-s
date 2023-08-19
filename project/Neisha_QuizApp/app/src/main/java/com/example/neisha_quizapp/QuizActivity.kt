package com.example.neisha_quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Color.parseColor
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz.*

class QuizActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition :Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOptionPosition : Int = 0
    private var mCorrectAnswers: Int = 0
    private var mUserName: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        mUserName = intent.getStringExtra(Constants.USER_NAME)

        mQuestionList = Constants.getQuestions()

        setQuestion()
        que1.setOnClickListener(this)
        que2.setOnClickListener(this)
        que3.setOnClickListener(this)
        que4.setOnClickListener(this)
        submit.setOnClickListener(this)

    }

    private fun setQuestion(){

        val question = mQuestionList!![mCurrentPosition-1]

        defaultOptionsView()

        if(mCurrentPosition == mQuestionList!!.size){
            submit.text = "Complete"
        }else{
            submit.text = "Submit"
        }

        main_progressBar.progress = mCurrentPosition
        showProgress.text = "$mCurrentPosition" + "/" + main_progressBar.max

        main_question.text = question!!.question
        image.setImageResource(question.image)
        que1.text = question.optionOne
        que2.text = question.optionTwo
        que3.text = question.optionThree
        que4.text = question.optionFour

    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        options.add(0,que1)
        options.add(1,que2)
        options.add(2,que3)
        options.add(3,que4)

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.que1 ->{
                selectedOptionView(que1,1)
            }
            R.id.que2 ->{
                selectedOptionView(que2,2)
            }
            R.id.que3 ->{
                selectedOptionView(que3,3)
            }
            R.id.que4 ->{
                selectedOptionView(que4,4)
            }
            R.id.submit ->{
                if(mSelectedOptionPosition == 0){
                    mCurrentPosition ++

                    when{
                        mCurrentPosition <= mQuestionList!!.size ->{
                            setQuestion()
                        }else ->{
                            val intent = Intent(this,ResultActivity::class.java)
                            intent.putExtra(Constants.USER_NAME,mUserName)
                            intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                            intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionList!!.size)
                            startActivity(intent)
                            finish()
                        }
                    }
                }else{
                    val question = mQuestionList?.get(mCurrentPosition -1)
                    if(question!!.correctAnswer != mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                    }else{
                        mCorrectAnswers ++
                    }
                    answerView(question.correctAnswer,R.drawable.correct_option_border_bg)

                    if(mCurrentPosition == mQuestionList!!.size){
                        submit.text = "Complete"
                    }else{
                        submit.text = "Next Question"

                    }
                    mSelectedOptionPosition = 0
                }
            }
        }

    }

    private fun answerView(answer: Int,drawableView: Int){
        when(answer){
            1 ->{
                que1.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            2 ->{
                que2.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            3 ->{
                que3.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            4 ->{
                que4.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.typeface = Typeface.DEFAULT
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg)
    }
}