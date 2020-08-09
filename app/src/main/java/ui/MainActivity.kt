package ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.homework_room_1.R
import data.AppDataBase
import kotlinx.android.synthetic.main.activity_main.*
import recycler.GridAdapter

class MainActivity : AppCompatActivity() {
    private var db: AppDataBase? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        db = MyApp.app?.getDB()
        setupRecycler()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_add,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_add->{
                this.startActivity(Intent(this,SecondActivity::class.java))
            }
        }
        return super.onOptionsItemSelected(item)
    }
    private fun setupRecycler() {
        val manager = GridLayoutManager(applicationContext,2)
        grid_recycler.layoutManager = manager
        val adapter = GridAdapter()
        grid_recycler.adapter = adapter
        val data = db?.getEtDao()?.getAllEtData()

        if(data!= null)
        adapter.update(data)
    }

}