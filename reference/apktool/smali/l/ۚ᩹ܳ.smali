.class public abstract Ll/ۚ᩹ܳ;
.super Ljava/lang/Object;
.source "W6D5"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ܰ:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x43

    invoke-static {v0}, Ll/᩹֡֫;->ۗ۟᩸(I)V

    return-void
.end method

.method public static ᩷(J)D
    .locals 2

    .line 105
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v0

    sub-long/2addr v0, p0

    long-to-double p0, v0

    const-wide v0, 0x412e848000000000L    # 1000000.0

    div-double/2addr p0, v0

    return-wide p0
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 85
    :try_start_0
    iget-object v1, p0, Ll/ۚ᩹ܳ;->ܰ:Landroid/os/Bundle;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 86
    :try_start_1
    iput-object v1, p0, Ll/ۚ᩹ܳ;->ܰ:Landroid/os/Bundle;

    .line 87
    invoke-virtual {p0}, Ll/ۚ᩹ܳ;->ۤ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public abstract ۙ(Landroid/os/Bundle;)Ljava/lang/String;
.end method

.method public final native declared-synchronized ۙ()Ll/ܳ᩹ܳ;
.end method

.method public abstract ۤ()V
.end method

.method public final declared-synchronized ᩷()V
    .locals 8

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 42
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v1

    .line 43
    iget-object v3, p0, Ll/ۚ᩹ܳ;->ܰ:Landroid/os/Bundle;

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 44
    :goto_0
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_1

    .line 47
    :try_start_1
    invoke-virtual {p0, v4}, Ll/ۚ᩹ܳ;->᩷(Landroid/os/Bundle;)V

    .line 48
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5, v4}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    iput-object v5, p0, Ll/ۚ᩹ܳ;->ܰ:Landroid/os/Bundle;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catch_0
    move-exception v1

    const/4 v2, 0x0

    .line 91
    :try_start_2
    iput-object v2, p0, Ll/ۚ᩹ܳ;->ܰ:Landroid/os/Bundle;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 93
    :try_start_3
    invoke-virtual {p0}, Ll/ۚ᩹ܳ;->ۤ()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catch_1
    move-exception v2

    .line 95
    :try_start_4
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 51
    :goto_1
    throw v1

    .line 54
    :cond_1
    iget-object v5, p0, Ll/ۚ᩹ܳ;->ܰ:Landroid/os/Bundle;

    const-string v6, "uid"

    .line 100
    invoke-virtual {v5, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v4, v6, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v6, "server_pid"

    .line 101
    invoke-virtual {v5, v6}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v5, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v4, v6, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_2
    :goto_2
    const-string v5, "session_reused"

    .line 56
    invoke-virtual {v4, v5, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v3, "session_open_ms"

    .line 57
    invoke-static {v1, v2}, Ll/ۚ᩹ܳ;->᩷(J)D

    move-result-wide v1

    invoke-virtual {v4, v3, v1, v2}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 58
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v1
.end method

.method public abstract ᩷(Landroid/os/Bundle;)V
.end method
