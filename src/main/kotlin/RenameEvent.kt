/*
 * Copyright 2022 limbang and contributors.
 *
 * 此源代码的使用受 GNU AGPLv3 许可证的约束，该许可证可在"LICENSE"文件中找到。
 * Use of this source code is governed by the GNU AGPLv3 license that can be found in the "LICENSE" file.
 */

package top.limbang

import net.mamoe.mirai.event.AbstractEvent

/**
 * ## 重命名事件
 *
 * 用于插件之间联动重命名
 *
 * @property oldName 旧名称
 * @property newName 新名称
 */
class RenameEvent(val pluginId: String, val oldName: String, val newName: String) : AbstractEvent()