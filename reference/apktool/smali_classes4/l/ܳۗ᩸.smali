.class public final Ll/ܳۗ᩸;
.super Ljava/lang/Object;
.source "L6RY"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ֡:I

.field public ܰ:[B

.field public ܿ:Ll/ܿۢ᩸;

.field public ᩶:Ll/᩵ۙᩴ;


# direct methods
.method public static ۙ(Ll/᩷ۗ᩸;Ll/᩸ۗ᩸;ILl/ۜܿ᩸;)Ll/ܳۗ᩸;
    .locals 7

    .line 454
    invoke-virtual {p0}, Ll/᩷ۗ᩸;->ۙ()[B

    move-result-object v0

    iget v1, p1, Ll/᩸ۗ᩸;->᩷:I

    iget v2, p1, Ll/᩸ۗ᩸;->ۙ:I

    invoke-static {v1, v0, v2, p2}, Ll/᩵ۙᩴ;->᩷(I[BII)I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v3, 0x5

    mul-long v3, v3, v0

    const-wide/16 v5, 0x100

    add-long/2addr v3, v5

    .line 456
    invoke-virtual {p3, v3, v4}, Ll/ۜܿ᩸;->᩷(J)Ll/ܿۢ᩸;

    move-result-object v3

    const-wide/16 v4, 0x8

    mul-long v0, v0, v4

    const-wide/16 v4, 0x2000

    add-long/2addr v0, v4

    const/4 v4, 0x0

    .line 458
    :try_start_0
    invoke-virtual {p3, v0, v1}, Ll/ۜܿ᩸;->᩷(J)Ll/ܿۢ᩸;

    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 459
    :try_start_1
    invoke-virtual {p0}, Ll/᩷ۗ᩸;->ۙ()[B

    move-result-object p0

    iget p1, p1, Ll/᩸ۗ᩸;->᩷:I

    invoke-static {p1, p0, v2, p2}, Ll/᩵ۙᩴ;->ۤ(I[BII)Ll/᩵ۙᩴ;

    move-result-object p0

    .line 460
    new-instance p1, Ll/ܳۗ᩸;

    invoke-virtual {p0}, Ll/᩵ۙᩴ;->ۙ()[B

    move-result-object p2

    .line 450
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 449
    iput v0, p1, Ll/ܳۗ᩸;->֡:I

    .line 451
    iput-object p2, p1, Ll/ܳۗ᩸;->ܰ:[B

    iput-object p0, p1, Ll/ܳۗ᩸;->᩶:Ll/᩵ۙᩴ;

    iput-object v3, p1, Ll/ܳۗ᩸;->ܿ:Ll/ܿۢ᩸;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz p3, :cond_0

    .line 463
    :try_start_2
    invoke-virtual {p3}, Ll/ܿۢ᩸;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object p1

    :catchall_0
    move-exception p0

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    return-object p1

    :catchall_1
    move-exception p0

    if-eqz p3, :cond_1

    .line 458
    :try_start_3
    invoke-virtual {p3}, Ll/ܿۢ᩸;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception p1

    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :catchall_3
    move-exception p0

    :goto_1
    if-nez v4, :cond_2

    if-eqz v3, :cond_2

    .line 463
    invoke-virtual {v3}, Ll/ܿۢ᩸;->close()V

    :cond_2
    throw p0
.end method

.method public static bridge synthetic ۙ(Ll/ܳۗ᩸;)[B
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳۗ᩸;->ܰ:[B

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/ܳۗ᩸;)Ll/᩵ۙᩴ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳۗ᩸;->᩶:Ll/᩵ۙᩴ;

    return-object p0
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 470
    :try_start_0
    iget v1, p0, Ll/ܳۗ᩸;->֡:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/ܳۗ᩸;->֡:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 471
    iput-object v1, p0, Ll/ܳۗ᩸;->᩶:Ll/᩵ۙᩴ;

    iput-object v1, p0, Ll/ܳۗ᩸;->ܰ:[B

    .line 472
    iget-object v2, p0, Ll/ܳۗ᩸;->ܿ:Ll/ܿۢ᩸;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ll/ܿۢ᩸;->close()V

    iput-object v1, p0, Ll/ܳۗ᩸;->ܿ:Ll/ܿۢ᩸;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 474
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

.method public final declared-synchronized ۠᩷()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 466
    :try_start_0
    iget v1, p0, Ll/ܳۗ᩸;->֡:I

    if-eqz v1, :cond_0

    add-int/lit8 v1, v1, 0x1

    .line 467
    iput v1, p0, Ll/ܳۗ᩸;->֡:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    .line 466
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Fragment search is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 467
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
