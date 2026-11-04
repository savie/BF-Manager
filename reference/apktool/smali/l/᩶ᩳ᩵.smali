.class public final Ll/᩶ᩳ᩵;
.super Ll/ܶᩳ᩵;
.source "S6IE"


# instance fields
.field public final ܰ:Ll/ܰᩳ᩵;


# direct methods
.method public constructor <init>(Ll/ܰᩳ᩵;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 673
    iput-object p1, p0, Ll/᩶ᩳ᩵;->ܰ:Ll/ܰᩳ᩵;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 1

    .line 672
    check-cast p1, Ljava/util/Map$Entry;

    const-string v0, "element"

    .line 0
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 680
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 681
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final clear()V
    .locals 1

    .line 679
    iget-object v0, p0, Ll/᩶ᩳ᩵;->ܰ:Ll/ܰᩳ᩵;

    invoke-virtual {v0}, Ll/ܰᩳ᩵;->clear()V

    return-void
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 684
    iget-object v0, p0, Ll/᩶ᩳ᩵;->ܰ:Ll/ܰᩳ᩵;

    invoke-virtual {v0, p1}, Ll/ܰᩳ᩵;->ۙ(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 677
    iget-object v0, p0, Ll/᩶ᩳ᩵;->ܰ:Ll/ܰᩳ᩵;

    invoke-virtual {v0}, Ll/ܰᩳ᩵;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 683
    iget-object v0, p0, Ll/᩶ᩳ᩵;->ܰ:Ll/ܰᩳ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    new-instance v1, Ll/᩵ᩳ᩵;

    .line 544
    invoke-direct {v1, v0}, Ll/ۛᩳ᩵;-><init>(Ll/ܰᩳ᩵;)V

    return-object v1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 687
    iget-object v0, p0, Ll/᩶ᩳ᩵;->ܰ:Ll/ܰᩳ᩵;

    invoke-virtual {v0}, Ll/ܰᩳ᩵;->᩷()V

    .line 688
    invoke-super {p0, p1}, Ljava/util/AbstractSet;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 692
    iget-object v0, p0, Ll/᩶ᩳ᩵;->ܰ:Ll/ܰᩳ᩵;

    invoke-virtual {v0}, Ll/ܰᩳ᩵;->᩷()V

    .line 693
    invoke-super {p0, p1}, Ljava/util/AbstractSet;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final ۙ(Ljava/util/Map$Entry;)Z
    .locals 1

    const-string v0, "element"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 678
    iget-object v0, p0, Ll/᩶ᩳ᩵;->ܰ:Ll/ܰᩳ᩵;

    invoke-virtual {v0, p1}, Ll/ܰᩳ᩵;->ۙ(Ljava/util/Map$Entry;)Z

    move-result p1

    return p1
.end method

.method public final ᩷()I
    .locals 1

    .line 676
    iget-object v0, p0, Ll/᩶ᩳ᩵;->ܰ:Ll/ܰᩳ᩵;

    invoke-virtual {v0}, Ll/ܰᩳ᩵;->size()I

    move-result v0

    return v0
.end method

.method public final ᩷(Ljava/util/Map$Entry;)Z
    .locals 1

    const-string v0, "element"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 682
    iget-object v0, p0, Ll/᩶ᩳ᩵;->ܰ:Ll/ܰᩳ᩵;

    invoke-virtual {v0, p1}, Ll/ܰᩳ᩵;->᩷(Ljava/util/Map$Entry;)Z

    move-result p1

    return p1
.end method
