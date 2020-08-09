package recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework_room_1.R
import data.EtData

class GridAdapter:RecyclerView.Adapter<ViewHolder>() {

    private var data = arrayListOf<EtData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_layout,parent,false)
        return ViewHolder(view)

    }

    fun update(data: List<EtData>){
        this.data.clear()
        this.data.addAll(data)
        notifyDataSetChanged()

    }

    override fun getItemCount(): Int {
        return data.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])

    }
}