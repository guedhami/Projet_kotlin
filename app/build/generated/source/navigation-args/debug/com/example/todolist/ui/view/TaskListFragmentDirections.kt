package com.example.todolist.ui.view

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.todolist.R
import kotlin.Int

public class TaskListFragmentDirections private constructor() {
  private data class ActionTaskListFragmentToEditItemFragment(
    public val itemId: Int
  ) : NavDirections {
    public override val actionId: Int = R.id.action_taskListFragment_to_editItemFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("item_id", this.itemId)
        return result
      }
  }

  public companion object {
    public fun actionTaskListFragmentToEditItemFragment(itemId: Int): NavDirections =
        ActionTaskListFragmentToEditItemFragment(itemId)
  }
}
