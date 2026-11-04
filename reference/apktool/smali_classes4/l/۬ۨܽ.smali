.class public abstract Ll/۬ۨܽ;
.super Ljava/lang/Object;
.source "1AZL"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ֡:Ll/᩷ۛܽ;

.field public ܰ:I

.field public ܿ:Ll/ۙۛܽ;

.field public ᩶:Ll/ۙۛܽ;


# direct methods
.method public constructor <init>(Ll/᩷ۛܽ;)V
    .locals 1

    .line 557
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ۨܽ;->֡:Ll/᩷ۛܽ;

    .line 553
    iget-object v0, p1, Ll/᩷ۛܽ;->ܿ:Ll/ۙۛܽ;

    iget-object v0, v0, Ll/ۙۛܽ;->۟:Ll/ۙۛܽ;

    iput-object v0, p0, Ll/۬ۨܽ;->ܿ:Ll/ۙۛܽ;

    const/4 v0, 0x0

    .line 554
    iput-object v0, p0, Ll/۬ۨܽ;->᩶:Ll/ۙۛܽ;

    .line 555
    iget p1, p1, Ll/᩷ۛܽ;->۟:I

    iput p1, p0, Ll/۬ۨܽ;->ܰ:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 562
    iget-object v0, p0, Ll/۬ۨܽ;->ܿ:Ll/ۙۛܽ;

    iget-object v1, p0, Ll/۬ۨܽ;->֡:Ll/᩷ۛܽ;

    iget-object v1, v1, Ll/᩷ۛܽ;->ܿ:Ll/ۙۛܽ;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    .line 601
    invoke-virtual {p0}, Ll/۬ۨܽ;->ۙ()Ll/ۙۛܽ;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 3

    .line 581
    iget-object v0, p0, Ll/۬ۨܽ;->᩶:Ll/ۙۛܽ;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 584
    iget-object v2, p0, Ll/۬ۨܽ;->֡:Ll/᩷ۛܽ;

    invoke-virtual {v2, v0, v1}, Ll/᩷ۛܽ;->ۙ(Ll/ۙۛܽ;Z)V

    const/4 v0, 0x0

    .line 585
    iput-object v0, p0, Ll/۬ۨܽ;->᩶:Ll/ۙۛܽ;

    .line 586
    iget v0, v2, Ll/᩷ۛܽ;->۟:I

    iput v0, p0, Ll/۬ۨܽ;->ܰ:I

    return-void

    .line 582
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final ۙ()Ll/ۙۛܽ;
    .locals 3

    .line 567
    iget-object v0, p0, Ll/۬ۨܽ;->ܿ:Ll/ۙۛܽ;

    .line 568
    iget-object v1, p0, Ll/۬ۨܽ;->֡:Ll/᩷ۛܽ;

    iget-object v2, v1, Ll/᩷ۛܽ;->ܿ:Ll/ۙۛܽ;

    if-eq v0, v2, :cond_1

    .line 571
    iget v1, v1, Ll/᩷ۛܽ;->۟:I

    iget v2, p0, Ll/۬ۨܽ;->ܰ:I

    if-ne v1, v2, :cond_0

    .line 574
    iget-object v1, v0, Ll/ۙۛܽ;->۟:Ll/ۙۛܽ;

    iput-object v1, p0, Ll/۬ۨܽ;->ܿ:Ll/ۙۛܽ;

    .line 575
    iput-object v0, p0, Ll/۬ۨܽ;->᩶:Ll/ۙۛܽ;

    return-object v0

    .line 572
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    .line 569
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
