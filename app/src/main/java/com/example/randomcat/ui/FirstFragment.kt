package com.example.randomcat.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.randomcat.R
import com.example.randomcat.data.CatRepository
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class FirstFragment : Fragment(), CoroutineScope {

    override val coroutineContext = Dispatchers.Main
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val repository = CatRepository()
        button.setOnClickListener {
        launch {
            val cats = repository.getData().await()
            loader.visibility = View.GONE

            Glide.with(requireContext()).load(cats?.url).centerCrop().into(image)


        }
    }
    }
}
