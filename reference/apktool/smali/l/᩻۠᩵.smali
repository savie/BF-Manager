.class public final Ll/᩻۠᩵;
.super Ll/۫ۜ᩵;
.source "GANU"

# interfaces
.implements Ll/ۧ۠᩵;
.implements Ll/᩺ۢ᩵;
.implements Ll/ۛ۬᩵;


# static fields
.field public static final synthetic ֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic ۢ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic ᩳ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public volatile synthetic _decisionAndIndex$volatile:I

.field public volatile synthetic _parentHandle$volatile:Ljava/lang/Object;

.field public volatile synthetic _state$volatile:Ljava/lang/Object;

.field public final ֡:Ll/ۧۢ᩵;

.field public final ۟:Ll/ۙۢ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "_decisionAndIndex$volatile"

    .line 0
    const-class v1, Ll/᩻۠᩵;

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/᩻۠᩵;->ᩳ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const-string v0, "_state$volatile"

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/᩻۠᩵;->֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_parentHandle$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/᩻۠᩵;->ۢ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Ll/ۙۢ᩵;I)V
    .locals 0

    .line 32
    invoke-direct {p0, p2}, Ll/۫ۜ᩵;-><init>(I)V

    .line 30
    iput-object p1, p0, Ll/᩻۠᩵;->۟:Ll/ۙۢ᩵;

    .line 37
    invoke-interface {p1}, Ll/ۙۢ᩵;->getContext()Ll/ۧۢ᩵;

    move-result-object p1

    iput-object p1, p0, Ll/᩻۠᩵;->֡:Ll/ۧۢ᩵;

    const p1, 0x1fffffff

    .line 68
    iput p1, p0, Ll/᩻۠᩵;->_decisionAndIndex$volatile:I

    .line 79
    sget-object p1, Ll/ܳ۠᩵;->ܰ:Ll/ܳ۠᩵;

    iput-object p1, p0, Ll/᩻۠᩵;->_state$volatile:Ljava/lang/Object;

    return-void
.end method

.method public static ۙ(Ll/᩻۬᩵;Ljava/lang/Object;ILl/ۗ֨᩵;)Ljava/lang/Object;
    .locals 6

    .line 476
    instance-of v0, p1, Ll/ۨ۠᩵;

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    goto :goto_0

    :cond_1
    return-object p1

    :cond_2
    :goto_0
    if-nez p3, :cond_3

    .line 482
    instance-of p2, p0, Ll/֫۠᩵;

    if-nez p2, :cond_3

    return-object p1

    .line 485
    :cond_3
    new-instance p2, Ll/᩵۠᩵;

    instance-of v0, p0, Ll/֫۠᩵;

    if-eqz v0, :cond_4

    check-cast p0, Ll/֫۠᩵;

    goto :goto_1

    :cond_4
    const/4 p0, 0x0

    :goto_1
    move-object v2, p0

    const/4 v4, 0x0

    const/16 v5, 0x10

    move-object v0, p2

    move-object v1, p1

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Ll/᩵۠᩵;-><init>(Ljava/lang/Object;Ll/֫۠᩵;Ll/ۗ֨᩵;Ljava/lang/Throwable;I)V

    return-object p2
.end method

