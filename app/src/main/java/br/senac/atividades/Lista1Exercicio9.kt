package br.senac.atividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import br.senac.atividades.databinding.ActivityLista1Exercicio9Binding

class Lista1Exercicio9 : AppCompatActivity() {
    private lateinit var binding: ActivityLista1Exercicio9Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLista1Exercicio9Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val lanucher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            if (it.resultCode == RESULT_OK) {
                Toast.makeText(this, it.data?.getStringExtra("result"), Toast.LENGTH_LONG).show()
                binding.editResult.setText(it.data?.getStringExtra("result"))
            }
        }

        binding.buttonCalculate.setOnClickListener {
            if (!binding.value1.text.isNullOrEmpty() && !binding.value2.text.isNullOrEmpty()) {
                val intent = Intent(this, Lista1Exercicio9Detalhe::class.java)
                intent.putExtra("value1", binding.value1.text.toString())
                intent.putExtra("value2", binding.value2.text.toString())
                lanucher.launch(intent)
            }
        }
    }
}