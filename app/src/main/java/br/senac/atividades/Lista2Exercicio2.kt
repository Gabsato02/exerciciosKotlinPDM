package br.senac.atividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.atividades.databinding.ActivityLista2Exercicio2Binding
import com.google.android.material.tabs.TabLayoutMediator

class Lista2Exercicio2 : AppCompatActivity() {
    private lateinit var binding: ActivityLista2Exercicio2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLista2Exercicio2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = TabPageAdapterTemperature(this)

        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            when(position) {
                0 -> {
                    tab.text = "Celsius para Fahrenheit"
                }
                1 -> {
                    tab.text = "Fahrenheit para Kelvin"
                }
                2 -> {
                    tab.text = "Kelvin para Celsius"
                }
            }
        }.attach()
    }
}