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
                        "ใครเห็นก็ว่าไม่น่ารอด!!!",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.W800,
                        )
                    )
                }

                Text(
                    "22 มิ.ย. 65 (05:30 น.)",
                    style = TextStyle(
                        fontSize = 14.sp
                    )
                )
                Column(
                    modifier = Modifier
                        .padding(6.dp)
                ) {
                    Text(text = " เรื่องวุ่น ๆ ของกู้ภัย และคนที่ไปเจอเหตุการณ์นี้ เพราะจู่ ๆ ก็มีคนแจ้งกู้ภัยว่า มีคนหมดสติในคลองแห่งหนึ่ง ระหว่างศรีนครินทร์ 36-38 โดยแจ้งทางหน่วยกู้ชีพ(พิรุณ) แว้บแรกที่เห็นภาพ ใคร ๆ ก็คิดว่า ชายคนนี้น่าจะเสียชีวิตแล้ว เพราะนอนนิ่ง แล้วสภาพน้ำก็อย่างที่เห็น ตอนที่มีคนลงไปเพื่อสำรวจ ลงไปดูว่าชายที่เจอเป็นยังไง เรายังคิดเลยว่า สภาพน้ำไม่น่าลงไปเลย แต่พอไปถึงตัว แล้วเอามือจับดู เขาก็ตื่นลุกขึ้นมาซะงั้น ทำเอาคนลงไปสะดุ้งเลย ภาพอีกมุมจากมุมนี้ ถ้ามองลงไป นอนหลับตา อ้าปากค้างนิ่ง ไม่ไหวติงเลย แล้วจังหวะที่น้องลงไปสะกิด ปรากฏตื่นจากภวังค์ เรื่องของเรื่อง คุณลุงบอกว่า ลงไปหาของในน้ำ แล้วเผลอหลับ ฟังไม่ผิด ลุงน่าจะเหนื่อยมาก เลยเผลอหลับไป สภาพน้ำไม่น่าจะหลับลงได้ ")
                }

            }

        }

    }
}