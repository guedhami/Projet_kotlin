package com.example.todolist.ui.view

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Boolean
import kotlin.jvm.JvmStatic

public data class TaskListFragmentArgs(
  public val scrollAllWayDown: Boolean = false
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putBoolean("scroll_all_way_down", this.scrollAllWayDown)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("scroll_all_way_down", this.scrollAllWayDown)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): TaskListFragmentArgs {
      bundle.setClassLoader(TaskListFragmentArgs::class.java.classLoader)
      val __scrollAllWayDown : Boolean
      if (bundle.containsKey("scroll_all_way_down")) {
        __scrollAllWayDown = bundle.getBoolean("scroll_all_way_down")
      } else {
        __scrollAllWayDown = false
      }
      return TaskListFragmentArgs(__scrollAllWayDown)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): TaskListFragmentArgs {
      val __scrollAllWayDown : Boolean?
      if (savedStateHandle.contains("scroll_all_way_down")) {
        __scrollAllWayDown = savedStateHandle["scroll_all_way_down"]
        if (__scrollAllWayDown == null) {
          throw IllegalArgumentException("Argument \"scroll_all_way_down\" of type boolean does not support null values")
        }
      } else {
        __scrollAllWayDown = false
      }
      return TaskListFragmentArgs(__scrollAllWayDown)
    }
  }
}
