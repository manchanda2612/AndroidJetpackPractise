package com.neeraj.androidjetpack.diffutil

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.DiffUtil.ItemCallback
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.neeraj.androidjetpack.R

class UserAdapter : ListAdapter<User, UserAdapter.UserViewHolder>(DiffUtilCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_item, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val item = getItem(position)
        holder.initial.text = item.initial
        holder.fullName.text = item.fullName
    }

    class UserViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        val initial = itemView.findViewById<TextView>(R.id.txv_initial)
        val fullName = itemView.findViewById<TextView>(R.id.txv_fullname)

    }

    class DiffUtilCallback : ItemCallback<User>() {

        override fun areItemsTheSame(oldItem: User, newItem: User): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
            return oldItem == newItem
        }

    }

}