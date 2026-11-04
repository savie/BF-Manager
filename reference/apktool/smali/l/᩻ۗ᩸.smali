.class public final Ll/᩻ۗ᩸;
.super Ljava/lang/Object;
.source "A6S3"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final ֡:Ll/ܺۗ᩸;

.field public ۟:Z

.field public ܰ:Z

.field public final ܿ:Ljava/io/Closeable;

.field public final ᩶:Ll/᩹ܽ᩵;


# direct methods
.method public constructor <init>(Ll/ܺۗ᩸;Ljava/io/Closeable;)V
    .locals 1

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    new-instance v0, Ll/᩹ܽ᩵;

    invoke-direct {v0}, Ll/᩹ܽ᩵;-><init>()V

    iput-object v0, p0, Ll/᩻ۗ᩸;->᩶:Ll/᩹ܽ᩵;

    .line 81
    iput-object p1, p0, Ll/᩻ۗ᩸;->֡:Ll/ܺۗ᩸;

    iput-object p2, p0, Ll/᩻ۗ᩸;->ܿ:Ljava/io/Closeable;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    move-object v0, p0

    .line 95
    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Ll/᩻ۗ᩸;->ܰ:Z

    const/4 v2, 0x1

    iput-boolean v2, p0, Ll/᩻ۗ᩸;->ܰ:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-nez v1, :cond_0

    .line 97
    :try_start_1
    iget-object v0, p0, Ll/᩻ۗ᩸;->ܿ:Ljava/io/Closeable;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    iget-object v0, p0, Ll/᩻ۗ᩸;->᩶:Ll/᩹ܽ᩵;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/᩹ܽ᩵;->ۙ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 98
    :try_start_2
    iget-object v1, p0, Ll/᩻ۗ᩸;->᩶:Ll/᩹ܽ᩵;

    invoke-virtual {v1, v0}, Ll/᩹ܽ᩵;->ۙ(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 99
    :goto_0
    iget-object v0, p0, Ll/᩻ۗ᩸;->֡:Ll/ܺۗ᩸;

    invoke-static {v0, p0}, Ll/ܺۗ᩸;->ۙ(Ll/ܺۗ᩸;Ll/᩻ۗ᩸;)V

    goto :goto_1

    :catchall_1
    move-exception v0

    iget-object v1, p0, Ll/᩻ۗ᩸;->֡:Ll/ܺۗ᩸;

    invoke-static {v1, p0}, Ll/ܺۗ᩸;->ۙ(Ll/ܺۗ᩸;Ll/᩻ۗ᩸;)V

    throw v0

    .line 101
    :cond_0
    :goto_1
    :try_start_3
    iget-object v0, p0, Ll/᩻ۗ᩸;->᩶:Ll/᩹ܽ᩵;

    invoke-virtual {v0}, Ll/᩹ܽ᩵;->ᩴ()Ljava/lang/Object;
    :try_end_3
    .catch Ll/ۗܽ᩵; {:try_start_3 .. :try_end_3} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 103
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 104
    instance-of v1, v0, Ljava/io/IOException;

    if-nez v1, :cond_3

    .line 105
    instance-of v1, v0, Ljava/lang/RuntimeException;

    if-nez v1, :cond_2

    .line 106
    instance-of v1, v0, Ljava/lang/Error;

    if-eqz v1, :cond_1

    check-cast v0, Ljava/lang/Error;

    invoke-static {v0}, Ll/᩷᩷ܺ;->ۙ(Ljava/lang/Throwable;)V

    throw v0

    .line 107
    :cond_1
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Input close failed"

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 105
    :cond_2
    check-cast v0, Ljava/lang/RuntimeException;

    invoke-static {v0}, Ll/᩷᩷ܺ;->ۙ(Ljava/lang/Throwable;)V

    throw v0

    .line 104
    :cond_3
    check-cast v0, Ljava/io/IOException;

    invoke-static {v0}, Ll/᩷᩷ܺ;->ۙ(Ljava/lang/Throwable;)V

    throw v0

    :catchall_2
    move-exception v1

    .line 95
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v1
.end method

.method public final declared-synchronized ۙ()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 84
    :try_start_0
    iget-boolean v1, p0, Ll/᩻ۗ᩸;->۟:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Ll/᩻ۗ᩸;->ܰ:Z

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x1

    .line 85
    iput-boolean v1, p0, Ll/᩻ۗ᩸;->۟:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    :try_start_1
    sget-object v1, Ll/ۙ᩻ܺ;->ۤ:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v2, Ll/ۧۗ᩸;

    invoke-direct {v2, p0}, Ll/ۧۗ᩸;-><init>(Ll/᩻ۗ᩸;)V

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x0

    .line 90
    :try_start_2
    iput-boolean v1, p0, Ll/᩻ۗ᩸;->۟:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 91
    :goto_0
    monitor-exit v0

    return-void

    .line 84
    :cond_1
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method
