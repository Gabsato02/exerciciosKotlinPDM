package br.senac.atividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import br.senac.atividades.databinding.ActivityLista2Exercicio5Binding
import br.senac.atividades.framentos.CelsiusToFahrenheit
import br.senac.atividades.framentos.FahrenheitToKelvin
import br.senac.atividades.framentos.KelvinToCelsius

class Lista2Exercicio5 : AppCompatActivity() {
    private lateinit var binding: ActivityLista2Exercicio5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLista2Exercicio5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var frag: Fragment = CelsiusToFahrenheit()

        supportFragmentManager.beginTransaction().replace(R.id.temperatureContainerBottomNav, frag).commit()

        binding.bottomNavigationView.setOnItemSelectedListener {
            frag = when(it.itemId) {
                R.id.toolbarOpenTab -> CelsiusToFahrenheit()
                R.id.bottomKelvinToC -> KelvinToCelsius()
                else -> FahrenheitToKelvin()
            }
            supportFragmentManager.beginTransaction().replace(R.id.temperatureContainerBottomNav, frag).commit()
            true
        }
    }
}