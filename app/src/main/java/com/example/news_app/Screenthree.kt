package com.example.news_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Screenthree(navController: NavController) {
    Column(
        modifier = Modifier
            .background(color=Color(0xFF33691E))
    ) {
        TopAppBar( title = {
            Row(
                modifier = Modifier
                    .height(50.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Image(
                    painter = painterResource(R.drawable.ic_arrow_back),
                    contentDescription = "Description",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp)
                        .padding(6.dp)
                        .clickable { navController.navigate("A") },
                    )
            }

        }, backgroundColor = Color(0xFF2E7D32))
        // appbar

        Column(
            modifier = Modifier
                .padding(6.dp)
                .fillMaxWidth()
        ) {
            Image(painter = painterResource(R.drawable.p3),
                contentDescription = "Description",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Column(
                modifier = Modifier
                    .padding(6.dp)
                    .background(color= Color(0xFFA5D6A7))
            ) {

                Row(
                    modifier = Modifier
                        .padding(6.dp)) {
                    Text(
                        "???????????????????????????????????????????????????????????????!!!",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.W800,
                        )
                    )
                }

                Text(
                    "22 ??????.???. 65 (05:30 ???.)",
                    style = TextStyle(
                        fontSize = 14.sp
                    )
                )
                Column(
                    modifier = Modifier
                        .padding(6.dp)
                ) {
                    Text(text = " ?????????????????????????????? ??? ??????????????????????????? ??????????????????????????????????????????????????????????????????????????? ???????????????????????? ??? ????????????????????????????????????????????????????????? ??????????????????????????????????????????????????????????????????????????? ?????????????????????????????????????????????????????? 36-38 ???????????????????????????????????????????????????????????????(???????????????) ??????????????????????????????????????????????????? ????????? ??? ???????????????????????? ?????????????????????????????????????????????????????????????????????????????? ???????????????????????????????????? ??????????????????????????????????????????????????????????????????????????? ???????????????????????????????????????????????????????????????????????? ????????????????????????????????????????????????????????????????????????????????? ????????????????????????????????????????????? ???????????????????????????????????????????????????????????? ??????????????????????????????????????? ????????????????????????????????????????????? ???????????????????????????????????????????????????????????????????????? ???????????????????????????????????????????????????????????? ?????????????????????????????????????????????????????? ?????????????????????????????? ??????????????????????????? ?????????????????????????????????????????? ???????????????????????????????????? ?????????????????????????????????????????????????????????????????????????????? ?????????????????????????????????????????????????????? ????????????????????????????????????????????? ???????????????????????????????????? ?????????????????????????????????????????? ???????????????????????????????????? ??????????????????????????? ?????????????????????????????????????????????????????? ??????????????????????????????????????? ???????????????????????????????????????????????????????????????????????? ")
                }

            }

        }

    }
}