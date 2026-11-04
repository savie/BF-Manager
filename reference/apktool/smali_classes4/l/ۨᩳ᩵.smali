.class public final Ll/ۨᩳ᩵;
.super Ljava/lang/Object;
.source "S6IE"

# interfaces
.implements Ljava/util/Map$Entry;


# instance fields
.field public final ܰ:I

.field public final ܿ:Ll/ܰᩳ᩵;

.field public final ᩶:I


# direct methods
.method public constructor <init>(Ll/ܰᩳ᩵;I)V
    .locals 1

    const-string v0, "map"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 575
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 576
    iput-object p1, p0, Ll/ۨᩳ᩵;->ܿ:Ll/ܰᩳ᩵;

    .line 577
    iput p2, p0, Ll/ۨᩳ᩵;->᩶:I

    .line 579
    invoke-static {p1}, Ll/ܰᩳ᩵;->᩸(Ll/ܰᩳ᩵;)I

    move-result p1

    iput p1, p0, Ll/ۨᩳ᩵;->ܰ:I

    return-void
.end method

.method private final ᩷()V
    .locals 2

    .line 612
    iget-object v0, p0, Ll/ۨᩳ᩵;->ܿ:Ll/ܰᩳ᩵;

    invoke-static {v0}, Ll/ܰᩳ᩵;->᩸(Ll/ܰᩳ᩵;)I

    move-result v0

    iget v1, p0, Ll/ۨᩳ᩵;->ܰ:I

    if-ne v0, v1, :cond_0

    return-void

    .line 613
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    const-string v1, "The backing map has been modified after this entry was obtained."

    invoke-direct {v0, v1}, Ljava/util/ConcurrentModificationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 603
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    .line 604
    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Ll/ۨᩳ᩵;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 605
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0}, Ll/ۨᩳ᩵;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getKey()Ljava/lang/Object;
    .locals 2

    .line 583
    invoke-direct {p0}, Ll/ۨᩳ᩵;->᩷()V

    .line 584
    iget-object v0, p0, Ll/ۨᩳ᩵;->ܿ:Ll/ܰᩳ᩵;

    invoke-static {v0}, Ll/ܰᩳ᩵;->᩷(Ll/ܰᩳ᩵;)[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ll/ۨᩳ᩵;->᩶:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 2

    .line 589
    invoke-direct {p0}, Ll/ۨᩳ᩵;->᩷()V

    .line 590
    iget-object v0, p0, Ll/ۨᩳ᩵;->ܿ:Ll/ܰᩳ᩵;

    invoke-static {v0}, Ll/ܰᩳ᩵;->ܳ(Ll/ܰᩳ᩵;)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    iget v1, p0, Ll/ۨᩳ᩵;->᩶:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    .line 607
    invoke-virtual {p0}, Ll/ۨᩳ᩵;->getKey()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Ll/ۨᩳ᩵;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_1
    xor-int/2addr v0, v1

    return v0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 594
    invoke-direct {p0}, Ll/ۨᩳ᩵;->᩷()V

    .line 595
    iget-object v0, p0, Ll/ۨᩳ᩵;->ܿ:Ll/ܰᩳ᩵;

    invoke-virtual {v0}, Ll/ܰᩳ᩵;->᩷()V

    .line 596
    invoke-static {v0}, Ll/ܰᩳ᩵;->ۙ(Ll/ܰᩳ᩵;)[Ljava/lang/Object;

    move-result-object v0

    .line 597
    iget v1, p0, Ll/ۨᩳ᩵;->᩶:I

    aget-object v2, v0, v1

    .line 598
    aput-object p1, v0, v1

    return-object v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 609
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ۨᩳ᩵;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۨᩳ᩵;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
