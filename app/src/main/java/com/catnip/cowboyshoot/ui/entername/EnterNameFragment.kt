package com.catnip.cowboyshoot.ui.entername

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.catnip.cowboyshoot.R
import com.catnip.cowboyshoot.databinding.FragmentEnterNameBinding
import com.catnip.cowboyshoot.ui.onboarding.OnFinishNavigateListener
import com.catnip.cowboyshoot.ui.option.OptionActivity

class EnterNameFragment : Fragment(), OnFinishNavigateListener {
    private lateinit var binding: FragmentEnterNameBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentEnterNameBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onFinishNavigate() {
        val name = binding.etName.text.toString().trim()
        if (name.isEmpty()) {
            Toast.makeText(requireContext(), "Please input your name!", Toast.LENGTH_SHORT ).show()
        } else {
            navigateToMenu(name)
        }
    }

    private fun navigateToMenu(name: String){
        Intent(activity, OptionActivity::class.java).also {
            it.putExtra("NAME", name)
            startActivity(it)
        }
    }
}

