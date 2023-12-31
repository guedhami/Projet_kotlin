package com.example.todolist.ui.view

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class EditItemFragmentArgs(
  public val itemId: Int
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("item_id", this.itemId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("item_id", this.itemId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): EditItemFragmentArgs {
      bundle.setClassLoader(EditItemFragmentArgs::class.java.classLoader)
      val __itemId : Int
      if (bundle.containsKey("item_id")) {
        __itemId = bundle.getInt("item_id")
      } else {
        throw IllegalArgumentException("Required argument \"item_id\" is missing and does not have an android:defaultValue")
      }
      return EditItemFragmentArgs(__itemId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): EditItemFragmentArgs {
      val __itemId : Int?
      if (savedStateHandle.contains("item_id")) {
        __itemId = savedStateHandle["item_id"]
        if (__itemId == null) {
          throw IllegalArgumentException("Argument \"item_id\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"item_id\" is missing and does not have an android:defaultValue")
      }
      return EditItemFragmentArgs(__itemId)
    }
  }
}
