.class public final Ll/ۙ֫᩵;
.super Ljava/lang/Object;
.source "QISJ"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public ܰ:Z


# virtual methods
.method public final declared-synchronized close()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 55
    :try_start_0
    iget-boolean v1, p0, Ll/ۙ֫᩵;->ܰ:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 56
    iput-boolean v1, p0, Ll/ۙ֫᩵;->ܰ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
