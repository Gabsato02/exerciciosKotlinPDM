package br.senac.atividades

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import br.senac.atividades.databinding.ActivityLista1Exercicio3Binding

class Lista1Exercicio3 : AppCompatActivity() {
    private lateinit var binding: ActivityLista1Exercicio3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLista1Exercicio3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.l1ex3SpinEmailType.adapter = loadSpinner("email")
        binding.l1ex3SpinAppType.adapter = loadSpinner("app")

        binding.l1ex3ContactPrefButton.setOnClickListener {
            var message = """Nome: ${binding.l1ex3InputName.text}
                |E-mail (${binding.l1ex3SpinEmailType.selectedItem}): ${binding.l1ex3InputEmail.text}
                |${binding.l1ex3SpinAppType.selectedItem}: ${binding.l1ex3InputApp.text}
            """.trimMargin()

            alert("Informações inseridas", message, this)
        }
    }

    private fun loadSpinner(spinner: String): ArrayAdapter<String> {
        val itens = when(spinner) {
            "email" -> arrayOf("Pessoal", "Profissional", "Outro")
            else -> arrayOf("WhatsApp", "Telegram", "Signal", "Discord", "Teams")
        }
        val adapter = ArrayAdapter(this, R.layout.simple_spinner_item, itens)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        return adapter
    }
}