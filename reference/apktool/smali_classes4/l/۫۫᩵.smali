.class public final Ll/۫۫᩵;
.super Ll/᩸ܳ᩵;
.source "O6FE"


# virtual methods
.method public final ۙ(Ll/ۧ۫᩵;)Z
    .locals 3

    .line 391
    iget-object v0, p0, Ll/᩸ܳ᩵;->ۙ:Ll/ᩳۡۗ;

    invoke-virtual {v0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/ۧ۫᩵;->ۙ(Ll/ܺ֨ۗ;)Ll/֫֨ۗ;

    move-result-object v1

    .line 392
    invoke-virtual {v0}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺ֨ۗ;

    .line 393
    invoke-virtual {p1, v2}, Ll/ۧ۫᩵;->ۙ(Ll/ܺ֨ۗ;)Ll/֫֨ۗ;

    move-result-object v2

    .line 394
    invoke-virtual {v2, v1}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method
