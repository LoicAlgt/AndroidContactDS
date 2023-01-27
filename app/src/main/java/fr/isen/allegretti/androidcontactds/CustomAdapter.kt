package fr.isen.allegretti.androidcontactds

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView

internal class CustomAdapter(private var itemsList: List<String>) :
    RecyclerView.Adapter<CustomAdapter.MyViewHolder>() {
    internal inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var itemTextView: TextView = view.findViewById(R.id.itemTextView)
    }
    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item, parent, false)
        return MyViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = itemsList[position]
        holder.itemTextView.text = item
    }
    override fun getItemCount(): Int {
        return itemsList.size
    }

    /*override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = listContact[position]
        holder.itemTextView.text = item.name?.first +" "+ item.name?.last
        holder.mailTextView.text = item?.email
        holder.addresTextView.text= item.location?.street?.number.toString() + " " + item.location?.street?.name + " " + item.location?.state + " " + item.location?.city
        holder.itemTextView.setOnClickListener {
            onItemClickListener(item)
        }

        if (item.picture?.large!!.isNotEmpty()) {
            Picasso.get().load(item.picture?.large).into(holder.imageContact)
        }
    }
    fun refreshList(contactFromAPI: ArrayList<Results>){
        listContact = contactFromAPI
        notifyDataSetChanged()
    }*/
}