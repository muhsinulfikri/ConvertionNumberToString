import java.util.*
import kotlin.jvm.JvmStatic

object Convertion {
    var huruf = arrayOf(
        "",
        "Satu",
        "Dua",
        "Tiga",
        "Empat",
        "Lima",
        "Enam",
        "Tujuh",
        "Delapan",
        "Sembilan",
        "Sepuluh",
        "Sebelas"
    )

    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Masukan Bilangan yang akan disebut: ")
        println(angkaToTerbilang(sc.nextLong()))
    }

    fun angkaToTerbilang(angka: Long): String {
        if (angka < 12) return huruf[angka.toInt()]
        if (angka >= 12 && angka <= 19) return huruf[angka.toInt() % 10] + " Belas"
        if (angka >= 20 && angka <= 99) return angkaToTerbilang(angka / 10) + " Puluh " + huruf[angka.toInt() % 10]
        if (angka >= 100 && angka <= 199) return "Seratus " + angkaToTerbilang(angka % 100)
        if (angka >= 200 && angka <= 999) return angkaToTerbilang(angka / 100) + " Ratus " + angkaToTerbilang(angka % 100)
        if (angka >= 1000 && angka <= 1999) return "Seribu " + angkaToTerbilang(angka % 1000)
        if (angka >= 2000 && angka <= 999999) return angkaToTerbilang(angka / 1000) + " Ribu " + angkaToTerbilang(angka % 1000)
        return "angka terlalu besar"
    }
}