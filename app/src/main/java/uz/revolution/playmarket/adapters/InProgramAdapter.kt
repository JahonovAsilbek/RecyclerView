package uz.revolution.playmarket.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_app.view.*
import uz.revolution.playmarket.R
import uz.revolution.playmarket.models.Program

class InProgramAdapter(var context: Context, var listProgram:List<Program>) :RecyclerView.Adapter<InProgramAdapter.VH>(){

    inner class VH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(program: Program) {
            itemView.app_image.setImageResource(program.image)
            itemView.app_name.text = program.name
            itemView.app_size.text=program.size
            itemView.animation=AnimationUtils.loadAnimation(context,R.anim.anim2)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(LayoutInflater.from(parent.context).inflate(R.layout.item_app, parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(listProgram[position])
    }

    override fun getItemCount(): Int = listProgram.size
}