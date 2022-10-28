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
fun Screentwo(navController: NavController) {
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
            Image(painter = painterResource(R.drawable.p2),
                contentDescription = "Description",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Column(
                modifier = Modifier
                    .padding(6.dp)
                    .background(color= Color(0xFFFFFFFF))
            ) {

                Row(
                    modifier = Modifier
                        .padding(6.dp)) {
                    Text(
                        "สนธิรัตน์ สะเทือนใจเหตุกราดยิงหนองบัวลำภู",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.W800,
                        )
                    )
                }

                Text(
                    "07 ต.ค. 65 (18:23 น.)",
                    style = TextStyle(
                        fontSize = 14.sp
                    )
                )
                Column(
                    modifier = Modifier
                        .padding(6.dp)
                ) {
                    Text(text = "  นายสนธิรัตน์ สนธิจิรวงศ์ เลขาธิการพรรคสร้างอนาคตไทย กล่าวถึงกรณีเกิดเหตุการณ์กราดยิงที่หนองบัวลำภู ว่า ตนรู้สึกเศร้าใจและเสียใจเป็นอย่างยิ่ง ต่อกรณีเกิดเหตุการณ์กราดยิงที่ ทำให้มีผู้เสียชีวิตจำนวนมาก ซึ่งมีทั้งเด็กเล็กและผู้สูงอายุ ทั้งนี้ ต่อเหตุการณ์ดังกล่าว ผมได้สอบถามไปยังนายก อบจ. หนองบัวลำภู  และมอบหมาย ผู้แสดงเจตจำนงเป็นว่าที่ผู้สมัคร ส.ส.ของพรรคในจังหวัดหนองบัวลำภู ให้เข้าไปดูพื้นที่เกิดเหตุและให้กำลังใจครอบครัวผู้เสียชีวิต\n" +
                            "ผมและพรรคสร้างอนาคตไทย ขอแสดงความเสียใจอย่างยิ่งต่อครอบครัวของผู้ที่สูญเสียและผู้ที่ได้รับบาดเจ็บ ผมขอเรียกร้องให้ภาครัฐและหน่วยงานที่เกี่ยวข้อง เร่งเยียวยา ช่วยเหลือผู้ได้รับผลกระทบในเหตุการณ์ครั้งนี้ โดยเฉพาะในด้านจิตใจ นายสนธิรัตน์กล่าว ")
                }

            }

        }

    }
}