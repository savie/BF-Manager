.class public final Ll/ܿܺۙ;
.super Ljava/lang/Object;
.source "O965"


# instance fields
.field public final ۙ:Ljava/util/LinkedHashSet;

.field public final ۤ:Ljava/util/LinkedHashMap;

.field public volatile ᩷:Z

.field public final ᩸:Ll/۠ۙܺ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, Ll/۠ۙܺ;

    .line 18
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object v0, p0, Ll/ܿܺۙ;->᩸:Ll/۠ۙܺ;

    .line 52
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ܿܺۙ;->ۤ:Ljava/util/LinkedHashMap;

    .line 55
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Ll/ܿܺۙ;->ۙ:Ljava/util/LinkedHashSet;

    return-void
.end method

.method public static ۙ(Ljava/lang/AutoCloseable;)V
    .locals 1

    if-eqz p0, :cond_0

    .line 126
    :try_start_0
    check-cast p0, Ljava/lang/AutoCloseable;

    invoke-static {p0}, Ll/᩵֡ۨ;->ۙ(Ljava/lang/AutoCloseable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 128
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 3

    .line 77
    iget-boolean v0, p0, Ll/ܿܺۙ;->᩷:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 79
    iput-boolean v0, p0, Ll/ܿܺۙ;->᩷:Z

    .line 80
    iget-object v0, p0, Ll/ܿܺۙ;->᩸:Ll/۠ۙܺ;

    .line 23
    monitor-enter v0

    .line 34
    :try_start_0
    iget-object v1, p0, Ll/ܿܺۙ;->ۤ:Ljava/util/LinkedHashMap;

    .line 81
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/AutoCloseable;

    .line 34
    invoke-static {v2}, Ll/ܿܺۙ;->ۙ(Ljava/lang/AutoCloseable;)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Ll/ܿܺۙ;->ۙ:Ljava/util/LinkedHashSet;

    .line 84
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/AutoCloseable;

    .line 34
    invoke-static {v2}, Ll/ܿܺۙ;->ۙ(Ljava/lang/AutoCloseable;)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Ll/ܿܺۙ;->ۙ:Ljava/util/LinkedHashSet;

    .line 89
    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 90
    sget-object v1, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final ۙ(Ll/ۡ᩻ۙ;)V
    .locals 3

    const-string v1, "androidx.lifecycle.savedstate.vm.tag"

    .line 98
    iget-boolean v0, p0, Ll/ܿܺۙ;->᩷:Z

    if-eqz v0, :cond_0

    .line 99
    invoke-static {p1}, Ll/ܿܺۙ;->ۙ(Ljava/lang/AutoCloseable;)V

    return-void

    .line 103
    :cond_0
    iget-object v0, p0, Ll/ܿܺۙ;->᩸:Ll/۠ۙܺ;

    .line 23
    monitor-enter v0

    .line 34
    :try_start_0
    iget-object v2, p0, Ll/ܿܺۙ;->ۤ:Ljava/util/LinkedHashMap;

    .line 103
    invoke-interface {v2, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/AutoCloseable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    monitor-exit v0

    .line 104
    invoke-static {p1}, Ll/ܿܺۙ;->ۙ(Ljava/lang/AutoCloseable;)V

    return-void

    :catchall_0
    move-exception p1

    .line 23
    monitor-exit v0

    throw p1
.end method

.method public final ᩷()Ljava/lang/AutoCloseable;
    .locals 3

    const-string v1, "androidx.lifecycle.savedstate.vm.tag"

    .line 122
    iget-object v0, p0, Ll/ܿܺۙ;->᩸:Ll/۠ۙܺ;

    .line 23
    monitor-enter v0

    .line 34
    :try_start_0
    iget-object v2, p0, Ll/ܿܺۙ;->ۤ:Ljava/util/LinkedHashMap;

    .line 122
    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/AutoCloseable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
