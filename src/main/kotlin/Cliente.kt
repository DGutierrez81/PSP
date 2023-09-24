interface Cliente {
    // comentario para añadir a github
    fun aplicaDescuento(producto: Producto): Int
    fun pagar(cantidad: Float): Boolean
}