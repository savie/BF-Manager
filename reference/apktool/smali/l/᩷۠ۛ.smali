.class public final Ll/᩷۠ۛ;
.super Ljava/lang/Object;
.source "U4RU"

# interfaces
.implements Ljava/util/ListIterator;


# instance fields
.field public final synthetic ֡:Ll/ۤ۠ۛ;

.field public ܰ:Ll/ۡۖۛ;

.field public ܿ:Ll/ۡۖۛ;

.field public ᩶:Ll/ۡۖۛ;


# direct methods
.method public constructor <init>(Ll/ۤ۠ۛ;)V
    .locals 1

    .line 487
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷۠ۛ;->֡:Ll/ۤ۠ۛ;

    .line 488
    invoke-virtual {p1}, Ll/ۤ۠ۛ;->size()I

    move-result v0

    if-ltz v0, :cond_1

    .line 490
    invoke-virtual {p1}, Ll/ۤ۠ۛ;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 491
    iput-object v0, p0, Ll/᩷۠ۛ;->ܰ:Ll/ۡۖۛ;

    .line 492
    invoke-virtual {p1}, Ll/ۤ۠ۛ;->getLast()Ll/ۡۖۛ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷۠ۛ;->᩶:Ll/ۡۖۛ;

    return-void

    .line 494
    :cond_0
    invoke-virtual {p1}, Ll/ۤ۠ۛ;->getFirst()Ll/ۡۖۛ;

    move-result-object p1

    .line 499
    iput-object p1, p0, Ll/᩷۠ۛ;->ܰ:Ll/ۡۖۛ;

    .line 500
    iget-object p1, p1, Ll/ۡۖۛ;->ᩴ:Ll/ۡۖۛ;

    iput-object p1, p0, Ll/᩷۠ۛ;->᩶:Ll/ۡۖۛ;

    return-void

    .line 489
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)V
    .locals 3

    .line 577
    iget-object v0, p0, Ll/᩷۠ۛ;->ܰ:Ll/ۡۖۛ;

    iget-object v1, p0, Ll/᩷۠ۛ;->֡:Ll/ۤ۠ۛ;

    if-eqz v0, :cond_0

    .line 578
    move-object v2, p1

    check-cast v2, Ll/ۡۖۛ;

    invoke-virtual {v1, v0, v2}, Ll/ۤ۠ۛ;->᩷(Ll/ۡۖۛ;Ll/ۡۖۛ;)V

    goto :goto_0

    .line 579
    :cond_0
    iget-object v0, p0, Ll/᩷۠ۛ;->᩶:Ll/ۡۖۛ;

    if-eqz v0, :cond_1

    .line 580
    move-object v2, p1

    check-cast v2, Ll/ۡۖۛ;

    invoke-virtual {v1, v0, v2}, Ll/ۤ۠ۛ;->ۙ(Ll/ۡۖۛ;Ll/ۡۖۛ;)V

    goto :goto_0

    .line 582
    :cond_1
    move-object v0, p1

    check-cast v0, Ll/ۡۖۛ;

    invoke-virtual {v1, v0}, Ll/ۤ۠ۛ;->ۙ(Ll/ۡۖۛ;)V

    .line 584
    :goto_0
    check-cast p1, Ll/ۡۖۛ;

    iput-object p1, p0, Ll/᩷۠ۛ;->᩶:Ll/ۡۖۛ;

    const/4 p1, 0x0

    .line 585
    iput-object p1, p0, Ll/᩷۠ۛ;->ܿ:Ll/ۡۖۛ;

    return-void
.end method

