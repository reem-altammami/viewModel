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

            _score -= 2


         return _score
    }
}