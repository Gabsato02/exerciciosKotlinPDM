package br.senac.atividades

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.atividades.databinding.ActivityLista1Exercicio8Binding
import androidx.browser.customtabs.CustomTabsIntent

class Lista1Exercicio8 : AppCompatActivity() {
    private lateinit var binding: ActivityLista1Exercicio8Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLista1Exercicio8Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEx8.setOnClickListener {
            CustomTabsIntent
                .Builder()
                .build()
                .launchUrl(this, Uri.parse(binding.editTextEx8.text.toString()))
        }
    }
}