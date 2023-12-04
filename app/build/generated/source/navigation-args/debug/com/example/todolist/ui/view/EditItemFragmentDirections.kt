package com.example.todolist.ui.view

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.todolist.R
import kotlin.Boolean
import kotlin.Int

public class EditItemFragmentDirections private constructor() {
  private data class ActionEditItemFragmentToTaskListFragment(
    public val scrollAllWayDown: Boolean = false
  ) : NavDirections {
    public override val actionId: Int = R.id.action_editItemFragment_to_taskListFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putBoolean("scroll_all_way_down", this.scrollAllWayDown)
        return result
      }
  }

  public companion object {
    public fun actionEditItemFragmentToTaskListFragment(scrollAllWayDown: Boolean = false):
        NavDirections = ActionEditItemFragmentToTaskListFragment(scrollAllWayDown)
  }
}
