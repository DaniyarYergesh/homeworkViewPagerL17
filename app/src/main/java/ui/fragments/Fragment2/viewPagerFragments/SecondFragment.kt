package ui.fragments.Fragment2.viewPagerFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.TextView
import com.example.homework_recyclerview.R

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val spendedTime = view.findViewById<TextView>(R.id.spendedTime)
        spendedTime.setText("Hello World")
    }
}