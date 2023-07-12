package com.example.quizapp

object Constants {
    const val USER_NAME: String ="user_name"
    const val TOTAL_QUESTIONS:String ="total_questions"
    const val CORRECT_ANSWERS:String="correct_answers"
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Which country flag ?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Spain",
            "India",
            "China",
            1
        )

        questionsList.add(que1)

        val que2 = Question(
            2,
            "Which country flag ?",
            R.drawable.ic_flag_of_australia,
            "Argentina",
            "Australia",
            "India",
            "China",
            2
        )

        questionsList.add(que2)
        val que3 = Question(
            3,
            "Which country flag ?",
            R.drawable.ic_flag_of_belgium,
            "Argentina",
            "Spain",
            "Belgium",
            "China",
            3
        )

        questionsList.add(que3)
        val que4 = Question(
            4,
            "Which country flag ?",
            R.drawable.ic_flag_of_brazil,
            "Argentina",
            "Spain",
            "India",
            "Brazil",
            4
        )

        questionsList.add(que4)
        val que5 = Question(
            5,
            "Which country flag ?",
            R.drawable.ic_flag_of_denmark,
            "Denmark",
            "Spain",
            "India",
            "China",
            1
        )

        questionsList.add(que5)
        val que6 = Question(
            6,
            "Which country flag ?",
            R.drawable.ic_flag_of_fiji,
            "Argentina",
            "Spain",
            "Fiji",
            "China",
            3
        )

        questionsList.add(que6)
        val que7 = Question(
            7,
            "Which country flag ?",
            R.drawable.ic_flag_of_germany,
            "Argentina",
            "Germany",
            "India",
            "China",
            2
        )

        questionsList.add(que7)
        val que8 = Question(
            8,
            "Which country flag ?",
            R.drawable.ic_flag_of_india,
            "Argentina",
            "Spain",
            "India",
            "China",
            3
        )

        questionsList.add(que8)
        val que9 = Question(
            9,
            "Which country flag ?",
            R.drawable.ic_flag_of_kuwait,
            "Argentina",
            "Kuwait",
            "India",
            "China",
            2
        )

        questionsList.add(que9)

        return questionsList
    }
}