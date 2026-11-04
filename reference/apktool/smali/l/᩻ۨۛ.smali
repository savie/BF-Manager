.class public final Ll/᩻ۨۛ;
.super Ljava/lang/Object;
.source "IBNX"


# direct methods
.method public static ۙ(Ll/ۜ۫ۛ;)Z
    .locals 8

    const/4 v0, 0x1

    if-nez p0, :cond_0

    goto :goto_5

    .line 34
    :cond_0
    invoke-interface {p0}, Ll/ۜ۫ۛ;->ۚ()I

    move-result v1

    invoke-interface {p0}, Ll/ۜ۫ۛ;->ۙ()Ljava/lang/Iterable;

    move-result-object p0

    .line 39
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹ۚۛ;

    .line 40
    invoke-interface {v4}, Ll/᩹ۚۛ;->ۤ()Ll/᩸ۜۨ;

    move-result-object v5

    iget v5, v5, Ll/᩸ۜۨ;->ᩳ:I

    const/4 v6, 0x3

    if-ne v5, v6, :cond_1

    .line 41
    move-object v5, v4

    check-cast v5, Ll/ۛۚۛ;

    .line 42
    invoke-interface {v5}, Ll/ۛۚۛ;->getReference()Ll/ۤۧۛ;

    move-result-object v5

    check-cast v5, Ll/ۙۧۛ;

    .line 43
    invoke-interface {v4}, Ll/᩹ۚۛ;->ۤ()Ll/᩸ۜۨ;

    move-result-object v6

    .line 47
    sget-object v7, Ll/᩸ۜۨ;->᩵᩸:Ll/᩸ۜۨ;

    if-eq v6, v7, :cond_5

    sget-object v7, Ll/᩸ۜۨ;->ۨ᩸:Ll/᩸ۜۨ;

    if-ne v6, v7, :cond_2

    goto :goto_3

    .line 43
    :cond_2
    sget-object v4, Ll/᩸ۜۨ;->ۛ᩸:Ll/᩸ۜۨ;

    if-eq v6, v4, :cond_4

    sget-object v4, Ll/᩸ۜۨ;->᩺᩸:Ll/᩸ۜۨ;

    if-ne v6, v4, :cond_3

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v4, 0x1

    .line 48
    :goto_2
    sget-object v6, Ll/ۘܶۛ;->ۙ:Ll/ۛۙܽ;

    .line 90
    invoke-interface {v5}, Ll/ۙۧۛ;->ܶ()Ljava/util/List;

    move-result-object v5

    invoke-static {v5, v4}, Ll/ۘܶۛ;->ۙ(Ljava/util/List;Z)I

    move-result v4

    goto :goto_4

    .line 46
    :cond_5
    :goto_3
    check-cast v4, Ll/֡ۚۛ;

    invoke-interface {v4}, Ll/֡ۚۛ;->ۚ()I

    move-result v4

    :goto_4
    if-le v4, v3, :cond_1

    move v3, v4

    goto :goto_0

    :cond_6
    const/4 p0, 0x5

    if-le v3, p0, :cond_8

    if-gt v3, v1, :cond_7

    goto :goto_5

    :cond_7
    return v2

    :cond_8
    :goto_5
    return v0
.end method
