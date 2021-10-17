package br.senac.atividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.atividades.databinding.ActivityLista1Exercicio9DetalheBinding

class Lista1Exercicio9Detalhe : AppCompatActivity() {
    private lateinit var binding: ActivityLista1Exercicio9DetalheBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLista1Exercicio9DetalheBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val value1 = intent.getStringExtra("value1")
        val value2 = intent.getStringExtra("value2")

        binding.textValue1.text = value1
        binding.textValue2.text = value2

        binding.buttonSum.setOnClickListener {
            sendAnswer((value1!!.toInt() + value2!!.toInt()))
        }

        binding.buttonSub.setOnClickListener {
            sendAnswer((value1!!.toInt() - value2!!.toInt()))
        }

        binding.buttonMult.setOnClickListener {
            sendAnswer((value1!!.toInt() * value2!!.toInt()))
        }

        binding.buttonDiv.setOnClickListener {
            sendAnswer((value1!!.toInt() / value2!!.toInt()))
        }


    }

    private fun sendAnswer(answer: Int) {
        val intentAnswer = Intent()
        intentAnswer.putExtra("result", answer.toString())
        setResult(RESULT_OK, intentAnswer)
        finish()
    }
}