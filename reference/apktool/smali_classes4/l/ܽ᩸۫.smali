.class public final Ll/ܽ᩸۫;
.super Ljava/lang/Object;
.source "57TP"


# instance fields
.field public volatile ۙ:Z

.field public final ۤ:Ljava/lang/Object;

.field public volatile ᩴ:Ljava/lang/Object;

.field public volatile ᩷:Z

.field public volatile ᩸:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 221
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 223
    iput-boolean v0, p0, Ll/ܽ᩸۫;->᩷:Z

    .line 224
    iput-boolean v0, p0, Ll/ܽ᩸۫;->ۙ:Z

    .line 225
    iput-boolean v0, p0, Ll/ܽ᩸۫;->᩸:Z

    .line 226
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ܽ᩸۫;->ۤ:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܽ᩸۫;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 2

    .line 256
    iget-object v0, p0, Ll/ܽ᩸۫;->ۤ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 257
    :try_start_0
    iput-boolean v1, p0, Ll/ܽ᩸۫;->ۙ:Z

    .line 258
    iget-object v1, p0, Ll/ܽ᩸۫;->ۤ:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 259
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ۙ(Ljava/lang/Object;)Z
    .locals 2

    .line 235
    iget-object v0, p0, Ll/ܽ᩸۫;->ۤ:Ljava/lang/Object;

    monitor-enter v0

    .line 236
    :try_start_0
    iget-boolean v1, p0, Ll/ܽ᩸۫;->ۙ:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Ll/ܽ᩸۫;->᩸:Z

    if-nez v1, :cond_0

    .line 237
    iput-object p1, p0, Ll/ܽ᩸۫;->ᩴ:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 238
    iput-boolean p1, p0, Ll/ܽ᩸۫;->᩷:Z

    .line 239
    iget-object v1, p0, Ll/ܽ᩸۫;->ۤ:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 240
    monitor-exit v0

    return p1

    :cond_0
    const/4 p1, 0x0

    .line 242
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 243
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۤ()Ljava/lang/Object;
    .locals 2

    .line 247
    iget-object v0, p0, Ll/ܽ᩸۫;->ۤ:Ljava/lang/Object;

    monitor-enter v0

    .line 248
    :goto_0
    :try_start_0
    iget-boolean v1, p0, Ll/ܽ᩸۫;->᩷:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Ll/ܽ᩸۫;->ۙ:Z

    if-nez v1, :cond_0

    .line 249
    iget-object v1, p0, Ll/ܽ᩸۫;->ۤ:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V

    goto :goto_0

    .line 251
    :cond_0
    iget-boolean v1, p0, Ll/ܽ᩸۫;->᩷:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/ܽ᩸۫;->ᩴ:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 252
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ᩷()V
    .locals 2

    .line 263
    iget-object v0, p0, Ll/ܽ᩸۫;->ۤ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 264
    :try_start_0
    iput-boolean v1, p0, Ll/ܽ᩸۫;->᩸:Z

    .line 265
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
