package com.example.anew.models

import com.example.anew.utils.Default_Icon

//objective is to maintain memory of the game at a particular state in time
//delegate responsibility of creating all the card

class MemoryGame (private val boardSize: BoardSize){

    val cards : List<MemoryCard>
    val pairsFound = 0


     init {
         //Adding the icons to the game
         val  chosenImage = Default_Icon.shuffled().take(boardSize.getPairs())
         val randomizedImage = (chosenImage + chosenImage ).shuffled()
         cards =  randomizedImage.map { MemoryCard(it) }// we cant use all the 3 parameters isfaceup and is mached as we have set default values


     }



}