.method public final hasNext()Z
    .locals 1

    .line 506
    iget-object v0, p0, Ll/᩷۠ۛ;->ܰ:Ll/ۡۖۛ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 538
    iget-object v0, p0, Ll/᩷۠ۛ;->᩶:Ll/ۡۖۛ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 511
    iget-object v0, p0, Ll/᩷۠ۛ;->ܰ:Ll/ۡۖۛ;

    if-eqz v0, :cond_0

    .line 515
    iput-object v0, p0, Ll/᩷۠ۛ;->᩶:Ll/ۡۖۛ;

    .line 516
    iget-object v1, v0, Ll/ۡۖۛ;->ۤ:Ll/ۡۖۛ;

    iput-object v1, p0, Ll/᩷۠ۛ;->ܰ:Ll/ۡۖۛ;

    .line 517
    iput-object v0, p0, Ll/᩷۠ۛ;->ܿ:Ll/ۡۖۛ;

    return-object v0

    .line 512
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final nextIndex()I
    .locals 2

    .line 555
    iget-object v0, p0, Ll/᩷۠ۛ;->ܰ:Ll/ۡۖۛ;

    iget-object v1, p0, Ll/᩷۠ۛ;->֡:Ll/ۤ۠ۛ;

    if-nez v0, :cond_0

    .line 556
    invoke-virtual {v1}, Ll/ۤ۠ۛ;->size()I

    move-result v0

    return v0

    .line 558
    :cond_0
    iget-object v0, v1, Ll/ۤ۠ۛ;->ܰ:[Ll/ۡۖۛ;

    if-nez v0, :cond_1

    .line 559
    invoke-virtual {v1}, Ll/ۤ۠ۛ;->toArray()[Ll/ۡۖۛ;

    move-result-object v0

    iput-object v0, v1, Ll/ۤ۠ۛ;->ܰ:[Ll/ۡۖۛ;

    .line 561
    :cond_1
    iget-object v0, p0, Ll/᩷۠ۛ;->ܰ:Ll/ۡۖۛ;

    iget v0, v0, Ll/ۡۖۛ;->ۙ:I

    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 2

    .line 543
    iget-object v0, p0, Ll/᩷۠ۛ;->᩶:Ll/ۡۖۛ;

    if-eqz v0, :cond_0

    .line 547
    iput-object v0, p0, Ll/᩷۠ۛ;->ܰ:Ll/ۡۖۛ;

    .line 548
    iget-object v1, v0, Ll/ۡۖۛ;->ᩴ:Ll/ۡۖۛ;

    iput-object v1, p0, Ll/᩷۠ۛ;->᩶:Ll/ۡۖۛ;

    .line 549
    iput-object v0, p0, Ll/᩷۠ۛ;->ܿ:Ll/ۡۖۛ;

    return-object v0

    .line 544
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final previousIndex()I
    .locals 2

    .line 566
    iget-object v0, p0, Ll/᩷۠ۛ;->᩶:Ll/ۡۖۛ;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 569
    :cond_0
    iget-object v0, p0, Ll/᩷۠ۛ;->֡:Ll/ۤ۠ۛ;

    iget-object v1, v0, Ll/ۤ۠ۛ;->ܰ:[Ll/ۡۖۛ;

    if-nez v1, :cond_1

    .line 570
    invoke-virtual {v0}, Ll/ۤ۠ۛ;->toArray()[Ll/ۡۖۛ;

    move-result-object v1

    iput-object v1, v0, Ll/ۤ۠ۛ;->ܰ:[Ll/ۡۖۛ;

    .line 572
    :cond_1
    iget-object v0, p0, Ll/᩷۠ۛ;->᩶:Ll/ۡۖۛ;

    iget v0, v0, Ll/ۡۖۛ;->ۙ:I

    return v0
.end method

.method public final remove()V
    .locals 2

    .line 523
    iget-object v0, p0, Ll/᩷۠ۛ;->ܿ:Ll/ۡۖۛ;

    if-eqz v0, :cond_1

    .line 524
    iget-object v1, p0, Ll/᩷۠ۛ;->ܰ:Ll/ۡۖۛ;

    if-ne v0, v1, :cond_0

    .line 525
    iget-object v1, v1, Ll/ۡۖۛ;->ۤ:Ll/ۡۖۛ;

    iput-object v1, p0, Ll/᩷۠ۛ;->ܰ:Ll/ۡۖۛ;

    goto :goto_0

    .line 527
    :cond_0
    iget-object v1, p0, Ll/᩷۠ۛ;->᩶:Ll/ۡۖۛ;

    iget-object v1, v1, Ll/ۡۖۛ;->ᩴ:Ll/ۡۖۛ;

    iput-object v1, p0, Ll/᩷۠ۛ;->᩶:Ll/ۡۖۛ;

    .line 529
    :goto_0
    iget-object v1, p0, Ll/᩷۠ۛ;->֡:Ll/ۤ۠ۛ;

    invoke-virtual {v1, v0}, Ll/ۤ۠ۛ;->᩷(Ll/ۡۖۛ;)V

    const/4 v0, 0x0

    .line 530
    iput-object v0, p0, Ll/᩷۠ۛ;->ܿ:Ll/ۡۖۛ;

    return-void

    .line 532
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 2

    .line 590
    iget-object v0, p0, Ll/᩷۠ۛ;->ܿ:Ll/ۡۖۛ;

    if-eqz v0, :cond_1

    .line 591
    check-cast p1, Ll/ۡۖۛ;

    iget-object v1, p0, Ll/᩷۠ۛ;->֡:Ll/ۤ۠ۛ;

    invoke-virtual {v1, v0, p1}, Ll/ۤ۠ۛ;->ۤ(Ll/ۡۖۛ;Ll/ۡۖۛ;)V

    .line 592
    iget-object v0, p0, Ll/᩷۠ۛ;->ܿ:Ll/ۡۖۛ;

    iget-object v1, p0, Ll/᩷۠ۛ;->᩶:Ll/ۡۖۛ;

    if-ne v0, v1, :cond_0

    .line 593
    iput-object p1, p0, Ll/᩷۠ۛ;->᩶:Ll/ۡۖۛ;

    return-void

    .line 595
    :cond_0
    iput-object p1, p0, Ll/᩷۠ۛ;->ܰ:Ll/ۡۖۛ;

    return-void

    .line 598
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method
