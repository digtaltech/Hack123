package dt.prot.tourkras

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.annotation.IdRes
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dt.prot.tourkras.fragment.SettingsFragment2


class ListAdapterRecycler(
    context: Context,
    @LayoutRes res: Int,
    @IdRes idRes: Int,
    dataModel: MutableList<DataModel>,
    mainActivity: MainActivity,
    num:Boolean
    ) : RecyclerView.Adapter<ListAdapterRecycler.ViewHolder>() {

    private val _res: Int = res
    private val _idRes: Int = idRes
    private val _dataModel:MutableList<DataModel> = dataModel
    private var lInflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    private val _context: Context = context
    private val _mainActivity:MainActivity = mainActivity
    private val _num:Boolean = num

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = lInflater.inflate(_res, parent, false)
        return ViewHolder(view,view,_num)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameView.text = _dataModel[position].name
        holder.listItem.layoutManager = LinearLayoutManager(_context,
            LinearLayoutManager.VERTICAL,false)
        holder.listItem.adapter = ListAdapterItemRecycler(
                _context,
                R.layout.item_item_cart_fr_settings,
                _dataModel[position],
                _mainActivity
            )
        if (_num){
            holder.buttontext?.setOnClickListener(_mainActivity.settingsFragment as SettingsFragment2)
        }
    }

    override fun getItemCount(): Int {
        return _dataModel.size
    }


    class ViewHolder(view: View, itemView: View,num: Boolean) : RecyclerView.ViewHolder(itemView) {
        val listItem: RecyclerView = view.findViewById<RecyclerView>(R.id.listFrSettingItem)
        val nameView: TextView = view.findViewById<TextView>(R.id.textName1)

        var buttontext: TextView? = null

        init {
            if (num)
            buttontext = view.findViewById(R.id.buttonNewPoint)
        }
    }
}