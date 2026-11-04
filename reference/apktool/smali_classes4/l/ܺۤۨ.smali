.class public final Ll/ܺۤۨ;
.super Ljava/lang/Object;
.source "FAYC"

# interfaces
.implements Ljava/util/concurrent/Executor;
.implements Ljava/io/Closeable;


# static fields
.field public static final ֨:Ll/ۜ᩷ۨ;

.field public static final synthetic ۖ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final synthetic ۠:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final synthetic ۡ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public volatile synthetic _isTerminated$volatile:I

.field public volatile synthetic controlState$volatile:J

.field public volatile synthetic parkedWorkersStack$volatile:J

.field public final ֡:J

.field public final ۟:I

.field public final ۢ:Ll/ۢ᩷ۨ;

.field public final ܰ:I

.field public final ܿ:Ll/᩹ۤۨ;

.field public final ᩳ:Ljava/lang/String;

.field public final ᩶:Ll/᩹ۤۨ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "parkedWorkersStack$volatile"

    .line 4
    const-class v1, Ll/ܺۤۨ;

    .line 7
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    .line 10
    sput-object v0, Ll/ܺۤۨ;->۠:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "controlState$volatile"

    .line 15
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    .line 18
    sput-object v0, Ll/ܺۤۨ;->ۖ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "_isTerminated$volatile"

    .line 23
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    .line 26
    sput-object v0, Ll/ܺۤۨ;->ۡ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 309
    new-instance v0, Ll/ۜ᩷ۨ;

    const-string v1, "NOT_IN_STACK"

    invoke-direct {v0, v1}, Ll/ۜ᩷ۨ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ܺۤۨ;->֨:Ll/ۜ᩷ۨ;

    return-void
.end method

