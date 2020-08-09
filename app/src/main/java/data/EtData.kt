package data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "et_data")
data class EtData (
    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,
    var etTitle:String,
    var etDesc:String
)