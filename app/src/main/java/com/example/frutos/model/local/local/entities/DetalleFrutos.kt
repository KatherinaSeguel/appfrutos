package com.example.frutos.model.local.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "detallefrutos_table")
data class DetalleFrutos(
    @PrimaryKey val imageUrl: Char,
    val botname: String,
    val imageurl: String,
    val othname: String,
    val tfvname: String
)
