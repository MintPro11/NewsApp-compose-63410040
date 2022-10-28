package com.example.news_app



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
fun Screenone(navController: NavController){
    Column(
        modifier = Modifier
            .background(color = Color(0xFF33691E))
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
            Image(painter = painterResource(R.drawable.p1),
                contentDescription = "Description",
                contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                )
            Column(
                modifier = Modifier
                    .padding(6.dp)
                    .background(color=Color(0xFFFFFFFF))
            ) {

                Row(
                    modifier = Modifier
                    .padding(6.dp)) {
                    Text(
                        "ทักษิณ โพสต์เสียใจกราดยิงหนองบัวลำภูจี้รัฐบาล ปราบยาเสพติด",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.W800,
                        )
                    )
                }

                Text(
                        "06 ต.ค. 65 (21:08 น.)",
                        style = TextStyle(
                            fontSize = 14.sp
                        )
                    )
                Column(
                    modifier = Modifier
                        .padding(6.dp)
                ) {
                    Text(text = "นายทักษิณ ชินวัตร อดีตนายกรัฐมนตรี โพสต์ทวิตเตอร์เมื่อวันพฤหัสบดี (6 ต.ค.) ระบุว่าเหตุการณ์กราดยิงที่ศูนย์พัฒนาเด็ก จ.หนองบัวลำภู จนมีผู้เสียชีวิต 38 คน ถือเป็นความเศร้าสลดที่ไม่น่าเกิดขึ้นในประเทศไทยของเรา ผมขอประณามความโหดเหี้ยมของผู้กระทำ ขอแสดงความเสียใจอย่างสุดซึ้งต่อครอบครัวผู้สูญเสีย และขอร้องให้รัฐบาลได้เร่งปราบปรามยาเสพติด โดยเฉพาะยาบ้าอย่างจริงจังเถิด เพราะเราสูญเสียมามากเกินพอแล้ว อย่างไรก็ตาม นโยบายสงครามยาเสพติดของนายทักษิณ ก็นำมาสู่ข้อครหาเกี่ยวกับการ -ฆ่าตัดตอนผู้คนจำนวนมาก- โดยเฉพาะคนในเครือข่ายค้ายาเสพติด เพื่อไม่ให้เจ้าหน้าที่รัฐสอบสวนไปถึงตัวการสำคัญได้ ")
                }

            }

        }
        
    }
}
