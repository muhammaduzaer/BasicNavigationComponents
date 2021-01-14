package com.muhammaduzaer.navigationcomponents.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.muhammaduzaer.navigationcomponents.R
import kotlinx.android.synthetic.main.fragment_welcome.*


class
WelcomeFragment : Fragment() {

    private val args: WelcomeFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textViewEmail.text = args.email
        textViewPassword.text = args.password

        buttonOkay.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_homeFragment2)
        }


    }

}