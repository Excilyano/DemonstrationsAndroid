package com.example.demonstrationsandroid.findview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Utilisateur (var id: Int, var nom: String, var prenom: String) : Parcelable