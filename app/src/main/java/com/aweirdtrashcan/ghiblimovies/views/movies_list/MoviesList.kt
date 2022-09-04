package com.aweirdtrashcan.ghiblimovies.views.movies_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aweirdtrashcan.ghiblimovies.R
import com.aweirdtrashcan.ghiblimovies.databinding.FragmentMoviesListBinding

class MoviesList : Fragment() {

    private var _binding: FragmentMoviesListBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMoviesListBinding.inflate(inflater)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}