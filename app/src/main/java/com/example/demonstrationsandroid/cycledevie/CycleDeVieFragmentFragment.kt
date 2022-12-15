package com.example.demonstrationsandroid.cycledevie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.demonstrationsandroid.R
import com.example.demonstrationsandroid.databinding.FragmentCycleDeVieFragmentBinding

class CycleDeVieFragmentFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentCycleDeVieFragmentBinding>(
            inflater,
            R.layout.fragment_cycle_de_vie_fragment,
            container,
            false)

        binding.btnPlusUn.setOnClickListener {
            binding.tvIncrement.text = (binding.tvIncrement.text.toString().toInt() + 1).toString()
        }

        return binding.root
    }
}