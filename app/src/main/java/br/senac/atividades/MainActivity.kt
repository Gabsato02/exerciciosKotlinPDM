package br.senac.atividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        binding.btnList1Activity6.setOnClickListener {
            val intent = Intent(this, Lista1Exercicio6::class.java)
            startActivity(intent)
        }

        binding.btnList1Activity7.setOnClickListener {
            val intent = Intent(this, Lista1Exercicio7::class.java)
            startActivity(intent)
        }

        binding.btnList1Activity8.setOnClickListener {
            val intent = Intent(this, Lista1Exercicio8::class.java)
            startActivity(intent)
        }

        binding.btnList1Activity9.setOnClickListener {
            val intent = Intent(this, Lista1Exercicio9::class.java)
            startActivity(intent)
        }

        binding.btnList2Activity1e3.setOnClickListener {
            val intent = Intent(this, Lista2Exercicio1e3::class.java)
            startActivity(intent)
        }

        binding.btnList2Activity2.setOnClickListener {
            val intent = Intent(this, Lista2Exercicio2::class.java)
            startActivity(intent)
        }
    }
}