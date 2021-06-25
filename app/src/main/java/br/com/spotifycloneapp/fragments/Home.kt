package br.com.spotifycloneapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.spotifycloneapp.R

class Home : Fragment() {

    companion object {
        fun newInstance(): Home {
            val fragmentHome = Home()
            val argumentos = Bundle()
            fragmentHome.arguments = argumentos
            return fragmentHome
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

}