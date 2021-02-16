package uz.revolution.playmarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import uz.revolution.playmarket.adapters.ProgramAdapter
import uz.revolution.playmarket.models.GeneralData
import uz.revolution.playmarket.models.Program

class MainActivity : AppCompatActivity() {

    lateinit var generalData: GeneralData
    lateinit var generalList:ArrayList<GeneralData>
    lateinit var programAdapter: ProgramAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()
        programAdapter = ProgramAdapter(this,generalList)
        rv.adapter=programAdapter

    }

    private fun loadData() {
        generalList= ArrayList()
        val program = Program(R.drawable.facebook, "Facebook", "56 mb")
        val program1 = Program(R.drawable.telegram, "Telegram", "23 mb")
        val program2 = Program(R.drawable.whatsapp, "WhatsApp", "21 mb")
        val program3 = Program(R.drawable.instagram, "Instagram", "41 mb")
        val program4 = Program(R.drawable.music, "Music", "12 mb")
        val program5 = Program(R.drawable.opera, "Opera", "36 mb")
        val program6 = Program(R.drawable.gallery, "Gallery", "13 mb")

        for (i in 0..99) {
            generalList.add(
                GeneralData(
                    "Recommended for you",
                    listOf(program, program1, program2, program3, program4, program5, program6)
                )
            )
            generalList.add(
                GeneralData(
                    "Educational",
                    listOf(program, program1, program2, program3, program4, program5, program6)
                )
            )
            generalList.add(
                GeneralData(
                    "Just updated",
                    listOf(program, program1, program2, program3, program4, program5, program6)
                )
            )
            generalList.add(
                GeneralData(
                    "Learn a language",
                    listOf(program, program1, program2, program3, program4, program5, program6)
                )
            )
            generalList.add(
                GeneralData(
                    "Low on space",
                    listOf(program, program1, program2, program3, program4, program5, program6)
                )
            )
            generalList.add(
                GeneralData(
                    "Travel & local",
                    listOf(program, program1, program2, program3, program4, program5, program6)
                )
            )
            generalList.add(
                GeneralData(
                    "Premium apps",
                    listOf(program, program1, program2, program3, program4, program5, program6)
                )
            )
        }
    }
}