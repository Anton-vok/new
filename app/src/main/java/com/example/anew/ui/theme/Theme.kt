import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import com.example.anew.ui.theme.Purple40
import com.example.anew.ui.theme.Purple80
import com.example.anew.ui.theme.PurpleGrey40
import com.example.anew.ui.theme.PurpleGrey80

class MainTheme(
    var dark: MutableState<Boolean> = mutableStateOf(false)
){
    var background=if (dark.value) {Purple40} else {Purple80}
    var panel= if (dark.value) {PurpleGrey40} else {PurpleGrey80}

}