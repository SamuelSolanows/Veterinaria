package com.example.veterinaria.DataBase.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.veterinaria.DataBase.Entitys.Raza
import com.example.veterinaria.DataBase.Entitys.Tipo

@Dao
interface IRaza {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun Insertar(raza: Raza)

    @Update(onConflict = OnConflictStrategy.IGNORE)
    suspend fun Actualizar(raza: Raza)

    @Delete
    suspend fun Eliminar(raza: Raza)

    @Query("SELECT * FROM Raza")
    fun Get(): List<Raza>
}