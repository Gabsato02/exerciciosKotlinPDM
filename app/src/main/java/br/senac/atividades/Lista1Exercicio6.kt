package br.senac.atividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.atividades.databinding.ActivityLista1Exercicio6Binding
import br.senac.atividades.databinding.ActivityLista1Exercicio6ImageBinding

class Lista1Exercicio6 : AppCompatActivity() {
    private lateinit var binding: ActivityLista1Exercicio6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLista1Exercicio6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageGallery1.setOnClickListener {
            showImage(R.drawable.gulian_qorgyle)
        }
        binding.imageGallery2.setOnClickListener {
            showImage(R.drawable.kalathyel_iliathor)
        }
        binding.imageGallery3.setOnClickListener {
            showImage(R.drawable.denis_zhbankov_2)
        }
        binding.imageGallery4.setOnClickListener {
            showImage(R.drawable.estrid_branca)
        }
    }

    private fun showImage(image: Int) {
        val intent = Intent(this, Lista1Exercicio6Image::class.java)
        intent.putExtra("image", image)
        startActivity(intent)
    }
}