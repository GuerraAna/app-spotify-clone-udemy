package br.com.spotifycloneapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.spotifycloneapp.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Buscar.newInstance] factory method to
 * create an instance of this fragment.
 */
class Buscar : Fragment() {

    companion object {
        fun newInstance(): Buscar {
            val fragmentBuscar = Buscar()
            val argumentos = Bundle()
            fragmentBuscar.arguments = argumentos
            return fragmentBuscar
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_buscar, container, false)
    }
}