package ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.homework_room_1.R
import data.AppDataBase
import data.EtData
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    private var db:AppDataBase? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        db = MyApp.app?.getDB()
        setupListeners()
    }

    private fun setupListeners(){
        btnSave.setOnClickListener {
            db?.getEtDao()?.insertEtData(fetchData())
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun fetchData():EtData{
        return EtData(
            etTitle =  etTitle.text.toString(),
            etDesc = etDesc.text.toString()
        )
    }
}