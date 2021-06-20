package dt.prot.tourkras.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import dt.prot.tourkras.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_settings2.*
import kotlinx.android.synthetic.main.fragment_settings4.*
import kotlinx.android.synthetic.main.fragment_settings5.*
import kotlinx.android.synthetic.main.item_cart_fr_setting.*

class SettingsFragment5 : Fragment(),View.OnClickListener {

    private val arrayListHome: MutableList<DataModelHome> = mutableListOf()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        arrayListHome.add(DataModelHome("Поездка в Анапу","3 дня | 12 мест ","Подходит вам на 78% "))
        arrayListHome.add(DataModelHome("Поездка в Махачкалу","3 дня | 12 мест ","Подходит вам на 78% "))
        arrayListHome.add(DataModelHome("Поездка в Анапу","3 дня | 12 мест ","Подходит вам на 13578% "))

        return inflater.inflate(R.layout.fragment_settings5, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //buttonFrSetting4.setOnClickListener(this)

        listFrSetting5.adapter = ListAdapter(requireContext(),R.layout.item_cart_fr_home, arrayListHome)
        buttonFrSetting5.setOnClickListener(this)

        (activity as MainActivity).settingsFragment = this

        super.onViewCreated(view, savedInstanceState)
    }

    override fun onClick(p0: View?) {
         when (p0) {
             buttonFrSetting5 -> {
                fragmentManager?.beginTransaction()
                    ?.replace(R.id.fragment_container, SettingsFragment6())
                    ?.commit()
            }
            else -> {
                Log.d("bottom navigation", "else part of bottom navigation" + p0.toString())
            }
        }
    }
}
