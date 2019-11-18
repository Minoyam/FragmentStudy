package com.cnm.fragmentcaseconverter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {

        bt_up.setOnClickListener {
            val text = et_text.text.toString()
            val uptext = text.toUpperCase()
            (activity as? MainActivity)?.submit(uptext)
        }
        bt_down.setOnClickListener {
            val text = et_text.text.toString()
            val downtext = text.toLowerCase()
            (activity as? MainActivity)?.submit(downtext)
        }
        super.onActivityCreated(savedInstanceState)
    }


}
