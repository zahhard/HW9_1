package com.example.hw9_1

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.hw9_1.databinding.FragmentHomeBinding
import kotlin.math.log

object Favorite{
    var favoriteArrayList = ArrayList<Int>()
}
class homeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private var images = ArrayList<ImageView>()
    private var i = 0
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

        init()
        heartOnClickes()
        heartCheckWhenBackHome()
        Log.i("status", Favorite.favoriteArrayList.toString())
    }

    private fun heartOnClickes() {
        images[0].setOnClickListener {
            heartClicked(0)
        }
        images[1].setOnClickListener {
            heartClicked(1)
        }
        images[2].setOnClickListener {
            heartClicked(2)
        }
        images[3].setOnClickListener {
            heartClicked(3)
        }
        images[4].setOnClickListener {
            heartClicked(4)
        }
        images[5].setOnClickListener {
            heartClicked(5)
        }
        images[6].setOnClickListener {
            heartClicked(6)
        }
        images[7].setOnClickListener {
            heartClicked(7)
        }
        images[8].setOnClickListener {
            heartClicked(8)
        }
        images[9].setOnClickListener {
            heartClicked(9)
        }
        images[10].setOnClickListener {
            heartClicked(10)
        }
        images[11].setOnClickListener {
            heartClicked(11)
        }
    }

    private fun heartClicked(index: Int) {
        if (Remember.isRemember) {
            i++
            if (i % 2 == 0) {
                images[index].setImageResource(R.drawable.ic_baseline_favorite_border_24)
                Favorite.favoriteArrayList.remove(index + 1)
            } else {
                images[index].setImageResource(R.drawable.ic_baseline_favorite_24)
                //Favorite.favoriteArrayList.remove(index + 1)
                Favorite.favoriteArrayList.add(index + 1)
            }
        } else {
            findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
        }
    }

    private fun heartCheckWhenBackHome() {
        if (Favorite.favoriteArrayList.contains(1))
            images[0].setImageResource(R.drawable.ic_baseline_favorite_24)
        if (Favorite.favoriteArrayList.contains(2))
            images[1].setImageResource(R.drawable.ic_baseline_favorite_24)
        if (Favorite.favoriteArrayList.contains(3))
            images[2].setImageResource(R.drawable.ic_baseline_favorite_24)
        if (Favorite.favoriteArrayList.contains(4))
            images[3].setImageResource(R.drawable.ic_baseline_favorite_24)
        if (Favorite.favoriteArrayList.contains(5))
            images[4].setImageResource(R.drawable.ic_baseline_favorite_24)
        if (Favorite.favoriteArrayList.contains(6))
            images[5].setImageResource(R.drawable.ic_baseline_favorite_24)
        if (Favorite.favoriteArrayList.contains(7))
            images[6].setImageResource(R.drawable.ic_baseline_favorite_24)
        if (Favorite.favoriteArrayList.contains(8))
            images[7].setImageResource(R.drawable.ic_baseline_favorite_24)
        if (Favorite.favoriteArrayList.contains(9))
            images[8].setImageResource(R.drawable.ic_baseline_favorite_24)
        if (Favorite.favoriteArrayList.contains(10))
            images[9].setImageResource(R.drawable.ic_baseline_favorite_24)
        if (Favorite.favoriteArrayList.contains(11))
            images[10].setImageResource(R.drawable.ic_baseline_favorite_24)
        if (Favorite.favoriteArrayList.contains(12))
            images[11].setImageResource(R.drawable.ic_baseline_favorite_24)
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
}

