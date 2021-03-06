package com.example.hw9_1

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import com.example.hw9_1.databinding.FragmentCommingSoonBinding
import com.example.hw9_1.databinding.FragmentHomeBinding

class CommingSoonFragment : Fragment() {

    lateinit var binding: FragmentCommingSoonBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCommingSoonBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.ivHeart1.setOnClickListener{
                share()
        }
        binding.ivHeart2.setOnClickListener{
                share()
        }
        binding.ivHeart3.setOnClickListener{
                share()
        }
        super.onViewCreated(view, savedInstanceState)
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, object: OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                findNavController().navigate(R.id.action_commingSoonFragment_to_homeFragment)
            }
        })
    }


    private fun share() {
        if (Remember.isRemember) {
            Toast.makeText(activity, "share menu item clicked", Toast.LENGTH_SHORT).show()
            var sendIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "${binding.textView1.text}")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }
        else {
            findNavController().navigate(R.id.action_commingSoonFragment_to_profileFragment)
            Toast.makeText(activity, "you have to Register", Toast.LENGTH_SHORT).show()
        }
    }
}