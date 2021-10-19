package br.senac.atividades.framentos

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.senac.atividades.databinding.FragmentCelsiusToFahrenheitBinding

class CelsiusToFahrenheit : Fragment() {
    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentCelsiusToFahrenheitBinding.inflate(inflater, container, false)

        binding.buttonResult.setOnClickListener {
            if (!binding.editCelsius.text.isNullOrEmpty()) {
                val celsius = binding.editCelsius.text.toString()
                val result = ((celsius.toInt() * 9 / 5) + 32)

                binding.viewResult.text = "Resultado: $result"
            }
        }

        return binding.root
    }
}