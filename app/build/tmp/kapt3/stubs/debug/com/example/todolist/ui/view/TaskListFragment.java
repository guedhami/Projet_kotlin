package com.example.todolist.ui.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J&\u0010 \u001a\u0004\u0018\u00010\u001c2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010\'\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0012\u0010(\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\b\u0010+\u001a\u00020\u0019H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006-"}, d2 = {"Lcom/example/todolist/ui/view/TaskListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "args", "Lcom/example/todolist/ui/view/TaskListFragmentArgs;", "getArgs", "()Lcom/example/todolist/ui/view/TaskListFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lcom/example/todolist/databinding/FragmentTaskListBinding;", "settingsDataStore", "Lcom/example/todolist/data/SettingsDataStore;", "getSettingsDataStore", "()Lcom/example/todolist/data/SettingsDataStore;", "settingsDataStore$delegate", "Lkotlin/Lazy;", "showDoneTasks", "", "viewModel", "Lcom/example/todolist/ui/stateholders/TaskViewModel;", "getViewModel", "()Lcom/example/todolist/ui/stateholders/TaskViewModel;", "viewModel$delegate", "chooseTaskList", "", "isVisible", "view", "Landroid/view/View;", "navigateToEditItemFragment", "itemId", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "setIcon", "button", "Landroid/widget/ImageButton;", "setItemTouchHelper", "Companion", "app_debug"})
public final class TaskListFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    public static final com.example.todolist.ui.view.TaskListFragment.Companion Companion = null;
    private static final java.lang.String TAG = "TaskListFragment";
    private com.example.todolist.databinding.FragmentTaskListBinding binding;
    private boolean showDoneTasks = true;
    private final kotlin.Lazy settingsDataStore$delegate = null;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public TaskListFragment() {
        super();
    }
    
    private final com.example.todolist.data.SettingsDataStore getSettingsDataStore() {
        return null;
    }
    
    private final com.example.todolist.ui.view.TaskListFragmentArgs getArgs() {
        return null;
    }
    
    private final com.example.todolist.ui.stateholders.TaskViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void navigateToEditItemFragment(int itemId) {
    }
    
    private final void navigateToEditItemFragment() {
    }
    
    private final boolean isVisible(android.view.View view) {
        return false;
    }
    
    private final void chooseTaskList() {
    }
    
    private final void setIcon(android.widget.ImageButton button) {
    }
    
    private final void setItemTouchHelper() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/todolist/ui/view/TaskListFragment$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}