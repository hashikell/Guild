package com.os.operando.guild

/**
 * A tuple of four elements.
 *
 * @param F  first element type
 * @param S  second element type
 * @param T  third element type
 * @param FO fourth element type
 * @property first First value
 * @property second Second value
 * @property third Third value
 * @property fourth Fourth value
 */
data class Quartet<out F, out S, out T, out FO>(
        val first: F,
        val second: S,
        val third: T,
        val fourth: FO) {
}

infix fun <A, B, C, D, E> Quartet<A, B, C, D>.to(that: E): Quintet<A, B, C, D, E> = Quintet(this.first, this.second, this.third, this.fourth, that)