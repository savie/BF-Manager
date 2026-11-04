.class public final Ll/۟ۜۗ;
.super Ll/ܺ۠ۗ;
.source "Q6DB"

# interfaces
.implements Ll/ܰ᩸᩵;


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 1

    .line 28
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 31
    :cond_0
    invoke-static {p1, p0}, Ll/᩺᩸᩵;->ۙ(Ll/ۖۡۗ;Ll/ܰ᩸᩵;)V

    return-void
.end method

.method public final ۙ(Ll/ۖۡۗ;Ll/᩹ۡۗ;)V
    .locals 2

    .line 36
    invoke-interface {p2}, Ll/᩹ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ᩳۡۗ;

    .line 37
    new-instance v0, Ll/ۚ֫᩵;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Ll/ۚ֫᩵;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p2, v0}, Ll/ᩳۡۗ;->ۙ(Ljava/util/function/Consumer;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۤ(Ll/ۖۡۗ;Ll/ܿۡۗ;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final ᩷(Ll/ۖۡۗ;Ll/ܿۡۗ;)V
    .locals 0

    return-void
.end method
