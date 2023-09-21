abstract class Producto() {

    protected var Titulo: String = ""

    protected var Precio: Float = 0.0f

    protected var AnioPublicacion: Int = 0

    protected var descuento: Int = 0

    fun obtenerTitulo(): String{

        return this.Titulo
    }

    fun obtenerDescuento(): Int{

        return 0
    }

}