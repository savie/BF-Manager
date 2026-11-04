.class public final Ll/֫ۤܽ;
.super Ljava/lang/Object;
.source "E3QI"

# interfaces
.implements Ll/ۢۤܽ;


# instance fields
.field public final ܰ:Ll/֡ܽܽ;

.field public final ܿ:Ll/ۖۙܽ;

.field public volatile ᩶:Ll/ۢۤܽ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 755
    sget-object v0, Ll/ۚ᩸ܽ;->᩻ۙ:Ll/᩺᩷ܽ;

    .line 3416
    invoke-direct {p0, v0}, Ll/֫ۤܽ;-><init>(Ll/ۢۤܽ;)V

    return-void
.end method

.method public constructor <init>(Ll/ۢۤܽ;)V
    .locals 1

    .line 3424
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3412
    invoke-static {}, Ll/֡ܽܽ;->ܳ()Ll/֡ܽܽ;

    move-result-object v0

    iput-object v0, p0, Ll/֫ۤܽ;->ܰ:Ll/֡ܽܽ;

    .line 3413
    invoke-static {}, Ll/ۖۙܽ;->ۤ()Ll/ۖۙܽ;

    move-result-object v0

    iput-object v0, p0, Ll/֫ۤܽ;->ܿ:Ll/ۖۙܽ;

    .line 3425
    iput-object p1, p0, Ll/֫ۤܽ;->᩶:Ll/ۢۤܽ;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    .line 3512
    iget-object v0, p0, Ll/֫ۤܽ;->᩶:Ll/ۢۤܽ;

    invoke-interface {v0}, Ll/ۢۤܽ;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getEntry()Ll/֫᩸ܽ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۙ(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;Ll/֫᩸ܽ;)Ll/ۢۤܽ;
    .locals 0

    return-object p0
.end method

.method public final ۙ(Ljava/lang/Object;Ll/᩵᩷ܽ;)Ll/ܰܽܽ;
    .locals 1

    .line 3473
    :try_start_0
    iget-object v0, p0, Ll/֫ۤܽ;->ܿ:Ll/ۖۙܽ;

    invoke-virtual {v0}, Ll/ۖۙܽ;->᩷()V

    .line 3474
    iget-object v0, p0, Ll/֫ۤܽ;->᩶:Ll/ۢۤܽ;

    invoke-interface {v0}, Ll/ۢۤܽ;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 3476
    invoke-virtual {p2, p1}, Ll/᩵᩷ܽ;->ۙ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 3445
    iget-object p2, p0, Ll/֫ۤܽ;->ܰ:Ll/֡ܽܽ;

    invoke-virtual {p2, p1}, Ll/֡ܽܽ;->ۙ(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 3477
    iget-object p1, p0, Ll/֫ۤܽ;->ܰ:Ll/֡ܽܽ;

    return-object p1

    :cond_0
    invoke-static {p1}, Ll/ۗܽܽ;->ۙ(Ljava/lang/Object;)Ll/ܰܽܽ;

    move-result-object p1

    return-object p1

    .line 3479
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 957
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    invoke-virtual {p2, p1}, Ll/᩵᩷ܽ;->ۙ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ll/ۗܽܽ;->ۙ(Ljava/lang/Object;)Ll/ܰܽܽ;

    move-result-object p1

    .line 3485
    new-instance p2, Ll/ۚۤܽ;

    invoke-direct {p2, p0}, Ll/ۚۤܽ;-><init>(Ll/֫ۤܽ;)V

    .line 3491
    invoke-static {}, Ll/ܿܽܽ;->ۙ()Ljava/util/concurrent/Executor;

    move-result-object v0

    .line 3485
    invoke-static {p1, p2, v0}, Ll/ۗܽܽ;->ۙ(Ll/ܰܽܽ;Ll/ۚۤܽ;Ljava/util/concurrent/Executor;)Ll/ܰܽܽ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    .line 3450
    iget-object p2, p0, Ll/֫ۤܽ;->ܰ:Ll/֡ܽܽ;

    invoke-virtual {p2, p1}, Ll/֡ܽܽ;->ۙ(Ljava/lang/Throwable;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 3493
    iget-object p2, p0, Ll/֫ۤܽ;->ܰ:Ll/֡ܽܽ;

    goto :goto_0

    .line 3454
    :cond_2
    invoke-static {p1}, Ll/ۗܽܽ;->ۙ(Ljava/lang/Throwable;)Ll/ܰܽܽ;

    move-result-object p2

    .line 3494
    :goto_0
    instance-of p1, p1, Ljava/lang/InterruptedException;

    if-eqz p1, :cond_3

    .line 3495
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    :cond_3
    return-object p2
.end method

.method public final ۙ(Ljava/lang/Object;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 3445
    iget-object v0, p0, Ll/֫ۤܽ;->ܰ:Ll/֡ܽܽ;

    invoke-virtual {v0, p1}, Ll/֡ܽܽ;->ۙ(Ljava/lang/Object;)Z

    return-void

    .line 755
    :cond_0
    sget-object p1, Ll/ۚ᩸ܽ;->᩻ۙ:Ll/᩺᩷ܽ;

    .line 3465
    iput-object p1, p0, Ll/֫ۤܽ;->᩶:Ll/ۢۤܽ;

    return-void
.end method

.method public final ۙ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ۤ()Z
    .locals 1

    .line 3435
    iget-object v0, p0, Ll/֫ۤܽ;->᩶:Ll/ۢۤܽ;

    invoke-interface {v0}, Ll/ۢۤܽ;->ۤ()Z

    move-result v0

    return v0
.end method

.method public final ᩷()I
    .locals 1

    .line 3440
    iget-object v0, p0, Ll/֫ۤܽ;->᩶:Ll/ۢۤܽ;

    invoke-interface {v0}, Ll/ۢۤܽ;->᩷()I

    move-result v0

    return v0
.end method

.method public final ᩸()Ljava/lang/Object;
    .locals 1

    .line 3507
    iget-object v0, p0, Ll/֫ۤܽ;->ܰ:Ll/֡ܽܽ;

    invoke-static {v0}, Ll/ᩳܽܽ;->ۙ(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
