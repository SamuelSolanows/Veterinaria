package com.example.veterinaria.DataBase.Entitys

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Tipo(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    @ColumnInfo
    var nombre: String
)