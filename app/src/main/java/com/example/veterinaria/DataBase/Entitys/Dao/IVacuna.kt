package com.example.veterinaria.DataBase.Entitys.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.veterinaria.DataBase.Entitys.Vacuna

@Dao
interface IVacuna {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun Insertar(vacuna: Vacuna)

    @Update(onConflict = OnConflictStrategy.IGNORE)
    suspend fun Actualizar(vacuna: Vacuna)

    @Delete
    suspend fun Eliminar(vacuna: Vacuna)

    @Query("SELECT * FROM Vacuna")
    fun Get(): List<Vacuna>
}