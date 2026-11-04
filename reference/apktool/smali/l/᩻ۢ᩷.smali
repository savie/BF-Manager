.class public final Ll/᩻ۢ᩷;
.super Ljava/lang/Object;
.source "16CX"


# instance fields
.field public ۙ:Z

.field public ۚ:Landroid/os/Bundle;

.field public ۤ:Z

.field public final ۫:Ll/֫ۢ᩷;

.field public final ܳ:Ll/۫ۢ᩷;

.field public final ᩴ:Ll/ۨۤۤ;

.field public ᩷:Z

.field public final ᩸:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Ll/֫ۢ᩷;Ll/۫ۢ᩷;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Ll/᩻ۢ᩷;->۫:Ll/֫ۢ᩷;

    .line 32
    iput-object p2, p0, Ll/᩻ۢ᩷;->ܳ:Ll/۫ۢ᩷;

    .line 35
    new-instance p1, Ll/ۨۤۤ;

    .line 18
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Ll/᩻ۢ᩷;->ᩴ:Ll/ۨۤۤ;

    .line 36
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Ll/᩻ۢ᩷;->᩸:Ljava/util/LinkedHashMap;

    const/4 p1, 0x1

    .line 44
    iput-boolean p1, p0, Ll/᩻ۢ᩷;->᩷:Z

    return-void
.end method

