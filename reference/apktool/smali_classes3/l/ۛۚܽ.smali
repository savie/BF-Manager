.class public final Ll/ۛۚܽ;
.super Ljava/lang/Object;
.source "I5ZF"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ֡:Ljava/util/Iterator;

.field public ܰ:Ljava/util/Iterator;

.field public ܿ:Ljava/util/Iterator;

.field public ᩶:Ljava/util/ArrayDeque;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;)V
    .locals 1

    .line 1393
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    sget-object v0, Ll/ۨۚܽ;->֡:Ll/ܰ᩻ܽ;

    .line 1394
    iput-object v0, p0, Ll/ۛۚܽ;->ܰ:Ljava/util/Iterator;

    .line 1395
    iput-object p1, p0, Ll/ۛۚܽ;->֡:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 3

    .line 1412
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/ۛۚܽ;->ܰ:Ljava/util/Iterator;

    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_7

    .line 1400
    :goto_1
    iget-object v0, p0, Ll/ۛۚܽ;->֡:Ljava/util/Iterator;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_2

    .line 1407
    :cond_1
    iget-object v0, p0, Ll/ۛۚܽ;->֡:Ljava/util/Iterator;

    goto :goto_3

    .line 1401
    :cond_2
    :goto_2
    iget-object v0, p0, Ll/ۛۚܽ;->᩶:Ljava/util/ArrayDeque;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1402
    iget-object v0, p0, Ll/ۛۚܽ;->᩶:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Iterator;

    iput-object v0, p0, Ll/ۛۚܽ;->֡:Ljava/util/Iterator;

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    .line 1416
    :goto_3
    iput-object v0, p0, Ll/ۛۚܽ;->֡:Ljava/util/Iterator;

    if-nez v0, :cond_4

    const/4 v0, 0x0

    return v0

    .line 1421
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Iterator;

    iput-object v0, p0, Ll/ۛۚܽ;->ܰ:Ljava/util/Iterator;

    .line 1423
    instance-of v1, v0, Ll/ۛۚܽ;

    if-eqz v1, :cond_0

    .line 1427
    check-cast v0, Ll/ۛۚܽ;

    .line 1428
    iget-object v1, v0, Ll/ۛۚܽ;->ܰ:Ljava/util/Iterator;

    iput-object v1, p0, Ll/ۛۚܽ;->ܰ:Ljava/util/Iterator;

    .line 1433
    iget-object v1, p0, Ll/ۛۚܽ;->᩶:Ljava/util/ArrayDeque;

    if-nez v1, :cond_5

    .line 1434
    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v1, p0, Ll/ۛۚܽ;->᩶:Ljava/util/ArrayDeque;

    .line 1436
    :cond_5
    iget-object v1, p0, Ll/ۛۚܽ;->᩶:Ljava/util/ArrayDeque;

    iget-object v2, p0, Ll/ۛۚܽ;->֡:Ljava/util/Iterator;

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    .line 1437
    iget-object v1, v0, Ll/ۛۚܽ;->᩶:Ljava/util/ArrayDeque;

    if-eqz v1, :cond_6

    .line 1438
    :goto_4
    iget-object v1, v0, Ll/ۛۚܽ;->᩶:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    .line 1439
    iget-object v1, p0, Ll/ۛۚܽ;->᩶:Ljava/util/ArrayDeque;

    iget-object v2, v0, Ll/ۛۚܽ;->᩶:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Iterator;

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    goto :goto_4

    .line 1442
    :cond_6
    iget-object v0, v0, Ll/ۛۚܽ;->֡:Ljava/util/Iterator;

    iput-object v0, p0, Ll/ۛۚܽ;->֡:Ljava/util/Iterator;

    goto :goto_0

    :cond_7
    const/4 v0, 0x1

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 1451
    invoke-virtual {p0}, Ll/ۛۚܽ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1452
    iget-object v0, p0, Ll/ۛۚܽ;->ܰ:Ljava/util/Iterator;

    iput-object v0, p0, Ll/ۛۚܽ;->ܿ:Ljava/util/Iterator;

    .line 1454
    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 1456
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 2

    .line 1462
    iget-object v0, p0, Ll/ۛۚܽ;->ܿ:Ljava/util/Iterator;

    if-eqz v0, :cond_0

    .line 1465
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    const/4 v0, 0x0

    .line 1466
    iput-object v0, p0, Ll/ۛۚܽ;->ܿ:Ljava/util/Iterator;

    return-void

    .line 1463
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "no calls to next() since the last call to remove()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
