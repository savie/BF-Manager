.class public final synthetic Ll/ܳۙ᩵;
.super Ljava/lang/Object;
.source "M6E4"

# interfaces
.implements Ljava/util/function/Consumer;


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    .line 2
    check-cast p1, Ll/᩻ۡۗ;

    .line 114
    sget-object v0, Ll/ۧ۟ۗ;->ۙ:Ll/ۧ۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v1

    check-cast v1, Ll/ۘ۟ۗ;

    .line 115
    invoke-virtual {v1}, Ll/ۘ۟ۗ;->ܳ()Ll/᩻ۡۗ;

    move-result-object v1

    .line 116
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1}, Ll/᩻ۡۗ;->ۢۙ()Ll/᩻ۡۗ;

    move-result-object v3

    invoke-static {v2, v3}, Ll/ۜ֫᩵;->ۙ(Ljava/util/List;Ll/ۨᩳۗ;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1, v2}, Ll/᩻ۡۗ;->᩷(Ljava/util/List;)V

    .line 117
    invoke-virtual {v1}, Ll/᩻ۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, p1}, Ll/ۜ֫᩵;->ۙ(Ljava/util/List;Ll/ۨᩳۗ;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/᩻ۡۗ;->ۤ(Ljava/util/List;)V

    .line 119
    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->ۤ(Ll/֫᩶ۗ;)V

    .line 120
    sget-object v0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->ۤ(Ll/֫۟ۗ;)V

    .line 121
    invoke-virtual {p1}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖۡۗ;

    .line 122
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܳ᩷()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 123
    sget-object v2, Ll/֫۟ۗ;->۟:Ll/֫۟ۗ;

    invoke-virtual {v1, v2}, Ll/ܺ۟ۗ;->ۤ(Ll/֫۟ۗ;)V

    goto :goto_0

    :cond_1
    const-string v0, "Anonymous mark cleared"

    .line 126
    invoke-virtual {p1, v0}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
