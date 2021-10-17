package br.senac.atividades

import android.R
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doOnTextChanged
import br.senac.atividades.databinding.FragmentClienteBinding
import com.google.android.material.snackbar.Snackbar

class Cliente : Fragment() {
    lateinit var binding: FragmentClienteBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentClienteBinding.inflate(inflater, container, false)

        binding.floatingActionButton.setOnClickListener {
            when {
                binding.editNameClient.text.isNullOrEmpty() -> {
                    binding.editNameClientInputLayout.error = "Preencha esse campo"
                    binding.editNameClient.requestFocus()
                }
                binding.editGender.text.isNullOrEmpty() -> {
                    binding.editGenderInputLayout.error = "Preencha esse campo"
                    binding.editGender.requestFocus()
                }
                binding.editStatus.text.isNullOrEmpty() -> {
                    binding.editStatusInputLayout.error = "Preencha esse campo"
                    binding.editStatus.requestFocus()
                }
                binding.editDate.text.isNullOrEmpty() -> {
                    binding.editDateInputLayout.error = "Preencha esse campo"
                    binding.editDate.requestFocus()
                }
                else -> Snackbar.make(it, "Os dados foram salvos", Snackbar.LENGTH_LONG).show()
            }
        }

        binding.editNameClient.doOnTextChanged() { text, start, before, count ->
            binding.editNameClientInputLayout.isErrorEnabled = false
        }
        binding.editGender.doOnTextChanged() { text, start, before, count ->
            binding.editGenderInputLayout.isErrorEnabled = false
        }
        binding.editStatus.doOnTextChanged() { text, start, before, count ->
            binding.editStatusInputLayout.isErrorEnabled = false
        }
        binding.editDate.doOnTextChanged() { text, start, before, count ->
            binding.editDateInputLayout.isErrorEnabled = false
        }

        return binding.root
    }
}