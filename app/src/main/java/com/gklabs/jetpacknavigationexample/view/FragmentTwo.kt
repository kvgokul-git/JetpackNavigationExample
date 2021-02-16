package com.gklabs.jetpacknavigationexample.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.gklabs.jetpacknavigationexample.R
import com.gklabs.jetpacknavigationexample.databinding.FragmentTwoBinding


class FragmentTwo : Fragment() {

    private lateinit var binding: FragmentTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args: FragmentTwoArgs by navArgs()
        binding = FragmentTwoBinding.bind(view)
        with(binding) {
            textviewDataDisplay.setText(args.sampleData.toString())
            textviewDataDisplay.visibility = View.VISIBLE;
        }
    }

}