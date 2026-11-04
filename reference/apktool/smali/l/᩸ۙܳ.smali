.class public final Ll/᩸ۙܳ;
.super Ll/ܽ֡֫;
.source "HIRF"

# interfaces
.implements Ll/᩶ۙܳ;
.implements Ll/᩹ۤܳ;


# static fields
.field public static final synthetic ۚۤ:I

.field private static final ᩸ۧܳ:[S


# instance fields
.field public ֡᩷:Ljava/lang/String;

.field public ֨᩷:Ll/᩷ۙܳ;

.field public ֫᩷:J

.field public ۖ᩷:Ll/֨ۜᩴ;

.field public ۗ᩷:Z

.field public ۘ᩷:Ll/ᩴۤܳ;

.field public ۙۤ:Ll/ܶۤܳ;

.field public ۚ᩷:J

.field public ۛ᩷:Z

.field public ۜ᩷:Z

.field public ۟᩷:Landroid/os/Bundle;

.field public ۠᩷:Ll/ۜ᩸ܳ;

.field public ۡ᩷:Ll/᩹ۙܳ;

.field public ۢ᩷:J

.field public ۤۤ:Ll/֨᩷ܳ;

.field public ۧ᩷:Z

.field public ۨ᩷:Ll/۟᩷ۙ;

.field public ۫ۤ:Ll/ۤۙܳ;

.field public ۫᩷:Ljava/util/concurrent/Executor;

.field public ۬᩷:Ll/ܶۤܳ;

.field public ܰ᩷:Z

.field public ܳۤ:Z

.field public ܳ᩷:Ll/۬ۙܳ;

.field public ܶ᩷:Landroid/widget/TextView;

.field public ܺ᩷:Ll/ܿۙܳ;

.field public ܽ᩷:Ll/۬ۙܳ;

.field public ܿ᩷:Ljava/lang/String;

.field public final ᩳ᩷:Ll/᩵᩸ܳ;

.field public ᩴۤ:Ll/ۨ᩷ܳ;

.field public ᩴ᩷:Ll/۠ܺۤ;

.field public ᩵᩷:Z

.field public ᩶᩷:Ll/᩹ۙܳ;

.field public ᩷ۤ:Ll/֨᩷ܳ;

.field public ᩸ۤ:Ll/ۙۙܳ;

.field public ᩸᩷:Ll/۠ܺۤ;

.field public ᩹᩷:Ll/ܺۤܳ;

.field public ᩺᩷:Landroid/widget/TextView;

.field public ᩻᩷:Ll/ܶۤܳ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa2

    invoke-static {v0}, Ll/᩹֡֫;->ۗ۟᩸(I)V

    const/16 v0, 0xa

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩸ۙܳ;->᩸ۧܳ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x1f65s
        -0x6418s
        -0x6bf9s
        0x6659s
        0x6fabs
        -0x4c99s
        0x6d2cs
        0x6231s
        0x6fe9s
        0x65d1s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    .line 50
    invoke-direct {p0}, Ll/ܽ֡֫;-><init>()V

    const/4 v0, 0x1

    .line 57
    iput-boolean v0, p0, Ll/᩸ۙܳ;->ۛ᩷:Z

    const-wide/16 v0, -0x1

    .line 72
    iput-wide v0, p0, Ll/᩸ۙܳ;->ۚ᩷:J

    iput-wide v0, p0, Ll/᩸ۙܳ;->֫᩷:J

    .line 75
    invoke-static {}, Ll/ۧ۬ᩴ;->ۙ()Ljava/util/concurrent/Executor;

    move-result-object v2

    iput-object v2, p0, Ll/᩸ۙܳ;->۫᩷:Ljava/util/concurrent/Executor;

    .line 76
    iput-wide v0, p0, Ll/᩸ۙܳ;->ۢ᩷:J

    .line 77
    new-instance v0, Ll/᩵᩸ܳ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/᩵᩸ܳ;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Ll/᩸ۙܳ;->ᩳ᩷:Ll/᩵᩸ܳ;

    return-void
.end method

.method public static bridge synthetic ֡(Ll/᩸ۙܳ;)Ll/֨᩷ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۙܳ;->ۤۤ:Ll/֨᩷ܳ;

    return-object p0
.end method

.method public static bridge synthetic ֨(Ll/᩸ۙܳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/᩸ۙܳ;->֨᩷:Ll/᩷ۙܳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩸ۙܳ;)Ll/ܿۙܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    return-object p0
.end method

.method private ֫ۙ()V
    .locals 4

    .line 258
    invoke-virtual {p0}, Ll/ۘᩴ;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const v1, 0x7f0a02d3

    .line 259
    invoke-virtual {p0, v1}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/֨ۤܳ;

    if-eqz v0, :cond_1

    const/16 v3, 0x10

    goto :goto_1

    :cond_1
    const/16 v3, 0x8

    :goto_1
    invoke-virtual {v1, v3}, Ll/֨ۤܳ;->ۙ(I)V

    const v1, 0x7f0a0522

    .line 260
    invoke-virtual {p0, v1}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v1

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    const/16 v2, 0x8

    :goto_2
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static bridge synthetic ۖ(Ll/᩸ۙܳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/᩸ۙܳ;->᩸ۤ:Ll/ۙۙܳ;

    return-void
.end method

.method public static bridge synthetic ۗ(Ll/᩸ۙܳ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۙܳ;->֡᩷:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ۘ(Ll/᩸ۙܳ;)Ll/֨ۜᩴ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۙܳ;->ۖ᩷:Ll/֨ۜᩴ;

    return-object p0
.end method

.method public static ۙ(Ll/ܶۤܳ;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 657
    :try_start_0
    invoke-virtual {p0}, Ll/ܶۤܳ;->᩷()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static synthetic ۙ(Ll/᩸ۙܳ;)V
    .locals 2

    .line 228
    iget-boolean v0, p0, Ll/᩸ۙܳ;->ܰ᩷:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Ll/᩸ۙܳ;->ܰ᩷:Z

    const v0, 0x7f0a0183

    .line 229
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    iget-boolean v1, p0, Ll/᩸ۙܳ;->ܰ᩷:Z

    if-eqz v1, :cond_0

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const v1, 0x3e99999a    # 0.3f

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 230
    iget-boolean v0, p0, Ll/᩸ۙܳ;->ܰ᩷:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ll/᩸ۙܳ;->ܳ()V

    return-void

    :cond_1
    invoke-virtual {p0}, Ll/᩸ۙܳ;->֫()V

    return-void
.end method

.method public static ۙ(Ll/᩸ۙܳ;I)V
    .locals 1

    .line 225
    invoke-virtual {p0}, Ll/᩸ۙܳ;->ܺ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 204
    iget-object p0, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {p0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object p0

    .line 225
    invoke-virtual {p0, p1}, Ll/ۨ᩷ܳ;->ۤ(I)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩸ۙܳ;Ljava/lang/Runnable;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 0
    invoke-direct {p0, v0, v1, p1}, Ll/᩸ۙܳ;->ۙ(ZZLjava/lang/Runnable;)V

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩸ۙܳ;Ll/֨᩷ܳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩸ۙܳ;->᩷ۤ:Ll/֨᩷ܳ;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩸ۙܳ;Ll/۬ۙܳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩸ۙܳ;->ܽ᩷:Ll/۬ۙܳ;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩸ۙܳ;Ll/ܶۤܳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩸ۙܳ;->᩻᩷:Ll/ܶۤܳ;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩸ۙܳ;Ll/ܺۤܳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩸ۙܳ;->᩹᩷:Ll/ܺۤܳ;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩸ۙܳ;Ll/᩹ۙܳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩸ۙܳ;->᩶᩷:Ll/᩹ۙܳ;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩸ۙܳ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/᩸ۙܳ;->ۗ᩷:Z

    return-void
.end method

.method public static ۙ(Ll/᩹ۙܳ;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 661
    :try_start_0
    invoke-virtual {p0}, Ll/᩹ۙܳ;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method private native ۙ(ZZLjava/lang/Runnable;)V
.end method

.method private ۙ(Ll/ܺۤܳ;)Z
    .locals 13

    .line 635
    :try_start_0
    iget-object v0, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v0}, Ll/ܿۙܳ;->ܳ()Ll/ۙۤܳ;

    move-result-object v12

    move-object v0, v12

    .line 636
    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v1, v12, Ll/ۙۤܳ;->ܿ:Ll/ᩳܳܳ;

    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    iget-object v2, v12, Ll/ۙۤܳ;->֨:Ll/ᩳܳܳ;

    monitor-enter v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 637
    :try_start_3
    iget-object v5, p0, Ll/᩸ۙܳ;->᩷ۤ:Ll/֨᩷ܳ;

    iget-object v6, p0, Ll/᩸ۙܳ;->ۤۤ:Ll/֨᩷ܳ;

    iget-boolean v7, p0, Ll/᩸ۙܳ;->ۗ᩷:Z

    iget-boolean v8, p0, Ll/᩸ۙܳ;->᩵᩷:Z

    iget-object v9, p0, Ll/᩸ۙܳ;->۬᩷:Ll/ܶۤܳ;

    iget-object v10, p0, Ll/᩸ۙܳ;->ۙۤ:Ll/ܶۤܳ;

    iget-object v11, p0, Ll/᩸ۙܳ;->۫᩷:Ljava/util/concurrent/Executor;

    move-object v3, p1

    move-object v4, v12

    invoke-static/range {v3 .. v11}, Ll/֫ۙܳ;->ۙ(Ll/ܺۤܳ;Ll/ۙۤܳ;Ll/֨᩷ܳ;Ll/֨᩷ܳ;ZZLl/ܶۤܳ;Ll/ܶۤܳ;Ljava/util/concurrent/Executor;)V

    .line 639
    invoke-virtual {v12}, Ll/ۙۤܳ;->᩷()Ll/۬ۙܳ;

    move-result-object v3

    iput-object v3, p0, Ll/᩸ۙܳ;->ܳ᩷:Ll/۬ۙܳ;

    .line 640
    iget-object v3, v12, Ll/ۙۤܳ;->ܿ:Ll/ᩳܳܳ;

    invoke-virtual {v3}, Ll/ᩳܳܳ;->ܽ()J

    move-result-wide v3

    iput-wide v3, p0, Ll/᩸ۙܳ;->ۚ᩷:J

    iget-object v3, v12, Ll/ۙۤܳ;->֨:Ll/ᩳܳܳ;

    invoke-virtual {v3}, Ll/ᩳܳܳ;->ܽ()J

    move-result-wide v3

    iput-wide v3, p0, Ll/᩸ۙܳ;->֫᩷:J

    .line 641
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception v3

    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    throw v3

    :catchall_1
    move-exception v2

    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :try_start_8
    throw v2

    :catchall_2
    move-exception v1

    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :try_start_9
    throw v1
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 643
    :goto_0
    invoke-virtual {p1, v0}, Ll/ܺۤܳ;->ۙ(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return p1
.end method

.method public static bridge synthetic ۙۙ(Ll/᩸ۙܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩸ۙܳ;->ᩴۙ()V

    return-void
.end method

.method public static bridge synthetic ۚ(Ll/᩸ۙܳ;)Ll/ܶۤܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۙܳ;->᩻᩷:Ll/ܶۤܳ;

    return-object p0
.end method

.method private ۚۙ()V
    .locals 5

    .line 248
    invoke-virtual {p0}, Ll/᩸ۙܳ;->ܺ()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 204
    iget-object v0, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v0

    .line 1230
    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const v2, 0x7f0a02d3

    .line 249
    invoke-virtual {p0, v2}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/֨ۤܳ;

    .line 250
    :goto_1
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    if-ge v1, v3, :cond_2

    .line 251
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 252
    invoke-virtual {v3, v0}, Landroid/view/View;->setEnabled(Z)V

    if-eqz v0, :cond_1

    const/high16 v4, 0x3f800000    # 1.0f

    goto :goto_2

    :cond_1
    const v4, 0x3e99999a    # 0.3f

    .line 253
    :goto_2
    invoke-virtual {v3, v4}, Landroid/view/View;->setAlpha(F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public static bridge synthetic ۛ(Ll/᩸ۙܳ;)Ll/᩷ۙܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۙܳ;->֨᩷:Ll/᩷ۙܳ;

    return-object p0
.end method

.method public static bridge synthetic ۜ(Ll/᩸ۙܳ;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩸ۙܳ;->ۤۙ()Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ۟(Ll/᩸ۙܳ;)Ll/ۙۙܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۙܳ;->᩸ۤ:Ll/ۙۙܳ;

    return-object p0
.end method

.method public static bridge synthetic ۠(Ll/᩸ۙܳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/᩸ۙܳ;->۫ۤ:Ll/ۤۙܳ;

    return-void
.end method

.method public static bridge synthetic ۡ(Ll/᩸ۙܳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/᩸ۙܳ;->ۖ᩷:Ll/֨ۜᩴ;

    return-void
.end method

.method public static bridge synthetic ۢ(Ll/᩸ۙܳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/᩸ۙܳ;->۟᩷:Landroid/os/Bundle;

    return-void
.end method

.method public static synthetic ۤ(Ll/᩸ۙܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩸ۙܳ;->ܳۙ()V

    return-void
.end method

.method public static bridge synthetic ۤ(Ll/᩸ۙܳ;Ll/ܶۤܳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩸ۙܳ;->ۙۤ:Ll/ܶۤܳ;

    return-void
.end method

.method public static bridge synthetic ۤ(Ll/᩸ۙܳ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/᩸ۙܳ;->ܰ᩷:Z

    return-void
.end method

.method public static bridge synthetic ۤۙ(Ll/᩸ۙܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩸ۙܳ;->ۚۙ()V

    return-void
.end method

.method private ۤۙ()Z
    .locals 1

    .line 274
    iget-object v0, p0, Ll/᩸ۙܳ;->ܽ᩷:Ll/۬ۙܳ;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩸ۙܳ;->ۖ᩷:Ll/֨ۜᩴ;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/᩸ۙܳ;->ۜ᩷:Z

    if-nez v0, :cond_0

    .line 204
    iget-object v0, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v0

    .line 1230
    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static bridge synthetic ۧ(Ll/᩸ۙܳ;)Ll/۬ۙܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۙܳ;->ܽ᩷:Ll/۬ۙܳ;

    return-object p0
.end method

.method public static bridge synthetic ۨ(Ll/᩸ۙܳ;)Ll/᩵᩸ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۙܳ;->ᩳ᩷:Ll/᩵᩸ܳ;

    return-object p0
.end method

.method public static bridge synthetic ۫(Ll/᩸ۙܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩸ۙܳ;->ۧ᩷:Z

    return p0
.end method

.method private ۫ۙ()V
    .locals 5

    .line 467
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "leftName"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "rightName"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 468
    iget-object v2, p0, Ll/᩸ۙܳ;->ܽ᩷:Ll/۬ۙܳ;

    if-eqz v2, :cond_1

    .line 469
    iget-object v2, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ll/ܿۙܳ;->ۤ(Z)Ll/ۨ᩷ܳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۨ᩷ܳ;->ۧ()Z

    move-result v2

    const-string v3, "*"

    if-eqz v2, :cond_0

    .line 0
    invoke-static {v3, v0}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 470
    :cond_0
    iget-object v2, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Ll/ܿۙܳ;->ۤ(Z)Ll/ۨ᩷ܳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۨ᩷ܳ;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 0
    invoke-static {v3, v1}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 472
    :cond_1
    iget-object v2, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v2}, Ll/ܿۙܳ;->ۚ()Z

    move-result v2

    const v3, 0x7f0a02f2

    .line 473
    invoke-virtual {p0, v3}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    if-eqz v2, :cond_2

    const-string v4, "\u2191 "

    .line 0
    invoke-static {v4, v0}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 473
    :cond_2
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a050a

    .line 474
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v2, :cond_3

    const-string v2, " \u2193"

    .line 0
    invoke-static {v1, v2}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 474
    :cond_3
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static bridge synthetic ۬(Ll/᩸ۙܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩸ۙܳ;->᩸ۙ()V

    return-void
.end method

.method public static bridge synthetic ܰ(Ll/᩸ۙܳ;)Ll/ۜ᩸ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۙܳ;->۠᩷:Ll/ۜ᩸ܳ;

    return-object p0
.end method

.method public static ܳ(Ll/᩸ۙܳ;)V
    .locals 8

    .line 450
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "leftDisplayPath"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 451
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "rightDisplayPath"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 452
    new-instance v2, Landroid/text/SpannableStringBuilder;

    const v3, 0x7f1208f8

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 453
    new-instance v3, Landroid/text/style/StyleSpan;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v5

    const/16 v6, 0x21

    const/4 v7, 0x0

    invoke-virtual {v2, v3, v7, v5, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    const/16 v3, 0xa

    .line 454
    invoke-virtual {v2, v3}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    move-result-object v3

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩸ۙܳ;->ܿ᩷:Ljava/lang/String;

    :cond_0
    invoke-virtual {v3, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    const-string v3, "\n\u21c5\n"

    invoke-virtual {v0, v3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    if-nez v1, :cond_1

    .line 455
    iget-object v1, p0, Ll/᩸ۙܳ;->֡᩷:Ljava/lang/String;

    :cond_1
    invoke-virtual {v0, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 456
    invoke-virtual {p0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p0

    invoke-virtual {p0, v2}, Ll/ۖۖۧ;->ۙ(Ljava/lang/CharSequence;)V

    const v0, 0x7f12018c

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    invoke-virtual {p0}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object p0

    const v0, 0x102000b

    .line 457
    invoke-virtual {p0, v0}, Ll/۠ۖۧ;->ۙ(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    .line 458
    invoke-virtual {p0, v4}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    return-void
.end method

.method private ܳۙ()V
    .locals 3

    .line 294
    iget-object v0, p0, Ll/᩸ۙܳ;->֨᩷:Ll/᩷ۙܳ;

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/᩸ۙܳ;->ۖ᩷:Ll/֨ۜᩴ;

    if-nez v0, :cond_2

    iget-boolean v0, p0, Ll/᩸ۙܳ;->ۜ᩷:Z

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 295
    :cond_0
    iget-object v0, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v0}, Ll/ܿۙܳ;->ܳ()Ll/ۙۤܳ;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 297
    :cond_1
    invoke-virtual {v0}, Ll/ۙۤܳ;->ۙ()Ll/۬᩷ܳ;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 298
    new-instance v2, Ll/᩷ۙܳ;

    invoke-direct {v2, p0, v0, v1}, Ll/᩷ۙܳ;-><init>(Ll/᩸ۙܳ;Ll/ۙۤܳ;Ll/۬᩷ܳ;)V

    iput-object v2, p0, Ll/᩸ۙܳ;->֨᩷:Ll/᩷ۙܳ;

    invoke-virtual {v2}, Ll/ۖۙܺ;->۫()V

    :cond_2
    :goto_0
    return-void
.end method

.method public static bridge synthetic ܶ(Ll/᩸ۙܳ;)Ll/᩹ۙܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۙܳ;->᩶᩷:Ll/᩹ۙܳ;

    return-object p0
.end method

.method public static bridge synthetic ܺ(Ll/᩸ۙܳ;)Ll/۟᩷ۙ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۙܳ;->ۨ᩷:Ll/۟᩷ۙ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/᩸ۙܳ;)Ll/ᩴۤܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۙܳ;->ۘ᩷:Ll/ᩴۤܳ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/᩸ۙܳ;)Ll/֨᩷ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۙܳ;->᩷ۤ:Ll/֨᩷ܳ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/᩸ۙܳ;)Ll/ۤۙܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۙܳ;->۫ۤ:Ll/ۤۙܳ;

    return-object p0
.end method

.method public static synthetic ᩴ(Ll/᩸ۙܳ;)V
    .locals 2

    .line 484
    new-instance v0, Ll/ۨۨ᩸;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, Ll/ۨۨ᩸;-><init>(ILjava/lang/Object;)V

    const/4 v1, 0x1

    invoke-direct {p0, v1, v1, v0}, Ll/᩸ۙܳ;->ۙ(ZZLjava/lang/Runnable;)V

    return-void
.end method

.method private ᩴۙ()V
    .locals 2

    .line 647
    iget-boolean v0, p0, Ll/᩸ۙܳ;->ۧ᩷:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_3

    .line 648
    :cond_0
    iget-object v0, p0, Ll/᩸ۙܳ;->۬᩷:Ll/ܶۤܳ;

    if-eqz v0, :cond_1

    .line 657
    :try_start_0
    invoke-virtual {v0}, Ll/ܶۤܳ;->᩷()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 648
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/᩸ۙܳ;->ۙۤ:Ll/ܶۤܳ;

    if-eqz v0, :cond_2

    .line 657
    :try_start_1
    invoke-virtual {v0}, Ll/ܶۤܳ;->᩷()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    nop

    .line 648
    :cond_2
    :goto_1
    iget-object v0, p0, Ll/᩸ۙܳ;->᩻᩷:Ll/ܶۤܳ;

    if-eqz v0, :cond_3

    .line 657
    :try_start_2
    invoke-virtual {v0}, Ll/ܶۤܳ;->᩷()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    nop

    :cond_3
    :goto_2
    const/4 v0, 0x0

    .line 649
    iput-object v0, p0, Ll/᩸ۙܳ;->᩻᩷:Ll/ܶۤܳ;

    iput-object v0, p0, Ll/᩸ۙܳ;->ۙۤ:Ll/ܶۤܳ;

    iput-object v0, p0, Ll/᩸ۙܳ;->۬᩷:Ll/ܶۤܳ;

    .line 650
    iget-object v0, p0, Ll/᩸ۙܳ;->۟᩷:Landroid/os/Bundle;

    if-eqz v0, :cond_4

    const-string v1, "checkpoint"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 651
    :try_start_3
    iget-object v0, p0, Ll/᩸ۙܳ;->۟᩷:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ܶۤܳ;->᩷(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :cond_4
    :goto_3
    return-void
.end method

.method public static bridge synthetic ᩵(Ll/᩸ۙܳ;)Landroid/os/Bundle;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۙܳ;->۟᩷:Landroid/os/Bundle;

    return-object p0
.end method

.method public static bridge synthetic ᩶(Ll/᩸ۙܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩸ۙܳ;->ۜ᩷:Z

    return p0
.end method

.method public static synthetic ᩷(Ll/᩸ۙܳ;)V
    .locals 1

    .line 198
    iget-boolean v0, p0, Ll/᩸ۙܳ;->ۛ᩷:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Ll/᩸ۙܳ;->ۛ᩷:Z

    invoke-virtual {p0}, Ll/᩸ۙܳ;->᩷ۙ()V

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/᩸ۙܳ;Ll/֨᩷ܳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩸ۙܳ;->ۤۤ:Ll/֨᩷ܳ;

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/᩸ۙܳ;Ll/ܶۤܳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩸ۙܳ;->۬᩷:Ll/ܶۤܳ;

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/᩸ۙܳ;Ll/ܺۤܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩸ۙܳ;->ۙ(Ll/ܺۤܳ;)Z

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/᩸ۙܳ;Ll/᩹ۙܳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩸ۙܳ;->ۡ᩷:Ll/᩹ۙܳ;

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/᩸ۙܳ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/᩸ۙܳ;->᩵᩷:Z

    return-void
.end method

.method public static bridge synthetic ᩷ۙ(Ll/᩸ۙܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩸ۙܳ;->ܳۙ()V

    return-void
.end method

.method public static synthetic ᩸(Ll/᩸ۙܳ;)V
    .locals 2

    .line 138
    iget-boolean v0, p0, Ll/᩸ۙܳ;->ܳۤ:Z

    xor-int/lit8 v1, v0, 0x1

    iput-boolean v1, p0, Ll/᩸ۙܳ;->ܳۤ:Z

    if-nez v0, :cond_0

    .line 139
    iget-object v0, p0, Ll/᩸ۙܳ;->᩸᩷:Ll/۠ܺۤ;

    const/16 v1, 0x12c

    invoke-virtual {v0, v1}, Ll/۠ܺۤ;->᩸(I)V

    iget-object v0, p0, Ll/᩸ۙܳ;->ᩴ᩷:Ll/۠ܺۤ;

    invoke-virtual {v0, v1}, Ll/۠ܺۤ;->᩸(I)V

    goto :goto_0

    .line 140
    :cond_0
    iget-object v0, p0, Ll/᩸ۙܳ;->᩸᩷:Ll/۠ܺۤ;

    invoke-virtual {v0}, Ll/۠ܺۤ;->ۙ()V

    iget-object v0, p0, Ll/᩸ۙܳ;->ᩴ᩷:Ll/۠ܺۤ;

    invoke-virtual {v0}, Ll/۠ܺۤ;->ۙ()V

    .line 141
    :goto_0
    invoke-virtual {p0}, Ll/ۘᩴ;->invalidateOptionsMenu()V

    return-void
.end method

.method private ᩸ۙ()V
    .locals 5

    .line 478
    iget-object v0, p0, Ll/᩸ۙܳ;->ۖ᩷:Ll/֨ۜᩴ;

    if-eqz v0, :cond_0

    const v0, 0x7f120966

    invoke-static {v0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void

    .line 479
    :cond_0
    iget-object v0, p0, Ll/᩸ۙܳ;->ܽ᩷:Ll/۬ۙܳ;

    if-eqz v0, :cond_4

    iget-object v0, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/ܿۙܳ;->ۤ(Z)Ll/ۨ᩷ܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->ۧ()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v0, v2}, Ll/ܿۙܳ;->ۤ(Z)Ll/ۨ᩷ܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 480
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const v3, 0x7f120a8c

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 481
    iget-object v3, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v3, v1}, Ll/ܿۙܳ;->ۤ(Z)Ll/ۨ᩷ܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۨ᩷ܳ;->ۧ()Z

    move-result v1

    const/16 v3, 0xa

    if-eqz v1, :cond_2

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v4, "leftName"

    invoke-virtual {v1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    :cond_2
    iget-object v1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v1, v2}, Ll/ܿۙܳ;->ۤ(Z)Ll/ۨ᩷ܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۨ᩷ܳ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "rightName"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 483
    :cond_3
    invoke-virtual {p0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v1

    const v2, 0x7f12031a

    invoke-virtual {v1, v2}, Ll/ۖۖۧ;->᩷(I)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ۖۖۧ;->ۙ(Ljava/lang/CharSequence;)V

    new-instance v0, Ll/ۛ۬ᩴ;

    invoke-direct {v0, p0}, Ll/ۛ۬ᩴ;-><init>(Ll/᩸ۙܳ;)V

    const v2, 0x7f120a85

    .line 484
    invoke-virtual {v1, v2, v0}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v0, Ll/᩺۬ᩴ;

    invoke-direct {v0, p0}, Ll/᩺۬ᩴ;-><init>(Ll/᩸ۙܳ;)V

    const v2, 0x7f12031d

    .line 485
    invoke-virtual {v1, v2, v0}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    invoke-virtual {v1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void

    .line 479
    :cond_4
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public static bridge synthetic ᩹(Ll/᩸ۙܳ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۙܳ;->ܿ᩷:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ᩺(Ll/᩸ۙܳ;)Ll/᩹ۙܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۙܳ;->ۡ᩷:Ll/᩹ۙܳ;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/᩸ۙܳ;)Ll/ܺۤܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۙܳ;->᩹᩷:Ll/ܺۤܳ;

    return-object p0
.end method


# virtual methods
.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 264
    invoke-super {p0, p1}, Ll/ܽ֡֫;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 265
    invoke-direct {p0}, Ll/᩸ۙܳ;->֫ۙ()V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 8

    .line 109
    invoke-super {p0, p1}, Ll/ܽ֡֫;->onCreate(Landroid/os/Bundle;)V

    .line 110
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "left"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩸ۙܳ;->ܿ᩷:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "right"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩸ۙܳ;->֡᩷:Ljava/lang/String;

    .line 111
    iget-object v1, p0, Ll/᩸ۙܳ;->ܿ᩷:Ljava/lang/String;

    if-eqz v1, :cond_8

    if-nez v0, :cond_0

    goto/16 :goto_4

    .line 112
    :cond_0
    iput-object p1, p0, Ll/᩸ۙܳ;->۟᩷:Landroid/os/Bundle;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    const-string v2, "hex"

    .line 114
    invoke-virtual {p1, v2, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, Ll/᩸ۙܳ;->ۛ᩷:Z

    const-string v2, "keyboardEnabled"

    .line 115
    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, Ll/᩸ۙܳ;->ܰ᩷:Z

    const-string v2, "undoRedo"

    .line 116
    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, Ll/᩸ۙܳ;->ܳۤ:Z

    :cond_1
    const v2, 0x7f0d002a

    .line 118
    invoke-virtual {p0, v2}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    const v2, 0x7f0a068a

    .line 119
    invoke-virtual {p0, v2}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/ܶ᩹;

    .line 120
    invoke-virtual {p0, v2}, Ll/ܽ֡֫;->ۙ(Ll/ܶ᩹;)V

    const-string v3, ""

    .line 121
    invoke-virtual {p0, v3}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 122
    invoke-virtual {p0}, Ll/ܽ֡֫;->ܰ()V

    const-string v3, "M 13.928 11 C 13.460 11 8.065 11 7.842 11 L 13.4 5.4 L 12 4 L 4 12 L 12 20 L 13.4 18.6 L 7.789 13 C 8.036 13 13.424 13 13.939 13 C 14.454 13 19 13 20.011 13 L 20.009 11 C 19 11 14.368 11 13.928 11 Z"

    .line 125
    invoke-static {v3}, Ll/᩻ᩳ;->ۙ(Ljava/lang/String;)[Ll/ۧᩳ;

    move-result-object v3

    const-string v4, "M 12.5 8 C 9.85 8 7.45 8.99 5.6 10.6 L 3.4 8.4 L 2 7 L 2 16 L 9 16 L 11 16 L 7.38 12.38 C 8.77 11.22 10.54 10.5 12.5 10.5 C 16.04 10.5 19.05 12.81 20.1 16 L 22.47 15.22 C 21.08 11.03 17.15 8 12.5 8 Z"

    .line 126
    invoke-static {v4}, Ll/᩻ᩳ;->ۙ(Ljava/lang/String;)[Ll/ۧᩳ;

    move-result-object v4

    .line 127
    invoke-static {v3}, Ll/᩻ᩳ;->ۙ([Ll/ۧᩳ;)[Ll/ۧᩳ;

    move-result-object v5

    .line 128
    invoke-static {v4}, Ll/᩻ᩳ;->ۙ([Ll/ۧᩳ;)[Ll/ۧᩳ;

    move-result-object v6

    .line 129
    invoke-static {v5}, Ll/ۜܺۤ;->ۙ([Ll/ۧᩳ;)V

    .line 130
    invoke-static {v6}, Ll/ۜܺۤ;->ۙ([Ll/ۧᩳ;)V

    .line 131
    new-instance v7, Ll/۠ܺۤ;

    invoke-direct {v7, v3, v4}, Ll/۠ܺۤ;-><init>([Ll/ۧᩳ;[Ll/ۧᩳ;)V

    iput-object v7, p0, Ll/᩸ۙܳ;->᩸᩷:Ll/۠ܺۤ;

    .line 132
    invoke-virtual {v7}, Ll/۠ܺۤ;->᩷()V

    .line 133
    new-instance v3, Ll/۠ܺۤ;

    invoke-direct {v3, v5, v6}, Ll/۠ܺۤ;-><init>([Ll/ۧᩳ;[Ll/ۧᩳ;)V

    iput-object v3, p0, Ll/᩸ۙܳ;->ᩴ᩷:Ll/۠ܺۤ;

    .line 134
    invoke-virtual {v3}, Ll/۠ܺۤ;->᩷()V

    const v3, 0x7f0801e6

    .line 135
    invoke-virtual {v2, v3}, Ll/ܶ᩹;->setNavigationIcon(I)V

    const v3, 0x7f120bcc

    .line 136
    invoke-virtual {v2, v3}, Ll/ܶ᩹;->setNavigationContentDescription(I)V

    .line 137
    new-instance v3, Ll/᩻۬ᩴ;

    invoke-direct {v3, p0}, Ll/᩻۬ᩴ;-><init>(Ll/᩸ۙܳ;)V

    invoke-virtual {v2, v3}, Ll/ܶ᩹;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f0a00d8

    .line 143
    invoke-virtual {p0, v2}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Ll/᩸ۙܳ;->ܶ᩷:Landroid/widget/TextView;

    const v2, 0x7f0a068f

    .line 144
    invoke-virtual {p0, v2}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v2

    new-instance v3, Ll/ܶ۬ᩴ;

    invoke-direct {v3, p0}, Ll/ܶ۬ᩴ;-><init>(Ll/᩸ۙܳ;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f0a026e

    .line 145
    invoke-virtual {p0, v2}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Ll/᩸ۙܳ;->᩺᩷:Landroid/widget/TextView;

    const v2, 0x7f0a026f

    .line 146
    invoke-virtual {p0, v2}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    .line 147
    new-instance v3, Ll/ܿۙܳ;

    invoke-direct {v3, p0}, Ll/ܿۙܳ;-><init>(Ll/᩸ۙܳ;)V

    iput-object v3, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    const-string v4, "hctb"

    if-nez p1, :cond_2

    .line 148
    sget-object v5, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {v5, v4, v1}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    goto :goto_0

    .line 149
    :cond_2
    sget-object v5, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {v5, v4, v1}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    const-string v5, "topBottom"

    invoke-virtual {p1, v5, v4}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    .line 148
    :goto_0
    invoke-virtual {v3, v4}, Ll/ܿۙܳ;->ܳ(Z)V

    .line 151
    iget-object v3, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v5, -0x1

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-direct {v4, v5, v1, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v2, v3, v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 152
    iget-object v2, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v2, p0}, Ll/ܿۙܳ;->ۙ(Ll/᩸ۙܳ;)V

    .line 153
    invoke-direct {p0}, Ll/᩸ۙܳ;->۫ۙ()V

    .line 154
    invoke-static {p0}, Ll/ۜ᩸ܳ;->ۙ(Ll/᩹ۤܳ;)Ll/ۜ᩸ܳ;

    move-result-object v2

    iput-object v2, p0, Ll/᩸ۙܳ;->۠᩷:Ll/ۜ᩸ܳ;

    .line 155
    invoke-virtual {v2, v1}, Ll/ۜ᩸ܳ;->ۙ(Z)V

    const/16 v2, 0x10

    new-array v3, v2, [I

    .line 218
    fill-array-data v3, :array_0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v2, :cond_3

    .line 223
    aget v5, v3, v4

    invoke-virtual {p0, v5}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 204
    iget-object v7, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v7}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v7

    .line 224
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    sget-object v7, Ll/ۙ᩷ܳ;->᩷ۙ:Landroid/graphics/Typeface;

    .line 224
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 225
    new-instance v7, Ll/ۘ۬ᩴ;

    invoke-direct {v7, p0, v4}, Ll/ۘ۬ᩴ;-><init>(Ll/᩸ۙܳ;I)V

    invoke-virtual {v5, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    const v2, 0x7f0a0183

    .line 227
    invoke-virtual {p0, v2}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v3

    new-instance v4, Ll/ܿ۠֫;

    const/4 v5, 0x5

    invoke-direct {v4, v5, p0}, Ll/ܿ۠֫;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v3, 0x7f0a0270

    .line 232
    invoke-virtual {p0, v3}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Ll/᩻ۙܳ;

    new-instance v4, Ll/ܿ۬ᩴ;

    invoke-direct {v4, p0}, Ll/ܿ۬ᩴ;-><init>(Ll/᩸ۙܳ;)V

    invoke-virtual {v3, v4}, Ll/᩻ۙܳ;->ۙ(Ll/ۧۙܳ;)V

    .line 242
    invoke-direct {p0}, Ll/᩸ۙܳ;->֫ۙ()V

    .line 243
    invoke-direct {p0}, Ll/᩸ۙܳ;->ۚۙ()V

    const v3, 0x7f0a02d2

    .line 208
    invoke-virtual {p0, v3}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Ll/ܶۙܳ;

    if-eqz p1, :cond_4

    const-string v4, "keyboardShowing"

    .line 158
    invoke-virtual {p1, v4, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x1

    goto :goto_2

    :cond_4
    const/4 p1, 0x0

    :goto_2
    invoke-virtual {v3, p1, v1}, Ll/ܶۙܳ;->ۙ(ZZ)V

    .line 159
    invoke-virtual {p0, v2}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object p1

    iget-boolean v2, p0, Ll/᩸ۙܳ;->ܰ᩷:Z

    if-eqz v2, :cond_5

    goto :goto_3

    :cond_5
    const v6, 0x3e99999a    # 0.3f

    :goto_3
    invoke-virtual {p1, v6}, Landroid/view/View;->setAlpha(F)V

    .line 160
    iget-boolean p1, p0, Ll/᩸ۙܳ;->ܳۤ:Z

    if-eqz p1, :cond_6

    iget-object p1, p0, Ll/᩸ۙܳ;->᩸᩷:Ll/۠ܺۤ;

    invoke-virtual {p1, v1}, Ll/۠ܺۤ;->᩸(I)V

    iget-object p1, p0, Ll/᩸ۙܳ;->ᩴ᩷:Ll/۠ܺۤ;

    invoke-virtual {p1, v1}, Ll/۠ܺۤ;->᩸(I)V

    .line 161
    :cond_6
    new-instance p1, Ll/ᩴۤܳ;

    invoke-direct {p1, p0}, Ll/ᩴۤܳ;-><init>(Ll/᩹ۤܳ;)V

    iput-object p1, p0, Ll/᩸ۙܳ;->ۘ᩷:Ll/ᩴۤܳ;

    const p1, 0x7f0a017b

    .line 162
    invoke-virtual {p0, p1}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/۟᩷ۙ;

    iput-object p1, p0, Ll/᩸ۙܳ;->ۨ᩷:Ll/۟᩷ۙ;

    .line 163
    invoke-virtual {p1, v0}, Ll/۟᩷ۙ;->۫(I)V

    .line 164
    iget-object p1, p0, Ll/᩸ۙܳ;->ۨ᩷:Ll/۟᩷ۙ;

    new-instance v0, Ll/ܰ۬ᩴ;

    invoke-direct {v0, p0}, Ll/ܰ۬ᩴ;-><init>(Ll/᩸ۙܳ;)V

    invoke-virtual {p1, v0}, Ll/۟᩷ۙ;->ۙ(Ll/ۛ᩷ۙ;)V

    .line 189
    invoke-virtual {p0}, Ll/ۚۤ;->getOnBackPressedDispatcher()Ll/ۜۤ;

    move-result-object p1

    new-instance v0, Ll/᩶۬ᩴ;

    invoke-direct {v0, p0}, Ll/᩶۬ᩴ;-><init>(Ll/᩸ۙܳ;)V

    invoke-virtual {p1, p0, v0}, Ll/ۜۤ;->ۙ(Ll/ۤ᩻ۙ;Ll/ۛۤ;)V

    .line 198
    iget-object p1, p0, Ll/᩸ۙܳ;->᩺᩷:Landroid/widget/TextView;

    new-instance v0, Ll/᩹۬ᩴ;

    invoke-direct {v0, p0}, Ll/᩹۬ᩴ;-><init>(Ll/᩸ۙܳ;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 330
    iget-object p1, p0, Ll/᩸ۙܳ;->᩸ۤ:Ll/ۙۙܳ;

    if-eqz p1, :cond_7

    return-void

    .line 331
    :cond_7
    new-instance p1, Ll/ۙۙܳ;

    invoke-direct {p1, p0}, Ll/ۙۙܳ;-><init>(Ll/᩸ۙܳ;)V

    iput-object p1, p0, Ll/᩸ۙܳ;->᩸ۤ:Ll/ۙۙܳ;

    .line 332
    invoke-virtual {p1}, Ll/ۖۙܺ;->۫()V

    .line 333
    invoke-virtual {p0}, Ll/ۘᩴ;->invalidateOptionsMenu()V

    return-void

    .line 111
    :cond_8
    :goto_4
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :array_0
    .array-data 4
        0x7f0a00ad
        0x7f0a00ae
        0x7f0a00af
        0x7f0a00b0
        0x7f0a00b1
        0x7f0a00b2
        0x7f0a00b3
        0x7f0a00b4
        0x7f0a00b5
        0x7f0a00b6
        0x7f0a00b7
        0x7f0a00b9
        0x7f0a00ba
        0x7f0a00bc
        0x7f0a00be
        0x7f0a00c1
    .end array-data
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 347
    invoke-virtual {p0}, Ll/ۘᩴ;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0f000e

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final onDestroy()V
    .locals 2

    .line 595
    iget-object v0, p0, Ll/᩸ۙܳ;->۠᩷:Ll/ۜ᩸ܳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۜ᩸ܳ;->ۙ()V

    .line 596
    :cond_0
    iget-object v0, p0, Ll/᩸ۙܳ;->᩸ۤ:Ll/ۙۙܳ;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iput-boolean v1, v0, Ll/ۙۙܳ;->ܳ:Z

    .line 597
    :cond_1
    iget-object v0, p0, Ll/᩸ۙܳ;->۫ۤ:Ll/ۤۙܳ;

    if-eqz v0, :cond_2

    iput-boolean v1, v0, Ll/ۤۙܳ;->֫:Z

    .line 598
    :cond_2
    iget-object v0, p0, Ll/᩸ۙܳ;->֨᩷:Ll/᩷ۙܳ;

    if-eqz v0, :cond_3

    iget-object v0, v0, Ll/᩷ۙܳ;->۫:Ll/۬᩷ܳ;

    iput-boolean v1, v0, Ll/۬᩷ܳ;->֡:Z

    .line 599
    :cond_3
    iget-object v0, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    if-eqz v0, :cond_4

    .line 600
    iget-object v1, p0, Ll/᩸ۙܳ;->ᩳ᩷:Ll/᩵᩸ܳ;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 601
    iget-object v0, p0, Ll/᩸ۙܳ;->ۖ᩷:Ll/֨ۜᩴ;

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v0}, Ll/ܿۙܳ;->ۧ()V

    invoke-direct {p0}, Ll/᩸ۙܳ;->ᩴۙ()V

    .line 603
    :cond_4
    iget-object v0, p0, Ll/᩸ۙܳ;->᩶᩷:Ll/᩹ۙܳ;

    if-eqz v0, :cond_5

    .line 661
    :try_start_0
    invoke-virtual {v0}, Ll/᩹ۙܳ;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 603
    :cond_5
    :goto_0
    iget-object v0, p0, Ll/᩸ۙܳ;->ۡ᩷:Ll/᩹ۙܳ;

    if-eqz v0, :cond_6

    .line 661
    :try_start_1
    invoke-virtual {v0}, Ll/᩹ۙܳ;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_6
    const/4 v0, 0x0

    .line 603
    iput-object v0, p0, Ll/᩸ۙܳ;->ۡ᩷:Ll/᩹ۙܳ;

    iput-object v0, p0, Ll/᩸ۙܳ;->᩶᩷:Ll/᩹ۙܳ;

    .line 604
    invoke-super {p0}, Ll/ܽ֡֫;->onDestroy()V

    return-void
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 6

    .line 375
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f0a037b

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    .line 376
    invoke-direct {p0}, Ll/᩸ۙܳ;->᩸ۙ()V

    return v2

    :cond_0
    const v1, 0x7f0a03b7

    const v3, 0x7f0a03bb

    const v4, 0x7f0a03ba

    const/4 v5, 0x0

    if-eq v0, v1, :cond_f

    if-eq v0, v4, :cond_f

    if-ne v0, v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const v1, 0x7f0a039e

    const v3, 0x7f0a03d0

    if-eq v0, v1, :cond_d

    if-ne v0, v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const v1, 0x7f0a0386

    if-ne v0, v1, :cond_3

    .line 204
    iget-object p1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {p1}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object p1

    .line 463
    new-instance v0, Ll/᩵۬ᩴ;

    invoke-direct {v0, p1}, Ll/᩵۬ᩴ;-><init>(Ll/ۨ᩷ܳ;)V

    iget-object p1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-static {p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ll/ۨ۬ᩴ;

    invoke-direct {v1, p1}, Ll/ۨ۬ᩴ;-><init>(Ll/ܿۙܳ;)V

    invoke-static {p0, v0, v1}, Ll/۬ۜᩴ;->ۙ(Landroid/content/Context;Ljava/util/function/IntSupplier;Ljava/util/function/IntConsumer;)V

    return v2

    :cond_3
    const v1, 0x7f0a03bd

    if-eq v0, v1, :cond_a

    const v3, 0x7f0a0395

    if-ne v0, v3, :cond_4

    goto :goto_0

    .line 395
    :cond_4
    iget-object v1, p0, Ll/᩸ۙܳ;->ܽ᩷:Ll/۬ۙܳ;

    if-eqz v1, :cond_9

    const v1, 0x7f0a0365

    const v3, 0x7f0a0364

    if-eq v0, v3, :cond_5

    if-ne v0, v1, :cond_9

    .line 396
    :cond_5
    iget-boolean p1, p0, Ll/᩸ۙܳ;->ܳۤ:Z

    if-eqz p1, :cond_7

    if-ne v0, v3, :cond_6

    .line 204
    iget-object p1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {p1}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object p1

    .line 397
    invoke-virtual {p1}, Ll/ۨ᩷ܳ;->ۛ()V

    return v2

    .line 204
    :cond_6
    iget-object p1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {p1}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object p1

    .line 397
    invoke-virtual {p1}, Ll/ۨ᩷ܳ;->ۗ()V

    return v2

    .line 398
    :cond_7
    iget-object p1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    if-ne v0, v1, :cond_8

    const/4 v5, 0x1

    :cond_8
    invoke-virtual {p1, v5}, Ll/ܿۙܳ;->ۙ(Z)V

    return v2

    .line 401
    :cond_9
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_a
    :goto_0
    const p1, 0x800005

    const v3, 0x800003

    if-ne v0, v1, :cond_b

    const v0, 0x800003

    goto :goto_1

    :cond_b
    const v0, 0x800005

    .line 391
    :goto_1
    iget-object v1, p0, Ll/᩸ۙܳ;->ۨ᩷:Ll/۟᩷ۙ;

    if-ne v0, v3, :cond_c

    goto :goto_2

    :cond_c
    const p1, 0x800003

    :goto_2
    invoke-virtual {v1, p1}, Ll/۟᩷ۙ;->ۙ(I)V

    .line 392
    iget-object p1, p0, Ll/᩸ۙܳ;->ۨ᩷:Ll/۟᩷ۙ;

    invoke-virtual {p1, v0}, Ll/۟᩷ۙ;->ܳ(I)V

    return v2

    .line 381
    :cond_d
    :goto_3
    invoke-interface {p1, v2}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 382
    iget-object p1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    if-ne v0, v3, :cond_e

    const/4 v5, 0x1

    :cond_e
    invoke-virtual {p1, v5}, Ll/ܿۙܳ;->ܳ(Z)V

    .line 383
    sget-object p1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {p1}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object p1

    iget-object v0, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v0}, Ll/ܿۙܳ;->ۚ()Z

    move-result v0

    const-string v1, "hctb"

    invoke-interface {p1, v1, v0}, Ll/ᩳ֫ܺ;->putBoolean(Ljava/lang/String;Z)Ll/ᩳ֫ܺ;

    move-result-object p1

    invoke-interface {p1}, Ll/ᩳ֫ܺ;->apply()V

    .line 384
    invoke-direct {p0}, Ll/᩸ۙܳ;->۫ۙ()V

    .line 385
    invoke-virtual {p0}, Ll/ۘᩴ;->invalidateOptionsMenu()V

    return v2

    :cond_f
    :goto_4
    if-eq v0, v3, :cond_10

    const/4 p1, 0x1

    goto :goto_5

    :cond_10
    const/4 p1, 0x0

    :goto_5
    if-eq v0, v4, :cond_11

    const/4 v5, 0x1

    .line 378
    :cond_11
    new-instance v0, Ll/ۗ۬ᩴ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1, v5, v0}, Ll/᩸ۙܳ;->ۙ(ZZLjava/lang/Runnable;)V

    return v2
.end method

.method public final onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 8

    .line 352
    iget-object v0, p0, Ll/᩸ۙܳ;->ܽ᩷:Ll/۬ۙܳ;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩸ۙܳ;->᩸ۤ:Ll/ۙۙܳ;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/᩸ۙܳ;->ۜ᩷:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 353
    :goto_0
    iget-object v3, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v3}, Ll/ܿۙܳ;->ۚ()Z

    move-result v3

    if-eqz v3, :cond_1

    const v3, 0x7f0a03d0

    goto :goto_1

    :cond_1
    const v3, 0x7f0a039e

    :goto_1
    invoke-interface {p1, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v3

    invoke-interface {v3, v2}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    const v3, 0x7f0a0364

    .line 354
    invoke-interface {p1, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v3

    const v4, 0x7f0a0365

    invoke-interface {p1, v4}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v4

    .line 355
    iget-boolean v5, p0, Ll/᩸ۙܳ;->ܳۤ:Z

    if-eqz v5, :cond_2

    const v5, 0x7f120790

    goto :goto_2

    :cond_2
    const v5, 0x7f12095d

    :goto_2
    invoke-interface {v3, v5}, Landroid/view/MenuItem;->setTitle(I)Landroid/view/MenuItem;

    .line 356
    iget-boolean v5, p0, Ll/᩸ۙܳ;->ܳۤ:Z

    if-eqz v5, :cond_3

    const v5, 0x7f12078f

    goto :goto_3

    :cond_3
    const v5, 0x7f120899

    :goto_3
    invoke-interface {v4, v5}, Landroid/view/MenuItem;->setTitle(I)Landroid/view/MenuItem;

    .line 357
    iget-object v5, p0, Ll/᩸ۙܳ;->᩸᩷:Ll/۠ܺۤ;

    sget-object v6, Ll/ۗۡ֫;->֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v6}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v6

    invoke-virtual {v5, v6}, Ll/۠ܺۤ;->ۙ(I)V

    .line 358
    iget-object v5, p0, Ll/᩸ۙܳ;->ᩴ᩷:Ll/۠ܺۤ;

    sget-object v6, Ll/ۗۡ֫;->֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v6}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v6

    invoke-virtual {v5, v6}, Ll/۠ܺۤ;->ۙ(I)V

    .line 359
    iget-object v5, p0, Ll/᩸ۙܳ;->᩸᩷:Ll/۠ܺۤ;

    const v6, 0x3ee66666    # 0.45f

    if-eqz v0, :cond_4

    .line 204
    iget-object v7, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v7}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v7

    .line 1444
    iget-object v7, v7, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v7}, Ll/ۚ᩷ܳ;->᩷()Z

    move-result v7

    if-eqz v7, :cond_4

    const/high16 v7, 0x3f800000    # 1.0f

    goto :goto_4

    :cond_4
    const v7, 0x3ee66666    # 0.45f

    .line 359
    :goto_4
    invoke-virtual {v5, v7}, Ll/۠ܺۤ;->ۙ(F)V

    .line 360
    iget-object v5, p0, Ll/᩸ۙܳ;->ᩴ᩷:Ll/۠ܺۤ;

    if-eqz v0, :cond_5

    .line 204
    iget-object v7, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v7}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v7

    .line 1448
    iget-object v7, v7, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v7}, Ll/ۚ᩷ܳ;->ۙ()Z

    move-result v7

    if-eqz v7, :cond_5

    const/high16 v6, 0x3f800000    # 1.0f

    .line 360
    :cond_5
    invoke-virtual {v5, v6}, Ll/۠ܺۤ;->ۙ(F)V

    .line 361
    iget-object v5, p0, Ll/᩸ۙܳ;->᩸᩷:Ll/۠ܺۤ;

    invoke-interface {v3, v5}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    iget-object v5, p0, Ll/᩸ۙܳ;->ᩴ᩷:Ll/۠ܺۤ;

    invoke-interface {v4, v5}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    if-eqz v0, :cond_7

    .line 362
    iget-boolean v5, p0, Ll/᩸ۙܳ;->ܳۤ:Z

    if-eqz v5, :cond_6

    iget-object v5, p0, Ll/᩸ۙܳ;->ۖ᩷:Ll/֨ۜᩴ;

    if-nez v5, :cond_7

    .line 204
    iget-object v5, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v5}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v5

    .line 1444
    iget-object v5, v5, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v5}, Ll/ۚ᩷ܳ;->᩷()Z

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_5

    .line 362
    :cond_6
    iget-object v5, p0, Ll/᩸ۙܳ;->ܽ᩷:Ll/۬ۙܳ;

    iget-object v5, v5, Ll/۬ۙܳ;->᩷:Ll/ۢۙܳ;

    iget v5, v5, Ll/ۢۙܳ;->ܰ:I

    if-lez v5, :cond_7

    :goto_5
    const/4 v5, 0x1

    goto :goto_6

    :cond_7
    const/4 v5, 0x0

    :goto_6
    invoke-interface {v3, v5}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    if-eqz v0, :cond_9

    .line 363
    iget-boolean v3, p0, Ll/᩸ۙܳ;->ܳۤ:Z

    if-eqz v3, :cond_8

    iget-object v3, p0, Ll/᩸ۙܳ;->ۖ᩷:Ll/֨ۜᩴ;

    if-nez v3, :cond_9

    .line 204
    iget-object v3, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v3}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v3

    .line 1448
    iget-object v3, v3, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v3}, Ll/ۚ᩷ܳ;->ۙ()Z

    move-result v3

    if-eqz v3, :cond_9

    goto :goto_7

    .line 363
    :cond_8
    iget-object v3, p0, Ll/᩸ۙܳ;->ܽ᩷:Ll/۬ۙܳ;

    iget-object v3, v3, Ll/۬ۙܳ;->᩷:Ll/ۢۙܳ;

    iget v3, v3, Ll/ۢۙܳ;->ܰ:I

    if-lez v3, :cond_9

    :goto_7
    const/4 v3, 0x1

    goto :goto_8

    :cond_9
    const/4 v3, 0x0

    :goto_8
    invoke-interface {v4, v3}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    if-eqz v0, :cond_a

    .line 364
    iget-object v3, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v3, v2}, Ll/ܿۙܳ;->ۤ(Z)Ll/ۨ᩷ܳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۨ᩷ܳ;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_a

    const/4 v2, 0x1

    goto :goto_9

    :cond_a
    const/4 v2, 0x0

    :goto_9
    if-eqz v0, :cond_b

    iget-object v3, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v3, v1}, Ll/ܿۙܳ;->ۤ(Z)Ll/ۨ᩷ܳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۨ᩷ܳ;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_b

    const/4 v3, 0x1

    goto :goto_a

    :cond_b
    const/4 v3, 0x0

    :goto_a
    const v4, 0x7f0a03b6

    .line 365
    invoke-interface {p1, v4}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v4

    iget-object v5, p0, Ll/᩸ۙܳ;->ۖ᩷:Ll/֨ۜᩴ;

    if-nez v5, :cond_d

    if-nez v2, :cond_c

    if-eqz v3, :cond_d

    :cond_c
    const/4 v5, 0x1

    goto :goto_b

    :cond_d
    const/4 v5, 0x0

    :goto_b
    invoke-interface {v4, v5}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const v4, 0x7f0a03ba

    .line 366
    invoke-interface {p1, v4}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v4

    iget-object v5, p0, Ll/᩸ۙܳ;->ۖ᩷:Ll/֨ۜᩴ;

    if-nez v5, :cond_e

    if-eqz v2, :cond_e

    const/4 v2, 0x1

    goto :goto_c

    :cond_e
    const/4 v2, 0x0

    :goto_c
    invoke-interface {v4, v2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const v2, 0x7f0a03bb

    .line 367
    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    iget-object v4, p0, Ll/᩸ۙܳ;->ۖ᩷:Ll/֨ۜᩴ;

    if-nez v4, :cond_f

    if-eqz v3, :cond_f

    const/4 v3, 0x1

    goto :goto_d

    :cond_f
    const/4 v3, 0x0

    :goto_d
    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const v2, 0x7f0a0386

    .line 368
    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    if-eqz v0, :cond_10

    iget-object v3, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    .line 248
    invoke-virtual {v3}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v3

    .line 1234
    iget-object v3, v3, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v3}, Ll/ۚ᩷ܳ;->᩸()I

    move-result v3

    if-lez v3, :cond_10

    const/4 v1, 0x1

    .line 368
    :cond_10
    invoke-interface {v2, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const v1, 0x7f0a03bd

    .line 369
    invoke-interface {p1, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    invoke-interface {v1, v0}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const v1, 0x7f0a0395

    .line 370
    invoke-interface {p1, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    invoke-interface {v1, v0}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 371
    invoke-super {p0, p1}, Landroid/app/Activity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public final onResume()V
    .locals 1

    .line 337
    invoke-super {p0}, Ll/ܽ֡֫;->onResume()V

    const/4 v0, 0x0

    .line 338
    iput-boolean v0, p0, Ll/᩸ۙܳ;->ۧ᩷:Z

    .line 340
    iget-object v0, p0, Ll/᩸ۙܳ;->ܽ᩷:Ll/۬ۙܳ;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩸ۙܳ;->᩸ۤ:Ll/ۙۙܳ;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩸ۙܳ;->۫ۤ:Ll/ۤۙܳ;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩸ۙܳ;->ۖ᩷:Ll/֨ۜᩴ;

    if-nez v0, :cond_0

    .line 341
    new-instance v0, Ll/ۤۙܳ;

    invoke-direct {v0, p0}, Ll/ۤۙܳ;-><init>(Ll/᩸ۙܳ;)V

    iput-object v0, p0, Ll/᩸ۙܳ;->۫ۤ:Ll/ۤۙܳ;

    .line 342
    invoke-virtual {v0}, Ll/ۖۙܺ;->۫()V

    :cond_0
    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 11

    .line 559
    iget-object v0, p0, Ll/᩸ۙܳ;->۠᩷:Ll/ۜ᩸ܳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۜ᩸ܳ;->ۙ()V

    .line 560
    :cond_0
    iget-object v0, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Ll/ܿۙܳ;->ۤ(Z)Ll/ۨ᩷ܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->᩸()Z

    iget-object v0, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Ll/ܿۙܳ;->ۤ(Z)Ll/ۨ᩷ܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->᩸()Z

    .line 561
    iget-object v0, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v0, v3}, Ll/ܿۙܳ;->ۤ(Z)Ll/ۨ᩷ܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->ᩴ()V

    iget-object v0, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v0, v4}, Ll/ܿۙܳ;->ۤ(Z)Ll/ۨ᩷ܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->ᩴ()V

    .line 609
    iput-boolean v4, p0, Ll/᩸ۙܳ;->ۧ᩷:Z

    .line 610
    iget-object v0, p0, Ll/᩸ۙܳ;->ܽ᩷:Ll/۬ۙܳ;

    if-nez v0, :cond_1

    .line 611
    iget-object v0, p0, Ll/᩸ۙܳ;->۟᩷:Landroid/os/Bundle;

    if-eqz v0, :cond_6

    const-string v1, "checkpoint"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "checkpoint"

    .line 612
    iget-object v1, p0, Ll/᩸ۙܳ;->۟᩷:Landroid/os/Bundle;

    const-string v2, "checkpoint"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iput-boolean v3, p0, Ll/᩸ۙܳ;->ۧ᩷:Z

    goto/16 :goto_1

    .line 617
    :cond_1
    :try_start_0
    iget-object v0, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v0}, Ll/ܿۙܳ;->ܳ()Ll/ۙۤܳ;

    move-result-object v5

    move-object v0, v5

    .line 618
    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v1, v5, Ll/ۙۤܳ;->ܿ:Ll/ᩳܳܳ;

    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    iget-object v2, v5, Ll/ۙۤܳ;->֨:Ll/ᩳܳܳ;

    monitor-enter v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 619
    :try_start_3
    iget-object v6, p0, Ll/᩸ۙܳ;->ۖ᩷:Ll/֨ۜᩴ;

    if-nez v6, :cond_2

    iget-object v6, p0, Ll/᩸ۙܳ;->᩻᩷:Ll/ܶۤܳ;

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Ll/ܶۤܳ;->ۚ()Z

    move-result v6

    if-eqz v6, :cond_2

    iget-object v6, p0, Ll/᩸ۙܳ;->ܳ᩷:Ll/۬ۙܳ;

    .line 620
    invoke-virtual {v5}, Ll/ۙۤܳ;->᩷()Ll/۬ۙܳ;

    move-result-object v7

    if-ne v6, v7, :cond_2

    iget-wide v6, p0, Ll/᩸ۙܳ;->ۚ᩷:J

    iget-object v8, v5, Ll/ۙۤܳ;->ܿ:Ll/ᩳܳܳ;

    .line 621
    invoke-virtual {v8}, Ll/ᩳܳܳ;->ܽ()J

    move-result-wide v8

    cmp-long v10, v6, v8

    if-nez v10, :cond_2

    iget-wide v6, p0, Ll/᩸ۙܳ;->֫᩷:J

    iget-object v5, v5, Ll/ۙۤܳ;->֨:Ll/ᩳܳܳ;

    invoke-virtual {v5}, Ll/ᩳܳܳ;->ܽ()J

    move-result-wide v8

    cmp-long v5, v6, v8

    if-nez v5, :cond_2

    const-string v5, "checkpoint"

    .line 622
    iget-object v6, p0, Ll/᩸ۙܳ;->᩻᩷:Ll/ܶۤܳ;

    invoke-virtual {v6}, Ll/ܶۤܳ;->ᩴ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v5, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iput-boolean v3, p0, Ll/᩸ۙܳ;->ۧ᩷:Z

    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_1

    .line 624
    :cond_2
    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :try_start_8
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 625
    :try_start_9
    iget-object v0, p0, Ll/᩸ۙܳ;->᩻᩷:Ll/ܶۤܳ;

    if-nez v0, :cond_3

    invoke-static {}, Ll/ܶۤܳ;->ܽ()Ll/ܶۤܳ;

    move-result-object v0

    iput-object v0, p0, Ll/᩸ۙܳ;->᩻᩷:Ll/ܶۤܳ;

    .line 626
    :cond_3
    iget-object v0, p0, Ll/᩸ۙܳ;->᩻᩷:Ll/ܶۤܳ;

    invoke-virtual {v0}, Ll/ܶۤܳ;->ۙ()Ll/ܺۤܳ;

    move-result-object v0

    .line 627
    iget-object v1, p0, Ll/᩸ۙܳ;->ۖ᩷:Ll/֨ۜᩴ;

    if-eqz v1, :cond_4

    iput-object v0, p0, Ll/᩸ۙܳ;->᩹᩷:Ll/ܺۤܳ;

    goto :goto_0

    .line 628
    :cond_4
    invoke-direct {p0, v0}, Ll/᩸ۙܳ;->ۙ(Ll/ܺۤܳ;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_1

    :cond_5
    :goto_0
    const-string v0, "checkpoint"

    .line 629
    iget-object v1, p0, Ll/᩸ۙܳ;->᩻᩷:Ll/ܶۤܳ;

    invoke-virtual {v1}, Ll/ܶۤܳ;->ᩴ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iput-boolean v3, p0, Ll/᩸ۙܳ;->ۧ᩷:Z
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_0

    goto :goto_1

    :catchall_0
    move-exception v5

    .line 624
    :try_start_a
    monitor-exit v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :try_start_b
    throw v5

    :catchall_1
    move-exception v2

    monitor-exit v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    :try_start_c
    throw v2

    :catchall_2
    move-exception v1

    monitor-exit v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    :try_start_d
    throw v1
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_d .. :try_end_d} :catch_0

    :catch_0
    nop

    .line 563
    :cond_6
    :goto_1
    invoke-super {p0, p1}, Ll/ۚۤ;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "keyboardEnabled"

    .line 564
    iget-boolean v1, p0, Ll/᩸ۙܳ;->ܰ᩷:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "keyboardShowing"

    const v1, 0x7f0a02d2

    .line 208
    invoke-virtual {p0, v1}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/ܶۙܳ;

    .line 565
    invoke-virtual {v1}, Ll/ܶۙܳ;->᩷()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "undoRedo"

    .line 566
    iget-boolean v1, p0, Ll/᩸ۙܳ;->ܳۤ:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "hex"

    .line 567
    iget-boolean v1, p0, Ll/᩸ۙܳ;->ۛ᩷:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "topBottom"

    .line 568
    iget-object v1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v1}, Ll/ܿۙܳ;->ۚ()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 569
    iget-object v0, p0, Ll/᩸ۙܳ;->ܽ᩷:Ll/۬ۙܳ;

    if-eqz v0, :cond_7

    const-string v0, "leftFocused"

    .line 570
    iget-object v1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v1}, Ll/ܿۙܳ;->۫()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "selected1"

    .line 571
    iget-object v1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v1, v3}, Ll/ܿۙܳ;->ᩴ(Z)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "selected2"

    iget-object v1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v1, v4}, Ll/ܿۙܳ;->ᩴ(Z)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "end1"

    .line 572
    iget-object v1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v1, v3}, Ll/ܿۙܳ;->᩸(Z)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "end2"

    iget-object v1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v1, v4}, Ll/ܿۙܳ;->᩸(Z)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "multi1"

    .line 573
    iget-object v1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v1, v3}, Ll/ܿۙܳ;->᩷(Z)Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "multi2"

    iget-object v1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v1, v4}, Ll/ܿۙܳ;->᩷(Z)Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "nibble1"

    .line 574
    iget-object v1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v1, v3}, Ll/ܿۙܳ;->ۤ(Z)Ll/ۨ᩷ܳ;

    move-result-object v1

    iget-object v1, v1, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->᩻()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "nibble2"

    .line 575
    iget-object v1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v1, v4}, Ll/ܿۙܳ;->ۤ(Z)Ll/ۨ᩷ܳ;

    move-result-object v1

    iget-object v1, v1, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->᩻()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "cursorSlot"

    .line 576
    iget-object v1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v1}, Ll/ܿۙܳ;->᩷()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "cursorNibble"

    .line 577
    iget-object v1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v1}, Ll/ܿۙܳ;->ۙ()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "top"

    .line 578
    iget-object v1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v1}, Ll/ܿۙܳ;->ܺ()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    goto/16 :goto_2

    .line 579
    :cond_7
    iget-object v0, p0, Ll/᩸ۙܳ;->۟᩷:Landroid/os/Bundle;

    if-eqz v0, :cond_8

    const-string v1, "leftFocused"

    const-string v2, "leftFocused"

    .line 581
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "selected1"

    .line 582
    iget-object v1, p0, Ll/᩸ۙܳ;->۟᩷:Landroid/os/Bundle;

    const-string v2, "selected1"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "selected2"

    iget-object v1, p0, Ll/᩸ۙܳ;->۟᩷:Landroid/os/Bundle;

    const-string v2, "selected2"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "end1"

    .line 583
    iget-object v1, p0, Ll/᩸ۙܳ;->۟᩷:Landroid/os/Bundle;

    const-string v2, "end1"

    const-string v4, "selected1"

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v1, v2, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "end2"

    .line 584
    iget-object v1, p0, Ll/᩸ۙܳ;->۟᩷:Landroid/os/Bundle;

    const-string v2, "end2"

    const-string v4, "selected2"

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v1, v2, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "multi1"

    .line 585
    iget-object v1, p0, Ll/᩸ۙܳ;->۟᩷:Landroid/os/Bundle;

    const-string v2, "multi1"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "multi2"

    iget-object v1, p0, Ll/᩸ۙܳ;->۟᩷:Landroid/os/Bundle;

    const-string v2, "multi2"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "nibble1"

    .line 586
    iget-object v1, p0, Ll/᩸ۙܳ;->۟᩷:Landroid/os/Bundle;

    const-string v2, "nibble1"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "nibble2"

    .line 587
    iget-object v1, p0, Ll/᩸ۙܳ;->۟᩷:Landroid/os/Bundle;

    const-string v2, "nibble2"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "cursorSlot"

    .line 588
    iget-object v1, p0, Ll/᩸ۙܳ;->۟᩷:Landroid/os/Bundle;

    const-string v2, "cursorSlot"

    const-wide/16 v4, -0x1

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "cursorNibble"

    .line 589
    iget-object v1, p0, Ll/᩸ۙܳ;->۟᩷:Landroid/os/Bundle;

    const-string v2, "cursorNibble"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "top"

    .line 590
    iget-object v1, p0, Ll/᩸ۙܳ;->۟᩷:Landroid/os/Bundle;

    const-string v2, "top"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_8
    :goto_2
    return-void
.end method

.method public final ֫()V
    .locals 3

    const v0, 0x7f0a02d2

    .line 208
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ܶۙܳ;

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 211
    invoke-virtual {v0, v2, v1}, Ll/ܶۙܳ;->ۙ(ZZ)V

    .line 204
    iget-object v0, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v0

    .line 212
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    const-string v0, "input_method"

    .line 213
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    if-eqz v0, :cond_0

    .line 214
    iget-object v1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    :cond_0
    return-void
.end method

.method public final ۙ(Ljava/io/IOException;)V
    .locals 3

    .line 437
    iget-boolean v0, p0, Ll/᩸ۙܳ;->ۜ᩷:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 438
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    .line 439
    iput-boolean v0, p0, Ll/᩸ۙܳ;->ۜ᩷:Z

    .line 440
    iget-object v1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v1, v0}, Ll/ܿۙܳ;->ۤ(Z)Ll/ۨ᩷ܳ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ۨ᩷ܳ;->᩷(Z)V

    iget-object v1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ll/ܿۙܳ;->ۤ(Z)Ll/ۨ᩷ܳ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ۨ᩷ܳ;->᩷(Z)V

    .line 441
    invoke-direct {p0}, Ll/᩸ۙܳ;->ۚۙ()V

    .line 442
    instance-of v0, p1, Ll/۫ۚܳ;

    if-eqz v0, :cond_1

    const p1, 0x7f120453

    .line 531
    invoke-virtual {p0, p1, v2}, Ll/ܽ֡֫;->ۙ(IZ)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 546
    invoke-virtual {p0, p1, v0}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    .line 444
    :goto_0
    invoke-virtual {p0}, Ll/ۘᩴ;->invalidateOptionsMenu()V

    :cond_2
    :goto_1
    return-void
.end method

.method public final ۙ(Ll/۬ۙܳ;)V
    .locals 3

    .line 286
    iput-object p1, p0, Ll/᩸ۙܳ;->ܽ᩷:Ll/۬ۙܳ;

    .line 287
    iget-object p1, p0, Ll/᩸ۙܳ;->֨᩷:Ll/᩷ۙܳ;

    if-eqz p1, :cond_0

    iget-object p1, p1, Ll/᩷ۙܳ;->۫:Ll/۬᩷ܳ;

    const/4 v0, 0x1

    iput-boolean v0, p1, Ll/۬᩷ܳ;->֡:Z

    .line 288
    :cond_0
    iget-object p1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    iget-object v0, p0, Ll/᩸ۙܳ;->ᩳ᩷:Ll/᩵᩸ܳ;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 289
    iget-object p1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    iget-object v0, p0, Ll/᩸ۙܳ;->ᩳ᩷:Ll/᩵᩸ܳ;

    const-wide/16 v1, 0x28

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 290
    invoke-virtual {p0}, Ll/ۘᩴ;->invalidateOptionsMenu()V

    return-void
.end method

.method public final ۙ(Z)V
    .locals 1

    .line 325
    iget-object v0, p0, Ll/᩸ۙܳ;->ۨ᩷:Ll/۟᩷ۙ;

    if-eqz v0, :cond_2

    if-nez p1, :cond_1

    iget-object p1, p0, Ll/᩸ۙܳ;->ܽ᩷:Ll/۬ۙܳ;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-virtual {v0, p1}, Ll/۟᩷ۙ;->۫(I)V

    :cond_2
    return-void
.end method

.method public final ۤ()Ll/ܽ֡֫;
    .locals 0

    return-object p0
.end method

.method public final ܳ()V
    .locals 2

    .line 269
    invoke-direct {p0}, Ll/᩸ۙܳ;->ۚۙ()V

    .line 270
    iget-boolean v0, p0, Ll/᩸ۙܳ;->ܰ᩷:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Ll/᩸ۙܳ;->ۤۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f0a02d2

    .line 208
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ܶۙܳ;

    const/4 v1, 0x1

    .line 270
    invoke-virtual {v0, v1, v1}, Ll/ܶۙܳ;->ۙ(ZZ)V

    :cond_0
    return-void
.end method

.method public final ܺ()Z
    .locals 1

    .line 206
    iget-object v0, p0, Ll/᩸ۙܳ;->ܽ᩷:Ll/۬ۙܳ;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩸ۙܳ;->ۖ᩷:Ll/֨ۜᩴ;

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/᩸ۙܳ;->ۜ᩷:Z

    if-nez v0, :cond_1

    .line 204
    iget-object v0, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v0

    .line 206
    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩶()Ljava/lang/String;
    .locals 1

    const-string v0, "HexCompare"

    return-object v0
.end method

.method public final ᩷(J)V
    .locals 3

    .line 278
    iget-wide v0, p0, Ll/᩸ۙܳ;->ۢ᩷:J

    cmp-long v2, v0, p1

    if-eqz v2, :cond_2

    iget-object v0, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v0}, Ll/ܿۙܳ;->ܳ()Ll/ۙۤܳ;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 279
    :cond_0
    iput-wide p1, p0, Ll/᩸ۙܳ;->ۢ᩷:J

    .line 280
    iget-object v0, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v0}, Ll/ܿۙܳ;->ܳ()Ll/ۙۤܳ;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ll/ۙۤܳ;->᩷(J)V

    .line 281
    iget-object p1, p0, Ll/᩸ۙܳ;->֨᩷:Ll/᩷ۙܳ;

    if-eqz p1, :cond_1

    iget-object p1, p1, Ll/᩷ۙܳ;->۫:Ll/۬᩷ܳ;

    const/4 p2, 0x1

    iput-boolean p2, p1, Ll/۬᩷ܳ;->֡:Z

    .line 282
    :cond_1
    iget-object p1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    iget-object p2, p0, Ll/᩸ۙܳ;->ᩳ᩷:Ll/᩵᩸ܳ;

    invoke-virtual {p1, p2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object p1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    iget-object p2, p0, Ll/᩸ۙܳ;->ᩳ᩷:Ll/᩵᩸ܳ;

    const-wide/16 v0, 0x28

    invoke-virtual {p1, p2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_2
    :goto_0
    return-void
.end method

.method public final ᩷ۙ()V
    .locals 12

    .line 405
    invoke-direct {p0}, Ll/᩸ۙܳ;->ۚۙ()V

    .line 406
    iget-object v0, p0, Ll/᩸ۙܳ;->ܽ᩷:Ll/۬ۙܳ;

    if-eqz v0, :cond_d

    iget-boolean v0, p0, Ll/᩸ۙܳ;->ۜ᩷:Z

    if-eqz v0, :cond_0

    goto/16 :goto_8

    .line 204
    :cond_0
    iget-object v0, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v0

    .line 1230
    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 407
    invoke-virtual {p0}, Ll/᩸ۙܳ;->֫()V

    .line 408
    :cond_1
    invoke-direct {p0}, Ll/᩸ۙܳ;->۫ۙ()V

    .line 409
    iget-object v0, p0, Ll/᩸ۙܳ;->۠᩷:Ll/ۜ᩸ܳ;

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/᩸ۙܳ;->ᩴۤ:Ll/ۨ᩷ܳ;

    .line 204
    iget-object v1, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v1}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v1

    if-eq v0, v1, :cond_2

    .line 411
    iget-object v0, p0, Ll/᩸ۙܳ;->۠᩷:Ll/ۜ᩸ܳ;

    invoke-virtual {v0}, Ll/ۜ᩸ܳ;->ۙ()V

    .line 204
    iget-object v0, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v0

    .line 412
    iput-object v0, p0, Ll/᩸ۙܳ;->ᩴۤ:Ll/ۨ᩷ܳ;

    .line 414
    :cond_2
    iget-object v0, p0, Ll/᩸ۙܳ;->ۘ᩷:Ll/ᩴۤܳ;

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/᩸ۙܳ;->ۨ᩷:Ll/۟᩷ۙ;

    const v1, 0x800005

    invoke-virtual {v0, v1}, Ll/۟᩷ۙ;->ᩴ(I)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/᩸ۙܳ;->ۘ᩷:Ll/ᩴۤܳ;

    invoke-virtual {v0}, Ll/ᩴۤܳ;->ۙ()V

    .line 415
    :cond_3
    invoke-virtual {p0}, Ll/ۘᩴ;->invalidateOptionsMenu()V

    .line 416
    iget-object v0, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v0}, Ll/ܿۙܳ;->ۤ()I

    move-result v0

    .line 417
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    iget-object v2, p0, Ll/᩸ۙܳ;->ܽ᩷:Ll/۬ۙܳ;

    iget-object v3, v2, Ll/۬ۙܳ;->᩷:Ll/ۢۙܳ;

    iget v3, v3, Ll/ۢۙܳ;->ܰ:I

    iget-boolean v2, v2, Ll/۬ۙܳ;->ۙ:Z

    if-eqz v2, :cond_4

    const-string v2, "\u2026"

    goto :goto_0

    :cond_4
    const-string v2, ""

    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 418
    iget-object v3, p0, Ll/᩸ۙܳ;->ܶ᩷:Landroid/widget/TextView;

    const/4 v4, 0x1

    if-gez v0, :cond_5

    goto :goto_1

    :cond_5
    add-int/2addr v0, v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 419
    iget-object v0, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    .line 248
    invoke-virtual {v0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v0

    .line 1234
    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->᩸()I

    move-result v0

    .line 421
    :try_start_0
    iget-object v2, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v2}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v2

    .line 1230
    iget-object v2, v2, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result v3

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x0

    if-eqz v3, :cond_7

    .line 1222
    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result v3

    .line 1226
    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->۫()I

    move-result v2

    .line 424
    iget-object v8, p0, Ll/᩸ۙܳ;->᩺᩷:Landroid/widget/TextView;

    iget-boolean v9, p0, Ll/᩸ۙܳ;->ۛ᩷:Z

    if-eqz v9, :cond_6

    const-string v9, "Sel: %Xh - %Xh  Len: %Xh  Size: %Xh [HEX]"

    goto :goto_2

    :cond_6
    const-string v9, "Sel: %d - %d  Len: %d  Size: %d [DEC]"

    .line 426
    :goto_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    sub-int/2addr v2, v3

    add-int/2addr v2, v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v10, v3, v7

    aput-object v11, v3, v4

    aput-object v2, v3, v6

    aput-object v0, v3, v5

    .line 424
    invoke-static {v1, v9, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 429
    :cond_7
    iget-object v2, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    .line 250
    invoke-virtual {v2}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۨ᩷ܳ;->ۚ()Z

    move-result v3

    if-nez v3, :cond_9

    invoke-virtual {v2}, Ll/ܿۙܳ;->᩻()I

    move-result v3

    .line 248
    invoke-virtual {v2}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v8

    .line 1234
    iget-object v8, v8, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v8}, Ll/ۚ᩷ܳ;->᩸()I

    move-result v8

    if-lt v3, v8, :cond_8

    goto :goto_3

    .line 250
    :cond_8
    invoke-virtual {v2}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v3

    iget-object v3, v3, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v2}, Ll/ܿۙܳ;->᩻()I

    move-result v2

    invoke-virtual {v3, v2}, Ll/ۚ᩷ܳ;->ۙ(I)B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    goto :goto_4

    :cond_9
    :goto_3
    const/4 v2, -0x1

    .line 430
    :goto_4
    iget-object v3, p0, Ll/᩸ۙܳ;->᩺᩷:Landroid/widget/TextView;

    if-gez v2, :cond_b

    iget-boolean v2, p0, Ll/᩸ۙܳ;->ۛ᩷:Z

    if-eqz v2, :cond_a

    const-string v2, "Size: %Xh [HEX]"

    goto :goto_5

    :cond_a
    const-string v2, "Size: %d [DEC]"

    :goto_5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v0, v4, v7

    invoke-static {v1, v2, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_7

    .line 431
    :cond_b
    iget-boolean v8, p0, Ll/᩸ۙܳ;->ۛ᩷:Z

    if-eqz v8, :cond_c

    const-string v8, "Val: %Xh  Pos: %Xh  Size: %Xh [HEX]"

    goto :goto_6

    :cond_c
    const-string v8, "Val: %d  Pos: %d  Size: %d [DEC]"

    .line 432
    :goto_6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v9, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v9}, Ll/ܿۙܳ;->᩻()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v2, v5, v7

    aput-object v9, v5, v4

    aput-object v0, v5, v6

    .line 431
    invoke-static {v1, v8, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 430
    :goto_7
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 433
    invoke-virtual {p0, v0}, Ll/᩸ۙܳ;->ۙ(Ljava/io/IOException;)V

    :cond_d
    :goto_8
    return-void
.end method

.method public final ᩸()Ll/ۨ᩷ܳ;
    .locals 1

    .line 204
    iget-object v0, p0, Ll/᩸ۙܳ;->ܺ᩷:Ll/ܿۙܳ;

    invoke-virtual {v0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object v0

    return-object v0
.end method
