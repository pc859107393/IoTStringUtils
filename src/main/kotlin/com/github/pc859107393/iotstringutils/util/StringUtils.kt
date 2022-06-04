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
     */
    fun String?.isHex(): Boolean = null != this && this.matches(Regex("[\\da-fA-F]+")) && this.length % 2 == 0
}
