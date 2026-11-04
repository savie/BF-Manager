.class public final Ll/᩷᩻֫;
.super Ljava/lang/Object;
.source "V6MU"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ֡:Z

.field public ֨:I

.field public final ֫ۙ:Ljava/util/IdentityHashMap;

.field public ۖ:Ll/ۜۧ֫;

.field public ۗۙ:Ll/۬ۚ֫;

.field public final ۙۙ:Ll/۬֫֫;

.field public final ۚۙ:Ljava/util/concurrent/ExecutorService;

.field public volatile ۜ:J

.field public volatile ۟:Z

.field public ۠:Ll/ۡۚ֫;

.field public ۡ:Ll/ۢܺ֫;

.field public volatile ۢ:Ll/ۜۧ֫;

.field public ۤۙ:Z

.field public final ۧۙ:J

.field public final ۫ۙ:Ll/֫᩻֫;

.field public ۬:Ll/ۚۜۚ;

.field public volatile ܰ:Z

.field public ܳۙ:Ll/ۜۧ֫;

.field public final ܶۙ:Ljava/util/ArrayList;

.field public ܺۙ:J

.field public final ܽۙ:Ll/֫᩻֫;

.field public final ܿ:Ll/ۖۚ֫;

.field public volatile ᩳ:Z

.field public final ᩴۙ:Landroid/util/SparseArray;

.field public final ᩵ۙ:Ljava/util/concurrent/ExecutorService;

.field public final ᩶:J

.field public final ᩷ۙ:Landroid/os/Handler;

.field public volatile ᩸ۙ:J

.field public final ᩹ۙ:J

.field public ᩻ۙ:Z


