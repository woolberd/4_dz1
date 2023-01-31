package com.example.a4_dz1.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a4_dz1.databinding.FragmentCinemaBinding
import com.example.a4_dz1.`interface`.OnClickItemListener
import com.example.a4_dz1.ui.adapter.CinemaAdapter
import com.example.a4_dz1.model.HomeModel
import com.example.a4_dz1.repository.CinemaRepository

class CinemaFragment : Fragment(), OnClickItemListener {

    private lateinit var binding: FragmentCinemaBinding
    private val textList = ArrayList<HomeModel>()
    private val adapter = CinemaAdapter(textList, this)
    private val repo = CinemaRepository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCinemaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        clear()
        initialize()
    }

    private fun initialize() {
        binding.rvCinema.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        textList.addAll(repo.getListOfCinema())
        binding.rvCinema.adapter = adapter
    }

    private fun clear(){
        textList.clear()
    }

    override fun onClickItemListener(model: HomeModel) {
        val text = model.name
        val image = model.image
        findNavController().navigate(
            CinemaFragmentDirections.actionCinemaFragmentToDetailFragment().setText(text).setPhoto(image)
        )
    }
}