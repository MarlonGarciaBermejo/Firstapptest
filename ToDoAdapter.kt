package com.firstapp.app

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ToDoAdapter (
    private val todos: MutableList<ToDo>
    ) : RecyclerView.Adapter<ToDoAdapter.ToDoViewholder>() {
    class ToDoViewholder (itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewholder {
        return ToDoViewholder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_todo,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ToDoViewholder, position: Int) {
        val curToDo = todos[position]
        holder.itemView.apply {


        }
    }

    override fun getItemCount(): Int {
        return todos.size
    }
}