.method public constructor <init>(IIJLjava/lang/String;)V
    .locals 2

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iput p1, p0, Ll/ܺۤۨ;->ܰ:I

    .line 89
    iput p2, p0, Ll/ܺۤۨ;->۟:I

    .line 90
    iput-wide p3, p0, Ll/ܺۤۨ;->֡:J

    .line 91
    iput-object p5, p0, Ll/ܺۤۨ;->ᩳ:Ljava/lang/String;

    const/4 p5, 0x1

    if-lt p1, p5, :cond_3

    const-string p5, "Max pool size "

    if-lt p2, p1, :cond_2

    const v0, 0x1ffffe

    if-gt p2, v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long p2, p3, v0

    if-lez p2, :cond_0

    .line 109
    new-instance p2, Ll/᩹ۤۨ;

    .line 110
    invoke-direct {p2}, Ll/᩺᩷ۨ;-><init>()V

    .line 109
    iput-object p2, p0, Ll/ܺۤۨ;->ܿ:Ll/᩹ۤۨ;

    .line 112
    new-instance p2, Ll/᩹ۤۨ;

    .line 110
    invoke-direct {p2}, Ll/᩺᩷ۨ;-><init>()V

    .line 112
    iput-object p2, p0, Ll/ܺۤۨ;->᩶:Ll/᩹ۤۨ;

    .line 265
    new-instance p2, Ll/ۢ᩷ۨ;

    add-int/lit8 p3, p1, 0x1

    mul-int/lit8 p3, p3, 0x2

    invoke-direct {p2, p3}, Ll/ۢ᩷ۨ;-><init>(I)V

    iput-object p2, p0, Ll/ܺۤۨ;->ۢ:Ll/ۢ᩷ۨ;

    int-to-long p1, p1

    const/16 p3, 0x2a

    shl-long/2addr p1, p3

    .line 274
    iput-wide p1, p0, Ll/ܺۤۨ;->controlState$volatile:J

    const/4 p1, 0x0

    .line 303
    iput p1, p0, Ll/ܺۤۨ;->_isTerminated$volatile:I

    return-void

    .line 104
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Idle worker keep alive time "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, " must be positive"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 103
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    const-string p1, " should not exceed maximal supported number of threads 2097150"

    .line 0
    invoke-static {p2, p5, p1}, Ll/ܰ۟ۙ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 100
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    const-string p3, " should be greater than or equals to core pool size "

    .line 0
    invoke-static {p5, p2, p1, p3}, Ll/ۜۚ᩸;->ۙ(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 97
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    const-string p2, "Core pool size "

    const-string p3, " should be at least 1"

    .line 0
    invoke-static {p1, p2, p3}, Ll/ܰ۟ۙ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 94
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static final synthetic ۤ()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .locals 1

    .line 0
    sget-object v0, Ll/ܺۤۨ;->ۖ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-object v0
.end method

.method private final ۫()Z
    .locals 10

    .line 200
    :cond_0
    sget-object v0, Ll/ܺۤۨ;->۠:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v3

    const-wide/32 v0, 0x1fffff

    and-long/2addr v0, v3

    long-to-int v1, v0

    .line 203
    iget-object v0, p0, Ll/ܺۤۨ;->ۢ:Ll/ۢ᩷ۨ;

    invoke-virtual {v0, v1}, Ll/ۢ᩷ۨ;->ۙ(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧۤۨ;

    const/4 v7, -0x1

    const/4 v8, 0x0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_2

    :cond_1
    const-wide/32 v1, 0x200000

    add-long/2addr v1, v3

    const-wide/32 v5, -0x200000

    and-long/2addr v1, v5

    .line 233
    invoke-virtual {v0}, Ll/ۧۤۨ;->᩷()Ljava/lang/Object;

    move-result-object v5

    .line 236
    :goto_0
    sget-object v9, Ll/ܺۤۨ;->֨:Ll/ۜ᩷ۨ;

    if-ne v5, v9, :cond_2

    const/4 v5, -0x1

    goto :goto_1

    :cond_2
    if-nez v5, :cond_3

    const/4 v5, 0x0

    goto :goto_1

    .line 239
    :cond_3
    check-cast v5, Ll/ۧۤۨ;

    .line 240
    invoke-virtual {v5}, Ll/ۧۤۨ;->ۙ()I

    move-result v6

    if-eqz v6, :cond_5

    move v5, v6

    :goto_1
    if-ltz v5, :cond_0

    int-to-long v5, v5

    or-long/2addr v5, v1

    .line 212
    sget-object v1, Ll/ܺۤۨ;->۠:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 219
    invoke-virtual {v0, v9}, Ll/ۧۤۨ;->ۙ(Ljava/lang/Object;)V

    :goto_2
    if-nez v0, :cond_4

    return v8

    .line 462
    :cond_4
    invoke-static {}, Ll/ۧۤۨ;->ۤ()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, v0, v7, v8}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 463
    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    const/4 v0, 0x1

    return v0

    .line 243
    :cond_5
    invoke-virtual {v5}, Ll/ۧۤۨ;->᩷()Ljava/lang/Object;

    move-result-object v5

    goto :goto_0
.end method

.method private final ܳ()I
    .locals 10

    .line 475
    iget-object v0, p0, Ll/ܺۤۨ;->ۢ:Ll/ۢ᩷ۨ;

    .line 16
    monitor-enter v0

    .line 477
    :try_start_0
    invoke-virtual {p0}, Ll/ܺۤۨ;->isTerminated()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    const/4 v0, -0x1

    return v0

    .line 0
    :cond_0
    :try_start_1
    sget-object v1, Ll/ܺۤۨ;->ۖ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 478
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const-wide/32 v4, 0x1fffff

    and-long v6, v2, v4

    long-to-int v7, v6

    const-wide v8, 0x3ffffe00000L

    and-long/2addr v2, v8

    const/16 v6, 0x15

    shr-long/2addr v2, v6

    long-to-int v3, v2

    sub-int v2, v7, v3

    const/4 v3, 0x0

    if-gez v2, :cond_1

    const/4 v2, 0x0

    .line 483
    :cond_1
    iget v6, p0, Ll/ܺۤۨ;->ܰ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-lt v2, v6, :cond_2

    monitor-exit v0

    return v3

    .line 484
    :cond_2
    :try_start_2
    iget v6, p0, Ll/ܺۤۨ;->۟:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-lt v7, v6, :cond_3

    monitor-exit v0

    return v3

    .line 276
    :cond_3
    :try_start_3
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v6

    and-long/2addr v6, v4

    long-to-int v3, v6

    add-int/lit8 v3, v3, 0x1

    if-lez v3, :cond_5

    .line 487
    iget-object v6, p0, Ll/ܺۤۨ;->ۢ:Ll/ۢ᩷ۨ;

    invoke-virtual {v6, v3}, Ll/ۢ᩷ۨ;->ۙ(I)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_5

    .line 493
    new-instance v6, Ll/ۧۤۨ;

    invoke-direct {v6, p0, v3}, Ll/ۧۤۨ;-><init>(Ll/ܺۤۨ;I)V

    .line 494
    iget-object v7, p0, Ll/ܺۤۨ;->ۢ:Ll/ۢ᩷ۨ;

    invoke-virtual {v7, v3, v6}, Ll/ۢ᩷ۨ;->ۙ(ILl/ۧۤۨ;)V

    .line 284
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->incrementAndGet(Ljava/lang/Object;)J

    move-result-wide v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    and-long/2addr v4, v7

    long-to-int v1, v4

    if-ne v3, v1, :cond_4

    add-int/lit8 v2, v2, 0x1

    .line 16
    monitor-exit v0

    .line 497
    invoke-virtual {v6}, Ljava/lang/Thread;->start()V

    return v2

    :cond_4
    :try_start_4
    const-string v1, "Failed requirement."

    .line 495
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_5
    const-string v1, "Failed requirement."

    .line 487
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception v1

    .line 16
    monitor-exit v0

    throw v1
.end method

.method private final ᩷(J)Z
    .locals 4

    const-wide/32 v0, 0x1fffff

    and-long/2addr v0, p1

    long-to-int v1, v0

    const-wide v2, 0x3ffffe00000L

    and-long/2addr p1, v2

    const/16 v0, 0x15

    shr-long/2addr p1, v0

    long-to-int p2, p1

    sub-int/2addr v1, p2

    const/4 p1, 0x0

    if-gez v1, :cond_0

    const/4 v1, 0x0

    .line 449
    :cond_0
    iget p2, p0, Ll/ܺۤۨ;->ܰ:I

    if-ge v1, p2, :cond_2

    .line 450
    invoke-direct {p0}, Ll/ܺۤۨ;->ܳ()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    if-le p2, v1, :cond_1

    .line 453
    invoke-direct {p0}, Ll/ܺۤۨ;->ܳ()I

    :cond_1
    if-lez v0, :cond_2

    return v1

    :cond_2
    return p1
.end method


# virtual methods
.method public final close()V
    .locals 8

    .line 0
    sget-object v0, Ll/ܺۤۨ;->ۡ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 339
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 519
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    instance-of v1, v0, Ll/ۧۤۨ;

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    check-cast v0, Ll/ۧۤۨ;

    goto :goto_0

    :cond_1
    move-object v0, v3

    :goto_0
    if-eqz v0, :cond_2

    .line 593
    iget-object v1, v0, Ll/ۧۤۨ;->֨:Ll/ܺۤۨ;

    .line 519
    invoke-static {v1, p0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    move-object v3, v0

    .line 343
    :cond_2
    iget-object v0, p0, Ll/ܺۤۨ;->ۢ:Ll/ۢ᩷ۨ;

    .line 16
    monitor-enter v0

    .line 0
    :try_start_0
    sget-object v1, Ll/ܺۤۨ;->ۖ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 276
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const-wide/32 v6, 0x1fffff

    and-long/2addr v4, v6

    long-to-int v1, v4

    .line 16
    monitor-exit v0

    if-gt v2, v1, :cond_5

    const/4 v0, 0x1

    .line 346
    :goto_1
    iget-object v4, p0, Ll/ܺۤۨ;->ۢ:Ll/ۢ᩷ۨ;

    invoke-virtual {v4, v0}, Ll/ۢ᩷ۨ;->ۙ(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    check-cast v4, Ll/ۧۤۨ;

    if-eq v4, v3, :cond_4

    .line 349
    :goto_2
    invoke-virtual {v4}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    move-result-object v5

    sget-object v6, Ljava/lang/Thread$State;->TERMINATED:Ljava/lang/Thread$State;

    if-eq v5, v6, :cond_3

    .line 350
    invoke-static {v4}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    const-wide/16 v5, 0x2710

    .line 351
    invoke-virtual {v4, v5, v6}, Ljava/lang/Thread;->join(J)V

    goto :goto_2

    .line 355
    :cond_3
    iget-object v4, v4, Ll/ۧۤۨ;->ܰ:Ll/ܿۤۨ;

    iget-object v5, p0, Ll/ܺۤۨ;->᩶:Ll/᩹ۤۨ;

    invoke-virtual {v4, v5}, Ll/ܿۤۨ;->ۙ(Ll/᩹ۤۨ;)V

    :cond_4
    if-eq v0, v1, :cond_5

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 359
    :cond_5
    iget-object v0, p0, Ll/ܺۤۨ;->᩶:Ll/᩹ۤۨ;

    invoke-virtual {v0}, Ll/᩺᩷ۨ;->ۙ()V

    .line 360
    iget-object v0, p0, Ll/ܺۤۨ;->ܿ:Ll/᩹ۤۨ;

    invoke-virtual {v0}, Ll/᩺᩷ۨ;->ۙ()V

    :goto_3
    if-eqz v3, :cond_6

    .line 363
    invoke-virtual {v3, v2}, Ll/ۧۤۨ;->ۙ(Z)Ll/ۨۤۨ;

    move-result-object v0

    if-nez v0, :cond_8

    .line 364
    :cond_6
    iget-object v0, p0, Ll/ܺۤۨ;->ܿ:Ll/᩹ۤۨ;

    invoke-virtual {v0}, Ll/᩺᩷ۨ;->ۤ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨۤۨ;

    if-nez v0, :cond_8

    .line 365
    iget-object v0, p0, Ll/ܺۤۨ;->᩶:Ll/᩹ۤۨ;

    invoke-virtual {v0}, Ll/᩺᩷ۨ;->ۤ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨۤۨ;

    if-nez v0, :cond_8

    if-eqz v3, :cond_7

    .line 370
    sget-object v0, Ll/᩻ۤۨ;->ۢ:Ll/᩻ۤۨ;

    invoke-virtual {v3, v0}, Ll/ۧۤۨ;->ۙ(Ll/᩻ۤۨ;)Z

    .line 0
    :cond_7
    sget-object v0, Ll/ܺۤۨ;->۠:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-wide/16 v1, 0x0

    .line 373
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->set(Ljava/lang/Object;J)V

    .line 0
    sget-object v0, Ll/ܺۤۨ;->ۖ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 374
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->set(Ljava/lang/Object;J)V

    return-void

    .line 584
    :cond_8
    :try_start_1
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    .line 586
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    .line 587
    invoke-virtual {v1}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v4

    invoke-interface {v4, v1, v0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    goto :goto_3

    :catchall_1
    move-exception v1

    .line 16
    monitor-exit v0

    throw v1
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 389
    sget-object v0, Ll/ܰۤۨ;->ܳ:Ll/ۛۤۨ;

    invoke-virtual {p0, p1, v0}, Ll/ܺۤۨ;->ۙ(Ljava/lang/Runnable;Ll/ۛۤۨ;)V

    return-void
.end method

.method public final isTerminated()Z
    .locals 1

    .line 0
    sget-object v0, Ll/ܺۤۨ;->ۡ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 304
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 13

    .line 537
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 538
    iget-object v1, p0, Ll/ܺۤۨ;->ۢ:Ll/ۢ᩷ۨ;

    invoke-virtual {v1}, Ll/ۢ᩷ۨ;->ۙ()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    :goto_0
    if-ge v9, v2, :cond_7

    .line 539
    invoke-virtual {v1, v9}, Ll/ۢ᩷ۨ;->ۙ(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۧۤۨ;

    if-nez v10, :cond_0

    goto :goto_1

    .line 540
    :cond_0
    iget-object v11, v10, Ll/ۧۤۨ;->ܰ:Ll/ܿۤۨ;

    invoke-virtual {v11}, Ll/ܿۤۨ;->ۙ()I

    move-result v11

    .line 541
    iget-object v10, v10, Ll/ۧۤۨ;->۟:Ll/᩻ۤۨ;

    sget-object v12, Ll/֫ۤۨ;->ۙ:[I

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v10, v12, v10

    if-eq v10, v4, :cond_5

    const/4 v12, 0x2

    if-eq v10, v12, :cond_4

    const/4 v12, 0x3

    if-eq v10, v12, :cond_3

    const/4 v12, 0x4

    if-eq v10, v12, :cond_2

    const/4 v11, 0x5

    if-eq v10, v11, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v7, v7, 0x1

    if-lez v11, :cond_6

    .line 555
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v11, 0x64

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 550
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v11, 0x63

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 545
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v11, 0x62

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    add-int/lit8 v6, v6, 0x1

    :cond_6
    :goto_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 0
    :cond_7
    sget-object v1, Ll/ܺۤۨ;->ۖ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 561
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v1

    .line 562
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, p0, Ll/ܺۤۨ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v9, 0x40

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ll/᩷ۜ᩵;->ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "[Pool Size {core = "

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v9, p0, Ll/ܺۤۨ;->ܰ:I

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, ", max = "

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 565
    iget v10, p0, Ll/ܺۤۨ;->۟:I

    .line 562
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, "}, Worker States {CPU = "

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", blocking = "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", parked = "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", dormant = "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", terminated = "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "}, running workers queues = "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", global CPU queue size = "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 573
    iget-object v0, p0, Ll/ܺۤۨ;->ܿ:Ll/᩹ۤۨ;

    invoke-virtual {v0}, Ll/᩺᩷ۨ;->᩷()I

    move-result v0

    .line 562
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", global blocking queue size = "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    iget-object v0, p0, Ll/ܺۤۨ;->᩶:Ll/᩹ۤۨ;

    invoke-virtual {v0}, Ll/᩺᩷ۨ;->᩷()I

    move-result v0

    .line 562
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", Control State {created workers= "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide/32 v5, 0x1fffff

    and-long/2addr v5, v1

    long-to-int v0, v5

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", blocking tasks = "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v5, 0x3ffffe00000L

    and-long/2addr v5, v1

    const/16 v0, 0x15

    shr-long/2addr v5, v0

    long-to-int v0, v5

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", CPUs acquired = "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v5, 0x7ffffc0000000000L

    and-long v0, v1, v5

    const/16 v2, 0x2a

    shr-long/2addr v0, v2

    long-to-int v1, v0

    sub-int/2addr v9, v1

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "}]"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ljava/lang/Runnable;Ll/ۛۤۨ;)V
    .locals 6

    .line 417
    sget-object v0, Ll/ܰۤۨ;->ۚ:Ll/ۗۤۨ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    .line 418
    instance-of v2, p1, Ll/ۨۤۨ;

    if-eqz v2, :cond_0

    .line 419
    check-cast p1, Ll/ۨۤۨ;

    iput-wide v0, p1, Ll/ۨۤۨ;->ܰ:J

    .line 420
    iput-object p2, p1, Ll/ۨۤۨ;->᩶:Ll/ۛۤۨ;

    goto :goto_0

    .line 423
    :cond_0
    new-instance v2, Ll/ۘۤۨ;

    invoke-direct {v2, p1, v0, v1, p2}, Ll/ۘۤۨ;-><init>(Ljava/lang/Runnable;JLl/ۛۤۨ;)V

    move-object p1, v2

    .line 89
    :goto_0
    iget-object p2, p1, Ll/ۨۤۨ;->᩶:Ll/ۛۤۨ;

    invoke-interface {p2}, Ll/ۛۤۨ;->ۙ()I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    const/4 p2, 0x1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    :goto_1
    if-eqz p2, :cond_2

    .line 0
    sget-object v1, Ll/ܺۤۨ;->ۖ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-wide/32 v2, 0x200000

    .line 287
    invoke-virtual {v1, p0, v2, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    move-result-wide v1

    goto :goto_2

    :cond_2
    const-wide/16 v1, 0x0

    .line 519
    :goto_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    instance-of v4, v3, Ll/ۧۤۨ;

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    check-cast v3, Ll/ۧۤۨ;

    goto :goto_3

    :cond_3
    move-object v3, v5

    :goto_3
    if-eqz v3, :cond_4

    .line 593
    iget-object v4, v3, Ll/ۧۤۨ;->֨:Ll/ܺۤۨ;

    .line 519
    invoke-static {v4, p0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    move-object v5, v3

    :cond_4
    if-nez v5, :cond_5

    goto :goto_4

    .line 510
    :cond_5
    iget-object v3, v5, Ll/ۧۤۨ;->۟:Ll/᩻ۤۨ;

    sget-object v4, Ll/᩻ۤۨ;->ۢ:Ll/᩻ۤۨ;

    if-ne v3, v4, :cond_6

    goto :goto_4

    .line 86
    :cond_6
    iget-object v3, p1, Ll/ۨۤۨ;->᩶:Ll/ۛۤۨ;

    invoke-interface {v3}, Ll/ۛۤۨ;->ۙ()I

    move-result v3

    if-nez v3, :cond_7

    .line 512
    iget-object v3, v5, Ll/ۧۤۨ;->۟:Ll/᩻ۤۨ;

    sget-object v4, Ll/᩻ۤۨ;->ܿ:Ll/᩻ۤۨ;

    if-ne v3, v4, :cond_7

    goto :goto_4

    .line 515
    :cond_7
    iput-boolean v0, v5, Ll/ۧۤۨ;->᩶:Z

    .line 516
    iget-object v3, v5, Ll/ۧۤۨ;->ܰ:Ll/ܿۤۨ;

    invoke-virtual {v3, p1}, Ll/ܿۤۨ;->ۙ(Ll/ۨۤۨ;)Ll/ۨۤۨ;

    move-result-object p1

    :goto_4
    if-eqz p1, :cond_a

    .line 89
    iget-object v3, p1, Ll/ۨۤۨ;->᩶:Ll/ۛۤۨ;

    invoke-interface {v3}, Ll/ۛۤۨ;->ۙ()I

    move-result v3

    if-ne v3, v0, :cond_8

    .line 116
    iget-object v0, p0, Ll/ܺۤۨ;->᩶:Ll/᩹ۤۨ;

    invoke-virtual {v0, p1}, Ll/᩺᩷ۨ;->ۙ(Ljava/lang/Runnable;)Z

    move-result p1

    goto :goto_5

    .line 118
    :cond_8
    iget-object v0, p0, Ll/ܺۤۨ;->ܿ:Ll/᩹ۤۨ;

    invoke-virtual {v0, p1}, Ll/᩺᩷ۨ;->ۙ(Ljava/lang/Runnable;)Z

    move-result p1

    :goto_5
    if-eqz p1, :cond_9

    goto :goto_6

    .line 402
    :cond_9
    new-instance p1, Ljava/util/concurrent/RejectedExecutionException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Ll/ܺۤۨ;->ᩳ:Ljava/lang/String;

    const-string v1, " was terminated"

    .line 0
    invoke-static {p2, v0, v1}, Ll/۠᩹ᩴ;->ۙ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 402
    invoke-direct {p1, p2}, Ljava/util/concurrent/RejectedExecutionException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    :goto_6
    if-eqz p2, :cond_d

    .line 429
    invoke-direct {p0}, Ll/ܺۤۨ;->۫()Z

    move-result p1

    if-eqz p1, :cond_b

    goto :goto_7

    .line 431
    :cond_b
    invoke-direct {p0, v1, v2}, Ll/ܺۤۨ;->᩷(J)Z

    move-result p1

    if-eqz p1, :cond_c

    :goto_7
    return-void

    .line 432
    :cond_c
    invoke-direct {p0}, Ll/ܺۤۨ;->۫()Z

    return-void

    .line 412
    :cond_d
    invoke-virtual {p0}, Ll/ܺۤۨ;->᩷()V

    return-void
.end method

.method public final ۙ(Ll/ۧۤۨ;)V
    .locals 9

    .line 174
    invoke-virtual {p1}, Ll/ۧۤۨ;->᩷()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ll/ܺۤۨ;->֨:Ll/ۜ᩷ۨ;

    if-eq v0, v1, :cond_0

    return-void

    .line 173
    :cond_0
    sget-object v0, Ll/ܺۤۨ;->۠:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v3

    const-wide/32 v0, 0x1fffff

    and-long/2addr v0, v3

    long-to-int v1, v0

    const-wide/32 v5, 0x200000

    add-long/2addr v5, v3

    const-wide/32 v7, -0x200000

    and-long/2addr v5, v7

    .line 182
    invoke-virtual {p1}, Ll/ۧۤۨ;->ۙ()I

    move-result v0

    .line 184
    iget-object v2, p0, Ll/ܺۤۨ;->ۢ:Ll/ۢ᩷ۨ;

    invoke-virtual {v2, v1}, Ll/ۢ᩷ۨ;->ۙ(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/ۧۤۨ;->ۙ(Ljava/lang/Object;)V

    int-to-long v0, v0

    or-long/2addr v5, v0

    .line 190
    sget-object v1, Ll/ܺۤۨ;->۠:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public final ۙ(Ll/ۧۤۨ;II)V
    .locals 9

    .line 145
    :cond_0
    sget-object v0, Ll/ܺۤۨ;->۠:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v3

    const-wide/32 v0, 0x1fffff

    and-long/2addr v0, v3

    long-to-int v1, v0

    const-wide/32 v5, 0x200000

    add-long/2addr v5, v3

    const-wide/32 v7, -0x200000

    and-long/2addr v5, v7

    if-ne v1, p2, :cond_5

    if-nez p3, :cond_4

    .line 233
    invoke-virtual {p1}, Ll/ۧۤۨ;->᩷()Ljava/lang/Object;

    move-result-object v0

    .line 236
    :goto_0
    sget-object v1, Ll/ܺۤۨ;->֨:Ll/ۜ᩷ۨ;

    if-ne v0, v1, :cond_1

    const/4 v1, -0x1

    goto :goto_1

    :cond_1
    if-nez v0, :cond_2

    const/4 v1, 0x0

    goto :goto_1

    .line 239
    :cond_2
    check-cast v0, Ll/ۧۤۨ;

    .line 240
    invoke-virtual {v0}, Ll/ۧۤۨ;->ۙ()I

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    .line 243
    :cond_3
    invoke-virtual {v0}, Ll/ۧۤۨ;->᩷()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_4
    move v1, p3

    :cond_5
    :goto_1
    if-ltz v1, :cond_0

    int-to-long v0, v1

    or-long/2addr v5, v0

    .line 159
    sget-object v1, Ll/ܺۤۨ;->۠:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public final ᩷()V
    .locals 2

    .line 436
    invoke-direct {p0}, Ll/ܺۤۨ;->۫()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 0
    :cond_0
    sget-object v0, Ll/ܺۤۨ;->ۖ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 441
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Ll/ܺۤۨ;->᩷(J)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    .line 438
    :cond_1
    invoke-direct {p0}, Ll/ܺۤۨ;->۫()Z

    return-void
.end method
