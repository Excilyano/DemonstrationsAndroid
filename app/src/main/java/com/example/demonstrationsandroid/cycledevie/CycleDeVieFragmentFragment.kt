package com.example.demonstrationsandroid.cycledevie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.demonstrationsandroid.R
import com.example.demonstrationsandroid.databinding.FragmentCycleDeVieFragmentBinding

class CycleDeVieFragmentFragment : Fragment() {

    lateinit var viewmodel : CompteurViewModel
    lateinit var binding : FragmentCycleDeVieFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_cycle_de_vie_fragment,
            container,
            false)

        viewmodel = ViewModelProvider(this).get(CompteurViewModel::class.java)
        binding.vm = viewmodel

        // binding.tvIncrement.text = savedInstanceState?.getString("compteur")?:"0"

        binding.btnPlusUn.setOnClickListener {
            viewmodel.increment()
            binding.vm = viewmodel
        }

        return binding.root
    }

    /*
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("compteur", binding.tvIncrement.text.toString())
    }
    */
}