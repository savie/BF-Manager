.class public final Ll/ܿᩳ᩵;
.super Ll/ۘ۟᩵;
.source "S6IE"


# instance fields
.field public final ܰ:Ll/ܰᩳ᩵;


# direct methods
.method public constructor <init>(Ll/ܰᩳ᩵;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 619
    iput-object p1, p0, Ll/ܿᩳ᩵;->ܰ:Ll/ܰᩳ᩵;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 0

    .line 626
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 627
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final clear()V
    .locals 1

    .line 625
    iget-object v0, p0, Ll/ܿᩳ᩵;->ܰ:Ll/ܰᩳ᩵;

    invoke-virtual {v0}, Ll/ܰᩳ᩵;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 624
    iget-object v0, p0, Ll/ܿᩳ᩵;->ܰ:Ll/ܰᩳ᩵;

    invoke-virtual {v0, p1}, Ll/ܰᩳ᩵;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 623
    iget-object v0, p0, Ll/ܿᩳ᩵;->ܰ:Ll/ܰᩳ᩵;

    invoke-virtual {v0}, Ll/ܰᩳ᩵;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 629
    iget-object v0, p0, Ll/ܿᩳ᩵;->ܰ:Ll/ܰᩳ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    new-instance v1, Ll/᩺ᩳ᩵;

    .line 521
    invoke-direct {v1, v0}, Ll/ۛᩳ᩵;-><init>(Ll/ܰᩳ᩵;)V

    return-object v1
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    .line 628
    iget-object v0, p0, Ll/ܿᩳ᩵;->ܰ:Ll/ܰᩳ᩵;

    invoke-virtual {v0, p1}, Ll/ܰᩳ᩵;->᩷(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 632
    iget-object v0, p0, Ll/ܿᩳ᩵;->ܰ:Ll/ܰᩳ᩵;

    invoke-virtual {v0}, Ll/ܰᩳ᩵;->᩷()V

    .line 633
    invoke-super {p0, p1}, Ljava/util/AbstractSet;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 637
    iget-object v0, p0, Ll/ܿᩳ᩵;->ܰ:Ll/ܰᩳ᩵;

    invoke-virtual {v0}, Ll/ܰᩳ᩵;->᩷()V

    .line 638
    invoke-super {p0, p1}, Ljava/util/AbstractSet;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final ᩷()I
    .locals 1

    .line 622
    iget-object v0, p0, Ll/ܿᩳ᩵;->ܰ:Ll/ܰᩳ᩵;

    invoke-virtual {v0}, Ll/ܰᩳ᩵;->size()I

    move-result v0

    return v0
.end method
