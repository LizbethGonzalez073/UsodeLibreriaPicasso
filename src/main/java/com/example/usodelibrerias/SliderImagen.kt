package com.example.usodelibrerias
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.google.android.material.imageview.ShapeableImageView

class ImageSliderAdapter(
    private val context: Context, // Contexto de la aplicación
    private val imageUrls: List<String> // Lista de URLs de las imágenes
    ) : RecyclerView.Adapter<ImageSliderAdapter.ViewHolder>() {

    // ViewHolder para cada imagen en el slider
        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ShapeableImageView = view.findViewById(R.id.imageView)
    }

    // Infla el diseño de cada item del slider
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_imagen_slider, parent, false)
        return ViewHolder(view)
    }

    // Carga la imagen en el ImageView usando Picasso
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Picasso.get().load(imageUrls[position]).into(holder.imageView)
    }

    // Retorna el número de imágenes en el slider
    override fun getItemCount(): Int = imageUrls.size
}