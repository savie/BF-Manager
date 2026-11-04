.class public final Ll/ۧۤۨ;
.super Ljava/lang/Thread;
.source "FAYC"


# static fields
.field public static final synthetic ۡ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public volatile indexInArray:I

.field public volatile nextParkedWorker:Ljava/lang/Object;

.field public volatile synthetic workerCtl$volatile:I

.field public ֡:I

.field public final synthetic ֨:Ll/ܺۤۨ;

.field public ۟:Ll/᩻ۤۨ;

.field public ۢ:J

.field public final ܰ:Ll/ܿۤۨ;

.field public ܿ:J

.field public final ᩳ:Ll/᩻ۡ᩵;

.field public ᩶:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 0
    const-class v0, Ll/ۧۤۨ;

    const-string v1, "workerCtl$volatile"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ۧۤۨ;->ۡ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ll/ܺۤۨ;I)V
    .locals 2

    .line 593
    iput-object p1, p0, Ll/ۧۤۨ;->֨:Ll/ܺۤۨ;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 p1, 0x1

    .line 595
    invoke-virtual {p0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 602
    const-class p1, Ll/ܺۤۨ;

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    .line 620
    new-instance p1, Ll/ܿۤۨ;

    invoke-direct {p1}, Ll/ܿۤۨ;-><init>()V

    iput-object p1, p0, Ll/ۧۤۨ;->ܰ:Ll/ܿۤۨ;

    .line 626
    new-instance p1, Ll/᩻ۡ᩵;

    .line 13
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 626
    iput-object p1, p0, Ll/ۧۤۨ;->ᩳ:Ll/᩻ۡ᩵;

    .line 634
    sget-object p1, Ll/᩻ۤۨ;->۟:Ll/᩻ۤۨ;

    iput-object p1, p0, Ll/ۧۤۨ;->۟:Ll/᩻ۤۨ;

    .line 657
    sget-object p1, Ll/ܺۤۨ;->֨:Ll/ۜ᩷ۨ;

    iput-object p1, p0, Ll/ۧۤۨ;->nextParkedWorker:Ljava/lang/Object;

    .line 670
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    long-to-int p1, v0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/16 p1, 0x2a

    .line 668
    :goto_0
    iput p1, p0, Ll/ۧۤۨ;->֡:I

    .line 614
    invoke-virtual {p0, p2}, Ll/ۧۤۨ;->᩷(I)V

    return-void
.end method

.method public static final synthetic ۤ()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .locals 1

    .line 0
    sget-object v0, Ll/ۧۤۨ;->ۡ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-object v0
.end method

.method private final ۤ(I)Ll/ۨۤۨ;
    .locals 17

    move-object/from16 v0, p0

    .line 981
    invoke-static {}, Ll/ܺۤۨ;->ۤ()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    .line 276
    iget-object v2, v0, Ll/ۧۤۨ;->֨:Ll/ܺۤۨ;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v3

    const-wide/32 v5, 0x1fffff

    and-long/2addr v3, v5

    long-to-int v1, v3

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-ge v1, v3, :cond_0

    return-object v4

    .line 987
    :cond_0
    invoke-virtual {v0, v1}, Ll/ۧۤۨ;->ۙ(I)I

    move-result v3

    const/4 v5, 0x0

    const-wide v6, 0x7fffffffffffffffL

    :goto_0
    const-wide/16 v8, 0x0

    if-ge v5, v1, :cond_5

    add-int/lit8 v3, v3, 0x1

    if-le v3, v1, :cond_1

    const/4 v3, 0x1

    .line 992
    :cond_1
    iget-object v10, v2, Ll/ܺۤۨ;->ۢ:Ll/ۢ᩷ۨ;

    invoke-virtual {v10, v3}, Ll/ۢ᩷ۨ;->ۙ(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۧۤۨ;

    if-eqz v10, :cond_3

    if-eq v10, v0, :cond_3

    .line 994
    iget-object v10, v10, Ll/ۧۤۨ;->ܰ:Ll/ܿۤۨ;

    iget-object v11, v0, Ll/ۧۤۨ;->ᩳ:Ll/᩻ۡ᩵;

    move/from16 v12, p1

    invoke-virtual {v10, v12, v11}, Ll/ܿۤۨ;->ۙ(ILl/᩻ۡ᩵;)J

    move-result-wide v13

    const-wide/16 v15, -0x1

    cmp-long v10, v13, v15

    if-nez v10, :cond_2

    .line 996
    iget-object v1, v11, Ll/᩻ۡ᩵;->ܰ:Ljava/lang/Object;

    check-cast v1, Ll/ۨۤۨ;

    .line 997
    iput-object v4, v11, Ll/᩻ۡ᩵;->ܰ:Ljava/lang/Object;

    return-object v1

    :cond_2
    cmp-long v10, v13, v8

    if-lez v10, :cond_4

    .line 1000
    invoke-static {v6, v7, v13, v14}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    goto :goto_1

    :cond_3
    move/from16 v12, p1

    :cond_4
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_5
    const-wide v1, 0x7fffffffffffffffL

    cmp-long v3, v6, v1

    if-eqz v3, :cond_6

    goto :goto_2

    :cond_6
    move-wide v6, v8

    .line 1004
    :goto_2
    iput-wide v6, v0, Ll/ۧۤۨ;->ܿ:J

    return-object v4
.end method

.method private final ᩸()Ll/ۨۤۨ;
    .locals 2

    const/4 v0, 0x2

    .line 971
    invoke-virtual {p0, v0}, Ll/ۧۤۨ;->ۙ(I)I

    move-result v0

    iget-object v1, p0, Ll/ۧۤۨ;->֨:Ll/ܺۤۨ;

    if-nez v0, :cond_1

    .line 972
    iget-object v0, v1, Ll/ܺۤۨ;->ܿ:Ll/᩹ۤۨ;

    invoke-virtual {v0}, Ll/᩺᩷ۨ;->ۤ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨۤۨ;

    if-eqz v0, :cond_0

    return-object v0

    .line 973
    :cond_0
    iget-object v0, v1, Ll/ܺۤۨ;->᩶:Ll/᩹ۤۨ;

    invoke-virtual {v0}, Ll/᩺᩷ۨ;->ۤ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨۤۨ;

    return-object v0

    .line 975
    :cond_1
    iget-object v0, v1, Ll/ܺۤۨ;->᩶:Ll/᩹ۤۨ;

    invoke-virtual {v0}, Ll/᩺᩷ۨ;->ۤ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨۤۨ;

    if-eqz v0, :cond_2

    return-object v0

    .line 976
    :cond_2
    iget-object v0, v1, Ll/ܺۤۨ;->ܿ:Ll/᩹ۤۨ;

    invoke-virtual {v0}, Ll/᩺᩷ۨ;->ۤ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨۤۨ;

    return-object v0
.end method


# virtual methods
.method public final run()V
    .locals 14

    const/4 v1, 0x0

    :cond_0
    :goto_0
    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 709
    :cond_1
    :goto_1
    iget-object v0, p0, Ll/ۧۤۨ;->֨:Ll/ܺۤۨ;

    invoke-virtual {v0}, Ll/ܺۤۨ;->isTerminated()Z

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, p0, Ll/ۧۤۨ;->۟:Ll/᩻ۤۨ;

    sget-object v3, Ll/᩻ۤۨ;->ۢ:Ll/᩻ۤۨ;

    if-eq v0, v3, :cond_11

    .line 710
    iget-boolean v0, p0, Ll/ۧۤۨ;->᩶:Z

    invoke-virtual {p0, v0}, Ll/ۧۤۨ;->ۙ(Z)Ll/ۨۤۨ;

    move-result-object v0

    const-wide/16 v4, 0x0

    if-eqz v0, :cond_6

    .line 714
    iput-wide v4, p0, Ll/ۧۤۨ;->ܿ:J

    .line 808
    iget-object v2, p0, Ll/ۧۤۨ;->֨:Ll/ܺۤۨ;

    .line 86
    iget-object v6, v0, Ll/ۨۤۨ;->᩶:Ll/ۛۤۨ;

    invoke-interface {v6}, Ll/ۛۤۨ;->ۙ()I

    move-result v6

    .line 923
    iput-wide v4, p0, Ll/ۧۤۨ;->ۢ:J

    .line 924
    iget-object v4, p0, Ll/ۧۤۨ;->۟:Ll/᩻ۤۨ;

    sget-object v5, Ll/᩻ۤۨ;->ᩳ:Ll/᩻ۤۨ;

    if-ne v4, v5, :cond_2

    .line 926
    sget-object v4, Ll/᩻ۤۨ;->ܿ:Ll/᩻ۤۨ;

    iput-object v4, p0, Ll/ۧۤۨ;->۟:Ll/᩻ۤۨ;

    :cond_2
    if-nez v6, :cond_3

    goto :goto_2

    .line 818
    :cond_3
    sget-object v4, Ll/᩻ۤۨ;->ܿ:Ll/᩻ۤۨ;

    invoke-virtual {p0, v4}, Ll/ۧۤۨ;->ۙ(Ll/᩻ۤۨ;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 819
    invoke-virtual {v2}, Ll/ܺۤۨ;->᩷()V

    .line 811
    :cond_4
    :goto_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 584
    :try_start_0
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    .line 586
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    .line 587
    invoke-virtual {v4}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v5

    invoke-interface {v5, v4, v0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    :goto_3
    if-nez v6, :cond_5

    goto :goto_0

    .line 825
    :cond_5
    invoke-static {}, Ll/ܺۤۨ;->ۤ()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    const-wide/32 v4, -0x200000

    .line 290
    invoke-virtual {v0, v2, v4, v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 826
    iget-object v0, p0, Ll/ۧۤۨ;->۟:Ll/᩻ۤۨ;

    if-eq v0, v3, :cond_0

    .line 830
    sget-object v0, Ll/᩻ۤۨ;->۟:Ll/᩻ۤۨ;

    iput-object v0, p0, Ll/ۧۤۨ;->۟:Ll/᩻ۤۨ;

    goto :goto_0

    .line 718
    :cond_6
    iput-boolean v1, p0, Ll/ۧۤۨ;->᩶:Z

    .line 732
    iget-wide v6, p0, Ll/ۧۤۨ;->ܿ:J

    const/4 v3, 0x1

    cmp-long v0, v6, v4

    if-eqz v0, :cond_8

    if-nez v2, :cond_7

    const/4 v2, 0x1

    goto :goto_1

    .line 737
    :cond_7
    sget-object v0, Ll/᩻ۤۨ;->ᩳ:Ll/᩻ۤۨ;

    invoke-virtual {p0, v0}, Ll/ۧۤۨ;->ۙ(Ll/᩻ۤۨ;)Z

    .line 738
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 739
    iget-wide v2, p0, Ll/ۧۤۨ;->ܿ:J

    invoke-static {v2, v3}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(J)V

    .line 740
    iput-wide v4, p0, Ll/ۧۤۨ;->ܿ:J

    goto/16 :goto_0

    .line 805
    :cond_8
    iget-object v0, p0, Ll/ۧۤۨ;->nextParkedWorker:Ljava/lang/Object;

    sget-object v6, Ll/ܺۤۨ;->֨:Ll/ۜ᩷ۨ;

    if-eq v0, v6, :cond_10

    .line 0
    sget-object v0, Ll/ۧۤۨ;->ۡ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v6, -0x1

    .line 784
    invoke-virtual {v0, p0, v6}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    .line 805
    :cond_9
    :goto_4
    iget-object v0, p0, Ll/ۧۤۨ;->nextParkedWorker:Ljava/lang/Object;

    sget-object v7, Ll/ܺۤۨ;->֨:Ll/ۜ᩷ۨ;

    if-eq v0, v7, :cond_1

    .line 0
    sget-object v7, Ll/ۧۤۨ;->ۡ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 797
    invoke-virtual {v7, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    if-ne v0, v6, :cond_1

    .line 798
    iget-object v0, p0, Ll/ۧۤۨ;->֨:Ll/ܺۤۨ;

    invoke-virtual {v0}, Ll/ܺۤۨ;->isTerminated()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۧۤۨ;->۟:Ll/᩻ۤۨ;

    sget-object v8, Ll/᩻ۤۨ;->ۢ:Ll/᩻ۤۨ;

    if-ne v0, v8, :cond_a

    goto/16 :goto_1

    .line 799
    :cond_a
    sget-object v0, Ll/᩻ۤۨ;->ᩳ:Ll/᩻ۤۨ;

    invoke-virtual {p0, v0}, Ll/ۧۤۨ;->ۙ(Ll/᩻ۤۨ;)Z

    .line 800
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 854
    iget-wide v9, p0, Ll/ۧۤۨ;->ۢ:J

    cmp-long v0, v9, v4

    if-nez v0, :cond_b

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v9

    iget-object v0, p0, Ll/ۧۤۨ;->֨:Ll/ܺۤۨ;

    iget-wide v11, v0, Ll/ܺۤۨ;->֡:J

    add-long/2addr v9, v11

    iput-wide v9, p0, Ll/ۧۤۨ;->ۢ:J

    .line 856
    :cond_b
    iget-object v0, p0, Ll/ۧۤۨ;->֨:Ll/ܺۤۨ;

    iget-wide v9, v0, Ll/ܺۤۨ;->֡:J

    invoke-static {v9, v10}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(J)V

    .line 859
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v9

    iget-wide v11, p0, Ll/ۧۤۨ;->ۢ:J

    sub-long/2addr v9, v11

    cmp-long v0, v9, v4

    if-ltz v0, :cond_9

    .line 860
    iput-wide v4, p0, Ll/ۧۤۨ;->ۢ:J

    .line 869
    iget-object v9, p0, Ll/ۧۤۨ;->֨:Ll/ܺۤۨ;

    iget-object v0, v9, Ll/ܺۤۨ;->ۢ:Ll/ۢ᩷ۨ;

    .line 16
    monitor-enter v0

    .line 871
    :try_start_1
    invoke-virtual {v9}, Ll/ܺۤۨ;->isTerminated()Z

    move-result v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v10, :cond_c

    monitor-exit v0

    goto :goto_4

    .line 873
    :cond_c
    :try_start_2
    invoke-static {}, Ll/ܺۤۨ;->ۤ()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v10

    .line 276
    invoke-virtual {v10, v9}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v10

    const-wide/32 v12, 0x1fffff

    and-long/2addr v10, v12

    long-to-int v11, v10

    .line 873
    iget v10, v9, Ll/ܺۤۨ;->ܰ:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-gt v11, v10, :cond_d

    monitor-exit v0

    goto :goto_4

    .line 878
    :cond_d
    :try_start_3
    invoke-virtual {v7, p0, v6, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-nez v7, :cond_e

    monitor-exit v0

    goto :goto_4

    .line 885
    :cond_e
    :try_start_4
    iget v7, p0, Ll/ۧۤۨ;->indexInArray:I

    .line 886
    invoke-virtual {p0, v1}, Ll/ۧۤۨ;->᩷(I)V

    .line 894
    invoke-virtual {v9, p0, v7, v1}, Ll/ܺۤۨ;->ۙ(Ll/ۧۤۨ;II)V

    .line 285
    invoke-static {}, Ll/ܺۤۨ;->ۤ()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v10

    invoke-virtual {v10, v9}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndDecrement(Ljava/lang/Object;)J

    move-result-wide v10

    and-long/2addr v10, v12

    long-to-int v11, v10

    if-eq v11, v7, :cond_f

    .line 901
    iget-object v10, v9, Ll/ܺۤۨ;->ۢ:Ll/ۢ᩷ۨ;

    invoke-virtual {v10, v11}, Ll/ۢ᩷ۨ;->ۙ(I)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    check-cast v10, Ll/ۧۤۨ;

    .line 902
    iget-object v12, v9, Ll/ܺۤۨ;->ۢ:Ll/ۢ᩷ۨ;

    invoke-virtual {v12, v7, v10}, Ll/ۢ᩷ۨ;->ۙ(ILl/ۧۤۨ;)V

    .line 903
    invoke-virtual {v10, v7}, Ll/ۧۤۨ;->᩷(I)V

    .line 911
    invoke-virtual {v9, v10, v11, v7}, Ll/ܺۤۨ;->ۙ(Ll/ۧۤۨ;II)V

    .line 916
    :cond_f
    iget-object v7, v9, Ll/ܺۤۨ;->ۢ:Ll/ۢ᩷ۨ;

    const/4 v9, 0x0

    invoke-virtual {v7, v11, v9}, Ll/ۢ᩷ۨ;->ۙ(ILl/ۧۤۨ;)V

    .line 917
    sget-object v7, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 16
    monitor-exit v0

    .line 918
    iput-object v8, p0, Ll/ۧۤۨ;->۟:Ll/᩻ۤۨ;

    goto/16 :goto_4

    :catchall_1
    move-exception v1

    .line 16
    monitor-exit v0

    throw v1

    .line 781
    :cond_10
    iget-object v0, p0, Ll/ۧۤۨ;->֨:Ll/ܺۤۨ;

    invoke-virtual {v0, p0}, Ll/ܺۤۨ;->ۙ(Ll/ۧۤۨ;)V

    goto/16 :goto_1

    .line 751
    :cond_11
    sget-object v0, Ll/᩻ۤۨ;->ۢ:Ll/᩻ۤۨ;

    invoke-virtual {p0, v0}, Ll/ۧۤۨ;->ۙ(Ll/᩻ۤۨ;)Z

    return-void
.end method

.method public final ۙ()I
    .locals 1

    .line 607
    iget v0, p0, Ll/ۧۤۨ;->indexInArray:I

    return v0
.end method

.method public final ۙ(I)I
    .locals 3

    .line 839
    iget v0, p0, Ll/ۧۤۨ;->֡:I

    shl-int/lit8 v1, v0, 0xd

    xor-int/2addr v0, v1

    shr-int/lit8 v1, v0, 0x11

    xor-int/2addr v0, v1

    shl-int/lit8 v1, v0, 0x5

    xor-int/2addr v0, v1

    .line 843
    iput v0, p0, Ll/ۧۤۨ;->֡:I

    add-int/lit8 v1, p1, -0x1

    and-int v2, v1, p1

    if-nez v2, :cond_0

    and-int p1, v0, v1

    return p1

    :cond_0
    const v1, 0x7fffffff

    and-int/2addr v0, v1

    .line 849
    rem-int/2addr v0, p1

    return v0
.end method

.method public final ۙ(Z)Ll/ۨۤۨ;
    .locals 11

    .line 681
    iget-object v0, p0, Ll/ۧۤۨ;->۟:Ll/᩻ۤۨ;

    sget-object v1, Ll/᩻ۤۨ;->֡:Ll/᩻ۤۨ;

    const/4 v2, 0x1

    iget-object v9, p0, Ll/ۧۤۨ;->֨:Ll/ܺۤۨ;

    iget-object v10, p0, Ll/ۧۤۨ;->ܰ:Ll/ܿۤۨ;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 293
    :cond_0
    invoke-static {}, Ll/ܺۤۨ;->ۤ()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    :cond_1
    invoke-virtual {v0, v9}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v5

    const-wide v3, 0x7ffffc0000000000L

    and-long/2addr v3, v5

    const/16 v1, 0x2a

    shr-long/2addr v3, v1

    long-to-int v1, v3

    if-nez v1, :cond_3

    .line 942
    invoke-virtual {v10}, Ll/ܿۤۨ;->ۤ()Ll/ۨۤۨ;

    move-result-object p1

    if-nez p1, :cond_2

    .line 943
    iget-object p1, v9, Ll/ܺۤۨ;->᩶:Ll/᩹ۤۨ;

    invoke-virtual {p1}, Ll/᩺᩷ۨ;->ۤ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۨۤۨ;

    if-nez p1, :cond_2

    .line 944
    invoke-direct {p0, v2}, Ll/ۧۤۨ;->ۤ(I)Ll/ۨۤۨ;

    move-result-object p1

    :cond_2
    return-object p1

    :cond_3
    const-wide v3, 0x40000000000L

    sub-long v7, v5, v3

    .line 297
    invoke-static {}, Ll/ܺۤۨ;->ۤ()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v3

    move-object v4, v9

    invoke-virtual/range {v3 .. v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 683
    sget-object v0, Ll/᩻ۤۨ;->֡:Ll/᩻ۤۨ;

    iput-object v0, p0, Ll/ۧۤۨ;->۟:Ll/᩻ۤۨ;

    :goto_0
    if-eqz p1, :cond_7

    .line 960
    iget p1, v9, Ll/ܺۤۨ;->ܰ:I

    mul-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Ll/ۧۤۨ;->ۙ(I)I

    move-result p1

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_5

    .line 961
    invoke-direct {p0}, Ll/ۧۤۨ;->᩸()Ll/ۨۤۨ;

    move-result-object p1

    if-eqz p1, :cond_5

    return-object p1

    .line 962
    :cond_5
    invoke-virtual {v10}, Ll/ܿۤۨ;->᩷()Ll/ۨۤۨ;

    move-result-object p1

    if-eqz p1, :cond_6

    return-object p1

    :cond_6
    if-nez v2, :cond_8

    .line 963
    invoke-direct {p0}, Ll/ۧۤۨ;->᩸()Ll/ۨۤۨ;

    move-result-object p1

    if-eqz p1, :cond_8

    return-object p1

    .line 965
    :cond_7
    invoke-direct {p0}, Ll/ۧۤۨ;->᩸()Ll/ۨۤۨ;

    move-result-object p1

    if-eqz p1, :cond_8

    return-object p1

    :cond_8
    const/4 p1, 0x3

    .line 967
    invoke-direct {p0, p1}, Ll/ۧۤۨ;->ۤ(I)Ll/ۨۤۨ;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ljava/lang/Object;)V
    .locals 0

    .line 657
    iput-object p1, p0, Ll/ۧۤۨ;->nextParkedWorker:Ljava/lang/Object;

    return-void
.end method

.method public final ۙ(Ll/᩻ۤۨ;)Z
    .locals 6

    .line 695
    iget-object v0, p0, Ll/ۧۤۨ;->۟:Ll/᩻ۤۨ;

    .line 696
    sget-object v1, Ll/᩻ۤۨ;->֡:Ll/᩻ۤۨ;

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 697
    invoke-static {}, Ll/ܺۤۨ;->ۤ()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    const-wide v3, 0x40000000000L

    .line 300
    iget-object v5, p0, Ll/ۧۤۨ;->֨:Ll/ܺۤۨ;

    invoke-virtual {v2, v5, v3, v4}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    :cond_1
    if-eq v0, p1, :cond_2

    .line 698
    iput-object p1, p0, Ll/ۧۤۨ;->۟:Ll/᩻ۤۨ;

    :cond_2
    return v1
.end method

.method public final ᩷()Ljava/lang/Object;
    .locals 1

    .line 657
    iget-object v0, p0, Ll/ۧۤۨ;->nextParkedWorker:Ljava/lang/Object;

    return-object v0
.end method

.method public final ᩷(I)V
    .locals 2

    .line 609
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ۧۤۨ;->֨:Ll/ܺۤۨ;

    iget-object v1, v1, Ll/ܺۤۨ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-worker-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p1, :cond_0

    const-string v1, "TERMINATED"

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 610
    iput p1, p0, Ll/ۧۤۨ;->indexInArray:I

    return-void
.end method
