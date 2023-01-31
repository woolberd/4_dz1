package com.example.a4_dz1.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a4_dz1.databinding.FragmentProgrammingLanguageBinding
import com.example.a4_dz1.ui.adapter.ProgrammingLanguageAdapter
import com.example.a4_dz1.model.HomeModel
import com.example.a4_dz1.repository.ProgrammingLanguageRepository

class ProgrammingLanguageFragment : Fragment() {

    private lateinit var binding: FragmentProgrammingLanguageBinding
    private val textList = ArrayList<HomeModel>()
    private val adapter = ProgrammingLanguageAdapter(textList)
    private val repo = ProgrammingLanguageRepository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProgrammingLanguageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() {
        binding.rvLanguage.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        textList.addAll(repo.getListOfProgrammingLanguage())
        binding.rvLanguage.adapter = adapter
    }
}