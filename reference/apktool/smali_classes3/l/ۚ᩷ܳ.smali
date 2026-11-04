.class public final Ll/ۚ᩷ܳ;
.super Ljava/lang/Object;
.source "X4ZQ"


# static fields
.field public static ۧ:Ll/᩷᩷ܳ;

.field public static ܺ:J

.field public static ܽ:J

.field public static ᩻:Ll/ۜܳܳ;


# instance fields
.field public ֫:I

.field public ۙ:I

.field public volatile ۚ:J

.field public final ۤ:Ll/ۨ᩷ܳ;

.field public ۫:I

.field public ܳ:Z

.field public ᩴ:I

.field public volatile ᩷:Ll/ᩳܳܳ;

.field public ᩸:Z


# direct methods
.method public constructor <init>(Ll/ۨ᩷ܳ;)V
    .locals 2

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 36
    iput-boolean v0, p0, Ll/ۚ᩷ܳ;->ܳ:Z

    .line 42
    iput-object p1, p0, Ll/ۚ᩷ܳ;->ۤ:Ll/ۨ᩷ܳ;

    const/16 v0, 0x8

    .line 43
    iput v0, p0, Ll/ۚ᩷ܳ;->ۙ:I

    .line 44
    new-instance v0, Ll/ᩳܳܳ;

    sget-object v1, Ll/ܳ᩷ܳ;->᩶:Ll/ܳ᩷ܳ;

    .line 45
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ll/ᩳܳܳ;-><init>(Ll/᩸۫ܳ;Ljava/io/File;)V

    iput-object v0, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    .line 46
    invoke-direct {p0}, Ll/ۚ᩷ܳ;->֡()V

    .line 47
    invoke-virtual {p0}, Ll/ۚ᩷ܳ;->ۨ()V

    return-void
.end method

.method private ֡()V
    .locals 5

    .line 1024
    iget-object v0, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    iget v1, p0, Ll/ۚ᩷ܳ;->֫:I

    iget v2, p0, Ll/ۚ᩷ܳ;->۫:I

    iget-boolean v3, p0, Ll/ۚ᩷ܳ;->ܳ:Z

    iget-boolean v4, p0, Ll/ۚ᩷ܳ;->᩸:Z

    invoke-virtual {v0, v1, v2, v3, v4}, Ll/ᩳܳܳ;->ۙ(IIZZ)V

    return-void
.end method

.method public static bridge synthetic ۘ()Ll/ۜܳܳ;
    .locals 1

    .line 0
    sget-object v0, Ll/ۚ᩷ܳ;->᩻:Ll/ۜܳܳ;

    return-object v0
.end method

