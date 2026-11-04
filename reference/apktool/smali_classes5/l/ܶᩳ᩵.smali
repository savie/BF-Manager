.class public abstract Ll/ܶᩳ᩵;
.super Ll/ۘ۟᩵;
.source "S6IE"


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 667
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 668
    invoke-virtual {p0, p1}, Ll/ܶᩳ᩵;->ۙ(Ljava/util/Map$Entry;)Z

    move-result p1

    return p1
.end method

.method public final bridge remove(Ljava/lang/Object;)Z
    .locals 1

    .line 667
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, Ll/ܶᩳ᩵;->᩷(Ljava/util/Map$Entry;)Z

    move-result p1

    return p1
.end method

.method public abstract ۙ(Ljava/util/Map$Entry;)Z
.end method

.method public bridge abstract ᩷(Ljava/util/Map$Entry;)Z
.end method
