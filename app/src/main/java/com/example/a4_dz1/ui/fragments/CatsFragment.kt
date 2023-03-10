package com.example.a4_dz1.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a4_dz1.databinding.FragmentCatsBinding
import com.example.a4_dz1.ui.adapter.CatsAdapter
import com.example.a4_dz1.model.HomeModel
import com.example.a4_dz1.repository.CatsRepository

class CatsFragment : Fragment(){

    private lateinit var binding: FragmentCatsBinding
    private val textList = ArrayList<HomeModel>()
    private val adapter = CatsAdapter(textList)
    private val repo = CatsRepository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCatsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() {
        binding.rvCats.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        textList.addAll(repo.getListOfCat())
        binding.rvCats.adapter = adapter
    }
}