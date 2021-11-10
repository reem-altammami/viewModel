package ui.score

import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel(){

    private var _score = 0
    val score: Int
        get() = _score

     fun getScoreAddingOnePoint(): Int {
         _score += 1
         return _score
    }

     fun getScoreAddingFourPoint(): Int {
         _score += 4
         return _score
    }

     fun getScoreSubtractingTwoPoint() : Int{
        if (_score > 1) {
            _score -= 2
        }
        else {
            _score = 0
        }
         return _score
    }
}