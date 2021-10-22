package br.senac.atividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import br.senac.atividades.databinding.ActivityLista2Exercicio4Binding
import br.senac.atividades.framentos.CelsiusToFahrenheit
import br.senac.atividades.framentos.FahrenheitToKelvin
import br.senac.atividades.framentos.KelvinToCelsius

class Lista2Exercicio4 : AppCompatActivity() {
    private lateinit var binding: ActivityLista2Exercicio4Binding
    private lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLista2Exercicio4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Habilitando o suporte a action bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Configurando o toggle e suas strings
        toggle = ActionBarDrawerToggle(this, binding.drawerLayout,
        R.string.open_menu_navigation_view,
        R.string.close_menu_navigation_view)

        // Adicionando listener pra identificar o toggle
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        binding.navigationView.setNavigationItemSelectedListener {
            // Fechando a gaveta após a seleção
            binding.drawerLayout.closeDrawers()

            val frag = when(it.itemId) {
                R.id.menuKelvinToC -> KelvinToCelsius()
                R.id.menuCelsiusToF -> CelsiusToFahrenheit()
                else -> FahrenheitToKelvin()
            }

            supportFragmentManager.beginTransaction().replace(R.id.temperatureContainer, frag).commit()
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return toggle.onOptionsItemSelected(item)
    }
}