import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var text1 = ""
    private var text2 = ""

    fun setText1(text1: String) {
        this.text1 = text1
    }

    fun setText2(text2: String) {
        this.text2 = text2
    }

    fun compareTexts(): String {
        return if (text1 == text2) {
            "Ambas cadenas son iguales"
        } else {
            "Las cadenas son diferentes"
        }
    }
}
