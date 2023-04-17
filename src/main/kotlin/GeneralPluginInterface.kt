/*
 * Copyright 2022 limbang and contributors.
 *
 * 此源代码的使用受 GNU AGPLv3 许可证的约束，该许可证可在"LICENSE"文件中找到。
 * Use of this source code is governed by the GNU AGPLv3 license that can be found in the "LICENSE" file.
 */

package top.limbang.mirai

import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin

object GeneralPluginInterface : KotlinPlugin(JvmPluginDescription(
    id = "top.limbang.general-plugin-interface",
    name = "GeneralPluginInterface",
    version = "1.0.2"
) {
    author("limbang")
    info("limbang的通用插件接口")
})