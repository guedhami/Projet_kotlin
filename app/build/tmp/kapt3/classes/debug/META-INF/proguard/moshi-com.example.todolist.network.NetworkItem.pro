-if class com.example.todolist.network.NetworkItem
-keepnames class com.example.todolist.network.NetworkItem
-if class com.example.todolist.network.NetworkItem
-keep class com.example.todolist.network.NetworkItemJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
