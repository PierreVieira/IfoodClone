package com.example.ifoodclone

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.ifoodclone.databinding.FragmentRestaurantBinding

class RestaurantFragment : Fragment(R.layout.fragment_restaurant) {

    private var binding: FragmentRestaurantBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRestaurantBinding.bind(view)
        val filters = Filters.data
        binding?.apply {
            filters.forEach { filter ->
                chipGroupFilter.addView(filter.toChip(requireContext()))
            }
        }
    }
}