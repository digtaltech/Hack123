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
import kotlinx.android.synthetic.main.item_cart_fr_setting.*

class SettingsFragment4 : Fragment(),View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment


        return inflater.inflate(R.layout.fragment_settings4, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        buttonFrSetting4.setOnClickListener(this)
        //(activity as MainActivity).arrayViewList?.clear()
//        val arrayList: MutableList<DataModel>? = (activity as MainActivity).arrayList
//        listFrSetting2.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
//        listFrSetting2.adapter = ListAdapterRecycler(requireContext(),R.layout.item_cart_fr_setting,R.id.listFrSettingItem,arrayList!!,(activity as MainActivity))
//        var arrayViewList: MutableList<DataModelCreatItem>? = (activity as MainActivity).arrayViewList

        (activity as MainActivity).settingsFragment = this

        super.onViewCreated(view, savedInstanceState)
    }

    override fun onClick(p0: View?) {
         when (p0) {
            buttonFrSetting4 -> {
                fragmentManager?.beginTransaction()
                    ?.replace(R.id.fragment_container, SettingsFragment())
                    ?.commit()
            }
            else -> {
                Log.d("bottom navigation", "else part of bottom navigation" + p0.toString())
            }
        }
    }
}
