package com.example.veterinaria.DataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.veterinaria.DataBase.Entitys.Dao.IMascota
import com.example.veterinaria.DataBase.Entitys.Dao.IRaza
import com.example.veterinaria.DataBase.Entitys.Dao.ITipo
import com.example.veterinaria.DataBase.Entitys.Dao.IVacuna
import com.example.veterinaria.DataBase.Entitys.Mascota
import com.example.veterinaria.DataBase.Entitys.Raza
import com.example.veterinaria.DataBase.Entitys.Tipo
import com.example.veterinaria.DataBase.Entitys.Vacuna

@Database(entities = [Tipo::class, Raza::class, Vacuna::class, Mascota::class], version = 1)
abstract class DBconexion : RoomDatabase() {
    abstract fun MascotaDao(): IMascota
    abstract fun TipoDao(): ITipo
    abstract fun VacunaDao(): IVacuna
    abstract fun RazaDao(): IRaza

    companion object {
        @Volatile
        private var INSTA: DBconexion? = null
        fun GetDatabase(context: Context): DBconexion {
            if (INSTA != null) {
                return INSTA!!
            }

            INSTA = Room.databaseBuilder(context.applicationContext, DBconexion::class.java, "db")
                .build()
            return INSTA!!
        }
    }

}