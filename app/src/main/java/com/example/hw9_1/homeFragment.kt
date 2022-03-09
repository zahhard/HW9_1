package com.example.hw9_1

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.hw9_1.databinding.FragmentHomeBinding

class homeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    var images = ArrayList<ImageView>()
    var i = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

      //  findNavController().navigate(R.id.action_homeFragment_to_commingSoonFragment)


        init()

        images[0].setOnClickListener(::changeHeart)
        images[1].setOnClickListener(::changeHeart)
        images[2].setOnClickListener(::changeHeart)
        images[3].setOnClickListener(::changeHeart)
        images[4].setOnClickListener(::changeHeart)
        images[5].setOnClickListener(::changeHeart)
        images[6].setOnClickListener(::changeHeart)
        images[7].setOnClickListener(::changeHeart)
        images[8].setOnClickListener(::changeHeart)
        images[9].setOnClickListener(::changeHeart)
        images[10].setOnClickListener(::changeHeart)
        images[11].setOnClickListener(::changeHeart)

    }

    private fun init() {
        images.add(binding.ivHeart1)
        images.add(binding.ivHeart2)
        images.add(binding.ivHeart3)
        images.add(binding.ivHeart4)
        images.add(binding.ivHeart5)
        images.add(binding.ivHeart6)
        images.add(binding.ivHeart7)
        images.add(binding.ivHeart8)
        images.add(binding.ivHeart9)
        images.add(binding.ivHeart10)
        images.add(binding.ivHeart11)
        images.add(binding.ivHeart12)
    }

    private fun changeHeart(view: View){
        if (view is ImageView) {
            i++
            if (i % 2 == 0)
                view.setImageResource(R.drawable.ic_baseline_favorite_border_24)
            else
                view.setImageResource(R.drawable.ic_baseline_favorite_24)
        }
    }



}

