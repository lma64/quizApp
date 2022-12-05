package eu.tutorials.quizapp

import kotlin.random.Random

object Constants {

    // TODO  Create a constant variables which we required in the result screen
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    const val NUM_QUESTIONS: Int = 14
        fun getQuestions(): ArrayList<Question> {
            val questionsList = ArrayList<Question>()

            // 1
            val que1 = Question(
                1, "What country does this flag belong to?",
                R.drawable.ic_flag_of_argentina,
                "Argentina", "Australia",
                "Armenia", "Austria", 1
            )

            questionsList.add(que1)

            // 2
            val que2 = Question(
                2, "What country does this flag belong to?",
                R.drawable.ic_flag_of_australia,
                "Angola", "Austria",
                "Australia", "Armenia", 3
            )

            questionsList.add(que2)

            // 3
            val que3 = Question(
                3, "What country does this flag belong to?",
                R.drawable.ic_flag_of_brazil,
                "Belarus", "Belize",
                "Brunei", "Brazil", 4
            )

            questionsList.add(que3)

            // 4
            val que4 = Question(
                4, "What country does this flag belong to?",
                R.drawable.ic_flag_of_belgium,
                "Bahamas", "Belgium",
                "Barbados", "Belize", 2
            )

            questionsList.add(que4)

            // 5
            val que5 = Question(
                5, "What country does this flag belong to?",
                R.drawable.ic_flag_of_fiji,
                "Gabon", "France",
                "Fiji", "Finland", 3
            )

            questionsList.add(que5)

            // 6
            val que6 = Question(
                6, "What country does this flag belong to?",
                R.drawable.ic_flag_of_germany,
                "Germany", "Georgia",
                "Greece", "none of these", 1
            )

            questionsList.add(que6)

            // 7
            val que7 = Question(
                7, "What country does this flag belong to?",
                R.drawable.ic_flag_of_denmark,
                "Dominica", "Egypt",
                "Denmark", "Ethiopia", 3
            )

            questionsList.add(que7)

            // 8
            val que8 = Question(
                8, "What country does this flag belong to?",
                R.drawable.ic_flag_of_india,
                "Ireland", "Iran",
                "Hungary", "India", 4
            )

            questionsList.add(que8)

            // 9
            val que9 = Question(
                9, "What country does this flag belong to?",
                R.drawable.ic_flag_of_new_zealand,
                "Australia", "New Zealand",
                "Tuvalu", "United States of America", 2
            )

            questionsList.add(que9)

            // 10
            val que10 = Question(
                10, "What country does this flag belong to?",
                R.drawable.ic_flag_of_kuwait,
                "Kuwait", "Jordan",
                "Sudan", "Palestine", 1
            )

            questionsList.add(que10)

            val que11 = Question(
                11, "What country does this flag belong to?",
                R.drawable.ic_flag_of_bahrain,
                "Afghanistan", "Guatemala",
                "Bahrain", "Qatar", 3
            )

            questionsList.add(que11)

            val que12 = Question(
                12, "What country does this flag belong to?",
                R.drawable.ic_flag_of_brazil,
                "Portugal", "Brazil",
                "Kenya", "Liberia", 2
            )

            questionsList.add(que12)

            val que13 = Question(
                13, "What country does this flag belong to?",
                R.drawable.ic_flag_of_canada,
                "Nigeria", "Canada",
                "Oman", "Panama", 2
            )

            questionsList.add(que13)

            val que14 = Question(
                14, "What country does this flag belong to?",
                R.drawable.ic_flag_of_check_republic,
                "Indonesia", "Greece",
                "Czech Republic", "Hungary", 3
            )

            questionsList.add(que14)

            val que15 = Question(
                15, "What country does this flag belong to?",
                R.drawable.ic_flag_of_china,
                "Senegal", "Jordan",
                "Romania", "China", 4
            )

            questionsList.add(que15)

            val que16 = Question(
                16, "What country does this flag belong to?",
                R.drawable.ic_flag_of_cyprus,
                "Argentina", "Ireland",
                "Honduras", "Cyprus", 4
            )

            questionsList.add(que16)

            val que17 = Question(
                17, "What country does this flag belong to?",
                R.drawable.ic_flag_of_england,
                "England", "Kazakhstan",
                "Haiti", "Ecuador", 1
            )

            questionsList.add(que17)

            val que18 = Question(
                18, "What country does this flag belong to?",
                R.drawable.ic_flag_of_france,
                "France", "Italy",
                "Congo", "Colombia", 1
            )

            questionsList.add(que18)

            val que19 = Question(
                19, "What country does this flag belong to?",
                R.drawable.ic_flag_of_iran,
                "Egypt", "Iran",
                "Djibouti", "Hungary", 2
            )

            questionsList.add(que19)

            val que20 = Question(
                20, "What country does this flag belong to?",
                R.drawable.ic_flag_of_iraq,
                "Iraq", "Cambodia",
                "Comoros", "El Salvador", 1
            )

            questionsList.add(que20)

            val que21 = Question(
                21, "What country does this flag belong to?",
                R.drawable.ic_flag_of_ireland,
                "Ireland", "Japan",
                "Kenya", "Latvia", 1
            )

            questionsList.add(que21)

            val que22 = Question(
                22, "What country does this flag belong to?",
                R.drawable.ic_flag_of_italy,
                "Kiribati", "Lesotho",
                "Italy", "Maldives", 3
            )

            questionsList.add(que22)

            val que23 = Question(
                23, "What country does this flag belong to?",
                R.drawable.ic_flag_of_japan,
                "South Korea", "Nepal",
                "Japan", "Kuwait", 3
            )

            questionsList.add(que23)

            val que24 = Question(
                24, "What country does this flag belong to?",
                R.drawable.ic_flag_of_jordan,
                "Mongolia", "Jordan",
                "Belarus", "Austria", 2
            )

            questionsList.add(que24)

            val que25 = Question(
                25, "What country does this flag belong to?",
                R.drawable.ic_flag_of_libanon,
                "Bulgaria", "Canada",
                "Lebanon", "Cameroon", 3
            )

            questionsList.add(que25)

            val que26 = Question(
                26, "What country does this flag belong to?",
                R.drawable.ic_flag_of_mexico,
                "Costa Rica", "Peru",
                "Cuba", "Mexico", 4
            )

            questionsList.add(que26)

            val que27 = Question(
                27, "What country does this flag belong to?",
                R.drawable.ic_flag_of_morocco,
                "Dominica", "Bolivia",
                "Morocco", "Estonia", 3
            )

            questionsList.add(que27)

            val que28 = Question(
                28, "What country does this flag belong to?",
                R.drawable.ic_flag_of_pakistan,
                "Pakistan", "Finland",
                "Turkey", "Sri Lanka", 1
            )

            questionsList.add(que28)

            val que29 = Question(
                29, "What country does this flag belong to?",
                R.drawable.ic_flag_of_palestine,
                "Kuwait", "United Emirates",
                "Palestine", "Jordan", 3
            )

            questionsList.add(que29)

            val que30 = Question(
                30, "What country does this flag belong to?",
                R.drawable.ic_flag_of_philipine,
                "Finland", "Sweden",
                "Czech Republic", "Philippines", 4
            )

            questionsList.add(que30)

            val que31 = Question(
                31, "What country does this flag belong to?",
                R.drawable.ic_flag_of_portugal,
                "Sudan", "Portugal",
                "Morocco", "Oman", 2
            )

            questionsList.add(que31)

            val que32 = Question(
                32, "What country does this flag belong to?",
                R.drawable.ic_flag_of_saudi_arabia,
                "Iraq", "Qatar",
                "Saudi Arabia", "Kuwait", 3
            )

            questionsList.add(que32)

            val que33 = Question(
                33, "What country does this flag belong to?",
                R.drawable.ic_flag_of_south_korea,
                "South Korea", "North Korea",
                "Japan", "Singapore", 1
            )

            questionsList.add(que33)

            val que34 = Question(
                34, "What country does this flag belong to?",
                R.drawable.ic_flag_of_syria,
                "Kuwait", "Uzbekistan",
                "Syria", "Iraq", 3
            )

            questionsList.add(que34)

            val que35 = Question(
                35, "What country does this flag belong to?",
                R.drawable.ic_flag_of_tunisia,
                "Turkey", "Tunisia",
                "Qatar", "Vanuatu", 2
            )

            questionsList.add(que35)

            val que36 = Question(
                36, "What country does this flag belong to?",
                R.drawable.ic_flag_of_turkey,
                "Turkey", "Tunisia",
                "Qatar", "Vanuatu", 1
            )

            questionsList.add(que36)

            val que37 = Question(
                37, "What country does this flag belong to?",
                R.drawable.ic_flag_of_united_states,
                "Canada", "France",
                "United States", "Finland", 3
            )

            questionsList.add(que37)

            val que38 = Question(
                38, "What country does this flag belong to?",
                R.drawable.ic_flag_of_urugway,
                "San Marino", "Estonia",
                "Rwanda", "Uruguay", 4
            )

            questionsList.add(que38)

            val que39 = Question(
                39, "What country does this flag belong to?",
                R.drawable.ic_flag_of_wales,
                "Wales", "Kazakhstan",
                "RZambia", "Hungary", 1
            )

            questionsList.add(que39)

            val finalQuestionsList = ArrayList<Question>()
            var i = 0
            while (i< NUM_QUESTIONS){
                val randomInt = Random.nextInt(0,questionsList.size)
                if(!finalQuestionsList.contains(questionsList[randomInt])){
                    finalQuestionsList.add(questionsList[randomInt])
                    i += 1
                }
            }

            return finalQuestionsList
        }
}