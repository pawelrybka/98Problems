import jakarta.persistence.*

@Entity
@Table(name = "uzytkownik")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val imie: String,
    val email: String
)