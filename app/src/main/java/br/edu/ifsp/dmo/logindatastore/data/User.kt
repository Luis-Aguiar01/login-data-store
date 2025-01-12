package br.edu.ifsp.dmo.logindatastore.data

object User {
    private const val EMAIL = "admin@email.com"
    private const val PASSWORD = 123456L

    fun authenticate(email: String, password: Long) = this.EMAIL == email && this.PASSWORD == password
}