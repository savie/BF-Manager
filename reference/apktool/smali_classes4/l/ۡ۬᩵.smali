.class public Ll/ۡ۬᩵;
.super Ljava/lang/Object;
.source "D97F"

# interfaces
.implements Ll/ۚۙۨ;


# static fields
.field public static final synthetic ֫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic ۚ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final synthetic ۤ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic ۧ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final synthetic ۫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic ܳ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final synthetic ᩴ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic ᩷:I

.field public static final synthetic ᩸:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;


# instance fields
.field public volatile synthetic _closeCause$volatile:Ljava/lang/Object;

.field public volatile synthetic bufferEnd$volatile:J

.field public volatile synthetic bufferEndSegment$volatile:Ljava/lang/Object;

.field public volatile synthetic closeHandler$volatile:Ljava/lang/Object;

.field public volatile synthetic completedExpandBuffersAndPauseFlag$volatile:J

.field public volatile synthetic receiveSegment$volatile:Ljava/lang/Object;

.field public volatile synthetic receivers$volatile:J

.field public volatile synthetic sendSegment$volatile:Ljava/lang/Object;

.field public volatile synthetic sendersAndCloseStatus$volatile:J

.field public final ۙ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "sendersAndCloseStatus$volatile"

    .line 0
    const-class v1, Ll/ۡ۬᩵;

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ۡ۬᩵;->ۧ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "receivers$volatile"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ۡ۬᩵;->ۚ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "bufferEnd$volatile"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ۡ۬᩵;->᩸:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "completedExpandBuffersAndPauseFlag$volatile"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ۡ۬᩵;->ܳ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "sendSegment$volatile"

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ۡ۬᩵;->֫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "receiveSegment$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ۡ۬᩵;->۫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "bufferEndSegment$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ۡ۬᩵;->ᩴ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_closeCause$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ۡ۬᩵;->ۤ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "closeHandler$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 8

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput p1, p0, Ll/ۡ۬᩵;->ۙ:I

    if-ltz p1, :cond_3

    .line 68
    sget v0, Ll/۠۬᩵;->᩹:I

    if-eqz p1, :cond_1

    const v0, 0x7fffffff

    if-eq p1, v0, :cond_0

    int-to-long v0, p1

    goto :goto_0

    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x0

    :goto_0
    iput-wide v0, p0, Ll/ۡ۬᩵;->bufferEnd$volatile:J

    .line 0
    sget-object p1, Ll/ۡ۬᩵;->᩸:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 72
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    .line 87
    iput-wide v0, p0, Ll/ۡ۬᩵;->completedExpandBuffersAndPauseFlag$volatile:J

    .line 98
    new-instance p1, Ll/ۤۙۨ;

    const/4 v5, 0x0

    const/4 v7, 0x3

    const-wide/16 v3, 0x0

    move-object v2, p1

    move-object v6, p0

    invoke-direct/range {v2 .. v7}, Ll/ۤۙۨ;-><init>(JLl/ۤۙۨ;Ll/ۡ۬᩵;I)V

    .line 99
    iput-object p1, p0, Ll/ۡ۬᩵;->sendSegment$volatile:Ljava/lang/Object;

    .line 100
    iput-object p1, p0, Ll/ۡ۬᩵;->receiveSegment$volatile:Ljava/lang/Object;

    .line 105
    invoke-direct {p0}, Ll/ۡ۬᩵;->᩻()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Ll/۠۬᩵;->֫()Ll/ۤۙۨ;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>"

    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    iput-object p1, p0, Ll/ۡ۬᩵;->bufferEndSegment$volatile:Ljava/lang/Object;

    .line 1752
    invoke-static {}, Ll/۠۬᩵;->۫()Ll/ۜ᩷ۨ;

    move-result-object p1

    iput-object p1, p0, Ll/ۡ۬᩵;->_closeCause$volatile:Ljava/lang/Object;

    return-void

    :cond_3
    const-string v0, "Invalid channel capacity: "

    const-string v1, ", should be >=0"

    .line 0
    invoke-static {p1, v0, v1}, Ll/ܰ۟ۙ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 46
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final ֫()V
    .locals 3

    .line 0
    sget-object v0, Ll/ۡ۬᩵;->ۧ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2212
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    const/4 v2, 0x0

    .line 2215
    invoke-direct {p0, v0, v1, v2}, Ll/ۡ۬᩵;->ۙ(JZ)Z

    return-void
.end method

