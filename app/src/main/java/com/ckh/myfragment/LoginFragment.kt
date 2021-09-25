package com.ckh.myfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_login.view.*

class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val rootView =inflater.inflate(R.layout.fragment_login, container, false)

        rootView.nextBtn.setOnClickListener {
            val mainActivity = activity as MainActivity
            mainActivity.onChangeFragment(1)
        }
        return  rootView
    }

}