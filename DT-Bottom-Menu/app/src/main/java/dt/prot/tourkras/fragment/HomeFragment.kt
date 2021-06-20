package dt.prot.tourkras.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dt.prot.tourkras.*
import kotlinx.android.synthetic.main.button_plus_minus.*
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(),View.OnClickListener{

    //var mainActivity: MainActivity? = null
    private val arrayListHome: MutableList<DataModelHome> = mutableListOf()



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        arrayListHome.add(DataModelHome("Поездка в Анапу","3 дня | 12 мест ","Подходит вам на 78% "))
        arrayListHome.add(DataModelHome("Поездка в Махачкалу","3 дня | 12 мест ","Подходит вам на 78% "))
        arrayListHome.add(DataModelHome("Поездка в Анапу","3 дня | 12 мест ","Подходит вам на 13578% "))

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        //arrayListHome.add(DataModelHome("Поездка в Анапу","3 дня | 12 мест ","Подходит вам на 78% "))
        //arrayListHome.add(DataModelHome("Поездка в Анапу","3 дня | 12 мест ","Подходит вам на 78% "))
//        arrayListHome.add(DataModelHome("Поездка в Анапу","3 дня | 12 мест ","Подходит вам на 78% "))
//
        listFrHome.adapter = ListAdapter(requireContext(),R.layout.item_cart_fr_home, arrayListHome)
        //twoListView.adapter = mainActivity?.arrayList?.let { ListAdapter(requireContext(),R.layout.item_cart_fr_setting, it) }

        //ivShare3i.setOnClickListener(this)
        //ivTrash3i.setOnClickListener(this)
        //addPrimePopup2.setOnClickListener(this)
        //addPrimePopup3.setOnClickListener(this)
        //pmButtonPlus.setOnClickListener(this)
        //pmButtomMinus.setOnClickListener(this)
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onClick(p0: View?) {
//        when (p0){
//
//
//            else -> {
//                Log.d("bottom navigation", "else part of bottom navigation"+ p0.toString())
//            }
//        }
    }
}
