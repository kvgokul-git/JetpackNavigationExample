package com.gklabs.jetpacknavigationexample.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.gklabs.jetpacknavigationexample.R
import com.gklabs.jetpacknavigationexample.databinding.FragmentOneBinding


class FragmentOne : Fragment() {

    private lateinit var binding: FragmentOneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentOneBinding.bind(view)
        with(binding) {
            buttonSubmit.setOnClickListener {
                it.findNavController().navigate(
                    FragmentOneDirections.actionFragmentOneToFragmentTwo(edittextSample.text.toString())
                )
            }
        }
    }

}