package com.otake.marcos.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() } // chama a funcao rollDice dentro da Main
        rollDice()// chama a função para que algo seja mostrado no inicio da aplicação
    }

    private fun rollDice() {
  //Crie um novo objeto de Dados com 6 lados e lance os dados
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceRoll2 = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)
        val diceImageTwo: ImageView = findViewById(R.id.imageView2)

  //Determina qual é a ID de recurso drawable usar com base na jogada de dados
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
   //Atualize o ImageView com o ID de recurso drawable correto
        diceImage.setImageResource(drawableResource)

   //Determina qual é a ID de recurso drawable usar com base na jogada de dados nº 2
        val drawableResource2 = when (diceRoll2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImageTwo.setImageResource(drawableResource2)

   /*Atualiza a descrição do conteúdo
     diceImage.contentDescription = diceRoll.toString() */
    }
}

// classe com parametro numerico inteiro
private class Dice(val numSides: Int) {
    fun roll(): Int { // funcao com retorno de numeros randomicos
        return (1..numSides).random()
    }
}

private class Dice2(val numSides: Int) {
    fun roll(): Int { // funcao com retorno de numeros randomicos
        return (1..numSides).random()
    }
}

/*
fun main() {
    val myFirstDice = Dice(8)
    val rollResult = myFirstDice.roll()
    val luckyNumber = 4
    when (rollResult) {
        luckyNumber -> println("You won!")
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        4 -> println("No luck! You rolled a 4. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! you rolled a 6. Try again!")
        7 -> println("Don't cry! You rolled a 7. Try again!")
        8 -> println("So sorry! you rolled a 8. Try again!")
    }
}

 */



