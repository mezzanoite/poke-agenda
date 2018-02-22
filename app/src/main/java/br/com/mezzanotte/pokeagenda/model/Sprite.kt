package br.com.mezzanotte.pokeagenda.model

import com.google.gson.annotations.SerializedName


data class Sprite(@SerializedName("front_default") var frontDefault: String)