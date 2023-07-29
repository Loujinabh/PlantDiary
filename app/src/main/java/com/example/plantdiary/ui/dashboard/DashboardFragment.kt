package com.example.plantdiary.ui.dashboard

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.databinding.DashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: DashboardBinding? = null
    private val binding get() = _binding!!

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val dashboardViewModel =
            ViewModelProvider(this)[DashboardViewModel::class.java]


        val username = "Loujin"
        binding.username.text = username

                //binding.intresting1.setImageResource(R.drawable.trending_image_1)
                //binding.intresting2.setImageResource(R.drawable.trending_image_2)
                //binding.intresting3.setImageResource(R.drawable.trending_image_3)
                //binding.intresting4.setImageResource(R.drawable.trending_image_4)


                // binding.seasonalinfo1.text = "+  Water new ground covers and weed them to encourage spreading."
                // binding.seasonalinfo2.text = "+  Avoid fertilizing trees and shrubs after July 4th. Late summer fertilizing may cause lush growth that’s more prone to winter kill."

                return null
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

