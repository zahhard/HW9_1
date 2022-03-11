package com.example.hw9_1

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.example.hw9_1.databinding.FragmentCommingSoonBinding
import com.example.hw9_1.databinding.FragmentFavoriteBinding

class FavoriteFragment : Fragment() {
    lateinit var binding: FragmentFavoriteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFavoriteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, object: OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                findNavController().navigate(R.id.action_favoriteFragment_to_homeFragment)
            }
        })
        binding.c1.isGone = true
        binding.c2.isGone = true
        binding.c3.isGone = true
        binding.c4.isGone = true
        binding.c5.isGone = true
        binding.c6.isGone = true
        binding.c7.isGone = true
        binding.c8.isGone = true
        binding.c9.isGone = true
        binding.c10.isGone = true
        binding.c11.isGone = true
        binding.c12.isGone = true

        val preferences = activity?.getSharedPreferences("favorite", Context.MODE_PRIVATE)
        var id = preferences?.getInt("name", 0)
        Toast.makeText(activity, "$id", Toast.LENGTH_SHORT).show()
        if (id == 1)
            binding.c1.isGone = false

/*        binding.c1.isVisible = false
        binding.c2.isVisible = false
        binding.c3.isVisible = false
        binding.c4.isVisible = false
        binding.c5.isVisible = false
        binding.c6.isVisible = false
        binding.c7.isVisible = false
        binding.c8.isVisible = false
        binding.c9.isVisible = false
        binding.c10.isVisible = false
        binding.c11.isVisible = false
        binding.c12.isVisible = false

 */

    }
}