class Tienda_DM {
    // comentario para añadir a github

    protected var listaCliente: MutableList<Cliente> = mutableListOf()

    protected var listaDisco: MutableList<Disco> = mutableListOf()

    protected var listaPelicula: MutableList<Pelicula> = mutableListOf()

    private fun buscaPelicula(pelicula: String): Pelicula {
        var peli: Pelicula = Pelicula()

        for(cinta in listaPelicula){
            if(pelicula.equals(cinta.obtenerTitulo())){
                peli = cinta
            }
        }
        return peli
    }

    fun aniadirPelicula(peli: Pelicula){
        listaPelicula.add(peli)
    }

    fun aniadirDisco(disk: Disco){
        listaDisco.add(disk)
    }

    fun aniadirCliente(cliente: Cliente){
        listaCliente.add(cliente)
    }

}