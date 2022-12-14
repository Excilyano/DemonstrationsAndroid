package com.example.demonstrationsandroid.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.demonstrationsandroid.R
import com.example.demonstrationsandroid.databinding.FragmentSourceBinding
import com.example.demonstrationsandroid.findview.Utilisateur

class SourceFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentSourceBinding>(
            inflater,
            R.layout.fragment_source,
            container,
            false)

        binding.btnNavigation.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_sourceFragment_to_destinationFragment)
        )

        return binding.root
    }
}