package org.elixir_lang.intellij_elixir_helper

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

/**
 * Created by luke.imhoff on 7/27/14.
 */
object ElixirScriptFileType : LanguageFileType(ElixirLanguage) {
    override fun getName(): String = "Elixir Script"
    override fun getDescription(): String = "Elixir Script file"
    override fun getDefaultExtension(): String = "exs"
    override fun getIcon(): Icon = ElixirIcons.FILE
}
