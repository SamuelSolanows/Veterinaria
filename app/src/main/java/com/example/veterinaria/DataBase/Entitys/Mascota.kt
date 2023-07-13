package com.example.veterinaria.DataBase.Entitys

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [ForeignKey(
        entity = Tipo::class,
        parentColumns = ["id"],
        childColumns = ["idTipo"]
    ), ForeignKey(entity = Raza::class,
        parentColumns = ["id"],
        childColumns = ["idRaza"])]
)
data class Mascota(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    @ColumnInfo
    var nombre: String,
    @ColumnInfo
    var idTipo: Int,
    @ColumnInfo
    var idRaza: Int,
    @ColumnInfo
    var Nacimiento: String
)
