package br.senac.atividades.framentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.senac.atividades.R
import br.senac.atividades.databinding.FragmentFahrenheitToKelvinBinding

class FahrenheitToKelvin : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFahrenheitToKelvinBinding.inflate(inflater, container, false)

        binding.buttonResultFah.setOnClickListener {
            if (!binding.editFah.text.isNullOrEmpty()) {
                val fahrenheit = binding.editFah.text.toString()
                val result = (((fahrenheit.toInt() + 459.67) * 5 / 9))

                binding.resultKelvin.text = "Resultado: $result"
            }
        }

        return binding.root
    }
}