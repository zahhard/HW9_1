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
    var favorites = ArrayList<Int>()

    // lateinit var shared : SharedPreferences
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

        val shared = activity?.getSharedPreferences("favorite", Context.MODE_PRIVATE)


        init()

        images[0].setOnClickListener {
            val preferences = activity?.getSharedPreferences("share", Context.MODE_PRIVATE)
            if (Remember.isRemember) {
                i++
                if (i % 2 == 0) {
                    images[0].setImageResource(R.drawable.ic_baseline_favorite_border_24)
                    favorites.add(1)
//                    val edit = shared?.edit()
//                    edit?.putInt("name" , 1)
//                    Toast.makeText(activity , "Was Saved" , Toast.LENGTH_SHORT).show()
//                    edit?.apply()
                } else
                    images[0].setImageResource(R.drawable.ic_baseline_favorite_24)
            } else {
                findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
                Toast.makeText(activity, "you have to Register", Toast.LENGTH_SHORT).show()
            }
        }


        images[1].setOnClickListener {
            val preferences = activity?.getSharedPreferences("share", Context.MODE_PRIVATE)
            if (Remember.isRemember) {
                i++
                if (i % 2 == 0) {
                    images[1].setImageResource(R.drawable.ic_baseline_favorite_border_24)
                    favorites.add(2)
//                    val edit = shared?.edit()
//                    edit?.putInt("name" , 2)
//                    Toast.makeText(activity , "Was Saved" , Toast.LENGTH_SHORT).show()
//                    edit?.apply()
                } else
                    images[1].setImageResource(R.drawable.ic_baseline_favorite_24)
            } else {
                findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
                Toast.makeText(activity, "you have to Register", Toast.LENGTH_SHORT).show()
            }
        }


        images[2].setOnClickListener {
            val preferences = activity?.getSharedPreferences("share", Context.MODE_PRIVATE)
            if (Remember.isRemember) {
                i++
                if (i % 2 == 0) {
                    images[2].setImageResource(R.drawable.ic_baseline_favorite_border_24)
                    favorites.add(3)
                } else
                    images[2].setImageResource(R.drawable.ic_baseline_favorite_24)
            } else {
                findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
                Toast.makeText(activity, "you have to Register", Toast.LENGTH_SHORT).show()
            }
        }
        images[3].setOnClickListener {
            val preferences = activity?.getSharedPreferences("share", Context.MODE_PRIVATE)
            if (Remember.isRemember) {
                i++
                if (i % 2 == 0) {
                    images[3].setImageResource(R.drawable.ic_baseline_favorite_border_24)
                    favorites.add(4)
                } else
                    images[3].setImageResource(R.drawable.ic_baseline_favorite_24)
            } else {
                findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
                Toast.makeText(activity, "you have to Register", Toast.LENGTH_SHORT).show()
            }
        }
        images[4].setOnClickListener {
            val preferences = activity?.getSharedPreferences("share", Context.MODE_PRIVATE)
            if (Remember.isRemember) {
                i++
                if (i % 2 == 0) {
                    images[4].setImageResource(R.drawable.ic_baseline_favorite_border_24)
                    favorites.add(5)
                } else
                    images[4].setImageResource(R.drawable.ic_baseline_favorite_24)
            } else {
                findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
                Toast.makeText(activity, "you have to Register", Toast.LENGTH_SHORT).show()
            }
        }
        images[5].setOnClickListener {
            val preferences = activity?.getSharedPreferences("share", Context.MODE_PRIVATE)
            if (Remember.isRemember) {
                i++
                if (i % 2 == 0) {
                    images[5].setImageResource(R.drawable.ic_baseline_favorite_border_24)
                    favorites.add(6)
                } else
                    images[5].setImageResource(R.drawable.ic_baseline_favorite_24)
            } else {
                findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
                Toast.makeText(activity, "you have to Register", Toast.LENGTH_SHORT).show()
            }
        }
        images[6].setOnClickListener {
            val preferences = activity?.getSharedPreferences("share", Context.MODE_PRIVATE)
            if (Remember.isRemember) {
                i++
                if (i % 2 == 0) {
                    images[6].setImageResource(R.drawable.ic_baseline_favorite_border_24)
                    favorites.add(7)
                } else
                    images[6].setImageResource(R.drawable.ic_baseline_favorite_24)
            } else {
                findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
                Toast.makeText(activity, "you have to Register", Toast.LENGTH_SHORT).show()
            }
        }
        images[7].setOnClickListener {
            val preferences = activity?.getSharedPreferences("share", Context.MODE_PRIVATE)
            if (Remember.isRemember) {
                i++
                if (i % 2 == 0) {
                    images[7].setImageResource(R.drawable.ic_baseline_favorite_border_24)
                    favorites.add(8)
                } else
                    images[7].setImageResource(R.drawable.ic_baseline_favorite_24)
            } else {
                findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
                Toast.makeText(activity, "you have to Register", Toast.LENGTH_SHORT).show()
            }
        }
        images[8].setOnClickListener {
            val preferences = activity?.getSharedPreferences("share", Context.MODE_PRIVATE)
            if (Remember.isRemember) {
                i++
                if (i % 2 == 0) {
                    images[8].setImageResource(R.drawable.ic_baseline_favorite_border_24)
                    favorites.add(9)
                } else
                    images[8].setImageResource(R.drawable.ic_baseline_favorite_24)
            } else {
                findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
                Toast.makeText(activity, "you have to Register", Toast.LENGTH_SHORT).show()
            }
        }
        images[9].setOnClickListener {
            val preferences = activity?.getSharedPreferences("share", Context.MODE_PRIVATE)
            if (Remember.isRemember) {
                i++
                if (i % 2 == 0) {
                    images[9].setImageResource(R.drawable.ic_baseline_favorite_border_24)
                    favorites.add(10)
                } else
                    images[9].setImageResource(R.drawable.ic_baseline_favorite_24)
            } else {
                findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
                Toast.makeText(activity, "you have to Register", Toast.LENGTH_SHORT).show()
            }
        }
        images[10].setOnClickListener {
            val preferences = activity?.getSharedPreferences("share", Context.MODE_PRIVATE)
            if (Remember.isRemember) {
                i++
                if (i % 2 == 0) {
                    images[10].setImageResource(R.drawable.ic_baseline_favorite_border_24)
                    favorites.add(11)
                } else
                    images[10].setImageResource(R.drawable.ic_baseline_favorite_24)
            } else {
                findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
                Toast.makeText(activity, "you have to Register", Toast.LENGTH_SHORT).show()
            }
        }
        images[11].setOnClickListener {
            val preferences = activity?.getSharedPreferences("share", Context.MODE_PRIVATE)
            if (Remember.isRemember) {
                i++
                if (i % 2 == 0) {
                    images[11].setImageResource(R.drawable.ic_baseline_favorite_border_24)
                    favorites.add(12)
                } else
                    images[11].setImageResource(R.drawable.ic_baseline_favorite_24)
            } else {
                findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
                Toast.makeText(activity, "you have to Register", Toast.LENGTH_SHORT).show()
            }
        }

        val edit = shared?.edit()
        edit?.putInt("name", 5)
        Toast.makeText(activity, "Was Saved", Toast.LENGTH_SHORT).show()
        edit?.apply()

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

    /*  private fun changeHeart(view: View){
          if (view is ImageView) {
              val preferences = activity?.getSharedPreferences("share", Context.MODE_PRIVATE)
              if (Remember.isRemember) {
                  i++
                  if (i % 2 == 0) {
                      view.setImageResource(R.drawable.ic_baseline_favorite_border_24)
                      val share = activity?.getSharedPreferences("favorite", Context.MODE_PRIVATE)
                      val editor: SharedPreferences.Editor = share!!.edit()
                     Toast.makeText(activity, "${view.tooltipText}", Toast.LENGTH_SHORT).show()
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

     */


}

