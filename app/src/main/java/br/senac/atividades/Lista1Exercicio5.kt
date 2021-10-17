package br.senac.atividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.atividades.databinding.ActivityLista1Exercicio5Binding
import com.fathzer.soft.javaluator.DoubleEvaluator

class Lista1Exercicio5 : AppCompatActivity() {
    private lateinit var binding: ActivityLista1Exercicio5Binding
    var expression = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLista1Exercicio5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        this.handleButtonsBinding()
    }

    private fun validateSignals(): Boolean {
        if (expression.isNullOrEmpty()) return false
        return when(expression.last().toString()) {
            "+" -> false
            "." -> false
            "-" -> false
            "/" -> false
            "*" -> false
            else -> true
        }
    }

    private fun updateExpression() {
        binding.l1ex5textOperation.text = expression
    }

    private fun deleteFromExpression() {
        expression = expression.dropLast(1)
        binding.l1ex5TextResults.text = ""
        updateExpression()
    }

    private fun validateExpression() {
        if (validateSignals()) {
            binding.l1ex5TextResults.text = DoubleEvaluator().evaluate(expression).toString()
        }
    }

    private fun handleButtonsBinding() {
        binding.l1ex5Button1.setOnClickListener {
            expression += "1"
            updateExpression()
        }
        binding.l1ex5Button2.setOnClickListener {
            expression += "2"
            updateExpression()
        }
        binding.l1ex5Button3.setOnClickListener {
            expression += "3"
            updateExpression()
        }
        binding.l1ex5Button4.setOnClickListener {
            expression += "4"
            updateExpression()
        }
        binding.l1ex5Button5.setOnClickListener {
            expression += "5"
            updateExpression()
        }
        binding.l1ex5Button6.setOnClickListener {
            expression += "6"
            updateExpression()
        }
        binding.l1ex5Button7.setOnClickListener {
            expression += "7"
            updateExpression()
        }
        binding.l1ex5Button8.setOnClickListener {
            expression += "8"
            updateExpression()
        }
        binding.l1ex5Button9.setOnClickListener {
            expression += "9"
            updateExpression()
        }
        binding.l1ex5Button0.setOnClickListener {
            expression += "0"
            updateExpression()
        }
        binding.l1ex5ButtonDot.setOnClickListener {
            if (validateSignals()) {
                expression += "."
                updateExpression()
            }
        }
        binding.l1ex5ButtonSum.setOnClickListener {
            if (validateSignals()) {
                expression += "+"
                updateExpression()
            }
        }
        binding.l1ex5ButtonSub.setOnClickListener {
            expression += "-"
            updateExpression()
        }
        binding.l1ex5ButtonMult.setOnClickListener {
            if (validateSignals()) {
                expression += "*"
                updateExpression()
            }
        }
        binding.l1ex5ButtonDiv.setOnClickListener {
            if (validateSignals()) {
                expression += "/"
                updateExpression()
            }
        }
        binding.l1ex5ButtonDel.setOnClickListener { deleteFromExpression() }
        binding.l1ex5ButtonResult.setOnClickListener { validateExpression() }
    }
}