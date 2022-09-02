package com.neeraj.androidjetpack.diffutil

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.neeraj.androidjetpack.R

class DiffUtilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diffutil)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val adapter = UserAdapter()

        val user1 = User(1, "N", "Neeraj")
        val user2 = User(2, "R", "Ravinder")
        val user3 = User(3, "A", "Amit")

        adapter.submitList(listOf(user1, user2, user3))

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter


        Handler(Looper.getMainLooper()).postDelayed(Runnable {

            val user4 = User(4, "J", "Joginder")
            val user5 = User(3, "A", "Amit")
            val user6 = User(5, "R", "Ravi")

            adapter.submitList(listOf(user4, user5, user6))

        },5000)


    }

}