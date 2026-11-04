.class public final Ll/۟ۙۨ;
.super Ll/֨ۙۨ;
.source "1ANI"


# instance fields
.field public final ۙ:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 242
    invoke-direct {p0}, Ll/֨ۙۨ;-><init>()V

    .line 260
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/۟ۙۨ;->ۙ:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۙۢ᩵;)Ljava/lang/Object;
    .locals 3

    .line 319
    new-instance v0, Ll/᩻۠᩵;

    invoke-static {p1}, Ll/۬ۧۤ;->ۙ(Ll/ۙۢ᩵;)Ll/ۙۢ᩵;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Ll/᩻۠᩵;-><init>(Ll/ۙۢ᩵;I)V

    .line 325
    invoke-virtual {v0}, Ll/᩻۠᩵;->۫()V

    .line 301
    invoke-static {}, Ll/֡ۙۨ;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object p1

    .line 0
    :cond_0
    iget-object v1, p0, Ll/۟ۙۨ;->ۙ:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eq v1, p1, :cond_0

    .line 304
    sget-object p1, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    invoke-virtual {v0, p1}, Ll/᩻۠᩵;->ۙ(Ljava/lang/Object;)V

    .line 327
    :goto_0
    invoke-virtual {v0}, Ll/᩻۠᩵;->ܳ()Ljava/lang/Object;

    move-result-object p1

    .line 57
    sget-object v0, Ll/ܺۢ᩵;->ܿ:Ll/ܺۢ᩵;

    if-ne p1, v0, :cond_2

    return-object p1

    .line 328
    :cond_2
    sget-object p1, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    return-object p1
.end method

.method public final ۙ()V
    .locals 4

    .line 33
    :goto_0
    iget-object v0, p0, Ll/۟ۙۨ;->ۙ:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 279
    :cond_0
    invoke-static {}, Ll/֡ۙۨ;->᩷()Ll/ۜ᩷ۨ;

    move-result-object v2

    if-ne v1, v2, :cond_1

    :goto_1
    return-void

    .line 280
    :cond_1
    invoke-static {}, Ll/֡ۙۨ;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object v2

    if-ne v1, v2, :cond_4

    .line 281
    invoke-static {}, Ll/֡ۙۨ;->᩷()Ll/ۜ᩷ۨ;

    move-result-object v2

    .line 0
    :cond_2
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    return-void

    :cond_3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v1, :cond_2

    goto :goto_0

    .line 285
    :cond_4
    invoke-static {}, Ll/֡ۙۨ;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object v2

    .line 0
    :cond_5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 286
    check-cast v1, Ll/᩻۠᩵;

    sget-object v0, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    invoke-interface {v1, v0}, Ll/ۙۢ᩵;->ۙ(Ljava/lang/Object;)V

    return-void

    .line 0
    :cond_6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v1, :cond_5

    goto :goto_0
.end method

.method public final ۙ(Ljava/lang/Object;)Z
    .locals 1

    .line 33
    iget-object p1, p0, Ll/۟ۙۨ;->ۙ:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 265
    :cond_0
    invoke-static {}, Ll/֡ۙۨ;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object v0

    .line 34
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ᩷(Ljava/lang/Object;)V
    .locals 1

    .line 270
    iget-object p1, p0, Ll/۟ۙۨ;->ۙ:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    .line 34
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final ᩷()Z
    .locals 2

    .line 294
    iget-object v0, p0, Ll/۟ۙۨ;->ۙ:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Ll/֡ۙۨ;->ۙ()Ll/ۜ᩷ۨ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    .line 296
    invoke-static {}, Ll/֡ۙۨ;->᩷()Ll/ۜ᩷ۨ;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
