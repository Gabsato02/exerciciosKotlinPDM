package br.senac.atividades

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.senac.atividades.framentos.*

private const val NUM_PAGES = 3

class TabPageAdapterTemperature(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return NUM_PAGES
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> CelsiusToFahrenheit()
            1 -> FahrenheitToKelvin()
            else -> KelvinToCelsius()
        }
    }

}