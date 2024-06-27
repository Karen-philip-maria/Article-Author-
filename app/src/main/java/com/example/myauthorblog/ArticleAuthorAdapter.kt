package com.akirachix.blogreader

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myauthorblog.Author
import com.example.myauthorblog.R

class ArticleAdapter(val articleList: List<Author>):RecyclerView.Adapter<ArticleViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.author_list_item,parent, false)
        return ArticleViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return articleList.size
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = articleList[position]
        holder.tvAuthor.text=article.authorName
        holder.tvLink.text = article.articlesPhoto
        holder.tvArticleTitle.text = article.articlestitle
        holder.tvDate.text = article.publishingDate
        holder.tvArticlesPreview.text = article.authorPreview
        holder.tvLink.text= article.fullPostUrl
    }


}
class ArticleViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvAuthor:TextView = itemView.findViewById(R.id.rvAuthor)
    var tvArticleTitle:TextView = itemView.findViewById(R.id.articleTitle)
    var tvDate:TextView = itemView.findViewById(R.id.publishingDate)
    var tvArticlesPreview:TextView = itemView.findViewById(R.id.authorPreview)
    var tvLink:TextView = itemView.findViewById(R.id.fullPostUrl)
}



