.class public final Ll/ۡ᩻֫;
.super Ljava/lang/Object;
.source "66IQ"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ֡:Z

.field public ֨:Ll/ۡ֫֫;

.field public final ۖ:Ll/۬ۚ֫;

.field public final ۟:Ll/᩷ۨᩴ;

.field public final ۡ:Ll/᩷ۨᩴ;

.field public final ۢ:Landroid/os/Handler;

.field public final ܰ:Ll/ۚۜۚ;

.field public final ܿ:Ljava/util/concurrent/Executor;

.field public ᩳ:J

.field public ᩶:Z


# direct methods
.method public constructor <init>(Ll/᩷ۨᩴ;Ll/᩷ۨᩴ;Ll/۬ۚ֫;Ll/ۚۜۚ;)V
    .locals 3

    .line 32
    sget-object v0, Ll/ۙ᩻ܺ;->᩷:Ljava/util/concurrent/ExecutorService;

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Ll/ۡ᩻֫;->ۢ:Landroid/os/Handler;

    .line 36
    iput-object p1, p0, Ll/ۡ᩻֫;->۟:Ll/᩷ۨᩴ;

    .line 37
    iput-object p2, p0, Ll/ۡ᩻֫;->ۡ:Ll/᩷ۨᩴ;

    .line 38
    iput-object p3, p0, Ll/ۡ᩻֫;->ۖ:Ll/۬ۚ֫;

    .line 39
    iput-object p4, p0, Ll/ۡ᩻֫;->ܰ:Ll/ۚۜۚ;

    .line 40
    iput-object v0, p0, Ll/ۡ᩻֫;->ܿ:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic ۙ(Ll/ۡ᩻֫;JLl/֨᩻֫;Ljava/lang/Exception;Ll/۬ۚ֫;IJLl/ۡ֫֫;)V
    .locals 3

    .line 80
    iget-boolean v0, p0, Ll/ۡ᩻֫;->᩶:Z

    if-nez v0, :cond_4

    iget-wide v0, p0, Ll/ۡ᩻֫;->ᩳ:J

    cmp-long v2, p1, v0

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p4, :cond_3

    if-eqz p3, :cond_1

    .line 82
    invoke-virtual {p3}, Ll/֨᩻֫;->close()V

    :cond_1
    const/4 p1, 0x1

    .line 83
    iput-boolean p1, p0, Ll/ۡ᩻֫;->֡:Z

    .line 85
    invoke-virtual {p4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Ljava/lang/OutOfMemoryError;

    if-eqz p1, :cond_2

    invoke-virtual {p4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p4

    :cond_2
    invoke-static {p4}, Ll/᩷᩻֫;->ۙ(Ljava/lang/Throwable;)I

    move-result p1

    invoke-virtual {p5, p6, p1, p7, p8}, Ll/۬ۚ֫;->ۙ(IIJ)V

    goto :goto_0

    .line 87
    :cond_3
    iput-object p9, p0, Ll/ۡ᩻֫;->֨:Ll/ۡ֫֫;

    .line 88
    invoke-virtual {p5, p6, p7, p8, p3}, Ll/۬ۚ֫;->ۙ(IJLl/ۙۧ֫;)Z

    .line 90
    :goto_0
    iget-object p0, p0, Ll/ۡ᩻֫;->ܰ:Ll/ۚۜۚ;

    invoke-virtual {p0}, Ll/ۚۜۚ;->run()V

    return-void

    :cond_4
    :goto_1
    if-eqz p3, :cond_5

    .line 80
    invoke-virtual {p3}, Ll/֨᩻֫;->close()V

    :cond_5
    return-void
.end method

.method public static synthetic ۙ(Ll/ۡ᩻֫;JLl/۬ۚ֫;IJ)V
    .locals 19

    move-object/from16 v2, p0

    .line 56
    iget-object v0, v2, Ll/ۡ᩻֫;->ۡ:Ll/᩷ۨᩴ;

    iget-object v1, v2, Ll/ۡ᩻֫;->۟:Ll/᩷ۨᩴ;

    const/4 v3, 0x0

    .line 60
    :try_start_0
    new-instance v4, Ll/᩶ۤۤ;

    invoke-direct {v4}, Ll/᩶ۤۤ;-><init>()V

    if-eqz v0, :cond_0

    .line 61
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->֨()Z

    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_3

    if-eqz v5, :cond_0

    .line 62
    :try_start_1
    new-instance v5, Ll/᩶ۤۤ;

    invoke-direct {v5, v0}, Ll/᩶ۤۤ;-><init>(Ll/᩷ۨᩴ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_3

    move-object v4, v5

    .line 65
    :catch_0
    :cond_0
    :try_start_2
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ۧ᩷()Ljava/io/InputStream;

    move-result-object v5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_3

    .line 66
    :try_start_3
    new-instance v6, Ll/֨᩻֫;

    .line 67
    invoke-static {v5}, Ll/ܰ᩻ܺ;->ۙ(Ljava/io/InputStream;)Ll/ܰ᩻ܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܰ᩻ܺ;->۫()Ll/ۡ᩻ܺ;

    move-result-object v0

    const/4 v7, 0x0

    .line 66
    invoke-static {v0, v4, v7}, Ll/᩺ۤܺ;->ۙ(Ll/ۡ᩻ܺ;Ll/᩶ۤۤ;Z)Ll/᩺ۤܺ;

    move-result-object v0

    invoke-direct {v6, v0}, Ll/֨᩻֫;-><init>(Ll/᩺ۤܺ;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v5, :cond_1

    .line 68
    :try_start_4
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V

    .line 69
    :cond_1
    invoke-virtual {v6}, Ll/֨᩻֫;->getWidth()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {v6}, Ll/֨᩻֫;->getHeight()I

    move-result v0

    if-lez v0, :cond_2

    .line 71
    new-instance v0, Ll/ۡ֫֫;

    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6}, Ll/֨᩻֫;->getWidth()I

    move-result v9

    invoke-virtual {v6}, Ll/֨᩻֫;->getHeight()I

    move-result v10

    const-string v12, "application/vnd.android.axml"

    new-instance v4, Ll/ܳۧ֫;

    .line 72
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Ll/᩷ۨᩴ;->۠ۙ()J

    move-result-wide v15

    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ۡۙ()J

    move-result-wide v17

    move-object v13, v4

    invoke-direct/range {v13 .. v18}, Ll/ܳۧ֫;-><init>(Ljava/lang/String;JJ)V

    const/4 v11, 0x1

    move-object v7, v0

    move-object v13, v4

    invoke-direct/range {v7 .. v13}, Ll/ۡ֫֫;-><init>(Ljava/lang/String;IIILjava/lang/String;Ll/ܳۧ֫;)V

    move-object v11, v0

    move-object v5, v6

    move-object v6, v3

    goto :goto_4

    .line 70
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid vector dimensions"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_1

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v1, v0

    if-eqz v5, :cond_3

    .line 65
    :try_start_5
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v4, v0

    :try_start_6
    invoke-virtual {v1, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_0
    throw v1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_3

    :catch_3
    move-exception v0

    move-object v6, v3

    .line 74
    :goto_1
    new-instance v1, Ljava/io/IOException;

    const-string v4, "Vector preview ran out of memory"

    invoke-direct {v1, v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :catch_4
    move-exception v0

    move-object v6, v3

    :goto_2
    move-object v1, v0

    :goto_3
    move-object v11, v3

    move-object v5, v6

    move-object v6, v1

    .line 78
    :goto_4
    iget-object v0, v2, Ll/ۡ᩻֫;->ۢ:Landroid/os/Handler;

    new-instance v12, Ll/ۢ᩻֫;

    move-object v1, v12

    move-object/from16 v2, p0

    move-wide/from16 v3, p1

    move-object/from16 v7, p3

    move/from16 v8, p4

    move-wide/from16 v9, p5

    invoke-direct/range {v1 .. v11}, Ll/ۢ᩻֫;-><init>(Ll/ۡ᩻֫;JLl/֨᩻֫;Ljava/lang/Exception;Ll/۬ۚ֫;IJLl/ۡ֫֫;)V

    invoke-virtual {v0, v12}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 98
    iget-boolean v0, p0, Ll/ۡ᩻֫;->᩶:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 99
    iput-boolean v0, p0, Ll/ۡ᩻֫;->᩶:Z

    .line 100
    iget-wide v0, p0, Ll/ۡ᩻֫;->ᩳ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۡ᩻֫;->ᩳ:J

    .line 101
    iget-object v0, p0, Ll/ۡ᩻֫;->ۖ:Ll/۬ۚ֫;

    invoke-virtual {v0}, Ll/۬ۚ֫;->ᩴ()V

    const/4 v0, 0x0

    .line 102
    iput-object v0, p0, Ll/ۡ᩻֫;->֨:Ll/ۡ֫֫;

    return-void
.end method

.method public final getCount()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final getItemId(I)J
    .locals 2

    const-wide/16 v0, 0x1

    return-wide v0
.end method

.method public final synthetic onPageSelected(I)V
    .locals 0

    return-void
.end method

.method public final synthetic ۙ()V
    .locals 0

    return-void
.end method

.method public final ۙ(IJ)V
    .locals 2

    .line 95
    iget-wide p1, p0, Ll/ۡ᩻֫;->ᩳ:J

    const-wide/16 v0, 0x1

    add-long/2addr p1, v0

    iput-wide p1, p0, Ll/ۡ᩻֫;->ᩳ:J

    return-void
.end method

.method public final ۙ(Ll/۬ۚ֫;IJ)V
    .locals 9

    .line 52
    iget-wide v0, p0, Ll/ۡ᩻֫;->ᩳ:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Ll/ۡ᩻֫;->ᩳ:J

    const/4 v0, 0x0

    .line 53
    iput-object v0, p0, Ll/ۡ᩻֫;->֨:Ll/ۡ֫֫;

    const/4 v0, 0x0

    .line 54
    iput-boolean v0, p0, Ll/ۡ᩻֫;->֡:Z

    .line 55
    new-instance v8, Ll/ᩳ᩻֫;

    move-object v0, v8

    move-object v1, p0

    move-object v4, p1

    move v5, p2

    move-wide v6, p3

    invoke-direct/range {v0 .. v7}, Ll/ᩳ᩻֫;-><init>(Ll/ۡ᩻֫;JLl/۬ۚ֫;IJ)V

    iget-object v0, p0, Ll/ۡ᩻֫;->ܿ:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v8}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final synthetic ۙ(I)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۤ()Ll/ۡ֫֫;
    .locals 1

    .line 44
    iget-object v0, p0, Ll/ۡ᩻֫;->֨:Ll/ۡ֫֫;

    return-object v0
.end method

.method public final ۫()V
    .locals 2

    .line 46
    iget-boolean v0, p0, Ll/ۡ᩻֫;->᩶:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۡ᩻֫;->ۖ:Ll/۬ۚ֫;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/۬ۚ֫;->᩷(I)Z

    :cond_0
    return-void
.end method

.method public final ܳ()Z
    .locals 1

    .line 45
    iget-boolean v0, p0, Ll/ۡ᩻֫;->֡:Z

    return v0
.end method

.method public final ᩷()V
    .locals 2

    .line 43
    iget-object v0, p0, Ll/ۡ᩻֫;->ۖ:Ll/۬ۚ֫;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Ll/۬ۚ֫;->ۙ(Ll/۠ۚ֫;I)V

    return-void
.end method
