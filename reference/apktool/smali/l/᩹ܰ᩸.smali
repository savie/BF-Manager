.class public final Ll/᩹ܰ᩸;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ֡:Z

.field public final synthetic ֨:Ll/۟ܰ᩸;

.field public final ۟:J

.field public final ۡ:Ll/᩺ۜ᩸;

.field public final ۢ:Ll/ᩳ۬᩸;

.field public final ܰ:J

.field public ܿ:Z

.field public final ᩳ:Ll/֫᩶ᩴ;

.field public final ᩶:Ll/ۡܰ᩸;


# direct methods
.method public constructor <init>(Ll/۟ܰ᩸;Ll/ۡܰ᩸;Ll/֫᩶ᩴ;)V
    .locals 3

    .line 597
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ܰ᩸;->֨:Ll/۟ܰ᩸;

    .line 590
    iget-object v0, p1, Ll/۟ܰ᩸;->۠:Ll/᩺ۜ᩸;

    iput-object v0, p0, Ll/᩹ܰ᩸;->ۡ:Ll/᩺ۜ᩸;

    .line 591
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    iput-object v0, p0, Ll/᩹ܰ᩸;->ۢ:Ll/ᩳ۬᩸;

    .line 285
    iget-object p1, p1, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    const-string v0, "fileTime"

    const-wide/16 v1, -0x1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    .line 592
    iput-wide v0, p0, Ll/᩹ܰ᩸;->ܰ:J

    .line 593
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩹ܰ᩸;->۟:J

    .line 598
    iput-object p2, p0, Ll/᩹ܰ᩸;->᩶:Ll/ۡܰ᩸;

    .line 599
    iput-object p3, p0, Ll/᩹ܰ᩸;->ᩳ:Ll/֫᩶ᩴ;

    return-void
.end method

