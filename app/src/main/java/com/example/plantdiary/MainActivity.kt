import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.plantdiary.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.MainActivity)

        // Here, you can interact with the UI elements from the XML layout file

        // Example: Binding the TextView and updating its text
//        val textViewHello = findViewById<TextView>(R.id.textViewHello)
//        textViewHello.text = "Hello, Kotlin XML Binding!"
    }

    // Add more code here as needed for your activity logic
}
