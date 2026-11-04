.class public final Ll/᩹ۙܳ;
.super Ljava/lang/Object;
.source "RIRZ"

# interfaces
.implements Ll/᩸۫ܳ;
.implements Ll/᩷۫ܳ;


# instance fields
.field public final ֡:Ljava/io/File;

.field public final ܰ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ܿ:Ll/֨᩷ܳ;

.field public final ᩶:Ll/۫۫ܳ;


# direct methods
.method public constructor <init>(Ll/۫۫ܳ;Ll/֨᩷ܳ;Ljava/io/File;)V
    .locals 2

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Ll/᩹ۙܳ;->ܰ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 28
    iput-object p1, p0, Ll/᩹ۙܳ;->᩶:Ll/۫۫ܳ;

    .line 29
    iput-object p2, p0, Ll/᩹ۙܳ;->ܿ:Ll/֨᩷ܳ;

    .line 30
    iput-object p3, p0, Ll/᩹ۙܳ;->֡:Ljava/io/File;

    return-void
.end method

.method public static ۙ(Ll/᩷ۨᩴ;Ljava/io/File;Ljava/util/function/BooleanSupplier;Ll/ܶۤܳ;)Ll/᩹ۙܳ;
    .locals 11

    .line 39
    invoke-static {p0}, Ll/֨᩷ܳ;->᩷(Ll/᩷ۨᩴ;)Ll/֨᩷ܳ;

    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ll/֨᩷ܳ;->᩸()Ll/ۛᩴܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛᩴܳ;->᩷()J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    cmp-long v4, v0, v2

    if-gtz v4, :cond_9

    .line 41
    invoke-virtual {p0}, Ll/֨᩷ܳ;->᩷()Ll/᩷ۨᩴ;

    move-result-object v0

    .line 42
    instance-of v1, v0, Ll/֨ۨᩴ;

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ll/֨ۨᩴ;

    .line 43
    invoke-static {v0}, Ll/۫۫ܳ;->ۙ(Ll/֨ۨᩴ;)Ll/۫۫ܳ;

    move-result-object p1

    .line 45
    :try_start_0
    invoke-virtual {p0}, Ll/֨᩷ܳ;->ܳ()V

    .line 46
    new-instance p2, Ll/᩹ۙܳ;

    invoke-direct {p2, p1, p0, v4}, Ll/᩹ۙܳ;-><init>(Ll/۫۫ܳ;Ll/֨᩷ܳ;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    .line 48
    :goto_0
    invoke-virtual {p1}, Ll/۫۫ܳ;->close()V

    .line 49
    throw p0

    :cond_0
    if-nez p3, :cond_1

    const-string v1, "hex-compare-"

    const-string v5, ".bin"

    .line 52
    invoke-static {v1, v5, p1}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object p1

    goto :goto_1

    .line 53
    :cond_1
    new-instance p1, Ljava/io/File;

    invoke-virtual {p3}, Ll/ܶۤܳ;->᩸()Ll/֨ۨᩴ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 57
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->᩷᩷()Ljava/io/BufferedInputStream;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 58
    :try_start_2
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    const/high16 v5, 0x10000

    :try_start_3
    new-array v5, v5, [B

    const-wide/16 v6, 0x0

    .line 61
    :goto_2
    invoke-virtual {v0, v5}, Ljava/io/InputStream;->read([B)I

    move-result v8

    const/4 v9, -0x1

    if-eq v8, v9, :cond_4

    .line 62
    invoke-interface {p2}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v9

    if-nez v9, :cond_3

    int-to-long v9, v8

    add-long/2addr v6, v9

    cmp-long v9, v6, v2

    if-gtz v9, :cond_2

    const/4 v9, 0x0

    .line 66
    invoke-virtual {v1, v5, v9, v8}, Ljava/io/FileOutputStream;->write([BII)V

    goto :goto_2

    .line 65
    :cond_2
    new-instance p0, Ll/ۨᩴܳ;

    invoke-direct {p0}, Ll/ۨᩴܳ;-><init>()V

    throw p0

    .line 62
    :cond_3
    new-instance p0, Ll/ۡܳܳ;

    invoke-direct {p0}, Ll/ۡܳܳ;-><init>()V

    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 68
    :cond_4
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :try_start_5
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 69
    invoke-virtual {p0}, Ll/֨᩷ܳ;->ܳ()V

    .line 70
    new-instance p2, Ll/֨ۨᩴ;

    invoke-direct {p2, p1}, Ll/֨ۨᩴ;-><init>(Ljava/io/File;)V

    invoke-static {p2}, Ll/۫۫ܳ;->ۙ(Ll/֨ۨᩴ;)Ll/۫۫ܳ;

    move-result-object p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 71
    :try_start_6
    new-instance v0, Ll/᩹ۙܳ;

    if-nez p3, :cond_5

    move-object v4, p1

    :cond_5
    invoke-direct {v0, p2, p0, v4}, Ll/᩹ۙܳ;-><init>(Ll/۫۫ܳ;Ll/֨᩷ܳ;Ljava/io/File;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    return-object v0

    :catchall_0
    move-exception p0

    move-object v4, p2

    goto :goto_5

    :catchall_1
    move-exception p0

    .line 57
    :try_start_7
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception p2

    :try_start_8
    invoke-virtual {p0, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :catchall_3
    move-exception p0

    :try_start_9
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    goto :goto_4

    :catchall_4
    move-exception p2

    :try_start_a
    invoke-virtual {p0, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    :catchall_5
    move-exception p0

    :goto_5
    if-eqz v4, :cond_7

    .line 76
    :try_start_b
    invoke-virtual {v4}, Ll/۫۫ܳ;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    goto :goto_6

    :catchall_6
    move-exception p0

    .line 77
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result p2

    if-nez p2, :cond_6

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-virtual {p1}, Ljava/io/File;->deleteOnExit()V

    :cond_6
    throw p0

    :cond_7
    :goto_6
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result p2

    if-nez p2, :cond_8

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-virtual {p1}, Ljava/io/File;->deleteOnExit()V

    .line 79
    :cond_8
    throw p0

    .line 40
    :cond_9
    new-instance p0, Ll/ۨᩴܳ;

    invoke-direct {p0}, Ll/ۨᩴܳ;-><init>()V

    throw p0
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 100
    iget-object v0, p0, Ll/᩹ۙܳ;->֡:Ljava/io/File;

    iget-object v1, p0, Ll/᩹ۙܳ;->ܰ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 101
    :cond_0
    :try_start_0
    iget-object v1, p0, Ll/᩹ۙܳ;->᩶:Ll/۫۫ܳ;

    invoke-virtual {v1}, Ll/۫۫ܳ;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    .line 102
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->deleteOnExit()V

    :cond_1
    :goto_0
    return-void

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->deleteOnExit()V

    :cond_2
    throw v1
.end method

.method public final length()I
    .locals 1

    .line 84
    iget-object v0, p0, Ll/᩹ۙܳ;->᩶:Ll/۫۫ܳ;

    invoke-virtual {v0}, Ll/۫۫ܳ;->length()I

    move-result v0

    return v0
.end method

.method public final ۙ(I[BII)V
    .locals 1

    .line 86
    iget-object v0, p0, Ll/᩹ۙܳ;->᩶:Ll/۫۫ܳ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/۫۫ܳ;->ۙ(I[BII)V

    return-void
.end method

.method public final ۙ()Z
    .locals 1

    .line 107
    iget-object v0, p0, Ll/᩹ۙܳ;->ܿ:Ll/֨᩷ܳ;

    invoke-virtual {v0}, Ll/֨᩷ܳ;->᩷()Ll/᩷ۨᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܿۙ()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic ۠᩷()Ll/᩸۫ܳ;
    .locals 0

    .line 21
    invoke-virtual {p0}, Ll/᩹ۙܳ;->۠᩷()V

    return-object p0
.end method

.method public final ۠᩷()V
    .locals 3

    .line 93
    :cond_0
    iget-object v0, p0, Ll/᩹ۙܳ;->ܰ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    if-lez v1, :cond_1

    add-int/lit8 v2, v1, 0x1

    .line 95
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 94
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Hex comparison source is closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۢ()Z
    .locals 1

    .line 89
    iget-object v0, p0, Ll/᩹ۙܳ;->᩶:Ll/۫۫ܳ;

    invoke-virtual {v0}, Ll/۫۫ܳ;->ۢ()Z

    move-result v0

    return v0
.end method

.method public final ۤ()V
    .locals 1

    .line 110
    iget-object v0, p0, Ll/᩹ۙܳ;->ܿ:Ll/֨᩷ܳ;

    invoke-virtual {v0}, Ll/֨᩷ܳ;->ܳ()V

    .line 111
    iget-object v0, p0, Ll/᩹ۙܳ;->᩶:Ll/۫۫ܳ;

    invoke-virtual {v0}, Ll/۫۫ܳ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ll/۫ۚܳ;

    invoke-direct {v0}, Ll/۫ۚܳ;-><init>()V

    throw v0
.end method

.method public final ᩷()Ll/֨᩷ܳ;
    .locals 1

    .line 105
    iget-object v0, p0, Ll/᩹ۙܳ;->ܿ:Ll/֨᩷ܳ;

    return-object v0
.end method
