package org.elixir_lang.intellij_elixir_helper

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

/**
 * Created by luke.imhoff on 7/27/14.
 */
object ElixirFileType : LanguageFileType(ElixirLanguage) {
    override fun getName(): String = "Elixir"
    override fun getDescription(): String = "Elixir language file"
    override fun getDefaultExtension(): String = "ex"
    override fun getIcon(): Icon = ElixirIcons.FILE
}
