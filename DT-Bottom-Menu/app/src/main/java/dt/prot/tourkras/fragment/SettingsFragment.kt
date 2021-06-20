package dt.prot.tourkras.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dt.prot.tourkras.R
import kotlinx.android.synthetic.main.fragment_settings.*
import kotlinx.android.synthetic.main.fragment_thx.*
import android.util.Log
import dt.prot.tourkras.DataModelCreate
import dt.prot.tourkras.MainActivity
import kotlinx.android.synthetic.main.cart_fr_setting.*

class SettingsFragment : Fragment(),View.OnClickListener {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment


        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        buttonFrSetting.setOnClickListener (this)

        (activity as MainActivity).settingsFragment = this

        super.onViewCreated(view, savedInstanceState)
    }

    override fun onClick(p0: View?) {
        when (p0) {
            buttonFrSetting -> {
                (activity as MainActivity).dataModelCreate = DataModelCreate(cart_fr_text_1.text.toString(),cart_fr_text_2.text.toString(),cart_fr_text_3.text.toString(),cart_fr_text_4.text.toString(),cart_fr_text_5.text.toString(),)

                fragmentManager?.beginTransaction()
                    ?.replace(R.id.fragment_container, SettingsFragment2())
                    ?.commit()
                //(activity as MainActivity).dataModelCreate
            }
            buttonThx -> {


            }
            else -> {
                Log.d("bottom navigation", "else part of bottom navigation" + p0.toString())
            }
        }
    }

}