.method private final ۙ(I)V
    .locals 6

    .line 281
    :cond_0
    sget-object v0, Ll/᩻۠᩵;->ᩳ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    shr-int/lit8 v2, v1, 0x1d

    if-eqz v2, :cond_b

    const/4 v0, 0x1

    if-ne v2, v0, :cond_a

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-ne p1, v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 152
    :goto_0
    iget-object v3, p0, Ll/᩻۠᩵;->۟:Ll/ۙۢ᩵;

    if-nez v1, :cond_9

    instance-of v4, v3, Ll/᩻᩷ۨ;

    if-eqz v4, :cond_9

    const/4 v4, 0x2

    if-eq p1, v0, :cond_3

    if-ne p1, v4, :cond_2

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 p1, 0x1

    :goto_2
    iget v5, p0, Ll/۫ۜ᩵;->ܿ:I

    if-eq v5, v0, :cond_4

    if-ne v5, v4, :cond_5

    :cond_4
    const/4 v2, 0x1

    :cond_5
    if-ne p1, v2, :cond_9

    .line 154
    move-object p1, v3

    check-cast p1, Ll/᩻᩷ۨ;

    iget-object v1, p1, Ll/᩻᩷ۨ;->ۢ:Ll/ᩳ۠᩵;

    .line 0
    iget-object p1, p1, Ll/᩻᩷ۨ;->۟:Ll/ۛۢ᩵;

    invoke-interface {p1}, Ll/ۙۢ᩵;->getContext()Ll/ۧۢ᩵;

    move-result-object p1

    .line 156
    invoke-virtual {v1}, Ll/ᩳ۠᩵;->᩷()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 157
    invoke-virtual {v1, p1, p0}, Ll/ᩳ۠᩵;->ۙ(Ll/ۧۢ᩵;Ljava/lang/Runnable;)V

    return-void

    .line 180
    :cond_6
    invoke-static {}, Ll/᩹۬᩵;->ۙ()Ll/ܺۜ᩵;

    move-result-object p1

    .line 181
    invoke-virtual {p1}, Ll/ܺۜ᩵;->ۗ()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 183
    invoke-virtual {p1, p0}, Ll/ܺۜ᩵;->ۙ(Ll/۫ۜ᩵;)V

    return-void

    .line 236
    :cond_7
    invoke-virtual {p1, v0}, Ll/ܺۜ᩵;->ۙ(Z)V

    .line 187
    :try_start_0
    invoke-static {p0, v3, v0}, Ll/ۚۜ᩵;->ۙ(Ll/᩻۠᩵;Ll/ۙۢ᩵;Z)V

    .line 241
    :cond_8
    invoke-virtual {p1}, Ll/ܺۜ᩵;->᩶()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_8

    goto :goto_3

    :catchall_0
    move-exception v0

    const/4 v1, 0x0

    .line 248
    :try_start_1
    invoke-virtual {p0, v0, v1}, Ll/۫ۜ᩵;->ۙ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 250
    :goto_3
    invoke-virtual {p1}, Ll/ܺۜ᩵;->ܶ()V

    goto :goto_4

    :catchall_1
    move-exception v0

    invoke-virtual {p1}, Ll/ܺۜ᩵;->ܶ()V

    throw v0

    .line 164
    :cond_9
    invoke-static {p0, v3, v1}, Ll/ۚۜ᩵;->ۙ(Ll/᩻۠᩵;Ll/ۙۢ᩵;Z)V

    return-void

    .line 285
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already resumed"

    .line 286
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    const v2, 0x1fffffff

    and-int/2addr v2, v1

    const/high16 v3, 0x40000000    # 2.0f

    add-int/2addr v2, v3

    .line 284
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_4
    return-void
.end method

