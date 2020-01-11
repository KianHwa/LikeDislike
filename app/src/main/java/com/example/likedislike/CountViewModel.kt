package com.example.likedislike

import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {
    var countLike: Int = 0
    var countDislike: Int = 0
}