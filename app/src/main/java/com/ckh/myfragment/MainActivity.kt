package com.ckh.myfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var loginFragment:LoginFragment = LoginFragment()
    var menuFragment:MenuFragment =  MenuFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showLoginBtn.setOnClickListener {
            onChangeFragment(0)
        }
        showMenuBtn.setOnClickListener {
            onChangeFragment(1)
        }
    }

    public fun onChangeFragment(index:Int) {
        when(index){
            0 -> {
                supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView,loginFragment).commit()
            }
            1 -> {
                supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView,menuFragment).commit()
            }
        }
    }
}