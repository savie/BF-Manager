.class public final Ll/ۨܰۙ;
.super Ll/᩷ۨۙ;
.source "E8FE"


# instance fields
.field public ᩸:Ll/ۙܿ֫;


# virtual methods
.method public final ۙ(Ljava/lang/String;)V
    .locals 1

    .line 92
    iget-object v0, p0, Ll/ۨܰۙ;->᩸:Ll/ۙܿ֫;

    if-nez v0, :cond_0

    .line 93
    invoke-static {p1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void

    .line 95
    :cond_0
    invoke-static {}, Ll/᩻֨ۚ;->᩸()V

    return-void
.end method

.method public final declared-synchronized ۙ(Ll/ۙܿ֫;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    :try_start_0
    const-string v1, "ffmpegJNI"

    .line 80
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/᩷ۨۙ;->ۙ([Ljava/lang/String;)V

    .line 81
    iput-object p1, p0, Ll/ۨܰۙ;->᩸:Ll/ۙܿ֫;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
