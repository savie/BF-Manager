.class public final Ll/۫ܳ᩵;
.super Ll/ܺ۠ۗ;
.source "IIX2"


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "FinishTypeInference"

    return-object v0
.end method

.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 3

    .line 19
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p1}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ll/۬֨ۗ;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p1}, Ll/۬֨ۗ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v1}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    :cond_1
    :goto_0
    return-void
.end method
