package vcmsa.ci.myfood

import android.os.Bundle
import android.os.Process
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    private var inputText: EditText? = null
    private var foodText: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        inputText = findViewById(R.id.inputText)
        foodText = findViewById(R.id.foodText)

        val btnSuggest = findViewById<Button>(R.id.btnSuggest)
        val btnExit = findViewById<Button>(R.id.btnExit)
        val btnClear = findViewById<Button>(R.id.btnClear)

        btnSuggest.setOnClickListener {
            suggestMeal()
        }

        btnExit.setOnClickListener {
            moveTaskToBack(true)
            Process.killProcess(Process.myPid())
            exitProcess(1)
        }

        btnClear.setOnClickListener {
            inputText?.text?.clear()
            foodText?.text = ""
        }
    }

    private fun suggestMeal() {
        val timeOfDay = inputText?.text.toString().trim().lowercase()
        val mealSuggestion = when (timeOfDay) {
            "morning" -> "Cereal, Omelette, Bacon and egg sandwich, Flapjacks, and Porridge."
            "afternoon" -> "Muffins, Flapjacks, Toast sandwich, Pasta, and Salad."
            "Evening" -> "Waffels, Mango, wraps, burritos, and tacos. "
            "Night" -> "Burger, Pizza, Spaghetti, Seafood, and Chinese."
            "midnight" -> "Chocolate, sushi, and caramel macchiato, Ice cream, sushi, and Mcflurry"
            else -> "Please enter a correct time of day"
        }
        foodText?.text = mealSuggestion
    }
}