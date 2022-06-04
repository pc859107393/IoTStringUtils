package com.github.pc859107393.iotstringutils.handler

import com.intellij.openapi.actionSystem.DataContext
import com.intellij.openapi.editor.Caret
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.editor.actionSystem.EditorAction
import com.intellij.openapi.editor.actionSystem.EditorActionHandler
import com.intellij.openapi.ui.popup.*

/**
 * 编辑器上下文菜单拓展处理
 *
 * @author cheng
 * @date 2022年05月28日
 */
class EditorMenuHandler(defaultHandler: EditorActionHandler?) : EditorAction(defaultHandler) {

    constructor() : this(null)

    /**
     * 构造函数加载主菜单
     */
    init {
        setupHandler(getEditorActionHandler())
    }

    /**
     * 实现编辑器界面的主菜单加载
     */
    private fun getEditorActionHandler(): EditorActionHandler {
        return object : EditorActionHandler() {
            override fun doExecute(editor: Editor, caret: Caret?, dataContext: DataContext?) {
                if (editor.selectionModel.hasSelection()) {
                    val listPopup: ListPopup = this@EditorMenuHandler.getListPopup(editor)
                    listPopup.showInBestPositionFor(editor)
                }
            }
        }
    }

    private fun getListPopup(editor: Editor): ListPopup {
        val instance: JBPopupFactory = JBPopupFactory.getInstance()
        return instance.createListPopup(getListPopupStep(editor))
    }

    private fun getListPopupStep(editor: Editor) = object : ListPopupStep<String> {
        override fun getTitle(): String = "IoTStringUtl"

        override fun canceled() {
        }

        override fun isMnemonicsNavigationEnabled() = false

        override fun getMnemonicNavigationFilter() = null

        override fun isSpeedSearchEnabled() = false

        override fun getSpeedSearchFilter(): SpeedSearchFilter<String>? = null

        override fun isAutoSelectionEnabled() = false

        override fun getFinalRunnable() = Runnable {

        }

        override fun getValues(): MutableList<String> {
            return listOf("IoTStringUtl").toMutableList()
        }

        override fun getDefaultOptionIndex() = 0

        override fun getSeparatorAbove(value: String?) = null

        override fun getTextFor(value: String) = value

        override fun getIconFor(value: String?) = null

        override fun isSelectable(value: String?): Boolean {
            return true
        }

        override fun hasSubstep(selectedValue: String?) = false

        override fun onChosen(selectedValue: String?, finalChoice: Boolean): PopupStep<*>? {
            println(selectedValue!!)
            return null
        }

    }

}