.method public static final ۙ(Ll/ۡ۬᩵;Ll/ۤۙۨ;ILl/۬᩷ۤ;JLjava/lang/Object;Z)I
    .locals 3

    .line 445
    invoke-virtual {p1, p2, p3}, Ll/ۤۙۨ;->ۙ(ILl/۬᩷ۤ;)V

    if-eqz p7, :cond_0

    .line 446
    invoke-direct/range {p0 .. p7}, Ll/ۡ۬᩵;->ۙ(Ll/ۤۙۨ;ILl/۬᩷ۤ;JLjava/lang/Object;Z)I

    move-result p0

    return p0

    .line 448
    :cond_0
    invoke-virtual {p1, p2}, Ll/ۤۙۨ;->ۤ(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_3

    .line 455
    invoke-direct {p0, p4, p5}, Ll/ۡ۬᩵;->ۤ(J)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 457
    sget-object v0, Ll/۠۬᩵;->ۙ:Ll/ۜ᩷ۨ;

    invoke-virtual {p1, p2, v2, v0}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    return v1

    :cond_1
    if-nez p6, :cond_2

    const/4 p0, 0x3

    return p0

    .line 471
    :cond_2
    invoke-virtual {p1, p2, v2, p6}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 p0, 0x2

    return p0

    .line 476
    :cond_3
    instance-of v2, v0, Ll/ۛ۬᩵;

    if-eqz v2, :cond_6

    .line 479
    invoke-virtual {p1, p2}, Ll/ۤۙۨ;->ۙ(I)V

    .line 481
    invoke-direct {p0, v0, p3}, Ll/ۡ۬᩵;->ۙ(Ljava/lang/Object;Ll/۬᩷ۤ;)Z

    move-result p0

    if-eqz p0, :cond_4

    .line 483
    invoke-static {}, Ll/۠۬᩵;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object p0

    invoke-virtual {p1, p2, p0}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;)V

    const/4 p0, 0x0

    return p0

    .line 491
    :cond_4
    invoke-static {}, Ll/۠۬᩵;->᩸()Ll/ۜ᩷ۨ;

    move-result-object p0

    invoke-virtual {p1, p2, p0}, Ll/ۤۙۨ;->ۙ(ILl/ۜ᩷ۨ;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ll/۠۬᩵;->᩸()Ll/ۜ᩷ۨ;

    move-result-object p3

    if-eq p0, p3, :cond_5

    .line 492
    invoke-virtual {p1, p2, v1}, Ll/ۤۙۨ;->ۙ(IZ)V

    :cond_5
    const/4 p0, 0x5

    return p0

    .line 498
    :cond_6
    invoke-direct/range {p0 .. p7}, Ll/ۡ۬᩵;->ۙ(Ll/ۤۙۨ;ILl/۬᩷ۤ;JLjava/lang/Object;Z)I

    move-result p0

    return p0
.end method

.method private final ۙ(Ll/ۤۙۨ;ILl/۬᩷ۤ;JLjava/lang/Object;Z)I
    .locals 5

    .line 522
    :cond_0
    invoke-virtual {p1, p2}, Ll/ۤۙۨ;->ۤ(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_4

    .line 529
    invoke-direct {p0, p4, p5}, Ll/ۡ۬᩵;->ۤ(J)Z

    move-result v0

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    if-nez p7, :cond_1

    .line 531
    sget-object v0, Ll/۠۬᩵;->ۙ:Ll/ۜ᩷ۨ;

    invoke-virtual {p1, p2, v4, v0}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_1
    if-eqz p7, :cond_2

    .line 542
    invoke-static {}, Ll/۠۬᩵;->ᩴ()Ll/ۜ᩷ۨ;

    move-result-object v0

    invoke-virtual {p1, p2, v4, v0}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 543
    invoke-virtual {p1, p2, v2}, Ll/ۤۙۨ;->ۙ(IZ)V

    return v1

    :cond_2
    if-nez p6, :cond_3

    const/4 p1, 0x3

    return p1

    .line 549
    :cond_3
    invoke-virtual {p1, p2, v4, p6}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x2

    return p1

    .line 554
    :cond_4
    invoke-static {}, Ll/۠۬᩵;->ܳ()Ll/ۜ᩷ۨ;

    move-result-object v4

    if-ne v0, v4, :cond_5

    .line 556
    sget-object v1, Ll/۠۬᩵;->ۙ:Ll/ۜ᩷ۨ;

    invoke-virtual {p1, p2, v0, v1}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return v3

    .line 562
    :cond_5
    invoke-static {}, Ll/۠۬᩵;->᩸()Ll/ۜ᩷ۨ;

    move-result-object p4

    const/4 p5, 0x5

    if-ne v0, p4, :cond_6

    .line 564
    invoke-virtual {p1, p2}, Ll/ۤۙۨ;->ۙ(I)V

    return p5

    .line 568
    :cond_6
    invoke-static {}, Ll/۠۬᩵;->ۧ()Ll/ۜ᩷ۨ;

    move-result-object p4

    if-ne v0, p4, :cond_7

    .line 570
    invoke-virtual {p1, p2}, Ll/ۤۙۨ;->ۙ(I)V

    return p5

    .line 574
    :cond_7
    invoke-static {}, Ll/۠۬᩵;->᩹()Ll/ۜ᩷ۨ;

    move-result-object p4

    if-ne v0, p4, :cond_8

    .line 578
    invoke-virtual {p1, p2}, Ll/ۤۙۨ;->ۙ(I)V

    .line 579
    invoke-direct {p0}, Ll/ۡ۬᩵;->֫()V

    return v1

    .line 587
    :cond_8
    invoke-virtual {p1, p2}, Ll/ۤۙۨ;->ۙ(I)V

    .line 591
    instance-of p4, v0, Ll/֫ۙۨ;

    if-eqz p4, :cond_9

    check-cast v0, Ll/֫ۙۨ;

    iget-object v0, v0, Ll/֫ۙۨ;->ۙ:Ll/ۛ۬᩵;

    .line 593
    :cond_9
    invoke-direct {p0, v0, p3}, Ll/ۡ۬᩵;->ۙ(Ljava/lang/Object;Ll/۬᩷ۤ;)Z

    move-result p3

    if-eqz p3, :cond_a

    .line 595
    invoke-static {}, Ll/۠۬᩵;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;)V

    return v2

    .line 603
    :cond_a
    invoke-static {}, Ll/۠۬᩵;->᩸()Ll/ۜ᩷ۨ;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Ll/ۤۙۨ;->ۙ(ILl/ۜ᩷ۨ;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {}, Ll/۠۬᩵;->᩸()Ll/ۜ᩷ۨ;

    move-result-object p4

    if-eq p3, p4, :cond_b

    .line 604
    invoke-virtual {p1, p2, v3}, Ll/ۤۙۨ;->ۙ(IZ)V

    :cond_b
    return p5
.end method

.method public static final synthetic ۙ(Ll/ۡ۬᩵;Ll/ۤۙۨ;IJLjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 36
    invoke-direct/range {p0 .. p5}, Ll/ۡ۬᩵;->ۙ(Ll/ۤۙۨ;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final ۙ(Ll/ۤۙۨ;IJLjava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1022
    invoke-virtual {p1, p2}, Ll/ۤۙۨ;->ۤ(I)Ljava/lang/Object;

    move-result-object v0

    const-wide v1, 0xfffffffffffffffL

    .line 1025
    sget-object v3, Ll/ۡ۬᩵;->ۧ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    if-nez v0, :cond_1

    .line 1030
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v4

    and-long/2addr v4, v1

    cmp-long v6, p3, v4

    if-ltz v6, :cond_2

    if-nez p5, :cond_0

    .line 1036
    invoke-static {}, Ll/۠۬᩵;->ܶ()Ll/ۜ᩷ۨ;

    move-result-object p1

    return-object p1

    .line 1039
    :cond_0
    invoke-virtual {p1, p2, v0, p5}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1042
    invoke-direct {p0}, Ll/ۡ۬᩵;->ۧ()V

    .line 1043
    invoke-static {}, Ll/۠۬᩵;->ܽ()Ll/ۜ᩷ۨ;

    move-result-object p1

    return-object p1

    .line 1048
    :cond_1
    sget-object v4, Ll/۠۬᩵;->ۙ:Ll/ۜ᩷ۨ;

    if-ne v0, v4, :cond_2

    invoke-static {}, Ll/۠۬᩵;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object v4

    invoke-virtual {p1, p2, v0, v4}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1050
    invoke-direct {p0}, Ll/ۡ۬᩵;->ۧ()V

    .line 1051
    invoke-virtual {p1, p2}, Ll/ۤۙۨ;->᩸(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 1071
    :cond_2
    invoke-virtual {p1, p2}, Ll/ۤۙۨ;->ۤ(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 1074
    invoke-static {}, Ll/۠۬᩵;->ܳ()Ll/ۜ᩷ۨ;

    move-result-object v4

    if-ne v0, v4, :cond_3

    goto/16 :goto_0

    .line 1108
    :cond_3
    sget-object v4, Ll/۠۬᩵;->ۙ:Ll/ۜ᩷ۨ;

    if-ne v0, v4, :cond_4

    invoke-static {}, Ll/۠۬᩵;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object v4

    invoke-virtual {p1, p2, v0, v4}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1110
    invoke-direct {p0}, Ll/ۡ۬᩵;->ۧ()V

    .line 1111
    invoke-virtual {p1, p2}, Ll/ۤۙۨ;->᩸(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 1114
    :cond_4
    invoke-static {}, Ll/۠۬᩵;->ᩴ()Ll/ۜ᩷ۨ;

    move-result-object v4

    if-ne v0, v4, :cond_5

    invoke-static {}, Ll/۠۬᩵;->ۤ()Ll/ۜ᩷ۨ;

    move-result-object p1

    return-object p1

    .line 1117
    :cond_5
    invoke-static {}, Ll/۠۬᩵;->ۧ()Ll/ۜ᩷ۨ;

    move-result-object v4

    if-ne v0, v4, :cond_6

    invoke-static {}, Ll/۠۬᩵;->ۤ()Ll/ۜ᩷ۨ;

    move-result-object p1

    return-object p1

    .line 1119
    :cond_6
    invoke-static {}, Ll/۠۬᩵;->᩹()Ll/ۜ᩷ۨ;

    move-result-object v4

    if-ne v0, v4, :cond_7

    .line 1123
    invoke-direct {p0}, Ll/ۡ۬᩵;->ۧ()V

    .line 1124
    invoke-static {}, Ll/۠۬᩵;->ۤ()Ll/ۜ᩷ۨ;

    move-result-object p1

    return-object p1

    .line 1131
    :cond_7
    invoke-static {}, Ll/۠۬᩵;->᩻()Ll/ۜ᩷ۨ;

    move-result-object v4

    if-eq v0, v4, :cond_2

    .line 1138
    invoke-static {}, Ll/۠۬᩵;->ܺ()Ll/ۜ᩷ۨ;

    move-result-object v4

    invoke-virtual {p1, p2, v0, v4}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1140
    instance-of p3, v0, Ll/֫ۙۨ;

    if-eqz p3, :cond_8

    .line 1142
    check-cast v0, Ll/֫ۙۨ;

    iget-object v0, v0, Ll/֫ۙۨ;->ۙ:Ll/ۛ۬᩵;

    .line 1143
    :cond_8
    invoke-direct {p0, v0, p1, p2}, Ll/ۡ۬᩵;->ۙ(Ljava/lang/Object;Ll/ۤۙۨ;I)Z

    move-result p4

    if-eqz p4, :cond_9

    .line 1151
    invoke-static {}, Ll/۠۬᩵;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;)V

    .line 1152
    invoke-direct {p0}, Ll/ۡ۬᩵;->ۧ()V

    .line 1153
    invoke-virtual {p1, p2}, Ll/ۤۙۨ;->᩸(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 1159
    :cond_9
    invoke-static {}, Ll/۠۬᩵;->ᩴ()Ll/ۜ᩷ۨ;

    move-result-object p4

    invoke-virtual {p1, p2, p4}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;)V

    const/4 p4, 0x0

    .line 1160
    invoke-virtual {p1, p2, p4}, Ll/ۤۙۨ;->ۙ(IZ)V

    if-eqz p3, :cond_a

    .line 1161
    invoke-direct {p0}, Ll/ۡ۬᩵;->ۧ()V

    .line 1162
    :cond_a
    invoke-static {}, Ll/۠۬᩵;->ۤ()Ll/ۜ᩷ۨ;

    move-result-object p1

    return-object p1

    .line 1079
    :cond_b
    :goto_0
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v4

    and-long/2addr v4, v1

    cmp-long v6, p3, v4

    if-gez v6, :cond_c

    .line 1084
    invoke-static {}, Ll/۠۬᩵;->ۧ()Ll/ۜ᩷ۨ;

    move-result-object v4

    invoke-virtual {p1, p2, v0, v4}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1088
    invoke-direct {p0}, Ll/ۡ۬᩵;->ۧ()V

    .line 1089
    invoke-static {}, Ll/۠۬᩵;->ۤ()Ll/ۜ᩷ۨ;

    move-result-object p1

    return-object p1

    :cond_c
    if-nez p5, :cond_d

    .line 1096
    invoke-static {}, Ll/۠۬᩵;->ܶ()Ll/ۜ᩷ۨ;

    move-result-object p1

    return-object p1

    .line 1099
    :cond_d
    invoke-virtual {p1, p2, v0, p5}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1102
    invoke-direct {p0}, Ll/ۡ۬᩵;->ۧ()V

    .line 1103
    invoke-static {}, Ll/۠۬᩵;->ܽ()Ll/ۜ᩷ۨ;

    move-result-object p1

    return-object p1
.end method

.method private final ۙ(JLl/ۤۙۨ;)Ll/ۤۙۨ;
    .locals 10

    .line 2447
    sget v0, Ll/۠۬᩵;->᩹:I

    sget-object v0, Ll/ۖ۬᩵;->ۡ:Ll/ۖ۬᩵;

    .line 69
    :goto_0
    invoke-static {p3, p1, p2, v0}, Ll/ۖ᩷ۨ;->ۙ(Ll/ۤۙۨ;JLl/᩺֨᩵;)Ljava/lang/Object;

    move-result-object v1

    .line 70
    invoke-static {v1}, Ll/ۖ᩷ۨ;->᩷(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-static {v1}, Ll/ۖ᩷ۨ;->ۙ(Ljava/lang/Object;)Ll/ۡ᩷ۨ;

    move-result-object v2

    :cond_0
    :goto_1
    sget-object v3, Ll/ۡ۬᩵;->۫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۡ᩷ۨ;

    .line 42
    iget-wide v5, v4, Ll/ۡ᩷ۨ;->ܿ:J

    iget-wide v7, v2, Ll/ۡ᩷ۨ;->ܿ:J

    cmp-long v9, v5, v7

    if-ltz v9, :cond_1

    goto :goto_2

    .line 43
    :cond_1
    invoke-virtual {v2}, Ll/ۡ᩷ۨ;->᩻()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_0

    .line 0
    :cond_2
    invoke-virtual {v3, p0, v4, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 45
    invoke-virtual {v4}, Ll/ۡ᩷ۨ;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v4}, Ll/۫᩷ۨ;->۫()V

    goto :goto_2

    .line 0
    :cond_3
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eq v5, v4, :cond_2

    .line 48
    invoke-virtual {v2}, Ll/ۡ᩷ۨ;->ۚ()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ll/۫᩷ۨ;->۫()V

    goto :goto_1

    .line 2448
    :cond_4
    :goto_2
    invoke-static {v1}, Ll/ۖ᩷ۨ;->᩷(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    .line 2453
    invoke-direct {p0}, Ll/ۡ۬᩵;->֫()V

    .line 2459
    iget-wide p1, p3, Ll/ۡ᩷ۨ;->ܿ:J

    sget v0, Ll/۠۬᩵;->᩹:I

    int-to-long v0, v0

    mul-long p1, p1, v0

    invoke-virtual {p0}, Ll/ۡ۬᩵;->ۤ()J

    move-result-wide v0

    cmp-long v3, p1, v0

    if-gez v3, :cond_c

    invoke-virtual {p3}, Ll/۫᩷ۨ;->᩷()V

    return-object v2

    .line 2464
    :cond_5
    invoke-static {v1}, Ll/ۖ᩷ۨ;->ۙ(Ljava/lang/Object;)Ll/ۡ᩷ۨ;

    move-result-object p3

    check-cast p3, Ll/ۤۙۨ;

    iget-wide v0, p3, Ll/ۡ᩷ۨ;->ܿ:J

    .line 2466
    invoke-direct {p0}, Ll/ۡ۬᩵;->᩻()Z

    move-result v3

    if-nez v3, :cond_9

    .line 0
    sget-object v3, Ll/ۡ۬᩵;->᩸:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 72
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v3

    .line 2466
    sget v5, Ll/۠۬᩵;->᩹:I

    int-to-long v5, v5

    div-long/2addr v3, v5

    cmp-long v5, p1, v3

    if-gtz v5, :cond_9

    :cond_6
    :goto_3
    sget-object v3, Ll/ۡ۬᩵;->ᩴ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۡ᩷ۨ;

    .line 42
    iget-wide v5, v4, Ll/ۡ᩷ۨ;->ܿ:J

    cmp-long v7, v5, v0

    if-gez v7, :cond_9

    .line 43
    invoke-virtual {p3}, Ll/ۡ᩷ۨ;->᩻()Z

    move-result v5

    if-eqz v5, :cond_9

    .line 0
    :cond_7
    invoke-virtual {v3, p0, v4, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 45
    invoke-virtual {v4}, Ll/ۡ᩷ۨ;->ۚ()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual {v4}, Ll/۫᩷ۨ;->۫()V

    goto :goto_4

    .line 0
    :cond_8
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eq v5, v4, :cond_7

    .line 48
    invoke-virtual {p3}, Ll/ۡ᩷ۨ;->ۚ()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {p3}, Ll/۫᩷ۨ;->۫()V

    goto :goto_3

    :cond_9
    :goto_4
    cmp-long v3, v0, p1

    if-lez v3, :cond_d

    .line 2474
    sget p1, Ll/۠۬᩵;->᩹:I

    int-to-long p1, p1

    mul-long p1, p1, v0

    .line 2583
    :cond_a
    sget-object v3, Ll/ۡ۬᩵;->ۚ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v5

    cmp-long v3, v5, p1

    if-ltz v3, :cond_b

    goto :goto_5

    .line 0
    :cond_b
    sget-object v3, Ll/ۡ۬᩵;->ۚ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-object v4, p0

    move-wide v7, p1

    .line 2586
    invoke-virtual/range {v3 .. v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v3

    if-eqz v3, :cond_a

    .line 2480
    :goto_5
    sget p1, Ll/۠۬᩵;->᩹:I

    int-to-long p1, p1

    mul-long v0, v0, p1

    invoke-virtual {p0}, Ll/ۡ۬᩵;->ۤ()J

    move-result-wide p1

    cmp-long v3, v0, p1

    if-gez v3, :cond_c

    invoke-virtual {p3}, Ll/۫᩷ۨ;->᩷()V

    :cond_c
    return-object v2

    :cond_d
    return-object p3
.end method

.method public static final synthetic ۙ(Ll/ۡ۬᩵;JLl/ۤۙۨ;)Ll/ۤۙۨ;
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2, p3}, Ll/ۡ۬᩵;->ۙ(JLl/ۤۙۨ;)Ll/ۤۙۨ;

    move-result-object p0

    return-object p0
.end method

.method private final ۙ(Ll/ۛ۬᩵;Z)V
    .locals 2

    .line 2201
    instance-of v0, p1, Ll/֨۬᩵;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    .line 2202
    instance-of v0, p1, Ll/ۧ۠᩵;

    if-eqz v0, :cond_2

    check-cast p1, Ll/ۙۢ᩵;

    if-eqz p2, :cond_0

    .line 1760
    invoke-virtual {p0}, Ll/ۡ۬᩵;->ۙ()Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_1

    new-instance p2, Ll/᩸ۙۨ;

    const-string v0, "Channel was closed"

    .line 832
    invoke-direct {p2, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 2202
    :cond_0
    invoke-virtual {p0}, Ll/ۡ۬᩵;->᩷()Ljava/lang/Throwable;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-static {p2}, Ll/ᩴ۟᩵;->ۙ(Ljava/lang/Throwable;)Ll/ۤ۟᩵;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/ۙۢ᩵;->ۙ(Ljava/lang/Object;)V

    return-void

    .line 2203
    :cond_2
    instance-of p2, p1, Ll/۫ۙۨ;

    if-nez p2, :cond_5

    .line 2204
    instance-of p2, p1, Ll/ۢ۬᩵;

    if-eqz p2, :cond_3

    check-cast p1, Ll/ۢ۬᩵;

    invoke-virtual {p1}, Ll/ۢ۬᩵;->ۙ()V

    return-void

    .line 2205
    :cond_3
    instance-of p2, p1, Ll/ᩳۤۨ;

    if-eqz p2, :cond_4

    check-cast p1, Ll/ᩳۤۨ;

    invoke-static {}, Ll/۠۬᩵;->᩹()Ll/ۜ᩷ۨ;

    move-result-object p2

    invoke-interface {p1, p0, p2}, Ll/ᩳۤۨ;->ۙ(Ll/ۡ۬᩵;Ljava/lang/Object;)Z

    return-void

    :cond_4
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 2206
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unexpected waiter: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 2203
    :cond_5
    invoke-virtual {p0}, Ll/ۡ۬᩵;->ۙ()Ljava/lang/Throwable;

    throw v1

    .line 2201
    :cond_6
    throw v1
.end method

.method public static ۙ(Ll/ۡ۬᩵;)V
    .locals 8

    .line 1393
    sget-object v0, Ll/ۡ۬᩵;->ܳ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    move-result-wide v1

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    and-long/2addr v1, v3

    const-wide/16 v5, 0x0

    cmp-long v7, v1, v5

    if-eqz v7, :cond_0

    .line 1399
    :goto_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v1

    and-long/2addr v1, v3

    cmp-long v7, v1, v5

    if-eqz v7, :cond_0

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final ۙ(JZ)Z
    .locals 15

    move-object v6, p0

    const/16 v0, 0x3c

    shr-long v0, p1, v0

    long-to-int v1, v0

    const/4 v7, 0x0

    if-eqz v1, :cond_1d

    const/4 v8, 0x1

    if-eq v1, v8, :cond_1d

    const/4 v0, 0x2

    .line 2227
    sget-object v9, Ll/ۡ۬᩵;->ۚ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-wide v2, 0xfffffffffffffffL

    if-eq v1, v0, :cond_d

    const/4 v0, 0x3

    if-ne v1, v0, :cond_c

    and-long v0, p1, v2

    .line 1973
    invoke-direct {p0, v0, v1}, Ll/ۡ۬᩵;->᩸(J)Ll/ۤۙۨ;

    move-result-object v0

    const/4 v1, 0x0

    .line 2055
    :cond_0
    sget v2, Ll/۠۬᩵;->᩹:I

    sub-int/2addr v2, v8

    :goto_0
    const/4 v3, -0x1

    if-ge v3, v2, :cond_9

    .line 2057
    iget-wide v4, v0, Ll/ۡ᩷ۨ;->ܿ:J

    sget v10, Ll/۠۬᩵;->᩹:I

    int-to-long v10, v10

    mul-long v4, v4, v10

    int-to-long v10, v2

    add-long/2addr v4, v10

    .line 2061
    :cond_1
    invoke-virtual {v0, v2}, Ll/ۤۙۨ;->ۤ(I)Ljava/lang/Object;

    move-result-object v10

    .line 2064
    invoke-static {}, Ll/۠۬᩵;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object v11

    if-eq v10, v11, :cond_a

    .line 2066
    sget-object v11, Ll/۠۬᩵;->ۙ:Ll/ۜ᩷ۨ;

    if-ne v10, v11, :cond_2

    .line 71
    invoke-virtual {v9, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v11

    cmp-long v13, v4, v11

    if-ltz v13, :cond_a

    .line 2070
    invoke-static {}, Ll/۠۬᩵;->᩹()Ll/ۜ᩷ۨ;

    move-result-object v11

    invoke-virtual {v0, v2, v10, v11}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    .line 2078
    invoke-virtual {v0, v2}, Ll/ۤۙۨ;->ۙ(I)V

    .line 2079
    invoke-virtual {v0}, Ll/ۡ᩷ۨ;->ۧ()V

    goto :goto_4

    .line 2084
    :cond_2
    invoke-static {}, Ll/۠۬᩵;->ܳ()Ll/ۜ᩷ۨ;

    move-result-object v11

    if-eq v10, v11, :cond_8

    if-nez v10, :cond_3

    goto :goto_3

    .line 2093
    :cond_3
    instance-of v11, v10, Ll/ۛ۬᩵;

    if-nez v11, :cond_6

    instance-of v11, v10, Ll/֫ۙۨ;

    if-eqz v11, :cond_4

    goto :goto_1

    .line 2117
    :cond_4
    invoke-static {}, Ll/۠۬᩵;->᩻()Ll/ۜ᩷ۨ;

    move-result-object v11

    if-eq v10, v11, :cond_a

    invoke-static {}, Ll/۠۬᩵;->ܺ()Ll/ۜ᩷ۨ;

    move-result-object v11

    if-ne v10, v11, :cond_5

    goto :goto_5

    .line 2120
    :cond_5
    invoke-static {}, Ll/۠۬᩵;->᩻()Ll/ۜ᩷ۨ;

    move-result-object v11

    if-eq v10, v11, :cond_1

    goto :goto_4

    .line 71
    :cond_6
    :goto_1
    invoke-virtual {v9, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v11

    cmp-long v13, v4, v11

    if-ltz v13, :cond_a

    .line 2097
    instance-of v11, v10, Ll/֫ۙۨ;

    if-eqz v11, :cond_7

    move-object v11, v10

    check-cast v11, Ll/֫ۙۨ;

    iget-object v11, v11, Ll/֫ۙۨ;->ۙ:Ll/ۛ۬᩵;

    goto :goto_2

    .line 2098
    :cond_7
    move-object v11, v10

    check-cast v11, Ll/ۛ۬᩵;

    .line 2100
    :goto_2
    invoke-static {}, Ll/۠۬᩵;->᩹()Ll/ۜ᩷ۨ;

    move-result-object v12

    invoke-virtual {v0, v2, v10, v12}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    .line 2107
    invoke-static {v1, v11}, Ll/ܺ᩷ۨ;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 2110
    invoke-virtual {v0, v2}, Ll/ۤۙۨ;->ۙ(I)V

    .line 2111
    invoke-virtual {v0}, Ll/ۡ᩷ۨ;->ۧ()V

    goto :goto_4

    .line 2086
    :cond_8
    :goto_3
    invoke-static {}, Ll/۠۬᩵;->᩹()Ll/ۜ᩷ۨ;

    move-result-object v11

    invoke-virtual {v0, v2, v10, v11}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    .line 2088
    invoke-virtual {v0}, Ll/ۡ᩷ۨ;->ۧ()V

    :goto_4
    add-int/lit8 v2, v2, -0x1

    goto/16 :goto_0

    .line 2126
    :cond_9
    invoke-virtual {v0}, Ll/۫᩷ۨ;->᩸()Ll/۫᩷ۨ;

    move-result-object v0

    check-cast v0, Ll/ۤۙۨ;

    if-nez v0, :cond_0

    :cond_a
    :goto_5
    if-eqz v1, :cond_1c

    .line 35
    instance-of v0, v1, Ljava/util/ArrayList;

    if-nez v0, :cond_b

    check-cast v1, Ll/ۛ۬᩵;

    .line 2197
    invoke-direct {p0, v1, v7}, Ll/ۡ۬᩵;->ۙ(Ll/ۛ۬᩵;Z)V

    goto/16 :goto_a

    .line 37
    :cond_b
    check-cast v1, Ljava/util/ArrayList;

    .line 38
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v8

    :goto_6
    if-ge v3, v0, :cond_1c

    .line 39
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ۬᩵;

    .line 2197
    invoke-direct {p0, v2, v7}, Ll/ۡ۬᩵;->ۙ(Ll/ۛ۬᩵;Z)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_6

    :cond_c
    const-string v0, "unexpected close status: "

    .line 0
    invoke-static {v1, v0}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2253
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_d
    and-long v0, p1, v2

    .line 2240
    invoke-direct {p0, v0, v1}, Ll/ۡ۬᩵;->᩸(J)Ll/ۤۙۨ;

    if-eqz p3, :cond_1c

    .line 2280
    :cond_e
    :goto_7
    sget-object v0, Ll/ۡ۬᩵;->۫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤۙۨ;

    .line 71
    invoke-virtual {v9, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    .line 2283
    invoke-virtual {p0}, Ll/ۡ۬᩵;->ۤ()J

    move-result-wide v4

    cmp-long v10, v4, v2

    if-gtz v10, :cond_f

    goto/16 :goto_a

    .line 2289
    :cond_f
    sget v4, Ll/۠۬᩵;->᩹:I

    int-to-long v4, v4

    div-long v10, v2, v4

    .line 2290
    iget-wide v12, v1, Ll/ۡ᩷ۨ;->ܿ:J

    cmp-long v14, v12, v10

    if-eqz v14, :cond_10

    .line 2292
    invoke-direct {p0, v10, v11, v1}, Ll/ۡ۬᩵;->ۙ(JLl/ۤۙۨ;)Ll/ۤۙۨ;

    move-result-object v1

    if-nez v1, :cond_10

    .line 2298
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤۙۨ;

    iget-wide v0, v0, Ll/ۡ᩷ۨ;->ܿ:J

    cmp-long v2, v0, v10

    if-gez v2, :cond_e

    goto/16 :goto_a

    .line 2300
    :cond_10
    invoke-virtual {v1}, Ll/۫᩷ۨ;->᩷()V

    .line 2302
    rem-long v4, v2, v4

    long-to-int v0, v4

    .line 2326
    :cond_11
    invoke-virtual {v1, v0}, Ll/ۤۙۨ;->ۤ(I)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1a

    .line 2329
    invoke-static {}, Ll/۠۬᩵;->ܳ()Ll/ۜ᩷ۨ;

    move-result-object v5

    if-ne v4, v5, :cond_12

    goto :goto_8

    .line 2340
    :cond_12
    sget-object v0, Ll/۠۬᩵;->ۙ:Ll/ۜ᩷ۨ;

    if-ne v4, v0, :cond_13

    goto :goto_b

    .line 2342
    :cond_13
    invoke-static {}, Ll/۠۬᩵;->ᩴ()Ll/ۜ᩷ۨ;

    move-result-object v0

    if-ne v4, v0, :cond_14

    goto :goto_9

    .line 2344
    :cond_14
    invoke-static {}, Ll/۠۬᩵;->᩹()Ll/ۜ᩷ۨ;

    move-result-object v0

    if-ne v4, v0, :cond_15

    goto :goto_9

    .line 2347
    :cond_15
    invoke-static {}, Ll/۠۬᩵;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object v0

    if-ne v4, v0, :cond_16

    goto :goto_9

    .line 2350
    :cond_16
    invoke-static {}, Ll/۠۬᩵;->ۧ()Ll/ۜ᩷ۨ;

    move-result-object v0

    if-ne v4, v0, :cond_17

    goto :goto_9

    .line 2354
    :cond_17
    invoke-static {}, Ll/۠۬᩵;->᩻()Ll/ۜ᩷ۨ;

    move-result-object v0

    if-ne v4, v0, :cond_18

    goto :goto_b

    .line 2358
    :cond_18
    invoke-static {}, Ll/۠۬᩵;->ܺ()Ll/ۜ᩷ۨ;

    move-result-object v0

    if-ne v4, v0, :cond_19

    goto :goto_9

    .line 71
    :cond_19
    invoke-virtual {v9, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    cmp-long v4, v2, v0

    if-nez v4, :cond_1b

    goto :goto_b

    .line 2331
    :cond_1a
    :goto_8
    invoke-static {}, Ll/۠۬᩵;->ۧ()Ll/ۜ᩷ۨ;

    move-result-object v5

    invoke-virtual {v1, v0, v4, v5}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_11

    .line 2335
    invoke-direct {p0}, Ll/ۡ۬᩵;->ۧ()V

    :cond_1b
    :goto_9
    const-wide/16 v0, 0x1

    add-long v4, v2, v0

    .line 2305
    sget-object v0, Ll/ۡ۬᩵;->ۚ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    goto/16 :goto_7

    :cond_1c
    :goto_a
    return v8

    :cond_1d
    :goto_b
    return v7
.end method

.method private final ۙ(Ljava/lang/Object;Ll/ۤۙۨ;I)Z
    .locals 1

    .line 1171
    instance-of v0, p1, Ll/ۧ۠᩵;

    if-eqz v0, :cond_0

    .line 1173
    check-cast p1, Ll/ۧ۠᩵;

    .line 1174
    sget-object p2, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    invoke-static {p1, p2}, Ll/۠۬᩵;->ۙ(Ll/ۧ۠᩵;Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 1176
    :cond_0
    instance-of v0, p1, Ll/ᩳۤۨ;

    if-eqz v0, :cond_3

    .line 1177
    check-cast p1, Ll/۟ۤۨ;

    .line 1178
    sget-object v0, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    invoke-virtual {p1, p0}, Ll/۟ۤۨ;->ۙ(Ll/ۡ۬᩵;)Ll/֨ۤۨ;

    move-result-object p1

    .line 1181
    sget-object v0, Ll/֨ۤۨ;->۟:Ll/֨ۤۨ;

    if-ne p1, v0, :cond_1

    invoke-virtual {p2, p3}, Ll/ۤۙۨ;->ۙ(I)V

    .line 1183
    :cond_1
    sget-object p2, Ll/֨ۤۨ;->ᩳ:Ll/֨ۤۨ;

    if-ne p1, p2, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1

    .line 1185
    :cond_3
    instance-of p2, p1, Ll/֨۬᩵;

    if-eqz p2, :cond_4

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 p2, 0x0

    invoke-static {p2, p1}, Ll/۠۬᩵;->ۙ(Ll/ۧ۠᩵;Ljava/lang/Object;)Z

    throw p2

    :cond_4
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 1186
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Unexpected waiter: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private final ۙ(Ljava/lang/Object;Ll/۬᩷ۤ;)Z
    .locals 2

    .line 656
    instance-of v0, p1, Ll/ᩳۤۨ;

    if-eqz v0, :cond_0

    .line 657
    check-cast p1, Ll/ᩳۤۨ;

    invoke-interface {p1, p0, p2}, Ll/ᩳۤۨ;->ۙ(Ll/ۡ۬᩵;Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 659
    :cond_0
    instance-of v0, p1, Ll/۫ۙۨ;

    const/4 v1, 0x0

    if-nez v0, :cond_3

    .line 663
    instance-of v0, p1, Ll/ۢ۬᩵;

    if-eqz v0, :cond_1

    .line 664
    check-cast p1, Ll/ۢ۬᩵;

    .line 665
    invoke-virtual {p1, p2}, Ll/ۢ۬᩵;->ۙ(Ll/۬᩷ۤ;)Z

    move-result p1

    return p1

    .line 667
    :cond_1
    instance-of v0, p1, Ll/ۧ۠᩵;

    if-eqz v0, :cond_2

    .line 668
    check-cast p1, Ll/ۧ۠᩵;

    .line 669
    invoke-static {p1, p2, v1}, Ll/۠۬᩵;->ۙ(Ll/ۧ۠᩵;Ljava/lang/Object;Ll/ۗ֨᩵;)Z

    move-result p1

    return p1

    :cond_2
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 671
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unexpected receiver type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 661
    :cond_3
    invoke-static {p2}, Ll/᩷ۙۨ;->ۙ(Ll/۬᩷ۤ;)Ll/᩷ۙۨ;

    move-result-object p1

    invoke-static {v1, p1, v1}, Ll/۠۬᩵;->ۙ(Ll/ۧ۠᩵;Ljava/lang/Object;Ll/ۗ֨᩵;)Z

    throw v1
.end method

.method public static final synthetic ۚ()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .locals 1

    .line 0
    sget-object v0, Ll/ۡ۬᩵;->ۚ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-object v0
.end method

.method private final ۤ(J)Z
    .locals 4

    .line 0
    sget-object v0, Ll/ۡ۬᩵;->᩸:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 72
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    .line 0
    sget-object v0, Ll/ۡ۬᩵;->ۚ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 71
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    .line 637
    iget v2, p0, Ll/ۡ۬᩵;->ۙ:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private final ۧ()V
    .locals 16

    move-object/from16 v6, p0

    .line 1196
    invoke-direct/range {p0 .. p0}, Ll/ۡ۬᩵;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 1199
    :cond_0
    sget-object v7, Ll/ۡ۬᩵;->ᩴ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v7, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤۙۨ;

    move-object v8, v0

    .line 0
    :goto_0
    sget-object v0, Ll/ۡ۬᩵;->᩸:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 1204
    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v9

    .line 1205
    sget v0, Ll/۠۬᩵;->᩹:I

    int-to-long v0, v0

    div-long v0, v9, v0

    .line 1213
    invoke-virtual/range {p0 .. p0}, Ll/ۡ۬᩵;->ۤ()J

    move-result-wide v2

    cmp-long v4, v2, v9

    if-gtz v4, :cond_2

    .line 1216
    iget-wide v2, v8, Ll/ۡ᩷ۨ;->ܿ:J

    cmp-long v4, v2, v0

    if-gez v4, :cond_1

    invoke-virtual {v8}, Ll/۫᩷ۨ;->ۤ()Ll/۫᩷ۨ;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 1217
    invoke-direct {v6, v0, v1, v8}, Ll/ۡ۬᩵;->᩷(JLl/ۤۙۨ;)V

    .line 1219
    :cond_1
    invoke-static/range {p0 .. p0}, Ll/ۡ۬᩵;->ۙ(Ll/ۡ۬᩵;)V

    return-void

    .line 1224
    :cond_2
    iget-wide v2, v8, Ll/ۡ᩷ۨ;->ܿ:J

    cmp-long v4, v2, v0

    if-eqz v4, :cond_d

    .line 2496
    sget-object v2, Ll/ۖ۬᩵;->ۡ:Ll/ۖ۬᩵;

    .line 69
    :goto_1
    invoke-static {v8, v0, v1, v2}, Ll/ۖ᩷ۨ;->ۙ(Ll/ۤۙۨ;JLl/᩺֨᩵;)Ljava/lang/Object;

    move-result-object v3

    .line 70
    invoke-static {v3}, Ll/ۖ᩷ۨ;->᩷(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    invoke-static {v3}, Ll/ۖ᩷ۨ;->ۙ(Ljava/lang/Object;)Ll/ۡ᩷ۨ;

    move-result-object v4

    :cond_3
    :goto_2
    invoke-virtual {v7, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۡ᩷ۨ;

    .line 42
    iget-wide v11, v5, Ll/ۡ᩷ۨ;->ܿ:J

    iget-wide v13, v4, Ll/ۡ᩷ۨ;->ܿ:J

    cmp-long v15, v11, v13

    if-ltz v15, :cond_4

    goto :goto_3

    .line 43
    :cond_4
    invoke-virtual {v4}, Ll/ۡ᩷ۨ;->᩻()Z

    move-result v11

    if-nez v11, :cond_5

    goto :goto_1

    .line 0
    :cond_5
    invoke-virtual {v7, v6, v5, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    .line 45
    invoke-virtual {v5}, Ll/ۡ᩷ۨ;->ۚ()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {v5}, Ll/۫᩷ۨ;->۫()V

    goto :goto_3

    .line 0
    :cond_6
    invoke-virtual {v7, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-eq v11, v5, :cond_5

    .line 48
    invoke-virtual {v4}, Ll/ۡ᩷ۨ;->ۚ()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v4}, Ll/۫᩷ۨ;->۫()V

    goto :goto_2

    .line 2497
    :cond_7
    :goto_3
    invoke-static {v3}, Ll/ۖ᩷ۨ;->᩷(Ljava/lang/Object;)Z

    move-result v2

    const/4 v11, 0x0

    if-eqz v2, :cond_8

    .line 2502
    invoke-direct/range {p0 .. p0}, Ll/ۡ۬᩵;->֫()V

    .line 2505
    invoke-direct {v6, v0, v1, v8}, Ll/ۡ۬᩵;->᩷(JLl/ۤۙۨ;)V

    .line 2508
    invoke-static/range {p0 .. p0}, Ll/ۡ۬᩵;->ۙ(Ll/ۡ۬᩵;)V

    goto :goto_5

    .line 2512
    :cond_8
    invoke-static {v3}, Ll/ۖ᩷ۨ;->ۙ(Ljava/lang/Object;)Ll/ۡ᩷ۨ;

    move-result-object v2

    check-cast v2, Ll/ۤۙۨ;

    iget-wide v3, v2, Ll/ۡ᩷ۨ;->ܿ:J

    cmp-long v5, v3, v0

    if-lez v5, :cond_a

    const-wide/16 v0, 0x1

    add-long v12, v9, v0

    .line 2520
    sget v0, Ll/۠۬᩵;->᩹:I

    int-to-long v0, v0

    mul-long v14, v3, v0

    sget-object v0, Ll/ۡ۬᩵;->᩸:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-object/from16 v1, p0

    move-wide v2, v12

    move-wide v4, v14

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_9

    sub-long/2addr v14, v9

    .line 1393
    sget-object v0, Ll/ۡ۬᩵;->ܳ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v0, v6, v14, v15}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    move-result-wide v1

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    and-long/2addr v1, v3

    const-wide/16 v12, 0x0

    cmp-long v5, v1, v12

    if-eqz v5, :cond_b

    .line 1399
    :goto_4
    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v1

    and-long/2addr v1, v3

    cmp-long v5, v1, v12

    if-eqz v5, :cond_b

    goto :goto_4

    .line 2523
    :cond_9
    invoke-static/range {p0 .. p0}, Ll/ۡ۬᩵;->ۙ(Ll/ۡ۬᩵;)V

    goto :goto_5

    :cond_a
    move-object v11, v2

    :cond_b
    :goto_5
    if-nez v11, :cond_c

    goto/16 :goto_0

    :cond_c
    move-object v8, v11

    .line 1236
    :cond_d
    sget v0, Ll/۠۬᩵;->᩹:I

    int-to-long v0, v0

    rem-long v0, v9, v0

    long-to-int v1, v0

    .line 1268
    invoke-virtual {v8, v1}, Ll/ۤۙۨ;->ۤ(I)Ljava/lang/Object;

    move-result-object v0

    .line 1269
    instance-of v2, v0, Ll/ۛ۬᩵;

    sget-object v3, Ll/ۡ۬᩵;->ۚ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const/4 v4, 0x0

    if-eqz v2, :cond_f

    .line 1277
    invoke-virtual {v3, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v11

    cmp-long v2, v9, v11

    if-ltz v2, :cond_f

    .line 1283
    invoke-static {}, Ll/۠۬᩵;->᩻()Ll/ۜ᩷ۨ;

    move-result-object v2

    invoke-virtual {v8, v1, v0, v2}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    .line 1284
    invoke-direct {v6, v0, v8, v1}, Ll/ۡ۬᩵;->ۙ(Ljava/lang/Object;Ll/ۤۙۨ;I)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 1287
    sget-object v0, Ll/۠۬᩵;->ۙ:Ll/ۜ᩷ۨ;

    invoke-virtual {v8, v1, v0}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;)V

    goto/16 :goto_8

    .line 1291
    :cond_e
    invoke-static {}, Ll/۠۬᩵;->ᩴ()Ll/ۜ᩷ۨ;

    move-result-object v0

    invoke-virtual {v8, v1, v0}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;)V

    .line 1292
    invoke-virtual {v8, v1, v4}, Ll/ۤۙۨ;->ۙ(IZ)V

    goto :goto_7

    .line 1314
    :cond_f
    :goto_6
    invoke-virtual {v8, v1}, Ll/ۤۙۨ;->ۤ(I)Ljava/lang/Object;

    move-result-object v0

    .line 1317
    instance-of v2, v0, Ll/ۛ۬᩵;

    if-eqz v2, :cond_12

    .line 1325
    invoke-virtual {v3, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v11

    cmp-long v2, v9, v11

    if-gez v2, :cond_10

    .line 1336
    new-instance v2, Ll/֫ۙۨ;

    move-object v5, v0

    check-cast v5, Ll/ۛ۬᩵;

    invoke-direct {v2, v5}, Ll/֫ۙۨ;-><init>(Ll/ۛ۬᩵;)V

    invoke-virtual {v8, v1, v0, v2}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    goto/16 :goto_8

    .line 1344
    :cond_10
    invoke-static {}, Ll/۠۬᩵;->᩻()Ll/ۜ᩷ۨ;

    move-result-object v2

    invoke-virtual {v8, v1, v0, v2}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    .line 1345
    invoke-direct {v6, v0, v8, v1}, Ll/ۡ۬᩵;->ۙ(Ljava/lang/Object;Ll/ۤۙۨ;I)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 1348
    sget-object v0, Ll/۠۬᩵;->ۙ:Ll/ۜ᩷ۨ;

    invoke-virtual {v8, v1, v0}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;)V

    goto :goto_8

    .line 1352
    :cond_11
    invoke-static {}, Ll/۠۬᩵;->ᩴ()Ll/ۜ᩷ۨ;

    move-result-object v0

    invoke-virtual {v8, v1, v0}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;)V

    .line 1353
    invoke-virtual {v8, v1, v4}, Ll/ۤۙۨ;->ۙ(IZ)V

    goto :goto_7

    .line 1360
    :cond_12
    invoke-static {}, Ll/۠۬᩵;->ᩴ()Ll/ۜ᩷ۨ;

    move-result-object v2

    if-ne v0, v2, :cond_13

    .line 1251
    :goto_7
    invoke-static/range {p0 .. p0}, Ll/ۡ۬᩵;->ۙ(Ll/ۡ۬᩵;)V

    goto/16 :goto_0

    :cond_13
    if-nez v0, :cond_14

    .line 1366
    invoke-static {}, Ll/۠۬᩵;->ܳ()Ll/ۜ᩷ۨ;

    move-result-object v2

    invoke-virtual {v8, v1, v0, v2}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    goto :goto_8

    .line 1369
    :cond_14
    sget-object v2, Ll/۠۬᩵;->ۙ:Ll/ۜ᩷ۨ;

    if-ne v0, v2, :cond_15

    goto :goto_8

    .line 1371
    :cond_15
    invoke-static {}, Ll/۠۬᩵;->ۧ()Ll/ۜ᩷ۨ;

    move-result-object v2

    if-eq v0, v2, :cond_19

    invoke-static {}, Ll/۠۬᩵;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object v2

    if-eq v0, v2, :cond_19

    invoke-static {}, Ll/۠۬᩵;->᩸()Ll/ۜ᩷ۨ;

    move-result-object v2

    if-ne v0, v2, :cond_16

    goto :goto_8

    .line 1374
    :cond_16
    invoke-static {}, Ll/۠۬᩵;->᩹()Ll/ۜ᩷ۨ;

    move-result-object v2

    if-ne v0, v2, :cond_17

    goto :goto_8

    .line 1378
    :cond_17
    invoke-static {}, Ll/۠۬᩵;->ܺ()Ll/ۜ᩷ۨ;

    move-result-object v2

    if-ne v0, v2, :cond_18

    goto :goto_6

    :cond_18
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1379
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected cell state: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1245
    :cond_19
    :goto_8
    invoke-static/range {p0 .. p0}, Ll/ۡ۬᩵;->ۙ(Ll/ۡ۬᩵;)V

    return-void
.end method

.method public static final synthetic ۫()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    .line 0
    sget-object v0, Ll/ۡ۬᩵;->۫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method public static final ᩷(Ll/ۡ۬᩵;JLl/ۤۙۨ;)Ll/ۤۙۨ;
    .locals 11

    .line 2392
    sget v0, Ll/۠۬᩵;->᩹:I

    sget-object v0, Ll/ۖ۬᩵;->ۡ:Ll/ۖ۬᩵;

    .line 69
    :goto_0
    invoke-static {p3, p1, p2, v0}, Ll/ۖ᩷ۨ;->ۙ(Ll/ۤۙۨ;JLl/᩺֨᩵;)Ljava/lang/Object;

    move-result-object v1

    .line 70
    invoke-static {v1}, Ll/ۖ᩷ۨ;->᩷(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-static {v1}, Ll/ۖ᩷ۨ;->ۙ(Ljava/lang/Object;)Ll/ۡ᩷ۨ;

    move-result-object v2

    :cond_0
    :goto_1
    sget-object v3, Ll/ۡ۬᩵;->֫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۡ᩷ۨ;

    .line 42
    iget-wide v5, v4, Ll/ۡ᩷ۨ;->ܿ:J

    iget-wide v7, v2, Ll/ۡ᩷ۨ;->ܿ:J

    cmp-long v9, v5, v7

    if-ltz v9, :cond_1

    goto :goto_2

    .line 43
    :cond_1
    invoke-virtual {v2}, Ll/ۡ᩷ۨ;->᩻()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_0

    .line 0
    :cond_2
    invoke-virtual {v3, p0, v4, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 45
    invoke-virtual {v4}, Ll/ۡ᩷ۨ;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v4}, Ll/۫᩷ۨ;->۫()V

    goto :goto_2

    .line 0
    :cond_3
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eq v5, v4, :cond_2

    .line 48
    invoke-virtual {v2}, Ll/ۡ᩷ۨ;->ۚ()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ll/۫᩷ۨ;->۫()V

    goto :goto_1

    .line 2393
    :cond_4
    :goto_2
    invoke-static {v1}, Ll/ۖ᩷ۨ;->᩷(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    sget-object v3, Ll/ۡ۬᩵;->ۚ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    if-eqz v0, :cond_5

    .line 2398
    invoke-direct {p0}, Ll/ۡ۬᩵;->֫()V

    .line 2404
    iget-wide p1, p3, Ll/ۡ᩷ۨ;->ܿ:J

    sget v0, Ll/۠۬᩵;->᩹:I

    int-to-long v0, v0

    mul-long p1, p1, v0

    .line 71
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    cmp-long p0, p1, v0

    if-gez p0, :cond_8

    .line 2404
    invoke-virtual {p3}, Ll/۫᩷ۨ;->᩷()V

    return-object v2

    .line 2409
    :cond_5
    invoke-static {v1}, Ll/ۖ᩷ۨ;->ۙ(Ljava/lang/Object;)Ll/ۡ᩷ۨ;

    move-result-object p3

    check-cast p3, Ll/ۤۙۨ;

    iget-wide v0, p3, Ll/ۡ᩷ۨ;->ܿ:J

    cmp-long v4, v0, p1

    if-lez v4, :cond_9

    .line 2415
    sget p1, Ll/۠۬᩵;->᩹:I

    int-to-long p1, p1

    mul-long p1, p1, v0

    .line 2568
    :cond_6
    sget-object v4, Ll/ۡ۬᩵;->ۧ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v7

    const-wide v4, 0xfffffffffffffffL

    and-long/2addr v4, v7

    cmp-long v6, v4, p1

    if-ltz v6, :cond_7

    goto :goto_3

    :cond_7
    const/16 v6, 0x3c

    shr-long v9, v7, v6

    long-to-int v10, v9

    .line 2572
    sget v9, Ll/۠۬᩵;->᩹:I

    int-to-long v9, v10

    shl-long/2addr v9, v6

    add-long/2addr v9, v4

    .line 0
    sget-object v5, Ll/ۡ۬᩵;->ۧ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-object v6, p0

    .line 2573
    invoke-virtual/range {v5 .. v10}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 2421
    :goto_3
    sget p1, Ll/۠۬᩵;->᩹:I

    int-to-long p1, p1

    mul-long v0, v0, p1

    .line 71
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide p0

    cmp-long p2, v0, p0

    if-gez p2, :cond_8

    .line 2421
    invoke-virtual {p3}, Ll/۫᩷ۨ;->᩷()V

    :cond_8
    return-object v2

    :cond_9
    return-object p3
.end method

.method private final ᩷(JLl/ۤۙۨ;)V
    .locals 5

    .line 2544
    :goto_0
    iget-wide v0, p3, Ll/ۡ᩷ۨ;->ܿ:J

    cmp-long v2, v0, p1

    if-gez v2, :cond_1

    .line 2545
    invoke-virtual {p3}, Ll/۫᩷ۨ;->ۤ()Ll/۫᩷ۨ;

    move-result-object v0

    check-cast v0, Ll/ۤۙۨ;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    move-object p3, v0

    goto :goto_0

    .line 2551
    :cond_1
    :goto_1
    invoke-virtual {p3}, Ll/ۡ᩷ۨ;->ᩴ()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 2552
    invoke-virtual {p3}, Ll/۫᩷ۨ;->ۤ()Ll/۫᩷ۨ;

    move-result-object p1

    check-cast p1, Ll/ۤۙۨ;

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    move-object p3, p1

    goto :goto_1

    .line 2557
    :cond_3
    :goto_2
    sget-object p1, Ll/ۡ۬᩵;->ᩴ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۡ᩷ۨ;

    .line 42
    iget-wide v0, p2, Ll/ۡ᩷ۨ;->ܿ:J

    iget-wide v2, p3, Ll/ۡ᩷ۨ;->ܿ:J

    cmp-long v4, v0, v2

    if-ltz v4, :cond_4

    goto :goto_3

    .line 43
    :cond_4
    invoke-virtual {p3}, Ll/ۡ᩷ۨ;->᩻()Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_1

    .line 0
    :cond_5
    invoke-virtual {p1, p0, p2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 45
    invoke-virtual {p2}, Ll/ۡ᩷ۨ;->ۚ()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p2}, Ll/۫᩷ۨ;->۫()V

    :cond_6
    :goto_3
    return-void

    .line 0
    :cond_7
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p2, :cond_5

    .line 48
    invoke-virtual {p3}, Ll/ۡ᩷ۨ;->ۚ()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p3}, Ll/۫᩷ۨ;->۫()V

    goto :goto_2
.end method

.method private final ᩸(J)Ll/ۤۙۨ;
    .locals 12

    .line 0
    sget-object v0, Ll/ۡ۬᩵;->ᩴ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 1984
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 0
    sget-object v1, Ll/ۡ۬᩵;->֫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 1985
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤۙۨ;

    iget-wide v2, v1, Ll/ۡ᩷ۨ;->ܿ:J

    move-object v4, v0

    check-cast v4, Ll/ۤۙۨ;

    iget-wide v4, v4, Ll/ۡ᩷ۨ;->ܿ:J

    cmp-long v6, v2, v4

    if-lez v6, :cond_0

    move-object v0, v1

    .line 0
    :cond_0
    sget-object v1, Ll/ۡ۬᩵;->۫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 1986
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤۙۨ;

    iget-wide v2, v1, Ll/ۡ᩷ۨ;->ܿ:J

    move-object v4, v0

    check-cast v4, Ll/ۤۙۨ;

    iget-wide v4, v4, Ll/ۡ᩷ۨ;->ܿ:J

    cmp-long v6, v2, v4

    if-lez v6, :cond_1

    move-object v0, v1

    .line 1989
    :cond_1
    check-cast v0, Ll/۫᩷ۨ;

    invoke-static {v0}, Ll/ۖ᩷ۨ;->ۙ(Ll/۫᩷ۨ;)Ll/۫᩷ۨ;

    move-result-object v0

    check-cast v0, Ll/ۤۙۨ;

    .line 1954
    invoke-virtual {p0}, Ll/ۡ۬᩵;->ᩴ()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, -0x1

    if-eqz v1, :cond_8

    move-object v1, v0

    .line 2005
    :cond_2
    sget v4, Ll/۠۬᩵;->᩹:I

    sub-int/2addr v4, v2

    :goto_0
    const-wide/16 v5, -0x1

    if-ge v3, v4, :cond_7

    .line 2007
    iget-wide v7, v1, Ll/ۡ᩷ۨ;->ܿ:J

    sget v9, Ll/۠۬᩵;->᩹:I

    int-to-long v9, v9

    mul-long v7, v7, v9

    int-to-long v9, v4

    add-long/2addr v7, v9

    .line 0
    sget-object v9, Ll/ۡ۬᩵;->ۚ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 71
    invoke-virtual {v9, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v9

    cmp-long v11, v7, v9

    if-gez v11, :cond_3

    goto :goto_2

    .line 2011
    :cond_3
    invoke-virtual {v1, v4}, Ll/ۤۙۨ;->ۤ(I)Ljava/lang/Object;

    move-result-object v9

    if-eqz v9, :cond_5

    .line 2014
    invoke-static {}, Ll/۠۬᩵;->ܳ()Ll/ۜ᩷ۨ;

    move-result-object v10

    if-ne v9, v10, :cond_4

    goto :goto_1

    .line 2022
    :cond_4
    sget-object v10, Ll/۠۬᩵;->ۙ:Ll/ۜ᩷ۨ;

    if-ne v9, v10, :cond_6

    goto :goto_3

    .line 2016
    :cond_5
    :goto_1
    invoke-static {}, Ll/۠۬᩵;->᩹()Ll/ۜ᩷ۨ;

    move-result-object v10

    invoke-virtual {v1, v4, v9, v10}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 2017
    invoke-virtual {v1}, Ll/ۡ᩷ۨ;->ۧ()V

    :cond_6
    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    .line 2029
    :cond_7
    invoke-virtual {v1}, Ll/۫᩷ۨ;->᩸()Ll/۫᩷ۨ;

    move-result-object v1

    check-cast v1, Ll/ۤۙۨ;

    if-nez v1, :cond_2

    :goto_2
    move-wide v7, v5

    :goto_3
    cmp-long v1, v7, v5

    if-eqz v1, :cond_8

    .line 1957
    invoke-virtual {p0, v7, v8}, Ll/ۡ۬᩵;->ۙ(J)V

    :cond_8
    const/4 v1, 0x0

    move-object v4, v0

    :goto_4
    if-eqz v4, :cond_f

    .line 2149
    sget v5, Ll/۠۬᩵;->᩹:I

    sub-int/2addr v5, v2

    :goto_5
    if-ge v3, v5, :cond_e

    .line 2151
    iget-wide v6, v4, Ll/ۡ᩷ۨ;->ܿ:J

    sget v8, Ll/۠۬᩵;->᩹:I

    int-to-long v8, v8

    mul-long v6, v6, v8

    int-to-long v8, v5

    add-long/2addr v6, v8

    cmp-long v8, v6, p1

    if-ltz v8, :cond_f

    .line 2154
    :cond_9
    invoke-virtual {v4, v5}, Ll/ۤۙۨ;->ۤ(I)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_c

    .line 2156
    invoke-static {}, Ll/۠۬᩵;->ܳ()Ll/ۜ᩷ۨ;

    move-result-object v7

    if-ne v6, v7, :cond_a

    goto :goto_6

    .line 2162
    :cond_a
    instance-of v7, v6, Ll/֫ۙۨ;

    if-eqz v7, :cond_b

    .line 2163
    invoke-static {}, Ll/۠۬᩵;->᩹()Ll/ۜ᩷ۨ;

    move-result-object v7

    invoke-virtual {v4, v5, v6, v7}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    .line 2164
    check-cast v6, Ll/֫ۙۨ;

    iget-object v6, v6, Ll/֫ۙۨ;->ۙ:Ll/ۛ۬᩵;

    invoke-static {v1, v6}, Ll/ܺ᩷ۨ;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 2165
    invoke-virtual {v4, v5, v2}, Ll/ۤۙۨ;->ۙ(IZ)V

    goto :goto_7

    .line 2169
    :cond_b
    instance-of v7, v6, Ll/ۛ۬᩵;

    if-eqz v7, :cond_d

    .line 2170
    invoke-static {}, Ll/۠۬᩵;->᩹()Ll/ۜ᩷ۨ;

    move-result-object v7

    invoke-virtual {v4, v5, v6, v7}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    .line 2171
    invoke-static {v1, v6}, Ll/ܺ᩷ۨ;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 2172
    invoke-virtual {v4, v5, v2}, Ll/ۤۙۨ;->ۙ(IZ)V

    goto :goto_7

    .line 2157
    :cond_c
    :goto_6
    invoke-static {}, Ll/۠۬᩵;->᩹()Ll/ۜ᩷ۨ;

    move-result-object v7

    invoke-virtual {v4, v5, v6, v7}, Ll/ۤۙۨ;->ۙ(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    .line 2158
    invoke-virtual {v4}, Ll/ۡ᩷ۨ;->ۧ()V

    :cond_d
    :goto_7
    add-int/lit8 v5, v5, -0x1

    goto :goto_5

    .line 2181
    :cond_e
    invoke-virtual {v4}, Ll/۫᩷ۨ;->᩸()Ll/۫᩷ۨ;

    move-result-object v4

    check-cast v4, Ll/ۤۙۨ;

    goto :goto_4

    :cond_f
    if-eqz v1, :cond_11

    .line 35
    instance-of p1, v1, Ljava/util/ArrayList;

    if-nez p1, :cond_10

    check-cast v1, Ll/ۛ۬᩵;

    .line 2191
    invoke-direct {p0, v1, v2}, Ll/ۡ۬᩵;->ۙ(Ll/ۛ۬᩵;Z)V

    return-object v0

    .line 37
    :cond_10
    check-cast v1, Ljava/util/ArrayList;

    .line 38
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, v2

    :goto_8
    if-ge v3, p1, :cond_11

    .line 39
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۛ۬᩵;

    .line 2191
    invoke-direct {p0, p2, v2}, Ll/ۡ۬᩵;->ۙ(Ll/ۛ۬᩵;Z)V

    add-int/lit8 p1, p1, -0x1

    goto :goto_8

    :cond_11
    return-object v0
.end method

.method private final ᩻()Z
    .locals 5

    .line 0
    sget-object v0, Ll/ۡ۬᩵;->᩸:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 72
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 15

    .line 2595
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 0
    sget-object v1, Ll/ۡ۬᩵;->ۧ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2597
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v1

    const/16 v3, 0x3c

    shr-long/2addr v1, v3

    long-to-int v2, v1

    const/4 v1, 0x3

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    if-eq v2, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "cancelled,"

    .line 2599
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string v2, "closed,"

    .line 2598
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2602
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "capacity="

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Ll/ۡ۬᩵;->ۙ:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v4, 0x2c

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "data=["

    .line 2604
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v1, v1, [Ll/ۤۙۨ;

    .line 0
    sget-object v2, Ll/ۡ۬᩵;->۫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2605
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/4 v5, 0x0

    aput-object v2, v1, v5

    .line 0
    sget-object v2, Ll/ۡ۬᩵;->֫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2605
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/4 v5, 0x1

    aput-object v2, v1, v5

    .line 0
    sget-object v2, Ll/ۡ۬᩵;->ᩴ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2605
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-static {v1}, Ll/۟۟᩵;->ۙ([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 766
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 4228
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ll/ۤۙۨ;

    .line 2606
    invoke-static {}, Ll/۠۬᩵;->֫()Ll/ۤۙۨ;

    move-result-object v6

    if-eq v5, v6, :cond_2

    .line 4228
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 2310
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 2311
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1f

    .line 2312
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 2313
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_2

    .line 4234
    :cond_4
    move-object v3, v2

    check-cast v3, Ll/ۤۙۨ;

    .line 2607
    iget-wide v5, v3, Ll/ۡ᩷ۨ;->ܿ:J

    .line 4236
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 4237
    move-object v7, v3

    check-cast v7, Ll/ۤۙۨ;

    .line 2607
    iget-wide v7, v7, Ll/ۡ᩷ۨ;->ܿ:J

    cmp-long v9, v5, v7

    if-lez v9, :cond_6

    move-object v2, v3

    move-wide v5, v7

    .line 4242
    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_5

    .line 2607
    :goto_2
    check-cast v2, Ll/ۤۙۨ;

    .line 0
    sget-object v1, Ll/ۡ۬᩵;->ۚ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 71
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v7

    .line 2609
    invoke-virtual {p0}, Ll/ۡ۬᩵;->ۤ()J

    move-result-wide v9

    .line 2612
    :cond_7
    sget v1, Ll/۠۬᩵;->᩹:I

    const/4 v3, 0x0

    :goto_3
    if-ge v3, v1, :cond_1c

    .line 2613
    iget-wide v5, v2, Ll/ۡ᩷ۨ;->ܿ:J

    sget v11, Ll/۠۬᩵;->᩹:I

    int-to-long v11, v11

    mul-long v5, v5, v11

    int-to-long v11, v3

    add-long/2addr v5, v11

    cmp-long v11, v5, v9

    if-ltz v11, :cond_8

    cmp-long v12, v5, v7

    if-gez v12, :cond_1d

    .line 2615
    :cond_8
    invoke-virtual {v2, v3}, Ll/ۤۙۨ;->ۤ(I)Ljava/lang/Object;

    move-result-object v12

    .line 2616
    invoke-virtual {v2, v3}, Ll/ۤۙۨ;->᩷(I)Ljava/lang/Object;

    move-result-object v13

    .line 2618
    instance-of v14, v12, Ll/ۧ۠᩵;

    if-eqz v14, :cond_b

    cmp-long v12, v5, v7

    if-gez v12, :cond_9

    if-ltz v11, :cond_9

    const-string v5, "receive"

    goto/16 :goto_b

    :cond_9
    if-gez v11, :cond_a

    if-ltz v12, :cond_a

    const-string v5, "send"

    goto/16 :goto_b

    :cond_a
    const-string v5, "cont"

    goto/16 :goto_b

    .line 2625
    :cond_b
    instance-of v14, v12, Ll/ᩳۤۨ;

    if-eqz v14, :cond_e

    cmp-long v12, v5, v7

    if-gez v12, :cond_c

    if-ltz v11, :cond_c

    const-string v5, "onReceive"

    goto/16 :goto_b

    :cond_c
    if-gez v11, :cond_d

    if-ltz v12, :cond_d

    const-string v5, "onSend"

    goto/16 :goto_b

    :cond_d
    const-string v5, "select"

    goto/16 :goto_b

    .line 2632
    :cond_e
    instance-of v5, v12, Ll/۫ۙۨ;

    if-eqz v5, :cond_f

    const-string v5, "receiveCatching"

    goto/16 :goto_b

    .line 2633
    :cond_f
    instance-of v5, v12, Ll/֨۬᩵;

    if-eqz v5, :cond_10

    const-string v5, "sendBroadcast"

    goto/16 :goto_b

    .line 2634
    :cond_10
    instance-of v5, v12, Ll/֫ۙۨ;

    if-eqz v5, :cond_11

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "EB("

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v6, 0x29

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto/16 :goto_b

    .line 2635
    :cond_11
    invoke-static {}, Ll/۠۬᩵;->ܺ()Ll/ۜ᩷ۨ;

    move-result-object v5

    invoke-static {v12, v5}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_12

    const/4 v5, 0x1

    goto :goto_4

    :cond_12
    invoke-static {}, Ll/۠۬᩵;->᩻()Ll/ۜ᩷ۨ;

    move-result-object v5

    invoke-static {v12, v5}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    :goto_4
    if-eqz v5, :cond_13

    const-string v5, "resuming_sender"

    goto :goto_b

    :cond_13
    if-nez v12, :cond_14

    const/4 v5, 0x1

    goto :goto_5

    .line 2636
    :cond_14
    invoke-static {}, Ll/۠۬᩵;->ܳ()Ll/ۜ᩷ۨ;

    move-result-object v5

    .line 169
    invoke-virtual {v12, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    :goto_5
    if-eqz v5, :cond_15

    const/4 v5, 0x1

    goto :goto_6

    .line 2636
    :cond_15
    invoke-static {}, Ll/۠۬᩵;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object v5

    invoke-static {v12, v5}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    :goto_6
    if-eqz v5, :cond_16

    const/4 v5, 0x1

    goto :goto_7

    :cond_16
    invoke-static {}, Ll/۠۬᩵;->ۧ()Ll/ۜ᩷ۨ;

    move-result-object v5

    invoke-static {v12, v5}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    :goto_7
    if-eqz v5, :cond_17

    const/4 v5, 0x1

    goto :goto_8

    :cond_17
    invoke-static {}, Ll/۠۬᩵;->᩸()Ll/ۜ᩷ۨ;

    move-result-object v5

    invoke-static {v12, v5}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    :goto_8
    if-eqz v5, :cond_18

    const/4 v5, 0x1

    goto :goto_9

    :cond_18
    invoke-static {}, Ll/۠۬᩵;->ᩴ()Ll/ۜ᩷ۨ;

    move-result-object v5

    invoke-static {v12, v5}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    :goto_9
    if-eqz v5, :cond_19

    const/4 v5, 0x1

    goto :goto_a

    :cond_19
    invoke-static {}, Ll/۠۬᩵;->᩹()Ll/ۜ᩷ۨ;

    move-result-object v5

    invoke-static {v12, v5}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    :goto_a
    if-nez v5, :cond_1b

    .line 2637
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    :goto_b
    if-eqz v13, :cond_1a

    .line 2640
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v11, "("

    invoke-direct {v6, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "),"

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_c

    .line 2642
    :cond_1a
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1b
    :goto_c
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_3

    .line 2646
    :cond_1c
    invoke-virtual {v2}, Ll/۫᩷ۨ;->ۤ()Ll/۫᩷ۨ;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ll/ۤۙۨ;

    if-nez v2, :cond_7

    .line 2648
    :cond_1d
    invoke-static {v0}, Ll/֨ۖ᩵;->ۙ(Ljava/lang/StringBuilder;)C

    move-result v1

    if-ne v1, v4, :cond_1e

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "deleteCharAt(...)"

    invoke-static {v1, v2}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1e
    const-string v1, "]"

    .line 2649
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2651
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 2311
    :cond_1f
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public ۙ(Ll/۬᩷ۤ;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v8, p0

    .line 188
    sget-object v9, Ll/ۡ۬᩵;->ۧ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v9, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    const/4 v10, 0x0

    .line 2215
    invoke-direct {v8, v0, v1, v10}, Ll/ۡ۬᩵;->ۙ(JZ)Z

    move-result v2

    const/4 v11, 0x1

    const-wide v3, 0xfffffffffffffffL

    if-eqz v2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    and-long/2addr v0, v3

    .line 629
    invoke-direct {v8, v0, v1}, Ll/ۡ۬᩵;->ۤ(J)Z

    move-result v0

    xor-int/2addr v0, v11

    :goto_0
    if-eqz v0, :cond_1

    .line 488
    invoke-static {}, Ll/᩷ۙۨ;->ۙ()Ll/ۙۙۨ;

    move-result-object v0

    return-object v0

    .line 197
    :cond_1
    invoke-static {}, Ll/۠۬᩵;->ᩴ()Ll/ۜ᩷ۨ;

    move-result-object v12

    .line 0
    sget-object v0, Ll/ۡ۬᩵;->֫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 273
    invoke-virtual {v0, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤۙۨ;

    .line 277
    :goto_1
    invoke-virtual {v9, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v1

    and-long v13, v1, v3

    .line 2215
    invoke-direct {v8, v1, v2, v10}, Ll/ۡ۬᩵;->ۙ(JZ)Z

    move-result v15

    .line 282
    sget v7, Ll/۠۬᩵;->᩹:I

    int-to-long v1, v7

    div-long v3, v13, v1

    .line 283
    rem-long v1, v13, v1

    long-to-int v6, v1

    .line 286
    iget-wide v1, v0, Ll/ۡ᩷ۨ;->ܿ:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_3

    .line 288
    invoke-static {v8, v3, v4, v0}, Ll/ۡ۬᩵;->᩷(Ll/ۡ۬᩵;JLl/ۤۙۨ;)Ll/ۤۙۨ;

    move-result-object v1

    if-nez v1, :cond_2

    if-eqz v15, :cond_5

    .line 209
    invoke-virtual/range {p0 .. p0}, Ll/ۡ۬᩵;->᩷()Ljava/lang/Throwable;

    move-result-object v0

    .line 492
    new-instance v1, Ll/۬۬᩵;

    invoke-direct {v1, v0}, Ll/۬۬᩵;-><init>(Ljava/lang/Throwable;)V

    return-object v1

    :cond_2
    move-object v4, v1

    goto :goto_2

    :cond_3
    move-object v4, v0

    :goto_2
    move-object/from16 v0, p0

    move-object v1, v4

    move v2, v6

    move-object/from16 v3, p1

    move-object/from16 v16, v4

    move-wide v4, v13

    move/from16 v17, v6

    move-object v6, v12

    move/from16 v18, v7

    move v7, v15

    .line 304
    invoke-static/range {v0 .. v7}, Ll/ۡ۬᩵;->ۙ(Ll/ۡ۬᩵;Ll/ۤۙۨ;ILl/۬᩷ۤ;JLjava/lang/Object;Z)I

    move-result v0

    if-eqz v0, :cond_e

    if-eq v0, v11, :cond_d

    const/4 v1, 0x2

    if-eq v0, v1, :cond_9

    const/4 v1, 0x3

    if-eq v0, v1, :cond_8

    const/4 v1, 0x4

    if-eq v0, v1, :cond_6

    const/4 v1, 0x5

    if-eq v0, v1, :cond_4

    goto :goto_3

    .line 341
    :cond_4
    invoke-virtual/range {v16 .. v16}, Ll/۫᩷ۨ;->᩷()V

    :goto_3
    move-object/from16 v0, v16

    :cond_5
    const-wide v3, 0xfffffffffffffffL

    goto :goto_1

    .line 0
    :cond_6
    sget-object v0, Ll/ۡ۬᩵;->ۚ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 71
    invoke-virtual {v0, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    cmp-long v2, v13, v0

    if-gez v2, :cond_7

    .line 334
    invoke-virtual/range {v16 .. v16}, Ll/۫᩷ۨ;->᩷()V

    .line 209
    :cond_7
    invoke-virtual/range {p0 .. p0}, Ll/ۡ۬᩵;->᩷()Ljava/lang/Throwable;

    move-result-object v0

    .line 492
    new-instance v1, Ll/۬۬᩵;

    invoke-direct {v1, v0}, Ll/۬۬᩵;-><init>(Ljava/lang/Throwable;)V

    return-object v1

    .line 347
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unexpected"

    .line 269
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    if-eqz v15, :cond_a

    .line 323
    invoke-virtual/range {v16 .. v16}, Ll/ۡ᩷ۨ;->ۧ()V

    .line 209
    invoke-virtual/range {p0 .. p0}, Ll/ۡ۬᩵;->᩷()Ljava/lang/Throwable;

    move-result-object v0

    .line 492
    new-instance v1, Ll/۬۬᩵;

    invoke-direct {v1, v0}, Ll/۬۬᩵;-><init>(Ljava/lang/Throwable;)V

    return-object v1

    .line 326
    :cond_a
    instance-of v0, v12, Ll/ۛ۬᩵;

    if-eqz v0, :cond_b

    check-cast v12, Ll/ۛ۬᩵;

    goto :goto_4

    :cond_b
    const/4 v12, 0x0

    :goto_4
    if-eqz v12, :cond_c

    add-int v6, v17, v18

    move-object/from16 v0, v16

    .line 178
    invoke-interface {v12, v0, v6}, Ll/ۛ۬᩵;->ۙ(Ll/ۤۙۨ;I)V

    goto :goto_5

    :cond_c
    move-object/from16 v0, v16

    .line 205
    :goto_5
    invoke-virtual {v0}, Ll/ۡ᩷ۨ;->ۧ()V

    .line 488
    invoke-static {}, Ll/᩷ۙۨ;->ۙ()Ll/ۙۙۨ;

    move-result-object v0

    return-object v0

    .line 200
    :cond_d
    sget-object v0, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    return-object v0

    :cond_e
    move-object/from16 v0, v16

    .line 310
    invoke-virtual {v0}, Ll/۫᩷ۨ;->᩷()V

    .line 200
    sget-object v0, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    return-object v0
.end method

.method public final ۙ()Ljava/lang/Throwable;
    .locals 1

    .line 0
    sget-object v0, Ll/ۡ۬᩵;->ۤ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 1754
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    return-object v0
.end method

.method public final ۙ(J)V
    .locals 10

    .line 0
    sget-object v0, Ll/ۡ۬᩵;->۫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 833
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤۙۨ;

    .line 837
    :cond_0
    :goto_0
    sget-object v1, Ll/ۡ۬᩵;->ۚ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v8

    .line 838
    iget v2, p0, Ll/ۡ۬᩵;->ۙ:I

    int-to-long v2, v2

    add-long/2addr v2, v8

    .line 0
    sget-object v4, Ll/ۡ۬᩵;->᩸:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 72
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v4

    .line 838
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    cmp-long v4, p1, v2

    if-gez v4, :cond_1

    return-void

    :cond_1
    const-wide/16 v2, 0x1

    add-long v5, v8, v2

    move-object v2, p0

    move-wide v3, v8

    .line 841
    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 843
    sget v1, Ll/۠۬᩵;->᩹:I

    int-to-long v1, v1

    div-long v3, v8, v1

    .line 844
    rem-long v1, v8, v1

    long-to-int v5, v1

    .line 847
    iget-wide v1, v0, Ll/ۡ᩷ۨ;->ܿ:J

    cmp-long v6, v1, v3

    if-eqz v6, :cond_3

    .line 849
    invoke-direct {p0, v3, v4, v0}, Ll/ۡ۬᩵;->ۙ(JLl/ۤۙۨ;)Ll/ۤۙۨ;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, v1

    :cond_3
    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, v0

    move v4, v5

    move-wide v5, v8

    .line 859
    invoke-direct/range {v2 .. v7}, Ll/ۡ۬᩵;->ۙ(Ll/ۤۙۨ;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 861
    invoke-static {}, Ll/۠۬᩵;->ۤ()Ll/ۜ᩷ۨ;

    move-result-object v2

    if-ne v1, v2, :cond_4

    .line 865
    invoke-virtual {p0}, Ll/ۡ۬᩵;->ۤ()J

    move-result-wide v1

    cmp-long v3, v8, v1

    if-gez v3, :cond_0

    invoke-virtual {v0}, Ll/۫᩷ۨ;->᩷()V

    goto :goto_0

    .line 870
    :cond_4
    invoke-virtual {v0}, Ll/۫᩷ۨ;->᩷()V

    goto :goto_0
.end method

.method public final ۤ()J
    .locals 4

    .line 0
    sget-object v0, Ll/ۡ۬᩵;->ۧ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 70
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    const-wide v2, 0xfffffffffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method

.method public final ܳ()Ll/ۜ۬᩵;
    .locals 1

    .line 1574
    new-instance v0, Ll/ۢ۬᩵;

    invoke-direct {v0, p0}, Ll/ۢ۬᩵;-><init>(Ll/ۡ۬᩵;)V

    return-object v0
.end method

.method public ᩴ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷(Ll/۬᩷ۤ;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v8, p0

    .line 361
    sget-object v9, Ll/۠۬᩵;->ۙ:Ll/ۜ᩷ۨ;

    .line 0
    sget-object v0, Ll/ۡ۬᩵;->֫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 273
    invoke-virtual {v0, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤۙۨ;

    .line 0
    :cond_0
    :goto_0
    sget-object v1, Ll/ۡ۬᩵;->ۧ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 277
    invoke-virtual {v1, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v1

    const-wide v3, 0xfffffffffffffffL

    and-long v10, v1, v3

    const/4 v3, 0x0

    .line 2215
    invoke-direct {v8, v1, v2, v3}, Ll/ۡ۬᩵;->ۙ(JZ)Z

    move-result v12

    .line 282
    sget v13, Ll/۠۬᩵;->᩹:I

    int-to-long v14, v13

    div-long v1, v10, v14

    .line 283
    rem-long v3, v10, v14

    long-to-int v7, v3

    .line 286
    iget-wide v3, v0, Ll/ۡ᩷ۨ;->ܿ:J

    cmp-long v5, v3, v1

    if-eqz v5, :cond_2

    .line 288
    invoke-static {v8, v1, v2, v0}, Ll/ۡ۬᩵;->᩷(Ll/ۡ۬᩵;JLl/ۤۙۨ;)Ll/ۤۙۨ;

    move-result-object v1

    if-nez v1, :cond_1

    if-eqz v12, :cond_0

    .line 373
    invoke-virtual/range {p0 .. p0}, Ll/ۡ۬᩵;->᩷()Ljava/lang/Throwable;

    move-result-object v0

    .line 492
    new-instance v1, Ll/۬۬᩵;

    invoke-direct {v1, v0}, Ll/۬۬᩵;-><init>(Ljava/lang/Throwable;)V

    return-object v1

    :cond_1
    move-object v6, v1

    goto :goto_1

    :cond_2
    move-object v6, v0

    :goto_1
    move-object/from16 v0, p0

    move-object v1, v6

    move v2, v7

    move-object/from16 v3, p1

    move-wide v4, v10

    move-object/from16 v16, v6

    move-object v6, v9

    move-wide/from16 v17, v14

    move v14, v7

    move v7, v12

    .line 304
    invoke-static/range {v0 .. v7}, Ll/ۡ۬᩵;->ۙ(Ll/ۡ۬᩵;Ll/ۤۙۨ;ILl/۬᩷ۤ;JLjava/lang/Object;Z)I

    move-result v0

    if-eqz v0, :cond_c

    const/4 v1, 0x1

    if-eq v0, v1, :cond_b

    const/4 v1, 0x2

    if-eq v0, v1, :cond_7

    const/4 v1, 0x3

    if-eq v0, v1, :cond_6

    const/4 v1, 0x4

    if-eq v0, v1, :cond_4

    const/4 v1, 0x5

    if-eq v0, v1, :cond_3

    goto :goto_2

    .line 341
    :cond_3
    invoke-virtual/range {v16 .. v16}, Ll/۫᩷ۨ;->᩷()V

    :goto_2
    move-object/from16 v0, v16

    goto :goto_0

    .line 0
    :cond_4
    sget-object v0, Ll/ۡ۬᩵;->ۚ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 71
    invoke-virtual {v0, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    cmp-long v2, v10, v0

    if-gez v2, :cond_5

    .line 334
    invoke-virtual/range {v16 .. v16}, Ll/۫᩷ۨ;->᩷()V

    .line 373
    :cond_5
    invoke-virtual/range {p0 .. p0}, Ll/ۡ۬᩵;->᩷()Ljava/lang/Throwable;

    move-result-object v0

    .line 492
    new-instance v1, Ll/۬۬᩵;

    invoke-direct {v1, v0}, Ll/۬۬᩵;-><init>(Ljava/lang/Throwable;)V

    return-object v1

    .line 347
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unexpected"

    .line 269
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    if-eqz v12, :cond_8

    .line 323
    invoke-virtual/range {v16 .. v16}, Ll/ۡ᩷ۨ;->ۧ()V

    .line 373
    invoke-virtual/range {p0 .. p0}, Ll/ۡ۬᩵;->᩷()Ljava/lang/Throwable;

    move-result-object v0

    .line 492
    new-instance v1, Ll/۬۬᩵;

    invoke-direct {v1, v0}, Ll/۬۬᩵;-><init>(Ljava/lang/Throwable;)V

    return-object v1

    .line 326
    :cond_8
    instance-of v0, v9, Ll/ۛ۬᩵;

    if-eqz v0, :cond_9

    check-cast v9, Ll/ۛ۬᩵;

    goto :goto_3

    :cond_9
    const/4 v9, 0x0

    :goto_3
    if-eqz v9, :cond_a

    add-int v7, v14, v13

    move-object/from16 v0, v16

    .line 178
    invoke-interface {v9, v0, v7}, Ll/ۛ۬᩵;->ۙ(Ll/ۤۙۨ;I)V

    goto :goto_4

    :cond_a
    move-object/from16 v0, v16

    .line 369
    :goto_4
    iget-wide v0, v0, Ll/ۡ᩷ۨ;->ܿ:J

    mul-long v0, v0, v17

    int-to-long v2, v14

    add-long/2addr v0, v2

    invoke-virtual {v8, v0, v1}, Ll/ۡ۬᩵;->ۙ(J)V

    .line 370
    sget-object v0, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    return-object v0

    .line 364
    :cond_b
    sget-object v0, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    return-object v0

    :cond_c
    move-object/from16 v0, v16

    .line 310
    invoke-virtual {v0}, Ll/۫᩷ۨ;->᩷()V

    .line 364
    sget-object v0, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    return-object v0
.end method

.method public final ᩷()Ljava/lang/Throwable;
    .locals 2

    .line 1757
    invoke-virtual {p0}, Ll/ۡ۬᩵;->ۙ()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ll/ᩴۙۨ;

    const-string v1, "Channel was closed"

    .line 823
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public final ᩷(J)V
    .locals 18

    move-object/from16 v6, p0

    .line 1416
    invoke-direct/range {p0 .. p0}, Ll/ۡ۬᩵;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    .line 72
    :cond_0
    sget-object v7, Ll/ۡ۬᩵;->᩸:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v7, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    cmp-long v2, v0, p1

    if-lez v2, :cond_0

    .line 1425
    invoke-static {}, Ll/۠۬᩵;->᩷()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    sget-object v8, Ll/ۡ۬᩵;->ܳ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-wide v9, 0x3fffffffffffffffL    # 1.9999999999999998

    if-ge v1, v0, :cond_2

    .line 72
    invoke-virtual {v7, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    .line 1429
    invoke-virtual {v8, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v4

    and-long/2addr v4, v9

    cmp-long v8, v2, v4

    if-nez v8, :cond_1

    .line 72
    invoke-virtual {v7, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v4

    cmp-long v8, v2, v4

    if-nez v8, :cond_1

    goto :goto_3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1413
    :cond_2
    invoke-virtual {v8, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    and-long v0, v2, v9

    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    add-long v4, v0, v11

    move-object v0, v8

    move-object/from16 v1, p0

    .line 1439
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 72
    :cond_3
    :goto_1
    invoke-virtual {v7, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    .line 1447
    invoke-virtual {v8, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    and-long v4, v2, v9

    and-long v13, v2, v11

    const-wide/16 v15, 0x0

    cmp-long v17, v13, v15

    if-eqz v17, :cond_4

    const/4 v13, 0x1

    goto :goto_2

    :cond_4
    const/4 v13, 0x0

    :goto_2
    cmp-long v14, v0, v4

    if-nez v14, :cond_6

    .line 72
    invoke-virtual {v7, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v14

    cmp-long v16, v0, v14

    if-nez v16, :cond_6

    .line 1413
    :cond_5
    invoke-virtual {v8, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    and-long v4, v2, v9

    move-object v0, v8

    move-object/from16 v1, p0

    .line 1456
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_5

    :goto_3
    return-void

    :cond_6
    if-nez v13, :cond_3

    add-long/2addr v4, v11

    move-object v0, v8

    move-object/from16 v1, p0

    .line 1466
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    goto :goto_1
.end method

.method public final ᩸()Z
    .locals 3

    .line 0
    sget-object v0, Ll/ۡ۬᩵;->ۧ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2219
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    const/4 v2, 0x1

    .line 2222
    invoke-direct {p0, v0, v1, v2}, Ll/ۡ۬᩵;->ۙ(JZ)Z

    move-result v0

    return v0
.end method
