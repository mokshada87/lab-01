package com.example.petshop

class Sad (date: String): Mood(date) {
    override fun moods(): String {
        return "I am feeling sad."
    }
}