package br.senac.atividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.atividades.databinding.ActivityLista1Exercicio1Binding

class Lista1Exercicio1 : AppCompatActivity() {
    private lateinit var binding: ActivityLista1Exercicio1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLista1Exercicio1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.l1ex1ContactPrefButton.setOnClickListener {
            // Verificando quais preferências de contato foram selecionadas
            val contactPreferences: MutableList<String> = ArrayList()
            if (binding.l1ex1CheckPhone.isChecked) contactPreferences.add("Telefone")
            if (binding.l1ex1CheckEmail.isChecked) contactPreferences.add("E-mail")
            if (binding.l1ex1CheckWhatsapp.isChecked) contactPreferences.add("WhatsApp")

            // Ao clique do botão, montar a mensagem a ser exibida
            var message = """Nome: ${binding.l1ex1InputName.text}
                |Telefone: ${binding.l1ex1InputPhone.text}
                |E-mail: ${binding.l1ex1InputEmail.text}
                |WhatsApp: ${binding.l1ex1InputWhatsapp.text}
                |
                |Preferências de contato: $contactPreferences
            """.trimMargin()

            alert("Informações inseridas", message, this)
        }
    }
}