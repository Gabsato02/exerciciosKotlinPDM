package br.senac.atividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.atividades.databinding.ActivityLista1Exercicio2Binding

class Lista1Exercicio2 : AppCompatActivity() {
    private lateinit var binding: ActivityLista1Exercicio2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLista1Exercicio2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.l1ex2InputPhone.isEnabled = false
        binding.l1ex2InputEmail.isEnabled = false
        binding.l1ex2InputWhatsapp.isEnabled = false
        
        binding.l1ex2CheckPhone.setOnCheckedChangeListener { compoundButton, isChecked ->
            binding.l1ex2InputPhone.isEnabled = isChecked
        }

        binding.l1ex2CheckEmail.setOnCheckedChangeListener { compoundButton, isChecked ->
            binding.l1ex2InputEmail.isEnabled = isChecked
        }

        binding.l1ex2CheckWhatsapp.setOnCheckedChangeListener { compoundButton, isChecked ->
            binding.l1ex2InputWhatsapp.isEnabled = isChecked
        }

        binding.l1ex2ContactPrefButton.setOnClickListener {
            val contactPreferences: MutableList<String> = ArrayList()

            val isPhoneChecked = binding.l1ex2CheckPhone.isChecked
            val isEmailChecked = binding.l1ex2CheckEmail.isChecked
            val isWhatsappChecked = binding.l1ex2CheckWhatsapp.isChecked

            val phoneValue = binding.l1ex2InputPhone.text
            val emailValue = binding.l1ex2InputEmail.text
            val whatsappValue = binding.l1ex2InputWhatsapp.text

            if (isPhoneChecked) contactPreferences.add("Telefone")
            if (isEmailChecked) contactPreferences.add("E-mail")
            if (isWhatsappChecked) contactPreferences.add("WhatsApp")

            var message: String = ""
            if (isPhoneChecked && phoneValue.isNullOrEmpty()) {
                alert("Erro", "Você não informou um telefone!", this)
            } else if (isEmailChecked && emailValue.isNullOrEmpty()) {
                alert("Erro", "Você não informou um e-mail!", this)
            } else if (isWhatsappChecked && whatsappValue.isNullOrEmpty()) {
                alert("Erro", "Você não informou um WhatsApp!", this)
            } else {
                message = """Nome: ${binding.l1ex2InputName.text}
                |Telefone: $phoneValue
                |E-mail: $emailValue
                |WhatsApp: $whatsappValue
                |
                |Preferências de contato: $contactPreferences
            """.trimMargin()

                alert("Informações inseridas", message, this)
            }
        }
    }
}