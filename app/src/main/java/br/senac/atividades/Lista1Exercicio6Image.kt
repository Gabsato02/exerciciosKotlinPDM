package br.senac.atividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.atividades.databinding.ActivityLista1Exercicio6ImageBinding

class Lista1Exercicio6Image : AppCompatActivity() {
    private lateinit var binding: ActivityLista1Exercicio6ImageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLista1Exercicio6ImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val image = intent.getIntExtra("image", R.drawable.ic_launcher_foreground)

        binding.imageBigger.setImageResource(image)
        binding.imageBigger.tag = image
    }
}