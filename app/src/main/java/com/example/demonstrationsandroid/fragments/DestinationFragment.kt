package com.example.demonstrationsandroid.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.demonstrationsandroid.R
import com.example.demonstrationsandroid.databinding.FragmentDestinationBinding


class DestinationFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentDestinationBinding>(inflater,
            R.layout.fragment_destination,
            container,
            false)

        val args = arguments?.let {DestinationFragmentArgs.fromBundle(it)}

        binding.msg = args?.message
        binding.user = args?.myuser

        return binding.root
    }
}