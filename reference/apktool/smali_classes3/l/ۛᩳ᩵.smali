.class public Ll/ۛᩳ᩵;
.super Ljava/lang/Object;
.source "S6IE"


# instance fields
.field public final ֡:Ll/ܰᩳ᩵;

.field public ܰ:I

.field public ܿ:I

.field public ᩶:I


# direct methods
.method public constructor <init>(Ll/ܰᩳ᩵;)V
    .locals 1

    const-string v0, "map"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 488
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 489
    iput-object p1, p0, Ll/ۛᩳ᩵;->֡:Ll/ܰᩳ᩵;

    const/4 v0, -0x1

    .line 492
    iput v0, p0, Ll/ۛᩳ᩵;->ܿ:I

    .line 493
    invoke-static {p1}, Ll/ܰᩳ᩵;->᩸(Ll/ܰᩳ᩵;)I

    move-result p1

    iput p1, p0, Ll/ۛᩳ᩵;->ܰ:I

    .line 496
    invoke-virtual {p0}, Ll/ۛᩳ᩵;->ᩴ()V

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 504
    iget v0, p0, Ll/ۛᩳ᩵;->᩶:I

    iget-object v1, p0, Ll/ۛᩳ᩵;->֡:Ll/ܰᩳ᩵;

    invoke-static {v1}, Ll/ܰᩳ᩵;->ۤ(Ll/ܰᩳ᩵;)I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final remove()V
    .locals 3

    .line 507
    invoke-virtual {p0}, Ll/ۛᩳ᩵;->ۙ()V

    .line 508
    iget v0, p0, Ll/ۛᩳ᩵;->ܿ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 509
    iget-object v0, p0, Ll/ۛᩳ᩵;->֡:Ll/ܰᩳ᩵;

    invoke-virtual {v0}, Ll/ܰᩳ᩵;->᩷()V

    .line 510
    iget v2, p0, Ll/ۛᩳ᩵;->ܿ:I

    invoke-static {v0, v2}, Ll/ܰᩳ᩵;->ۙ(Ll/ܰᩳ᩵;I)V

    .line 511
    iput v1, p0, Ll/ۛᩳ᩵;->ܿ:I

    .line 512
    invoke-static {v0}, Ll/ܰᩳ᩵;->᩸(Ll/ܰᩳ᩵;)I

    move-result v0

    iput v0, p0, Ll/ۛᩳ᩵;->ܰ:I

    return-void

    .line 508
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Call next() before removing element from the iterator."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۙ()V
    .locals 2

    .line 516
    iget-object v0, p0, Ll/ۛᩳ᩵;->֡:Ll/ܰᩳ᩵;

    invoke-static {v0}, Ll/ܰᩳ᩵;->᩸(Ll/ܰᩳ᩵;)I

    move-result v0

    iget v1, p0, Ll/ۛᩳ᩵;->ܰ:I

    if-ne v0, v1, :cond_0

    return-void

    .line 517
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public final ۤ()I
    .locals 1

    .line 492
    iget v0, p0, Ll/ۛᩳ᩵;->ܿ:I

    return v0
.end method

.method public final ۤ(I)V
    .locals 0

    .line 492
    iput p1, p0, Ll/ۛᩳ᩵;->ܿ:I

    return-void
.end method

.method public final ᩴ()V
    .locals 3

    .line 500
    :goto_0
    iget v0, p0, Ll/ۛᩳ᩵;->᩶:I

    iget-object v1, p0, Ll/ۛᩳ᩵;->֡:Ll/ܰᩳ᩵;

    invoke-static {v1}, Ll/ܰᩳ᩵;->ۤ(Ll/ܰᩳ᩵;)I

    move-result v2

    if-ge v0, v2, :cond_0

    invoke-static {v1}, Ll/ܰᩳ᩵;->ᩴ(Ll/ܰᩳ᩵;)[I

    move-result-object v0

    iget v1, p0, Ll/ۛᩳ᩵;->᩶:I

    aget v0, v0, v1

    if-gez v0, :cond_0

    add-int/lit8 v1, v1, 0x1

    .line 501
    iput v1, p0, Ll/ۛᩳ᩵;->᩶:I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ᩷()I
    .locals 1

    .line 491
    iget v0, p0, Ll/ۛᩳ᩵;->᩶:I

    return v0
.end method

.method public final ᩷(I)V
    .locals 0

    .line 491
    iput p1, p0, Ll/ۛᩳ᩵;->᩶:I

    return-void
.end method

.method public final ᩸()Ll/ܰᩳ᩵;
    .locals 1

    .line 489
    iget-object v0, p0, Ll/ۛᩳ᩵;->֡:Ll/ܰᩳ᩵;

    return-object v0
.end method
