.class public abstract Ll/᩹ۜ᩵;
.super Ll/ۗۜ᩵;
.source "2AYL"

# interfaces
.implements Ll/ᩴۜ᩵;


# static fields
.field public static final synthetic ֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic ۢ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final synthetic ᩳ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field public volatile synthetic _delayed$volatile:Ljava/lang/Object;

.field public volatile synthetic _isCompleted$volatile:I

.field public volatile synthetic _queue$volatile:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "_queue$volatile"

    .line 0
    const-class v1, Ll/᩹ۜ᩵;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/᩹ۜ᩵;->֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_delayed$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/᩹ۜ᩵;->ᩳ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_isCompleted$volatile"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/᩹ۜ᩵;->ۢ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Ll/ܺۜ᩵;-><init>()V

    const/4 v0, 0x0

    .line 184
    iput v0, p0, Ll/᩹ۜ᩵;->_isCompleted$volatile:I

    return-void
.end method

.method public static final ۙ(Ll/᩹ۜ᩵;)Z
    .locals 1

    .line 177
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    sget-object v0, Ll/᩹ۜ᩵;->ۢ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 186
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private final ᩷(Ljava/lang/Runnable;)Z
    .locals 6

    .line 294
    :goto_0
    sget-object v0, Ll/᩹ۜ᩵;->֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 0
    sget-object v2, Ll/᩹ۜ᩵;->ۢ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 186
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    return v3

    :cond_0
    const/4 v2, 0x1

    if-nez v1, :cond_3

    :cond_1
    const/4 v1, 0x0

    .line 0
    invoke-virtual {v0, p0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 300
    :cond_3
    instance-of v4, v1, Ll/ܰ᩷ۨ;

    if-eqz v4, :cond_7

    .line 301
    move-object v4, v1

    check-cast v4, Ll/ܰ᩷ۨ;

    invoke-virtual {v4, p1}, Ll/ܰ᩷ۨ;->ۙ(Ljava/lang/Object;)I

    move-result v5

    if-eqz v5, :cond_b

    if-eq v5, v2, :cond_4

    const/4 v0, 0x2

    if-eq v5, v0, :cond_8

    goto :goto_0

    .line 304
    :cond_4
    invoke-virtual {v4}, Ll/ܰ᩷ۨ;->᩸()Ll/ܰ᩷ۨ;

    move-result-object v3

    .line 0
    :cond_5
    invoke-virtual {v0, p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_0

    :cond_6
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v1, :cond_5

    goto :goto_0

    .line 308
    :cond_7
    invoke-static {}, Ll/᩵ۜ᩵;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object v4

    if-ne v1, v4, :cond_9

    :cond_8
    return v3

    .line 311
    :cond_9
    new-instance v3, Ll/ܰ᩷ۨ;

    const/16 v4, 0x8

    invoke-direct {v3, v4, v2}, Ll/ܰ᩷ۨ;-><init>(IZ)V

    .line 312
    move-object v4, v1

    check-cast v4, Ljava/lang/Runnable;

    invoke-virtual {v3, v4}, Ll/ܰ᩷ۨ;->ۙ(Ljava/lang/Object;)I

    .line 313
    invoke-virtual {v3, p1}, Ll/ܰ᩷ۨ;->ۙ(Ljava/lang/Object;)I

    .line 0
    :cond_a
    invoke-virtual {v0, p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    :cond_b
    :goto_1
    return v2

    :cond_c
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, v1, :cond_a

    goto :goto_0
.end method


# virtual methods
.method public final isEmpty()Z
    .locals 2

    .line 190
    invoke-virtual {p0}, Ll/ܺۜ᩵;->ܰ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 0
    :cond_0
    sget-object v0, Ll/᩹ۜ᩵;->ᩳ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 191
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶۜ᩵;

    if-eqz v0, :cond_1

    .line 192
    invoke-virtual {v0}, Ll/ܳۤۨ;->᩷()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 0
    :cond_1
    sget-object v0, Ll/᩹ۜ᩵;->֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 193
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_0

    .line 195
    :cond_2
    instance-of v1, v0, Ll/ܰ᩷ۨ;

    if-eqz v1, :cond_3

    check-cast v0, Ll/ܰ᩷ۨ;

    invoke-virtual {v0}, Ll/ܰ᩷ۨ;->ۤ()Z

    move-result v0

    return v0

    .line 196
    :cond_3
    invoke-static {}, Ll/᩵ۜ᩵;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object v1

    if-ne v0, v1, :cond_4

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_4
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method public shutdown()V
    .locals 5

    .line 216
    invoke-static {}, Ll/᩹۬᩵;->᩷()V

    .line 0
    sget-object v0, Ll/᩹ۜ᩵;->ۢ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v1, 0x1

    .line 187
    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    .line 339
    :goto_0
    sget-object v0, Ll/᩹ۜ᩵;->֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_2

    .line 343
    invoke-static {}, Ll/᩵ۜ᩵;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object v3

    :cond_0
    const/4 v2, 0x0

    .line 0
    invoke-virtual {v0, p0, v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 344
    :cond_2
    instance-of v3, v2, Ll/ܰ᩷ۨ;

    if-eqz v3, :cond_3

    .line 345
    check-cast v2, Ll/ܰ᩷ۨ;

    invoke-virtual {v2}, Ll/ܰ᩷ۨ;->ۙ()Z

    goto :goto_1

    .line 349
    :cond_3
    invoke-static {}, Ll/᩵ۜ᩵;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object v3

    if-ne v2, v3, :cond_4

    goto :goto_1

    .line 352
    :cond_4
    new-instance v3, Ll/ܰ᩷ۨ;

    const/16 v4, 0x8

    invoke-direct {v3, v4, v1}, Ll/ܰ᩷ۨ;-><init>(IZ)V

    .line 353
    move-object v4, v2

    check-cast v4, Ljava/lang/Runnable;

    invoke-virtual {v3, v4}, Ll/ܰ᩷ۨ;->ۙ(Ljava/lang/Object;)I

    .line 0
    :cond_5
    invoke-virtual {v0, p0, v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    .line 222
    :cond_6
    :goto_1
    invoke-virtual {p0}, Ll/᩹ۜ᩵;->֡()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_6

    .line 390
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    .line 0
    :goto_2
    sget-object v2, Ll/᩹ۜ᩵;->ᩳ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 399
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶۜ᩵;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ll/ܳۤۨ;->᩸()Ll/۫ۤۨ;

    move-result-object v2

    check-cast v2, Ll/ܽۜ᩵;

    if-nez v2, :cond_7

    goto :goto_3

    .line 400
    :cond_7
    invoke-virtual {p0, v0, v1, v2}, Ll/ۗۜ᩵;->ۙ(JLl/ܽۜ᩵;)V

    goto :goto_2

    :cond_8
    :goto_3
    return-void

    .line 0
    :cond_9
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, v2, :cond_5

    goto :goto_0
.end method

.method public final ֡()J
    .locals 12

    .line 257
    invoke-virtual {p0}, Ll/ܺۜ᩵;->᩶()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    goto/16 :goto_6

    .line 0
    :cond_0
    sget-object v0, Ll/᩹ۜ᩵;->ᩳ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 259
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ll/ܶۜ᩵;

    const/4 v4, 0x0

    if-eqz v3, :cond_5

    .line 260
    invoke-virtual {v3}, Ll/ܳۤۨ;->᩷()Z

    move-result v0

    if-nez v0, :cond_5

    .line 261
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    :cond_1
    move-object v0, v3

    .line 16
    monitor-enter v0

    .line 52
    :try_start_0
    invoke-virtual {v3}, Ll/ܳۤۨ;->ۙ()Ll/۫ۤۨ;

    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v7, :cond_2

    monitor-exit v0

    move-object v7, v4

    goto :goto_2

    .line 53
    :cond_2
    :try_start_1
    check-cast v7, Ll/ܽۜ᩵;

    .line 432
    iget-wide v8, v7, Ll/ܽۜ᩵;->᩶:J

    sub-long v8, v5, v8

    const/4 v10, 0x0

    cmp-long v11, v8, v1

    if-ltz v11, :cond_3

    .line 268
    invoke-direct {p0, v7}, Ll/᩹ۜ᩵;->᩷(Ljava/lang/Runnable;)Z

    move-result v7

    goto :goto_0

    :cond_3
    const/4 v7, 0x0

    :goto_0
    if-eqz v7, :cond_4

    .line 54
    invoke-virtual {v3, v10}, Ll/ܳۤۨ;->ۙ(I)Ll/۫ۤۨ;

    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_4
    move-object v7, v4

    .line 16
    :goto_1
    monitor-exit v0

    .line 266
    :goto_2
    check-cast v7, Ll/ܽۜ᩵;

    if-nez v7, :cond_1

    goto :goto_3

    :catchall_0
    move-exception v1

    .line 16
    monitor-exit v0

    throw v1

    .line 0
    :cond_5
    :goto_3
    sget-object v0, Ll/᩹ۜ᩵;->֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 321
    :goto_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_6

    goto :goto_5

    .line 326
    :cond_6
    instance-of v5, v3, Ll/ܰ᩷ۨ;

    if-eqz v5, :cond_a

    .line 327
    move-object v5, v3

    check-cast v5, Ll/ܰ᩷ۨ;

    invoke-virtual {v5}, Ll/ܰ᩷ۨ;->ᩴ()Ljava/lang/Object;

    move-result-object v6

    .line 328
    sget-object v7, Ll/ܰ᩷ۨ;->ᩴ:Ll/ۜ᩷ۨ;

    if-eq v6, v7, :cond_7

    move-object v4, v6

    check-cast v4, Ljava/lang/Runnable;

    goto :goto_5

    .line 329
    :cond_7
    invoke-virtual {v5}, Ll/ܰ᩷ۨ;->᩸()Ll/ܰ᩷ۨ;

    move-result-object v5

    .line 0
    :cond_8
    invoke-virtual {v0, p0, v3, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    goto :goto_4

    :cond_9
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eq v6, v3, :cond_8

    goto :goto_4

    .line 332
    :cond_a
    invoke-static {}, Ll/᩵ۜ᩵;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object v5

    if-ne v3, v5, :cond_b

    goto :goto_5

    .line 0
    :cond_b
    invoke-virtual {v0, p0, v3, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_14

    .line 333
    move-object v4, v3

    check-cast v4, Ljava/lang/Runnable;

    :goto_5
    if-eqz v4, :cond_c

    .line 277
    invoke-interface {v4}, Ljava/lang/Runnable;->run()V

    return-wide v1

    .line 202
    :cond_c
    invoke-super {p0}, Ll/ܺۜ᩵;->᩹()J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-nez v0, :cond_d

    goto :goto_6

    .line 0
    :cond_d
    sget-object v0, Ll/᩹ۜ᩵;->֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 203
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_f

    .line 206
    instance-of v3, v0, Ll/ܰ᩷ۨ;

    if-eqz v3, :cond_e

    check-cast v0, Ll/ܰ᩷ۨ;

    invoke-virtual {v0}, Ll/ܰ᩷ۨ;->ۤ()Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_6

    .line 207
    :cond_e
    invoke-static {}, Ll/᩵ۜ᩵;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object v3

    if-ne v0, v3, :cond_11

    goto :goto_7

    .line 0
    :cond_f
    sget-object v0, Ll/᩹ۜ᩵;->ᩳ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 210
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶۜ᩵;

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Ll/ܳۤۨ;->ۤ()Ll/۫ۤۨ;

    move-result-object v0

    check-cast v0, Ll/ܽۜ᩵;

    if-nez v0, :cond_10

    goto :goto_7

    .line 211
    :cond_10
    iget-wide v3, v0, Ll/ܽۜ᩵;->᩶:J

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    sub-long/2addr v3, v5

    cmp-long v0, v3, v1

    if-gez v0, :cond_12

    :cond_11
    :goto_6
    return-wide v1

    :cond_12
    return-wide v3

    :cond_13
    :goto_7
    const-wide v0, 0x7fffffffffffffffL

    return-wide v0

    .line 0
    :cond_14
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eq v5, v3, :cond_b

    goto/16 :goto_4
.end method

.method public ۙ(Ljava/lang/Runnable;)V
    .locals 1

    .line 286
    invoke-direct {p0, p1}, Ll/᩹ۜ᩵;->᩷(Ljava/lang/Runnable;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 12
    invoke-virtual {p0}, Ll/ۗۜ᩵;->ܿ()Ljava/lang/Thread;

    move-result-object p1

    .line 13
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    if-eq v0, p1, :cond_0

    .line 14
    invoke-static {p1}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    return-void

    .line 290
    :cond_1
    sget-object v0, Ll/ۤۜ᩵;->ۡ:Ll/ۤۜ᩵;

    invoke-virtual {v0, p1}, Ll/ۤۜ᩵;->ۙ(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ۙ(Ll/ۧۢ᩵;Ljava/lang/Runnable;)V
    .locals 0

    .line 283
    invoke-virtual {p0, p2}, Ll/᩹ۜ᩵;->ۙ(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ۟()V
    .locals 2

    .line 384
    sget-object v0, Ll/᩹ۜ᩵;->֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 0
    sget-object v0, Ll/᩹ۜ᩵;->ᩳ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 385
    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final ᩷(JLl/ܽۜ᩵;)V
    .locals 5

    .line 0
    sget-object v0, Ll/᩹ۜ᩵;->ۢ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 186
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    sget-object v3, Ll/᩹ۜ᩵;->ᩳ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    .line 375
    :cond_0
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶۜ᩵;

    if-nez v0, :cond_3

    .line 376
    new-instance v4, Ll/ܶۜ᩵;

    .line 519
    invoke-direct {v4}, Ll/ܳۤۨ;-><init>()V

    .line 518
    iput-wide p1, v4, Ll/ܶۜ᩵;->ۤ:J

    .line 0
    :cond_1
    invoke-virtual {v3, p0, v1, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 377
    :goto_0
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    check-cast v0, Ll/ܶۜ᩵;

    .line 379
    :cond_3
    move-object v4, p0

    check-cast v4, Ll/ۤۜ᩵;

    invoke-virtual {p3, p1, p2, v0, v4}, Ll/ܽۜ᩵;->ۙ(JLl/ܶۜ᩵;Ll/ۤۜ᩵;)I

    move-result v0

    :goto_1
    if-eqz v0, :cond_6

    if-eq v0, v2, :cond_5

    const/4 p1, 0x2

    if-ne v0, p1, :cond_4

    goto :goto_2

    .line 365
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "unexpected result"

    .line 367
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 365
    :cond_5
    invoke-virtual {p0, p1, p2, p3}, Ll/ۗۜ᩵;->ۙ(JLl/ܽۜ᩵;)V

    return-void

    .line 371
    :cond_6
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܶۜ᩵;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ll/ܳۤۨ;->ۤ()Ll/۫ۤۨ;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ll/ܽۜ᩵;

    :cond_7
    if-ne v1, p3, :cond_8

    .line 12
    invoke-virtual {p0}, Ll/ۗۜ᩵;->ܿ()Ljava/lang/Thread;

    move-result-object p1

    .line 13
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    if-eq p2, p1, :cond_8

    .line 14
    invoke-static {p1}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_8
    :goto_2
    return-void
.end method
