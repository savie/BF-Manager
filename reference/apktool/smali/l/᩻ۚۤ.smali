.class public final Ll/᩻ۚۤ;
.super Ljava/lang/RuntimeException;
.source "K6HB"


# virtual methods
.method public final declared-synchronized getCause()Ljava/io/IOException;
    .locals 2

    move-object v0, p0

    monitor-enter v0

    .line 13
    :try_start_0
    invoke-super {p0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    check-cast v1, Ljava/io/IOException;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final bridge synthetic getCause()Ljava/lang/Throwable;
    .locals 1

    .line 6
    invoke-virtual {p0}, Ll/᩻ۚۤ;->getCause()Ljava/io/IOException;

    move-result-object v0

    return-object v0
.end method
