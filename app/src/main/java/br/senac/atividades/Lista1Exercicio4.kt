package br.senac.atividades

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import br.senac.atividades.databinding.ActivityLista1Exercicio4Binding

class Lista1Exercicio4 : AppCompatActivity() {
    private lateinit var binding: ActivityLista1Exercicio4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLista1Exercicio4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.spinContent.adapter = loadSpinner("contentType")

        binding.spinContent.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, view: View?, position: Int, id: Long) {
                binding.spinGender.adapter = loadSpinner(position.toString())
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }


    private fun loadSpinner(spinner: String): ArrayAdapter<String> {
        val itens = when(spinner) {
            "contentType" -> arrayOf("Música", "Filme", "Livro", "Jogo")
            else -> loadGenders(spinner.toInt())
        }
        val adapter = ArrayAdapter(this, R.layout.simple_spinner_item, itens)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        return adapter
    }

    private fun loadGenders(genderIndex: Int): Array<String> {
         return when(genderIndex) {
            0 -> arrayOf("Hip-Hop", "Soul", "Blues", "Rock'n Roll")
            1 -> arrayOf("Ficção", "Épico", "Fantasia", "Terror")
            2 -> arrayOf("Auto-ajuda", "Contos", "Receitas", "Didáticos")
            else -> arrayOf("FPS", "Hack'n Slash", "RPG", "Corrida")
        }
    }
}