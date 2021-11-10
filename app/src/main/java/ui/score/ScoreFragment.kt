package ui.score

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.viewmodel.R
import com.example.viewmodel.databinding.FragmentScoreBinding

class ScoreFragment : Fragment() {
    private val scoreView: ScoreViewModel by viewModels()
private var _binding : FragmentScoreBinding? = null
    val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentScoreBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.add1.setOnClickListener {
            binding.score.text = scoreView.getScoreAddingOnePoint().toString()
        }
        binding.sub2.setOnClickListener {
            binding.score.text = scoreView.getScoreSubtractingTwoPoint().toString()

        }
        binding.add4.setOnClickListener {
            binding.score.text = scoreView.getScoreAddingFourPoint().toString()
        }

    }


}