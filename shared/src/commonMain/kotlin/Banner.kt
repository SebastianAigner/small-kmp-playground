import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import crosslanguagedemo.shared.generated.resources.*
import crosslanguagedemo.shared.generated.resources.Res
import crosslanguagedemo.shared.generated.resources.menu_banner
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalResourceApi::class)
@Preview
@Composable
fun MyBanner() {
    Column(
        Modifier.fillMaxWidth().padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painterResource(Res.drawable.menu_banner),
            "KotlinConf Banner"
        )
        Spacer(Modifier.height(16.dp))
        Text(
            text = stringResource(
                Res.string.conference_description,
                "great"
            ),
            fontSize = 30.sp,
        )
    }
}