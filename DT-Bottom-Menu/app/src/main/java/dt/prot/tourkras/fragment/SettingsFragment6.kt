package dt.prot.tourkras.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import dt.prot.tourkras.*
import kotlinx.android.synthetic.main.fragment_settings2.*
import kotlinx.android.synthetic.main.fragment_settings4.*
import kotlinx.android.synthetic.main.fragment_settings4.buttonFrSetting4
import kotlinx.android.synthetic.main.fragment_settings6.*
import kotlinx.android.synthetic.main.item_cart_fr_setting.*

class SettingsFragment6 : Fragment(),View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment


        return inflater.inflate(R.layout.fragment_settings6, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        buttonFrSetting6.setOnClickListener(this)

        (activity as MainActivity).settingsFragment = this

        super.onViewCreated(view, savedInstanceState)
    }

    override fun onClick(p0: View?) {
         when (p0) {
            buttonFrSetting6 -> {
                fragmentManager?.beginTransaction()
                    ?.replace(R.id.fragment_container, SettingsFragment2())
                    ?.commit()
            }
            else -> {
                Log.d("bottom navigation", "else part of bottom navigation" + p0.toString())
            }
        }
    }
}
