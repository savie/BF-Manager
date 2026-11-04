.class public final Ll/ܿۙۨ;
.super Ll/ۢۙۨ;
.source "1ANI"

# interfaces
.implements Ll/ۘۙۨ;
.implements Ll/᩹ۙۨ;


# static fields
.field public static final synthetic ۟:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field public volatile synthetic _state$volatile:Ljava/lang/Object;

.field public ֡:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 0
    const-class v0, Ljava/lang/Object;

    const-string v1, "_state$volatile"

    const-class v2, Ll/ܿۙۨ;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ܿۙۨ;->۟:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 311
    iput-object p1, p0, Ll/ܿۙۨ;->_state$volatile:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 2

    .line 0
    sget-object v0, Ll/ܿۙۨ;->۟:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 315
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 14
    sget-object v1, Ll/۠ۙۨ;->ۙ:Ll/ۜ᩷ۨ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public final setValue(Ljava/lang/Object;)V
    .locals 5

    if-nez p1, :cond_0

    .line 316
    sget-object p1, Ll/۠ۙۨ;->ۙ:Ll/ۜ᩷ۨ;

    :cond_0
    move-object v0, p0

    .line 16
    monitor-enter v0

    .line 0
    :try_start_0
    sget-object v1, Ll/ܿۙۨ;->۟:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 325
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 327
    invoke-static {v2, p1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v2, :cond_1

    monitor-exit v0

    return-void

    .line 328
    :cond_1
    :try_start_1
    invoke-virtual {v1, p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 329
    iget p1, p0, Ll/ܿۙۨ;->֡:I

    and-int/lit8 v1, p1, 0x1

    if-nez v1, :cond_5

    add-int/lit8 p1, p1, 0x1

    .line 332
    iput p1, p0, Ll/ܿۙۨ;->֡:I

    .line 338
    invoke-virtual {p0}, Ll/ۢۙۨ;->᩸()[Ll/֨ۙۨ;

    move-result-object v1

    .line 339
    sget-object v2, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 16
    monitor-exit v0

    .line 348
    :goto_0
    check-cast v1, [Ll/۟ۙۨ;

    if-eqz v1, :cond_3

    .line 435
    array-length v0, v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v0, :cond_3

    aget-object v3, v1, v2

    if-eqz v3, :cond_2

    .line 349
    invoke-virtual {v3}, Ll/۟ۙۨ;->ۙ()V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    move-object v0, p0

    .line 16
    monitor-enter v0

    .line 353
    :try_start_2
    iget v1, p0, Ll/ܿۙۨ;->֡:I

    if-ne v1, p1, :cond_4

    add-int/lit8 p1, p1, 0x1

    .line 354
    iput p1, p0, Ll/ܿۙۨ;->֡:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 355
    monitor-exit v0

    return-void

    .line 359
    :cond_4
    :try_start_3
    invoke-virtual {p0}, Ll/ۢۙۨ;->᩸()[Ll/֨ۙۨ;

    move-result-object p1

    .line 360
    sget-object v2, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 16
    monitor-exit v0

    move v4, v1

    move-object v1, p1

    move p1, v4

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_5
    add-int/lit8 p1, p1, 0x2

    .line 335
    :try_start_4
    iput p1, p0, Ll/ܿۙۨ;->֡:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 336
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p1

    .line 16
    monitor-exit v0

    throw p1
.end method

.method public final ۙ(Ljava/lang/Object;Ll/ۛۢ᩵;)Ljava/lang/Object;
    .locals 0

    .line 373
    invoke-virtual {p0, p1}, Ll/ܿۙۨ;->setValue(Ljava/lang/Object;)V

    .line 374
    sget-object p1, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    return-object p1
.end method

.method public final ۙ(Ll/ۗۙۨ;Ll/ۙۢ᩵;)Ljava/lang/Object;
    .locals 11

    .line 2
    instance-of v0, p2, Ll/᩶ۙۨ;

    if-eqz v0, :cond_0

    .line 7
    move-object v0, p2

    check-cast v0, Ll/᩶ۙۨ;

    .line 9
    iget v1, v0, Ll/᩶ۙۨ;->ۡ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    .line 18
    iput v1, v0, Ll/᩶ۙۨ;->ۡ:I

    goto :goto_0

    .line 21
    :cond_0
    new-instance v0, Ll/᩶ۙۨ;

    .line 23
    check-cast p2, Ll/ۛۢ᩵;

    .line 26
    invoke-direct {v0, p0, p2}, Ll/᩶ۙۨ;-><init>(Ll/ܿۙۨ;Ll/ۛۢ᩵;)V

    .line 28
    :goto_0
    iget-object p2, v0, Ll/᩶ۙۨ;->ۖ:Ljava/lang/Object;

    .line 57
    sget-object v1, Ll/ܺۢ᩵;->ܿ:Ll/ܺۢ᩵;

    .line 381
    iget v2, v0, Ll/᩶ۙۨ;->ۡ:I

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Ll/᩶ۙۨ;->֨:Ljava/lang/Object;

    iget-object v2, v0, Ll/᩶ۙۨ;->ۢ:Ll/ۡۜ᩵;

    iget-object v6, v0, Ll/᩶ۙۨ;->ᩳ:Ljava/lang/Object;

    check-cast v6, Ll/۟ۙۨ;

    iget-object v7, v0, Ll/᩶ۙۨ;->۟:Ll/ۗۙۨ;

    iget-object v8, v0, Ll/᩶ۙۨ;->֡:Ljava/lang/Object;

    check-cast v8, Ll/ܿۙۨ;

    :try_start_0
    invoke-static {p2}, Ll/ᩴ۟᩵;->ۙ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v10, v3

    move-object v3, p1

    move-object p1, v10

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Ll/᩶ۙۨ;->֨:Ljava/lang/Object;

    iget-object v2, v0, Ll/᩶ۙۨ;->ۢ:Ll/ۡۜ᩵;

    iget-object v6, v0, Ll/᩶ۙۨ;->ᩳ:Ljava/lang/Object;

    check-cast v6, Ll/۟ۙۨ;

    iget-object v7, v0, Ll/᩶ۙۨ;->۟:Ll/ۗۙۨ;

    iget-object v8, v0, Ll/᩶ۙۨ;->֡:Ljava/lang/Object;

    check-cast v8, Ll/ܿۙۨ;

    :try_start_1
    invoke-static {p2}, Ll/ᩴ۟᩵;->ۙ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v10, v3

    move-object v3, p1

    move-object p1, v10

    goto/16 :goto_5

    :cond_3
    iget-object p1, v0, Ll/᩶ۙۨ;->ᩳ:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Ll/۟ۙۨ;

    iget-object p1, v0, Ll/᩶ۙۨ;->۟:Ll/ۗۙۨ;

    iget-object v2, v0, Ll/᩶ۙۨ;->֡:Ljava/lang/Object;

    move-object v8, v2

    check-cast v8, Ll/ܿۙۨ;

    :try_start_2
    invoke-static {p2}, Ll/ᩴ۟᩵;->ۙ(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_7

    :cond_4
    invoke-static {p2}, Ll/ᩴ۟᩵;->ۙ(Ljava/lang/Object;)V

    .line 382
    invoke-virtual {p0}, Ll/ۢۙۨ;->ۙ()Ll/֨ۙۨ;

    move-result-object p2

    check-cast p2, Ll/۟ۙۨ;

    .line 384
    :try_start_3
    instance-of v2, p1, Ll/ᩳۙۨ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-nez v2, :cond_c

    move-object v8, p0

    move-object v6, p2

    .line 326
    :goto_1
    :try_start_4
    invoke-virtual {v0}, Ll/ۛۢ᩵;->getContext()Ll/ۧۢ᩵;

    move-result-object p2

    .line 385
    sget-object v2, Ll/ۡۜ᩵;->ۛ:Ll/֨ۜ᩵;

    invoke-interface {p2, v2}, Ll/ۧۢ᩵;->ۙ(Ll/֫ۢ᩵;)Ll/ۚۢ᩵;

    move-result-object p2

    move-object v2, p2

    check-cast v2, Ll/ۡۜ᩵;

    move-object v7, p1

    move-object p1, v3

    .line 0
    :cond_5
    :goto_2
    sget-object p2, Ll/ܿۙۨ;->۟:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 391
    invoke-virtual {p2, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-eqz v2, :cond_7

    .line 576
    invoke-interface {v2}, Ll/ۡۜ᩵;->ۤ()Z

    move-result v9

    if-eqz v9, :cond_6

    goto :goto_3

    :cond_6
    invoke-interface {v2}, Ll/ۡۜ᩵;->ܳ()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    throw p1

    :cond_7
    :goto_3
    if-eqz v3, :cond_8

    .line 169
    invoke-virtual {v3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_b

    .line 396
    :cond_8
    sget-object v3, Ll/۠ۙۨ;->ۙ:Ll/ۜ᩷ۨ;

    if-ne p2, v3, :cond_9

    move-object v3, p1

    goto :goto_4

    :cond_9
    move-object v3, p2

    :goto_4
    iput-object v8, v0, Ll/᩶ۙۨ;->֡:Ljava/lang/Object;

    iput-object v7, v0, Ll/᩶ۙۨ;->۟:Ll/ۗۙۨ;

    iput-object v6, v0, Ll/᩶ۙۨ;->ᩳ:Ljava/lang/Object;

    iput-object v2, v0, Ll/᩶ۙۨ;->ۢ:Ll/ۡۜ᩵;

    iput-object p2, v0, Ll/᩶ۙۨ;->֨:Ljava/lang/Object;

    iput v5, v0, Ll/᩶ۙۨ;->ۡ:I

    invoke-interface {v7, v3, v0}, Ll/ۗۙۨ;->ۙ(Ljava/lang/Object;Ll/ۛۢ᩵;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_a

    goto :goto_6

    :cond_a
    move-object v3, p2

    .line 400
    :cond_b
    :goto_5
    invoke-virtual {v6}, Ll/۟ۙۨ;->᩷()Z

    move-result p2

    if-nez p2, :cond_5

    .line 401
    iput-object v8, v0, Ll/᩶ۙۨ;->֡:Ljava/lang/Object;

    iput-object v7, v0, Ll/᩶ۙۨ;->۟:Ll/ۗۙۨ;

    iput-object v6, v0, Ll/᩶ۙۨ;->ᩳ:Ljava/lang/Object;

    iput-object v2, v0, Ll/᩶ۙۨ;->ۢ:Ll/ۡۜ᩵;

    iput-object v3, v0, Ll/᩶ۙۨ;->֨:Ljava/lang/Object;

    iput v4, v0, Ll/᩶ۙۨ;->ۡ:I

    invoke-virtual {v6, v0}, Ll/۟ۙۨ;->ۙ(Ll/ۙۢ᩵;)Ljava/lang/Object;

    move-result-object p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-ne p2, v1, :cond_5

    :goto_6
    return-object v1

    :goto_7
    move-object p2, v6

    goto :goto_8

    .line 384
    :cond_c
    :try_start_5
    move-object v1, p1

    check-cast v1, Ll/ᩳۙۨ;

    iput-object p0, v0, Ll/᩶ۙۨ;->֡:Ljava/lang/Object;

    iput-object p1, v0, Ll/᩶ۙۨ;->۟:Ll/ۗۙۨ;

    iput-object p2, v0, Ll/᩶ۙۨ;->ᩳ:Ljava/lang/Object;

    iput v6, v0, Ll/᩶ۙۨ;->ۡ:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    .line 0
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception p1

    move-object v8, p0

    .line 405
    :goto_8
    invoke-virtual {v8, p2}, Ll/ۢۙۨ;->ۙ(Ll/֨ۙۨ;)V

    throw p1
.end method

.method public final ۤ()[Ll/֨ۙۨ;
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [Ll/۟ۙۨ;

    return-object v0
.end method

.method public final ᩷()Ll/֨ۙۨ;
    .locals 1

    .line 409
    new-instance v0, Ll/۟ۙۨ;

    invoke-direct {v0}, Ll/۟ۙۨ;-><init>()V

    return-object v0
.end method
