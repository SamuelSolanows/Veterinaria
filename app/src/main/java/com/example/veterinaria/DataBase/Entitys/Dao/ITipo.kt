package com.example.veterinaria.DataBase.Entitys.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.Companion.IGNORE
import androidx.room.Query
import androidx.room.Update
import com.example.veterinaria.DataBase.Entitys.Tipo

@Dao
interface ITipo {
    @Insert(onConflict = IGNORE)
    suspend fun Insertar(tipo: Tipo)

    @Update(onConflict = IGNORE)
    suspend fun Actualizar(tipo: Tipo)

    @Delete
    suspend fun Eliminar(tipo: Tipo)

    @Query("SELECT * FROM Tipo")
    fun Get(): List<Tipo>
}