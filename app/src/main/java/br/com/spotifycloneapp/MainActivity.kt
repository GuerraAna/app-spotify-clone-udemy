package br.com.spotifycloneapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import br.com.spotifycloneapp.databinding.ActivityMainBinding
import br.com.spotifycloneapp.fragments.Biblioteca
import br.com.spotifycloneapp.fragments.Buscar
import br.com.spotifycloneapp.fragments.Home
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var Content: FrameLayout? = null
    private var mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item->
        when(item.itemId) {
            R.id.menu_inicio -> {
                val fragment = Home.newInstance()
                addFragment(fragment)
            }
            R.id.menu_buscar -> {
                val fragment = Buscar.newInstance()
                addFragment(fragment)
            }
            R.id.menu_sua_biblioteca -> {
                val fragment = Biblioteca.newInstance()
                addFragment(fragment)
            }
        }
        false
    }

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.content, fragment, fragment.javaClass.simpleName)
            .commit()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Content = binding.content
        binding.bottomToolbar.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        val fragment = Home.newInstance()
        addFragment(fragment)

    }
}