.method private ۙ(Ll/֫ۨᩴ;)V
    .locals 9

    .line 629
    iget-object v0, p0, Ll/᩹ܰ᩸;->᩶:Ll/ۡܰ᩸;

    iget-object v1, p0, Ll/᩹ܰ᩸;->֨:Ll/۟ܰ᩸;

    iget-object v2, v1, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    if-eqz p1, :cond_6

    :try_start_0
    iget-boolean v3, p0, Ll/᩹ܰ᩸;->ܿ:Z

    if-nez v3, :cond_6

    .line 603
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    iget-wide v5, p0, Ll/᩹ܰ᩸;->۟:J

    sub-long/2addr v3, v5

    const-wide/16 v5, 0x7d0

    const/4 v7, 0x1

    cmp-long v8, v3, v5

    if-ltz v8, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-nez v3, :cond_6

    .line 629
    invoke-static {v1}, Ll/۟ܰ᩸;->ܿ(Ll/۟ܰ᩸;)Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v3, v1, Ll/۟ܰ᩸;->۠:Ll/᩺ۜ᩸;

    iget-object v4, p0, Ll/᩹ܰ᩸;->ۡ:Ll/᩺ۜ᩸;

    if-ne v3, v4, :cond_6

    .line 630
    invoke-virtual {v4}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v3

    iget-object v4, p0, Ll/᩹ܰ᩸;->ۢ:Ll/ᩳ۬᩸;

    if-ne v3, v4, :cond_6

    .line 63
    iget-object v3, v0, Ll/ۡܰ᩸;->ۙ:Ll/᩷ۨᩴ;

    invoke-virtual {v3}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v3

    .line 630
    invoke-virtual {v1}, Ll/ۜܽ᩸;->ۤ()Ll/ۡܰ᩸;

    move-result-object v4

    .line 63
    iget-object v4, v4, Ll/ۡܰ᩸;->ۙ:Ll/᩷ۨᩴ;

    invoke-virtual {v4}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v4

    .line 630
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const-string v3, "fileTime"

    const-wide/16 v4, -0x1

    .line 285
    invoke-virtual {v2, v3, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 631
    iget-wide v5, p0, Ll/᩹ܰ᩸;->ܰ:J

    cmp-long v8, v5, v3

    if-nez v8, :cond_6

    :try_start_1
    invoke-static {v1}, Ll/۟ܰ᩸;->᩻(Ll/۟ܰ᩸;)Ll/۠ۖۧ;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-static {v1}, Ll/۟ܰ᩸;->᩻(Ll/۟ܰ᩸;)Ll/۠ۖۧ;

    move-result-object v3

    invoke-virtual {v3}, Ll/۠ۖۧ;->۫()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_2

    .line 632
    :cond_1
    invoke-virtual {p1}, Ll/֫ۨᩴ;->ᩴ()Ll/۫ۨᩴ;

    move-result-object v3

    sget-object v4, Ll/۫ۨᩴ;->֡:Ll/۫ۨᩴ;

    if-ne v3, v4, :cond_2

    .line 416
    sget-object p1, Ll/ܽܿ֫;->ܿ:Landroid/content/SharedPreferences;

    const-string v3, "check_file_exists"

    invoke-interface {p1, v3, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "checkFileExists"

    .line 298
    invoke-virtual {v2, p1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 633
    invoke-static {v1, v0}, Ll/۟ܰ᩸;->ۙ(Ll/۟ܰ᩸;Ll/ۡܰ᩸;)V

    goto :goto_1

    .line 412
    :cond_2
    sget-object v2, Ll/ܽܿ֫;->ܿ:Landroid/content/SharedPreferences;

    const-string v3, "check_file_time"

    invoke-interface {v2, v3, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 634
    invoke-virtual {p1}, Ll/֫ۨᩴ;->᩷()J

    move-result-wide v2

    const-wide/16 v7, 0x0

    cmp-long v4, v2, v7

    if-lez v4, :cond_4

    .line 635
    invoke-virtual {p1}, Ll/֫ۨᩴ;->᩷()J

    move-result-wide v2

    cmp-long p1, v5, v7

    if-gtz p1, :cond_3

    .line 638
    invoke-virtual {v1, v2, v3}, Ll/ۜܽ᩸;->ۙ(J)V

    goto :goto_1

    :cond_3
    cmp-long p1, v5, v2

    if-eqz p1, :cond_4

    .line 640
    invoke-static {v1, v0, v2, v3}, Ll/۟ܰ᩸;->ۙ(Ll/۟ܰ᩸;Ll/ۡܰ᩸;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 644
    :cond_4
    :goto_1
    invoke-static {v1}, Ll/۟ܰ᩸;->֫(Ll/۟ܰ᩸;)Ll/᩹ܰ᩸;

    move-result-object p1

    if-ne p1, p0, :cond_7

    .line 645
    invoke-static {v1}, Ll/۟ܰ᩸;->ۘ(Ll/۟ܰ᩸;)V

    .line 646
    iget-boolean p1, p0, Ll/᩹ܰ᩸;->֡:Z

    if-eqz p1, :cond_7

    invoke-virtual {v1}, Ll/۟ܰ᩸;->ܿ()V

    return-void

    :catchall_0
    move-exception p1

    .line 644
    invoke-static {v1}, Ll/۟ܰ᩸;->֫(Ll/۟ܰ᩸;)Ll/᩹ܰ᩸;

    move-result-object v0

    if-ne v0, p0, :cond_5

    .line 645
    invoke-static {v1}, Ll/۟ܰ᩸;->ۘ(Ll/۟ܰ᩸;)V

    .line 646
    iget-boolean v0, p0, Ll/᩹ܰ᩸;->֡:Z

    if-eqz v0, :cond_5

    invoke-virtual {v1}, Ll/۟ܰ᩸;->ܿ()V

    .line 648
    :cond_5
    throw p1

    .line 644
    :cond_6
    :goto_2
    invoke-static {v1}, Ll/۟ܰ᩸;->֫(Ll/۟ܰ᩸;)Ll/᩹ܰ᩸;

    move-result-object p1

    if-ne p1, p0, :cond_7

    .line 645
    invoke-static {v1}, Ll/۟ܰ᩸;->ۘ(Ll/۟ܰ᩸;)V

    .line 646
    iget-boolean p1, p0, Ll/᩹ܰ᩸;->֡:Z

    if-eqz p1, :cond_7

    invoke-virtual {v1}, Ll/۟ܰ᩸;->ܿ()V

    :cond_7
    return-void
.end method

.method public static synthetic ۙ(Ll/᩹ܰ᩸;Ll/֫ۨᩴ;)V
    .locals 0

    .line 623
    invoke-direct {p0, p1}, Ll/᩹ܰ᩸;->ۙ(Ll/֫ۨᩴ;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 618
    :try_start_0
    iget-object v0, p0, Ll/᩹ܰ᩸;->ᩳ:Ll/֫᩶ᩴ;

    invoke-virtual {v0}, Ll/֫ܿᩴ;->᩶()Ll/ۧۨᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۧۨᩴ;->ۚ()Ll/֫ۨᩴ;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 623
    new-instance v1, Ll/ܶܰ᩸;

    invoke-direct {v1, p0, v0}, Ll/ܶܰ᩸;-><init>(Ll/᩹ܰ᩸;Ll/֫ۨᩴ;)V

    invoke-static {v1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception v0

    new-instance v1, Ll/ܳۛ᩸;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/ܳۛ᩸;-><init>(ILjava/lang/Object;)V

    invoke-static {v1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    .line 624
    throw v0

    .line 623
    :catch_0
    new-instance v0, Ll/ܳۛ᩸;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/ܳۛ᩸;-><init>(ILjava/lang/Object;)V

    invoke-static {v0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ۙ()V
    .locals 1

    .line 609
    :try_start_0
    sget-object v0, Ll/ۙ᩻ܺ;->᩷:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 v0, 0x0

    .line 611
    invoke-direct {p0, v0}, Ll/᩹ܰ᩸;->ۙ(Ll/֫ۨᩴ;)V

    return-void
.end method
