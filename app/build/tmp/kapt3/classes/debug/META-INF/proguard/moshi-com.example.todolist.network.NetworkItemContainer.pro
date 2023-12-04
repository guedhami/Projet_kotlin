-if class com.example.todolist.network.NetworkItemContainer
-keepnames class com.example.todolist.network.NetworkItemContainer
-if class com.example.todolist.network.NetworkItemContainer
-keep class com.example.todolist.network.NetworkItemContainerJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
