package uz.revolution.playmarket.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import jp.wasabeef.recyclerview.animators.SlideInLeftAnimator
import kotlinx.android.synthetic.main.item_general.view.*
import uz.revolution.playmarket.R
import uz.revolution.playmarket.models.GeneralData

class ProgramAdapter(var context: Context,var generalList:ArrayList <GeneralData>):RecyclerView.Adapter<ProgramAdapter.VH>() {

    inner class VH (itemView: View): RecyclerView.ViewHolder(itemView){

        fun onBind(generalData: GeneralData) {
            itemView.type.text = generalData.type
            itemView.animation=AnimationUtils.loadAnimation(context,R.anim.anim1)
//            itemView.animation=AnimationUtils.loadAnimation(context,R.anim.anim3)
//            itemView.animation=AnimationUtils.loadAnimation(context,R.anim.anim4)
            val inProgramAdapter=InProgramAdapter(context,generalData.listApp)

            itemView.rv_2.adapter=inProgramAdapter
            itemView.rv_2.itemAnimator=SlideInLeftAnimator()

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {

        return VH(LayoutInflater.from(parent.context).inflate(R.layout.item_general,parent,false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(generalList[position])
    }

    override fun getItemCount(): Int {
        return generalList.size
    }
}
