.class public abstract Ll/۟ܳܽ;
.super Ll/ۢܳܽ;
.source "Z4Q9"

# interfaces
.implements Ljava/util/Collection;


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 1

    .line 91
    move-object v0, p0

    check-cast v0, Ll/ܺ᩻ܽ;

    .line 115
    iget-object v0, v0, Ll/ܺ᩻ܽ;->ܰ:Ljava/util/Collection;

    .line 91
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    .line 108
    move-object v0, p0

    check-cast v0, Ll/ܺ᩻ܽ;

    .line 115
    iget-object v0, v0, Ll/ܺ᩻ܽ;->ܰ:Ljava/util/Collection;

    .line 108
    invoke-interface {v0, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final clear()V
    .locals 1

    .line 119
    move-object v0, p0

    check-cast v0, Ll/ܺ᩻ܽ;

    .line 115
    iget-object v0, v0, Ll/ܺ᩻ܽ;->ܰ:Ljava/util/Collection;

    .line 119
    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 85
    move-object v0, p0

    check-cast v0, Ll/ܺ᩻ܽ;

    .line 115
    iget-object v0, v0, Ll/ܺ᩻ܽ;->ܰ:Ljava/util/Collection;

    .line 85
    invoke-interface {v0, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 1

    .line 102
    move-object v0, p0

    check-cast v0, Ll/ܺ᩻ܽ;

    .line 115
    iget-object v0, v0, Ll/ܺ᩻ܽ;->ܰ:Ljava/util/Collection;

    .line 102
    invoke-interface {v0, p1}, Ljava/util/Collection;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 80
    move-object v0, p0

    check-cast v0, Ll/ܺ᩻ܽ;

    .line 115
    iget-object v0, v0, Ll/ܺ᩻ܽ;->ܰ:Ljava/util/Collection;

    .line 80
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 64
    move-object v0, p0

    check-cast v0, Ll/ܺ᩻ܽ;

    .line 115
    iget-object v0, v0, Ll/ܺ᩻ܽ;->ܰ:Ljava/util/Collection;

    .line 64
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    .line 97
    move-object v0, p0

    check-cast v0, Ll/ܺ᩻ܽ;

    .line 115
    iget-object v0, v0, Ll/ܺ᩻ܽ;->ܰ:Ljava/util/Collection;

    .line 97
    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 1

    .line 75
    move-object v0, p0

    check-cast v0, Ll/ܺ᩻ܽ;

    .line 115
    iget-object v0, v0, Ll/ܺ᩻ܽ;->ܰ:Ljava/util/Collection;

    .line 75
    invoke-interface {v0, p1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 1

    .line 114
    move-object v0, p0

    check-cast v0, Ll/ܺ᩻ܽ;

    .line 115
    iget-object v0, v0, Ll/ܺ᩻ܽ;->ܰ:Ljava/util/Collection;

    .line 114
    invoke-interface {v0, p1}, Ljava/util/Collection;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final size()I
    .locals 1

    .line 69
    move-object v0, p0

    check-cast v0, Ll/ܺ᩻ܽ;

    .line 115
    iget-object v0, v0, Ll/ܺ᩻ܽ;->ܰ:Ljava/util/Collection;

    .line 69
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    return v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 124
    move-object v0, p0

    check-cast v0, Ll/ܺ᩻ܽ;

    .line 115
    iget-object v0, v0, Ll/ܺ᩻ܽ;->ܰ:Ljava/util/Collection;

    .line 124
    invoke-interface {v0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1

    .line 131
    move-object v0, p0

    check-cast v0, Ll/ܺ᩻ܽ;

    .line 115
    iget-object v0, v0, Ll/ܺ᩻ܽ;->ܰ:Ljava/util/Collection;

    .line 131
    invoke-interface {v0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
