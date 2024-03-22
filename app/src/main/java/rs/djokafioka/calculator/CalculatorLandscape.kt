package rs.djokafioka.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import rs.djokafioka.calculator.ui.theme.LightGray
import rs.djokafioka.calculator.ui.theme.LimeGreen
import rs.djokafioka.calculator.ui.theme.MediumGray
import rs.djokafioka.calculator.ui.theme.Orange
import java.text.DecimalFormat
import java.text.NumberFormat

/**
 * Created by Djordje on 21.9.2023..
 */

@Composable
fun CalculatorLandscape(
    state: CalculatorState,
    modifier: Modifier,
    buttonSpacing: Dp = 8.dp,
    onAction: (CalculatorAction) -> Unit
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Bottom) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Bottom
            ) {
                //Calculation textbox
                val nf: NumberFormat = DecimalFormat("##.#############")
                val num1 = state.number1.toDoubleOrNull()
                val num2 = state.number2.toDoubleOrNull()
                val num2Formatted = if (num2 == null)
                    ""
                else
                    nf.format(num2)
                Text(
                    //text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                    text = nf.format(num1 ?: 0)
                            + (state.operation?.symbol ?: "")
                            + num2Formatted,
                    textAlign = TextAlign.End,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 32.dp),
                    fontWeight = FontWeight.Light,
                    fontSize = 80.sp,
                    color = Color.White,
                    maxLines = 2
                )
            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Bottom
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    //Numbers and symbols
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                    ) {
                        //AC
                        CalculatorButtonLand(
                            symbol = "AC",
                            modifier = Modifier
                                .background(LightGray)
                                .weight(2f),
                            onClick = {
                                onAction(CalculatorAction.Clear)
                            }
                        )
                        //Del
                        CalculatorButtonLand(
                            symbol = "Del",
                            modifier = Modifier
                                .background(LightGray)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Delete)
                            }
                        )
                        //Divide
                        CalculatorButtonLand(
                            symbol = "/",
                            modifier = Modifier
                                .background(Orange)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                            }
                        )

                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                    ) {
                        //7
                        CalculatorButtonLand(
                            symbol = "7",
                            modifier = Modifier
                                .background(Color.DarkGray)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Number(7))
                            }
                        )
                        //8
                        CalculatorButtonLand(
                            symbol = "8",
                            modifier = Modifier
                                .background(Color.DarkGray)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Number(8))
                            }
                        )
                        //9
                        CalculatorButtonLand(
                            symbol = "9",
                            modifier = Modifier
                                .background(Color.DarkGray)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Number(9))
                            }
                        )
                        //Multiply
                        CalculatorButtonLand(
                            symbol = "x",
                            modifier = Modifier
                                .background(Orange)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
                            }
                        )
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                    ) {
                        //4
                        CalculatorButtonLand(
                            symbol = "4",
                            modifier = Modifier
                                .background(Color.DarkGray)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Number(4))
                            }
                        )
                        //5
                        CalculatorButtonLand(
                            symbol = "5",
                            modifier = Modifier
                                .background(Color.DarkGray)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Number(5))
                            }
                        )
                        //6
                        CalculatorButtonLand(
                            symbol = "6",
                            modifier = Modifier
                                .background(Color.DarkGray)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Number(6))
                            }
                        )
                        //Subtract
                        CalculatorButtonLand(
                            symbol = "-",
                            modifier = Modifier
                                .background(Orange)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Operation(CalculatorOperation.Subtract))
                            }
                        )
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                    ) {
                        //1
                        CalculatorButtonLand(
                            symbol = "1",
                            modifier = Modifier
                                .background(Color.DarkGray)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Number(1))
                            }
                        )
                        //2
                        CalculatorButtonLand(
                            symbol = "2",
                            modifier = Modifier
                                .background(Color.DarkGray)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Number(2))
                            }
                        )
                        //3
                        CalculatorButtonLand(
                            symbol = "3",
                            modifier = Modifier
                                .background(Color.DarkGray)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Number(3))
                            }
                        )
                        //Add
                        CalculatorButtonLand(
                            symbol = "+",
                            modifier = Modifier
                                .background(Orange)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Operation(CalculatorOperation.Add))
                            }
                        )
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                    ) {
                        //0
                        CalculatorButtonLand(
                            symbol = "0",
                            modifier = Modifier
                                .background(Color.DarkGray)
                                .weight(2f),
                            onClick = {
                                onAction(CalculatorAction.Number(0))
                            }
                        )
                        //Decimal
                        CalculatorButtonLand(
                            symbol = ".",
                            modifier = Modifier
                                .background(Color.DarkGray)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Decimal)
                            }
                        )
                        //=
                        CalculatorButtonLand(
                            symbol = "=",
                            modifier = Modifier
                                .background(LimeGreen)
                                .weight(1f),
                            onClick = {
                                onAction(CalculatorAction.Calculate)
                            }
                        )
                    }
                }
            }
        }
    }
}

@Preview(
    showSystemUi = true,
    device = Devices.AUTOMOTIVE_1024p, widthDp = 1024, heightDp = 720
)
@Composable
fun SimpleComposablePreview() {
    CalculatorLandscape(
        state = CalculatorState(number1 = "0"),
        modifier = Modifier.background(MediumGray),
        onAction = { _ -> Unit }
    )
}