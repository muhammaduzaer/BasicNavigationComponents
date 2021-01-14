package com.muhammaduzaer.navigationcomponents.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.muhammaduzaer.navigationcomponents.R
import kotlinx.android.synthetic.main.fragment_log_in.*


class LogInFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_log_in, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonLogIn.setOnClickListener {
            val userName = editTextEmail.text.toString()
            val userPassword = editTextPassword.text.toString()

            val action = LogInFragmentDirections.actionLogInFragmentToWelcomeFragment(userName, userPassword)
            findNavController().navigate(action)
        }
    }
}