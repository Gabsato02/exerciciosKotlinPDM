package br.senac.atividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.atividades.databinding.ActivityLista1Exercicio7Binding

class Lista1Exercicio7 : AppCompatActivity() {
    private lateinit var binding: ActivityLista1Exercicio7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLista1Exercicio7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonText.setOnClickListener {
            val intent = Intent(this, Lista1Exercicio7Detalhe::class.java)
            intent.putExtra("text1", binding.editText1.text.toString())
            intent.putExtra("text2", binding.editText2.text.toString())
            startActivity(intent)
        }
    }
}