package com.example.myauthorblog

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ArticleAuthorAdapter (itemView: View) : RecyclerView.ViewHolder(itemView) {
    val authorName: TextView = itemView.findViewById(R.id.)
        val articlePreview: TextView = itemView.findViewById(R.id.autorPreview)
        val articlesPostUrl: ImageView= itemView.findViewById(R.id.articlePhoto)
        val articleTitle: TextView = itemView.findViewById(R.id.articleTitle)
        val publishingDate: TextView = itemView.findViewById(R.id.publishingDate)
        val authorProfilePic: ImageView = itemView.findViewById(R.id.authorProfilePhoto)
        val viewFullPostButton: Button= itemView.findViewById(R.id.viewFullPostButton)

}

