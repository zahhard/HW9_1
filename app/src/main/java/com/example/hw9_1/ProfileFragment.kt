package com.example.hw9_1

import android.annotation.SuppressLint
import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import com.example.hw9_1.databinding.FragmentHomeBinding
import com.example.hw9_1.databinding.FragmentProfileBinding


object Remember{
    var isRemember = false
}

class ProfileFragment : Fragment() {
    lateinit var binding: FragmentProfileBinding
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       // val preferences = activity?.getSharedPreferences("share", Context.MODE_PRIVATE)

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, object: OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                findNavController().navigate(R.id.action_profileFragment_to_homeFragment)
            }
        })

        binding.button.setOnClickListener {
            checkEmptyView()

            if (!checkEmptyView()) {
                var  editor = getContext()?.getSharedPreferences("share", MODE_PRIVATE)?.edit()

                Remember.isRemember = true

               // val editor: SharedPreferences.Editor = preferences!!.edit()
                editor?.putString("name", binding.etName.text.toString())
                editor?.putString("email", binding.etName.text.toString())
                Toast.makeText(activity, "shared successfully", Toast.LENGTH_SHORT).show()

                findNavController().navigate(R.id.action_profileFragment_to_homeFragment)
                Toast.makeText(activity, "you have to Register", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun checkEmptyView(): Boolean {
        var ischecked = false
        if (binding.etName.text?.isBlank() == true) {
            binding.etName.error = "empty"
            ischecked = true
        }

        if (binding.etEmail.text?.isBlank() == true) {
            binding.etEmail.error = "empty"
            ischecked = true
        }

        return ischecked
    }
}