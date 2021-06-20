package dt.prot.tourkras.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import dt.prot.tourkras.ListAdapter
import dt.prot.tourkras.ListAdapterRecycler
import dt.prot.tourkras.MainActivity
import dt.prot.tourkras.R
import kotlinx.android.synthetic.main.fragment_settings2.*
import kotlinx.android.synthetic.main.fragment_settings3.*
import kotlinx.android.synthetic.main.fragment_settings3.listFrSetting3
import kotlinx.android.synthetic.main.fragment_settings4.*
import kotlinx.android.synthetic.main.item_cart_fr_setting2.*

class SettingsFragment3 : Fragment(),View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_settings3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        (activity as MainActivity).arrayViewList?.clear()
        listFrSetting3.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.VERTICAL,false)
        listFrSetting3.adapter = (activity as MainActivity).arrayList?.let { ListAdapterRecycler(requireContext(),R.layout.item_cart_fr_setting2,R.id.listFrSettingItem, it,
            activity as MainActivity
        ,false) }

        (activity as MainActivity).settingsFragment = this

        buttonFrSetting3.setOnClickListener(this)

        super.onViewCreated(view, savedInstanceState)
    }

    override fun onClick(p0: View?) {
        when (p0){
            buttonFrSetting3 -> {
                fragmentManager?.beginTransaction()?.replace(R.id.fragment_container,SettingsFragment4())
                    ?.commit()
            }
        }
    }

}
