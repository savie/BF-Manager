.class public final Ll/۟ᩴ᩵;
.super Ll/ۛ᩸ۨ;
.source "V6HT"


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;Ll/᩹ۡۗ;)V
    .locals 6

    .line 76
    invoke-interface {p2}, Ll/᩹ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۡۗ;

    .line 77
    invoke-virtual {v0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 81
    :cond_1
    invoke-virtual {v1}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_2

    goto :goto_1

    .line 124
    :cond_2
    invoke-virtual {v1}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v4

    .line 125
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_3

    :goto_1
    const/4 v4, 0x1

    goto :goto_2

    .line 128
    :cond_3
    invoke-virtual {v1}, Ll/ܿ֨ۗ;->᩶()Z

    move-result v5

    if-eqz v5, :cond_4

    const/4 v4, 0x0

    goto :goto_2

    .line 131
    :cond_4
    new-instance v5, Ll/ۚۘۘ;

    invoke-direct {v5, p0, p1}, Ll/ۚۘۘ;-><init>(Ll/۟ᩴ᩵;Ll/ۖۡۗ;)V

    invoke-static {v4, v5}, Ll/ۜ֫᩵;->ۙ(Ljava/util/List;Ljava/util/function/Predicate;)Z

    move-result v4

    :goto_2
    if-eqz v4, :cond_0

    .line 84
    invoke-virtual {v0}, Ll/ᩳۡۗ;->ۙۙ()Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_5

    .line 108
    :cond_5
    invoke-virtual {v0}, Ll/ᩳۡۗ;->ܶۙ()Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_3

    .line 111
    :cond_6
    sget-object v4, Ll/ᩳᩴ᩵;->ۙ:[I

    invoke-virtual {v0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    if-eq v4, v3, :cond_7

    const/4 v3, 0x2

    if-eq v4, v3, :cond_7

    const/4 v3, 0x0

    goto :goto_4

    :cond_7
    :goto_3
    const/4 v3, 0x1

    :goto_4
    if-eqz v3, :cond_8

    .line 89
    sget-object v2, Ll/֫۟ۗ;->ۜۙ:Ll/֫۟ۗ;

    invoke-virtual {v0, v2}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 90
    sget-object v2, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v0, v2}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    :goto_5
    const/4 v2, 0x1

    :cond_8
    if-eqz v2, :cond_0

    const/4 v2, 0x0

    .line 94
    invoke-virtual {v0, v2}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    .line 95
    invoke-virtual {p1, v1}, Ll/ۖۡۗ;->ۙ(Ll/ܿ֨ۗ;)V

    .line 96
    invoke-virtual {v1}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ֨ۗ;

    .line 97
    invoke-virtual {v1}, Ll/ۛ֨ۗ;->ۗۙ()V

    goto :goto_6

    :cond_9
    return-void
.end method