.method public static ۙ(Ljava/io/File;)V
    .locals 5

    .line 601
    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const-string v0, "cacheDirectory"

    .line 608
    invoke-static {p0, v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "executor"

    .line 609
    invoke-static {v1, v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 614
    const-class v0, Ll/ۚ᩷ܳ;

    monitor-enter v0

    .line 615
    :try_start_0
    sget-object v2, Ll/ۚ᩷ܳ;->᩻:Ll/ۜܳܳ;

    if-eqz v2, :cond_4

    .line 616
    invoke-virtual {v2}, Ll/ۜܳܳ;->length()I

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    .line 619
    :cond_0
    sget-object v3, Ll/ۚ᩷ܳ;->ۧ:Ll/᩷᩷ܳ;

    if-eqz v3, :cond_1

    .line 620
    invoke-virtual {v3, v2}, Ll/᩷᩷ܳ;->ۙ(Ll/ۜܳܳ;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 621
    monitor-exit v0

    return-void

    .line 623
    :cond_1
    new-instance v4, Ll/ۤ᩷ܳ;

    invoke-direct {v4, v2, p0}, Ll/ۤ᩷ܳ;-><init>(Ll/ۜܳܳ;Ljava/io/File;)V

    if-nez v3, :cond_2

    .line 626
    new-instance v3, Ll/᩷᩷ܳ;

    invoke-direct {v3, v4}, Ll/᩷᩷ܳ;-><init>(Ll/ۤ᩷ܳ;)V

    .line 627
    sput-object v3, Ll/ۚ᩷ܳ;->ۧ:Ll/᩷᩷ܳ;

    const/4 p0, 0x1

    goto :goto_0

    .line 631
    :cond_2
    invoke-virtual {v3, v4}, Ll/᩷᩷ܳ;->ۙ(Ll/ۤ᩷ܳ;)V

    const/4 p0, 0x0

    .line 633
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_3

    .line 637
    :try_start_1
    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    .line 640
    :catch_0
    invoke-static {v3}, Ll/ۚ᩷ܳ;->ۙ(Ll/᩷᩷ܳ;)V

    :cond_3
    return-void

    .line 617
    :cond_4
    :goto_1
    :try_start_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 633
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static ۙ(Ljava/lang/AutoCloseable;)V
    .locals 0

    if-nez p0, :cond_0

    goto :goto_0

    .line 694
    :cond_0
    :try_start_0
    check-cast p0, Ljava/lang/AutoCloseable;

    invoke-static {p0}, Ll/᩵֡ۨ;->ۙ(Ljava/lang/AutoCloseable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :goto_0
    return-void
.end method

.method public static declared-synchronized ۙ(Ll/᩷᩷ܳ;)V
    .locals 2

    .line 2
    const-class v0, Ll/ۚ᩷ܳ;

    .line 3
    monitor-enter v0

    .line 682
    :try_start_0
    sget-object v1, Ll/ۚ᩷ܳ;->ۧ:Ll/᩷᩷ܳ;

    if-ne v1, p0, :cond_1

    invoke-static {p0}, Ll/᩷᩷ܳ;->ۙ(Ll/᩷᩷ܳ;)Ll/᩸᩷ܳ;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 685
    sput-object v1, Ll/ۚ᩷ܳ;->ۧ:Ll/᩷᩷ܳ;

    .line 686
    invoke-static {p0}, Ll/᩷᩷ܳ;->᩷(Ll/᩷᩷ܳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 687
    monitor-exit v0

    return-void

    .line 683
    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ۙ(Ll/᩸᩷ܳ;)V
    .locals 7

    .line 649
    invoke-static {p0}, Ll/᩸᩷ܳ;->ۙ(Ll/᩸᩷ܳ;)Ll/ۤ᩷ܳ;

    move-result-object v0

    const/4 v1, 0x0

    .line 654
    :try_start_0
    invoke-static {p0}, Ll/᩸᩷ܳ;->᩷(Ll/᩸᩷ܳ;)Ll/۠ܳܳ;

    move-result-object v2

    .line 189
    invoke-virtual {v2, v1}, Ll/۠ܳܳ;->ۙ(Ll/ܿۤܳ;)Ll/ۜܳܳ;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    .line 656
    :try_start_1
    invoke-static {v2}, Ll/ᩳܳܳ;->ۙ(Ll/ۜܳܳ;)Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    if-nez v3, :cond_0

    .line 672
    invoke-static {v2}, Ll/ۚ᩷ܳ;->ۙ(Ljava/lang/AutoCloseable;)V

    goto/16 :goto_6

    .line 659
    :cond_0
    :try_start_2
    invoke-static {v0}, Ll/ۤ᩷ܳ;->ۙ(Ll/ۤ᩷ܳ;)Ljava/io/File;

    move-result-object v3

    invoke-static {v2, v3}, Ll/ᩳܳܳ;->ۙ(Ll/ۜܳܳ;Ljava/io/File;)Ll/ۜܳܳ;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 661
    :try_start_3
    const-class v4, Ll/ۚ᩷ܳ;

    monitor-enter v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 662
    :try_start_4
    sget-object v5, Ll/ۚ᩷ܳ;->᩻:Ll/ۜܳܳ;

    invoke-static {v0}, Ll/ۤ᩷ܳ;->᩷(Ll/ۤ᩷ܳ;)Ll/ۜܳܳ;

    move-result-object v0

    if-ne v5, v0, :cond_1

    .line 663
    sget-object v0, Ll/ۚ᩷ܳ;->᩻:Ll/ۜܳܳ;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 664
    :try_start_5
    sput-object v3, Ll/ۚ᩷ܳ;->᩻:Ll/ۜܳܳ;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v3

    move-object v3, v6

    goto :goto_2

    :cond_1
    move-object v0, v1

    move-object v1, v3

    .line 667
    :goto_0
    :try_start_6
    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 672
    invoke-static {v2}, Ll/ۚ᩷ܳ;->ۙ(Ljava/lang/AutoCloseable;)V

    .line 673
    invoke-static {v1}, Ll/ۚ᩷ܳ;->ۙ(Ljava/lang/AutoCloseable;)V

    goto :goto_5

    :catchall_1
    move-exception v3

    move-object v6, v1

    move-object v1, v0

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object v6, v3

    move-object v3, v0

    :goto_1
    move-object v0, v6

    .line 667
    :goto_2
    :try_start_7
    monitor-exit v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :try_start_8
    throw v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    :catchall_3
    move-exception v3

    goto :goto_2

    :catchall_4
    move-object v0, v3

    :catchall_5
    move-object v6, v2

    move-object v2, v1

    move-object v1, v6

    goto :goto_4

    :catchall_6
    move-object v0, v1

    move-object v1, v2

    goto :goto_3

    :catchall_7
    move-object v0, v1

    :goto_3
    move-object v2, v0

    .line 672
    :goto_4
    invoke-static {v1}, Ll/ۚ᩷ܳ;->ۙ(Ljava/lang/AutoCloseable;)V

    .line 673
    invoke-static {v0}, Ll/ۚ᩷ܳ;->ۙ(Ljava/lang/AutoCloseable;)V

    move-object v0, v2

    .line 674
    :goto_5
    invoke-static {v0}, Ll/ۚ᩷ܳ;->ۙ(Ljava/lang/AutoCloseable;)V

    .line 675
    :goto_6
    invoke-static {p0}, Ll/᩸᩷ܳ;->᩷(Ll/᩸᩷ܳ;)Ll/۠ܳܳ;

    move-result-object p0

    invoke-static {p0}, Ll/ۚ᩷ܳ;->ۙ(Ljava/lang/AutoCloseable;)V

    return-void
.end method

.method private ۟()V
    .locals 5

    .line 1030
    iget-object v0, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    invoke-virtual {v0}, Ll/ᩳܳܳ;->ܶ()Ll/ܶܳܳ;

    move-result-object v0

    if-nez v0, :cond_0

    .line 1032
    invoke-direct {p0}, Ll/ۚ᩷ܳ;->ܿ()V

    return-void

    .line 1035
    :cond_0
    iget-wide v1, p0, Ll/ۚ᩷ܳ;->ۚ:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/ۚ᩷ܳ;->ۚ:J

    .line 1036
    invoke-virtual {v0}, Ll/ܶܳܳ;->ܳ()I

    move-result v1

    iput v1, p0, Ll/ۚ᩷ܳ;->֫:I

    .line 1037
    invoke-virtual {v0}, Ll/ܶܳܳ;->ۤ()I

    move-result v1

    iput v1, p0, Ll/ۚ᩷ܳ;->۫:I

    .line 1038
    invoke-virtual {v0}, Ll/ܶܳܳ;->᩷()Z

    move-result v1

    iput-boolean v1, p0, Ll/ۚ᩷ܳ;->ܳ:Z

    .line 1039
    invoke-virtual {v0}, Ll/ܶܳܳ;->ۙ()Z

    move-result v0

    iput-boolean v0, p0, Ll/ۚ᩷ܳ;->᩸:Z

    .line 1040
    iget-object v1, p0, Ll/ۚ᩷ܳ;->ۤ:Ll/ۨ᩷ܳ;

    iget v2, p0, Ll/ۚ᩷ܳ;->֫:I

    iget v3, p0, Ll/ۚ᩷ܳ;->۫:I

    invoke-virtual {v1, v2, v3, v0}, Ll/ۨ᩷ܳ;->ۙ(IIZ)V

    return-void
.end method

.method public static bridge synthetic ܰ()V
    .locals 1

    const/4 v0, 0x0

    .line 0
    sput-object v0, Ll/ۚ᩷ܳ;->ۧ:Ll/᩷᩷ܳ;

    return-void
.end method

.method private ܿ()V
    .locals 5

    .line 1003
    iget-wide v0, p0, Ll/ۚ᩷ܳ;->ۚ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۚ᩷ܳ;->ۚ:J

    .line 98
    iget-object v0, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    invoke-virtual {v0}, Ll/ᩳܳܳ;->length()I

    move-result v0

    .line 1005
    iget-boolean v1, p0, Ll/ۚ᩷ܳ;->᩸:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    .line 1006
    iget v1, p0, Ll/ۚ᩷ܳ;->֫:I

    if-gez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    add-int/lit8 v4, v0, -0x1

    .line 999
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 1006
    :goto_0
    iput v1, p0, Ll/ۚ᩷ܳ;->֫:I

    .line 1007
    iget v1, p0, Ll/ۚ᩷ܳ;->۫:I

    if-gez v1, :cond_1

    goto :goto_1

    :cond_1
    sub-int/2addr v0, v2

    .line 999
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 1007
    :goto_1
    iput v3, p0, Ll/ۚ᩷ܳ;->۫:I

    .line 1008
    iget v0, p0, Ll/ۚ᩷ܳ;->֫:I

    if-le v0, v3, :cond_5

    .line 1010
    iput v3, p0, Ll/ۚ᩷ܳ;->֫:I

    .line 1011
    iput v0, p0, Ll/ۚ᩷ܳ;->۫:I

    goto :goto_3

    .line 1014
    :cond_2
    iget v1, p0, Ll/ۚ᩷ܳ;->֫:I

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, p0, Ll/ۚ᩷ܳ;->۫:I

    iput v1, p0, Ll/ۚ᩷ܳ;->֫:I

    if-eq v1, v0, :cond_4

    .line 1015
    iget-boolean v0, p0, Ll/ۚ᩷ܳ;->ܳ:Z

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :cond_4
    :goto_2
    iput-boolean v2, p0, Ll/ۚ᩷ܳ;->ܳ:Z

    .line 1016
    iput-boolean v3, p0, Ll/ۚ᩷ܳ;->᩸:Z

    .line 1018
    :cond_5
    :goto_3
    invoke-direct {p0}, Ll/ۚ᩷ܳ;->֡()V

    .line 1019
    iget-object v0, p0, Ll/ۚ᩷ܳ;->ۤ:Ll/ۨ᩷ܳ;

    iget v1, p0, Ll/ۚ᩷ܳ;->֫:I

    iget v2, p0, Ll/ۚ᩷ܳ;->۫:I

    iget-boolean v3, p0, Ll/ۚ᩷ܳ;->᩸:Z

    invoke-virtual {v0, v1, v2, v3}, Ll/ۨ᩷ܳ;->ۙ(IIZ)V

    return-void
.end method

.method public static ᩶()Z
    .locals 2

    .line 592
    const-class v0, Ll/ۚ᩷ܳ;

    monitor-enter v0

    .line 593
    :try_start_0
    sget-object v1, Ll/ۚ᩷ܳ;->᩻:Ll/ۜܳܳ;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/ۜܳܳ;->length()I

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 594
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static bridge synthetic ᩺()Ll/᩷᩷ܳ;
    .locals 1

    .line 0
    sget-object v0, Ll/ۚ᩷ܳ;->ۧ:Ll/᩷᩷ܳ;

    return-object v0
.end method


# virtual methods
.method public final ֫()Z
    .locals 6

    .line 366
    iget-boolean v0, p0, Ll/ۚ᩷ܳ;->᩸:Z

    if-eqz v0, :cond_1

    .line 985
    iget v0, p0, Ll/ۚ᩷ܳ;->۫:I

    int-to-long v0, v0

    iget v2, p0, Ll/ۚ᩷ܳ;->֫:I

    int-to-long v2, v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    long-to-int v2, v0

    int-to-long v3, v2

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    const/high16 v0, 0x2000000

    if-le v2, v0, :cond_1

    const/4 v0, 0x1

    return v0

    .line 0
    :cond_0
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ۗ()J
    .locals 2

    .line 504
    iget-wide v0, p0, Ll/ۚ᩷ܳ;->ۚ:J

    return-wide v0
.end method

.method public final ۙ(I)B
    .locals 4

    .line 86
    iget-object v0, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    const/4 v1, 0x1

    new-array v2, v1, [B

    const/4 v3, 0x0

    .line 25
    invoke-virtual {v0, p1, v2, v3, v1}, Ll/ᩳܳܳ;->ۙ(I[BII)V

    .line 26
    aget-byte p1, v2, v3

    return p1
.end method

.method public final ۙ(II)I
    .locals 4

    if-ltz p1, :cond_0

    if-ltz p2, :cond_0

    .line 133
    iget v0, p0, Ll/ۚ᩷ܳ;->ۙ:I

    int-to-long v0, v0

    int-to-long v2, p1

    mul-long v0, v0, v2

    int-to-long p1, p2

    add-long/2addr v0, p1

    .line 98
    iget-object p1, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    invoke-virtual {p1}, Ll/ᩳܳܳ;->length()I

    move-result p1

    int-to-long p1, p1

    .line 134
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    long-to-int p2, p1

    return p2

    .line 131
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Negative position"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ(II[B[Z)I
    .locals 1

    .line 81
    iget-object v0, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ᩳܳܳ;->ۙ(II[B[Z)I

    move-result p1

    return p1
.end method

.method public final ۙ(Ll/۫᩷ܳ;Ll/ܿۤܳ;)J
    .locals 8

    .line 457
    invoke-static {p1}, Ll/۫᩷ܳ;->᩸(Ll/۫᩷ܳ;)Ll/ۚ᩷ܳ;

    move-result-object v0

    if-ne v0, p0, :cond_6

    .line 461
    :try_start_0
    invoke-virtual {p1, p2}, Ll/۫᩷ܳ;->ۙ(Ll/ܿۤܳ;)V

    .line 462
    invoke-static {p1}, Ll/۫᩷ܳ;->᩷(Ll/۫᩷ܳ;)Ll/ᩳܳܳ;

    move-result-object v0

    invoke-static {p1}, Ll/۫᩷ܳ;->۫(Ll/۫᩷ܳ;)Ll/ۙ۫ܳ;

    move-result-object v1

    .line 463
    invoke-virtual {v0, v1}, Ll/ᩳܳܳ;->ۙ(Ll/ۙ۫ܳ;)Ll/֡ܳܳ;

    move-result-object v0
    :try_end_0
    .catch Ll/۫ۚܳ; {:try_start_0 .. :try_end_0} :catch_0

    .line 464
    :try_start_1
    invoke-static {p1}, Ll/۫᩷ܳ;->ۚ(Ll/۫᩷ܳ;)I

    move-result v3

    invoke-static {p1}, Ll/۫᩷ܳ;->ۤ(Ll/۫᩷ܳ;)I

    move-result v4

    const/4 v1, 0x0

    new-array v5, v1, [B

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, v0

    .line 4067
    invoke-virtual/range {v2 .. v7}, Ll/֡ܳܳ;->ۙ(II[BILl/۟֡֫;)V

    .line 465
    invoke-static {p1}, Ll/۫᩷ܳ;->ۚ(Ll/۫᩷ܳ;)I

    move-result v1

    invoke-static {p1}, Ll/۫᩷ܳ;->ᩴ(Ll/۫᩷ܳ;)Ll/ۜܳܳ;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p2}, Ll/֡ܳܳ;->ۙ(ILl/ۜܳܳ;Ll/ܿۤܳ;)V

    .line 466
    invoke-static {p1}, Ll/۫᩷ܳ;->ۚ(Ll/۫᩷ܳ;)I

    move-result v1

    int-to-long v1, v1

    invoke-static {p1}, Ll/۫᩷ܳ;->ܳ(Ll/۫᩷ܳ;)I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    long-to-int v3, v1

    int-to-long v4, v3

    cmp-long v6, v1, v4

    if-nez v6, :cond_3

    .line 467
    invoke-static {p1}, Ll/۫᩷ܳ;->ۚ(Ll/۫᩷ܳ;)I

    move-result v1

    int-to-long v1, v1

    invoke-static {p1}, Ll/۫᩷ܳ;->ܳ(Ll/۫᩷ܳ;)I

    move-result v4

    int-to-long v4, v4

    add-long/2addr v1, v4

    long-to-int v4, v1

    int-to-long v5, v4

    cmp-long v7, v1, v5

    if-nez v7, :cond_2

    .line 466
    invoke-virtual {v0, v3, v4}, Ll/֡ܳܳ;->᩷(II)V

    .line 471
    iget-object v1, p2, Ll/ܿۤܳ;->ܰ:Ll/۟ۤܳ;

    invoke-static {v1}, Ll/۟ۤܳ;->ۙ(Ll/۟ۤܳ;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 474
    invoke-virtual {v0, p2}, Ll/֡ܳܳ;->ۙ(Ll/۟֡֫;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 477
    invoke-static {p1}, Ll/۫᩷ܳ;->᩷(Ll/۫᩷ܳ;)Ll/ᩳܳܳ;

    move-result-object p2

    invoke-virtual {p2}, Ll/ᩳܳܳ;->ܽ()J

    move-result-wide v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 478
    :try_start_2
    invoke-virtual {v0}, Ll/֡ܳܳ;->close()V
    :try_end_2
    .catch Ll/۫ۚܳ; {:try_start_2 .. :try_end_2} :catch_0

    return-wide v1

    .line 475
    :cond_0
    :try_start_3
    new-instance p2, Ll/ۡܳܳ;

    invoke-direct {p2}, Ll/ۡܳܳ;-><init>()V

    throw p2

    .line 472
    :cond_1
    new-instance p2, Ll/ۡܳܳ;

    invoke-direct {p2}, Ll/ۡܳܳ;-><init>()V

    throw p2

    .line 0
    :cond_2
    new-instance p2, Ljava/lang/ArithmeticException;

    invoke-direct {p2}, Ljava/lang/ArithmeticException;-><init>()V

    throw p2

    :cond_3
    new-instance p2, Ljava/lang/ArithmeticException;

    invoke-direct {p2}, Ljava/lang/ArithmeticException;-><init>()V

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p2

    .line 462
    :try_start_4
    invoke-virtual {v0}, Ll/֡ܳܳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_5
    invoke-virtual {p2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p2
    :try_end_5
    .catch Ll/۫ۚܳ; {:try_start_5 .. :try_end_5} :catch_0

    :catch_0
    move-exception p2

    .line 480
    invoke-static {p1}, Ll/۫᩷ܳ;->ۙ(Ll/۫᩷ܳ;)Ll/ۜܳܳ;

    move-result-object p1

    .line 530
    :try_start_6
    iget-object v0, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    invoke-virtual {v0}, Ll/ᩳܳܳ;->᩶()V
    :try_end_6
    .catch Ll/۫ۚܳ; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    .line 538
    invoke-virtual {p2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 542
    :goto_1
    const-class v0, Ll/ۚ᩷ܳ;

    monitor-enter v0

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    .line 543
    :try_start_7
    sget-object v2, Ll/ۚ᩷ܳ;->᩻:Ll/ۜܳܳ;

    if-ne v2, p1, :cond_4

    .line 545
    sput-object v1, Ll/ۚ᩷ܳ;->᩻:Ll/ۜܳܳ;

    move-object v1, v2

    .line 547
    :cond_4
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    if-eqz v1, :cond_5

    .line 550
    :try_start_8
    invoke-virtual {v1}, Ll/ۜܳܳ;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    goto :goto_2

    :catch_2
    move-exception p1

    .line 552
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 555
    :cond_5
    :goto_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Hex clipboard source changed"

    invoke-direct {p1, v0, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :catchall_2
    move-exception p1

    .line 547
    :try_start_9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    throw p1

    :catch_3
    move-exception p1

    .line 535
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_3

    :catch_4
    move-exception p1

    .line 532
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 480
    :goto_3
    throw p1

    .line 458
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Paste request belongs to another HexData"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ(Ll/ᩳܳܳ;)Ll/ᩳܳܳ;
    .locals 4

    const-string v0, "document"

    .line 54
    invoke-static {p1, v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 55
    iget-wide v0, p0, Ll/ۚ᩷ܳ;->ۚ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۚ᩷ܳ;->ۚ:J

    .line 56
    iget-object v0, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    .line 57
    iput-object p1, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    const/4 v1, 0x0

    .line 58
    iput v1, p0, Ll/ۚ᩷ܳ;->۫:I

    iput v1, p0, Ll/ۚ᩷ܳ;->֫:I

    const/4 v2, 0x1

    .line 59
    iput-boolean v2, p0, Ll/ۚ᩷ܳ;->ܳ:Z

    .line 60
    iput-boolean v1, p0, Ll/ۚ᩷ܳ;->᩸:Z

    .line 61
    invoke-virtual {p1}, Ll/ᩳܳܳ;->length()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iput p1, p0, Ll/ۚ᩷ܳ;->ᩴ:I

    .line 62
    invoke-direct {p0}, Ll/ۚ᩷ܳ;->֡()V

    .line 63
    iget-object p1, p0, Ll/ۚ᩷ܳ;->ۤ:Ll/ۨ᩷ܳ;

    iget v2, p0, Ll/ۚ᩷ܳ;->֫:I

    iget v3, p0, Ll/ۚ᩷ܳ;->۫:I

    invoke-virtual {p1, v2, v3, v1}, Ll/ۨ᩷ܳ;->ۙ(IIZ)V

    .line 64
    iget-object p1, p0, Ll/ۚ᩷ܳ;->ۤ:Ll/ۨ᩷ܳ;

    invoke-virtual {p1}, Ll/ۨ᩷ܳ;->ۙ()V

    .line 65
    iget-object p1, p0, Ll/ۚ᩷ܳ;->ۤ:Ll/ۨ᩷ܳ;

    iget-object p1, p1, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    if-eqz p1, :cond_0

    .line 66
    invoke-virtual {p1}, Ll/ۙ᩷ܳ;->ۙ()V

    :cond_0
    return-object v0
.end method

.method public final ۙ(IZ)V
    .locals 4

    .line 146
    iget-wide v0, p0, Ll/ۚ᩷ܳ;->ۚ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۚ᩷ܳ;->ۚ:J

    const/4 v0, 0x0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 98
    :cond_0
    iget-object v1, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    invoke-virtual {v1}, Ll/ᩳܳܳ;->length()I

    move-result v1

    .line 992
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 148
    :goto_0
    iput p1, p0, Ll/ۚ᩷ܳ;->۫:I

    iput p1, p0, Ll/ۚ᩷ܳ;->֫:I

    .line 98
    iget-object v1, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    invoke-virtual {v1}, Ll/ᩳܳܳ;->length()I

    move-result v1

    if-eq p1, v1, :cond_2

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 p2, 0x1

    .line 149
    :goto_2
    iput-boolean p2, p0, Ll/ۚ᩷ܳ;->ܳ:Z

    .line 150
    iput-boolean v0, p0, Ll/ۚ᩷ܳ;->᩸:Z

    .line 151
    invoke-direct {p0}, Ll/ۚ᩷ܳ;->֡()V

    .line 152
    iget-object p2, p0, Ll/ۚ᩷ܳ;->ۤ:Ll/ۨ᩷ܳ;

    invoke-virtual {p2, p1, p1, v0}, Ll/ۨ᩷ܳ;->ۙ(IIZ)V

    return-void
.end method

.method public final ۙ([B)V
    .locals 7

    .line 239
    iget v0, p0, Ll/ۚ᩷ܳ;->֫:I

    .line 240
    iget-boolean v1, p0, Ll/ۚ᩷ܳ;->᩸:Z

    if-eqz v1, :cond_1

    iget v1, p0, Ll/ۚ᩷ܳ;->۫:I

    int-to-long v1, v1

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    long-to-int v3, v1

    int-to-long v4, v3

    cmp-long v6, v1, v4

    if-nez v6, :cond_0

    goto :goto_0

    .line 0
    :cond_0
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    :cond_1
    move v3, v0

    :goto_0
    if-nez p1, :cond_2

    const/4 p1, 0x0

    new-array p1, p1, [B

    .line 249
    :cond_2
    iget-object v1, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    invoke-virtual {v1, v0, v3, p1}, Ll/ᩳܳܳ;->ᩴ(II[B)V

    int-to-long v0, v0

    .line 250
    array-length p1, p1

    int-to-long v2, p1

    add-long/2addr v0, v2

    long-to-int p1, v0

    int-to-long v2, p1

    cmp-long v4, v0, v2

    if-nez v4, :cond_3

    const/4 v0, 0x1

    .line 156
    invoke-virtual {p0, p1, v0}, Ll/ۚ᩷ܳ;->ۙ(IZ)V

    .line 252
    invoke-virtual {p0}, Ll/ۚ᩷ܳ;->ۨ()V

    .line 253
    iget-object p1, p0, Ll/ۚ᩷ܳ;->ۤ:Ll/ۨ᩷ܳ;

    invoke-virtual {p1}, Ll/ۨ᩷ܳ;->ۙ()V

    return-void

    .line 0
    :cond_3
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method public final ۙ()Z
    .locals 1

    .line 294
    iget-object v0, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    invoke-virtual {v0}, Ll/ᩳܳܳ;->ۤ()Z

    move-result v0

    return v0
.end method

.method public final ۙ(Ll/۫᩷ܳ;)Z
    .locals 1

    if-eqz p1, :cond_1

    .line 523
    iget-object v0, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    invoke-static {p1}, Ll/۫᩷ܳ;->᩷(Ll/۫᩷ܳ;)Ll/ᩳܳܳ;

    move-result-object p1

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ۙ(Ll/۫᩷ܳ;J)Z
    .locals 3

    .line 486
    iget-object v0, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    invoke-static {p1}, Ll/۫᩷ܳ;->᩷(Ll/۫᩷ܳ;)Ll/ᩳܳܳ;

    move-result-object v1

    if-ne v0, v1, :cond_2

    invoke-static {p1}, Ll/۫᩷ܳ;->᩷(Ll/۫᩷ܳ;)Ll/ᩳܳܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳܳܳ;->ܽ()J

    move-result-wide v0

    cmp-long v2, v0, p2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 489
    :cond_0
    invoke-static {p1}, Ll/۫᩷ܳ;->ۚ(Ll/۫᩷ܳ;)I

    move-result p2

    int-to-long p2, p2

    invoke-static {p1}, Ll/۫᩷ܳ;->ܳ(Ll/۫᩷ܳ;)I

    move-result p1

    int-to-long v0, p1

    add-long/2addr p2, v0

    long-to-int p1, p2

    int-to-long v0, p1

    cmp-long v2, p2, v0

    if-nez v2, :cond_1

    const/4 p2, 0x1

    .line 156
    invoke-virtual {p0, p1, p2}, Ll/ۚ᩷ܳ;->ۙ(IZ)V

    .line 490
    invoke-virtual {p0}, Ll/ۚ᩷ܳ;->ۨ()V

    .line 491
    iget-object p1, p0, Ll/ۚ᩷ܳ;->ۤ:Ll/ۨ᩷ܳ;

    invoke-virtual {p1}, Ll/ۨ᩷ܳ;->ۙ()V

    return p2

    .line 0
    :cond_1
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۙ(Ll/ᩳܳܳ;JJ)Z
    .locals 2

    .line 498
    iget-object v0, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    if-ne v0, p1, :cond_0

    invoke-virtual {p1}, Ll/ᩳܳܳ;->ܽ()J

    move-result-wide v0

    cmp-long p1, v0, p2

    if-nez p1, :cond_0

    iget-wide p1, p0, Ll/ۚ᩷ܳ;->ۚ:J

    cmp-long p3, p1, p4

    if-nez p3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۙ(Ll/ᩳܳܳ;JJII)Z
    .locals 2

    .line 511
    iget-object v0, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    if-ne v0, p1, :cond_2

    invoke-virtual {p1}, Ll/ᩳܳܳ;->ܽ()J

    move-result-wide v0

    cmp-long p1, v0, p2

    if-nez p1, :cond_2

    iget-wide p1, p0, Ll/ۚ᩷ܳ;->ۚ:J

    cmp-long p3, p1, p4

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    int-to-long p1, p6

    int-to-long p3, p7

    add-long/2addr p1, p3

    long-to-int p3, p1

    int-to-long p4, p3

    cmp-long p6, p1, p4

    if-nez p6, :cond_1

    const/4 p1, 0x1

    .line 156
    invoke-virtual {p0, p3, p1}, Ll/ۚ᩷ܳ;->ۙ(IZ)V

    .line 516
    invoke-virtual {p0}, Ll/ۚ᩷ܳ;->ۨ()V

    .line 517
    iget-object p2, p0, Ll/ۚ᩷ܳ;->ۤ:Ll/ۨ᩷ܳ;

    invoke-virtual {p2}, Ll/ۨ᩷ܳ;->ۙ()V

    return p1

    .line 0
    :cond_1
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۙ(Ll/ᩴ᩷ܳ;)Z
    .locals 5

    if-eqz p1, :cond_0

    .line 417
    invoke-static {p1}, Ll/ᩴ᩷ܳ;->᩸(Ll/ᩴ᩷ܳ;)Ll/ۚ᩷ܳ;

    move-result-object v0

    if-ne v0, p0, :cond_0

    iget-object v0, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    invoke-static {p1}, Ll/ᩴ᩷ܳ;->ۙ(Ll/ᩴ᩷ܳ;)Ll/ᩳܳܳ;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Ll/ᩴ᩷ܳ;->ۙ(Ll/ᩴ᩷ܳ;)Ll/ᩳܳܳ;

    move-result-object v0

    .line 420
    invoke-virtual {v0}, Ll/ᩳܳܳ;->ܽ()J

    move-result-wide v0

    invoke-static {p1}, Ll/ᩴ᩷ܳ;->ۤ(Ll/ᩴ᩷ܳ;)J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-boolean v0, p0, Ll/ۚ᩷ܳ;->᩸:Z

    if-eqz v0, :cond_0

    iget v0, p0, Ll/ۚ᩷ܳ;->֫:I

    invoke-static {p1}, Ll/ᩴ᩷ܳ;->ܳ(Ll/ᩴ᩷ܳ;)I

    move-result v1

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ۚ᩷ܳ;->۫:I

    invoke-static {p1}, Ll/ᩴ᩷ܳ;->᩷(Ll/ᩴ᩷ܳ;)I

    move-result p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۙ(Ll/ᩴ᩷ܳ;Ll/ۜܳܳ;)Z
    .locals 7

    .line 387
    invoke-static {p1}, Ll/ᩴ᩷ܳ;->᩸(Ll/ᩴ᩷ܳ;)Ll/ۚ᩷ܳ;

    move-result-object v0

    const/4 v2, 0x0

    if-eq v0, p0, :cond_0

    return v2

    .line 391
    :cond_0
    invoke-static {p1}, Ll/ᩴ᩷ܳ;->ۙ(Ll/ᩴ᩷ܳ;)Ll/ᩳܳܳ;

    move-result-object v0

    monitor-enter v0

    .line 393
    :try_start_0
    invoke-virtual {p0, p1}, Ll/ۚ᩷ܳ;->ۙ(Ll/ᩴ᩷ܳ;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 394
    monitor-exit v0

    return v2

    .line 396
    :cond_1
    const-class v1, Ll/ۚ᩷ܳ;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 397
    :try_start_1
    invoke-static {p1}, Ll/ᩴ᩷ܳ;->ᩴ(Ll/ᩴ᩷ܳ;)J

    move-result-wide v3

    sget-wide v5, Ll/ۚ᩷ܳ;->ܽ:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_2

    .line 398
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    return v2

    .line 400
    :cond_2
    :try_start_3
    sget-object p1, Ll/ۚ᩷ܳ;->᩻:Ll/ۜܳܳ;

    .line 401
    sput-object p2, Ll/ۚ᩷ܳ;->᩻:Ll/ۜܳܳ;

    .line 402
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 403
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-eqz p1, :cond_3

    .line 406
    :try_start_5
    invoke-virtual {p1}, Ll/ۜܳܳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_0
    :cond_3
    const/4 p1, 0x1

    return p1

    :catchall_1
    move-exception p1

    .line 402
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :try_start_7
    throw p1

    :catchall_2
    move-exception p1

    .line 403
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    throw p1
.end method

.method public final ۚ()I
    .locals 1

    .line 142
    iget v0, p0, Ll/ۚ᩷ܳ;->֫:I

    return v0
.end method

.method public final ۛ()V
    .locals 6

    .line 258
    iget-boolean v0, p0, Ll/ۚ᩷ܳ;->᩸:Z

    if-eqz v0, :cond_1

    .line 261
    iget v0, p0, Ll/ۚ᩷ܳ;->۫:I

    int-to-long v0, v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    long-to-int v2, v0

    int-to-long v3, v2

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    .line 262
    iget-object v0, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    iget v1, p0, Ll/ۚ᩷ܳ;->֫:I

    .line 1049
    invoke-virtual {v0}, Ll/ᩳܳܳ;->᩷()Ll/֡ܳܳ;

    move-result-object v0

    .line 1050
    :try_start_0
    invoke-virtual {v0, v1, v2}, Ll/֡ܳܳ;->ۙ(II)V

    const/4 v1, 0x0

    .line 4438
    invoke-virtual {v0, v1}, Ll/֡ܳܳ;->ۙ(Ll/۟֡֫;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1052
    invoke-virtual {v0}, Ll/֡ܳܳ;->close()V

    const/4 v0, 0x1

    .line 156
    invoke-virtual {p0, v2, v0}, Ll/ۚ᩷ܳ;->ۙ(IZ)V

    .line 264
    iget-object v0, p0, Ll/ۚ᩷ܳ;->ۤ:Ll/ۨ᩷ܳ;

    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->ۙ()V

    return-void

    :catchall_0
    move-exception v1

    .line 1049
    :try_start_1
    invoke-virtual {v0}, Ll/֡ܳܳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1

    .line 0
    :cond_0
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    .line 259
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No range is selected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۤ()I
    .locals 1

    .line 113
    iget v0, p0, Ll/ۚ᩷ܳ;->ۙ:I

    return v0
.end method

.method public final ۤ(I)V
    .locals 1

    if-lez p1, :cond_0

    .line 109
    iput p1, p0, Ll/ۚ᩷ܳ;->ۙ:I

    return-void

    .line 107
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "column must be positive"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()Z
    .locals 1

    .line 191
    iget-boolean v0, p0, Ll/ۚ᩷ܳ;->᩸:Z

    return v0
.end method

.method public final ۨ()V
    .locals 2

    .line 98
    iget-object v0, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    invoke-virtual {v0}, Ll/ᩳܳܳ;->length()I

    move-result v0

    .line 975
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    .line 976
    iget v1, p0, Ll/ۚ᩷ܳ;->ᩴ:I

    if-eq v0, v1, :cond_0

    .line 977
    iput v0, p0, Ll/ۚ᩷ܳ;->ᩴ:I

    .line 978
    iget-object v0, p0, Ll/ۚ᩷ܳ;->ۤ:Ll/ۨ᩷ܳ;

    iget-object v0, v0, Ll/ۨ᩷ܳ;->֨:Ll/ۙ᩷ܳ;

    if-eqz v0, :cond_0

    .line 979
    invoke-virtual {v0}, Ll/ۙ᩷ܳ;->ۙ()V

    :cond_0
    return-void
.end method

.method public final ۫()I
    .locals 1

    .line 138
    iget v0, p0, Ll/ۚ᩷ܳ;->۫:I

    return v0
.end method

.method public final ܳ()I
    .locals 1

    .line 102
    iget v0, p0, Ll/ۚ᩷ܳ;->ᩴ:I

    return v0
.end method

.method public final ܶ()Ll/۫᩷ܳ;
    .locals 14

    .line 432
    const-class v0, Ll/ۚ᩷ܳ;

    monitor-enter v0

    .line 433
    :try_start_0
    sget-object v3, Ll/ۚ᩷ܳ;->᩻:Ll/ۜܳܳ;

    const/4 v1, 0x0

    if-eqz v3, :cond_4

    .line 434
    invoke-virtual {v3}, Ll/ۜܳܳ;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_4

    .line 437
    :cond_0
    invoke-virtual {v3}, Ll/ۜܳܳ;->ۤ()Ll/۠ܳܳ;

    move-result-object v10

    .line 438
    invoke-virtual {v3}, Ll/ۜܳܳ;->length()I

    move-result v9

    .line 439
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 443
    :try_start_1
    iget-object v5, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    .line 444
    invoke-virtual {v5}, Ll/ᩳܳܳ;->ܿ()Ll/۟ܳܳ;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_2

    .line 445
    :try_start_2
    iget v7, p0, Ll/ۚ᩷ܳ;->֫:I

    .line 446
    iget-boolean v1, p0, Ll/ۚ᩷ܳ;->᩸:Z

    if-eqz v1, :cond_2

    iget v1, p0, Ll/ۚ᩷ܳ;->۫:I

    int-to-long v1, v1

    const-wide/16 v11, 0x1

    add-long/2addr v1, v11

    long-to-int v4, v1

    int-to-long v11, v4

    cmp-long v6, v1, v11

    if-nez v6, :cond_1

    move v8, v4

    goto :goto_0

    .line 0
    :cond_1
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    :cond_2
    move v8, v7

    .line 447
    :goto_0
    new-instance v11, Ll/۫᩷ܳ;

    move-object v1, v11

    move-object v2, p0

    move-object v4, v10

    move-object v6, v0

    invoke-direct/range {v1 .. v9}, Ll/۫᩷ܳ;-><init>(Ll/ۚ᩷ܳ;Ll/ۜܳܳ;Ll/۠ܳܳ;Ll/ᩳܳܳ;Ll/۟ܳܳ;III)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    return-object v11

    :catch_0
    move-exception v1

    goto :goto_1

    :catch_1
    move-exception v1

    :goto_1
    move-object v13, v1

    move-object v1, v0

    move-object v0, v13

    goto :goto_2

    :catch_2
    move-exception v0

    goto :goto_2

    :catch_3
    move-exception v0

    :goto_2
    if-eqz v1, :cond_3

    .line 582
    invoke-virtual {v1}, Ll/۟ܳܳ;->close()V

    .line 585
    :cond_3
    :try_start_3
    invoke-virtual {v10}, Ll/۠ܳܳ;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4

    goto :goto_3

    :catch_4
    move-exception v1

    .line 587
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 451
    :goto_3
    throw v0

    .line 435
    :cond_4
    :goto_4
    :try_start_4
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 439
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v1
.end method

.method public final ܺ()V
    .locals 1

    .line 968
    invoke-direct {p0}, Ll/ۚ᩷ܳ;->ܿ()V

    .line 969
    invoke-virtual {p0}, Ll/ۚ᩷ܳ;->ۨ()V

    .line 970
    iget-object v0, p0, Ll/ۚ᩷ܳ;->ۤ:Ll/ۨ᩷ܳ;

    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->ۙ()V

    return-void
.end method

.method public final ܽ()Ll/ᩴ᩷ܳ;
    .locals 15

    .line 334
    iget-boolean v0, p0, Ll/ۚ᩷ܳ;->᩸:Z

    if-eqz v0, :cond_5

    .line 985
    iget v0, p0, Ll/ۚ᩷ܳ;->۫:I

    int-to-long v0, v0

    iget v2, p0, Ll/ۚ᩷ܳ;->֫:I

    int-to-long v2, v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    long-to-int v4, v0

    int-to-long v5, v4

    cmp-long v7, v0, v5

    if-nez v7, :cond_4

    const/high16 v0, 0x2000000

    if-gt v4, v0, :cond_3

    .line 341
    iget-object v7, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    .line 342
    iget v10, p0, Ll/ۚ᩷ܳ;->֫:I

    .line 343
    iget v11, p0, Ll/ۚ᩷ܳ;->۫:I

    .line 344
    invoke-virtual {v7}, Ll/ᩳܳܳ;->ܿ()Ll/۟ܳܳ;

    move-result-object v1

    .line 348
    :try_start_0
    const-class v0, Ll/ۚ᩷ܳ;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 349
    :try_start_1
    sget-wide v4, Ll/ۚ᩷ܳ;->ܺ:J

    add-long v12, v4, v2

    xor-long/2addr v2, v4

    const/4 v6, 0x0

    const-wide/16 v8, 0x0

    cmp-long v14, v2, v8

    if-gez v14, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    xor-long v3, v4, v12

    cmp-long v5, v3, v8

    if-ltz v5, :cond_1

    const/4 v6, 0x1

    :cond_1
    or-int/2addr v2, v6

    if-eqz v2, :cond_2

    sput-wide v12, Ll/ۚ᩷ܳ;->ܺ:J

    .line 351
    sput-wide v12, Ll/ۚ᩷ܳ;->ܽ:J

    .line 352
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 353
    :try_start_2
    new-instance v0, Ll/ᩴ᩷ܳ;

    invoke-virtual {v1}, Ll/۟ܳܳ;->ۙ()J

    move-result-wide v8

    move-object v5, v0

    move-object v6, p0

    move-object v14, v1

    invoke-direct/range {v5 .. v14}, Ll/ᩴ᩷ܳ;-><init>(Ll/ۚ᩷ܳ;Ll/ᩳܳܳ;JIIJLl/۟ܳܳ;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-object v0

    .line 0
    :cond_2
    :try_start_3
    new-instance v2, Ljava/lang/ArithmeticException;

    invoke-direct {v2}, Ljava/lang/ArithmeticException;-><init>()V

    throw v2

    :catchall_0
    move-exception v2

    .line 352
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v0

    .line 359
    invoke-virtual {v1}, Ll/۟ܳܳ;->close()V

    .line 361
    throw v0

    .line 339
    :cond_3
    new-instance v0, Ll/۫ᩴܳ;

    invoke-direct {v0}, Ll/۫ᩴܳ;-><init>()V

    throw v0

    .line 0
    :cond_4
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    .line 335
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No range is selected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩴ()Ll/ᩳܳܳ;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    return-object v0
.end method

.method public final ᩵()V
    .locals 1

    .line 269
    invoke-direct {p0}, Ll/ۚ᩷ܳ;->֡()V

    .line 270
    iget-object v0, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    invoke-virtual {v0}, Ll/ᩳܳܳ;->ܰ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 273
    :cond_0
    invoke-direct {p0}, Ll/ۚ᩷ܳ;->۟()V

    .line 274
    invoke-virtual {p0}, Ll/ۚ᩷ܳ;->ۨ()V

    .line 275
    iget-object v0, p0, Ll/ۚ᩷ܳ;->ۤ:Ll/ۨ᩷ܳ;

    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->ۙ()V

    return-void
.end method

.method public final ᩷(I)V
    .locals 13

    .line 196
    iget-boolean v0, p0, Ll/ۚ᩷ܳ;->᩸:Z

    if-nez v0, :cond_b

    if-ltz p1, :cond_a

    const/16 v0, 0xf

    if-gt p1, v0, :cond_a

    .line 203
    iget v0, p0, Ll/ۚ᩷ܳ;->֫:I

    .line 98
    iget-object v1, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    invoke-virtual {v1}, Ll/ᩳܳܳ;->length()I

    move-result v1

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    const/4 v9, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    const/4 v9, 0x0

    :goto_0
    if-eqz v9, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    .line 206
    :cond_1
    iget-object v1, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    new-array v2, v7, [B

    .line 25
    invoke-virtual {v1, v0, v2, v8, v7}, Ll/ᩳܳܳ;->ۙ(I[BII)V

    .line 26
    aget-byte v1, v2, v8

    and-int/lit16 v1, v1, 0xff

    .line 207
    :goto_1
    iget-boolean v2, p0, Ll/ۚ᩷ܳ;->ܳ:Z

    if-eqz v2, :cond_2

    and-int/lit8 v2, v1, 0xf

    shl-int/lit8 p1, p1, 0x4

    goto :goto_2

    :cond_2
    and-int/lit16 v2, v1, 0xf0

    :goto_2
    or-int/2addr p1, v2

    const-wide/16 v10, 0x1

    if-nez v9, :cond_3

    if-eq p1, v1, :cond_5

    .line 213
    :cond_3
    iget-object v1, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    invoke-virtual {v1}, Ll/ᩳܳܳ;->᩷()Ll/֡ܳܳ;

    move-result-object v12

    if-eqz v9, :cond_4

    int-to-byte p1, p1

    :try_start_0
    new-array v4, v7, [B

    aput-byte p1, v4, v8

    const/4 v6, 0x0

    const/4 v5, 0x1

    move-object v1, v12

    move v2, v0

    move v3, v0

    .line 4067
    invoke-virtual/range {v1 .. v6}, Ll/֡ܳܳ;->ۙ(II[BILl/۟֡֫;)V

    goto :goto_3

    :cond_4
    int-to-long v1, v0

    add-long/2addr v1, v10

    long-to-int v3, v1

    int-to-long v4, v3

    cmp-long v6, v1, v4

    if-nez v6, :cond_9

    int-to-byte p1, p1

    new-array v4, v7, [B

    aput-byte p1, v4, v8

    const/4 v6, 0x0

    const/4 v5, 0x1

    move-object v1, v12

    move v2, v0

    invoke-virtual/range {v1 .. v6}, Ll/֡ܳܳ;->ۙ(II[BILl/۟֡֫;)V

    :goto_3
    const/4 p1, 0x0

    .line 4438
    invoke-virtual {v12, p1}, Ll/֡ܳܳ;->ۙ(Ll/۟֡֫;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 221
    invoke-virtual {v12}, Ll/֡ܳܳ;->close()V

    .line 224
    :cond_5
    iget-boolean p1, p0, Ll/ۚ᩷ܳ;->ܳ:Z

    if-eqz p1, :cond_6

    .line 225
    iget-wide v1, p0, Ll/ۚ᩷ܳ;->ۚ:J

    add-long/2addr v1, v10

    iput-wide v1, p0, Ll/ۚ᩷ܳ;->ۚ:J

    .line 226
    iput-boolean v8, p0, Ll/ۚ᩷ܳ;->ܳ:Z

    .line 227
    invoke-direct {p0}, Ll/ۚ᩷ܳ;->֡()V

    .line 229
    iget-object p1, p0, Ll/ۚ᩷ܳ;->ۤ:Ll/ۨ᩷ܳ;

    invoke-virtual {p1, v0, v0, v8}, Ll/ۨ᩷ܳ;->ۙ(IIZ)V

    if-eqz v9, :cond_7

    .line 230
    invoke-virtual {p0}, Ll/ۚ᩷ܳ;->ۨ()V

    goto :goto_4

    :cond_6
    int-to-long v0, v0

    add-long/2addr v0, v10

    long-to-int p1, v0

    int-to-long v2, p1

    cmp-long v4, v0, v2

    if-nez v4, :cond_8

    .line 156
    invoke-virtual {p0, p1, v7}, Ll/ۚ᩷ܳ;->ۙ(IZ)V

    .line 234
    :cond_7
    :goto_4
    iget-object p1, p0, Ll/ۚ᩷ܳ;->ۤ:Ll/ۨ᩷ܳ;

    invoke-virtual {p1}, Ll/ۨ᩷ܳ;->ۙ()V

    return-void

    .line 0
    :cond_8
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    :cond_9
    :try_start_1
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 213
    :try_start_2
    invoke-virtual {v12}, Ll/֡ܳܳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw p1

    .line 200
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Nibble is outside 0..15"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 197
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot input into a range selection"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩷(II)V
    .locals 7

    .line 98
    iget-object v0, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    invoke-virtual {v0}, Ll/ᩳܳܳ;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    .line 156
    invoke-virtual {p0, v1, v2}, Ll/ۚ᩷ܳ;->ۙ(IZ)V

    return-void

    .line 166
    :cond_0
    iget-wide v3, p0, Ll/ۚ᩷ܳ;->ۚ:J

    const-wide/16 v5, 0x1

    add-long/2addr v3, v5

    iput-wide v3, p0, Ll/ۚ᩷ܳ;->ۚ:J

    if-gez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    add-int/lit8 v3, v0, -0x1

    .line 999
    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    move-result p1

    :goto_0
    if-gez p2, :cond_2

    goto :goto_1

    :cond_2
    sub-int/2addr v0, v2

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 169
    :goto_1
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p2

    iput p2, p0, Ll/ۚ᩷ܳ;->֫:I

    .line 170
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Ll/ۚ᩷ܳ;->۫:I

    .line 171
    iput-boolean v2, p0, Ll/ۚ᩷ܳ;->ܳ:Z

    .line 172
    iput-boolean v2, p0, Ll/ۚ᩷ܳ;->᩸:Z

    .line 173
    invoke-direct {p0}, Ll/ۚ᩷ܳ;->֡()V

    .line 174
    iget-object p1, p0, Ll/ۚ᩷ܳ;->ۤ:Ll/ۨ᩷ܳ;

    iget p2, p0, Ll/ۚ᩷ܳ;->֫:I

    iget v0, p0, Ll/ۚ᩷ܳ;->۫:I

    invoke-virtual {p1, p2, v0, v2}, Ll/ۨ᩷ܳ;->ۙ(IIZ)V

    return-void
.end method

.method public final ᩷()Z
    .locals 1

    .line 290
    iget-object v0, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    invoke-virtual {v0}, Ll/ᩳܳܳ;->ܳ()Z

    move-result v0

    return v0
.end method

.method public final ᩸()I
    .locals 1

    .line 98
    iget-object v0, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    invoke-virtual {v0}, Ll/ᩳܳܳ;->length()I

    move-result v0

    return v0
.end method

.method public final ᩹()V
    .locals 1

    .line 280
    invoke-direct {p0}, Ll/ۚ᩷ܳ;->֡()V

    .line 281
    iget-object v0, p0, Ll/ۚ᩷ܳ;->᩷:Ll/ᩳܳܳ;

    invoke-virtual {v0}, Ll/ᩳܳܳ;->ۘ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 284
    :cond_0
    invoke-direct {p0}, Ll/ۚ᩷ܳ;->۟()V

    .line 285
    invoke-virtual {p0}, Ll/ۚ᩷ܳ;->ۨ()V

    .line 286
    iget-object v0, p0, Ll/ۚ᩷ܳ;->ۤ:Ll/ۨ᩷ܳ;

    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->ۙ()V

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 187
    iget-boolean v0, p0, Ll/ۚ᩷ܳ;->ܳ:Z

    return v0
.end method
