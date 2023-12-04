package com.example.todolist.ui.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 52\u00020\u0001:\u00015B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0003J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fH\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0003J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0002J\u000f\u0010\u001f\u001a\u0004\u0018\u00010 H\u0003\u00a2\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J&\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001a\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\'2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u00100\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020#H\u0002J\u0016\u00101\u001a\u00020\u00172\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001703H\u0002J\b\u00104\u001a\u00020\u0017H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u00066"}, d2 = {"Lcom/example/todolist/ui/view/EditItemFragment;", "Landroidx/fragment/app/Fragment;", "()V", "args", "Lcom/example/todolist/ui/view/EditItemFragmentArgs;", "getArgs", "()Lcom/example/todolist/ui/view/EditItemFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lcom/example/todolist/databinding/FragmentEditItemBinding;", "isNewTask", "", "()Z", "item", "Lcom/example/todolist/data/TaskModel;", "viewModel", "Lcom/example/todolist/ui/stateholders/TaskViewModel;", "getViewModel", "()Lcom/example/todolist/ui/stateholders/TaskViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addNewItem", "", "bind", "itemToDisplay", "creatingDatePickerDialog", "deleteItem", "itemId", "", "determineEditOrAddItem", "getDeadlineDate", "", "()Ljava/lang/Long;", "getTaskPriority", "Lcom/example/todolist/data/TaskPriority;", "priority", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setTaskPriority", "setupTopAppBarMenu", "saveTaskResponse", "Lkotlin/Function0;", "updateItem", "Companion", "app_debug"})
public final class EditItemFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    public static final com.example.todolist.ui.view.EditItemFragment.Companion Companion = null;
    private static final java.lang.String TAG = "EditItemFragment";
    private com.example.todolist.databinding.FragmentEditItemBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private com.example.todolist.data.TaskModel item;
    
    public EditItemFragment() {
        super();
    }
    
    private final com.example.todolist.ui.stateholders.TaskViewModel getViewModel() {
        return null;
    }
    
    private final com.example.todolist.ui.view.EditItemFragmentArgs getArgs() {
        return null;
    }
    
    private final boolean isNewTask() {
        return false;
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
    
    private final void setupTopAppBarMenu(kotlin.jvm.functions.Function0<kotlin.Unit> saveTaskResponse) {
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private final void addNewItem() {
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private final java.lang.Long getDeadlineDate() {
        return null;
    }
    
    private final com.example.todolist.data.TaskPriority getTaskPriority(java.lang.String priority) {
        return null;
    }
    
    private final int setTaskPriority(com.example.todolist.data.TaskPriority priority) {
        return 0;
    }
    
    private final void determineEditOrAddItem() {
    }
    
    private final void updateItem() {
    }
    
    private final void bind(com.example.todolist.data.TaskModel itemToDisplay) {
    }
    
    private final void deleteItem(int itemId) {
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private final void creatingDatePickerDialog() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/todolist/ui/view/EditItemFragment$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}