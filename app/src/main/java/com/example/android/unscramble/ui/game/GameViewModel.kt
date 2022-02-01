package com.example.android.unscramble.ui.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {

    init {
        Log.d("GameFragment", "GameViewModel created!")
    }

    private var score = 0
    private var currentWordCount = 0
   // private var currentScrambledWord = "test"
   // Declare private mutable variable that can only be modified
// within the class it is declared.
   private var _count = 0

    // Declare another public immutable field and override its getter method.
// Return the private property's value in the getter method.
// When count is accessed, the get() function is called and
// the value of _count is returned.
    val count: Int
        get() = _count

    private var _currentScrambledWord = "test"
    val currentScrambledWord: String
        get() = _currentScrambledWord

    override fun onCleared() {
        super.onCleared()
        Log.d("GameFragment", "GameViewModel destroyed!")
    }

}