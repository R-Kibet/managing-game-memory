package com.example.anew.models

//list out all attribute of a memory card identifier ,face up/down & id matched

data class MemoryCard (
    //create identifier so as to show uniqueness of a card
    val identifier: Int,
    var isFaceUp: Boolean = false,
    var isMatched : Boolean =false

)