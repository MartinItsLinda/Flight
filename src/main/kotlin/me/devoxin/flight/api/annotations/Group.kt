package me.devoxin.flight.api.annotations

/**
 * Define the grouping for a {@link me.devoxin.flight.api.annotations.SubCommand SubCommand}
 */
annotation class Group(
    val name: String = "",
    val description: String = ""
)