.method private final ۙ(Ljava/lang/Object;ILl/ۗ֨᩵;)V
    .locals 4

    .line 489
    :goto_0
    sget-object v0, Ll/᩻۠᩵;->֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 496
    instance-of v2, v1, Ll/᩻۬᩵;

    if-eqz v2, :cond_3

    .line 497
    move-object v2, v1

    check-cast v2, Ll/᩻۬᩵;

    invoke-static {v2, p1, p2, p3}, Ll/᩻۠᩵;->ۙ(Ll/᩻۬᩵;Ljava/lang/Object;ILl/ۗ֨᩵;)Ljava/lang/Object;

    move-result-object v2

    .line 0
    :cond_0
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 557
    invoke-direct {p0}, Ll/᩻۠᩵;->᩻()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Ll/᩻۠᩵;->ᩴ()V

    .line 500
    :cond_1
    invoke-direct {p0, p2}, Ll/᩻۠᩵;->ۙ(I)V

    return-void

    .line 0
    :cond_2
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v1, :cond_0

    goto :goto_0

    .line 503
    :cond_3
    instance-of p2, v1, Ll/ܽ۠᩵;

    if-eqz p2, :cond_5

    .line 509
    check-cast v1, Ll/ܽ۠᩵;

    invoke-virtual {v1}, Ll/ܽ۠᩵;->ۤ()Z

    move-result p2

    if-eqz p2, :cond_5

    if-eqz p3, :cond_4

    .line 511
    iget-object p1, v1, Ll/ۨ۠᩵;->ۙ:Ljava/lang/Throwable;

    invoke-virtual {p0, p3, p1}, Ll/᩻۠᩵;->ۙ(Ll/ۗ֨᩵;Ljava/lang/Throwable;)V

    :cond_4
    return-void

    .line 0
    :cond_5
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 551
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Already resumed, but proposed with update "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private final ۙ(Ll/ۡ᩷ۨ;Ljava/lang/Throwable;)V
    .locals 3

    .line 2
    iget-object p2, p0, Ll/᩻۠᩵;->֡:Ll/ۧۢ᩵;

    .line 0
    sget-object v0, Ll/᩻۠᩵;->ᩳ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 248
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x1fffffff

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    .line 250
    :try_start_0
    invoke-virtual {p1, v0, p2}, Ll/ۡ᩷ۨ;->ۙ(ILl/ۧۢ᩵;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 232
    new-instance v0, Ll/۫᩷ܽ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Exception in invokeOnCancellation handler for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 9
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 230
    invoke-static {v0, p2}, Ll/ۡ۠᩵;->ۙ(Ljava/lang/Throwable;Ll/ۧۢ᩵;)V

    return-void

    .line 249
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "The index for Segment.onCancellation(..) is broken"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ۙ(Ll/ۤۙۨ;Ljava/lang/Object;)V
    .locals 3

    .line 2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 460
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "It\'s prohibited to register multiple handlers, tried to register "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", already has "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final ۧ()Ll/ۧۜ᩵;
    .locals 4

    .line 342
    sget-object v0, Ll/ۡۜ᩵;->ۛ:Ll/֨ۜ᩵;

    sget-object v0, Ll/֨ۜ᩵;->ܰ:Ll/֨ۜ᩵;

    iget-object v1, p0, Ll/᩻۠᩵;->֡:Ll/ۧۢ᩵;

    invoke-interface {v1, v0}, Ll/ۧۢ᩵;->ۙ(Ll/֫ۢ᩵;)Ll/ۚۢ᩵;

    move-result-object v0

    check-cast v0, Ll/ۡۜ᩵;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 346
    :cond_0
    new-instance v2, Ll/ܶ۠᩵;

    invoke-direct {v2, p0}, Ll/ܶ۠᩵;-><init>(Ll/᩻۠᩵;)V

    const/4 v3, 0x2

    .line 344
    invoke-static {v0, v2, v3}, Ll/۬ۜ᩵;->ۙ(Ll/ۡۜ᩵;Ll/᩷۬᩵;I)Ll/ۧۜ᩵;

    move-result-object v0

    .line 0
    :cond_1
    sget-object v2, Ll/᩻۠᩵;->ۢ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, p0, v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    :goto_0
    return-object v0
.end method

.method private final ᩻()Z
    .locals 2

    .line 137
    iget v0, p0, Ll/۫ۜ᩵;->ܿ:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    iget-object v1, p0, Ll/᩻۠᩵;->۟:Ll/ۙۢ᩵;

    invoke-static {v1, v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ll/᩻᩷ۨ;

    invoke-virtual {v1}, Ll/᩻᩷ۨ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final getContext()Ll/ۧۢ᩵;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/᩻۠᩵;->֡:Ll/ۧۢ᩵;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 609
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CancellableContinuation("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩻۠᩵;->۟:Ll/ۙۢ᩵;

    invoke-static {v1}, Ll/᩷ۜ᩵;->ۙ(Ll/ۙۢ᩵;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "){"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 0
    sget-object v1, Ll/᩻۠᩵;->֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 104
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 114
    instance-of v2, v1, Ll/᩻۬᩵;

    if-eqz v2, :cond_0

    const-string v1, "Active"

    goto :goto_0

    .line 115
    :cond_0
    instance-of v1, v1, Ll/ܽ۠᩵;

    if-eqz v1, :cond_1

    const-string v1, "Cancelled"

    goto :goto_0

    :cond_1
    const-string v1, "Completed"

    .line 609
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ll/᩷ۜ᩵;->ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Z
    .locals 3

    .line 147
    sget-object v0, Ll/᩻۠᩵;->֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 149
    instance-of v2, v1, Ll/᩵۠᩵;

    if-eqz v2, :cond_0

    check-cast v1, Ll/᩵۠᩵;

    iget-object v1, v1, Ll/᩵۠᩵;->ۤ:Ljava/lang/Object;

    if-eqz v1, :cond_0

    .line 151
    invoke-virtual {p0}, Ll/᩻۠᩵;->ᩴ()V

    const/4 v0, 0x0

    return v0

    .line 0
    :cond_0
    sget-object v1, Ll/᩻۠᩵;->ᩳ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const v2, 0x1fffffff

    .line 20
    invoke-virtual {v1, p0, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    .line 155
    sget-object v1, Ll/ܳ۠᩵;->ܰ:Ll/ܳ۠᩵;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x1

    return v0
.end method

.method public final ۙ()Ll/ۙۢ᩵;
    .locals 1

    .line 30
    iget-object v0, p0, Ll/᩻۠᩵;->۟:Ll/ۙۢ᩵;

    return-object v0
.end method

.method public final ۙ(Ljava/lang/Object;Ll/ۗ֨᩵;)Ll/ۜ᩷ۨ;
    .locals 4

    .line 524
    :goto_0
    sget-object v0, Ll/᩻۠᩵;->֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 531
    instance-of v2, v1, Ll/᩻۬᩵;

    if-eqz v2, :cond_3

    .line 532
    move-object v2, v1

    check-cast v2, Ll/᩻۬᩵;

    iget v3, p0, Ll/۫ۜ᩵;->ܿ:I

    invoke-static {v2, p1, v3, p2}, Ll/᩻۠᩵;->ۙ(Ll/᩻۬᩵;Ljava/lang/Object;ILl/ۗ֨᩵;)Ljava/lang/Object;

    move-result-object v2

    .line 0
    :cond_0
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 557
    invoke-direct {p0}, Ll/᩻۠᩵;->᩻()Z

    move-result p1

    sget-object p2, Ll/ܺ۠᩵;->ۙ:Ll/ۜ᩷ۨ;

    if-nez p1, :cond_1

    invoke-virtual {p0}, Ll/᩻۠᩵;->ᩴ()V

    :cond_1
    return-object p2

    .line 0
    :cond_2
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v1, :cond_0

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۙ(Ljava/lang/Object;)V
    .locals 2

    .line 15
    invoke-static {p1}, Ll/᩸۟᩵;->ۙ(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Ll/ۨ۠᩵;

    const/4 v1, 0x0

    .line 38
    invoke-direct {p1, v0, v1}, Ll/ۨ۠᩵;-><init>(Ljava/lang/Throwable;Z)V

    .line 364
    :goto_0
    iget v0, p0, Ll/۫ۜ᩵;->ܿ:I

    const/4 v1, 0x0

    .line 489
    invoke-direct {p0, p1, v0, v1}, Ll/᩻۠᩵;->ۙ(Ljava/lang/Object;ILl/ۗ֨᩵;)V

    return-void
.end method

.method public final ۙ(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V
    .locals 13

    .line 168
    :goto_0
    sget-object p1, Ll/᩻۠᩵;->֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 170
    instance-of v0, v6, Ll/᩻۬᩵;

    if-nez v0, :cond_b

    .line 171
    instance-of v0, v6, Ll/ۨ۠᩵;

    if-eqz v0, :cond_0

    goto/16 :goto_3

    .line 172
    :cond_0
    instance-of v0, v6, Ll/᩵۠᩵;

    if-eqz v0, :cond_7

    .line 173
    move-object v0, v6

    check-cast v0, Ll/᩵۠᩵;

    .line 674
    iget-object v1, v0, Ll/᩵۠᩵;->ۙ:Ljava/lang/Throwable;

    if-nez v1, :cond_6

    .line 174
    iget-object v8, v0, Ll/᩵۠᩵;->ᩴ:Ljava/lang/Object;

    const/16 v1, 0xf

    and-int/lit8 v2, v1, 0x2

    if-eqz v2, :cond_1

    iget-object v2, v0, Ll/᩵۠᩵;->᩷:Ll/֫۠᩵;

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    move-object v9, v2

    iget-object v10, v0, Ll/᩵۠᩵;->᩸:Ll/ۗ֨᩵;

    iget-object v11, v0, Ll/᩵۠᩵;->ۤ:Ljava/lang/Object;

    and-int/lit8 v1, v1, 0x10

    if-eqz v1, :cond_2

    iget-object v1, v0, Ll/᩵۠᩵;->ۙ:Ljava/lang/Throwable;

    move-object v12, v1

    goto :goto_2

    :cond_2
    move-object v12, p2

    .line 0
    :goto_2
    new-instance v1, Ll/᩵۠᩵;

    move-object v7, v1

    invoke-direct/range {v7 .. v12}, Ll/᩵۠᩵;-><init>(Ljava/lang/Object;Ll/֫۠᩵;Ll/ۗ֨᩵;Ljava/lang/Object;Ljava/lang/Throwable;)V

    :cond_3
    invoke-virtual {p1, p0, v6, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 677
    iget-object p1, v0, Ll/᩵۠᩵;->᩷:Ll/֫۠᩵;

    if-eqz p1, :cond_4

    invoke-virtual {p0, p1, p2}, Ll/᩻۠᩵;->ۙ(Ll/֫۠᩵;Ljava/lang/Throwable;)V

    .line 678
    :cond_4
    iget-object p1, v0, Ll/᩵۠᩵;->᩸:Ll/ۗ֨᩵;

    if-eqz p1, :cond_9

    invoke-virtual {p0, p1, p2}, Ll/᩻۠᩵;->ۙ(Ll/ۗ֨᩵;Ljava/lang/Throwable;)V

    return-void

    .line 0
    :cond_5
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v6, :cond_3

    goto :goto_0

    .line 173
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Must be called at most once"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 183
    :cond_7
    new-instance v7, Ll/᩵۠᩵;

    const/4 v3, 0x0

    const/16 v5, 0xe

    const/4 v2, 0x0

    move-object v0, v7

    move-object v1, v6

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Ll/᩵۠᩵;-><init>(Ljava/lang/Object;Ll/֫۠᩵;Ll/ۗ֨᩵;Ljava/lang/Throwable;I)V

    .line 0
    :cond_8
    invoke-virtual {p1, p0, v6, v7}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    :cond_9
    :goto_3
    return-void

    :cond_a
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, v6, :cond_8

    goto :goto_0

    .line 170
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Not completed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ(Ljava/lang/Throwable;)V
    .locals 4

    .line 200
    :goto_0
    sget-object v0, Ll/᩻۠᩵;->֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 202
    instance-of v2, v1, Ll/᩻۬᩵;

    if-nez v2, :cond_0

    return-void

    .line 204
    :cond_0
    new-instance v2, Ll/ܽ۠᩵;

    instance-of v3, v1, Ll/֫۠᩵;

    if-nez v3, :cond_2

    instance-of v3, v1, Ll/ۡ᩷ۨ;

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v3, 0x1

    :goto_2
    invoke-direct {v2, p0, p1, v3}, Ll/ܽ۠᩵;-><init>(Ll/᩻۠᩵;Ljava/lang/Throwable;Z)V

    .line 0
    :cond_3
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 207
    move-object v0, v1

    check-cast v0, Ll/᩻۬᩵;

    .line 208
    instance-of v2, v0, Ll/֫۠᩵;

    if-eqz v2, :cond_4

    check-cast v1, Ll/֫۠᩵;

    invoke-virtual {p0, v1, p1}, Ll/᩻۠᩵;->ۙ(Ll/֫۠᩵;Ljava/lang/Throwable;)V

    goto :goto_3

    .line 209
    :cond_4
    instance-of v0, v0, Ll/ۡ᩷ۨ;

    if-eqz v0, :cond_5

    check-cast v1, Ll/ۡ᩷ۨ;

    invoke-direct {p0, v1, p1}, Ll/᩻۠᩵;->ۙ(Ll/ۡ᩷ۨ;Ljava/lang/Throwable;)V

    .line 557
    :cond_5
    :goto_3
    invoke-direct {p0}, Ll/᩻۠᩵;->᩻()Z

    move-result p1

    if-nez p1, :cond_6

    invoke-virtual {p0}, Ll/᩻۠᩵;->ᩴ()V

    .line 213
    :cond_6
    iget p1, p0, Ll/۫ۜ᩵;->ܿ:I

    invoke-direct {p0, p1}, Ll/᩻۠᩵;->ۙ(I)V

    return-void

    .line 0
    :cond_7
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v1, :cond_3

    goto :goto_0
.end method

.method public final ۙ(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    .line 195
    invoke-direct {p0}, Ll/᩻۠᩵;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    .line 196
    iget-object v1, p0, Ll/᩻۠᩵;->۟:Ll/ۙۢ᩵;

    invoke-static {v1, v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ll/᩻᩷ۨ;

    .line 197
    invoke-virtual {v1, p1}, Ll/᩻᩷ۨ;->ۙ(Ljava/lang/Throwable;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    .line 220
    :cond_1
    invoke-virtual {p0, p1}, Ll/᩻۠᩵;->ۙ(Ljava/lang/Throwable;)V

    .line 557
    invoke-direct {p0}, Ll/᩻۠᩵;->᩻()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Ll/᩻۠᩵;->ᩴ()V

    :cond_2
    :goto_1
    return-void
.end method

.method public final ۙ(Ll/֫۠᩵;Ljava/lang/Throwable;)V
    .locals 2

    .line 245
    :try_start_0
    invoke-interface {p1}, Ll/֫۠᩵;->ۙ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 232
    new-instance p2, Ll/۫᩷ܽ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Exception in invokeOnCancellation handler for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 9
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 230
    iget-object p1, p0, Ll/᩻۠᩵;->֡:Ll/ۧۢ᩵;

    invoke-static {p2, p1}, Ll/ۡ۠᩵;->ۙ(Ljava/lang/Throwable;Ll/ۧۢ᩵;)V

    return-void
.end method

.method public final ۙ(Ll/ۗ֨᩵;)V
    .locals 2

    .line 2
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 367
    iget v1, p0, Ll/۫ۜ᩵;->ܿ:I

    invoke-direct {p0, v0, v1, p1}, Ll/᩻۠᩵;->ۙ(Ljava/lang/Object;ILl/ۗ֨᩵;)V

    return-void
.end method

.method public final ۙ(Ll/ۗ֨᩵;Ljava/lang/Throwable;)V
    .locals 2

    .line 255
    :try_start_0
    invoke-interface {p1, p2}, Ll/ۗ֨᩵;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 260
    new-instance p2, Ll/۫᩷ܽ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Exception in resume onCancellation handler for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 9
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 258
    iget-object p1, p0, Ll/᩻۠᩵;->֡:Ll/ۧۢ᩵;

    invoke-static {p2, p1}, Ll/ۡ۠᩵;->ۙ(Ljava/lang/Throwable;Ll/ۧۢ᩵;)V

    return-void
.end method

.method public final ۙ(Ll/ۤۙۨ;I)V
    .locals 4

    .line 383
    :cond_0
    sget-object v0, Ll/᩻۠᩵;->ᩳ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    const v2, 0x1fffffff

    and-int v3, v1, v2

    if-ne v3, v2, :cond_c

    shr-int/lit8 v2, v1, 0x1d

    shl-int/lit8 v2, v2, 0x1d

    add-int/2addr v2, p2

    .line 388
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 397
    :goto_0
    sget-object p2, Ll/᩻۠᩵;->֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 401
    instance-of v1, v0, Ll/ܳ۠᩵;

    if-eqz v1, :cond_3

    .line 0
    :cond_1
    invoke-virtual {p2, p0, v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, v0, :cond_1

    goto :goto_0

    .line 404
    :cond_3
    instance-of p2, v0, Ll/֫۠᩵;

    if-eqz p2, :cond_4

    const/4 p2, 0x1

    goto :goto_1

    :cond_4
    instance-of p2, v0, Ll/ۡ᩷ۨ;

    :goto_1
    const/4 v1, 0x0

    if-nez p2, :cond_b

    .line 405
    instance-of p2, v0, Ll/ۨ۠᩵;

    if-eqz p2, :cond_8

    .line 411
    move-object p2, v0

    check-cast p2, Ll/ۨ۠᩵;

    invoke-virtual {p2}, Ll/ۨ۠᩵;->᩷()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 417
    instance-of v0, v0, Ll/ܽ۠᩵;

    if-eqz v0, :cond_6

    .line 418
    iget-object p2, p2, Ll/ۨ۠᩵;->ۙ:Ljava/lang/Throwable;

    .line 419
    instance-of v0, p1, Ll/֫۠᩵;

    if-eqz v0, :cond_5

    .line 420
    check-cast p1, Ll/֫۠᩵;

    invoke-virtual {p0, p1, p2}, Ll/᩻۠᩵;->ۙ(Ll/֫۠᩵;Ljava/lang/Throwable;)V

    return-void

    .line 423
    :cond_5
    invoke-direct {p0, p1, p2}, Ll/᩻۠᩵;->ۙ(Ll/ۡ᩷ۨ;Ljava/lang/Throwable;)V

    :cond_6
    :goto_2
    return-void

    .line 411
    :cond_7
    invoke-static {p1, v0}, Ll/᩻۠᩵;->ۙ(Ll/ۤۙۨ;Ljava/lang/Object;)V

    throw v1

    .line 428
    :cond_8
    instance-of p2, v0, Ll/᩵۠᩵;

    if-eqz p2, :cond_a

    .line 432
    move-object p2, v0

    check-cast p2, Ll/᩵۠᩵;

    iget-object p2, p2, Ll/᩵۠᩵;->᩷:Ll/֫۠᩵;

    if-nez p2, :cond_9

    return-void

    :cond_9
    invoke-static {p1, v0}, Ll/᩻۠᩵;->ۙ(Ll/ۤۙۨ;Ljava/lang/Object;)V

    throw v1

    :cond_a
    return-void

    .line 404
    :cond_b
    invoke-static {p1, v0}, Ll/᩻۠᩵;->ۙ(Ll/ۤۙۨ;Ljava/lang/Object;)V

    throw v1

    .line 385
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "invokeOnCancellation should be called at most once"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۚ()V
    .locals 2

    .line 358
    iget-object v0, p0, Ll/᩻۠᩵;->۟:Ll/ۙۢ᩵;

    instance-of v1, v0, Ll/᩻᩷ۨ;

    if-eqz v1, :cond_0

    check-cast v0, Ll/᩻᩷ۨ;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0, p0}, Ll/᩻᩷ۨ;->ۙ(Ll/᩻۠᩵;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 359
    :cond_1
    invoke-virtual {p0}, Ll/᩻۠᩵;->ᩴ()V

    .line 360
    invoke-virtual {p0, v0}, Ll/᩻۠᩵;->ۙ(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public final ۤ()Ljava/lang/Object;
    .locals 1

    .line 0
    sget-object v0, Ll/᩻۠᩵;->֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 104
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ۤ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 598
    instance-of v0, p1, Ll/᩵۠᩵;

    if-eqz v0, :cond_0

    check-cast p1, Ll/᩵۠᩵;

    iget-object p1, p1, Ll/᩵۠᩵;->ᩴ:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public final ۫()V
    .locals 2

    .line 125
    invoke-direct {p0}, Ll/᩻۠᩵;->ۧ()Ll/ۧۜ᩵;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 0
    :cond_0
    sget-object v1, Ll/᩻۠᩵;->֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 104
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 108
    instance-of v1, v1, Ll/᩻۬᩵;

    if-nez v1, :cond_1

    .line 132
    invoke-interface {v0}, Ll/ۧۜ᩵;->᩸()V

    .line 0
    sget-object v0, Ll/᩻۠᩵;->ۢ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 133
    sget-object v1, Ll/ۧ۬᩵;->ܰ:Ll/ۧ۬᩵;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ܳ()Ljava/lang/Object;
    .locals 5

    .line 293
    invoke-direct {p0}, Ll/᩻۠᩵;->᩻()Z

    move-result v0

    .line 271
    :cond_0
    sget-object v1, Ll/᩻۠᩵;->ᩳ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v2

    shr-int/lit8 v3, v2, 0x1d

    if-eqz v3, :cond_7

    const/4 v1, 0x2

    if-ne v3, v1, :cond_6

    if-eqz v0, :cond_1

    .line 322
    invoke-virtual {p0}, Ll/᩻۠᩵;->ۚ()V

    .line 0
    :cond_1
    sget-object v0, Ll/᩻۠᩵;->֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 104
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 325
    instance-of v2, v0, Ll/ۨ۠᩵;

    if-nez v2, :cond_5

    .line 330
    iget v2, p0, Ll/۫ۜ᩵;->ܿ:I

    const/4 v3, 0x1

    if-eq v2, v3, :cond_2

    if-ne v2, v1, :cond_4

    .line 331
    :cond_2
    sget-object v1, Ll/ۡۜ᩵;->ۛ:Ll/֨ۜ᩵;

    sget-object v1, Ll/֨ۜ᩵;->ܰ:Ll/֨ۜ᩵;

    iget-object v2, p0, Ll/᩻۠᩵;->֡:Ll/ۧۢ᩵;

    invoke-interface {v2, v1}, Ll/ۧۢ᩵;->ۙ(Ll/֫ۢ᩵;)Ll/ۚۢ᩵;

    move-result-object v1

    check-cast v1, Ll/ۡۜ᩵;

    if-eqz v1, :cond_4

    .line 332
    invoke-interface {v1}, Ll/ۡۜ᩵;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_0

    .line 333
    :cond_3
    invoke-interface {v1}, Ll/ۡۜ᩵;->ܳ()Ljava/util/concurrent/CancellationException;

    move-result-object v1

    .line 334
    invoke-virtual {p0, v0, v1}, Ll/᩻۠᩵;->ۙ(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V

    .line 58
    throw v1

    .line 338
    :cond_4
    :goto_0
    invoke-virtual {p0, v0}, Ll/᩻۠᩵;->ۤ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 325
    :cond_5
    check-cast v0, Ll/ۨ۠᩵;

    iget-object v0, v0, Ll/ۨ۠᩵;->ۙ:Ljava/lang/Throwable;

    .line 58
    throw v0

    .line 275
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already suspended"

    .line 276
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    const v3, 0x1fffffff

    and-int/2addr v3, v2

    const/high16 v4, 0x20000000

    add-int/2addr v3, v4

    .line 274
    invoke-virtual {v1, p0, v2, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 0
    sget-object v1, Ll/᩻۠᩵;->ۢ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 102
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧۜ᩵;

    if-nez v1, :cond_8

    .line 307
    invoke-direct {p0}, Ll/᩻۠᩵;->ۧ()Ll/ۧۜ᩵;

    :cond_8
    if-eqz v0, :cond_9

    .line 315
    invoke-virtual {p0}, Ll/᩻۠᩵;->ۚ()V

    .line 57
    :cond_9
    sget-object v0, Ll/ܺۢ᩵;->ܿ:Ll/ܺۢ᩵;

    return-object v0
.end method

.method public final ᩴ()V
    .locals 2

    .line 102
    sget-object v0, Ll/᩻۠᩵;->ۢ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧۜ᩵;

    if-nez v1, :cond_0

    return-void

    .line 565
    :cond_0
    invoke-interface {v1}, Ll/ۧۜ᩵;->᩸()V

    .line 566
    sget-object v1, Ll/ۧ۬᩵;->ܰ:Ll/ۧ۬᩵;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final ᩷(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 0

    .line 605
    invoke-super {p0, p1}, Ll/۫ۜ᩵;->᩷(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ᩷()Ll/᩺ۢ᩵;
    .locals 2

    .line 160
    iget-object v0, p0, Ll/᩻۠᩵;->۟:Ll/ۙۢ᩵;

    instance-of v1, v0, Ll/᩺ۢ᩵;

    if-eqz v1, :cond_0

    check-cast v0, Ll/᩺ۢ᩵;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩸()V
    .locals 1

    .line 582
    iget v0, p0, Ll/۫ۜ᩵;->ܿ:I

    invoke-direct {p0, v0}, Ll/᩻۠᩵;->ۙ(I)V

    return-void
.end method
