.class public final Ll/ۤۤ᩵;
.super Ll/᩷ۤ᩵;
.source "8ISW"


# virtual methods
.method public final ᩷()V
    .locals 7

    .line 25
    invoke-virtual {p0}, Ll/᩷ۤ᩵;->ۙ()Ll/֨ۤ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/֨ۤ᩵;->ۙ()Ll/ᩳۤ᩵;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 29
    invoke-virtual {p0}, Ll/᩷ۤ᩵;->ۙ()Ll/֨ۤ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/֨ۤ᩵;->ۤ()Ll/۟ۤ᩵;

    move-result-object v0

    .line 30
    invoke-virtual {p0}, Ll/᩷ۤ᩵;->ۙ()Ll/֨ۤ᩵;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/۟ۤ᩵;->᩷(Ll/֨ۤ᩵;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 35
    new-instance v1, Ll/۠ۤ᩵;

    invoke-virtual {p0}, Ll/᩷ۤ᩵;->ۙ()Ll/֨ۤ᩵;

    move-result-object v2

    .line 24
    invoke-direct {v1, v2}, Ll/ۖۤ᩵;-><init>(Ll/֨ۤ᩵;)V

    .line 29
    invoke-virtual {v1}, Ll/ۖۤ᩵;->᩷()Ll/֨ۤ᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/֨ۤ᩵;->ۙ()Ll/ᩳۤ᩵;

    move-result-object v2

    .line 30
    invoke-virtual {v2}, Ll/ᩳۤ᩵;->ᩴ()Ljava/util/List;

    move-result-object v3

    .line 31
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v3, v4}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v3

    const/4 v4, 0x0

    .line 35
    :goto_0
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 36
    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۡۗ;

    .line 20
    invoke-virtual {v5}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v5

    sget-object v6, Ll/᩺ۢۗ;->ܳۙ:Ll/᩺ۢۗ;

    if-ne v5, v6, :cond_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {v2}, Ll/ᩳۤ᩵;->᩸()I

    move-result v3

    add-int/2addr v3, v4

    invoke-virtual {v2, v3}, Ll/ᩳۤ᩵;->᩷(I)V

    .line 43
    invoke-virtual {v2}, Ll/ᩳۤ᩵;->ۤ()I

    move-result v3

    add-int/2addr v3, v4

    invoke-virtual {v2, v3}, Ll/ᩳۤ᩵;->ۙ(I)V

    .line 44
    invoke-virtual {v1}, Ll/ۖۤ᩵;->᩷()Ll/֨ۤ᩵;

    move-result-object v1

    .line 37
    new-instance v2, Ll/۬ۤ᩵;

    .line 32
    invoke-direct {v2, v1}, Ll/ۖۤ᩵;-><init>(Ll/֨ۤ᩵;)V

    .line 38
    invoke-virtual {v2}, Ll/۬ۤ᩵;->ۤ()Ll/֨ۤ᩵;

    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void

    .line 32
    :cond_1
    new-instance v0, Ll/۠ۧ᩵;

    const-string v1, "Orphaned traverser state"

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 32
    throw v0

    .line 27
    :cond_2
    new-instance v0, Ll/۠ۧ᩵;

    const-string v1, "Expected to find block info within BaseBlockTraverserHandler"

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 27
    throw v0
.end method
