.class public final Ll/۠ۗ۫;
.super Ljava/lang/Object;
.source "L8GV"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public volatile ֡:I

.field public ֨:J

.field public final ۖ:Ll/֫᩷ܽ;

.field public final ۙۙ:J

.field public final ۜ:Ll/ܳܰ᩹;

.field public volatile ۟:Z

.field public final ۠:Ljava/lang/String;

.field public final ۡ:I

.field public volatile ۢ:Ljava/io/InputStream;

.field public final ۬:Ll/ۖۗ۫;

.field public ܰ:I

.field public ܿ:Ljava/lang/Thread;

.field public final ᩳ:Ljava/util/zip/CRC32;

.field public final ᩶:Ll/۬ܺۤ;

.field public final ᩷ۙ:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(Ll/ۖۗ۫;Ljava/lang/String;J)V
    .locals 4

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    invoke-static {}, Ll/᩹᩷ܽ;->᩸()Ll/᩹᩷ܽ;

    move-result-object v0

    const-wide/16 v1, 0x140

    invoke-virtual {v0, v1, v2}, Ll/᩹᩷ܽ;->ۙ(J)V

    invoke-virtual {v0}, Ll/᩹᩷ܽ;->ۙ()Ll/֫᩷ܽ;

    move-result-object v0

    iput-object v0, p0, Ll/۠ۗ۫;->ۖ:Ll/֫᩷ܽ;

    const/4 v0, 0x0

    .line 63
    iput v0, p0, Ll/۠ۗ۫;->֡:I

    .line 68
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Ll/۠ۗ۫;->᩷ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 413
    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    iput-object v0, p0, Ll/۠ۗ۫;->ᩳ:Ljava/util/zip/CRC32;

    .line 92
    iput-object p1, p0, Ll/۠ۗ۫;->۬:Ll/ۖۗ۫;

    .line 93
    iput-object p2, p0, Ll/۠ۗ۫;->۠:Ljava/lang/String;

    .line 94
    iput-wide p3, p0, Ll/۠ۗ۫;->ۙۙ:J

    const-wide/16 p1, 0x7fff

    add-long/2addr p3, p1

    const-wide/32 p1, 0x8000

    .line 219
    div-long/2addr p3, p1

    long-to-int p1, p3

    int-to-long v2, p1

    cmp-long p2, p3, v2

    if-nez p2, :cond_0

    sub-int/2addr p1, v1

    .line 95
    iput p1, p0, Ll/۠ۗ۫;->ۡ:I

    const/4 p1, 0x0

    .line 96
    iput-object p1, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    .line 97
    iput-object p1, p0, Ll/۠ۗ۫;->ۜ:Ll/ܳܰ᩹;

    return-void

    .line 0
    :cond_0
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method public constructor <init>(Ll/۬ۛܳ;Ljava/lang/String;JLl/᩷ۨᩴ;)V
    .locals 6

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    invoke-static {}, Ll/᩹᩷ܽ;->᩸()Ll/᩹᩷ܽ;

    move-result-object v0

    const-wide/16 v1, 0x140

    invoke-virtual {v0, v1, v2}, Ll/᩹᩷ܽ;->ۙ(J)V

    invoke-virtual {v0}, Ll/᩹᩷ܽ;->ۙ()Ll/֫᩷ܽ;

    move-result-object v0

    iput-object v0, p0, Ll/۠ۗ۫;->ۖ:Ll/֫᩷ܽ;

    const/4 v0, 0x0

    .line 63
    iput v0, p0, Ll/۠ۗ۫;->֡:I

    .line 68
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v1, p0, Ll/۠ۗ۫;->᩷ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 413
    new-instance v1, Ljava/util/zip/CRC32;

    invoke-direct {v1}, Ljava/util/zip/CRC32;-><init>()V

    iput-object v1, p0, Ll/۠ۗ۫;->ᩳ:Ljava/util/zip/CRC32;

    .line 101
    iput-object p1, p0, Ll/۠ۗ۫;->۬:Ll/ۖۗ۫;

    .line 102
    iput-object p2, p0, Ll/۠ۗ۫;->۠:Ljava/lang/String;

    .line 103
    iput-wide p3, p0, Ll/۠ۗ۫;->ۙۙ:J

    const-wide/16 p1, 0x7fff

    add-long/2addr p1, p3

    const-wide/32 v3, 0x8000

    .line 219
    div-long/2addr p1, v3

    long-to-int v1, p1

    int-to-long v3, v1

    cmp-long v5, p1, v3

    if-nez v5, :cond_5

    sub-int/2addr v1, v2

    .line 104
    iput v1, p0, Ll/۠ۗ۫;->ۡ:I

    .line 105
    invoke-virtual {p5}, Ll/᩷ۨᩴ;->ۖ()V

    const-string p1, "rw"

    .line 106
    invoke-virtual {p5, p1}, Ll/᩷ۨᩴ;->ۧ(Ljava/lang/String;)Ll/۬ܺۤ;

    move-result-object p1

    iput-object p1, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    .line 107
    new-instance p2, Ll/ܳܰ᩹;

    invoke-direct {p2}, Ll/ܳܰ᩹;-><init>()V

    iput-object p2, p0, Ll/۠ۗ۫;->ۜ:Ll/ܳܰ᩹;

    .line 109
    :try_start_0
    invoke-virtual {p1}, Ll/۬ܺۤ;->length()J

    move-result-wide v1

    const-wide/16 v3, 0xc

    cmp-long p2, v1, v3

    if-ltz p2, :cond_4

    .line 110
    invoke-virtual {p1}, Ll/۬ܺۤ;->readInt()I

    move-result p2

    const p5, 0x15632185

    if-ne p2, p5, :cond_3

    invoke-virtual {p1}, Ll/۬ܺۤ;->readLong()J

    move-result-wide v1

    cmp-long p2, v1, p3

    if-nez p2, :cond_3

    .line 114
    invoke-virtual {p1, v3, v4}, Ll/۬ܺۤ;->seek(J)V

    .line 115
    :goto_0
    iget-object p1, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    invoke-virtual {p1}, Ll/۬ܺۤ;->available()I

    move-result p1

    if-lez p1, :cond_2

    .line 116
    iget-object p1, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    invoke-virtual {p1}, Ll/۬ܺۤ;->available()I

    move-result p1

    const p2, 0x8008

    if-ge p1, p2, :cond_0

    .line 118
    iget-object p1, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    invoke-virtual {p1}, Ll/۬ܺۤ;->getFilePointer()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Ll/۬ܺۤ;->setLength(J)V

    return-void

    .line 121
    :cond_0
    iget-object p1, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    invoke-virtual {p1}, Ll/۬ܺۤ;->readInt()I

    move-result p1

    .line 122
    iget-object p2, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    invoke-virtual {p2}, Ll/۬ܺۤ;->ۡ᩷()I

    move-result p2

    .line 123
    iget p3, p0, Ll/۠ۗ۫;->ۡ:I

    if-gt p1, p3, :cond_1

    const p3, 0x8000

    if-gt p2, p3, :cond_1

    .line 126
    iget-object p2, p0, Ll/۠ۗ۫;->ۜ:Ll/ܳܰ᩹;

    add-int/lit8 p3, v0, 0x1

    invoke-virtual {p2, p1, v0}, Ll/ܳܰ᩹;->ۙ(II)I

    .line 130
    iget-object p1, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    int-to-long p4, p3

    const-wide/32 v0, 0x8008

    mul-long p4, p4, v0

    add-long/2addr p4, v3

    invoke-virtual {p1, p4, p5}, Ll/۬ܺۤ;->seek(J)V

    move v0, p3

    goto :goto_0

    .line 124
    :cond_1
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    throw p1

    :cond_2
    return-void

    .line 111
    :cond_3
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    throw p1

    .line 133
    :cond_4
    invoke-direct {p0}, Ll/۠ۗ۫;->ܽ()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 137
    :catch_0
    invoke-direct {p0}, Ll/۠ۗ۫;->ܽ()V

    return-void

    .line 0
    :cond_5
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method public static ۙ(Ll/۠ۗ۫;)V
    .locals 3

    const-wide/16 v0, 0xc8

    .line 658
    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    .line 660
    iget-object v0, p0, Ll/۠ۗ۫;->᩷ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    monitor-enter v0

    .line 661
    :try_start_0
    iget-object v1, p0, Ll/۠ۗ۫;->᩷ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    if-lez v1, :cond_0

    .line 665
    monitor-exit v0

    return-void

    .line 667
    :cond_0
    iget-boolean v1, p0, Ll/۠ۗ۫;->۟:Z

    if-eqz v1, :cond_1

    .line 668
    monitor-exit v0

    return-void

    :cond_1
    const/4 v1, 0x1

    .line 670
    iput-boolean v1, p0, Ll/۠ۗ۫;->۟:Z

    .line 671
    iget v2, p0, Ll/۠ۗ۫;->ܰ:I

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    .line 672
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 674
    iget-object v0, p0, Ll/۠ۗ۫;->ۢ:Ljava/io/InputStream;

    .line 779
    invoke-static {v0}, Ll/ۙ᩵ۨ;->ۙ(Ljava/io/Closeable;)V

    .line 675
    iget-object v0, p0, Ll/۠ۗ۫;->ܿ:Ljava/lang/Thread;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 676
    iget-object v0, p0, Ll/۠ۗ۫;->ܿ:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_3
    if-eqz v1, :cond_4

    .line 679
    invoke-direct {p0}, Ll/۠ۗ۫;->ܶ()V

    :cond_4
    return-void

    :catchall_0
    move-exception p0

    .line 672
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method private ۙ(II)[B
    .locals 4

    const-string v1, "Failed to load page "

    .line 296
    iget-object v0, p0, Ll/۠ۗ۫;->᩷ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    monitor-enter v0

    .line 297
    :try_start_0
    iget-boolean v2, p0, Ll/۠ۗ۫;->۟:Z

    if-nez v2, :cond_1

    .line 300
    iget v2, p0, Ll/۠ۗ۫;->ܰ:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/۠ۗ۫;->ܰ:I

    .line 301
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 303
    :try_start_1
    iget-object v0, p0, Ll/۠ۗ۫;->ۖ:Ll/֫᩷ܽ;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Ll/ᩳۗ۫;

    invoke-direct {v3, p0, p1, p2}, Ll/ᩳۗ۫;-><init>(Ll/۠ۗ۫;II)V

    invoke-interface {v0, v2, v3}, Ll/֫᩷ܽ;->ۙ(Ljava/lang/Integer;Ll/ᩳۗ۫;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [B
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 330
    invoke-direct {p0}, Ll/۠ۗ۫;->ۚ()V

    return-object p2

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p2

    .line 322
    :try_start_2
    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 323
    instance-of v2, v0, Ljava/io/IOException;

    if-eqz v2, :cond_0

    check-cast v0, Ljava/io/IOException;

    .line 324
    invoke-static {v0}, Ll/᩷᩷ܺ;->ۙ(Ljava/lang/Throwable;)V

    throw v0

    .line 326
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 330
    :goto_0
    invoke-direct {p0}, Ll/۠ۗ۫;->ۚ()V

    .line 331
    throw p1

    .line 298
    :cond_1
    :try_start_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_1
    move-exception p1

    .line 301
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method public static ۙ(Ll/۠ۗ۫;II)[B
    .locals 9

    .line 423
    iget-object v0, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 426
    :cond_0
    iget-object v0, p0, Ll/۠ۗ۫;->ۜ:Ll/ܳܰ᩹;

    const/4 v2, -0x1

    invoke-virtual {v0, p1, v2}, Ll/ܳܰ᩹;->ۤ(II)I

    move-result v3

    if-ne v3, v2, :cond_1

    goto :goto_0

    .line 431
    :cond_1
    :try_start_0
    iget-object v0, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 432
    :try_start_1
    iget-object v2, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    int-to-long v3, v3

    const-wide/32 v5, 0x8008

    mul-long v3, v3, v5

    const-wide/16 v5, 0xc

    add-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Ll/۬ܺۤ;->seek(J)V

    .line 433
    iget-object v2, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    invoke-virtual {v2}, Ll/۬ܺۤ;->readInt()I

    move-result v2

    .line 434
    iget-object v3, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    invoke-virtual {v3}, Ll/۬ܺۤ;->ۡ᩷()I

    move-result v3

    .line 435
    iget-object v4, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    invoke-virtual {v4}, Ll/۬ܺۤ;->ۡ᩷()I

    move-result v4

    if-eq v2, p1, :cond_2

    .line 440
    monitor-exit v0

    goto :goto_0

    :cond_2
    if-eq v3, p2, :cond_3

    .line 446
    monitor-exit v0

    goto :goto_0

    .line 448
    :cond_3
    new-array v2, v3, [B

    .line 449
    iget-object v5, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v6, 0x0

    .line 187
    invoke-virtual {v5, v2, v6, v3}, Ll/۬ܺۤ;->readFully([BII)V

    .line 416
    iget-object v3, p0, Ll/۠ۗ۫;->ᩳ:Ljava/util/zip/CRC32;

    .line 417
    invoke-virtual {v3}, Ljava/util/zip/CRC32;->reset()V

    .line 418
    invoke-virtual {v3, v2}, Ljava/util/zip/CRC32;->update([B)V

    .line 419
    invoke-virtual {v3}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v5

    const-wide/32 v7, 0xffff

    and-long/2addr v5, v7

    long-to-int v3, v5

    if-eq v4, v3, :cond_4

    .line 454
    monitor-exit v0

    goto :goto_0

    .line 459
    :cond_4
    monitor-exit v0

    move-object v1, v2

    goto :goto_0

    :catchall_0
    move-exception v2

    .line 460
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 464
    :catch_0
    :try_start_3
    invoke-direct {p0}, Ll/۠ۗ۫;->ܽ()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_0

    :catch_1
    nop

    :goto_0
    if-eqz v1, :cond_5

    .line 306
    array-length v0, v1

    if-ne v0, p2, :cond_5

    goto :goto_1

    .line 310
    :cond_5
    iput p1, p0, Ll/۠ۗ۫;->֡:I

    .line 313
    invoke-direct {p0, p1, p2}, Ll/۠ۗ۫;->᩷(II)[B

    move-result-object v1

    .line 316
    invoke-virtual {p0, p1, v1}, Ll/۠ۗ۫;->ۙ(I[B)V

    :goto_1
    return-object v1
.end method

.method private ۚ()V
    .locals 3

    .line 337
    iget-object v0, p0, Ll/۠ۗ۫;->᩷ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    monitor-enter v0

    .line 338
    :try_start_0
    iget v1, p0, Ll/۠ۗ۫;->ܰ:I

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    iput v1, p0, Ll/۠ۗ۫;->ܰ:I

    .line 339
    iget-boolean v1, p0, Ll/۠ۗ۫;->۟:Z

    if-eqz v1, :cond_0

    iget v1, p0, Ll/۠ۗ۫;->ܰ:I

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 340
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    .line 342
    invoke-direct {p0}, Ll/۠ۗ۫;->ܶ()V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    .line 340
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static bridge synthetic ۤ(Ll/۠ۗ۫;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۠ۗ۫;->۠:Ljava/lang/String;

    return-object p0
.end method

.method private ܶ()V
    .locals 1

    .line 689
    iget-object v0, p0, Ll/۠ۗ۫;->ۢ:Ljava/io/InputStream;

    .line 779
    invoke-static {v0}, Ll/ۙ᩵ۨ;->ۙ(Ljava/io/Closeable;)V

    const/4 v0, 0x0

    .line 690
    iput-object v0, p0, Ll/۠ۗ۫;->ۢ:Ljava/io/InputStream;

    .line 691
    iget-object v0, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    .line 823
    invoke-static {v0}, Ll/ۙ᩵ۨ;->ۙ(Ljava/io/Closeable;)V

    .line 692
    iget-object v0, p0, Ll/۠ۗ۫;->ۖ:Ll/֫᩷ܽ;

    invoke-interface {v0}, Ll/֫᩷ܽ;->᩸()V

    .line 693
    iget-object v0, p0, Ll/۠ۗ۫;->ۖ:Ll/֫᩷ܽ;

    invoke-interface {v0}, Ll/֫᩷ܽ;->᩷()V

    .line 694
    iget-object v0, p0, Ll/۠ۗ۫;->ۜ:Ll/ܳܰ᩹;

    if-eqz v0, :cond_0

    .line 695
    invoke-virtual {v0}, Ll/ܳܰ᩹;->clear()V

    .line 696
    iget-object v0, p0, Ll/۠ۗ۫;->ۜ:Ll/ܳܰ᩹;

    invoke-virtual {v0}, Ll/ܳܰ᩹;->ᩴ()V

    :cond_0
    return-void
.end method

.method private ܽ()V
    .locals 7

    const-wide/16 v0, 0x0

    .line 160
    iget-object v2, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    invoke-virtual {v2, v0, v1}, Ll/۬ܺۤ;->setLength(J)V

    const v0, 0x15632185

    .line 161
    invoke-virtual {v2, v0}, Ll/۬ܺۤ;->writeInt(I)V

    .line 106
    iget-wide v0, p0, Ll/۠ۗ۫;->ۙۙ:J

    const-wide/16 v3, 0xff

    and-long v5, v0, v3

    long-to-int v6, v5

    invoke-virtual {v2, v6}, Ll/۬ܺۤ;->write(I)V

    const/16 v5, 0x8

    ushr-long v5, v0, v5

    and-long/2addr v5, v3

    long-to-int v6, v5

    .line 107
    invoke-virtual {v2, v6}, Ll/۬ܺۤ;->write(I)V

    const/16 v5, 0x10

    ushr-long v5, v0, v5

    and-long/2addr v5, v3

    long-to-int v6, v5

    .line 108
    invoke-virtual {v2, v6}, Ll/۬ܺۤ;->write(I)V

    const/16 v5, 0x18

    ushr-long v5, v0, v5

    and-long/2addr v5, v3

    long-to-int v6, v5

    .line 109
    invoke-virtual {v2, v6}, Ll/۬ܺۤ;->write(I)V

    const/16 v5, 0x20

    ushr-long v5, v0, v5

    and-long/2addr v5, v3

    long-to-int v6, v5

    .line 110
    invoke-virtual {v2, v6}, Ll/۬ܺۤ;->write(I)V

    const/16 v5, 0x28

    ushr-long v5, v0, v5

    and-long/2addr v5, v3

    long-to-int v6, v5

    .line 111
    invoke-virtual {v2, v6}, Ll/۬ܺۤ;->write(I)V

    const/16 v5, 0x30

    ushr-long v5, v0, v5

    and-long/2addr v5, v3

    long-to-int v6, v5

    .line 112
    invoke-virtual {v2, v6}, Ll/۬ܺۤ;->write(I)V

    const/16 v5, 0x38

    ushr-long/2addr v0, v5

    and-long/2addr v0, v3

    long-to-int v1, v0

    .line 113
    invoke-virtual {v2, v1}, Ll/۬ܺۤ;->write(I)V

    .line 163
    iget-object v0, p0, Ll/۠ۗ۫;->ۜ:Ll/ܳܰ᩹;

    invoke-virtual {v0}, Ll/ܳܰ᩹;->clear()V

    return-void
.end method

.method public static ᩷(Ll/۠ۗ۫;)V
    .locals 7

    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 241
    :try_start_0
    iget-boolean v0, p0, Ll/۠ۗ۫;->۟:Z

    if-nez v0, :cond_7

    iget-object v0, p0, Ll/۠ۗ۫;->ۜ:Ll/ܳܰ᩹;

    invoke-virtual {v0}, Ll/ܳܰ᩹;->size()I

    move-result v0

    iget v2, p0, Ll/۠ۗ۫;->ۡ:I

    add-int/lit8 v2, v2, 0x1

    if-ge v0, v2, :cond_7

    .line 242
    iget v0, p0, Ll/۠ۗ۫;->֡:I

    move v2, v0

    .line 244
    :goto_1
    iget v3, p0, Ll/۠ۗ۫;->ۡ:I

    const/4 v4, -0x1

    if-gt v2, v3, :cond_2

    .line 245
    iget-object v3, p0, Ll/۠ۗ۫;->ۜ:Ll/ܳܰ᩹;

    invoke-virtual {v3, v2}, Ll/ܳܰ᩹;->ۙ(I)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, -0x1

    :goto_2
    if-ne v2, v4, :cond_4

    const/4 v3, 0x0

    :goto_3
    if-ge v3, v0, :cond_4

    .line 252
    iget-object v5, p0, Ll/۠ۗ۫;->ۜ:Ll/ܳܰ᩹;

    invoke-virtual {v5, v3}, Ll/ܳܰ᩹;->ۙ(I)Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v5, :cond_3

    move v2, v3

    goto :goto_4

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_4
    :goto_4
    if-ne v2, v4, :cond_5

    goto :goto_6

    .line 210
    :cond_5
    :try_start_1
    iget v3, p0, Ll/۠ۗ۫;->ۡ:I

    if-ne v2, v3, :cond_6

    int-to-long v3, v2

    const-wide/32 v5, 0x8000

    mul-long v3, v3, v5

    .line 212
    iget-wide v5, p0, Ll/۠ۗ۫;->ۙۙ:J

    sub-long/2addr v5, v3

    long-to-int v3, v5

    goto :goto_5

    :cond_6
    const v3, 0x8000

    .line 265
    :goto_5
    invoke-direct {p0, v2, v3}, Ll/۠ۗ۫;->ۙ(II)[B
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 272
    :try_start_2
    iget v3, p0, Ll/۠ۗ۫;->֡:I

    if-ne v0, v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    .line 273
    iput v2, p0, Ll/۠ۗ۫;->֡:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catch_0
    :cond_7
    :goto_6
    move-object v0, p0

    .line 281
    monitor-enter v0

    .line 282
    :try_start_3
    iget-object v2, p0, Ll/۠ۗ۫;->ۢ:Ljava/io/InputStream;

    if-eqz v2, :cond_8

    .line 283
    iget-object v2, p0, Ll/۠ۗ۫;->ۢ:Ljava/io/InputStream;

    .line 779
    invoke-static {v2}, Ll/ۙ᩵ۨ;->ۙ(Ljava/io/Closeable;)V

    .line 284
    iput-object v1, p0, Ll/۠ۗ۫;->ۢ:Ljava/io/InputStream;

    .line 286
    :cond_8
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 287
    invoke-direct {p0}, Ll/۠ۗ۫;->ۚ()V

    return-void

    :catchall_0
    move-exception p0

    .line 286
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p0

    :catchall_1
    move-exception v0

    move-object v2, v0

    move-object v0, p0

    .line 281
    monitor-enter v0

    .line 282
    :try_start_5
    iget-object v3, p0, Ll/۠ۗ۫;->ۢ:Ljava/io/InputStream;

    if-eqz v3, :cond_9

    .line 283
    iget-object v3, p0, Ll/۠ۗ۫;->ۢ:Ljava/io/InputStream;

    .line 779
    invoke-static {v3}, Ll/ۙ᩵ۨ;->ۙ(Ljava/io/Closeable;)V

    .line 284
    iput-object v1, p0, Ll/۠ۗ۫;->ۢ:Ljava/io/InputStream;

    .line 286
    :cond_9
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 287
    invoke-direct {p0}, Ll/۠ۗ۫;->ۚ()V

    .line 288
    throw v2

    :catchall_2
    move-exception p0

    .line 286
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw p0
.end method

.method private declared-synchronized ᩷(II)[B
    .locals 8

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 348
    :try_start_0
    iget-boolean v1, p0, Ll/۠ۗ۫;->۟:Z

    if-nez v1, :cond_6

    int-to-long v1, p1

    const-wide/32 v3, 0x8000

    mul-long v1, v1, v3

    .line 355
    iget-object p1, p0, Ll/۠ۗ۫;->ۢ:Ljava/io/InputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v3, 0x0

    if-eqz p1, :cond_2

    .line 358
    :try_start_1
    iget-wide v4, p0, Ll/۠ۗ۫;->֨:J

    cmp-long p1, v1, v4

    if-nez p1, :cond_0

    .line 359
    iget-object p1, p0, Ll/۠ۗ۫;->ۢ:Ljava/io/InputStream;

    invoke-static {p1, p2}, Ll/ۙ᩵ۨ;->ۙ(Ljava/io/InputStream;I)[B

    move-result-object p1

    .line 360
    array-length v4, p1

    int-to-long v4, v4

    add-long/2addr v4, v1

    iput-wide v4, p0, Ll/۠ۗ۫;->֨:J
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 364
    monitor-exit v0

    return-object p1

    :cond_0
    if-lez p1, :cond_1

    sub-long v4, v1, v4

    const-wide/32 v6, 0x50000

    cmp-long p1, v4, v6

    if-gez p1, :cond_1

    .line 366
    :try_start_2
    iget-object p1, p0, Ll/۠ۗ۫;->ۢ:Ljava/io/InputStream;

    iget-wide v4, p0, Ll/۠ۗ۫;->֨:J

    sub-long v4, v1, v4

    invoke-static {v4, v5, p1}, Ll/ۙ᩵ۨ;->᩷(JLjava/io/InputStream;)V

    .line 367
    iput-wide v1, p0, Ll/۠ۗ۫;->֨:J

    .line 368
    iget-object p1, p0, Ll/۠ۗ۫;->ۢ:Ljava/io/InputStream;

    invoke-static {p1, p2}, Ll/ۙ᩵ۨ;->ۙ(Ljava/io/InputStream;I)[B

    move-result-object p1

    .line 369
    array-length v4, p1

    int-to-long v4, v4

    add-long/2addr v4, v1

    iput-wide v4, p0, Ll/۠ۗ۫;->֨:J
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 373
    monitor-exit v0

    return-object p1

    .line 375
    :cond_1
    :try_start_3
    iget-object p1, p0, Ll/۠ۗ۫;->ۢ:Ljava/io/InputStream;

    .line 779
    invoke-static {p1}, Ll/ۙ᩵ۨ;->ۙ(Ljava/io/Closeable;)V

    .line 376
    iput-object v3, p0, Ll/۠ۗ۫;->ۢ:Ljava/io/InputStream;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 383
    :catch_0
    :try_start_4
    iget-object p1, p0, Ll/۠ۗ۫;->ۢ:Ljava/io/InputStream;

    .line 779
    invoke-static {p1}, Ll/ۙ᩵ۨ;->ۙ(Ljava/io/Closeable;)V

    .line 384
    iput-object v3, p0, Ll/۠ۗ۫;->ۢ:Ljava/io/InputStream;

    .line 390
    :cond_2
    :goto_0
    iget-boolean p1, p0, Ll/۠ۗ۫;->۟:Z

    if-nez p1, :cond_5

    .line 393
    iget-object p1, p0, Ll/۠ۗ۫;->۬:Ll/ۖۗ۫;

    invoke-interface {p1, v1, v2}, Ll/ۖۗ۫;->ۙ(J)Ljava/io/InputStream;

    move-result-object p1

    .line 394
    instance-of v4, p1, Ljava/io/BufferedInputStream;

    if-nez v4, :cond_3

    instance-of v4, p1, Ll/ۨܽۤ;

    if-nez v4, :cond_3

    .line 395
    new-instance v4, Ljava/io/BufferedInputStream;

    invoke-direct {v4, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    move-object p1, v4

    .line 397
    :cond_3
    iput-object p1, p0, Ll/۠ۗ۫;->ۢ:Ljava/io/InputStream;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 399
    :try_start_5
    iget-boolean v4, p0, Ll/۠ۗ۫;->۟:Z

    if-nez v4, :cond_4

    .line 402
    invoke-static {p1, p2}, Ll/ۙ᩵ۨ;->ۙ(Ljava/io/InputStream;I)[B

    move-result-object p2

    .line 403
    array-length v4, p2

    int-to-long v4, v4

    add-long/2addr v1, v4

    iput-wide v1, p0, Ll/۠ۗ۫;->֨:J
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 404
    monitor-exit v0

    return-object p2

    .line 400
    :cond_4
    :try_start_6
    new-instance p2, Ljava/io/IOException;

    const-string v1, "Closed"

    invoke-direct {p2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catch_1
    move-exception p2

    .line 779
    :try_start_7
    invoke-static {p1}, Ll/ۙ᩵ۨ;->ۙ(Ljava/io/Closeable;)V

    .line 408
    iput-object v3, p0, Ll/۠ۗ۫;->ۢ:Ljava/io/InputStream;

    .line 409
    throw p2

    .line 391
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 349
    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 409
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 642
    iget-boolean v0, p0, Ll/۠ۗ۫;->۟:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 645
    :cond_0
    iget-object v0, p0, Ll/۠ۗ۫;->᩷ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-lez v0, :cond_1

    :goto_0
    return-void

    .line 651
    :cond_1
    iget-object v0, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    if-eqz v0, :cond_2

    .line 652
    invoke-virtual {v0}, Ll/۬ܺۤ;->flush()V

    .line 657
    :cond_2
    sget-object v0, Ll/ۙ᩻ܺ;->᩷:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/᩻֫᩸;

    const/4 v2, 0x6

    invoke-direct {v1, v2, p0}, Ll/᩻֫᩸;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public final ۙ()Landroid/media/MediaDataSource;
    .locals 1

    .line 525
    new-instance v0, Ll/֨ۗ۫;

    invoke-direct {v0, p0}, Ll/֨ۗ۫;-><init>(Ll/۠ۗ۫;)V

    return-object v0
.end method

.method public final ۙ(I[B)V
    .locals 12

    .line 473
    iget-object v0, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 480
    :cond_0
    :try_start_0
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 482
    :try_start_1
    iget-object v1, p0, Ll/۠ۗ۫;->ۜ:Ll/ܳܰ᩹;

    const/4 v2, -0x1

    invoke-virtual {v1, p1, v2}, Ll/ܳܰ᩹;->ۤ(II)I

    move-result v1

    const-wide/16 v2, -0x1

    const-wide/32 v4, 0x8008

    const-wide/16 v6, 0xc

    if-ltz v1, :cond_1

    int-to-long v8, v1

    mul-long v8, v8, v4

    add-long/2addr v8, v6

    .line 486
    iget-object v1, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    invoke-virtual {v1}, Ll/۬ܺۤ;->length()J

    move-result-wide v10

    cmp-long v1, v8, v10

    if-gez v1, :cond_1

    .line 487
    iget-object v1, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    invoke-virtual {v1, v8, v9}, Ll/۬ܺۤ;->seek(J)V

    .line 488
    iget-object v1, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    invoke-virtual {v1}, Ll/۬ܺۤ;->readInt()I

    move-result v1

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    move-wide v8, v2

    :goto_0
    cmp-long v1, v8, v2

    if-nez v1, :cond_2

    .line 497
    iget-object v1, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    invoke-virtual {v1}, Ll/۬ܺۤ;->length()J

    move-result-wide v8

    sub-long v1, v8, v6

    .line 498
    rem-long/2addr v1, v4

    long-to-int v2, v1

    if-eqz v2, :cond_2

    int-to-long v1, v2

    sub-long/2addr v8, v1

    .line 501
    iget-object v1, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    invoke-virtual {v1, v8, v9}, Ll/۬ܺۤ;->setLength(J)V

    :cond_2
    sub-long v1, v8, v6

    .line 504
    div-long/2addr v1, v4

    long-to-int v2, v1

    .line 505
    iget-object v1, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    invoke-virtual {v1, v8, v9}, Ll/۬ܺۤ;->seek(J)V

    .line 506
    iget-object v1, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    invoke-virtual {v1, p1}, Ll/۬ܺۤ;->writeInt(I)V

    .line 507
    iget-object v1, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    array-length v3, p2

    invoke-virtual {v1, v3}, Ll/۬ܺۤ;->᩻(I)V

    .line 508
    iget-object v1, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    .line 416
    iget-object v3, p0, Ll/۠ۗ۫;->ᩳ:Ljava/util/zip/CRC32;

    .line 417
    invoke-virtual {v3}, Ljava/util/zip/CRC32;->reset()V

    .line 418
    invoke-virtual {v3, p2}, Ljava/util/zip/CRC32;->update([B)V

    .line 419
    invoke-virtual {v3}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v3

    const-wide/32 v5, 0xffff

    and-long/2addr v3, v5

    long-to-int v4, v3

    .line 508
    invoke-virtual {v1, v4}, Ll/۬ܺۤ;->᩻(I)V

    .line 509
    iget-object v1, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    array-length v3, p2

    const/4 v4, 0x0

    invoke-virtual {v1, p2, v4, v3}, Ll/۬ܺۤ;->write([BII)V

    .line 510
    array-length v1, p2

    const v3, 0x8000

    if-ge v1, v3, :cond_3

    .line 511
    iget-object v1, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    array-length p2, p2

    sub-int/2addr v3, p2

    new-array p2, v3, [B

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    invoke-virtual {v1, p2, v4, v3}, Ll/۬ܺۤ;->write([BII)V

    .line 513
    :cond_3
    iget-object p2, p0, Ll/۠ۗ۫;->ۜ:Ll/ܳܰ᩹;

    invoke-virtual {p2, p1, v2}, Ll/ܳܰ᩹;->ۙ(II)I

    .line 517
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :goto_1
    return-void
.end method

.method public final ۤ(J[BII)I
    .locals 9

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_4

    if-eqz p3, :cond_4

    if-ltz p4, :cond_4

    if-ltz p5, :cond_4

    add-int v0, p4, p5

    .line 168
    array-length v1, p3

    if-gt v0, v1, :cond_4

    .line 171
    iget-wide v0, p0, Ll/۠ۗ۫;->ۙۙ:J

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    int-to-long v2, p5

    sub-long v4, v0, p1

    .line 175
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int p5, v2

    if-nez p5, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    move v2, p5

    :goto_0
    if-lez v2, :cond_3

    const-wide/32 v3, 0x8000

    .line 185
    div-long v5, p1, v3

    long-to-int v6, v5

    int-to-long v7, v6

    mul-long v7, v7, v3

    .line 210
    iget v3, p0, Ll/۠ۗ۫;->ۡ:I

    if-ne v6, v3, :cond_2

    sub-long v3, v0, v7

    long-to-int v4, v3

    goto :goto_1

    :cond_2
    const v4, 0x8000

    :goto_1
    sub-long v7, p1, v7

    long-to-int v3, v7

    sub-int v5, v4, v3

    .line 191
    invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 193
    invoke-direct {p0, v6, v4}, Ll/۠ۗ۫;->ۙ(II)[B

    move-result-object v4

    .line 195
    invoke-static {v4, v3, p3, p4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int/2addr v2, v5

    add-int/2addr p4, v5

    int-to-long v3, v5

    add-long/2addr p1, v3

    goto :goto_0

    :cond_3
    return p5

    .line 169
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid arguments"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۤ()J
    .locals 2

    .line 206
    iget-wide v0, p0, Ll/۠ۗ۫;->ۙۙ:J

    return-wide v0
.end method

.method public final ۫()Z
    .locals 2

    .line 627
    iget-object v0, p0, Ll/۠ۗ۫;->᩷ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    monitor-enter v0

    .line 628
    :try_start_0
    iget-boolean v1, p0, Ll/۠ۗ۫;->۟:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 629
    monitor-exit v0

    return v1

    .line 631
    :cond_0
    iget-object v1, p0, Ll/۠ۗ۫;->᩷ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    const/4 v1, 0x1

    .line 635
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 636
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ܳ()V
    .locals 6

    const-string v2, "NetworkFileCacheThread-"

    move-object v0, p0

    .line 3
    monitor-enter v0

    .line 230
    :try_start_0
    iget-object v1, p0, Ll/۠ۗ۫;->᩷ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 231
    :try_start_1
    iget-boolean v3, p0, Ll/۠ۗ۫;->۟:Z

    if-nez v3, :cond_1

    iget-object v3, p0, Ll/۠ۗ۫;->ܿ:Ljava/lang/Thread;

    if-nez v3, :cond_1

    iget-object v3, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    if-nez v3, :cond_0

    goto :goto_0

    .line 237
    :cond_0
    iget v3, p0, Ll/۠ۗ۫;->ܰ:I

    const/4 v4, 0x1

    add-int/2addr v3, v4

    iput v3, p0, Ll/۠ۗ۫;->ܰ:I

    .line 238
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 239
    :try_start_2
    new-instance v1, Ljava/lang/Thread;

    new-instance v3, Ll/᩹ۤۤ;

    const/4 v5, 0x3

    invoke-direct {v3, v5, p0}, Ll/᩹ۤۤ;-><init>(ILjava/lang/Object;)V

    invoke-direct {v1, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v1, p0, Ll/۠ۗ۫;->ܿ:Ljava/lang/Thread;

    .line 290
    invoke-virtual {v1, v4}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 291
    iget-object v1, p0, Ll/۠ۗ۫;->ܿ:Ljava/lang/Thread;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/۠ۗ۫;->۠:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 292
    iget-object v1, p0, Ll/۠ۗ۫;->ܿ:Ljava/lang/Thread;

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 293
    monitor-exit v0

    return-void

    .line 232
    :cond_1
    :goto_0
    :try_start_3
    iget-object v2, p0, Ll/۠ۗ۫;->ܿ:Ljava/lang/Thread;

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Ll/۠ۗ۫;->۟:Z

    if-nez v2, :cond_2

    iget-object v2, p0, Ll/۠ۗ۫;->᩶:Ll/۬ܺۤ;

    if-eqz v2, :cond_2

    .line 233
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v0

    return-void

    .line 235
    :cond_2
    :try_start_4
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2}, Ljava/lang/IllegalStateException;-><init>()V

    throw v2

    :catchall_0
    move-exception v2

    .line 238
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v2

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v1
.end method

.method public final ᩷()Ll/ܳܽۤ;
    .locals 1

    .line 550
    new-instance v0, Ll/ۡۗ۫;

    invoke-direct {v0, p0}, Ll/ۡۗ۫;-><init>(Ll/۠ۗ۫;)V

    return-object v0
.end method
