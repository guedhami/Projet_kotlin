package com.example.todolist.ui.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001b\u001cB\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010H\u0016R.\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/todolist/ui/view/TaskListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/todolist/data/TaskModel;", "Lcom/example/todolist/ui/view/TaskListAdapter$ItemViewHolder;", "onItemClicked", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "onCheckDoneClick", "Lkotlin/Function2;", "", "getOnCheckDoneClick", "()Lkotlin/jvm/functions/Function2;", "setOnCheckDoneClick", "(Lkotlin/jvm/functions/Function2;)V", "onDeleteClick", "", "getOnDeleteClick", "()Lkotlin/jvm/functions/Function1;", "setOnDeleteClick", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ItemViewHolder", "app_debug"})
public final class TaskListAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.todolist.data.TaskModel, com.example.todolist.ui.view.TaskListAdapter.ItemViewHolder> {
    private final kotlin.jvm.functions.Function1<com.example.todolist.data.TaskModel, kotlin.Unit> onItemClicked = null;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function2<? super com.example.todolist.data.TaskModel, ? super java.lang.Boolean, kotlin.Unit> onCheckDoneClick;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onDeleteClick;
    @org.jetbrains.annotations.NotNull
    public static final com.example.todolist.ui.view.TaskListAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.todolist.data.TaskModel> DiffCallBack = null;
    
    public TaskListAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.todolist.data.TaskModel, kotlin.Unit> onItemClicked) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function2<com.example.todolist.data.TaskModel, java.lang.Boolean, kotlin.Unit> getOnCheckDoneClick() {
        return null;
    }
    
    public final void setOnCheckDoneClick(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function2<? super com.example.todolist.data.TaskModel, ? super java.lang.Boolean, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnDeleteClick() {
        return null;
    }
    
    public final void setOnDeleteClick(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.todolist.ui.view.TaskListAdapter.ItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.todolist.ui.view.TaskListAdapter.ItemViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0007J\u0018\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\bH\u0002J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\bH\u0002J\u0017\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002\u00a2\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R.\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/example/todolist/ui/view/TaskListAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/todolist/databinding/TaskItemBinding;", "(Lcom/example/todolist/databinding/TaskItemBinding;)V", "onCheckDoneClick", "Lkotlin/Function2;", "Lcom/example/todolist/data/TaskModel;", "", "", "getOnCheckDoneClick", "()Lkotlin/jvm/functions/Function2;", "setOnCheckDoneClick", "(Lkotlin/jvm/functions/Function2;)V", "onDeleteClick", "Lkotlin/Function1;", "", "getOnDeleteClick", "()Lkotlin/jvm/functions/Function1;", "setOnDeleteClick", "(Lkotlin/jvm/functions/Function1;)V", "view", "Ljava/lang/ref/WeakReference;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "kotlin.jvm.PlatformType", "bind", "item", "changeStatus", "isDone", "setCheckStatus", "setDeadlineDate", "deadlineDate", "", "(Ljava/lang/Long;)V", "setImportance", "priority", "Lcom/example/todolist/data/TaskPriority;", "app_debug"})
    public static final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.todolist.databinding.TaskItemBinding binding = null;
        private final java.lang.ref.WeakReference<androidx.constraintlayout.widget.ConstraintLayout> view = null;
        @org.jetbrains.annotations.Nullable
        private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onDeleteClick;
        @org.jetbrains.annotations.Nullable
        private kotlin.jvm.functions.Function2<? super com.example.todolist.data.TaskModel, ? super java.lang.Boolean, kotlin.Unit> onCheckDoneClick;
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull
        com.example.todolist.databinding.TaskItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.Nullable
        public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnDeleteClick() {
            return null;
        }
        
        public final void setOnDeleteClick(@org.jetbrains.annotations.Nullable
        kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final kotlin.jvm.functions.Function2<com.example.todolist.data.TaskModel, java.lang.Boolean, kotlin.Unit> getOnCheckDoneClick() {
            return null;
        }
        
        public final void setOnCheckDoneClick(@org.jetbrains.annotations.Nullable
        kotlin.jvm.functions.Function2<? super com.example.todolist.data.TaskModel, ? super java.lang.Boolean, kotlin.Unit> p0) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.example.todolist.data.TaskModel item) {
        }
        
        private final void setImportance(com.example.todolist.data.TaskPriority priority) {
        }
        
        private final void changeStatus(com.example.todolist.data.TaskModel item, boolean isDone) {
        }
        
        private final void setCheckStatus(boolean isDone) {
        }
        
        private final void setDeadlineDate(java.lang.Long deadlineDate) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/todolist/ui/view/TaskListAdapter$Companion;", "", "()V", "DiffCallBack", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/todolist/data/TaskModel;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}