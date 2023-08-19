package com.example.neisha_quizapp

object Constants{
    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"


    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What Country does this flag belong to?",
            R.drawable.australia,
            "Argentina",
            "Australia",
            "Armenia",
            "India",
            2)

        questionsList.add(que1)

        //2
        val que2 = Question(
            2,
            "What Country does this flag belong to?",
            R.drawable.belgium,
            "Bangladesh",
            "Australia",
            "Belgium",
            "Fiji",
            3)

        questionsList.add(que2)

        //3
        val que3 = Question(
            3,
            "What Country does this flag belong to?",
            R.drawable.bangladesh,
            "Bangladesh",
            "Australia",
            "Armenia",
            "Brazil",
            1)

        questionsList.add(que3)

        //4
        val que4 = Question(
            4,
            "What Country does this flag belong to?",
            R.drawable.brazil,
            "Fiji",
            "Bangladesh",
            "Australia",
            "Brazil",
            4)

        questionsList.add(que4)

        //5
        val que5 = Question(
            5,
            "What Country does this flag belong to?",
            R.drawable.fiji,
            "Brazil",
            "Fiji",
            "Belgium",
            "India",
            2)

        questionsList.add(que5)

        //6
        val que6 = Question(
            6,
            "What Country does this flag belong to?",
            R.drawable.india_flag,
            "India",
            "Australia",
            "Fiji",
            "Armenia",
            1)

        questionsList.add(que6)

        //7
        val que7 = Question(
            7,
            "What Country does this flag belong to?",
            R.drawable.kuwait,
            "Bangladesh",
            "Argentina",
            "Kuwait",
            "Brazil",
            3)

        questionsList.add(que7)

        return questionsList
    }

}