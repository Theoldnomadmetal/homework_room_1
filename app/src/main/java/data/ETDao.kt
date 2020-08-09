package data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ETDao {
    @Insert
    fun insertEtData(data: EtData)

    @Query("SELECT * FROM et_data")
    fun getAllEtData(): List<EtData>
}