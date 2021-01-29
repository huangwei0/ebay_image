package com.example.android.ebay


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val homeFragment = HomeFragment()
        val profileFragment = profileFragment()
        val socialFragment = socialFragment()
        val toolsFragment = toolsFragment()

        makeCurrentFragment(homeFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_home -> makeCurrentFragment(homeFragment)
                R.id.ic_social ->makeCurrentFragment(socialFragment)
                R.id.ic_profile -> makeCurrentFragment(profileFragment)
                R.id.ic_tools-> makeCurrentFragment(toolsFragment)
            }
            true
        }
    }

    private fun makeCurrentFragment(fragment:Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer,fragment )
            commit()
        }

}
