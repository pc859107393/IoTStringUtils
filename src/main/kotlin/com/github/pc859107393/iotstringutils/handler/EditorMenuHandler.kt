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
                    println(editor.selectionModel.selectedText)
                }
            }
        }
    }

}