.class public final Ll/᩻᩷ۨ;
.super Ll/۫ۜ᩵;
.source "5AY1"

# interfaces
.implements Ll/᩺ۢ᩵;
.implements Ll/ۙۢ᩵;


# static fields
.field public static final synthetic ֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field public volatile synthetic _reusableCancellableContinuation$volatile:Ljava/lang/Object;

.field public ֡:Ljava/lang/Object;

.field public final ۟:Ll/ۛۢ᩵;

.field public final ۢ:Ll/ᩳ۠᩵;

.field public final ᩳ:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 0
    const-class v0, Ljava/lang/Object;

    const-string v1, "_reusableCancellableContinuation$volatile"

    const-class v2, Ll/᩻᩷ۨ;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/᩻᩷ۨ;->֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Ll/ᩳ۠᩵;Ll/ۛۢ᩵;)V
    .locals 1

    const/4 v0, -0x1

    .line 17
    invoke-direct {p0, v0}, Ll/۫ۜ᩵;-><init>(I)V

    .line 14
    iput-object p1, p0, Ll/᩻᩷ۨ;->ۢ:Ll/ᩳ۠᩵;

    .line 16
    iput-object p2, p0, Ll/᩻᩷ۨ;->۟:Ll/ۛۢ᩵;

    .line 20
    invoke-static {}, Ll/۬᩷ۨ;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object p1

    iput-object p1, p0, Ll/᩻᩷ۨ;->֡:Ljava/lang/Object;

    .line 0
    invoke-interface {p2}, Ll/ۙۢ᩵;->getContext()Ll/ۧۢ᩵;

    move-result-object p1

    .line 24
    sget-object p2, Ll/ᩴۤۨ;->ۙ:Ll/ۜ᩷ۨ;

    const/4 p2, 0x0

    .line 55
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    sget-object v0, Ll/᩷ۤۨ;->᩶:Ll/᩷ۤۨ;

    invoke-interface {p1, p2, v0}, Ll/ۧۢ᩵;->ۙ(Ljava/lang/Object;Ll/᩺֨᩵;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    .line 24
    iput-object p1, p0, Ll/᩻᩷ۨ;->ᩳ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getContext()Ll/ۧۢ᩵;
    .locals 1

    .line 0
    iget-object v0, p0, Ll/᩻᩷ۨ;->۟:Ll/ۛۢ᩵;

    invoke-interface {v0}, Ll/ۙۢ᩵;->getContext()Ll/ۧۢ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 264
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DispatchedContinuation["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩻᩷ۨ;->ۢ:Ll/ᩳ۠᩵;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩻᩷ۨ;->۟:Ll/ۛۢ᩵;

    invoke-static {v1}, Ll/᩷ۜ᩵;->ۙ(Ll/ۙۢ᩵;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/᩻۠᩵;)Ljava/lang/Throwable;
    .locals 4

    .line 143
    :goto_0
    sget-object v0, Ll/᩻᩷ۨ;->֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    .line 147
    sget-object v3, Ll/۬᩷ۨ;->ۙ:Ll/ۜ᩷ۨ;

    if-ne v1, v3, :cond_2

    .line 0
    :cond_0
    invoke-virtual {v0, p0, v3, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v2

    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, v3, :cond_0

    goto :goto_0

    .line 150
    :cond_2
    instance-of p1, v1, Ljava/lang/Throwable;

    if-eqz p1, :cond_5

    .line 0
    :goto_1
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 152
    check-cast v1, Ljava/lang/Throwable;

    return-object v1

    .line 0
    :cond_3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_1

    .line 151
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 152
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 154
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Inconsistent state "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ()Ll/ۙۢ᩵;
    .locals 0

    return-object p0
.end method

.method public final ۙ(Ljava/lang/Object;)V
    .locals 6

    .line 191
    iget-object v0, p0, Ll/᩻᩷ۨ;->۟:Ll/ۛۢ᩵;

    invoke-interface {v0}, Ll/ۙۢ᩵;->getContext()Ll/ۧۢ᩵;

    move-result-object v1

    .line 10
    invoke-static {p1}, Ll/᩸۟᩵;->ۙ(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move-object v4, p1

    goto :goto_0

    .line 12
    :cond_0
    new-instance v4, Ll/ۨ۠᩵;

    .line 38
    invoke-direct {v4, v2, v3}, Ll/ۨ۠᩵;-><init>(Ljava/lang/Throwable;Z)V

    .line 193
    :goto_0
    iget-object v2, p0, Ll/᩻᩷ۨ;->ۢ:Ll/ᩳ۠᩵;

    invoke-virtual {v2}, Ll/ᩳ۠᩵;->᩷()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 194
    iput-object v4, p0, Ll/᩻᩷ۨ;->֡:Ljava/lang/Object;

    .line 195
    iput v3, p0, Ll/۫ۜ᩵;->ܿ:I

    .line 196
    invoke-virtual {v2, v1, p0}, Ll/ᩳ۠᩵;->ۙ(Ll/ۧۢ᩵;Ljava/lang/Runnable;)V

    return-void

    .line 298
    :cond_1
    invoke-static {}, Ll/᩹۬᩵;->ۙ()Ll/ܺۜ᩵;

    move-result-object v1

    .line 301
    invoke-virtual {v1}, Ll/ܺۜ᩵;->ۗ()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 303
    iput-object v4, p0, Ll/᩻᩷ۨ;->֡:Ljava/lang/Object;

    .line 304
    iput v3, p0, Ll/۫ۜ᩵;->ܿ:I

    .line 305
    invoke-virtual {v1, p0}, Ll/ܺۜ᩵;->ۙ(Ll/۫ۜ᩵;)V

    return-void

    :cond_2
    const/4 v2, 0x1

    .line 196
    invoke-virtual {v1, v2}, Ll/ܺۜ᩵;->ۙ(Z)V

    .line 0
    :try_start_0
    invoke-interface {v0}, Ll/ۙۢ᩵;->getContext()Ll/ۧۢ᩵;

    move-result-object v2

    .line 199
    iget-object v3, p0, Ll/᩻᩷ۨ;->ᩳ:Ljava/lang/Object;

    .line 91
    invoke-static {v2, v3}, Ll/ᩴۤۨ;->᩷(Ll/ۧۢ᩵;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 200
    :try_start_1
    invoke-virtual {v0, p1}, Ll/᩵ۢ᩵;->ۙ(Ljava/lang/Object;)V

    .line 201
    sget-object p1, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    :try_start_2
    invoke-static {v2, v3}, Ll/ᩴۤۨ;->ۙ(Ll/ۧۢ᩵;Ljava/lang/Object;)V

    .line 201
    :cond_3
    invoke-virtual {v1}, Ll/ܺۜ᩵;->᩶()Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 95
    invoke-static {v2, v3}, Ll/ᩴۤۨ;->ۙ(Ll/ۧۢ᩵;Ljava/lang/Object;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    const/4 v0, 0x0

    .line 208
    :try_start_3
    invoke-virtual {p0, p1, v0}, Ll/۫ۜ᩵;->ۙ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 210
    :goto_1
    invoke-virtual {v1}, Ll/ܺۜ᩵;->ܶ()V

    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v1}, Ll/ܺۜ᩵;->ܶ()V

    throw p1
.end method

.method public final ۙ(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V
    .locals 0

    .line 231
    instance-of p1, p1, Ll/ۛ۠᩵;

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 232
    throw p1
.end method

.method public final ۙ(Ljava/lang/Throwable;)Z
    .locals 5

    .line 163
    :goto_0
    sget-object v0, Ll/᩻᩷ۨ;->֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 166
    sget-object v2, Ll/۬᩷ۨ;->ۙ:Ll/ۜ᩷ۨ;

    invoke-static {v1, v2}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    .line 0
    :cond_0
    invoke-virtual {v0, p0, v2, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return v4

    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 170
    :cond_2
    instance-of v2, v1, Ljava/lang/Throwable;

    if-eqz v2, :cond_3

    return v4

    :cond_3
    const/4 v2, 0x0

    .line 0
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 p1, 0x0

    return p1

    :cond_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v1, :cond_3

    goto :goto_0
.end method

.method public final ۤ()Ljava/lang/Object;
    .locals 2

    .line 181
    iget-object v0, p0, Ll/᩻᩷ۨ;->֡:Ljava/lang/Object;

    .line 183
    invoke-static {}, Ll/۬᩷ۨ;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object v1

    iput-object v1, p0, Ll/᩻᩷ۨ;->֡:Ljava/lang/Object;

    return-object v0
.end method

.method public final ۫()V
    .locals 3

    .line 73
    :cond_0
    sget-object v0, Ll/᩻᩷ۨ;->֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 75
    sget-object v2, Ll/۬᩷ۨ;->ۙ:Ll/ۜ᩷ۨ;

    if-eq v1, v2, :cond_0

    .line 57
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ll/᩻۠᩵;

    if-eqz v1, :cond_1

    check-cast v0, Ll/᩻۠᩵;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 86
    invoke-virtual {v0}, Ll/᩻۠᩵;->ᩴ()V

    :cond_2
    return-void
.end method

.method public final ܳ()Z
    .locals 1

    .line 0
    sget-object v0, Ll/᩻᩷ۨ;->֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 66
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩴ()Ll/᩻۠᩵;
    .locals 4

    .line 93
    :cond_0
    :goto_0
    sget-object v0, Ll/᩻᩷ۨ;->֨:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 102
    sget-object v2, Ll/۬᩷ۨ;->ۙ:Ll/ۜ᩷ۨ;

    if-nez v1, :cond_1

    .line 107
    invoke-virtual {v0, p0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    return-object v0

    .line 111
    :cond_1
    instance-of v3, v1, Ll/᩻۠᩵;

    if-eqz v3, :cond_4

    .line 0
    :cond_2
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 113
    check-cast v1, Ll/᩻۠᩵;

    return-object v1

    .line 0
    :cond_3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v1, :cond_2

    goto :goto_0

    :cond_4
    if-eq v1, v2, :cond_0

    .line 120
    instance-of v0, v1, Ljava/lang/Throwable;

    if-eqz v0, :cond_5

    goto :goto_0

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 124
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Inconsistent state "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩷()Ll/᩺ۢ᩵;
    .locals 2

    .line 21
    iget-object v0, p0, Ll/᩻᩷ۨ;->۟:Ll/ۛۢ᩵;

    invoke-static {v0}, Ll/֨᩵ᩴ;->ۙ(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
