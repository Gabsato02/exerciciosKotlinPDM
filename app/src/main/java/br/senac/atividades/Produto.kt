package br.senac.atividades

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doOnTextChanged
import br.senac.atividades.databinding.FragmentProdutoBinding
import com.google.android.material.snackbar.Snackbar

class Produto : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentProdutoBinding.inflate(inflater, container, false)

        binding.floatingActionButton.setOnClickListener {
            when {
                binding.editName.text.isNullOrEmpty() -> {
                    binding.editNameInputLayout.error = "Preencha esse campo"
                    binding.editName.requestFocus()
                }
                binding.editType.text.isNullOrEmpty() -> {
                    binding.editTypeInputText.error = "Preencha esse campo"
                    binding.editType.requestFocus()
                }
                binding.editBrand.text.isNullOrEmpty() -> {
                    binding.editBrandInputText.error = "Preencha esse campo"
                    binding.editBrand.requestFocus()
                }
                binding.editPrice.text.isNullOrEmpty() -> {
                    binding.editPriceInputText.error = "Preencha esse campo"
                    binding.editPrice.requestFocus()
                }
                else -> Snackbar.make(it, "Os dados foram salvos", Snackbar.LENGTH_LONG).show()
            }
        }

        binding.editName.doOnTextChanged() { text, start, before, count ->
            binding.editNameInputLayout.isErrorEnabled = false
        }
        binding.editType.doOnTextChanged() { text, start, before, count ->
            binding.editTypeInputText.isErrorEnabled = false
        }
        binding.editBrand.doOnTextChanged() { text, start, before, count ->
            binding.editBrandInputText.isErrorEnabled = false
        }
        binding.editPrice.doOnTextChanged() { text, start, before, count ->
            binding.editPriceInputText.isErrorEnabled = false
        }

        return binding.root

    }
}