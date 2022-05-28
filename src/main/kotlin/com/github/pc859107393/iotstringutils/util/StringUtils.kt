package com.github.pc859107393.iotstringutils.util

/**
 * 字符串工具类
 *
 * @author cheng
 * @date 2022年05月28日
 */
object StringUtils {

    /**
     * 检测字符串是否为十六进制字符串
     *
     * @param text
     * @return
     */
    fun isHex(text: String): Boolean {
        return text.matches(Regex("[\\da-fA-F]+"))
    }
}