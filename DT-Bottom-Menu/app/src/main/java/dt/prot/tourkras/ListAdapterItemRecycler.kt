package dt.prot.tourkras

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.ColorStateList
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.annotation.IdRes
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView


class ListAdapterItemRecycler(
    context: Context,
    @LayoutRes res: Int,
    //@IdRes idRes: Int,
    dataModel: DataModel,
    mainActivity: MainActivity,

    ) : RecyclerView.Adapter<ListAdapterItemRecycler.ViewHolder>() {

    private val _res: Int = res
    //private val _idRes: Int = idRes
    private val _dataModel:DataModel = dataModel
    private var lInflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    private val _context: Context = context
    private val _mainActivity:MainActivity = mainActivity

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = lInflater.inflate(_res, parent, false)
        return ViewHolder(view,view)
    }


    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        holder.nameView.text = _dataModel.text[position]
        holder.timeView.text = _dataModel.time[position]
        if (_dataModel.timeIcon[position]) {
            holder.imageView.setImageResource(R.drawable.ic_clock_on)
            holder.timeView.setTextColor(R.color.text_red)
        }else{
            holder.imageView.setImageResource(R.drawable.ic_clock_off)
            holder.timeView.setTextColor(R.color.button_pm_stroke)
        }
    }

    override fun getItemCount(): Int {
        return _dataModel.text.size
    }
    class ViewHolder(view: View, itemView: View) : RecyclerView.ViewHolder(itemView) {
        //val listItem: ListView = view.findViewById<ListView>(R.id.listFrSettingItem)
        val nameView: TextView = view.findViewById<TextView>(R.id.cart_fr_text_item)
        val timeView: TextView = view.findViewById<TextView>(R.id.cart_fr_text_clock)
        val imageView: ImageView = view.findViewById<ImageView>(R.id.cart_fr_clock)
    }
}