# direct methods
.method public constructor <init>(Ll/ܶۜۚ;Ljava/util/ArrayList;)V
    .locals 11

    .line 78
    new-instance v0, Ll/ۖۚ֫;

    const-string v1, "activity"

    .line 106
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/ActivityManager;

    .line 107
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v2

    .line 108
    invoke-virtual {v1}, Landroid/app/ActivityManager;->getMemoryClass()I

    move-result v4

    invoke-virtual {v1}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    move-result v1

    const-wide/16 v5, 0x0

    cmp-long v7, v2, v5

    if-lez v7, :cond_5

    if-lez v4, :cond_4

    const-wide/16 v5, 0x3

    const-wide/32 v7, 0x100000

    if-eqz v1, :cond_0

    int-to-long v1, v4

    mul-long v1, v1, v7

    const-wide/16 v3, 0x10

    .line 25
    div-long/2addr v1, v3

    const-wide/32 v3, 0x1000000

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    const-wide/32 v9, 0x10000000

    .line 26
    div-long/2addr v2, v5

    invoke-static {v9, v10, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    .line 107
    :goto_0
    invoke-static {v7, v8, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    const/4 v3, 0x0

    .line 11
    invoke-direct {v0, v1, v2, v3}, Ll/ۖۚ֫;-><init>(JLl/ۡۚ֫;)V

    .line 78
    new-instance v1, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    const-string v2, "gallery-sources"

    invoke-direct {v1, p1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    new-instance p1, Landroid/util/SparseArray;

    const/4 v2, 0x3

    invoke-direct {p1, v2}, Landroid/util/SparseArray;-><init>(I)V

    iput-object p1, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    .line 44
    new-instance p1, Ll/۬֫֫;

    invoke-direct {p1}, Ll/۬֫֫;-><init>()V

    iput-object p1, p0, Ll/᩷᩻֫;->ۙۙ:Ll/۬֫֫;

    .line 45
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {p1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Ll/᩷᩻֫;->᩷ۙ:Landroid/os/Handler;

    .line 46
    new-instance p1, Ll/ܿۧ֫;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Ll/᩷᩻֫;->᩵ۙ:Ljava/util/concurrent/ExecutorService;

    .line 47
    new-instance p1, Ll/֡ۧ֫;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Ll/᩷᩻֫;->ۚۙ:Ljava/util/concurrent/ExecutorService;

    .line 60
    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, Ll/᩷᩻֫;->֫ۙ:Ljava/util/IdentityHashMap;

    const/4 p1, 0x1

    .line 65
    iput-boolean p1, p0, Ll/᩷᩻֫;->ܰ:Z

    if-eqz p2, :cond_3

    .line 88
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {v0}, Ll/ۖۚ֫;->ۙ()J

    move-result-wide v2

    cmp-long p1, v2, v7

    if-ltz p1, :cond_3

    .line 91
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Ll/᩷᩻֫;->ܶۙ:Ljava/util/ArrayList;

    .line 92
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/۫ۧ֫;

    if-eqz p2, :cond_1

    goto :goto_1

    .line 93
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Null gallery source"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 95
    :cond_2
    iput-object v0, p0, Ll/᩷᩻֫;->ܿ:Ll/ۖۚ֫;

    .line 96
    new-instance p1, Ll/ۙۨܳ;

    const/4 p2, 0x2

    invoke-direct {p1, p2, p0}, Ll/ۙۨܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, p1}, Ll/ۖۚ֫;->ۙ(Ll/ۙۨܳ;)V

    .line 97
    invoke-virtual {v0}, Ll/ۖۚ֫;->ۙ()J

    move-result-wide p1

    const-wide/16 v2, 0x8

    div-long/2addr p1, v2

    const-wide/32 v2, 0x800000

    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Ll/᩷᩻֫;->ۧۙ:J

    .line 99
    invoke-virtual {v0}, Ll/ۖۚ֫;->ۙ()J

    move-result-wide v2

    .line 14
    div-long/2addr v2, v5

    const-wide/16 v7, 0x2

    mul-long v2, v2, v7

    .line 99
    iput-wide v2, p0, Ll/᩷᩻֫;->᩶:J

    .line 100
    invoke-virtual {v0}, Ll/ۖۚ֫;->ۙ()J

    move-result-wide v2

    mul-long p1, p1, v5

    sub-long/2addr v2, p1

    iput-wide v2, p0, Ll/᩷᩻֫;->᩹ۙ:J

    .line 101
    new-instance p1, Ll/֫᩻֫;

    invoke-direct {p1, v1}, Ll/֫᩻֫;-><init>(Ljava/io/File;)V

    iput-object p1, p0, Ll/᩷᩻֫;->ܽۙ:Ll/֫᩻֫;

    .line 102
    new-instance p1, Ll/֫᩻֫;

    invoke-direct {p1, v1}, Ll/֫᩻֫;-><init>(Ljava/io/File;)V

    iput-object p1, p0, Ll/᩷᩻֫;->۫ۙ:Ll/֫᩻֫;

    return-void

    .line 89
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid gallery sources or bitmap budget"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 23
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Memory class must be positive"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 22
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Maximum heap must be positive"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic ֫(Ll/᩷᩻֫;)Ll/ۜۧ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    return-object p0
.end method

.method public static synthetic ֫(Ll/᩷᩻֫;Ll/ۡۧ֫;)Z
    .locals 0

    .line 488
    invoke-direct {p0, p1}, Ll/᩷᩻֫;->ۙ(Ll/ۡۧ֫;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ۗ(Ll/᩷᩻֫;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/᩷᩻֫;->᩹ۙ:J

    return-wide v0
.end method

.method public static ۙ(Ljava/lang/Throwable;)I
    .locals 1

    .line 699
    instance-of v0, p0, Ll/֫֫֫;

    if-eqz v0, :cond_0

    const p0, 0x7f12049d

    return p0

    .line 700
    :cond_0
    instance-of v0, p0, Ll/᩸֫֫;

    if-nez v0, :cond_4

    instance-of v0, p0, Ll/ۢ֫֫;

    if-nez v0, :cond_4

    instance-of v0, p0, Ll/ۡۧܺ;

    if-eqz v0, :cond_1

    goto :goto_1

    .line 703
    :cond_1
    instance-of v0, p0, Ll/ᩳ֫֫;

    if-nez v0, :cond_3

    instance-of p0, p0, Ljava/lang/OutOfMemoryError;

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    const p0, 0x7f12049c

    return p0

    :cond_3
    :goto_0
    const p0, 0x7f1208e9

    return p0

    :cond_4
    :goto_1
    const p0, 0x7f1204a1

    return p0
.end method

.method private ۙ(Ll/ۜۧ֫;)Ll/ۡۧ֫;
    .locals 10

    if-eqz p1, :cond_5

    .line 418
    iget-boolean v0, p1, Ll/ۜۧ֫;->᩷:Z

    if-nez v0, :cond_5

    iget-boolean v0, p1, Ll/ۜۧ֫;->ܶ:Z

    if-nez v0, :cond_5

    invoke-virtual {p1}, Ll/ۜۧ֫;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Ll/ۜۧ֫;->ۗ:Z

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 419
    :cond_0
    iget-object v0, p1, Ll/ۜۧ֫;->۫:Ll/ܳ֫֫;

    if-eqz v0, :cond_3

    .line 420
    iget-object v0, p1, Ll/ۜۧ֫;->᩸ۙ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ll/ۘ᩻֫;

    .line 1109
    iget-boolean v1, p1, Ll/ۜۧ֫;->֨:Z

    if-eqz v1, :cond_2

    iget-object v1, p1, Ll/ۜۧ֫;->᩹:Ljava/util/HashMap;

    goto :goto_0

    :cond_2
    iget-object v1, p1, Ll/ۜۧ֫;->ۡ:Ljava/util/HashMap;

    .line 421
    :goto_0
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p1, Ll/ۜۧ֫;->ᩴ:Ljava/util/HashSet;

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 422
    new-instance v0, Ll/ۡۧ֫;

    iget-wide v5, p0, Ll/᩷᩻֫;->ۜ:J

    iget-wide v7, p0, Ll/᩷᩻֫;->᩸ۙ:J

    move-object v2, v0

    move-object v3, p1

    invoke-direct/range {v2 .. v8}, Ll/ۡۧ֫;-><init>(Ll/ۜۧ֫;Ll/ۘ᩻֫;JJ)V

    return-object v0

    .line 425
    :cond_3
    iget-object v0, p1, Ll/ۜۧ֫;->ܺ:Ll/ۡ֫֫;

    if-eqz v0, :cond_5

    iget-boolean v0, p1, Ll/ۜۧ֫;->ܿ:Z

    if-nez v0, :cond_5

    .line 426
    iget-object v0, p1, Ll/ۜۧ֫;->ۤۙ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ll/֡᩻֫;

    .line 427
    iget-object v1, p1, Ll/ۜۧ֫;->۠:Ljava/util/HashMap;

    invoke-virtual {v1, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p1, Ll/ۜۧ֫;->ܳ:Ljava/util/HashSet;

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    new-instance v0, Ll/ۡۧ֫;

    iget-wide v6, p0, Ll/᩷᩻֫;->ۜ:J

    iget-wide v8, p0, Ll/᩷᩻֫;->᩸ۙ:J

    const/4 v5, 0x0

    move-object v2, v0

    move-object v3, p1

    invoke-direct/range {v2 .. v9}, Ll/ۡۧ֫;-><init>(Ll/ۜۧ֫;Ll/֡᩻֫;ZJJ)V

    return-object v0

    :cond_5
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private ۙ(Ll/ۡۧ֫;Ll/۫ۧ֫;Ll/۬ۧ֫;Ll/ۖۚ֫;Z)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    .line 477
    instance-of v2, v10, Ll/۠᩻֫;

    if-eqz v2, :cond_0

    move-object v2, v10

    check-cast v2, Ll/۠᩻֫;

    .line 478
    invoke-virtual/range {p2 .. p2}, Ll/۫ۧ֫;->ۗ()Ll/ܳۧ֫;

    move-result-object v9

    .line 479
    iget-wide v3, v0, Ll/᩷᩻֫;->ۧۙ:J

    new-instance v5, Ll/ۛۧ֫;

    invoke-direct {v5, v0, v1}, Ll/ۛۧ֫;-><init>(Ll/᩷᩻֫;Ll/ۡۧ֫;)V

    invoke-virtual {v2, v12, v3, v4, v5}, Ll/۠᩻֫;->ۙ(Ll/ۖۚ֫;JLl/ۛۧ֫;)Ll/۠֫֫;

    move-result-object v1

    iput-object v1, v11, Ll/۬ۧ֫;->ܰ:Ll/۠֫֫;

    .line 480
    invoke-virtual {v10, v9}, Ll/۫ۧ֫;->ۙ(Ll/ܳۧ֫;)V

    .line 481
    new-instance v1, Ll/ۡ֫֫;

    invoke-virtual/range {p2 .. p2}, Ll/۫ۧ֫;->۫()Ljava/lang/String;

    move-result-object v4

    iget-object v2, v11, Ll/۬ۧ֫;->ܰ:Ll/۠֫֫;

    iget-object v2, v2, Ll/۠֫֫;->ܰ:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    iget-object v2, v11, Ll/۬ۧ֫;->ܰ:Ll/۠֫֫;

    iget-object v2, v2, Ll/۠֫֫;->ܰ:Landroid/graphics/Bitmap;

    .line 482
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    const/4 v7, 0x1

    const-string v8, "video/*"

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, Ll/ۡ֫֫;-><init>(Ljava/lang/String;IIILjava/lang/String;Ll/ܳۧ֫;)V

    iput-object v1, v11, Ll/۬ۧ֫;->۟:Ll/ۡ֫֫;

    return-void

    .line 485
    :cond_0
    iget-boolean v2, v0, Ll/᩷᩻֫;->ᩳ:Z

    if-eqz v2, :cond_1

    iget-object v2, v0, Ll/᩷᩻֫;->ܿ:Ll/ۖۚ֫;

    invoke-virtual {v2}, Ll/ۖۚ֫;->ۙ()J

    move-result-wide v2

    const-wide/16 v4, 0x80

    div-long/2addr v2, v4

    const-wide/32 v4, 0x100000

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    goto :goto_0

    :cond_1
    iget-wide v2, v0, Ll/᩷᩻֫;->ۧۙ:J

    :goto_0
    move-wide v13, v2

    .line 486
    new-instance v2, Ll/᩺ۧ֫;

    invoke-direct {v2, v0, v1}, Ll/᩺ۧ֫;-><init>(Ll/᩷᩻֫;Ll/ۡۧ֫;)V

    invoke-static {v10, v2}, Ll/ܺ֫֫;->ۙ(Ll/۫ۧ֫;Ll/᩺ۧ֫;)Ll/ᩴ֫֫;

    move-result-object v15

    .line 488
    iget-wide v5, v0, Ll/᩷᩻֫;->ۧۙ:J

    iget-wide v7, v0, Ll/᩷᩻֫;->᩶:J

    new-instance v9, Ll/ۘۧ֫;

    invoke-direct {v9, v0, v1}, Ll/ۘۧ֫;-><init>(Ll/᩷᩻֫;Ll/ۡۧ֫;)V

    move-object/from16 v2, p2

    move-object v3, v15

    move-object/from16 v4, p4

    invoke-static/range {v2 .. v9}, Ll/ܺ֫֫;->ۙ(Ll/۫ۧ֫;Ll/ᩴ֫֫;Ll/ۖۚ֫;JJLl/ۘۧ֫;)Ll/ܳ֫֫;

    move-result-object v2

    iput-object v2, v11, Ll/۬ۧ֫;->֡:Ll/ܳ֫֫;

    if-eqz v2, :cond_2

    .line 489
    iget-object v1, v2, Ll/ܳ֫֫;->ᩳ:Ll/ۡ֫֫;

    iput-object v1, v11, Ll/۬ۧ֫;->۟:Ll/ۡ֫֫;

    return-void

    .line 491
    :cond_2
    iget-object v2, v0, Ll/᩷᩻֫;->ۙۙ:Ll/۬֫֫;

    iget-object v3, v15, Ll/ᩴ֫֫;->᩷:Ll/ܳۧ֫;

    iget-object v4, v15, Ll/ᩴ֫֫;->ۙ:Ll/۟۠ۚ;

    invoke-virtual {v2, v10, v3, v4}, Ll/۬֫֫;->ۙ(Ll/۫ۧ֫;Ll/ܳۧ֫;Ll/۟۠ۚ;)Ll/ۡ֫֫;

    move-result-object v2

    iput-object v2, v11, Ll/۬ۧ֫;->۟:Ll/ۡ֫֫;

    .line 492
    iget-object v3, v2, Ll/ۡ֫֫;->۫:Ll/֨ۧܺ;

    if-eqz v3, :cond_4

    if-eqz p5, :cond_3

    .line 494
    invoke-virtual/range {p2 .. p2}, Ll/۫ۧ֫;->ۚ()Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 495
    invoke-direct/range {p0 .. p0}, Ll/᩷᩻֫;->ۚ()V

    .line 497
    :try_start_0
    iget-object v2, v11, Ll/۬ۧ֫;->۟:Ll/ۡ֫֫;

    new-instance v3, Ll/ܰۧ֫;

    invoke-direct {v3, v0, v1}, Ll/ܰۧ֫;-><init>(Ll/᩷᩻֫;Ll/ۡۧ֫;)V

    invoke-static {v10, v2, v12, v3}, Ll/ۢܺ֫;->ۙ(Ll/۫ۧ֫;Ll/ۡ֫֫;Ll/ۖۚ֫;Ll/۟֡֫;)Ll/ۢܺ֫;

    move-result-object v2

    iput-object v2, v0, Ll/᩷᩻֫;->ۡ:Ll/ۢܺ֫;

    .line 498
    iget-object v3, v1, Ll/ۡۧ֫;->᩸:Ll/ۜۧ֫;

    iput-object v3, v0, Ll/᩷᩻֫;->ۖ:Ll/ۜۧ֫;
    :try_end_0
    .catch Ll/ᩳ֫֫; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :cond_3
    const/4 v2, 0x0

    :goto_1
    move-object v6, v2

    .line 504
    iget-object v2, v11, Ll/۬ۧ֫;->۟:Ll/ۡ֫֫;

    new-instance v7, Ll/᩶ۧ֫;

    invoke-direct {v7, v0, v1}, Ll/᩶ۧ֫;-><init>(Ll/᩷᩻֫;Ll/ۡۧ֫;)V

    sget-object v8, Ll/ۜ֫֫;->ۤ:Ll/ۜ֫֫;

    move-object/from16 v1, p2

    move-object/from16 v3, p4

    move-wide v4, v13

    invoke-static/range {v1 .. v8}, Ll/᩶᩻֫;->ۙ(Ll/۫ۧ֫;Ll/ۡ֫֫;Ll/ۖۚ֫;JLl/ۢܺ֫;Ll/۟֡֫;Ll/ۜ֫֫;)Ll/۠֫֫;

    move-result-object v1

    iput-object v1, v11, Ll/۬ۧ֫;->ܰ:Ll/۠֫֫;

    return-void

    .line 508
    :cond_4
    iget-object v2, v2, Ll/ۡ֫֫;->᩸:Ljava/lang/String;

    invoke-static {v2}, Ll/ۢܺ֫;->ۙ(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_5

    iget-wide v13, v0, Ll/᩷᩻֫;->ۧۙ:J

    .line 509
    :cond_5
    invoke-direct/range {p0 .. p1}, Ll/᩷᩻֫;->ۙ(Ll/ۡۧ֫;)Z

    move-result v2

    if-nez v2, :cond_7

    .line 510
    iget-boolean v2, v0, Ll/᩷᩻֫;->ᩳ:Z

    if-nez v2, :cond_6

    if-eqz p5, :cond_6

    iget-object v1, v1, Ll/ۡۧ֫;->᩸:Ll/ۜۧ֫;

    iget-object v2, v0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    if-ne v1, v2, :cond_6

    iget-object v1, v11, Ll/۬ۧ֫;->۟:Ll/ۡ֫֫;

    iget-object v1, v1, Ll/ۡ֫֫;->᩸:Ljava/lang/String;

    const-string v2, "image/png"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 511
    iget-wide v1, v0, Ll/᩷᩻֫;->ۧۙ:J

    const-wide/16 v3, 0x2

    mul-long v1, v1, v3

    const-wide/32 v3, 0x800000

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    move-wide v5, v1

    goto :goto_2

    :cond_6
    move-wide v5, v13

    .line 512
    :goto_2
    iget-object v1, v0, Ll/᩷᩻֫;->ۙۙ:Ll/۬֫֫;

    iget-object v3, v11, Ll/۬ۧ֫;->۟:Ll/ۡ֫֫;

    move-object/from16 v2, p2

    move-object/from16 v4, p4

    invoke-virtual/range {v1 .. v6}, Ll/۬֫֫;->ۙ(Ll/۫ۧ֫;Ll/ۡ֫֫;Ll/ۖۚ֫;J)Ll/۠֫֫;

    move-result-object v1

    iput-object v1, v11, Ll/۬ۧ֫;->ܰ:Ll/۠֫֫;

    :cond_7
    return-void
.end method

.method private ۙ(Ll/ۡۧ֫;Ll/۬ۧ֫;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 708
    iget-object v3, v1, Ll/ۡۧ֫;->᩸:Ll/ۜۧ֫;

    .line 709
    iget-boolean v4, v0, Ll/᩷᩻֫;->۟:Z

    if-nez v4, :cond_21

    iget-boolean v4, v0, Ll/᩷᩻֫;->ܰ:Z

    if-eqz v4, :cond_21

    iget-wide v4, v1, Ll/ۡۧ֫;->᩷:J

    iget-wide v6, v0, Ll/᩷᩻֫;->ۜ:J

    cmp-long v8, v4, v6

    if-nez v8, :cond_21

    iget-boolean v4, v3, Ll/ۜۧ֫;->᩷:Z

    if-nez v4, :cond_21

    iget-object v4, v0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    iget v5, v3, Ll/ۜۧ֫;->ۨ:I

    invoke-virtual {v4, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_21

    iget-boolean v4, v2, Ll/۬ۧ֫;->ۢ:Z

    if-nez v4, :cond_21

    .line 710
    invoke-direct/range {p0 .. p1}, Ll/᩷᩻֫;->ۙ(Ll/ۡۧ֫;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_9

    .line 715
    :cond_0
    iget-boolean v4, v1, Ll/ۡۧ֫;->ᩴ:Z

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_3

    iget-object v4, v3, Ll/ۜۧ֫;->ܺ:Ll/ۡ֫֫;

    if-nez v4, :cond_3

    iget-object v4, v2, Ll/۬ۧ֫;->ܿ:Ljava/lang/Throwable;

    if-eqz v4, :cond_3

    iget-boolean v4, v0, Ll/᩷᩻֫;->ᩳ:Z

    if-eqz v4, :cond_1

    iget-boolean v4, v3, Ll/ۜۧ֫;->ܽ:Z

    if-eqz v4, :cond_1

    iget-object v4, v2, Ll/۬ۧ֫;->ܿ:Ljava/lang/Throwable;

    instance-of v4, v4, Ll/ᩳ֫֫;

    if-nez v4, :cond_3

    .line 717
    :cond_1
    iput-boolean v5, v3, Ll/ۜۧ֫;->ۛ:Z

    .line 719
    iget-boolean v1, v0, Ll/᩷᩻֫;->ᩳ:Z

    if-eqz v1, :cond_2

    iget-object v1, v2, Ll/۬ۧ֫;->ܿ:Ljava/lang/Throwable;

    instance-of v1, v1, Ll/ᩳ֫֫;

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    :goto_0
    iput-boolean v5, v3, Ll/ۜۧ֫;->۟:Z

    .line 720
    invoke-virtual/range {p2 .. p2}, Ll/۬ۧ֫;->close()V

    return-void

    .line 723
    :cond_3
    iget-object v4, v2, Ll/۬ۧ֫;->ܿ:Ljava/lang/Throwable;

    instance-of v7, v4, Ll/ᩴۧ֫;

    if-nez v7, :cond_20

    iget-boolean v7, v2, Ll/۬ۧ֫;->᩶:Z

    if-eqz v7, :cond_4

    goto/16 :goto_8

    .line 728
    :cond_4
    iget-boolean v7, v1, Ll/ۡۧ֫;->ܺ:Z

    if-eqz v7, :cond_6

    .line 729
    iput-boolean v6, v3, Ll/ۜۧ֫;->ܶ:Z

    if-eqz v4, :cond_5

    .line 730
    iget v1, v3, Ll/ۜۧ֫;->ۨ:I

    invoke-virtual {v0, v1}, Ll/᩷᩻֫;->᩸(I)V

    goto/16 :goto_7

    .line 731
    :cond_5
    invoke-virtual {v3}, Ll/ۜۧ֫;->᩸()V

    goto/16 :goto_7

    .line 732
    :cond_6
    iget-object v7, v1, Ll/ۡۧ֫;->ۧ:Ll/ۘ᩻֫;

    const-wide/16 v8, 0x2

    const-wide/32 v10, 0x40000

    const/4 v12, 0x0

    if-eqz v7, :cond_b

    .line 733
    iget-object v5, v2, Ll/۬ۧ֫;->ܰ:Ll/۠֫֫;

    if-eqz v5, :cond_9

    .line 1109
    iget-boolean v1, v3, Ll/ۜۧ֫;->֨:Z

    if-eqz v1, :cond_7

    iget-object v1, v3, Ll/ۜۧ֫;->᩹:Ljava/util/HashMap;

    goto :goto_1

    :cond_7
    iget-object v1, v3, Ll/ۜۧ֫;->ۡ:Ljava/util/HashMap;

    .line 1255
    :goto_1
    iput-object v12, v2, Ll/۬ۧ֫;->ܰ:Ll/۠֫֫;

    .line 734
    invoke-virtual {v1, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠֫֫;

    if-eqz v1, :cond_8

    .line 735
    invoke-virtual {v1}, Ll/۠֫֫;->close()V

    .line 736
    :cond_8
    invoke-static {v3}, Ll/ۜۧ֫;->᩷(Ll/ۜۧ֫;)V

    .line 737
    iget-object v1, v0, Ll/᩷᩻֫;->ۗۙ:Ll/۬ۚ֫;

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    goto/16 :goto_7

    .line 739
    :cond_9
    instance-of v4, v4, Ll/ᩳ֫֫;

    if-eqz v4, :cond_a

    .line 740
    iget-wide v4, v3, Ll/ۜۧ֫;->ۙ:J

    div-long/2addr v4, v8

    invoke-static {v10, v11, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iput-wide v4, v3, Ll/ۜۧ֫;->ۙ:J

    .line 742
    invoke-static {v3}, Ll/ۜۧ֫;->ۤ(Ll/ۜۧ֫;)V

    .line 743
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v3, Ll/ۜۧ֫;->᩸ۙ:Ljava/util/List;

    .line 744
    iput-boolean v6, v3, Ll/ۜۧ֫;->֫:Z

    .line 745
    iget-object v4, v0, Ll/᩷᩻֫;->ۗۙ:Ll/۬ۚ֫;

    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    .line 747
    :cond_a
    iget-object v3, v3, Ll/ۜۧ֫;->ᩴ:Ljava/util/HashSet;

    iget-object v1, v1, Ll/ۡۧ֫;->ۧ:Ll/ۘ᩻֫;

    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto/16 :goto_7

    .line 749
    :cond_b
    iget-object v7, v1, Ll/ۡۧ֫;->᩻:Ll/֡᩻֫;

    if-nez v7, :cond_14

    .line 750
    iget-object v1, v1, Ll/ۡۧ֫;->۫:Ll/ܳ֫֫;

    if-eqz v1, :cond_c

    iget-object v7, v2, Ll/۬ۧ֫;->֡:Ll/ܳ֫֫;

    if-nez v7, :cond_c

    .line 752
    iput-boolean v5, v3, Ll/ۜۧ֫;->ۜ:Z

    .line 753
    invoke-virtual/range {p2 .. p2}, Ll/۬ۧ֫;->close()V

    return-void

    .line 756
    :cond_c
    iget-object v7, v2, Ll/۬ۧ֫;->ܰ:Ll/۠֫֫;

    if-nez v7, :cond_f

    iget-object v7, v2, Ll/۬ۧ֫;->֡:Ll/ܳ֫֫;

    if-nez v7, :cond_f

    .line 758
    instance-of v1, v4, Ll/ᩳ֫֫;

    if-eqz v1, :cond_d

    iget-object v1, v2, Ll/۬ۧ֫;->ᩳ:Ll/ۡۚ֫;

    if-nez v1, :cond_e

    iget-boolean v1, v3, Ll/ۜۧ֫;->۟:Z

    if-nez v1, :cond_d

    goto :goto_2

    :cond_d
    const/4 v5, 0x0

    :cond_e
    :goto_2
    iput-boolean v5, v3, Ll/ۜۧ֫;->۟:Z

    xor-int/lit8 v1, v5, 0x1

    .line 760
    iput-boolean v1, v3, Ll/ۜۧ֫;->᩸:Z

    if-nez v5, :cond_1d

    .line 761
    iget-object v1, v0, Ll/᩷᩻֫;->ۗۙ:Ll/۬ۚ֫;

    iget v5, v3, Ll/ۜۧ֫;->ۨ:I

    iget-wide v6, v3, Ll/ۜۧ֫;->֡:J

    .line 762
    invoke-static {v4}, Ll/᩷᩻֫;->ۙ(Ljava/lang/Throwable;)I

    move-result v3

    .line 761
    invoke-virtual {v1, v5, v3, v6, v7}, Ll/۬ۚ֫;->ۙ(IIJ)V

    goto/16 :goto_7

    :cond_f
    if-eqz v1, :cond_10

    .line 764
    iget-object v4, v3, Ll/ۜۧ֫;->᩺:Ll/ۡۚ֫;

    invoke-virtual {v1, v4}, Ll/ܳ֫֫;->ۙ(Ll/ۡۚ֫;)V

    .line 765
    :cond_10
    iput-boolean v6, v3, Ll/ۜۧ֫;->ۛ:Z

    iput-boolean v6, v3, Ll/ۜۧ֫;->۟:Z

    iput-boolean v6, v3, Ll/ۜۧ֫;->᩸:Z

    .line 766
    iget-object v1, v2, Ll/۬ۧ֫;->۟:Ll/ۡ֫֫;

    iput-object v1, v3, Ll/ۜۧ֫;->ܺ:Ll/ۡ֫֫;

    .line 1248
    iget-object v1, v2, Ll/۬ۧ֫;->ᩳ:Ll/ۡۚ֫;

    iput-object v12, v2, Ll/۬ۧ֫;->ᩳ:Ll/ۡۚ֫;

    .line 767
    iput-object v1, v3, Ll/ۜۧ֫;->᩺:Ll/ۡۚ֫;

    .line 1254
    iget-object v1, v2, Ll/۬ۧ֫;->ܰ:Ll/۠֫֫;

    .line 1255
    iput-object v12, v2, Ll/۬ۧ֫;->ܰ:Ll/۠֫֫;

    .line 768
    iput-object v1, v3, Ll/ۜۧ֫;->ۘ:Ll/۠֫֫;

    .line 1259
    iget-object v1, v2, Ll/۬ۧ֫;->֡:Ll/ܳ֫֫;

    .line 1260
    iput-object v12, v2, Ll/۬ۧ֫;->֡:Ll/ܳ֫֫;

    .line 769
    iput-object v1, v3, Ll/ۜۧ֫;->۫:Ll/ܳ֫֫;

    .line 770
    iget-object v1, v3, Ll/ۜۧ֫;->ۢ:Ll/۫ۧ֫;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v1, v1, Ll/۠᩻֫;

    if-nez v1, :cond_12

    .line 770
    iget-object v1, v3, Ll/ۜۧ֫;->۫:Ll/ܳ֫֫;

    if-eqz v1, :cond_11

    goto :goto_3

    :cond_11
    const/4 v5, 0x0

    :cond_12
    :goto_3
    iput-boolean v5, v3, Ll/ۜۧ֫;->ܿ:Z

    .line 771
    iget-object v1, v0, Ll/᩷᩻֫;->ۗۙ:Ll/۬ۚ֫;

    iget v4, v3, Ll/ۜۧ֫;->ۨ:I

    iget-wide v5, v3, Ll/ۜۧ֫;->֡:J

    invoke-virtual {v1, v4, v5, v6, v3}, Ll/۬ۚ֫;->ۙ(IJLl/ۙۧ֫;)Z

    move-result v1

    if-nez v1, :cond_13

    invoke-virtual {v3}, Ll/ۜۧ֫;->close()V

    .line 772
    :cond_13
    invoke-virtual {v3}, Ll/ۜۧ֫;->᩸()V

    goto/16 :goto_7

    .line 774
    :cond_14
    invoke-direct {v0, v3}, Ll/᩷᩻֫;->᩷(Ll/ۜۧ֫;)Z

    move-result v4

    if-eqz v4, :cond_1d

    invoke-virtual {v3}, Ll/ۜۧ֫;->ᩴ()Z

    move-result v4

    if-eqz v4, :cond_16

    iget-object v4, v1, Ll/ۡۧ֫;->᩻:Ll/֡᩻֫;

    .line 1097
    iget-object v7, v3, Ll/ۜۧ֫;->۬:Landroid/graphics/RectF;

    iget-object v13, v3, Ll/ۜۧ֫;->ۘ:Ll/۠֫֫;

    if-eqz v13, :cond_1d

    iget v15, v3, Ll/ۜۧ֫;->ۙۙ:F

    const/4 v14, 0x0

    cmpg-float v14, v15, v14

    if-gtz v14, :cond_15

    goto/16 :goto_7

    .line 1098
    :cond_15
    iget-object v14, v3, Ll/ۜۧ֫;->ܺ:Ll/ۡ֫֫;

    iget v10, v14, Ll/ۡ֫֫;->֫:I

    iget v14, v14, Ll/ۡ֫֫;->ۤ:I

    iget v11, v13, Ll/۠֫֫;->۟:I

    .line 1099
    invoke-virtual {v3}, Ll/ۜۧ֫;->ۤ()J

    move-result-wide v18

    iget v13, v3, Ll/ۜۧ֫;->᩻:I

    iget v8, v3, Ll/ۜۧ֫;->ۧ:I

    move v9, v13

    move v13, v10

    move v10, v15

    move-object v15, v7

    move/from16 v16, v10

    move/from16 v17, v11

    move/from16 v20, v9

    move/from16 v21, v8

    .line 1098
    invoke-static/range {v13 .. v21}, Ll/ۧۧ֫;->ۙ(IILandroid/graphics/RectF;FIJII)Ljava/util/List;

    move-result-object v8

    .line 1100
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_1d

    iget-object v9, v3, Ll/ۜۧ֫;->ܺ:Ll/ۡ֫֫;

    iget v10, v9, Ll/ۡ֫֫;->֫:I

    iget v9, v9, Ll/ۡ֫֫;->ۤ:I

    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/֡᩻֫;

    iget v8, v8, Ll/֡᩻֫;->ۚ:I

    invoke-static {v4, v7, v10, v9, v8}, Ll/ۧۧ֫;->ۙ(Ll/֡᩻֫;Landroid/graphics/RectF;III)Z

    move-result v4

    if-eqz v4, :cond_1d

    goto :goto_4

    .line 774
    :cond_16
    iget-object v4, v3, Ll/ۜۧ֫;->ۤۙ:Ljava/util/List;

    iget-object v7, v1, Ll/ۡۧ֫;->᩻:Ll/֡᩻֫;

    invoke-interface {v4, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1d

    .line 775
    :goto_4
    iget-object v4, v2, Ll/۬ۧ֫;->ܰ:Ll/۠֫֫;

    if-eqz v4, :cond_1a

    .line 776
    invoke-virtual {v3}, Ll/ۜۧ֫;->ᩴ()Z

    move-result v4

    if-eqz v4, :cond_18

    .line 778
    iget-object v4, v3, Ll/ۜۧ֫;->۠:Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_17

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۙ᩻֫;

    iget-object v7, v7, Ll/ۙ᩻֫;->ۙ:Ll/۠֫֫;

    invoke-virtual {v7}, Ll/۠֫֫;->close()V

    goto :goto_5

    .line 779
    :cond_17
    iget-object v4, v3, Ll/ۜۧ֫;->۠:Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    .line 781
    iget-object v4, v1, Ll/ۡۧ֫;->᩻:Ll/֡᩻֫;

    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    iput-object v4, v3, Ll/ۜۧ֫;->ۤۙ:Ljava/util/List;

    .line 782
    iget-object v4, v0, Ll/᩷᩻֫;->᩷ۙ:Landroid/os/Handler;

    iget-object v7, v3, Ll/ۜۧ֫;->᩵:Ll/ۖۧ֫;

    invoke-virtual {v4, v7}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 783
    iput-boolean v6, v3, Ll/ۜۧ֫;->ۗ:Z

    .line 784
    iget-object v4, v3, Ll/ۜۧ֫;->᩶:Ll/֫ۧ֫;

    invoke-virtual {v4}, Ll/֫ۧ֫;->ۙ()V

    .line 785
    iput-boolean v5, v3, Ll/ۜۧ֫;->֫:Z

    .line 787
    :cond_18
    new-instance v4, Ll/ۙ᩻֫;

    iget-object v5, v1, Ll/ۡۧ֫;->᩻:Ll/֡᩻֫;

    .line 1254
    iget-object v6, v2, Ll/۬ۧ֫;->ܰ:Ll/۠֫֫;

    .line 1255
    iput-object v12, v2, Ll/۬ۧ֫;->ܰ:Ll/۠֫֫;

    .line 787
    invoke-direct {v4, v5, v6}, Ll/ۙ᩻֫;-><init>(Ll/֡᩻֫;Ll/۠֫֫;)V

    .line 788
    iget-object v5, v3, Ll/ۜۧ֫;->۠:Ljava/util/HashMap;

    iget-object v1, v1, Ll/ۡۧ֫;->᩻:Ll/֡᩻֫;

    invoke-virtual {v5, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ᩻֫;

    if-eqz v1, :cond_19

    .line 789
    iget-object v1, v1, Ll/ۙ᩻֫;->ۙ:Ll/۠֫֫;

    invoke-virtual {v1}, Ll/۠֫֫;->close()V

    .line 1055
    :cond_19
    iget-object v1, v3, Ll/ۜۧ֫;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 1056
    iget-object v3, v3, Ll/ۜۧ֫;->۠:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 791
    iget-object v1, v0, Ll/᩷᩻֫;->ۗۙ:Ll/۬ۚ֫;

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    goto :goto_7

    .line 792
    :cond_1a
    iget-object v4, v2, Ll/۬ۧ֫;->ܿ:Ljava/lang/Throwable;

    instance-of v4, v4, Ll/ᩳ֫֫;

    if-eqz v4, :cond_1c

    .line 793
    iget-wide v4, v3, Ll/ۜۧ֫;->ۙ:J

    const-wide/16 v7, 0x2

    div-long/2addr v4, v7

    const-wide/32 v7, 0x40000

    invoke-static {v7, v8, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iput-wide v4, v3, Ll/ۜۧ֫;->ۙ:J

    .line 795
    invoke-virtual {v3}, Ll/ۜۧ֫;->ᩴ()Z

    move-result v4

    if-eqz v4, :cond_1b

    iput-boolean v6, v3, Ll/ۜۧ֫;->֫:Z

    goto :goto_6

    .line 796
    :cond_1b
    invoke-virtual {v3}, Ll/ۜۧ֫;->᩷()V

    .line 797
    :goto_6
    iget-object v3, v3, Ll/ۜۧ֫;->ܳ:Ljava/util/HashSet;

    iget-object v1, v1, Ll/ۡۧ֫;->᩻:Ll/֡᩻֫;

    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 798
    iget-object v1, v0, Ll/᩷᩻֫;->ۗۙ:Ll/۬ۚ֫;

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    goto :goto_7

    .line 801
    :cond_1c
    iput-boolean v5, v3, Ll/ۜۧ֫;->ܿ:Z

    .line 802
    invoke-virtual {v3}, Ll/ۜۧ֫;->᩷()V

    .line 805
    :cond_1d
    :goto_7
    invoke-virtual/range {p2 .. p2}, Ll/۬ۧ֫;->close()V

    .line 806
    invoke-direct/range {p0 .. p0}, Ll/᩷᩻֫;->ܽ()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_1e

    invoke-direct/range {p0 .. p0}, Ll/᩷᩻֫;->᩹()V

    .line 807
    :cond_1e
    iget-object v1, v0, Ll/᩷᩻֫;->۬:Ll/ۚۜۚ;

    if-eqz v1, :cond_1f

    invoke-virtual {v1}, Ll/ۚۜۚ;->run()V

    :cond_1f
    return-void

    .line 724
    :cond_20
    :goto_8
    invoke-virtual/range {p2 .. p2}, Ll/۬ۧ֫;->close()V

    .line 725
    iget v1, v3, Ll/ۜۧ֫;->ۨ:I

    invoke-virtual {v0, v1}, Ll/᩷᩻֫;->᩸(I)V

    return-void

    .line 711
    :cond_21
    :goto_9
    invoke-virtual/range {p2 .. p2}, Ll/۬ۧ֫;->close()V

    return-void
.end method

.method public static synthetic ۙ(Ll/᩷᩻֫;)V
    .locals 3

    .line 96
    iget-object v0, p0, Ll/᩷᩻֫;->᩷ۙ:Landroid/os/Handler;

    new-instance v1, Ll/ۚۛܳ;

    const/16 v2, 0x8

    invoke-direct {v1, v2, p0}, Ll/ۚۛܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic ۙ(Ll/᩷᩻֫;Ll/۟ۧ֫;ILl/ۜۧ֫;Ll/ۡ֫֫;Ll/ۧۜۚ;JLl/֨۠ۚ;)V
    .locals 11

    move-object v1, p0

    move-object v0, p1

    move-object v6, p3

    .line 159
    iget-object v2, v1, Ll/᩷᩻֫;->֫ۙ:Ljava/util/IdentityHashMap;

    iget-object v3, v1, Ll/᩷᩻֫;->ܽۙ:Ll/֫᩻֫;

    :try_start_0
    invoke-static {p1}, Ll/۫ۧ֫;->ۙ(Ll/۟֡֫;)V

    .line 160
    iget-object v4, v1, Ll/᩷᩻֫;->ܶۙ:Ljava/util/ArrayList;
    :try_end_0
    .catch Ll/ᩴۧ֫; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move v7, p2

    :try_start_1
    invoke-virtual {v4, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۫ۧ֫;

    .line 161
    invoke-virtual {v4}, Ll/۫ۧ֫;->ܶ()Z

    move-result v5

    if-eqz v5, :cond_3

    if-eqz v6, :cond_2

    if-eqz v3, :cond_2

    .line 163
    invoke-virtual {v2, p3}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۚ᩻֫;

    if-nez v5, :cond_1

    const/4 v5, 0x1

    .line 165
    invoke-virtual {v3, v4, v5, p1}, Ll/֫᩻֫;->ۙ(Ll/۫ۧ֫;ZLl/۟֡֫;)Ll/ۚ᩻֫;

    move-result-object v3

    .line 166
    invoke-virtual {p1}, Ll/۟ۧ֫;->۫()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 167
    invoke-virtual {v3}, Ll/ۚ᩻֫;->close()V

    .line 168
    invoke-static {p1}, Ll/۫ۧ֫;->ۙ(Ll/۟֡֫;)V

    .line 170
    :cond_0
    invoke-virtual {v2, p3, v3}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v4, v3

    goto :goto_0

    :cond_1
    move-object v4, v5

    .line 172
    :goto_0
    invoke-virtual {v4}, Ll/ۚ᩻֫;->᩵()V

    goto :goto_1

    .line 162
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v2, "No gallery source owner for details"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    move-object v2, p4

    .line 175
    invoke-static {v4, p4, p1}, Ll/ۗܺ֫;->ۙ(Ll/۫ۧ֫;Ll/ۡ֫֫;Ll/۟ۧ֫;)Ll/᩹ܺ֫;

    move-result-object v0

    .line 176
    instance-of v2, v4, Ll/ۚ᩻֫;

    if-eqz v2, :cond_4

    check-cast v4, Ll/ۚ᩻֫;

    invoke-virtual {v4}, Ll/ۚ᩻֫;->᩵()V
    :try_end_1
    .catch Ll/ᩴۧ֫; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_0
    move v7, p2

    :catch_1
    const v0, 0x7f120428

    .line 180
    invoke-static {v0}, Ll/᩹ܺ֫;->ۙ(I)Ll/᩹ܺ֫;

    move-result-object v0

    goto :goto_2

    :catch_2
    move v7, p2

    :catch_3
    const v0, 0x7f120423

    .line 178
    invoke-static {v0}, Ll/᩹ܺ֫;->ۙ(I)Ll/᩹ܺ֫;

    move-result-object v0

    :cond_4
    :goto_2
    move-object v5, v0

    .line 183
    iget-object v9, v1, Ll/᩷᩻֫;->᩷ۙ:Landroid/os/Handler;

    new-instance v10, Ll/֨ۧ֫;

    move-object v0, v10

    move-object v1, p0

    move-object/from16 v2, p5

    move-wide/from16 v3, p6

    move-object v6, p3

    move v7, p2

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Ll/֨ۧ֫;-><init>(Ll/᩷᩻֫;Ll/ۧۜۚ;JLl/᩹ܺ֫;Ll/ۜۧ֫;ILl/֨۠ۚ;)V

    invoke-virtual {v9, v10}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic ۙ(Ll/᩷᩻֫;Ll/ۡۚ֫;Ll/ۡۧ֫;ZLl/۠֫֫;JLl/ۜۧ֫;Ll/۠֫֫;)V
    .locals 14

    move-object v7, p0

    move-object v0, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p4

    move-object/from16 v10, p7

    .line 2
    iget-object v1, v10, Ll/ۜۧ֫;->ۢ:Ll/۫ۧ֫;

    .line 567
    new-instance v11, Ll/۬ۧ֫;

    invoke-direct {v11}, Ll/۬ۧ֫;-><init>()V

    .line 568
    iput-object v0, v11, Ll/۬ۧ֫;->ᩳ:Ll/ۡۚ֫;

    .line 570
    :try_start_0
    invoke-direct {p0, v8}, Ll/᩷᩻֫;->ۙ(Ll/ۡۧ֫;)Z

    move-result v2

    if-nez v2, :cond_3

    const/4 v2, 0x0

    .line 571
    iput-boolean v2, v11, Ll/۬ۧ֫;->ۢ:Z

    if-eqz p3, :cond_0

    .line 573
    iget-wide v1, v7, Ll/᩷᩻֫;->ۧۙ:J

    invoke-static {v9, p1, v1, v2}, Ll/۬֫֫;->ۙ(Ll/۠֫֫;Ll/ۡۚ֫;J)Ll/۠֫֫;

    move-result-object v0

    iput-object v0, v11, Ll/۬ۧ֫;->ܰ:Ll/۠֫֫;

    const/4 v0, 0x0

    .line 574
    iput-object v0, v11, Ll/۬ۧ֫;->ᩳ:Ll/ۡۚ֫;

    goto :goto_2

    :catch_0
    move-exception v0

    goto/16 :goto_3

    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_3

    :catch_3
    move-exception v0

    goto :goto_3

    .line 577
    :cond_0
    new-instance v12, Ll/ۖۚ֫;

    move-wide/from16 v3, p5

    invoke-direct {v12, v3, v4, p1}, Ll/ۖۚ֫;-><init>(JLl/ۡۚ֫;)V

    .line 578
    invoke-virtual {v1}, Ll/۫ۧ֫;->ܶ()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 579
    iget-object v3, v7, Ll/᩷᩻֫;->۫ۙ:Ll/֫᩻֫;

    if-eqz v3, :cond_1

    .line 580
    new-instance v4, Ll/ۗۧ֫;

    invoke-direct {v4, p0, v8}, Ll/ۗۧ֫;-><init>(Ll/᩷᩻֫;Ll/ۡۧ֫;)V

    invoke-virtual {v3, v1, v2, v4}, Ll/֫᩻֫;->ۙ(Ll/۫ۧ֫;ZLl/۟֡֫;)Ll/ۚ᩻֫;

    move-result-object v13
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v6, 0x0

    move-object v1, p0

    move-object/from16 v2, p2

    move-object v3, v13

    move-object v4, v11

    move-object v5, v12

    .line 581
    :try_start_1
    invoke-direct/range {v1 .. v6}, Ll/᩷᩻֫;->ۙ(Ll/ۡۧ֫;Ll/۫ۧ֫;Ll/۬ۧ֫;Ll/ۖۚ֫;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 582
    :try_start_2
    invoke-virtual {v13}, Ll/ۚ᩻֫;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/StackOverflowError; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 580
    :try_start_3
    invoke-virtual {v13}, Ll/ۚ᩻֫;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_4
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1

    .line 579
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "A cache directory is required for this image source"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 583
    :cond_2
    iget-object v3, v10, Ll/ۜۧ֫;->ۢ:Ll/۫ۧ֫;

    const/4 v6, 0x0

    move-object v1, p0

    move-object/from16 v2, p2

    move-object v4, v11

    move-object v5, v12

    invoke-direct/range {v1 .. v6}, Ll/᩷᩻֫;->ۙ(Ll/ۡۧ֫;Ll/۫ۧ֫;Ll/۬ۧ֫;Ll/ۖۚ֫;Z)V

    .line 585
    :goto_1
    invoke-virtual {v12}, Ll/ۖۚ֫;->᩷()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Ll/ۡۚ֫;->᩷(J)Z
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/StackOverflowError; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :cond_3
    :goto_2
    if-eqz v9, :cond_4

    goto :goto_4

    :catchall_2
    move-exception v0

    goto :goto_5

    .line 589
    :goto_3
    :try_start_5
    iput-object v0, v11, Ll/۬ۧ֫;->ܿ:Ljava/lang/Throwable;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-eqz v9, :cond_4

    .line 591
    :goto_4
    invoke-virtual/range {p4 .. p4}, Ll/۠֫֫;->close()V

    .line 593
    :cond_4
    iget-object v0, v7, Ll/᩷᩻֫;->᩷ۙ:Landroid/os/Handler;

    new-instance v9, Ll/᩵ۧ֫;

    move-object v1, v9

    move-object v2, p0

    move/from16 v3, p3

    move-object/from16 v4, p7

    move-object/from16 v5, p8

    move-object/from16 v6, p2

    move-object v7, v11

    invoke-direct/range {v1 .. v7}, Ll/᩵ۧ֫;-><init>(Ll/᩷᩻֫;ZLl/ۜۧ֫;Ll/۠֫֫;Ll/ۡۧ֫;Ll/۬ۧ֫;)V

    invoke-virtual {v0, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :goto_5
    if-eqz v9, :cond_5

    .line 591
    invoke-virtual/range {p4 .. p4}, Ll/۠֫֫;->close()V

    .line 592
    :cond_5
    throw v0
.end method

.method public static synthetic ۙ(Ll/᩷᩻֫;Ll/ۡۧ֫;Ll/۬ۧ֫;)V
    .locals 1

    const/4 v0, 0x0

    .line 378
    iput-boolean v0, p0, Ll/᩷᩻֫;->֡:Z

    if-eqz p1, :cond_0

    .line 379
    invoke-direct {p0, p1, p2}, Ll/᩷᩻֫;->ۙ(Ll/ۡۧ֫;Ll/۬ۧ֫;)V

    goto :goto_0

    .line 380
    :cond_0
    invoke-virtual {p2}, Ll/۬ۧ֫;->close()V

    .line 381
    :goto_0
    iget-boolean p1, p0, Ll/᩷᩻֫;->۟:Z

    if-nez p1, :cond_2

    iget-boolean p1, p0, Ll/᩷᩻֫;->ۤۙ:Z

    if-nez p1, :cond_1

    invoke-direct {p0}, Ll/᩷᩻֫;->۫()Ll/ۡۧ֫;

    move-result-object p1

    if-eqz p1, :cond_2

    :cond_1
    invoke-direct {p0}, Ll/᩷᩻֫;->᩹()V

    .line 382
    :cond_2
    invoke-direct {p0}, Ll/᩷᩻֫;->ܶ()V

    return-void
.end method

.method public static ۙ(Ll/᩷᩻֫;Ll/ۧۜۚ;JLl/᩹ܺ֫;Ll/ۜۧ֫;ILl/֨۠ۚ;)V
    .locals 2

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    iget-object p1, p1, Ll/ۧۜۚ;->ܰ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_2

    iget-boolean p1, p0, Ll/᩷᩻֫;->۟:Z

    if-nez p1, :cond_2

    iget-boolean p1, p0, Ll/᩷᩻֫;->ܰ:Z

    if-eqz p1, :cond_2

    iget-wide v0, p0, Ll/᩷᩻֫;->᩸ۙ:J

    cmp-long p1, v0, p2

    if-nez p1, :cond_2

    .line 186
    iget p1, p4, Ll/᩹ܺ֫;->᩸:I

    const p2, 0x7f120423

    if-ne p1, p2, :cond_0

    if-eqz p5, :cond_0

    iget-object p1, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {p1, p6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p5, :cond_0

    .line 187
    invoke-virtual {p0, p6}, Ll/᩷᩻֫;->᩸(I)V

    :cond_0
    if-eqz p5, :cond_1

    .line 188
    iget-boolean p1, p5, Ll/ۜۧ֫;->᩷:Z

    if-eqz p1, :cond_1

    .line 189
    invoke-static {p2}, Ll/᩹ܺ֫;->ۙ(I)Ll/᩹ܺ֫;

    move-result-object p0

    goto :goto_0

    .line 190
    :cond_1
    invoke-virtual {p0, p6}, Ll/᩷᩻֫;->᩷(I)Ll/ۡ֫֫;

    move-result-object p0

    invoke-virtual {p4, p0}, Ll/᩹ܺ֫;->ۙ(Ll/ۡ֫֫;)Ll/᩹ܺ֫;

    move-result-object p0

    .line 188
    :goto_0
    invoke-virtual {p7, p0}, Ll/֨۠ۚ;->accept(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public static ۙ(Ll/᩷᩻֫;ZLl/ۜۧ֫;Ll/۠֫֫;Ll/ۡۧ֫;Ll/۬ۧ֫;)V
    .locals 5

    const/4 v0, 0x0

    .line 594
    iput-object v0, p0, Ll/᩷᩻֫;->ܳۙ:Ll/ۜۧ֫;

    const-wide/16 v1, 0x0

    .line 595
    iput-wide v1, p0, Ll/᩷᩻֫;->ܺۙ:J

    .line 596
    iput-object v0, p0, Ll/᩷᩻֫;->۠:Ll/ۡۚ֫;

    if-eqz p1, :cond_2

    .line 598
    iget-boolean p1, p0, Ll/᩷᩻֫;->۟:Z

    if-nez p1, :cond_1

    iget-boolean p1, p0, Ll/᩷᩻֫;->ܰ:Z

    if-eqz p1, :cond_1

    iget-boolean p1, p2, Ll/ۜۧ֫;->᩷:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    if-eq p2, p1, :cond_1

    iget-object p1, p2, Ll/ۜۧ֫;->ۘ:Ll/۠֫֫;

    if-ne p1, p3, :cond_1

    iget-wide v1, p4, Ll/ۡۧ֫;->᩷:J

    iget-wide v3, p0, Ll/᩷᩻֫;->ۜ:J

    cmp-long p1, v1, v3

    if-nez p1, :cond_1

    iget-boolean p1, p5, Ll/۬ۧ֫;->ۢ:Z

    if-nez p1, :cond_1

    .line 600
    iget-object p1, p5, Ll/۬ۧ֫;->ܰ:Ll/۠֫֫;

    if-eqz p1, :cond_0

    .line 1255
    iput-object v0, p5, Ll/۬ۧ֫;->ܰ:Ll/۠֫֫;

    .line 601
    iput-object p1, p2, Ll/ۜۧ֫;->ۘ:Ll/۠֫֫;

    .line 602
    invoke-virtual {p3}, Ll/۠֫֫;->close()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 603
    iput-boolean p1, p2, Ll/ۜۧ֫;->ᩳ:Z

    .line 605
    :cond_1
    :goto_0
    invoke-virtual {p5}, Ll/۬ۧ֫;->close()V

    goto :goto_1

    .line 606
    :cond_2
    invoke-direct {p0, p4, p5}, Ll/᩷᩻֫;->ۙ(Ll/ۡۧ֫;Ll/۬ۧ֫;)V

    .line 607
    :goto_1
    iget-boolean p1, p0, Ll/᩷᩻֫;->۟:Z

    if-nez p1, :cond_5

    .line 608
    iget-object p1, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    if-eqz p1, :cond_3

    iget-object p1, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    const/4 p2, 0x0

    iput-boolean p2, p1, Ll/ۜۧ֫;->֫:Z

    .line 609
    :cond_3
    iget-object p1, p0, Ll/᩷᩻֫;->ۗۙ:Ll/۬ۚ֫;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 610
    :cond_4
    invoke-direct {p0}, Ll/᩷᩻֫;->᩹()V

    :cond_5
    return-void
.end method

.method private ۙ(Ll/ۡۧ֫;)Z
    .locals 5

    .line 644
    iget-boolean v0, p0, Ll/᩷᩻֫;->۟:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Ll/᩷᩻֫;->ܰ:Z

    if-eqz v0, :cond_4

    iget-wide v0, p1, Ll/ۡۧ֫;->᩷:J

    iget-wide v2, p0, Ll/᩷᩻֫;->ۜ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_4

    iget-object v0, p1, Ll/ۡۧ֫;->᩸:Ll/ۜۧ֫;

    iget-boolean v0, v0, Ll/ۜۧ֫;->᩷:Z

    if-nez v0, :cond_4

    iget-wide v0, p1, Ll/ۡۧ֫;->ۤ:J

    iget-wide v2, p0, Ll/᩷᩻֫;->᩸ۙ:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    iget-boolean v0, p0, Ll/᩷᩻֫;->ᩳ:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Ll/ۡۧ֫;->᩸:Ll/ۜۧ֫;

    iget-object v0, v0, Ll/ۜۧ֫;->ۢ:Ll/۫ۧ֫;

    .line 646
    invoke-virtual {v0}, Ll/۫ۧ֫;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Ll/ۡۧ֫;->ᩴ:Z

    if-nez v0, :cond_1

    iget-object v0, p1, Ll/ۡۧ֫;->᩸:Ll/ۜۧ֫;

    iget-object v0, v0, Ll/ۜۧ֫;->ۢ:Ll/۫ۧ֫;

    invoke-virtual {v0}, Ll/۫ۧ֫;->ܶ()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-boolean v0, p1, Ll/ۡۧ֫;->ᩴ:Z

    if-eqz v0, :cond_4

    iget-object v0, p1, Ll/ۡۧ֫;->۫:Ll/ܳ֫֫;

    if-nez v0, :cond_4

    iget-object v0, p1, Ll/ۡۧ֫;->᩸:Ll/ۜۧ֫;

    iget-object v1, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    if-ne v0, v1, :cond_4

    iget-object v0, p1, Ll/ۡۧ֫;->᩻:Ll/֡᩻֫;

    if-nez v0, :cond_4

    iget-object v0, p1, Ll/ۡۧ֫;->ۧ:Ll/ۘ᩻֫;

    if-nez v0, :cond_4

    iget-object v0, p1, Ll/ۡۧ֫;->᩸:Ll/ۜۧ֫;

    iget-object v0, v0, Ll/ۜۧ֫;->ۢ:Ll/۫ۧ֫;

    .line 647
    invoke-virtual {v0}, Ll/۫ۧ֫;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_1
    iget-object v0, p1, Ll/ۡۧ֫;->᩻:Ll/֡᩻֫;

    if-nez v0, :cond_2

    iget-object v0, p1, Ll/ۡۧ֫;->ۧ:Ll/ۘ᩻֫;

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p1, Ll/ۡۧ֫;->᩸:Ll/ۜۧ֫;

    .line 648
    invoke-direct {p0, v0}, Ll/᩷᩻֫;->᩷(Ll/ۜۧ֫;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    iget-object v0, p1, Ll/ۡۧ֫;->ۧ:Ll/ۘ᩻֫;

    if-eqz v0, :cond_5

    iget-object v0, p1, Ll/ۡۧ֫;->᩸:Ll/ۜۧ֫;

    iget-object v0, v0, Ll/ۜۧ֫;->᩸ۙ:Ljava/util/List;

    iget-object v1, p1, Ll/ۡۧ֫;->ۧ:Ll/ۘ᩻֫;

    .line 649
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    const/4 v0, 0x1

    .line 650
    iput-boolean v0, p1, Ll/ۡۧ֫;->ۙ:Z

    .line 652
    :cond_5
    iget-boolean p1, p1, Ll/ۡۧ֫;->ۙ:Z

    return p1
.end method

.method public static bridge synthetic ۙ(Ll/᩷᩻֫;Ll/ۜۧ֫;)Z
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩷᩻֫;->᩷(Ll/ۜۧ֫;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۙ(Ll/᩷᩻֫;Ll/ۡۧ֫;)Z
    .locals 0

    .line 497
    invoke-direct {p0, p1}, Ll/᩷᩻֫;->ۙ(Ll/ۡۧ֫;)Z

    move-result p0

    return p0
.end method

.method public static ۙ(Ll/᩷᩻֫;Ll/ۧۜۚ;JLl/ۜۧ֫;)Z
    .locals 1

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    iget-object p1, p1, Ll/ۧۜۚ;->ܰ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_1

    iget-boolean p1, p0, Ll/᩷᩻֫;->۟:Z

    if-nez p1, :cond_1

    iget-boolean p1, p0, Ll/᩷᩻֫;->ܰ:Z

    if-eqz p1, :cond_1

    iget-wide p0, p0, Ll/᩷᩻֫;->᩸ۙ:J

    cmp-long v0, p0, p2

    if-nez v0, :cond_1

    if-eqz p4, :cond_0

    iget-boolean p0, p4, Ll/ۜۧ֫;->᩷:Z

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private ۚ()V
    .locals 2

    const/4 v0, 0x0

    .line 688
    :try_start_0
    iget-object v1, p0, Ll/᩷᩻֫;->ۡ:Ll/ۢܺ֫;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/ۢܺ֫;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 692
    iput-object v0, p0, Ll/᩷᩻֫;->ۡ:Ll/ۢܺ֫;

    .line 693
    iput-object v0, p0, Ll/᩷᩻֫;->ۖ:Ll/ۜۧ֫;

    .line 694
    throw v1

    .line 692
    :catch_0
    :cond_0
    :goto_0
    iput-object v0, p0, Ll/᩷᩻֫;->ۡ:Ll/ۢܺ֫;

    .line 693
    iput-object v0, p0, Ll/᩷᩻֫;->ۖ:Ll/ۜۧ֫;

    return-void
.end method

.method public static bridge synthetic ۚ(Ll/᩷᩻֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩷᩻֫;->ᩳ:Z

    return p0
.end method

.method public static synthetic ۚ(Ll/᩷᩻֫;Ll/ۡۧ֫;)Z
    .locals 0

    .line 580
    invoke-direct {p0, p1}, Ll/᩷᩻֫;->ۙ(Ll/ۡۧ֫;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ۛ(Ll/᩷᩻֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩷᩻֫;->᩹()V

    return-void
.end method

.method private ۤ(Ll/ۜۧ֫;)Ll/ۡۧ֫;
    .locals 13

    if-eqz p1, :cond_a

    .line 434
    iget-boolean v0, p1, Ll/ۜۧ֫;->᩷:Z

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 435
    :cond_0
    iget-boolean v0, p1, Ll/ۜۧ֫;->۟:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    if-eq p1, v0, :cond_1

    iget-boolean v0, p0, Ll/᩷᩻֫;->ᩳ:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p1, Ll/ۜۧ֫;->ܽ:Z

    if-eqz v0, :cond_4

    .line 436
    :cond_1
    iget-object v0, p0, Ll/᩷᩻֫;->ܿ:Ll/ۖۚ֫;

    invoke-virtual {v0}, Ll/ۖۚ֫;->ۙ()J

    move-result-wide v0

    iget-object v2, p0, Ll/᩷᩻֫;->ܿ:Ll/ۖۚ֫;

    invoke-virtual {v2}, Ll/ۖۚ֫;->᩷()J

    move-result-wide v2

    sub-long/2addr v0, v2

    .line 451
    iget-boolean v2, p0, Ll/᩷᩻֫;->ᩳ:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/᩷᩻֫;->ܿ:Ll/ۖۚ֫;

    invoke-virtual {v2}, Ll/ۖۚ֫;->ۙ()J

    move-result-wide v2

    const-wide/16 v4, 0x80

    div-long/2addr v2, v4

    const-wide/32 v4, 0x100000

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    goto :goto_0

    :cond_2
    iget-wide v2, p0, Ll/᩷᩻֫;->᩶:J

    :goto_0
    cmp-long v4, v0, v2

    if-gez v4, :cond_3

    goto/16 :goto_1

    .line 437
    :cond_3
    new-instance v0, Ll/ۡۧ֫;

    iget-wide v9, p0, Ll/᩷᩻֫;->ۜ:J

    iget-wide v11, p0, Ll/᩷᩻֫;->᩸ۙ:J

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v5, v0

    move-object v6, p1

    invoke-direct/range {v5 .. v12}, Ll/ۡۧ֫;-><init>(Ll/ۜۧ֫;Ll/֡᩻֫;ZJJ)V

    return-object v0

    .line 439
    :cond_4
    iget-boolean v0, p1, Ll/ۜۧ֫;->᩸:Z

    if-nez v0, :cond_a

    iget-object v0, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    if-eq p1, v0, :cond_5

    iget-boolean v0, p1, Ll/ۜۧ֫;->ۛ:Z

    if-eqz v0, :cond_5

    goto :goto_1

    .line 441
    :cond_5
    iget-object v0, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    if-eq p1, v0, :cond_6

    iget-object v0, p1, Ll/ۜۧ֫;->ۢ:Ll/۫ۧ֫;

    invoke-virtual {v0}, Ll/۫ۧ֫;->ۙ()Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_1

    .line 442
    :cond_6
    iget-object v0, p1, Ll/ۜۧ֫;->ܺ:Ll/ۡ֫֫;

    if-nez v0, :cond_8

    iget-object v0, p0, Ll/᩷᩻֫;->ܳۙ:Ll/ۜۧ֫;

    if-ne p1, v0, :cond_7

    goto :goto_1

    :cond_7
    new-instance v0, Ll/ۡۧ֫;

    iget-wide v5, p0, Ll/᩷᩻֫;->ۜ:J

    iget-wide v7, p0, Ll/᩷᩻֫;->᩸ۙ:J

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v8}, Ll/ۡۧ֫;-><init>(Ll/ۜۧ֫;Ll/֡᩻֫;ZJJ)V

    return-object v0

    .line 443
    :cond_8
    iget-boolean v0, p1, Ll/ۜۧ֫;->ܶ:Z

    if-eqz v0, :cond_9

    new-instance v0, Ll/ۡۧ֫;

    iget-wide v5, p0, Ll/᩷᩻֫;->ۜ:J

    iget-wide v7, p0, Ll/᩷᩻֫;->᩸ۙ:J

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v8}, Ll/ۡۧ֫;-><init>(Ll/ۜۧ֫;Ll/֡᩻֫;ZJJ)V

    return-object v0

    .line 444
    :cond_9
    invoke-direct {p0}, Ll/᩷᩻֫;->ܽ()J

    move-result-wide v0

    .line 445
    iget-object v2, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    if-ne p1, v2, :cond_a

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_a

    iget-object v2, p0, Ll/᩷᩻֫;->ܿ:Ll/ۖۚ֫;

    invoke-virtual {v2}, Ll/ۖۚ֫;->ۙ()J

    move-result-wide v2

    iget-object v4, p0, Ll/᩷᩻֫;->ܿ:Ll/ۖۚ֫;

    invoke-virtual {v4}, Ll/ۖۚ֫;->᩷()J

    move-result-wide v4

    sub-long/2addr v2, v4

    cmp-long v4, v2, v0

    if-ltz v4, :cond_a

    .line 446
    new-instance v0, Ll/ۡۧ֫;

    iget-wide v9, p0, Ll/᩷᩻֫;->ۜ:J

    iget-wide v11, p0, Ll/᩷᩻֫;->᩸ۙ:J

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v5, v0

    move-object v6, p1

    invoke-direct/range {v5 .. v12}, Ll/ۡۧ֫;-><init>(Ll/ۜۧ֫;Ll/֡᩻֫;ZJJ)V

    return-object v0

    :cond_a
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public static ۤ(Ll/᩷᩻֫;)V
    .locals 8

    const/4 v0, 0x0

    .line 348
    iput-boolean v0, p0, Ll/᩷᩻֫;->᩻ۙ:Z

    .line 354
    iget-boolean v1, p0, Ll/᩷᩻֫;->۟:Z

    if-nez v1, :cond_7

    iget-boolean v1, p0, Ll/᩷᩻֫;->֡:Z

    if-eqz v1, :cond_0

    goto :goto_3

    .line 466
    :cond_0
    invoke-direct {p0}, Ll/᩷᩻֫;->ܽ()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    const/4 v5, 0x1

    cmp-long v6, v1, v3

    if-eqz v6, :cond_4

    .line 467
    iget-object v3, p0, Ll/᩷᩻֫;->ܿ:Ll/ۖۚ֫;

    invoke-virtual {v3}, Ll/ۖۚ֫;->ۙ()J

    move-result-wide v3

    iget-object v6, p0, Ll/᩷᩻֫;->ܿ:Ll/ۖۚ֫;

    invoke-virtual {v6}, Ll/ۖۚ֫;->᩷()J

    move-result-wide v6

    sub-long/2addr v3, v6

    cmp-long v6, v3, v1

    if-gez v6, :cond_4

    iget-object v1, p0, Ll/᩷᩻֫;->ܳۙ:Ll/ۜۧ֫;

    if-eqz v1, :cond_1

    goto :goto_1

    .line 468
    :cond_1
    iget-object v1, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    sub-int/2addr v1, v5

    :goto_0
    if-ltz v1, :cond_4

    .line 469
    iget-object v2, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜۧ֫;

    .line 470
    iget-object v3, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    if-eq v2, v3, :cond_3

    iget-object v3, v2, Ll/ۜۧ֫;->ۘ:Ll/۠֫֫;

    if-nez v3, :cond_2

    iget-object v3, v2, Ll/ۜۧ֫;->۫:Ll/ܳ֫֫;

    if-eqz v3, :cond_3

    :cond_2
    iget-object v3, p0, Ll/᩷᩻֫;->ۗۙ:Ll/۬ۚ֫;

    iget v2, v2, Ll/ۜۧ֫;->ۨ:I

    invoke-virtual {v3, v2}, Ll/۬ۚ֫;->᩷(I)Z

    :cond_3
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 356
    :cond_4
    :goto_1
    invoke-direct {p0}, Ll/᩷᩻֫;->ܶ()V

    .line 357
    invoke-direct {p0}, Ll/᩷᩻֫;->۫()Ll/ۡۧ֫;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 358
    iget-object v2, v1, Ll/ۡۧ֫;->᩸:Ll/ۜۧ֫;

    iget-object v3, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    if-eq v2, v3, :cond_5

    const/4 v2, 0x1

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    :goto_2
    iput-boolean v2, v1, Ll/ۡۧ֫;->ᩴ:Z

    .line 359
    :cond_6
    iput-boolean v0, p0, Ll/᩷᩻֫;->ۤۙ:Z

    .line 360
    iput-boolean v5, p0, Ll/᩷᩻֫;->֡:Z

    .line 362
    iget-object v0, p0, Ll/᩷᩻֫;->᩵ۙ:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Ll/ۢۧ֫;

    invoke-direct {v2, p0, v1}, Ll/ۢۧ֫;-><init>(Ll/᩷᩻֫;Ll/ۡۧ֫;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_7
    :goto_3
    return-void
.end method

.method public static synthetic ۤ(Ll/᩷᩻֫;Ll/ۡۧ֫;)Z
    .locals 0

    .line 486
    invoke-direct {p0, p1}, Ll/᩷᩻֫;->ۙ(Ll/ۡۧ֫;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/᩷᩻֫;)Ll/ۡۚ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷᩻֫;->۠:Ll/ۡۚ֫;

    return-object p0
.end method

.method public static synthetic ۧ(Ll/᩷᩻֫;Ll/ۡۧ֫;)Z
    .locals 0

    .line 665
    invoke-direct {p0, p1}, Ll/᩷᩻֫;->ۙ(Ll/ۡۧ֫;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ۨ(Ll/᩷᩻֫;)Ll/ۡۧ֫;
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩷᩻֫;->۫()Ll/ۡۧ֫;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ۫(Ll/᩷᩻֫;)Ll/ۖۚ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷᩻֫;->ܿ:Ll/ۖۚ֫;

    return-object p0
.end method

.method private ۫()Ll/ۡۧ֫;
    .locals 4

    .line 388
    iget-boolean v0, p0, Ll/᩷᩻֫;->ܰ:Z

    if-eqz v0, :cond_b

    iget-boolean v0, p0, Ll/᩷᩻֫;->۟:Z

    if-eqz v0, :cond_0

    goto/16 :goto_6

    .line 389
    :cond_0
    iget-object v0, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    invoke-direct {p0, v0}, Ll/᩷᩻֫;->ۤ(Ll/ۜۧ֫;)Ll/ۡۧ֫;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    .line 391
    :cond_1
    iget-boolean v0, p0, Ll/᩷᩻֫;->ᩳ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    .line 393
    :goto_0
    iget-object v2, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v0, v2, :cond_4

    .line 394
    iget-object v2, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜۧ֫;

    .line 395
    iget-object v3, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    if-eq v2, v3, :cond_3

    iget-boolean v3, v2, Ll/ۜۧ֫;->ܽ:Z

    if-nez v3, :cond_2

    goto :goto_1

    .line 396
    :cond_2
    invoke-direct {p0, v2}, Ll/᩷᩻֫;->ۤ(Ll/ۜۧ֫;)Ll/ۡۧ֫;

    move-result-object v2

    if-eqz v2, :cond_3

    return-object v2

    :cond_3
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 400
    :cond_4
    iget-object v0, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    invoke-direct {p0, v0}, Ll/᩷᩻֫;->ۙ(Ll/ۜۧ֫;)Ll/ۡۧ֫;

    move-result-object v0

    if-eqz v0, :cond_5

    return-object v0

    .line 402
    :cond_5
    iget-boolean v0, p0, Ll/᩷᩻֫;->ᩳ:Z

    if-eqz v0, :cond_8

    const/4 v0, 0x0

    :goto_2
    iget-object v2, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v0, v2, :cond_8

    .line 403
    iget-object v2, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜۧ֫;

    .line 404
    iget-object v3, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    if-eq v2, v3, :cond_7

    iget-boolean v3, v2, Ll/ۜۧ֫;->ܽ:Z

    if-nez v3, :cond_6

    goto :goto_3

    .line 405
    :cond_6
    invoke-direct {p0, v2}, Ll/᩷᩻֫;->ۙ(Ll/ۜۧ֫;)Ll/ۡۧ֫;

    move-result-object v2

    if-eqz v2, :cond_7

    return-object v2

    :cond_7
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 408
    :cond_8
    iget-boolean v0, p0, Ll/᩷᩻֫;->ᩳ:Z

    if-eqz v0, :cond_b

    :goto_4
    iget-object v0, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v1, v0, :cond_b

    .line 409
    iget-object v0, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۜۧ֫;

    .line 410
    iget-object v2, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    if-eq v0, v2, :cond_a

    iget-boolean v2, v0, Ll/ۜۧ֫;->ܽ:Z

    if-nez v2, :cond_a

    iget-object v2, v0, Ll/ۜۧ֫;->ۢ:Ll/۫ۧ֫;

    invoke-virtual {v2}, Ll/۫ۧ֫;->ۙ()Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_5

    .line 411
    :cond_9
    invoke-direct {p0, v0}, Ll/᩷᩻֫;->ۤ(Ll/ۜۧ֫;)Ll/ۡۧ֫;

    move-result-object v0

    if-eqz v0, :cond_a

    return-object v0

    :cond_a
    :goto_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_b
    :goto_6
    const/4 v0, 0x0

    return-object v0
.end method

.method public static synthetic ۫(Ll/᩷᩻֫;Ll/ۡۧ֫;)Z
    .locals 0

    .line 638
    invoke-direct {p0, p1}, Ll/᩷᩻֫;->ۙ(Ll/ۡۧ֫;)Z

    move-result p0

    return p0
.end method

.method public static ܳ()V
    .locals 2

    .line 339
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Gallery UI access off main thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static bridge synthetic ܳ(Ll/᩷᩻֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩷᩻֫;->ܰ:Z

    return p0
.end method

.method public static synthetic ܳ(Ll/᩷᩻֫;Ll/ۡۧ֫;)Z
    .locals 0

    .line 634
    invoke-direct {p0, p1}, Ll/᩷᩻֫;->ۙ(Ll/ۡۧ֫;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ܶ(Ll/᩷᩻֫;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/᩷᩻֫;->ܺۙ:J

    return-wide v0
.end method

.method private ܶ()V
    .locals 22

    move-object/from16 v10, p0

    .line 546
    iget-boolean v0, v10, Ll/᩷᩻֫;->۟:Z

    if-nez v0, :cond_10

    iget-boolean v0, v10, Ll/᩷᩻֫;->ܰ:Z

    if-eqz v0, :cond_10

    iget-object v0, v10, Ll/᩷᩻֫;->ܳۙ:Ll/ۜۧ֫;

    if-nez v0, :cond_10

    iget-object v0, v10, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    if-eqz v0, :cond_10

    iget-object v0, v10, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    iget-object v0, v0, Ll/ۜۧ֫;->ܺ:Ll/ۡ֫֫;

    if-nez v0, :cond_0

    iget-object v0, v10, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    iget-boolean v0, v0, Ll/ۜۧ֫;->᩸:Z

    if-eqz v0, :cond_10

    :cond_0
    iget-object v0, v10, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    iget-boolean v0, v0, Ll/ۜۧ֫;->ܶ:Z

    if-eqz v0, :cond_1

    goto/16 :goto_b

    .line 526
    :cond_1
    iget-boolean v0, v10, Ll/᩷᩻֫;->ᩳ:Z

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-nez v0, :cond_6

    iget-boolean v0, v10, Ll/᩷᩻֫;->ܰ:Z

    if-eqz v0, :cond_6

    iget-boolean v0, v10, Ll/᩷᩻֫;->۟:Z

    if-nez v0, :cond_6

    invoke-direct/range {p0 .. p0}, Ll/᩷᩻֫;->ܽ()J

    move-result-wide v5

    cmp-long v0, v5, v1

    if-lez v0, :cond_2

    goto/16 :goto_3

    .line 527
    :cond_2
    iget-object v0, v10, Ll/᩷᩻֫;->ܿ:Ll/ۖۚ֫;

    invoke-virtual {v0}, Ll/ۖۚ֫;->ۙ()J

    move-result-wide v5

    iget-object v0, v10, Ll/᩷᩻֫;->ܿ:Ll/ۖۚ֫;

    invoke-virtual {v0}, Ll/ۖۚ֫;->᩷()J

    move-result-wide v7

    sub-long/2addr v5, v7

    const/4 v0, 0x0

    .line 529
    :goto_0
    iget-object v7, v10, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    move-result v7

    if-ge v0, v7, :cond_4

    .line 530
    iget-object v7, v10, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v7, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۜۧ֫;

    .line 531
    invoke-direct {v10, v7}, Ll/᩷᩻֫;->᩸(Ll/ۜۧ֫;)J

    move-result-wide v8

    .line 532
    iget-object v11, v10, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    if-eq v7, v11, :cond_3

    cmp-long v11, v8, v1

    if-lez v11, :cond_3

    cmp-long v11, v8, v5

    if-gtz v11, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 534
    :cond_4
    iget-wide v7, v10, Ll/᩷᩻֫;->ۧۙ:J

    cmp-long v0, v5, v7

    if-ltz v0, :cond_6

    const/4 v0, 0x0

    :goto_1
    iget-object v5, v10, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v5

    if-ge v0, v5, :cond_6

    .line 535
    iget-object v5, v10, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Ll/ۜۧ֫;

    .line 536
    iget-object v5, v10, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    if-eq v7, v5, :cond_5

    iget-boolean v5, v7, Ll/ۜۧ֫;->᩷:Z

    if-nez v5, :cond_5

    iget-boolean v5, v7, Ll/ۜۧ֫;->᩸:Z

    if-nez v5, :cond_5

    iget-boolean v5, v7, Ll/ۜۧ֫;->ۛ:Z

    if-nez v5, :cond_5

    iget-object v5, v7, Ll/ۜۧ֫;->ܺ:Ll/ۡ֫֫;

    if-nez v5, :cond_5

    iget-object v5, v7, Ll/ۜۧ֫;->ۢ:Ll/۫ۧ֫;

    invoke-virtual {v5}, Ll/۫ۧ֫;->ۙ()Z

    move-result v5

    if-eqz v5, :cond_5

    :goto_2
    move-object v8, v7

    goto :goto_4

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_6
    :goto_3
    move-object v8, v4

    :goto_4
    if-nez v8, :cond_7

    goto/16 :goto_b

    .line 550
    :cond_7
    iget-object v9, v8, Ll/ۜۧ֫;->ۘ:Ll/۠֫֫;

    const/4 v0, 0x1

    if-eqz v9, :cond_8

    const/4 v3, 0x1

    const/4 v5, 0x1

    goto :goto_5

    :cond_8
    const/4 v5, 0x0

    :goto_5
    if-eqz v5, :cond_9

    .line 552
    invoke-direct {v10, v8}, Ll/᩷᩻֫;->᩸(Ll/ۜۧ֫;)J

    move-result-wide v6

    goto :goto_6

    :cond_9
    iget-wide v6, v10, Ll/᩷᩻֫;->ۧۙ:J

    .line 554
    :goto_6
    iget-object v3, v10, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    iget-boolean v3, v3, Ll/ۜۧ֫;->ܿ:Z

    if-eqz v3, :cond_b

    iget-object v3, v10, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    iget-object v3, v3, Ll/ۜۧ֫;->۫:Ll/ܳ֫֫;

    if-eqz v3, :cond_a

    iget-object v3, v10, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    iget-object v3, v3, Ll/ۜۧ֫;->۫:Ll/ܳ֫֫;

    .line 555
    invoke-virtual {v3}, Ll/ܳ֫֫;->ۙ()Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_7

    .line 557
    :cond_a
    iget-wide v11, v10, Ll/᩷᩻֫;->᩶:J

    iget-object v3, v10, Ll/᩷᩻֫;->ܿ:Ll/ۖۚ֫;

    invoke-virtual {v3}, Ll/ۖۚ֫;->ۙ()J

    move-result-wide v13

    iget-object v3, v10, Ll/᩷᩻֫;->ܿ:Ll/ۖۚ֫;

    invoke-virtual {v3}, Ll/ۖۚ֫;->᩷()J

    move-result-wide v15

    sub-long/2addr v13, v15

    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v11

    goto :goto_8

    .line 556
    :cond_b
    :goto_7
    iget-wide v11, v10, Ll/᩷᩻֫;->ۧۙ:J

    :goto_8
    move-wide/from16 v19, v11

    .line 558
    iget-object v3, v10, Ll/᩷᩻֫;->ܿ:Ll/ۖۚ֫;

    invoke-virtual {v3, v6, v7}, Ll/ۖۚ֫;->ۙ(J)Ll/ۡۚ֫;

    move-result-object v3

    if-nez v3, :cond_c

    goto :goto_b

    :cond_c
    if-eqz v5, :cond_d

    .line 560
    invoke-virtual {v9}, Ll/۠֫֫;->۠᩷()Ll/۠֫֫;

    move-result-object v11

    move-object/from16 v21, v11

    goto :goto_9

    :cond_d
    move-object/from16 v21, v4

    .line 561
    :goto_9
    iput-object v8, v10, Ll/᩷᩻֫;->ܳۙ:Ll/ۜۧ֫;

    if-eqz v5, :cond_e

    move-wide v1, v6

    .line 562
    :cond_e
    iput-wide v1, v10, Ll/᩷᩻֫;->ܺۙ:J

    if-eqz v5, :cond_f

    goto :goto_a

    :cond_f
    move-object v4, v3

    .line 563
    :goto_a
    iput-object v4, v10, Ll/᩷᩻֫;->۠:Ll/ۡۚ֫;

    .line 564
    new-instance v4, Ll/ۡۧ֫;

    iget-wide v1, v10, Ll/᩷᩻֫;->ۜ:J

    iget-wide v6, v10, Ll/᩷᩻֫;->᩸ۙ:J

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v11, v4

    move-object v12, v8

    move-wide v15, v1

    move-wide/from16 v17, v6

    invoke-direct/range {v11 .. v18}, Ll/ۡۧ֫;-><init>(Ll/ۜۧ֫;Ll/֡᩻֫;ZJJ)V

    .line 565
    iput-boolean v0, v4, Ll/ۡۧ֫;->ᩴ:Z

    .line 566
    iget-object v11, v10, Ll/᩷᩻֫;->ۚۙ:Ljava/util/concurrent/ExecutorService;

    new-instance v12, Ll/ܺۧ֫;

    move-object v0, v12

    move-object/from16 v1, p0

    move-object v2, v3

    move-object v3, v4

    move v4, v5

    move-object/from16 v5, v21

    move-wide/from16 v6, v19

    invoke-direct/range {v0 .. v9}, Ll/ܺۧ֫;-><init>(Ll/᩷᩻֫;Ll/ۡۚ֫;Ll/ۡۧ֫;ZLl/۠֫֫;JLl/ۜۧ֫;Ll/۠֫֫;)V

    invoke-interface {v11, v12}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_10
    :goto_b
    return-void
.end method

.method public static bridge synthetic ܺ(Ll/᩷᩻֫;)Landroid/util/SparseArray;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    return-object p0
.end method

.method private ܽ()J
    .locals 6

    .line 457
    iget-boolean v0, p0, Ll/᩷᩻֫;->ᩳ:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Ll/᩷᩻֫;->ܰ:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    if-eqz v0, :cond_4

    iget-object v0, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    iget-boolean v0, v0, Ll/ۜۧ֫;->᩷:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 458
    :cond_0
    iget-object v0, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    iget-boolean v0, v0, Ll/ۜۧ֫;->۟:Z

    if-eqz v0, :cond_2

    .line 451
    iget-boolean v0, p0, Ll/᩷᩻֫;->ᩳ:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩷᩻֫;->ܿ:Ll/ۖۚ֫;

    invoke-virtual {v0}, Ll/ۖۚ֫;->ۙ()J

    move-result-wide v0

    const-wide/16 v2, 0x80

    div-long/2addr v0, v2

    const-wide/32 v2, 0x100000

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0

    :cond_1
    iget-wide v0, p0, Ll/᩷᩻֫;->᩶:J

    return-wide v0

    .line 459
    :cond_2
    iget-object v0, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    iget-object v0, v0, Ll/ۜۧ֫;->۫:Ll/ܳ֫֫;

    if-eqz v0, :cond_4

    iget-object v0, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    iget-boolean v0, v0, Ll/ۜۧ֫;->ۜ:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    iget-boolean v0, v0, Ll/ۜۧ֫;->ܶ:Z

    if-eqz v0, :cond_3

    goto :goto_0

    .line 460
    :cond_3
    iget-object v0, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    iget-object v0, v0, Ll/ۜۧ֫;->۫:Ll/ܳ֫֫;

    invoke-virtual {v0}, Ll/ܳ֫֫;->ܳ()J

    move-result-wide v0

    .line 461
    iget-object v2, p0, Ll/᩷᩻֫;->ܿ:Ll/ۖۚ֫;

    invoke-virtual {v2}, Ll/ۖۚ֫;->ۙ()J

    move-result-wide v2

    iget-object v4, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    iget-object v4, v4, Ll/ۜۧ֫;->۫:Ll/ܳ֫֫;

    invoke-virtual {v4}, Ll/ܳ֫֫;->᩷()J

    move-result-wide v4

    sub-long/2addr v2, v4

    cmp-long v4, v0, v2

    if-gtz v4, :cond_4

    return-wide v0

    :cond_4
    :goto_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public static bridge synthetic ܽ(Ll/᩷᩻֫;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/᩷᩻֫;->ۧۙ:J

    return-wide v0
.end method

.method public static synthetic ᩴ(Ll/᩷᩻֫;)V
    .locals 0

    .line 334
    iget-object p0, p0, Ll/᩷᩻֫;->۫ۙ:Ll/֫᩻֫;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ll/֫᩻֫;->close()V

    :cond_0
    return-void
.end method

.method public static synthetic ᩴ(Ll/᩷᩻֫;Ll/ۡۧ֫;)Z
    .locals 0

    .line 625
    invoke-direct {p0, p1}, Ll/᩷᩻֫;->ۙ(Ll/ۡۧ֫;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ᩵(Ll/᩷᩻֫;)Ll/۬ۚ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷᩻֫;->ۗۙ:Ll/۬ۚ֫;

    return-object p0
.end method

.method private ᩷(Ll/ۡۧ֫;)Ll/۫ۧ֫;
    .locals 6

    .line 660
    iget-object v0, p1, Ll/ۡۧ֫;->᩸:Ll/ۜۧ֫;

    .line 661
    iget-object v1, v0, Ll/ۜۧ֫;->ۢ:Ll/۫ۧ֫;

    invoke-virtual {v1}, Ll/۫ۧ֫;->ܶ()Z

    move-result v2

    if-nez v2, :cond_0

    return-object v1

    .line 662
    :cond_0
    iget-object v2, p0, Ll/᩷᩻֫;->֫ۙ:Ljava/util/IdentityHashMap;

    invoke-virtual {v2, v0}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۚ᩻֫;

    if-nez v3, :cond_2

    .line 664
    iget-object v3, p0, Ll/᩷᩻֫;->ܽۙ:Ll/֫᩻֫;

    if-eqz v3, :cond_1

    .line 665
    iget-boolean v4, p1, Ll/ۡۧ֫;->ᩴ:Z

    xor-int/lit8 v4, v4, 0x1

    new-instance v5, Ll/ۨۧ֫;

    invoke-direct {v5, p0, p1}, Ll/ۨۧ֫;-><init>(Ll/᩷᩻֫;Ll/ۡۧ֫;)V

    invoke-virtual {v3, v1, v4, v5}, Ll/֫᩻֫;->ۙ(Ll/۫ۧ֫;ZLl/۟֡֫;)Ll/ۚ᩻֫;

    move-result-object p1

    .line 666
    invoke-virtual {v2, v0, p1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1

    .line 664
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "A cache directory is required for this image source"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-object v3
.end method

.method private ᩷(Ll/ۡۧ֫;Ll/۬ۧ֫;)V
    .locals 10

    .line 617
    iget-object v0, p1, Ll/ۡۧ֫;->᩸:Ll/ۜۧ֫;

    iget-object v1, p1, Ll/ۡۧ֫;->᩻:Ll/֡᩻֫;

    .line 618
    invoke-direct {p0, p1}, Ll/᩷᩻֫;->ۙ(Ll/ۡۧ֫;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    const/4 v2, 0x0

    .line 619
    iput-boolean v2, p2, Ll/۬ۧ֫;->ۢ:Z

    .line 620
    iget-boolean v3, p1, Ll/ۡۧ֫;->ܺ:Z

    if-eqz v3, :cond_4

    .line 621
    iget-boolean p1, p1, Ll/ۡۧ֫;->ܳ:Z

    if-eqz p1, :cond_1

    iget-object p1, v0, Ll/ۜۧ֫;->ۢ:Ll/۫ۧ֫;

    invoke-virtual {p1}, Ll/۫ۧ֫;->ܽ()Z

    move-result p1

    if-nez p1, :cond_2

    :cond_1
    iget-object p1, v0, Ll/ۜۧ֫;->ܺ:Ll/ۡ֫֫;

    iget-object p1, p1, Ll/ۡ֫֫;->ۚ:Ll/ܳۧ֫;

    iget-object v0, v0, Ll/ۜۧ֫;->ۢ:Ll/۫ۧ֫;

    .line 622
    invoke-virtual {v0}, Ll/۫ۧ֫;->ۗ()Ll/ܳۧ֫;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ܳۧ֫;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    :cond_2
    const/4 v2, 0x1

    :cond_3
    iput-boolean v2, p2, Ll/۬ۧ֫;->᩶:Z

    return-void

    .line 623
    :cond_4
    iget-object v2, p1, Ll/ۡۧ֫;->ۧ:Ll/ۘ᩻֫;

    if-eqz v2, :cond_5

    .line 624
    iget-object v3, p1, Ll/ۡۧ֫;->ۚ:Ll/ܳ֫֫;

    iget-object v4, v2, Ll/ۘ᩻֫;->ᩴ:Landroid/graphics/RectF;

    iget v5, v2, Ll/ۘ᩻֫;->۫:F

    iget-wide v7, p1, Ll/ۡۧ֫;->֫:J

    new-instance v9, Ll/ܽۧ֫;

    invoke-direct {v9, p0, p1}, Ll/ܽۧ֫;-><init>(Ll/᩷᩻֫;Ll/ۡۧ֫;)V

    iget-object v6, p0, Ll/᩷᩻֫;->ܿ:Ll/ۖۚ֫;

    invoke-virtual/range {v3 .. v9}, Ll/ܳ֫֫;->ۙ(Landroid/graphics/RectF;FLl/ۖۚ֫;JLl/ܽۧ֫;)Ll/۠֫֫;

    move-result-object p1

    iput-object p1, p2, Ll/۬ۧ֫;->ܰ:Ll/۠֫֫;

    return-void

    :cond_5
    if-nez v1, :cond_6

    .line 627
    invoke-direct {p0, p1}, Ll/᩷᩻֫;->᩷(Ll/ۡۧ֫;)Ll/۫ۧ֫;

    move-result-object v2

    .line 628
    iget-object v4, p0, Ll/᩷᩻֫;->ܿ:Ll/ۖۚ֫;

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Ll/᩷᩻֫;->ۙ(Ll/ۡۧ֫;Ll/۫ۧ֫;Ll/۬ۧ֫;Ll/ۖۚ֫;Z)V

    return-void

    .line 630
    :cond_6
    iget-object v2, p0, Ll/᩷᩻֫;->ۖ:Ll/ۜۧ֫;

    iget-object v3, p0, Ll/᩷᩻֫;->ܿ:Ll/ۖۚ֫;

    if-eq v2, v0, :cond_8

    .line 631
    invoke-direct {p0}, Ll/᩷᩻֫;->ۚ()V

    .line 632
    invoke-direct {p0, p1}, Ll/᩷᩻֫;->᩷(Ll/ۡۧ֫;)Ll/۫ۧ֫;

    move-result-object v2

    .line 633
    iget-object v4, v0, Ll/ۜۧ֫;->ܺ:Ll/ۡ֫֫;

    iget-object v5, v4, Ll/ۡ֫֫;->۫:Ll/֨ۧܺ;

    if-nez v5, :cond_7

    invoke-static {v2, v4}, Ll/ۢܺ֫;->ۙ(Ll/۫ۧ֫;Ll/ۡ֫֫;)Ll/ۢܺ֫;

    move-result-object v2

    goto :goto_0

    .line 634
    :cond_7
    new-instance v5, Ll/ܶۧ֫;

    invoke-direct {v5, p0, p1}, Ll/ܶۧ֫;-><init>(Ll/᩷᩻֫;Ll/ۡۧ֫;)V

    invoke-static {v2, v4, v3, v5}, Ll/ۢܺ֫;->ۙ(Ll/۫ۧ֫;Ll/ۡ֫֫;Ll/ۖۚ֫;Ll/۟֡֫;)Ll/ۢܺ֫;

    move-result-object v2

    :goto_0
    iput-object v2, p0, Ll/᩷᩻֫;->ۡ:Ll/ۢܺ֫;

    .line 635
    iput-object v0, p0, Ll/᩷᩻֫;->ۖ:Ll/ۜۧ֫;

    .line 638
    :cond_8
    iget-object v0, p0, Ll/᩷᩻֫;->ۡ:Ll/ۢܺ֫;

    new-instance v2, Landroid/graphics/Rect;

    iget v4, v1, Ll/֡᩻֫;->ܳ:I

    iget v5, v1, Ll/֡᩻֫;->֫:I

    iget v6, v1, Ll/֡᩻֫;->۫:I

    iget v7, v1, Ll/֡᩻֫;->ۙ:I

    invoke-direct {v2, v4, v5, v6, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    iget v1, v1, Ll/֡᩻֫;->ۚ:I

    new-instance v4, Ll/᩹ۧ֫;

    invoke-direct {v4, p0, p1}, Ll/᩹ۧ֫;-><init>(Ll/᩷᩻֫;Ll/ۡۧ֫;)V

    invoke-virtual {v0, v2, v1, v3, v4}, Ll/ۢܺ֫;->ۙ(Landroid/graphics/Rect;ILl/ۖۚ֫;Ll/۟֡֫;)Ll/۠֫֫;

    move-result-object p1

    iput-object p1, p2, Ll/۬ۧ֫;->ܰ:Ll/۠֫֫;

    return-void
.end method

.method public static synthetic ᩷(Ll/᩷᩻֫;)V
    .locals 1

    .line 329
    invoke-direct {p0}, Ll/᩷᩻֫;->ۚ()V

    const/4 v0, 0x1

    .line 330
    invoke-direct {p0, v0}, Ll/᩷᩻֫;->᩷(Z)V

    .line 331
    iget-object p0, p0, Ll/᩷᩻֫;->ܽۙ:Ll/֫᩻֫;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ll/֫᩻֫;->close()V

    :cond_0
    return-void
.end method

.method private ᩷(Z)V
    .locals 4

    .line 673
    iget-object v0, p0, Ll/᩷᩻֫;->֫ۙ:Ljava/util/IdentityHashMap;

    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 674
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 675
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 676
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜۧ֫;

    if-nez p1, :cond_1

    .line 677
    iget-boolean v3, v2, Ll/ۜۧ֫;->᩷:Z

    if-nez v3, :cond_1

    invoke-direct {p0, v2}, Ll/᩷᩻֫;->᩷(Ll/ۜۧ֫;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 679
    :cond_1
    iget-object v3, p0, Ll/᩷᩻֫;->ۖ:Ll/ۜۧ֫;

    if-ne v3, v2, :cond_2

    invoke-direct {p0}, Ll/᩷᩻֫;->ۚ()V

    .line 680
    :cond_2
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚ᩻֫;

    invoke-virtual {v1}, Ll/ۚ᩻֫;->close()V

    .line 681
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_3
    return-void
.end method

.method private ᩷(Ll/ۜۧ֫;)Z
    .locals 1

    .line 656
    iget-boolean v0, p0, Ll/᩷᩻֫;->ᩳ:Z

    if-eqz v0, :cond_0

    iget-boolean p1, p1, Ll/ۜۧ֫;->ܽ:Z

    return p1

    :cond_0
    iget-object v0, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public static synthetic ᩷(Ll/᩷᩻֫;Ll/ۡۧ֫;)Z
    .locals 0

    .line 479
    invoke-direct {p0, p1}, Ll/᩷᩻֫;->ۙ(Ll/ۡۧ֫;)Z

    move-result p0

    return p0
.end method

.method private ᩸(Ll/ۜۧ֫;)J
    .locals 6

    .line 518
    iget-object v0, p1, Ll/ۜۧ֫;->ۘ:Ll/۠֫֫;

    if-eqz v0, :cond_2

    iget-boolean v1, p1, Ll/ۜۧ֫;->ᩳ:Z

    if-nez v1, :cond_2

    iget-object v0, v0, Ll/۠֫֫;->ܰ:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result v0

    int-to-long v0, v0

    iget-wide v2, p0, Ll/᩷᩻֫;->ۧۙ:J

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x2

    .line 520
    :goto_0
    iget-object v1, p1, Ll/ۜۧ֫;->ۘ:Ll/۠֫֫;

    iget-object v1, v1, Ll/۠֫֫;->ܰ:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    iget-object v4, p1, Ll/ۜۧ֫;->ۘ:Ll/۠֫֫;

    iget-object v4, v4, Ll/۠֫֫;->ܰ:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    invoke-static {v1, v4, v0}, Ll/۬֫֫;->ۙ(III)J

    move-result-wide v4

    cmp-long v1, v4, v2

    if-lez v1, :cond_1

    mul-int/lit8 v0, v0, 0x2

    goto :goto_0

    .line 522
    :cond_1
    iget-object v1, p1, Ll/ۜۧ֫;->ۘ:Ll/۠֫֫;

    iget-object v1, v1, Ll/۠֫֫;->ܰ:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    iget-object p1, p1, Ll/ۜۧ֫;->ۘ:Ll/۠֫֫;

    iget-object p1, p1, Ll/۠֫֫;->ܰ:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    invoke-static {v1, p1, v0}, Ll/۬֫֫;->ۙ(III)J

    move-result-wide v0

    return-wide v0

    :cond_2
    :goto_1
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public static synthetic ᩸(Ll/᩷᩻֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩷᩻֫;->᩹()V

    return-void
.end method

.method public static synthetic ᩸(Ll/᩷᩻֫;Ll/ۡۧ֫;)Z
    .locals 0

    .line 504
    invoke-direct {p0, p1}, Ll/᩷᩻֫;->ۙ(Ll/ۡۧ֫;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ᩹(Ll/᩷᩻֫;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷᩻֫;->ܶۙ:Ljava/util/ArrayList;

    return-object p0
.end method

.method private ᩹()V
    .locals 3

    .line 343
    iget-boolean v0, p0, Ll/᩷᩻֫;->۟:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 344
    iput-boolean v0, p0, Ll/᩷᩻֫;->ۤۙ:Z

    .line 345
    iget-boolean v1, p0, Ll/᩷᩻֫;->᩻ۙ:Z

    if-eqz v1, :cond_1

    :goto_0
    return-void

    .line 346
    :cond_1
    iput-boolean v0, p0, Ll/᩷᩻֫;->᩻ۙ:Z

    .line 347
    iget-object v0, p0, Ll/᩷᩻֫;->᩷ۙ:Landroid/os/Handler;

    new-instance v1, Ll/᩹ۤۤ;

    const/4 v2, 0x5

    invoke-direct {v1, v2, p0}, Ll/᩹ۤۤ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static bridge synthetic ᩻(Ll/᩷᩻֫;)Landroid/os/Handler;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷᩻֫;->᩷ۙ:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic ᩻(Ll/᩷᩻֫;Ll/ۡۧ֫;)V
    .locals 3

    .line 363
    new-instance v0, Ll/۬ۧ֫;

    invoke-direct {v0}, Ll/۬ۧ֫;-><init>()V

    .line 365
    :try_start_0
    iget-object v1, p0, Ll/᩷᩻֫;->ۖ:Ll/ۜۧ֫;

    if-nez p1, :cond_0

    iget-object v2, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    goto :goto_0

    :cond_0
    iget-object v2, p1, Ll/ۡۧ֫;->᩸:Ll/ۜۧ֫;

    :goto_0
    if-ne v1, v2, :cond_1

    iget-boolean v1, p0, Ll/᩷᩻֫;->ܰ:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/᩷᩻֫;->ۖ:Ll/ۜۧ֫;

    if-eqz v1, :cond_2

    iget-boolean v1, v1, Ll/ۜۧ֫;->᩷:Z

    if-eqz v1, :cond_2

    :cond_1
    invoke-direct {p0}, Ll/᩷᩻֫;->ۚ()V

    :cond_2
    const/4 v1, 0x0

    .line 366
    invoke-direct {p0, v1}, Ll/᩷᩻֫;->᩷(Z)V

    if-eqz p1, :cond_3

    .line 367
    iget-object v1, p1, Ll/ۡۧ֫;->᩸:Ll/ۜۧ֫;

    iget-boolean v1, v1, Ll/ۜۧ֫;->᩷:Z

    if-nez v1, :cond_3

    iget-boolean v1, p0, Ll/᩷᩻֫;->ܰ:Z

    if-eqz v1, :cond_3

    iget-boolean v1, p0, Ll/᩷᩻֫;->۟:Z

    if-nez v1, :cond_3

    invoke-direct {p0, p1, v0}, Ll/᩷᩻֫;->᩷(Ll/ۡۧ֫;Ll/۬ۧ֫;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v1

    goto :goto_1

    :catch_1
    move-exception v1

    goto :goto_1

    :catch_2
    move-exception v1

    goto :goto_1

    :catch_3
    move-exception v1

    .line 370
    :goto_1
    iput-object v1, v0, Ll/۬ۧ֫;->ܿ:Ljava/lang/Throwable;

    if-eqz p1, :cond_3

    .line 371
    iget-object v1, p1, Ll/ۡۧ֫;->᩻:Ll/֡᩻֫;

    if-nez v1, :cond_3

    iget-object v1, p0, Ll/᩷᩻֫;->ۖ:Ll/ۜۧ֫;

    iget-object v2, p1, Ll/ۡۧ֫;->᩸:Ll/ۜۧ֫;

    if-ne v1, v2, :cond_3

    invoke-direct {p0}, Ll/᩷᩻֫;->ۚ()V

    .line 373
    :cond_3
    :goto_2
    iget-boolean v1, p0, Ll/᩷᩻֫;->۟:Z

    if-nez v1, :cond_4

    if-eqz p1, :cond_5

    iget-object v1, p1, Ll/ۡۧ֫;->᩸:Ll/ۜۧ֫;

    iget-boolean v1, v1, Ll/ۜۧ֫;->᩷:Z

    if-eqz v1, :cond_5

    .line 374
    :cond_4
    invoke-virtual {v0}, Ll/۬ۧ֫;->close()V

    .line 375
    invoke-direct {p0}, Ll/᩷᩻֫;->ۚ()V

    .line 377
    :cond_5
    iget-object v1, p0, Ll/᩷᩻֫;->᩷ۙ:Landroid/os/Handler;

    new-instance v2, Ll/᩻ۧ֫;

    invoke-direct {v2, p0, p1, v0}, Ll/᩻ۧ֫;-><init>(Ll/᩷᩻֫;Ll/ۡۧ֫;Ll/۬ۧ֫;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 316
    invoke-static {}, Ll/᩷᩻֫;->ܳ()V

    .line 317
    iget-boolean v0, p0, Ll/᩷᩻֫;->۟:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 318
    iput-boolean v0, p0, Ll/᩷᩻֫;->۟:Z

    .line 319
    iget-object v0, p0, Ll/᩷᩻֫;->ܿ:Ll/ۖۚ֫;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ۖۚ֫;->ۙ(Ll/ۙۨܳ;)V

    const/4 v0, 0x0

    .line 320
    iput-boolean v0, p0, Ll/᩷᩻֫;->ܰ:Z

    .line 321
    iput-object v1, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    .line 322
    iput-object v1, p0, Ll/᩷᩻֫;->۬:Ll/ۚۜۚ;

    .line 323
    iget-object v2, p0, Ll/᩷᩻֫;->ۗۙ:Ll/۬ۚ֫;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ll/۬ۚ֫;->ᩴ()V

    .line 324
    :cond_1
    iput-object v1, p0, Ll/᩷᩻֫;->ۗۙ:Ll/۬ۚ֫;

    .line 325
    :goto_0
    iget-object v1, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜۧ֫;

    invoke-virtual {v1}, Ll/ۜۧ֫;->close()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 326
    :cond_2
    iget-object v0, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 328
    iget-object v0, p0, Ll/᩷᩻֫;->᩵ۙ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/۠۠ۧ;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p0}, Ll/۠۠ۧ;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 333
    iget-object v0, p0, Ll/᩷᩻֫;->᩵ۙ:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 334
    iget-object v0, p0, Ll/᩷᩻֫;->ۚۙ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/ۖ᩺᩻;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/ۖ᩺᩻;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 335
    iget-object v0, p0, Ll/᩷᩻֫;->ۚۙ:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    return-void
.end method

.method public final getCount()I
    .locals 1

    .line 135
    iget-object v0, p0, Ll/᩷᩻֫;->ܶۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final getItemId(I)J
    .locals 4

    int-to-long v0, p1

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final onPageSelected(I)V
    .locals 4

    .line 205
    invoke-static {}, Ll/᩷᩻֫;->ܳ()V

    .line 206
    iget-wide v0, p0, Ll/᩷᩻֫;->᩸ۙ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩷᩻֫;->᩸ۙ:J

    .line 207
    iput p1, p0, Ll/᩷᩻֫;->֨:I

    .line 208
    iget-object v0, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۜۧ֫;

    iput-object p1, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    .line 209
    iget-object p1, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 210
    iget-object p1, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    iput-boolean v0, p1, Ll/ۜۧ֫;->ۜ:Z

    .line 211
    iget-object p1, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    iget-object p1, p1, Ll/ۜۧ֫;->ܺ:Ll/ۡ֫֫;

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    iput-boolean v1, p1, Ll/ۜۧ֫;->ܶ:Z

    .line 213
    :cond_0
    iget-object p1, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    iget-boolean v2, p1, Ll/ۜۧ֫;->ܰ:Z

    iget-object v3, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    iget-boolean v3, v3, Ll/ۜۧ֫;->᩷ۙ:Z

    or-int/2addr v2, v3

    iput-boolean v2, p1, Ll/ۜۧ֫;->ܰ:Z

    .line 214
    iget-object p1, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    iput-boolean v1, p1, Ll/ۜۧ֫;->᩷ۙ:Z

    :cond_1
    const/4 p1, 0x0

    .line 216
    :goto_0
    iget-object v1, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge p1, v1, :cond_3

    .line 217
    iget-object v1, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜۧ֫;

    .line 218
    iget-boolean v2, p0, Ll/᩷᩻֫;->ᩳ:Z

    if-nez v2, :cond_2

    iget-object v2, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    if-eq v1, v2, :cond_2

    invoke-virtual {v1}, Ll/ۜۧ֫;->᩷()V

    .line 219
    :cond_2
    invoke-virtual {v1}, Ll/ۜۧ֫;->᩸()V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    .line 222
    :goto_1
    iget-object v1, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge p1, v1, :cond_4

    iget-object v1, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜۧ֫;

    iput-boolean v0, v1, Ll/ۜۧ֫;->ᩳ:Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 223
    :cond_4
    invoke-direct {p0}, Ll/᩷᩻֫;->᩹()V

    return-void
.end method

.method public final ۙ()V
    .locals 6

    .line 228
    iget-boolean v0, p0, Ll/᩷᩻֫;->ᩳ:Z

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Ll/᩷᩻֫;->۟:Z

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 230
    :goto_0
    iget-object v3, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-ge v1, v3, :cond_3

    .line 231
    iget-object v3, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۜۧ֫;

    .line 232
    iget-object v4, p0, Ll/᩷᩻֫;->ۗۙ:Ll/۬ۚ֫;

    iget v5, v3, Ll/ۜۧ֫;->ۨ:I

    invoke-virtual {v4, v5}, Ll/۬ۚ֫;->ۙ(I)Z

    move-result v4

    .line 233
    iget-boolean v5, v3, Ll/ۜۧ֫;->ܽ:Z

    if-eq v5, v4, :cond_2

    .line 234
    iput-boolean v4, v3, Ll/ۜۧ֫;->ܽ:Z

    if-nez v4, :cond_1

    .line 235
    invoke-virtual {v3}, Ll/ۜۧ֫;->᩷()V

    :cond_1
    const/4 v2, 0x1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    if-eqz v2, :cond_4

    const/4 v1, 0x0

    .line 241
    :goto_1
    iget-object v2, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    iget-object v2, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜۧ֫;

    iput-boolean v0, v2, Ll/ۜۧ֫;->֫:Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 243
    :cond_4
    invoke-direct {p0}, Ll/᩷᩻֫;->᩹()V

    :cond_5
    :goto_2
    return-void
.end method

.method public final ۙ(IJ)V
    .locals 4

    .line 263
    invoke-static {}, Ll/᩷᩻֫;->ܳ()V

    .line 264
    iget-object v0, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۜۧ֫;

    if-eqz v0, :cond_1

    .line 265
    iget-wide v1, v0, Ll/ۜۧ֫;->֡:J

    cmp-long v3, v1, p2

    if-nez v3, :cond_1

    .line 266
    iget-object p2, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 267
    iget-object p1, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    .line 268
    :cond_0
    invoke-virtual {v0}, Ll/ۜۧ֫;->close()V

    .line 269
    invoke-direct {p0}, Ll/᩷᩻֫;->᩹()V

    :cond_1
    return-void
.end method

.method public final ۙ(ILl/ۧۜۚ;Ll/֨۠ۚ;)V
    .locals 15

    move-object v10, p0

    move/from16 v6, p1

    .line 148
    invoke-static {}, Ll/᩷᩻֫;->ܳ()V

    .line 149
    iget-boolean v0, v10, Ll/᩷᩻֫;->۟:Z

    if-nez v0, :cond_1

    if-ltz v6, :cond_1

    iget-object v0, v10, Ll/᩷᩻֫;->ܶۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v6, v0, :cond_0

    goto :goto_0

    .line 150
    :cond_0
    iget-object v0, v10, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v0, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ll/ۜۧ֫;

    .line 151
    invoke-virtual/range {p0 .. p1}, Ll/᩷᩻֫;->᩷(I)Ll/ۡ֫֫;

    move-result-object v8

    .line 152
    iget-wide v11, v10, Ll/᩷᩻֫;->᩸ۙ:J

    .line 154
    new-instance v9, Ll/۟ۧ֫;

    move-object v0, v9

    move-object v1, p0

    move-object/from16 v2, p2

    move-wide v3, v11

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Ll/۟ۧ֫;-><init>(Ll/᩷᩻֫;Ll/ۧۜۚ;JLl/ۜۧ֫;)V

    .line 156
    iget-object v13, v10, Ll/᩷᩻֫;->᩵ۙ:Ljava/util/concurrent/ExecutorService;

    new-instance v14, Ll/ᩳۧ֫;

    move-object v0, v14

    move-object v2, v9

    move/from16 v3, p1

    move-object v4, v7

    move-object v5, v8

    move-object/from16 v6, p2

    move-wide v7, v11

    move-object/from16 v9, p3

    invoke-direct/range {v0 .. v9}, Ll/ᩳۧ֫;-><init>(Ll/᩷᩻֫;Ll/۟ۧ֫;ILl/ۜۧ֫;Ll/ۡ֫֫;Ll/ۧۜۚ;JLl/֨۠ۚ;)V

    invoke-interface {v13, v14}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۙ(Ll/ۚۜۚ;)V
    .locals 0

    .line 131
    invoke-static {}, Ll/᩷᩻֫;->ܳ()V

    .line 132
    iput-object p1, p0, Ll/᩷᩻֫;->۬:Ll/ۚۜۚ;

    return-void
.end method

.method public final ۙ(Ll/۬ۚ֫;I)V
    .locals 1

    .line 113
    invoke-static {}, Ll/᩷᩻֫;->ܳ()V

    .line 114
    iget-boolean v0, p0, Ll/᩷᩻֫;->۟:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩷᩻֫;->ۗۙ:Ll/۬ۚ֫;

    if-nez v0, :cond_0

    .line 115
    iput-object p1, p0, Ll/᩷᩻֫;->ۗۙ:Ll/۬ۚ֫;

    .line 116
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v0, p1, Ll/֡ۚ֫;

    .line 116
    iput-boolean v0, p0, Ll/᩷᩻֫;->ᩳ:Z

    .line 117
    invoke-virtual {p1, p0, p2}, Ll/۬ۚ֫;->ۙ(Ll/۠ۚ֫;I)V

    return-void

    .line 114
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Gallery session already attached or closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ(Ll/۬ۚ֫;IJ)V
    .locals 6

    .line 248
    invoke-static {}, Ll/᩷᩻֫;->ܳ()V

    .line 249
    iget-boolean p1, p0, Ll/᩷᩻֫;->۟:Z

    if-eqz p1, :cond_0

    return-void

    .line 250
    :cond_0
    iget-object p1, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۜۧ֫;

    if-eqz p1, :cond_1

    .line 251
    invoke-virtual {p1}, Ll/ۜۧ֫;->close()V

    .line 252
    :cond_1
    new-instance p1, Ll/ۜۧ֫;

    iget-object v0, p0, Ll/᩷᩻֫;->ܶۙ:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ll/۫ۧ֫;

    move-object v0, p1

    move-object v1, p0

    move v2, p2

    move-wide v3, p3

    invoke-direct/range {v0 .. v5}, Ll/ۜۧ֫;-><init>(Ll/᩷᩻֫;IJLl/۫ۧ֫;)V

    .line 253
    iget-object p3, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {p3, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 254
    iget p3, p0, Ll/᩷᩻֫;->֨:I

    if-ne p2, p3, :cond_2

    .line 255
    iput-object p1, p0, Ll/᩷᩻֫;->ۢ:Ll/ۜۧ֫;

    const/4 p2, 0x1

    .line 256
    iput-boolean p2, p1, Ll/ۜۧ֫;->᩷ۙ:Z

    .line 258
    :cond_2
    invoke-direct {p0}, Ll/᩷᩻֫;->᩹()V

    return-void
.end method

.method public final ۙ(Z)V
    .locals 4

    .line 283
    invoke-static {}, Ll/᩷᩻֫;->ܳ()V

    .line 284
    iget-boolean v0, p0, Ll/᩷᩻֫;->۟:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Ll/᩷᩻֫;->ܰ:Z

    if-ne v0, p1, :cond_0

    goto :goto_1

    .line 285
    :cond_0
    iput-boolean p1, p0, Ll/᩷᩻֫;->ܰ:Z

    .line 286
    iget-wide v0, p0, Ll/᩷᩻֫;->ۜ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩷᩻֫;->ۜ:J

    const/4 v0, 0x0

    .line 287
    :goto_0
    iget-object v1, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 288
    iget-object v1, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜۧ֫;

    .line 289
    invoke-virtual {v1}, Ll/ۜۧ֫;->᩷()V

    if-eqz p1, :cond_1

    .line 290
    iget-object v2, v1, Ll/ۜۧ֫;->ܺ:Ll/ۡ֫֫;

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    .line 291
    iput-boolean v2, v1, Ll/ۜۧ֫;->ܶ:Z

    .line 292
    iput-boolean v2, v1, Ll/ۜۧ֫;->ܰ:Z

    .line 294
    :cond_1
    invoke-virtual {v1}, Ll/ۜۧ֫;->᩸()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 297
    :cond_2
    iget-object p1, p0, Ll/᩷᩻֫;->ۗۙ:Ll/۬ۚ֫;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 298
    :cond_3
    invoke-direct {p0}, Ll/᩷᩻֫;->᩹()V

    :cond_4
    :goto_1
    return-void
.end method

.method public final ۙ(I)Z
    .locals 1

    .line 201
    iget-object v0, p0, Ll/᩷᩻֫;->ܶۙ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۫ۧ֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p1, p1, Ll/۠᩻֫;

    return p1
.end method

.method public final ۤ()V
    .locals 6

    .line 303
    invoke-static {}, Ll/᩷᩻֫;->ܳ()V

    .line 304
    iget-wide v0, p0, Ll/᩷᩻֫;->ۜ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩷᩻֫;->ۜ:J

    const/4 v0, 0x0

    .line 305
    :goto_0
    iget-object v1, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 306
    iget-object v1, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜۧ֫;

    .line 307
    iget-wide v2, v1, Ll/ۜۧ֫;->ۙ:J

    const-wide/16 v4, 0x2

    div-long/2addr v2, v4

    const-wide/32 v4, 0x40000

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iput-wide v2, v1, Ll/ۜۧ֫;->ۙ:J

    .line 308
    invoke-virtual {v1}, Ll/ۜۧ֫;->᩷()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 310
    :cond_0
    iget-object v0, p0, Ll/᩷᩻֫;->ۗۙ:Ll/۬ۚ֫;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 311
    :cond_1
    invoke-direct {p0}, Ll/᩷᩻֫;->᩹()V

    return-void
.end method

.method public final ۤ(I)Z
    .locals 1

    .line 196
    iget-object v0, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۜۧ֫;

    if-eqz p1, :cond_0

    .line 197
    iget-boolean p1, p1, Ll/ۜۧ֫;->᩸:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩷(I)Ll/ۡ֫֫;
    .locals 1

    .line 141
    invoke-static {}, Ll/᩷᩻֫;->ܳ()V

    .line 142
    iget-object v0, p0, Ll/᩷᩻֫;->ᩴۙ:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۜۧ֫;

    if-eqz p1, :cond_1

    .line 143
    iget-boolean v0, p1, Ll/ۜۧ֫;->᩷:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Ll/ۜۧ֫;->ܺ:Ll/ۡ֫֫;

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ᩷()V
    .locals 1

    .line 279
    iget v0, p0, Ll/᩷᩻֫;->֨:I

    invoke-virtual {p0, v0}, Ll/᩷᩻֫;->᩸(I)V

    return-void
.end method

.method public final ᩷(Ll/۬ۚ֫;I)V
    .locals 1

    .line 122
    invoke-static {}, Ll/᩷᩻֫;->ܳ()V

    .line 123
    iget-boolean v0, p0, Ll/᩷᩻֫;->۟:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩷᩻֫;->ۗۙ:Ll/۬ۚ֫;

    if-eqz v0, :cond_0

    .line 124
    invoke-virtual {v0}, Ll/۬ۚ֫;->ᩴ()V

    const/4 v0, 0x0

    .line 125
    iput-object v0, p0, Ll/᩷᩻֫;->ۗۙ:Ll/۬ۚ֫;

    .line 126
    invoke-virtual {p0, p1, p2}, Ll/᩷᩻֫;->ۙ(Ll/۬ۚ֫;I)V

    return-void

    .line 123
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Gallery session is not attached"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩸(I)V
    .locals 1

    .line 275
    invoke-static {}, Ll/᩷᩻֫;->ܳ()V

    .line 276
    iget-boolean v0, p0, Ll/᩷᩻֫;->۟:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩷᩻֫;->ۗۙ:Ll/۬ۚ֫;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/۬ۚ֫;->᩷(I)Z

    :cond_0
    return-void
.end method
