package com.example.usodelibrerias
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageUrls = listOf(
            "https://images.app.goo.gl/dijVxFRWMZ8uMsqS6", // Ejemplo de URL válida
            "https://images.app.goo.gl/zFcjwenJjttRcA6P8",
            "https://images.app.goo.gl/T8j4qJmy6Bnq6dT36",
            "https://images.app.goo.gl/iyvYje9ureivsz6Z8",
            "https://images.app.goo.gl/T8j4qJmy6Bnq6dT36",
            "https://images.app.goo.gl/iyvYje9ureivsz6Z8",
        )


        val viewPager: ViewPager2 = findViewById(R.id.imageSlider)
        val adapter = ImageSliderAdapter(this, imageUrls)
        viewPager.adapter = adapter

        // Configurar el botón para abrir la URL
        val btnSitioWeb: Button = findViewById(R.id.btnSitioWeb)
        btnSitioWeb.setOnClickListener {
            val url = "https://www.primevideo.com/-/es/detail/Mi-villano-favorito-4/0KGWRU9CNGPAMPV8AERAH7RW0L"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}