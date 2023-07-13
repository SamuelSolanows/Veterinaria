package com.example.veterinaria.DataBase.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.veterinaria.DataBase.Entitys.Mascota
import com.example.veterinaria.DataBase.Entitys.Tipo

@Dao
interface IMascota {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun Insertar(mascota: Mascota)

    @Update(onConflict = OnConflictStrategy.IGNORE)
    suspend fun Actualizar(mascota: Mascota)

    @Delete
    suspend fun Eliminar(mascota: Mascota)

    @Query("SELECT * FROM Mascota")
    fun Get(): List<Mascota>
}