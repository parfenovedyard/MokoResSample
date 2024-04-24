import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import com.pe.mokoressample.resources.MR
import dev.icerock.moko.resources.ImageResource
import dev.icerock.moko.resources.compose.painterResource
import dev.icerock.moko.resources.ImageResource as RootImageResource

typealias Images = MR.images
typealias ImageResource = RootImageResource

@Composable
fun painterResource(imageResource: ImageResource): Painter = painterResource(imageResource)


