package br.senac.atividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.inflate
import br.senac.atividades.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        // Criando o Binding
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Vinculando as atividades aos botões
        binding.btnList1Activity1.setOnClickListener {
            val intent = Intent(this, Lista1Exercicio1::class.java)
            startActivity(intent)
        }

        binding.btnList1Activity2.setOnClickListener {
            val intent = Intent(this, Lista1Exercicio2::class.java)
            startActivity(intent)
        }

        binding.btnList1Activity3.setOnClickListener {
            val intent = Intent(this, Lista1Exercicio3::class.java)
            startActivity(intent)
        }

        binding.btnList1Activity4.setOnClickListener {
            val intent = Intent(this, Lista1Exercicio4::class.java)
            startActivity(intent)
        }

        binding.btnList1Activity5.setOnClickListener {
            val intent = Intent(this, Lista1Exercicio5::class.java)
            startActivity(intent)
        }
    }
}