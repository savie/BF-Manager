.class public final Ll/᩸᩹᩸;
.super Ljava/lang/Object;
.source "16RW"


# instance fields
.field public ֫:Z

.field public ۙ:[B

.field public final ۚ:I

.field public final ۤ:Landroid/os/Handler;

.field public final ۧ:Ll/ۖۗ᩸;

.field public ۫:Z

.field public ܳ:Ll/ۤ᩹᩸;

.field public ᩴ:J

.field public final ᩷:Ll/۟ܰ᩸;

.field public final ᩸:Ll/ܶ᩵᩸;

.field public final ᩻:Ll/᩺ۜ᩸;


# direct methods
.method public constructor <init>(Ll/۟ܰ᩸;Ll/ܶ᩵᩸;I)V
    .locals 2

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Ll/᩸᩹᩸;->ۤ:Landroid/os/Handler;

    .line 24
    new-instance v0, Ll/ۖۗ᩸;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/ۖۗ᩸;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Ll/᩸᩹᩸;->ۧ:Ll/ۖۗ᩸;

    const-wide/16 v0, -0x1

    .line 26
    iput-wide v0, p0, Ll/᩸᩹᩸;->ᩴ:J

    .line 31
    iput-object p1, p0, Ll/᩸᩹᩸;->᩷:Ll/۟ܰ᩸;

    iput-object p2, p0, Ll/᩸᩹᩸;->᩸:Ll/ܶ᩵᩸;

    iget-object p1, p1, Ll/۟ܰ᩸;->۠:Ll/᩺ۜ᩸;

    iput-object p1, p0, Ll/᩸᩹᩸;->᩻:Ll/᩺ۜ᩸;

    iput p3, p0, Ll/᩸᩹᩸;->ۚ:I

    return-void
.end method

.method public static synthetic ۙ(JLl/ۤ᩹᩸;Ll/᩸᩹᩸;Ljava/lang/Throwable;[B)V
    .locals 3

    .line 60
    iget-object v0, p3, Ll/᩸᩹᩸;->᩸:Ll/ܶ᩵᩸;

    iget-object v1, p3, Ll/᩸᩹᩸;->᩷:Ll/۟ܰ᩸;

    const/4 v2, 0x0

    iput-boolean v2, p3, Ll/᩸᩹᩸;->۫:Z

    if-nez p4, :cond_0

    .line 61
    iput-wide p0, p3, Ll/᩸᩹᩸;->ᩴ:J

    iput-object p5, p3, Ll/᩸᩹᩸;->ۙ:[B

    iput-object p2, p3, Ll/᩸᩹᩸;->ܳ:Ll/ۤ᩹᩸;

    .line 62
    :cond_0
    iget-boolean p0, p3, Ll/᩸᩹᩸;->֫:Z

    if-nez p0, :cond_4

    iget-object p0, p3, Ll/᩸᩹᩸;->᩻:Ll/᩺ۜ᩸;

    invoke-virtual {v1, v0, p0}, Ll/۟ܰ᩸;->ۙ(Ll/ܶ᩵᩸;Ll/᩺ۜ᩸;)Z

    move-result p0

    if-eqz p0, :cond_4

    .line 63
    instance-of p0, p4, Ll/ۗܽ᩵;

    if-eqz p0, :cond_1

    invoke-virtual {p4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p4

    :cond_1
    if-eqz p4, :cond_2

    .line 64
    instance-of p0, p4, Ljava/util/concurrent/CancellationException;

    if-nez p0, :cond_2

    iget-object p0, v1, Ll/ۜܽ᩸;->ۢ:Ll/֨ܰ᩸;

    invoke-virtual {p0, p4}, Ll/֨ܰ᩸;->ۙ(Ljava/lang/Throwable;)V

    .line 65
    :cond_2
    iget-object p0, v0, Ll/ܶ᩵᩸;->ܽ:Ll/ۚ᩹᩸;

    invoke-virtual {p0}, Ll/ۚ᩹᩸;->ۤ()Ljava/io/IOException;

    move-result-object p0

    if-eqz p0, :cond_3

    iget-object p0, v1, Ll/ۜܽ᩸;->ۢ:Ll/֨ܰ᩸;

    iget-object p1, v0, Ll/ܶ᩵᩸;->ܽ:Ll/ۚ᩹᩸;

    invoke-virtual {p1}, Ll/ۚ᩹᩸;->ۤ()Ljava/io/IOException;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/֨ܰ᩸;->ۙ(Ljava/lang/Throwable;)V

    .line 66
    :cond_3
    invoke-direct {p3}, Ll/᩸᩹᩸;->ۤ()V

    :cond_4
    return-void
.end method

.method public static ۙ(Ll/᩸᩹᩸;)V
    .locals 18

    move-object/from16 v7, p0

    .line 40
    iget-object v0, v7, Ll/᩸᩹᩸;->᩻:Ll/᩺ۜ᩸;

    iget-object v1, v7, Ll/᩸᩹᩸;->᩸:Ll/ܶ᩵᩸;

    iget-object v8, v7, Ll/᩸᩹᩸;->᩷:Ll/۟ܰ᩸;

    iget-boolean v2, v7, Ll/᩸᩹᩸;->֫:Z

    if-nez v2, :cond_5

    invoke-virtual {v8, v1, v0}, Ll/۟ܰ᩸;->ۙ(Ll/ܶ᩵᩸;Ll/᩺ۜ᩸;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_2

    .line 41
    :cond_0
    iget-boolean v2, v7, Ll/᩸᩹᩸;->۫:Z

    if-nez v2, :cond_4

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۗ()Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_1

    .line 43
    :cond_1
    :try_start_0
    iget-object v2, v8, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    const-string v3, "changed"

    iget-object v4, v1, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    invoke-virtual {v4}, Ll/ۗۤᩴ;->isChanged()Z

    move-result v4

    invoke-virtual {v8, v4}, Ll/۟ܰ᩸;->᩸(Z)Z

    move-result v4

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 44
    new-instance v6, Ll/ۤ᩹᩸;

    invoke-direct {v6, v8, v1, v0}, Ll/ۤ᩹᩸;-><init>(Ll/۟ܰ᩸;Ll/ܶ᩵᩸;Ll/᩺ۜ᩸;)V

    .line 45
    iget-object v0, v7, Ll/᩸᩹᩸;->ܳ:Ll/ۤ᩹᩸;

    invoke-virtual {v6, v0}, Ll/ۤ᩹᩸;->ۙ(Ll/ۤ᩹᩸;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct/range {p0 .. p0}, Ll/᩸᩹᩸;->ۤ()V

    return-void

    .line 46
    :cond_2
    new-instance v0, Ll/ۛۚۤ;

    invoke-direct {v0}, Ll/ۛۚۤ;-><init>()V

    new-instance v2, Ll/ۛۚۤ;

    invoke-direct {v2}, Ll/ۛۚۤ;-><init>()V

    .line 47
    iget-object v3, v8, Ll/۟ܰ᩸;->ۜ:Ll/᩹۬᩸;

    invoke-virtual {v3, v0}, Ll/᩹۬᩸;->᩷(Ll/ۛۚۤ;)V

    iget-object v3, v8, Ll/۟ܰ᩸;->ۜ:Ll/᩹۬᩸;

    invoke-virtual {v3, v2}, Ll/᩹۬᩸;->ۙ(Ll/ۛۚۤ;)V

    .line 48
    iget-object v9, v7, Ll/᩸᩹᩸;->᩻:Ll/᩺ۜ᩸;

    iget-object v10, v8, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    invoke-virtual {v8}, Ll/۟ܰ᩸;->۟()Ll/᩸᩶᩸;

    move-result-object v11

    .line 49
    invoke-virtual {v0}, Ll/ۛۚۤ;->۫()[B

    move-result-object v12

    invoke-virtual {v2}, Ll/ۛۚۤ;->۫()[B

    move-result-object v13

    iget v14, v7, Ll/᩸᩹᩸;->ۚ:I

    iget-wide v2, v7, Ll/᩸᩹᩸;->ᩴ:J

    iget-object v0, v7, Ll/᩸᩹᩸;->ۙ:[B

    move-wide v15, v2

    move-object/from16 v17, v0

    .line 48
    invoke-static/range {v9 .. v17}, Ll/ۙۗ᩸;->ۙ(Ll/᩺ۜ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;[B[BIJ[B)Ll/ۙۗ᩸;

    move-result-object v0

    if-nez v0, :cond_3

    .line 52
    iput-object v6, v7, Ll/᩸᩹᩸;->ܳ:Ll/ۤ᩹᩸;

    invoke-direct/range {p0 .. p0}, Ll/᩸᩹᩸;->ۤ()V

    return-void

    .line 54
    :cond_3
    invoke-virtual {v0}, Ll/ۙۗ᩸;->ۤ()[B

    move-result-object v5

    .line 55
    invoke-virtual {v0}, Ll/ۙۗ᩸;->ܽ()J

    move-result-wide v3

    .line 57
    iput-wide v3, v6, Ll/ۤ᩹᩸;->᩸:J

    const/4 v2, 0x1

    .line 58
    iput-boolean v2, v7, Ll/᩸᩹᩸;->۫:Z

    .line 59
    iget-object v1, v1, Ll/ܶ᩵᩸;->ܽ:Ll/ۚ᩹᩸;

    invoke-virtual {v1, v0}, Ll/ۚ᩹᩸;->᩷(Ll/ۙۗ᩸;)Ll/᩹ܽ᩵;

    move-result-object v0

    new-instance v9, Ll/ۙ᩹᩸;

    move-object v1, v9

    move-object/from16 v2, p0

    invoke-direct/range {v1 .. v6}, Ll/ۙ᩹᩸;-><init>(Ll/᩸᩹᩸;J[BLl/ۤ᩹᩸;)V

    invoke-virtual {v0, v9}, Ll/᩹ܽ᩵;->ۙ(Ll/֫ܶ᩵;)Ll/᩹ܽ᩵;
    :try_end_0
    .catch Ll/۬᩹᩸; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 73
    iget-object v1, v8, Ll/ۜܽ᩸;->ۢ:Ll/֨ܰ᩸;

    invoke-virtual {v1, v0}, Ll/֨ܰ᩸;->ۙ(Ljava/lang/Throwable;)V

    invoke-direct/range {p0 .. p0}, Ll/᩸᩹᩸;->ۤ()V

    goto :goto_0

    .line 71
    :catch_1
    invoke-direct/range {p0 .. p0}, Ll/᩸᩹᩸;->ۤ()V

    :goto_0
    return-void

    .line 41
    :cond_4
    :goto_1
    invoke-direct/range {p0 .. p0}, Ll/᩸᩹᩸;->ۤ()V

    return-void

    .line 40
    :cond_5
    :goto_2
    invoke-virtual/range {p0 .. p0}, Ll/᩸᩹᩸;->᩷()V

    return-void
.end method

.method private ۤ()V
    .locals 4

    .line 77
    iget-boolean v0, p0, Ll/᩸᩹᩸;->֫:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩸᩹᩸;->ۧ:Ll/ۖۗ᩸;

    const-wide/16 v1, 0x7d0

    iget-object v3, p0, Ll/᩸᩹᩸;->ۤ:Landroid/os/Handler;

    invoke-virtual {v3, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public static synthetic ᩷(JLl/ۤ᩹᩸;Ll/᩸᩹᩸;Ljava/lang/Throwable;[B)V
    .locals 9

    .line 59
    iget-object v0, p3, Ll/᩸᩹᩸;->ۤ:Landroid/os/Handler;

    new-instance v8, Ll/᩷᩹᩸;

    move-object v1, v8

    move-wide v2, p0

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Ll/᩷᩹᩸;-><init>(JLl/ۤ᩹᩸;Ll/᩸᩹᩸;Ljava/lang/Throwable;[B)V

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 4

    .line 34
    iget-object v0, p0, Ll/᩸᩹᩸;->ۧ:Ll/ۖۗ᩸;

    const-wide/16 v1, 0x7d0

    iget-object v3, p0, Ll/᩸᩹᩸;->ۤ:Landroid/os/Handler;

    invoke-virtual {v3, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final ᩷()V
    .locals 2

    const/4 v0, 0x1

    .line 37
    iput-boolean v0, p0, Ll/᩸᩹᩸;->֫:Z

    iget-object v0, p0, Ll/᩸᩹᩸;->ۤ:Landroid/os/Handler;

    iget-object v1, p0, Ll/᩸᩹᩸;->ۧ:Ll/ۖۗ᩸;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method
