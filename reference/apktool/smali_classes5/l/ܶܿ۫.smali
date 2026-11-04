.class public final Ll/ܶܿ۫;
.super Ljava/io/BufferedInputStream;
.source "AAGU"

# interfaces
.implements Ll/ᩳ֡֫;
.implements Ll/۠ۜ᩹;


# instance fields
.field public final ܰ:Ll/᩵ܰܶ;

.field public volatile ܿ:I

.field public final ᩶:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/᩵ܰܶ;Ljava/io/InputStream;)V
    .locals 1

    const v0, 0x8000

    .line 289
    invoke-direct {p0, p2, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 285
    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ܶܿ۫;->᩶:Ljava/lang/Object;

    const/4 p2, 0x0

    .line 286
    iput p2, p0, Ll/ܶܿ۫;->ܿ:I

    .line 290
    iput-object p1, p0, Ll/ܶܿ۫;->ܰ:Ll/᩵ܰܶ;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 3

    .line 320
    iget-object v0, p0, Ll/ܶܿ۫;->᩶:Ljava/lang/Object;

    monitor-enter v0

    .line 321
    :try_start_0
    iget v1, p0, Ll/ܶܿ۫;->ܿ:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    monitor-exit v0

    return-void

    .line 322
    :cond_0
    iput v2, p0, Ll/ܶܿ۫;->ܿ:I

    .line 323
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 325
    iget-object v0, p0, Ll/ܶܿ۫;->ܰ:Ll/᩵ܰܶ;

    sget v1, Ll/ۢ᩶۫;->ۙ:I

    .line 194
    sget-object v1, Ll/ۙ᩻ܺ;->᩷:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Ll/۟᩶۫;

    invoke-direct {v2, v0}, Ll/۟᩶۫;-><init>(Ll/᩵ܰܶ;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception v1

    .line 323
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final close()V
    .locals 5

    .line 295
    iget-object v0, p0, Ll/ܶܿ۫;->᩶:Ljava/lang/Object;

    monitor-enter v0

    .line 296
    :try_start_0
    iget v1, p0, Ll/ܶܿ۫;->ܿ:I

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 297
    iput v1, p0, Ll/ܶܿ۫;->ܿ:I

    .line 298
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    const/4 v2, 0x2

    .line 301
    :try_start_1
    invoke-super {p0}, Ljava/io/BufferedInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 307
    iget-object v0, p0, Ll/ܶܿ۫;->᩶:Ljava/lang/Object;

    monitor-enter v0

    .line 308
    :try_start_2
    iget v3, p0, Ll/ܶܿ۫;->ܿ:I

    if-ne v3, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 309
    :goto_0
    iput v2, p0, Ll/ܶܿ۫;->ܿ:I

    .line 310
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_5

    .line 312
    iget-object v0, p0, Ll/ܶܿ۫;->ܰ:Ll/᩵ܰܶ;

    invoke-static {v0}, Ll/ۢ᩶۫;->᩷(Ll/᩵ܰܶ;)V

    return-void

    :catchall_0
    move-exception v1

    .line 310
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1

    :catchall_1
    move-exception v3

    .line 307
    iget-object v0, p0, Ll/ܶܿ۫;->᩶:Ljava/lang/Object;

    monitor-enter v0

    .line 308
    :try_start_4
    iget v4, p0, Ll/ܶܿ۫;->ܿ:I

    if-ne v4, v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    .line 309
    :goto_1
    iput v2, p0, Ll/ܶܿ۫;->ܿ:I

    .line 310
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-eqz v1, :cond_3

    .line 313
    iget-object v0, p0, Ll/ܶܿ۫;->ܰ:Ll/᩵ܰܶ;

    sget v1, Ll/ۢ᩶۫;->ۙ:I

    .line 194
    sget-object v1, Ll/ۙ᩻ܺ;->᩷:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Ll/۟᩶۫;

    invoke-direct {v2, v0}, Ll/۟᩶۫;-><init>(Ll/᩵ܰܶ;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 315
    :cond_3
    throw v3

    :catchall_2
    move-exception v1

    .line 310
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw v1

    .line 307
    :catch_0
    iget-object v0, p0, Ll/ܶܿ۫;->᩶:Ljava/lang/Object;

    monitor-enter v0

    .line 308
    :try_start_6
    iget v3, p0, Ll/ܶܿ۫;->ܿ:I

    if-ne v3, v1, :cond_4

    goto :goto_2

    :cond_4
    const/4 v1, 0x0

    .line 309
    :goto_2
    iput v2, p0, Ll/ܶܿ۫;->ܿ:I

    .line 310
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    if-eqz v1, :cond_5

    .line 313
    iget-object v0, p0, Ll/ܶܿ۫;->ܰ:Ll/᩵ܰܶ;

    sget v1, Ll/ۢ᩶۫;->ۙ:I

    .line 194
    sget-object v1, Ll/ۙ᩻ܺ;->᩷:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Ll/۟᩶۫;

    invoke-direct {v2, v0}, Ll/۟᩶۫;-><init>(Ll/᩵ܰܶ;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_5
    return-void

    :catchall_3
    move-exception v1

    .line 310
    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw v1

    :catchall_4
    move-exception v1

    .line 298
    :try_start_8
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    throw v1
.end method

.method public final finalize()V
    .locals 0

    .line 346
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 347
    invoke-virtual {p0}, Ll/ܶܿ۫;->close()V

    return-void
.end method

.method public final declared-synchronized read()I
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 341
    :try_start_0
    iget v1, p0, Ll/ܶܿ۫;->ܿ:I

    if-nez v1, :cond_0

    .line 331
    invoke-super {p0}, Ljava/io/BufferedInputStream;->read()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    .line 341
    :cond_0
    :try_start_1
    new-instance v1, Ljava/io/IOException;

    const-string v2, "SFTP input stream is closed"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 331
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized read([BII)I
    .locals 2

    move-object v0, p0

    monitor-enter v0

    .line 341
    :try_start_0
    iget v1, p0, Ll/ܶܿ۫;->ܿ:I

    if-nez v1, :cond_0

    const/16 v1, 0x7fff

    .line 337
    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    invoke-super {p0, p1, p2, p3}, Ljava/io/BufferedInputStream;->read([BII)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return p1

    .line 341
    :cond_0
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "SFTP input stream is closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 337
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/ۡۜ᩹;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
