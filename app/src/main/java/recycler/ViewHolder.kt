package recycler

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import data.EtData
import kotlinx.android.synthetic.main.grid_layout.view.*

class ViewHolder(view:View):RecyclerView.ViewHolder(view) {
    fun bind(etData: EtData){
        itemView.tv_title.text = etData.etTitle
        itemView.tv_desc.text = etData.etDesc
    }
}