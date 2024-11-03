package com.dza.movieapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.dza.movieapp.databinding.FragmentDiscountBinding
import com.dza.movieapp.databinding.FragmentHistoryBinding

class DiscountFragment : Fragment() {
    private var _binding: FragmentDiscountBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDiscountBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val discounts = listOf(
            "Diskon 20% untuk film terbaru!",
            "Beli 1 tiket, gratis 1 tiket untuk film tertentu!",
            "Diskon 15% untuk anggota VIP!",
            "Diskon 30% untuk pemesanan grup!",
            "Diskon 10% untuk pembelian tiket online!"
        )

        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, discounts)
        binding.discountList.adapter = adapter // Pastikan ID ini sesuai
    }
}