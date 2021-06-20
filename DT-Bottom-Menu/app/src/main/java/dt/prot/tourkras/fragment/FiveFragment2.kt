package dt.prot.tourkras.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import dt.prot.tourkras.R
import kotlinx.android.synthetic.main.fragment_five_edit_prime.*

class FiveFragment2 : Fragment(),View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment


        return inflater.inflate(R.layout.fragment_five_edit_prime, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(requireContext(),android.R.layout.simple_spinner_item,
            arrayOf("Числа каждого месяца", "Перый день недели в месяце"))//Заменить
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerDateEdit.adapter = arrayAdapter

        val arrayAdapter2: ArrayAdapter<String> = ArrayAdapter(requireContext(),android.R.layout.simple_spinner_item,
            arrayOf("Доставка курьером", "Самовывоз"))
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerTransferEdit.adapter = arrayAdapter2

        val arrayAdapter3: ArrayAdapter<String> = ArrayAdapter(requireContext(),android.R.layout.simple_spinner_item,
            arrayOf("9:00 - 12:00", "12:00 - 14:00"))
        arrayAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerTimeEdit.adapter = arrayAdapter3

        //ivShare3i.setOnClickListener(this)
        //ivTrash3i.setOnClickListener(this)
        fivePrimeSave.setOnClickListener(this)

        super.onViewCreated(view, savedInstanceState)
    }

    override fun onClick(p0: View?) {
        when (p0){
            fivePrimeSave -> {
                fragmentManager?.beginTransaction()?.replace(R.id.fragment_container,FiveFragment())
                    ?.commit()

            }
        }
    }

}