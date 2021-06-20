package dt.prot.tourkras

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.LayoutRes


class ListAdapterItem(context: Context,
                      @LayoutRes res: Int,
                      dataModel: DataModel,
                      mainActivity: MainActivity
) : BaseAdapter() {

    private val _res: Int = res
    private val _dataModel:DataModel = dataModel
    private var lInflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    private val _context: Context = context
    private val _mainActivity:MainActivity = mainActivity

    override fun getCount(): Int {
        return _dataModel.text.size
    }

    override fun getItem(p0: Int): Any {
        return _dataModel.text[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View? {
        var view: View? = p1
        if (view == null) {
            view = lInflater.inflate(_res, p2, false)
            view.findViewById<TextView>(R.id.cart_fr_text_item).text = _dataModel.text[p0]
            view.findViewById<TextView>(R.id.cart_fr_text_clock).text = _dataModel.time[p0]
            if (_dataModel.timeIcon[p0])
                view.findViewById<ImageView>(R.id.cart_fr_clock).setImageResource(R.drawable.ic_clock_on)
            else
                view.findViewById<ImageView>(R.id.cart_fr_clock).setImageResource(R.drawable.ic_clock_off)
            Log.d("ds",""+_dataModel.text.size)

            _mainActivity.arrayViewListItem?.add(view)
        }
        return view
    }
}