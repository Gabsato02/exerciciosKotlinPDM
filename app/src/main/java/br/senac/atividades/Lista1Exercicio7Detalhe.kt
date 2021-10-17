package br.senac.atividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.senac.atividades.databinding.ActivityLista1Exercicio7DetalheBinding
import com.google.android.material.snackbar.Snackbar

class Lista1Exercicio7Detalhe : AppCompatActivity() {
    private lateinit var binding: ActivityLista1Exercicio7DetalheBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLista1Exercicio7DetalheBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fullText = intent.getStringExtra("text1") + " " + intent.getStringExtra("text2")

        Snackbar.make(findViewById(R.id.lista1ex7detalhe), fullText, Snackbar.LENGTH_LONG).show()
    }
}