.class public final Ll/ۢܿᩴ;
.super Ljava/lang/Object;
.source "F99O"


# instance fields
.field public volatile ۙ:Ll/ܰܿᩴ;

.field public volatile ۤ:Ll/ܶ۟ᩴ;

.field public volatile ܳ:Ljava/lang/Error;

.field public volatile ᩴ:Ljava/lang/RuntimeException;

.field public volatile ᩷:Z

.field public volatile ᩸:Ljava/io/IOException;


# virtual methods
.method public final declared-synchronized ۙ()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x1

    .line 243
    :try_start_0
    iput-boolean v1, p0, Ll/ۢܿᩴ;->᩷:Z

    .line 244
    iget-object v1, p0, Ll/ۢܿᩴ;->ۤ:Ll/ܶ۟ᩴ;

    if-eqz v1, :cond_0

    .line 245
    iget-object v1, p0, Ll/ۢܿᩴ;->ۤ:Ll/ܶ۟ᩴ;

    invoke-virtual {v1}, Ll/ܶ۟ᩴ;->ۙ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 246
    monitor-exit v0

    return-void

    .line 248
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/ۢܿᩴ;->ۙ:Ll/ܰܿᩴ;

    if-eqz v1, :cond_1

    .line 249
    iget-object v1, p0, Ll/ۢܿᩴ;->ۙ:Ll/ܰܿᩴ;

    invoke-static {v1}, Ll/᩵֫ܺ;->ۙ(Ljava/lang/AutoCloseable;)V

    const/4 v1, 0x0

    .line 250
    iput-object v1, p0, Ll/ۢܿᩴ;->ۙ:Ll/ܰܿᩴ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 252
    :cond_1
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

.method public final declared-synchronized ۙ(Ljava/io/IOException;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 216
    :try_start_0
    iget-boolean v1, p0, Ll/ۢܿᩴ;->᩷:Z

    if-nez v1, :cond_0

    .line 217
    iput-object p1, p0, Ll/ۢܿᩴ;->᩸:Ljava/io/IOException;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 219
    :cond_0
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

.method public final declared-synchronized ۙ(Ljava/lang/Error;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 234
    :try_start_0
    iget-boolean v1, p0, Ll/ۢܿᩴ;->᩷:Z

    if-nez v1, :cond_0

    .line 235
    iput-object p1, p0, Ll/ۢܿᩴ;->ܳ:Ljava/lang/Error;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 237
    :cond_0
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

.method public final declared-synchronized ۙ(Ljava/lang/RuntimeException;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 225
    :try_start_0
    iget-boolean v1, p0, Ll/ۢܿᩴ;->᩷:Z

    if-nez v1, :cond_0

    .line 226
    iput-object p1, p0, Ll/ۢܿᩴ;->ᩴ:Ljava/lang/RuntimeException;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 228
    :cond_0
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

.method public final declared-synchronized ۙ(Ll/ܶ۟ᩴ;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    .line 204
    :try_start_0
    iput-object v1, p0, Ll/ۢܿᩴ;->ۙ:Ll/ܰܿᩴ;

    .line 205
    iget-boolean v1, p0, Ll/ۢܿᩴ;->᩷:Z

    if-eqz v1, :cond_0

    .line 206
    invoke-virtual {p1}, Ll/ܶ۟ᩴ;->ۙ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 207
    monitor-exit v0

    return-void

    .line 209
    :cond_0
    :try_start_1
    iput-object p1, p0, Ll/ۢܿᩴ;->ۤ:Ll/ܶ۟ᩴ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 210
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
