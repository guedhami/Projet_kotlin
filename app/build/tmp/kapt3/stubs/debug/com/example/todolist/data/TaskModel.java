package com.example.todolist.data;

import java.lang.System;

@androidx.room.Entity(tableName = "item")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\tH\u00c6\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\t\u0010!\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\"\u001a\u00020\u000bH\u00c6\u0003JV\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001J\t\u0010(\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0018R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006)"}, d2 = {"Lcom/example/todolist/data/TaskModel;", "", "id", "", "description", "", "priority", "Lcom/example/todolist/data/TaskPriority;", "isDone", "", "deadlineDate", "", "creationDate", "lastEditDate", "(ILjava/lang/String;Lcom/example/todolist/data/TaskPriority;ZLjava/lang/Long;JJ)V", "getCreationDate", "()J", "getDeadlineDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDescription", "()Ljava/lang/String;", "getId", "()I", "()Z", "getLastEditDate", "getPriority", "()Lcom/example/todolist/data/TaskPriority;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ILjava/lang/String;Lcom/example/todolist/data/TaskPriority;ZLjava/lang/Long;JJ)Lcom/example/todolist/data/TaskModel;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class TaskModel {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int id = 0;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "description")
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "priority")
    private final com.example.todolist.data.TaskPriority priority = null;
    @androidx.room.ColumnInfo(name = "is_done")
    private final boolean isDone = false;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "deadline_date")
    private final java.lang.Long deadlineDate = null;
    @androidx.room.ColumnInfo(name = "creation_date")
    private final long creationDate = 0L;
    @androidx.room.ColumnInfo(name = "last_edit_date")
    private final long lastEditDate = 0L;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todolist.data.TaskModel copy(int id, @org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    com.example.todolist.data.TaskPriority priority, boolean isDone, @org.jetbrains.annotations.Nullable
    java.lang.Long deadlineDate, long creationDate, long lastEditDate) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public TaskModel(int id, @org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    com.example.todolist.data.TaskPriority priority, boolean isDone, @org.jetbrains.annotations.Nullable
    java.lang.Long deadlineDate, long creationDate, long lastEditDate) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todolist.data.TaskPriority component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todolist.data.TaskPriority getPriority() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean isDone() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getDeadlineDate() {
        return null;
    }
    
    public final long component6() {
        return 0L;
    }
    
    public final long getCreationDate() {
        return 0L;
    }
    
    public final long component7() {
        return 0L;
    }
    
    public final long getLastEditDate() {
        return 0L;
    }
}