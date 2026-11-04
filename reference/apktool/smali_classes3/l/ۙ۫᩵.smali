.class public final synthetic Ll/ۙ۫᩵;
.super Ljava/lang/Object;
.source "HIXW"

# interfaces
.implements Ljava/util/function/Consumer;


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    .line 2
    check-cast p1, Ll/ܿ֨ۗ;

    .line 176
    invoke-virtual {p1}, Ll/ܿ֨ۗ;->ۨ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۢۗ;

    .line 177
    invoke-virtual {p1}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩸۫᩵;->ۙ()Ljava/util/LinkedHashSet;

    move-result-object v2

    .line 178
    invoke-virtual {v1}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩸۫᩵;->ۙ()Ljava/util/LinkedHashSet;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 179
    invoke-virtual {v1}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܺ֨ۗ;

    .line 180
    check-cast v3, Ll/ۛ֨ۗ;

    invoke-virtual {v3}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩸۫᩵;->ۙ()Ljava/util/LinkedHashSet;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
