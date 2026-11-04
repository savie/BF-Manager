.class public final Ll/ܿۤۨ;
.super Ljava/lang/Object;
.source "K29L"


# static fields
.field public static final synthetic ۤ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final synthetic ᩴ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final synthetic ᩷:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final synthetic ᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field public volatile synthetic blockingTasksInBuffer$volatile:I

.field public volatile synthetic consumerIndex$volatile:I

.field public volatile synthetic lastScheduledTask$volatile:Ljava/lang/Object;

.field public volatile synthetic producerIndex$volatile:I

.field public final ۙ:Ljava/util/concurrent/atomic/AtomicReferenceArray;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 0
    const-class v0, Ljava/lang/Object;

    const-string v1, "lastScheduledTask$volatile"

    const-class v2, Ll/ܿۤۨ;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ܿۤۨ;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "producerIndex$volatile"

    invoke-static {v2, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ܿۤۨ;->ᩴ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const-string v0, "consumerIndex$volatile"

    invoke-static {v2, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ܿۤۨ;->ۤ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const-string v0, "blockingTasksInBuffer$volatile"

    invoke-static {v2, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ܿۤۨ;->᩷:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    iput-object v0, p0, Ll/ܿۤۨ;->ۙ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    return-void
.end method

.method private final ۙ(IZ)Ll/ۨۤۨ;
    .locals 5

    and-int/lit8 p1, p1, 0x7f

    .line 180
    iget-object v0, p0, Ll/ܿۤۨ;->ۙ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨۤۨ;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 89
    iget-object v3, v1, Ll/ۨۤۨ;->᩶:Ll/ۛۤۨ;

    invoke-interface {v3}, Ll/ۛۤۨ;->ۙ()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-ne v4, p2, :cond_4

    .line 0
    :cond_1
    invoke-virtual {v0, p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    if-eqz p2, :cond_2

    sget-object p1, Ll/ܿۤۨ;->᩷:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 182
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    :cond_2
    return-object v1

    .line 0
    :cond_3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v1, :cond_1

    :cond_4
    return-object v2
.end method

.method private final ᩸()Ll/ۨۤۨ;
    .locals 5

    .line 232
    :cond_0
    :goto_0
    sget-object v0, Ll/ܿۤۨ;->ۤ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    .line 0
    sget-object v2, Ll/ܿۤۨ;->ᩴ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 233
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    return-object v3

    :cond_1
    and-int/lit8 v2, v1, 0x7f

    add-int/lit8 v4, v1, 0x1

    .line 235
    invoke-virtual {v0, p0, v1, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 237
    iget-object v0, p0, Ll/ܿۤۨ;->ۙ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨۤۨ;

    if-nez v0, :cond_2

    goto :goto_0

    .line 89
    :cond_2
    iget-object v1, v0, Ll/ۨۤۨ;->᩶:Ll/ۛۤۨ;

    invoke-interface {v1}, Ll/ۛۤۨ;->ۙ()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_3

    .line 0
    sget-object v1, Ll/ܿۤۨ;->᩷:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 246
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    :cond_3
    return-object v0
.end method


# virtual methods
.method public final ۙ()I
    .locals 3

    .line 0
    sget-object v0, Ll/ܿۤۨ;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 60
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ll/ܿۤۨ;->ۤ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    sget-object v2, Ll/ܿۤۨ;->ᩴ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    if-eqz v0, :cond_0

    .line 59
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    return v0

    :cond_0
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public final ۙ(ILl/᩻ۡ᩵;)J
    .locals 11

    const/4 v0, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p1, v0, :cond_0

    .line 122
    invoke-direct {p0}, Ll/ܿۤۨ;->᩸()Ll/ۨۤۨ;

    move-result-object v0

    goto :goto_2

    .line 0
    :cond_0
    sget-object v0, Ll/ܿۤۨ;->ۤ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 135
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    .line 0
    sget-object v3, Ll/ܿۤۨ;->ᩴ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 136
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v3

    if-ne p1, v1, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    if-eq v0, v3, :cond_3

    if-eqz v4, :cond_2

    .line 0
    sget-object v5, Ll/ܿۤۨ;->᩷:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 140
    invoke-virtual {v5, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v5

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v5, v0, 0x1

    .line 141
    invoke-direct {p0, v0, v4}, Ll/ܿۤۨ;->ۙ(IZ)Ll/ۨۤۨ;

    move-result-object v0

    if-nez v0, :cond_4

    move v0, v5

    goto :goto_0

    :cond_3
    :goto_1
    move-object v0, v2

    :cond_4
    :goto_2
    const-wide/16 v3, -0x1

    if-eqz v0, :cond_5

    .line 127
    iput-object v0, p2, Ll/᩻ۡ᩵;->ܰ:Ljava/lang/Object;

    return-wide v3

    .line 200
    :cond_5
    :goto_3
    sget-object v0, Ll/ܿۤۨ;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۨۤۨ;

    if-nez v5, :cond_6

    goto :goto_5

    .line 89
    :cond_6
    iget-object v6, v5, Ll/ۨۤۨ;->᩶:Ll/ۛۤۨ;

    invoke-interface {v6}, Ll/ۛۤۨ;->ۙ()I

    move-result v6

    if-ne v6, v1, :cond_7

    const/4 v6, 0x1

    goto :goto_4

    :cond_7
    const/4 v6, 0x2

    :goto_4
    and-int/2addr v6, p1

    if-nez v6, :cond_8

    :goto_5
    const-wide/16 p1, -0x2

    return-wide p1

    .line 206
    :cond_8
    sget-object v6, Ll/ܰۤۨ;->ۚ:Ll/ۗۤۨ;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    .line 207
    iget-wide v8, v5, Ll/ۨۤۨ;->ܰ:J

    sub-long/2addr v6, v8

    .line 208
    sget-wide v8, Ll/ܰۤۨ;->۫:J

    cmp-long v10, v6, v8

    if-gez v10, :cond_9

    sub-long/2addr v8, v6

    return-wide v8

    .line 0
    :cond_9
    invoke-virtual {v0, p0, v5, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    .line 217
    iput-object v5, p2, Ll/᩻ۡ᩵;->ܰ:Ljava/lang/Object;

    return-wide v3

    .line 0
    :cond_a
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eq v6, v5, :cond_9

    goto :goto_3
.end method

.method public final ۙ(Ll/ۨۤۨ;)Ll/ۨۤۨ;
    .locals 4

    .line 0
    sget-object v0, Ll/ܿۤۨ;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 81
    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۨۤۨ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 59
    :cond_0
    sget-object v0, Ll/ܿۤۨ;->ᩴ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    .line 0
    sget-object v2, Ll/ܿۤۨ;->ۤ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 59
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v2

    sub-int/2addr v1, v2

    const/16 v2, 0x7f

    if-ne v1, v2, :cond_1

    goto :goto_1

    .line 89
    :cond_1
    iget-object v1, p1, Ll/ۨۤۨ;->᩶:Ll/ۛۤۨ;

    invoke-interface {v1}, Ll/ۛۤۨ;->ۙ()I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    .line 0
    sget-object v1, Ll/ܿۤۨ;->᩷:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 91
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    .line 92
    :cond_2
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    and-int/2addr v1, v2

    .line 101
    :goto_0
    iget-object v2, p0, Ll/ܿۤۨ;->ۙ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 102
    invoke-static {}, Ljava/lang/Thread;->yield()V

    goto :goto_0

    .line 104
    :cond_3
    invoke-virtual {v2, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->lazySet(ILjava/lang/Object;)V

    .line 105
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method

.method public final ۙ(Ll/᩹ۤۨ;)V
    .locals 2

    .line 0
    sget-object v0, Ll/ܿۤۨ;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v1, 0x0

    .line 189
    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨۤۨ;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Ll/᩺᩷ۨ;->ۙ(Ljava/lang/Runnable;)Z

    .line 225
    :cond_0
    :goto_0
    invoke-direct {p0}, Ll/ܿۤۨ;->᩸()Ll/ۨۤۨ;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 226
    :cond_1
    invoke-virtual {p1, v0}, Ll/᩺᩷ۨ;->ۙ(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public final ۤ()Ll/ۨۤۨ;
    .locals 5

    .line 157
    :goto_0
    sget-object v0, Ll/ܿۤۨ;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨۤۨ;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    goto :goto_1

    .line 89
    :cond_0
    iget-object v4, v1, Ll/ۨۤۨ;->᩶:Ll/ۛۤۨ;

    invoke-interface {v4}, Ll/ۛۤۨ;->ۙ()I

    move-result v4

    if-ne v4, v2, :cond_3

    .line 0
    :cond_1
    invoke-virtual {v0, p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v1, :cond_1

    goto :goto_0

    :cond_3
    :goto_1
    sget-object v0, Ll/ܿۤۨ;->ۤ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 165
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    .line 0
    sget-object v1, Ll/ܿۤۨ;->ᩴ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 166
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    :cond_4
    if-eq v0, v1, :cond_6

    .line 0
    sget-object v4, Ll/ܿۤۨ;->᩷:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 169
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v4

    if-nez v4, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v1, v1, -0x1

    .line 170
    invoke-direct {p0, v1, v2}, Ll/ܿۤۨ;->ۙ(IZ)Ll/ۨۤۨ;

    move-result-object v4

    if-eqz v4, :cond_4

    return-object v4

    :cond_6
    :goto_2
    return-object v3
.end method

.method public final ᩷()Ll/ۨۤۨ;
    .locals 2

    .line 0
    sget-object v0, Ll/ܿۤۨ;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v1, 0x0

    .line 73
    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨۤۨ;

    if-nez v0, :cond_0

    invoke-direct {p0}, Ll/ܿۤۨ;->᩸()Ll/ۨۤۨ;

    move-result-object v0

    :cond_0
    return-object v0
.end method
