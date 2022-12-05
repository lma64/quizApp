package eu.tutorials.quizapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private  val userList : ArrayList<User>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.user_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val sortedList = userList.sortedByDescending { it.Score }
        val currentitem = sortedList[position-1]


        holder.name.text = currentitem.Name
        holder.score.text = currentitem.Score
    }

    override fun getItemCount(): Int {
        return userList.size
    }


    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val  name : TextView = itemView.findViewById(R.id.name1)
        val  score : TextView = itemView.findViewById(R.id.score)
    }
}