package br.senac.atividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.atividades.databinding.ActivityLista2Exercicio1e3Binding
import com.google.android.material.tabs.TabLayoutMediator

class Lista2Exercicio1e3 : AppCompatActivity() {
    private lateinit var binding: ActivityLista2Exercicio1e3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLista2Exercicio1e3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = TabPageAdapter(this)

        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            when(position) {
                0 -> {
                    tab.text = "Cliente"
                }
                1 -> {
                    tab.text = "Produto"
                }
            }
        }.attach()
    }
}