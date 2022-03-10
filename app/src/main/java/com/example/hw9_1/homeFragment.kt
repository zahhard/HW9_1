package com.example.hw9_1

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.hw9_1.databinding.FragmentHomeBinding

class homeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    var images = ArrayList<ImageView>()
    var i = 0
    lateinit var sharedPreferences: SharedPreferences
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

       // val preferences = activity?.getSharedPreferences("share", Context.MODE_PRIVATE)
        //sharedPreferences = requireActivity().getPreferences(Context.MODE_PRIVATE)



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
            val preferences = activity?.getSharedPreferences("share", Context.MODE_PRIVATE)
            if (Remember.isRemember) {
                i++
                if (i % 2 == 0) {
                    view.setImageResource(R.drawable.ic_baseline_favorite_border_24)
                    val share = activity?.getSharedPreferences("favorite", Context.MODE_PRIVATE)
                    val editor: SharedPreferences.Editor = share!!.edit()
                   // Toast.makeText(activity, "${view.id.toString()}", Toast.LENGTH_SHORT).show()
                  //  editor.putString("name", )
                }
                else
                    view.setImageResource(R.drawable.ic_baseline_favorite_24)
            }
            else{
                findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
                Toast.makeText(activity, "you have to Register", Toast.LENGTH_SHORT).show()
            }
        }
    }



}

