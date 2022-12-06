package eu.tutorials.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.*

class Scoreboard : AppCompatActivity() {

    private lateinit var dbref : DatabaseReference
    private lateinit var userRecyclerView: RecyclerView
    private lateinit var userArrayList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scoreboard)

        val backButtonScoreToMain:Button = findViewById(R.id.backScoreToMain)

        backButtonScoreToMain.setOnClickListener {
            val intent = Intent(this@Scoreboard, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        userRecyclerView = findViewById(R.id.userList)
        userRecyclerView.layoutManager = LinearLayoutManager(this)
        userRecyclerView.setHasFixedSize(true)

        userArrayList = arrayListOf<User>()
        getUserData()

            /* val name1Text:TextView = findViewById(R.id.name1)
            val score1Text:TextView = findViewById(R.id.score1)
            val name2Text:TextView = findViewById(R.id.name2)
            val score2Text:TextView = findViewById(R.id.score2)
            val name3Text:TextView = findViewById(R.id.name3)
            val score3Text:TextView = findViewById(R.id.score3)
            val name4Text:TextView = findViewById(R.id.name4)
            val score4Text:TextView = findViewById(R.id.score4)
            val name5Text:TextView = findViewById(R.id.name5)
            val score5Text:TextView = findViewById(R.id.score5)

            val names = arrayOf(listOf("Sunoo",9),listOf("heeseung",8),listOf("sunghoon",7),listOf("jungwon",7),listOf("Niki",6))

            name1Text.text = names[0][0].toString()
            name2Text.text = names[1][0].toString()
            name3Text.text = names[2][0].toString()
            name4Text.text = names[3][0].toString()
            name5Text.text = names[4][0].toString()

            score1Text.text = names[0][1].toString()
            score2Text.text = names[1][1].toString()
            score3Text.text = names[2][1].toString()
            score4Text.text = names[3][1].toString()
            score5Text.text = names[4][1].toString()*/
        }

        private fun getUserData() {
            dbref = FirebaseDatabase.getInstance().getReference("Users")
            dbref.addValueEventListener(object : ValueEventListener{
                override fun onDataChange(snapshot: DataSnapshot) {
                    if (snapshot.exists()) {
                        for(userSnapshot in snapshot.children) {
                            val user = userSnapshot.getValue(User :: class.java)
                            userArrayList.add(user!!)
                        }
                        userRecyclerView.adapter = MyAdapter(userArrayList)
                    }
                }

                override fun onCancelled(error: DatabaseError) {
                }

            })
        }
    }