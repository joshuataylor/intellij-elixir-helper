package org.elixir_lang.intellij_elixir_helper

import com.intellij.lang.Language

@Suppress("JavaIoSerializableObjectMustHaveReadResolve")
object ElixirLanguage : Language("Elixir") {
    override fun getDisplayName(): String = "Elixir"
}
