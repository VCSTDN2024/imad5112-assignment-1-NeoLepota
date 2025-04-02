
ST10494817
IMAD5112 ASSIGNMENT 1
GROUP 1


Github repository
https://github.com/VCSTDN2024/imad5112-assignment-1-NeoLepota
-----------------------------------------------------------------
Youtube link
https://studio.youtube.com/video/_tUkduq_xNg/edit
--------------------------------------------------------------------
Purpose of the app
The purpose of my app is to help people have specific options for every time of the day. This are for people who have a hard time deciding what to eat in the morning or evening. This shows them what they can eat for each time.
-----------------------------------------------------------------------------
The Design of the app
The Background of the app is red because it helps attract people and most food companies use them.
There are 3 buttons on the app. 
The suggestion button that suggests the food ( Colour of button black to compliment the red background)
The clear button that clears the text after is appears (Colour of button black to compliment background)
The exit button that exits the app ( Colour of button is black to compliment background)
------------------------------------------------------------------------------
Images and screenshots

![image](https://github.com/user-attachments/assets/33bc0780-5d2f-4b50-b81b-025f7db0f4c9)


Codes and references

    private var inputText: EditText? = null
    private var foodText: TextView? = null

These are variables that will make the user be able to type the time of day and display the suggested meals on the app.

    inputText = findViewById(R.id.inputText)
    foodText = findViewById(R.id.foodText)

The findViewById is used to find the elements in the layout and they are identified by their IDs


    val btnSuggest = findViewById<Button>(R.id.btnSuggest)
    val btnExit = findViewById<Button>(R.id.btnExit)
    val btnClear = findViewById<Button>(R.id.btnClear)

The btnSuggest will help activate the meal suggestion
The btnExit provides the function to exit button
The btnClear provides the function to clear the text from the EditText

    btnSuggest.setOnClickListener {
    suggestMeal()
    }

setOnClickListener for the suggest button. Enables when clicked it triggers the suggestion meal function.

    btnExit.setOnClickListener {
    moveTaskToBack(true)
    Process.killProcess(Process.myPid())
    exitProcess(1)
    }

  The setonclicklistner sets the button to exit the app
  Process.kill(process.mypid()) kills the app process.
  exitProcess(1) Ends the app.

     btnClear.setOnClickListener {
    inputText?.text?.clear()
    foodText?.text = ""
    }

This clears the inputText and resets the foodText.

    private fun suggestMeal() {
    val timeOfDay = inputText?.text.toString().trim().lowercase()

When button is clicked it retrieves the text typed into the inputText, trims any extra spaces, and the lowercase is for consistency.

    val mealSuggestion = when (timeOfDay) {
    "morning" -> "Cereal, Omelette, Bacon and egg sandwich, Flapjacks, and Porridge."
    "afternoon" -> "Muffins, Flapjacks, Toast sandwich, Pasta, and Salad."
    "Evening" -> "Waffels, Mango, wraps, burritos, and tacos. "
    "Night" -> "Burger, Pizza, Spaghetti, Seafood, and Chinese."
    "midnight" -> "Chocolate, sushi, and caramel macchiato, Ice cream, sushi, and Mcflurry"
    else -> "Please enter a correct time of day"
    }

The when statement allows user to pick different times and display the meal suggestion.
The esle show if user types anything else other thanthe times given, meals suggestions will not be given.

    foodText?.text = mealSuggestion

The meal suggestion is now displayed on foodText and TextView.

References
Bulbulia Zahra, Github Android Studio, 2024. [video online] Available at:<https://www.youtube.com/watch?v=bhfADZgW_4w> [Accessed 26 March 2025].
https://advtechonline.sharepoint.com/:w:/r/sites/TertiaryStudents/IIE%20Student%20Materials/New%20Student%20Materials%20CAT/IMAD5112/2025/Term%201/IMAD5112_MM.docx?d=wa1ff62f08e1a47bc99bdca07ae24427d&csf=1&web=1&e=JNsWBX
Mkihze Monde, IMAD5112 Video Demonstration Part 1, 2024. [video online] Available at:<https://www.youtube.com/watch?v=FSg-EjcYZHI&pp=ygUIaW1hZDUxMTI%3D>[Accessed 21 March 2025]



  




