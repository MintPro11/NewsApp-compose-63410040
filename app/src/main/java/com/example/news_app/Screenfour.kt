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
fun Screenfour(navController: NavController) {
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
            Image(painter = painterResource(R.drawable.p4),
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
                        "โควิดรอบนี้มาแรง อยู่บ้านเป็นผู้ประกาศข่าว!!",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.W800,
                        )
                    )
                }

                Text(
                    "07 พ.ค. 65 (11:15 น.)",
                    style = TextStyle(
                        fontSize = 14.sp
                    )
                )
                Column(
                    modifier = Modifier
                        .padding(6.dp)
                ) {
                    Text(text = " ย้อนกลับไปเมื่อโควิด-19 ระบาดใหม่ๆ ขณะที่คนส่วนมากต้องหยุดอยู่บ้านเพื่อป้องกันและควบคุมการแพร่ระบาดของเชื้อไวรัส ทำให้คนไทยต้องวนกลับไปใช้ชีวิตแบบอยู่ติดบ้าน และกักตัวอย่างเคร่งครัดกันอีกครั้ง ก็ได้มีหนึ่งชาเลนจ์ในติ๊กตอกที่เป็นอีกกิจกรรมผ่อนคลาย และสร้างความบันเทิงอย่างมาก นั่นก็คือ -ชาเลนจ์สวมบทผู้ประกาศข่าวอ่าน- หรือตัวช่วยอ่านสคริปต์ของผู้ประกาศข่าวให้ทัน! เพราะต้องใช้สกิลด้านภาษา การพูด การสื่อสาร ซึ่งเป็นคุณสมบัติหลักๆ ของผู้ประกาศข่าวนั่นเอง ปรากฏว่ามีทั้งคนที่อ่านทัน อ่านไม่ทัน อ่านถูกอ่านผิด ปะปนกันไป บางคนก็มีรีเทค พลาดไปก็อ่านใหม่ แต่ที่แน่ๆ สนุกและช่วยผ่อนคลายได้จริงๆ")
                }

            }

        }

    }
}