.method public static ۙ(Ll/᩻ۢ᩷;Ll/ۤ᩻ۙ;Ll/ۡۧۙ;)V
    .locals 0

    .line 97
    sget-object p1, Ll/ۡۧۙ;->ۡ:Ll/ۡۧۙ;

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    .line 98
    iput-boolean p1, p0, Ll/᩻ۢ᩷;->᩷:Z

    return-void

    .line 99
    :cond_0
    sget-object p1, Ll/ۡۧۙ;->ۖ:Ll/ۡۧۙ;

    if-ne p2, p1, :cond_1

    const/4 p1, 0x0

    .line 100
    iput-boolean p1, p0, Ll/᩻ۢ᩷;->᩷:Z

    :cond_1
    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 3

    .line 48
    iget-boolean v0, p0, Ll/᩻ۢ᩷;->ۤ:Z

    if-eqz v0, :cond_3

    .line 53
    iget-object v0, p0, Ll/᩻ۢ᩷;->ۚ:Landroid/os/Bundle;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 790
    :cond_0
    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 55
    invoke-static {v0, p1}, Ll/ۤۢ᩷;->ۙ(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v1

    .line 227
    :goto_0
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 781
    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 58
    iput-object v1, p0, Ll/᩻ۢ᩷;->ۚ:Landroid/os/Bundle;

    :cond_2
    return-object v2

    .line 48
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "You can \'consumeRestoredStateForKey\' only after the corresponding component has moved to the \'CREATED\' state"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ()Ll/ᩴۢ᩷;
    .locals 6

    const-string v1, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    .line 75
    iget-object v0, p0, Ll/᩻ۢ᩷;->ᩴ:Ll/ۨۤۤ;

    .line 23
    monitor-enter v0

    .line 30
    :try_start_0
    iget-object v2, p0, Ll/᩻ۢ᩷;->᩸:Ljava/util/LinkedHashMap;

    .line 76
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴۢ᩷;

    .line 77
    invoke-static {v5, v1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v5, :cond_1

    move-object v4, v3

    :cond_1
    if-eqz v4, :cond_0

    .line 23
    :cond_2
    monitor-exit v0

    return-object v4

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final ۙ(Landroid/os/Bundle;)V
    .locals 3

    .line 112
    iget-boolean v0, p0, Ll/᩻ۢ᩷;->ۙ:Z

    if-nez v0, :cond_0

    .line 113
    invoke-virtual {p0}, Ll/᩻ۢ᩷;->ۤ()V

    .line 115
    :cond_0
    iget-object v0, p0, Ll/᩻ۢ᩷;->۫:Ll/֫ۢ᩷;

    invoke-interface {v0}, Ll/ۤ᩻ۙ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۠ۧۙ;->ۙ()Ll/ۖۧۙ;

    move-result-object v1

    sget-object v2, Ll/ۖۧۙ;->ۢ:Ll/ۖۧۙ;

    invoke-virtual {v1, v2}, Ll/ۖۧۙ;->ۙ(Ll/ۖۧۙ;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 118
    iget-boolean v0, p0, Ll/᩻ۢ᩷;->ۤ:Z

    if-nez v0, :cond_2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    const-string v1, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    .line 790
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 122
    invoke-static {p1, v1}, Ll/ۤۢ᩷;->ۙ(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 120
    :cond_1
    iput-object v0, p0, Ll/᩻ۢ᩷;->ۚ:Landroid/os/Bundle;

    const/4 p1, 0x1

    .line 124
    iput-boolean p1, p0, Ll/᩻ۢ᩷;->ۤ:Z

    return-void

    .line 118
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "SavedStateRegistry was already restored."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 116
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "performRestore cannot be called when owner is "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v0}, Ll/ۤ᩻ۙ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۠ۧۙ;->ۙ()Ll/ۖۧۙ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 115
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۙ(Ljava/lang/String;Ll/ᩴۢ᩷;)V
    .locals 2

    const-string v0, "provider"

    .line 5
    invoke-static {p2, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    iget-object v0, p0, Ll/᩻ۢ᩷;->ᩴ:Ll/ۨۤۤ;

    .line 23
    monitor-enter v0

    .line 30
    :try_start_0
    iget-object v1, p0, Ll/᩻ۢ᩷;->᩸:Ljava/util/LinkedHashMap;

    .line 67
    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 30
    iget-object v1, p0, Ll/᩻ۢ᩷;->᩸:Ljava/util/LinkedHashMap;

    .line 70
    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    sget-object p1, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    const-string p1, "SavedStateProvider with the given key is already registered"

    .line 67
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 23
    monitor-exit v0

    throw p1
.end method

.method public final ۤ()V
    .locals 3

    .line 89
    iget-object v0, p0, Ll/᩻ۢ᩷;->۫:Ll/֫ۢ᩷;

    invoke-interface {v0}, Ll/ۤ᩻ۙ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۠ۧۙ;->ۙ()Ll/ۖۧۙ;

    move-result-object v1

    sget-object v2, Ll/ۖۧۙ;->۟:Ll/ۖۧۙ;

    if-ne v1, v2, :cond_1

    .line 92
    iget-boolean v1, p0, Ll/᩻ۢ᩷;->ۙ:Z

    if-nez v1, :cond_0

    .line 94
    iget-object v1, p0, Ll/᩻ۢ᩷;->ܳ:Ll/۫ۢ᩷;

    invoke-virtual {v1}, Ll/۫ۢ᩷;->ۙ()Ljava/lang/Object;

    .line 95
    invoke-interface {v0}, Ll/ۤ᩻ۙ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v0

    new-instance v1, Ll/ۧۢ᩷;

    invoke-direct {v1, p0}, Ll/ۧۢ᩷;-><init>(Ll/᩻ۢ᩷;)V

    invoke-virtual {v0, v1}, Ll/۠ۧۙ;->ۙ(Ll/᩷᩻ۙ;)V

    const/4 v0, 0x1

    .line 104
    iput-boolean v0, p0, Ll/᩻ۢ᩷;->ۙ:Z

    return-void

    .line 92
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "SavedStateRegistry was already attached."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 89
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Restarter must be created only during owner\'s initialization stage"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩷(Landroid/os/Bundle;)V
    .locals 6

    const-string v0, "outBundle"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v1, v0, [Ll/᩷۟᩵;

    .line 37
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩷۟᩵;

    invoke-static {v0}, Ll/֫ۢ;->ۙ([Ll/᩷۟᩵;)Landroid/os/Bundle;

    move-result-object v1

    .line 136
    iget-object v0, p0, Ll/᩻ۢ᩷;->ۚ:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    .line 223
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 137
    :cond_0
    iget-object v0, p0, Ll/᩻ۢ᩷;->ᩴ:Ll/ۨۤۤ;

    .line 23
    monitor-enter v0

    .line 30
    :try_start_0
    iget-object v2, p0, Ll/᩻ۢ᩷;->᩸:Ljava/util/LinkedHashMap;

    .line 138
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴۢ᩷;

    .line 139
    invoke-interface {v3}, Ll/ᩴۢ᩷;->ۙ()Landroid/os/Bundle;

    move-result-object v3

    const-string v5, "key"

    .line 0
    invoke-static {v4, v5}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    invoke-virtual {v1, v4, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    .line 141
    :cond_1
    sget-object v2, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    monitor-exit v0

    .line 781
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    .line 219
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    .line 23
    monitor-exit v0

    throw p1
.end method

.method public final ᩷()Z
    .locals 1

    .line 44
    iget-boolean v0, p0, Ll/᩻ۢ᩷;->᩷:Z

    return v0
.end method
