package com.example.news_app


import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

//***** List Bar ***********************************************************************************
val ListTitle = listOf<String>(
    "กีฬา",
    "ดราม่า",
    "บันเทิง",
    "ล่าสุด",
    "ไทยรัฐทอล์ค",
    "ที่บันทึกใว้",
)

@Composable
fun NewsHomeScreen(navController:NavController) {
    Column(
        modifier = Modifier
            .background(color = Color(0xFF33691E))
    ) {
        TopAppBar(
            title = {
                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {

                    //list title
                    items(ListTitle) { it ->
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .size(120.dp),
                            shape = RoundedCornerShape(10.dp),
                            backgroundColor = Color(0xFF388E3C)
                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(text = it)
                            }
                        }
                    }

                }


            }, backgroundColor = Color(0xFF2E7D32))
        //***** end TopAppBar **********************************************************************
    //*********** Start Screen 1 *******************************************************************
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Column(modifier = Modifier
                .padding(10.dp)
                .clickable { navController.navigate("B") }) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    elevation = 8.dp,
                ) {
                    Column() {
                        Image(
                            painter = painterResource(R.drawable.p1),
                            contentDescription = "Description",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(50.dp)
                                    .padding(2.dp)
                            ) {
                                Text(
                                    " ทักษิณโพสต์เสียใจ กราดยิงหนองบัวลำภู จี้รัฐบาลปราบยาเสพติด  ",
                                    style = TextStyle(
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .padding(2.dp)
                            ) {
                                Text(
                                    " 06 ต.ค. 65 (21:08 น.)",
                                    style = TextStyle(
                                        fontSize = 14.sp
                                    )
                                )
                                Row(
                                    modifier = Modifier
                                        .padding(2.dp)
                                    ) {
                                    Image(
                                        painter = painterResource(R.drawable.ic_baseline_turned_in_24),
                                        contentDescription = "Description",
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .padding(1.dp)
                                            .size(30.dp)

                                    )
                                    Image(
                                        painter = painterResource(R.drawable.ic_baseline_share_24),
                                        contentDescription = "Description",
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .padding(1.dp)
                                            .size(30.dp)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        //******* end Screen 1 *********************************************************************
        //******* Start Screen 2 *******************************************************************
            Column(modifier = Modifier
                .padding(10.dp)
                .clickable { navController.navigate("C") }) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    elevation = 8.dp,
                ) {
                    Column() {
                        Image(
                            painter = painterResource(R.drawable.p2),
                            contentDescription = "Description",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(50.dp)
                                    .padding(2.dp)
                            ) {
                                Text(
                                    " สนธิรัตน์ สะเทือนใจเหตุกราดยิงหนองบัวลำภู  ",
                                    style = TextStyle(
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .padding(2.dp)
                            ) {
                                Text(
                                    " 07 ต.ค. 65 (18:23 น.)",
                                    style = TextStyle(
                                        fontSize = 14.sp
                                    )
                                )
                                Row(
                                    modifier = Modifier
                                        .padding(2.dp)
                                ) {
                                    Image(
                                        painter = painterResource(R.drawable.ic_baseline_turned_in_24),
                                        contentDescription = "Description",
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .padding(1.dp)
                                            .size(30.dp)

                                    )
                                    Image(
                                        painter = painterResource(R.drawable.ic_baseline_share_24),
                                        contentDescription = "Description",
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .padding(1.dp)
                                            .size(30.dp)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        //****** end Screen2 ***********************************************************************
            //**** Start Screen3 *******************************************************************
            Column(modifier = Modifier
                .padding(10.dp)
                .clickable { navController.navigate("D") }) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    elevation = 8.dp,
                ) {
                    Column() {
                        Image(
                            painter = painterResource(R.drawable.p3),
                            contentDescription = "Description",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(50.dp)
                                    .padding(2.dp)
                            ) {
                                Text(
                                    " ใครเห็นก็ว่าไม่น่ารอด !!  ",
                                    style = TextStyle(
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .padding(2.dp)
                            ) {
                                Text(
                                    " 22 มิ.ย. 65 (05:30 น.)",
                                    style = TextStyle(
                                        fontSize = 14.sp
                                    )
                                )
                                Row(
                                    modifier = Modifier
                                        .padding(2.dp)
                                ) {
                                    Image(
                                        painter = painterResource(R.drawable.ic_baseline_turned_in_24),
                                        contentDescription = "Description",
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .padding(1.dp)
                                            .size(30.dp)

                                    )
                                    Image(
                                        painter = painterResource(R.drawable.ic_baseline_share_24),
                                        contentDescription = "Description",
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .padding(1.dp)
                                            .size(30.dp)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        //***** end Screen 3 ***********************************************************************
            //****Start Screen 4 *******************************************************************
            Column(modifier = Modifier
                .padding(10.dp)
                .clickable { navController.navigate("E") }) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    elevation = 8.dp,
                ) {
                    Column() {
                        Image(
                            painter = painterResource(R.drawable.p4),
                            contentDescription = "Description",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(50.dp)
                                    .padding(2.dp)
                            ) {
                                Text(
                                    " โควิดรอบนี้มาแรง อยู่บ้านเป็นผู้ประกาศข่าว",
                                    style = TextStyle(
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .padding(2.dp)
                            ) {
                                Text(
                                    " 07 พ.ค. 65 (11:15 น.)",
                                    style = TextStyle(
                                        fontSize = 14.sp
                                    )
                                )
                                Row(
                                    modifier = Modifier
                                        .padding(2.dp)
                                ) {
                                    Image(
                                        painter = painterResource(R.drawable.ic_baseline_turned_in_24),
                                        contentDescription = "Description",
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .padding(1.dp)
                                            .size(30.dp)

                                    )
                                    Image(
                                        painter = painterResource(R.drawable.ic_baseline_share_24),
                                        contentDescription = "Description",
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .padding(1.dp)
                                            .size(30.dp)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        //*******end Screen 4  *********************************************************************
        }
    }
}