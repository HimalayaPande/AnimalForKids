package com.capgemini.animalforkids

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AnimalTypeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AnimalTypeFragment : Fragment() {

    lateinit var radioGroup : RadioGroup
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_animal_type, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        radioGroup = view.findViewById(R.id.typeRG)

        when(radioGroup.checkedRadioButtonId){

            R.id.RB1 -> {

            }
        }
        super.onViewCreated(view, savedInstanceState)
    }


}