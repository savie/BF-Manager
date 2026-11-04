.class public final Ll/ᩳۢۚ;
.super Ll/֡ܿ᩻;
.source "26KB"


# instance fields
.field public volatile ֡:Z

.field public ܿ:Z


# direct methods
.method public static bridge synthetic ۙ(Ll/ᩳۢۚ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ᩳۢۚ;->֡:Z

    return p0
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 254
    :try_start_0
    iget-boolean v1, p0, Ll/ᩳۢۚ;->ܿ:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 255
    iput-boolean v1, p0, Ll/ᩳۢۚ;->ܿ:Z

    .line 256
    invoke-super {p0}, Ll/֡ܿ᩻;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 258
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

.method public final declared-synchronized readAt(J[BII)I
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 244
    :try_start_0
    iget-boolean v1, p0, Ll/ᩳۢۚ;->ܿ:Z

    if-nez v1, :cond_0

    .line 245
    invoke-super/range {p0 .. p5}, Ll/֡ܿ᩻;->readAt(J[BII)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return p1

    .line 244
    :cond_0
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Audio source is closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    move-exception p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :goto_0
    const/4 p2, 0x1

    .line 247
    :try_start_2
    iput-boolean p2, p0, Ll/ᩳۢۚ;->֡:Z

    .line 248
    throw p1

    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
