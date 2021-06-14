package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
/*
TODO : When clicking equals after an operation, press another number which works but then trying to add another number to this new number causes the numbers to concatenate rather than doing the operation
 */


class MainActivity : AppCompatActivity() {

    private lateinit var tvResult : TextView
    private var zeroClicked = false
    private var periodClicked = false
    private var plusClicked : Boolean = false
    private var subtractionClicked : Boolean = false
    private var multiplicationClicked : Boolean = false
    private var divisionClicked : Boolean = false
    private var percentageClicked : Boolean = false
    private var equalsClicked : Boolean = false
    private var number1 : Double = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tvResult = findViewById(R.id.tv_result)

    }//end of onCreate

    fun operationFunction(view : View){


        //view.id grabs the view's id name that is calling this method. The method is called in the main activity xml file inside each button view
        when(view.id){

            R.id.bt_one -> {

                val number = if(tvResult.text.toString() == "0" || equalsClicked) "1"
                else if(tvResult.text.toString().contains(".") && !zeroClicked && periodClicked && tvResult.text.toString()[tvResult.text.toString().length - 1] == '0') {
                    tvResult.text.toString().substring(0, tvResult.text.toString().length - 1) + "1"
                } else tvResult.text.toString() + "1"
                tvResult.text = number
                periodClicked = false
                zeroClicked = false
                equalsClicked = false
            }

            R.id.bt_two -> {
                val number = if(tvResult.text.toString() == "0" || equalsClicked) "2"
                else if(tvResult.text.toString().contains(".") && !zeroClicked && periodClicked && tvResult.text.toString()[tvResult.text.toString().length - 1] == '0') {
                    tvResult.text.toString().substring(0, tvResult.text.toString().length - 1) + "2"
                }
                else tvResult.text.toString() + "2"
                tvResult.text = number
                periodClicked = false
                zeroClicked = false
                equalsClicked = false
            }

            R.id.bt_three -> {
                val number = if(tvResult.text.toString() == "0" || equalsClicked) "3"
                else if(tvResult.text.toString().contains(".") && !zeroClicked && periodClicked && tvResult.text.toString()[tvResult.text.toString().length - 1] == '0') {
                    tvResult.text.toString().substring(0, tvResult.text.toString().length - 1) + "3"
                }
                else tvResult.text.toString() + "3"
                tvResult.text = number
                periodClicked = false
                zeroClicked = false
                equalsClicked = false
            }

            R.id.bt_four -> {
                val number = if(tvResult.text.toString() == "0" || equalsClicked) "4"
                else if(tvResult.text.toString().contains(".") && !zeroClicked && periodClicked && tvResult.text.toString()[tvResult.text.toString().length - 1] == '0') {
                    tvResult.text.toString().substring(0, tvResult.text.toString().length - 1) + "4"
                }
                else tvResult.text.toString() + "4"
                tvResult.text = number
                periodClicked = false
                zeroClicked = false
                equalsClicked = false
            }

            R.id.bt_five -> {
                val number = if(tvResult.text.toString() == "0" || equalsClicked) "5"
                else if(tvResult.text.toString().contains(".") && !zeroClicked && periodClicked && tvResult.text.toString()[tvResult.text.toString().length - 1] == '0') {
                    tvResult.text.toString().substring(0, tvResult.text.toString().length - 1) + "5"
                }
                else tvResult.text.toString() + "5"
                tvResult.text = number
                periodClicked = false
                zeroClicked = false
                equalsClicked = false
            }

            R.id.bt_six -> {
                val number = if(tvResult.text.toString() == "0" || equalsClicked) "6"
                else if(tvResult.text.toString().contains(".") && !zeroClicked && periodClicked && tvResult.text.toString()[tvResult.text.toString().length - 1] == '0') {
                    tvResult.text.toString().substring(0, tvResult.text.toString().length - 1) + "6"
                }
                else tvResult.text.toString() + "6"
                tvResult.text = number
                periodClicked = false
                zeroClicked = false
                equalsClicked = false
            }

            R.id.bt_seven -> {
                val number = if(tvResult.text.toString() == "0" || equalsClicked) "7"
                else if(tvResult.text.toString().contains(".") && !zeroClicked && periodClicked && tvResult.text.toString()[tvResult.text.toString().length - 1] == '0') {
                    tvResult.text.toString().substring(0, tvResult.text.toString().length - 1) + "7"
                }
                else tvResult.text.toString() + "7"
                tvResult.text = number
                periodClicked = false
                zeroClicked = false
                equalsClicked = false
            }

            R.id.bt_eight -> {
                val number = if(tvResult.text.toString() == "0" || equalsClicked) "8"
                else if(tvResult.text.toString().contains(".") && !zeroClicked && periodClicked && tvResult.text.toString()[tvResult.text.toString().length - 1] == '0') {
                    tvResult.text.toString().substring(0, tvResult.text.toString().length - 1) + "8"
                }
                else tvResult.text.toString() + "8"
                tvResult.text = number
                periodClicked = false
                zeroClicked = false
                equalsClicked = false
            }

            R.id.bt_nine -> {
                val number = if(tvResult.text.toString() == "0" || equalsClicked) "9"
                else if(tvResult.text.toString().contains(".") && !zeroClicked && periodClicked && tvResult.text.toString()[tvResult.text.toString().length - 1] == '0') {
                    tvResult.text.toString().substring(0, tvResult.text.toString().length - 1) + "9"
                }
                else tvResult.text.toString() + "9"
                tvResult.text = number
                periodClicked = false
                zeroClicked = false
                equalsClicked = false
            }

            R.id.bt_zero -> {
                val number = if(tvResult.text.toString() == "0" || tvResult.text.toString() == "0.0" || periodClicked) tvResult.text.toString()
                else if(equalsClicked) "0"
                else tvResult.text.toString() + "0"
                tvResult.text = number
                periodClicked = false
                zeroClicked = true
                equalsClicked = false
            }

            R.id.bt_period -> {
                val number = if(tvResult.text.toString() == "0" && !tvResult.text.toString().contains(".") || tvResult.text.toString() != "0" && !tvResult.text.toString().contains(".")) tvResult.text.toString() + ".0"
                else tvResult.text.toString()
                tvResult.text = number
                periodClicked = true
                zeroClicked = false
                equalsClicked = false
            }

            R.id.bt_clear -> {
                plusClicked = false
                subtractionClicked = false
                multiplicationClicked = false
                divisionClicked = false
                percentageClicked = false
                periodClicked = false
                equalsClicked = false
                tvResult.text = "0"
                number1 = 0.0
            }

            R.id.bt_addition -> {
                when {
                    number1 == 0.0 -> {
                        number1 = tvResult.text.toString().toDouble()
                        tvResult.text = "0"
                    }
                    equalsClicked -> {
                        if(plusClicked) {
                            number1 = tvResult.text.toString().toDouble()
                            tvResult.text = "0"
                        }else{
                            number1 = tvResult.text.toString().toDouble()
                            tvResult.text = "0"
                        }
                    }
                    plusClicked -> {
                        number1 += tvResult.text.toString().toDouble()
                        tvResult.text = "0"
                    }
                    number1 != 0.0 -> {
                        number1 += tvResult.text.toString().toDouble()
                    }
                }
                plusClicked = true
                subtractionClicked = false
                multiplicationClicked = false
                divisionClicked = false
                percentageClicked = false
                periodClicked = false
                equalsClicked = false
            }

            R.id.bt_subtraction -> {
                when {
                    number1 == 0.0 -> {
                        number1 = tvResult.text.toString().toDouble()
                        tvResult.text = "0"
                    }
                    subtractionClicked -> {
                        number1 += tvResult.text.toString().toDouble()
                        tvResult.text = "0"
                    }
                    equalsClicked -> {
                        number1 = tvResult.text.toString().toDouble()
                        tvResult.text = "0"
                    }
                    number1 != 0.0 -> {
                        number1 -= tvResult.text.toString().toDouble()
                    }
                }
                subtractionClicked = true
                plusClicked = false
                multiplicationClicked = false
                divisionClicked = false
                percentageClicked = false
                periodClicked = false
                equalsClicked = false
            }

            R.id.bt_multiplication -> {
                when {
                    number1 == 0.0 -> {
                        number1 = tvResult.text.toString().toDouble()
                        tvResult.text = "0"
                    }
                    multiplicationClicked -> {
                        number1 += tvResult.text.toString().toDouble()
                        tvResult.text = "0"
                    }
                    equalsClicked -> {
                        number1 = tvResult.text.toString().toDouble()
                        tvResult.text = "0"
                    }
                    number1 != 0.0 -> {
                        number1 *= tvResult.text.toString().toDouble()
                    }
                }
                multiplicationClicked = true
                subtractionClicked = false
                plusClicked = false
                divisionClicked = false
                percentageClicked = false
                periodClicked = false
                equalsClicked = false
            }

            R.id.bt_division -> {
                when {
                    number1 == 0.0 -> {
                        number1 = tvResult.text.toString().toDouble()
                        tvResult.text = "0"
                    }
                    divisionClicked -> {
                        number1 += tvResult.text.toString().toDouble()
                        tvResult.text = "0"
                    }
                    equalsClicked -> {
                        number1 = tvResult.text.toString().toDouble()
                        tvResult.text = "0"
                    }
                    number1 != 0.0 -> {
                        number1 /= tvResult.text.toString().toDouble()
                    }
                }
                divisionClicked = true
                subtractionClicked = false
                multiplicationClicked = false
                plusClicked = false
                percentageClicked = false
                periodClicked = false
                equalsClicked = false
            }

            R.id.bt_percentage -> {
                when {
                    number1 == 0.0 -> {
                        number1 = (tvResult.text.toString().toDouble())/100
                        tvResult.text = "0"
                    }
                    percentageClicked -> {
                        number1 *= ((tvResult.text.toString().toDouble())/100)
                        tvResult.text = "0"
                    }
                    equalsClicked -> {
                        number1 = (tvResult.text.toString().toDouble())/100
                        tvResult.text = "0"
                    }
                    number1 != 0.0 -> {
                        number1 *= ((tvResult.text.toString().toDouble())/100)
                    }
                }
                percentageClicked = true
                subtractionClicked = false
                multiplicationClicked = false
                divisionClicked = false
                plusClicked = false
                periodClicked = false
                equalsClicked = false
            }

            R.id.bt_equals -> {
                if(plusClicked){
                    number1 += tvResult.text.toString().toDouble()
                    if(number1 % 1 == 0.0){
                        tvResult.text = number1.toInt().toString()
                    }else{
                        tvResult.text = number1.toString()
                    }
                }else if(subtractionClicked){
                    number1 -= tvResult.text.toString().toDouble()
                    if(number1 % 1 == 0.0){
                        tvResult.text = number1.toInt().toString()
                    }else{
                        tvResult.text = number1.toString()
                    }
                }else if(multiplicationClicked){
                    number1 *= tvResult.text.toString().toDouble()
                    if(number1 % 1 == 0.0){
                        tvResult.text = number1.toInt().toString()
                    }else{
                        tvResult.text = number1.toString()
                    }
                }else if(divisionClicked){
                    number1 /= tvResult.text.toString().toDouble()
                    if(number1 % 1 == 0.0){
                        tvResult.text = number1.toInt().toString()
                    }else{
                        tvResult.text = number1.toString()
                    }
                }else if(percentageClicked){
                        number1 *= tvResult.text.toString().toDouble()
                        tvResult.text = number1.toString()
                    }
                equalsClicked = true
                plusClicked = false
                subtractionClicked = false
                multiplicationClicked = false
                divisionClicked = false
                percentageClicked = false
            }


            }

        }

} //end of class