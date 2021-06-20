package dt.prot.tourkras

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.annotation.IdRes
import androidx.annotation.LayoutRes


class ListAdapter(
    context: Context,
    @LayoutRes res: Int,
    //@IdRes idRes: Int,
    dataModel: MutableList<DataModelHome>,
   // mainActivity: MainActivity,

    ) : BaseAdapter() {

    private val _res: Int = res
    //private val _idRes: Int = idRes
    private val _dataModel:MutableList<DataModelHome> = dataModel
    private var lInflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    private val _context: Context = context
    //private val _mainActivity:MainActivity = mainActivity

    override fun getCount(): Int {
        return _dataModel.size
    }

    override fun getItem(p0: Int): Any {
        return _dataModel[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View? {
        var view: View? = p1
        if (view == null) {
            view = lInflater.inflate(_res, p2, false)
            view.findViewById<TextView>(R.id.textName1).text = _dataModel[p0].name
            view.findViewById<TextView>(R.id.textName2).text = _dataModel[p0].text
            view.findViewById<TextView>(R.id.textName3).text = _dataModel[p0].text2
        }
        return view
    }
}