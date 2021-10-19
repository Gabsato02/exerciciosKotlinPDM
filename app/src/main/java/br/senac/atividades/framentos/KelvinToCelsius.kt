package br.senac.atividades.framentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.senac.atividades.R
import br.senac.atividades.databinding.FragmentFahrenheitToKelvinBinding
import br.senac.atividades.databinding.FragmentKelvinToCelsiusBinding

class KelvinToCelsius : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentKelvinToCelsiusBinding.inflate(inflater, container, false)

        binding.buttonCelsius.setOnClickListener {
            if (!binding.editKelvin.text.isNullOrEmpty()) {
                val kelvin = binding.editKelvin.text.toString()
                val result = ((kelvin.toInt() - 273.15))

                binding.resultCelsius.text = "Resultado: $result"
            }
        }

        return binding.root
    }
}