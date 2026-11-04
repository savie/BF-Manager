.class public final Ll/۟֨ۗ;
.super Ljava/lang/Object;
.source "BIX0"


# direct methods
.method public static ۙ(Ll/ۖۡۗ;Ll/ۜ᩶ۗ;ZLjava/util/List;)Ll/ۘۢۗ;
    .locals 12

    const/4 v0, 0x4

    .line 55
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ᩶ۗ;

    invoke-virtual {v0}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠ܰۗ;

    .line 56
    invoke-interface {v0}, Ll/۠ܰۗ;->getType()Ll/᩷᩶ۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩷᩶ۗ;->ۙ()Z

    move-result v1

    if-nez v1, :cond_a

    .line 70
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v1

    const/4 v2, 0x2

    .line 71
    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ᩶ۗ;

    invoke-virtual {v2}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜܰۗ;

    .line 72
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v3

    const-string v4, ""

    invoke-static {v1, v3, v4, v2}, Ll/᩷ۢۗ;->ۙ(Ll/֫ۖۗ;Ll/֨ᩳۗ;Ljava/lang/String;Ll/ۜܰۗ;)Ll/᩷ۢۗ;

    move-result-object v2

    .line 74
    invoke-interface {v0}, Ll/۠ܰۗ;->getType()Ll/᩷᩶ۗ;

    move-result-object v3

    .line 75
    new-instance v4, Ll/ۘۢۗ;

    const/4 v9, 0x0

    .line 20
    sget-object v8, Ll/֡ۢۗ;->᩶:Ll/֡ۢۗ;

    move-object v5, v4

    move-object v6, v2

    move-object v7, p1

    move v10, p2

    invoke-direct/range {v5 .. v10}, Ll/᩶ۢۗ;-><init>(Ll/᩷ۢۗ;Ll/ۜ᩶ۗ;Ll/֡ۢۗ;ZZ)V

    .line 76
    invoke-virtual {v4, v3}, Ll/ۘۢۗ;->ۙ(Ll/᩷᩶ۗ;)V

    .line 78
    invoke-virtual {v2}, Ll/᩷ۢۗ;->ۤ()Ll/֫֨ۗ;

    move-result-object p1

    invoke-static {v1, p1}, Ll/֨ᩳۗ;->ۙ(Ll/֫ۖۗ;Ll/֫֨ۗ;)Ll/֨ᩳۗ;

    move-result-object p1

    const/4 p2, 0x1

    .line 79
    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ᩶ۗ;

    invoke-virtual {v2}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v5, 0x3

    .line 80
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܳ᩶ۗ;

    invoke-virtual {v5}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۜܰۗ;

    .line 81
    invoke-static {v1, p1, v2, v5}, Ll/᩷ۢۗ;->ۙ(Ll/֫ۖۗ;Ll/֨ᩳۗ;Ljava/lang/String;Ll/ۜܰۗ;)Ll/᩷ۢۗ;

    move-result-object p1

    .line 82
    invoke-virtual {v4, p1}, Ll/ۘۢۗ;->ۙ(Ll/᩷ۢۗ;)V

    .line 84
    invoke-interface {v0}, Ll/۠ܰۗ;->ۤ()Ll/۬ܰۗ;

    move-result-object p1

    invoke-static {v1, p1}, Ll/᩷ۢۗ;->ۙ(Ll/֫ۖۗ;Ll/۬ܰۗ;)Ll/᩷ۢۗ;

    move-result-object p1

    .line 121
    invoke-static {v3}, Ll/ۡ֨ۗ;->ۙ(Ll/᩷᩶ۗ;)Ll/֡ۢۗ;

    move-result-object v0

    .line 122
    invoke-virtual {p1}, Ll/᩷ۢۗ;->᩸()I

    move-result v2

    .line 123
    sget-object v5, Ll/֡ۢۗ;->ۢ:Ll/֡ۢۗ;

    const/4 v6, 0x0

    if-eq v0, v5, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    add-int/lit8 v2, v2, 0x1

    .line 127
    :cond_1
    new-instance v5, Ll/᩶ۢۗ;

    invoke-direct {v5, p1, v0, v2}, Ll/᩶ۢۗ;-><init>(Ll/᩷ۢۗ;Ll/֡ۢۗ;I)V

    .line 130
    invoke-virtual {v4}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v0

    :goto_1
    if-ge v6, v0, :cond_2

    .line 132
    invoke-virtual {v4, v6}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v7

    .line 133
    invoke-virtual {v7}, Ll/ܺ֨ۗ;->۠()Ll/ܺ֨ۗ;

    move-result-object v7

    invoke-virtual {v5, v7}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    if-le v2, v0, :cond_5

    if-eqz p2, :cond_3

    add-int/lit8 p2, v0, -0x1

    goto :goto_2

    :cond_3
    move p2, v0

    .line 141
    :goto_2
    invoke-virtual {p1}, Ll/᩷ۢۗ;->ᩴ()Ljava/util/List;

    move-result-object v6

    :goto_3
    if-ge v0, v2, :cond_5

    if-gez p2, :cond_4

    .line 146
    invoke-virtual {p1}, Ll/᩷ۢۗ;->۫()Ll/֨ᩳۗ;

    move-result-object v7

    invoke-virtual {v7}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object v7

    goto :goto_4

    :cond_4
    add-int/lit8 v7, p2, 0x1

    .line 148
    invoke-interface {v6, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/֫֨ۗ;

    move v11, v7

    move-object v7, p2

    move p2, v11

    .line 150
    :goto_4
    new-instance v8, Ll/᩵֨ۗ;

    const-string v9, "v"

    .line 0
    invoke-static {v0, v9}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 150
    invoke-direct {v8, v7, v9}, Ll/᩵֨ۗ;-><init>(Ll/֫֨ۗ;Ljava/lang/String;)V

    invoke-virtual {v5, v8}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 87
    :cond_5
    sget-object p2, Ll/᩷᩶ۗ;->֡:Ll/᩷᩶ۗ;

    if-ne v3, p2, :cond_6

    .line 88
    new-instance p2, Ll/ۜ֨ۗ;

    .line 34
    invoke-virtual {v5}, Ll/᩶ۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v0

    invoke-direct {p2, p0, v5, v0}, Ll/ۜ֨ۗ;-><init>(Ll/ۖۡۗ;Ll/᩶ۢۗ;Ll/᩷ۢۗ;)V

    .line 89
    invoke-virtual {v4, p2}, Ll/ۘۢۗ;->ۙ(Ll/ܳۢۗ;)V

    goto :goto_5

    .line 91
    :cond_6
    invoke-virtual {v4, v5}, Ll/ۘۢۗ;->ۙ(Ll/ܳۢۗ;)V

    .line 94
    :goto_5
    invoke-virtual {v1, p1}, Ll/֫ۖۗ;->ۙ(Ll/᩷ۢۗ;)Ll/ۖۡۗ;

    move-result-object p2

    if-eqz p2, :cond_7

    .line 96
    invoke-virtual {v4}, Ll/ۘۢۗ;->ܿۙ()Ll/ᩳۡۗ;

    move-result-object v0

    invoke-virtual {v0, p2}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 97
    invoke-virtual {p2}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢᩳۗ;->ۗ()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 98
    invoke-virtual {p2}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v0

    invoke-virtual {p0}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/᩻ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_7

    .line 100
    sget-object p0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {p2, p0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 101
    invoke-virtual {v4}, Ll/ۘۢۗ;->ۡۙ()V

    .line 104
    :cond_7
    invoke-virtual {v4}, Ll/ۘۢۗ;->ۢۙ()Z

    move-result p0

    if-nez p0, :cond_8

    const/4 p0, 0x5

    .line 105
    invoke-interface {p3, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܳ᩶ۗ;

    invoke-virtual {p0}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۜܰۗ;

    .line 106
    invoke-interface {p0}, Ll/ۜܰۗ;->ᩴ()Ljava/util/List;

    move-result-object p0

    new-instance p2, Ll/ۗۨᩴ;

    const/4 p3, 0x5

    invoke-direct {p2, p3}, Ll/ۗۨᩴ;-><init>(I)V

    invoke-static {p0, p2}, Ll/ۘۧ᩵;->ۙ(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    move-result-object p0

    .line 107
    invoke-virtual {p1}, Ll/᩷ۢۗ;->ᩴ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p0

    .line 108
    invoke-virtual {v4, p0}, Ll/ۘۢۗ;->ۙ(Z)V

    .line 112
    :cond_8
    invoke-virtual {v4}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܺ֨ۗ;

    .line 113
    sget-object p2, Ll/֫۟ۗ;->ۤۙ:Ll/֫۟ۗ;

    invoke-virtual {p1, p2}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    goto :goto_6

    :cond_9
    return-object v4

    .line 57
    :cond_a
    new-instance p0, Ll/۠ۧ᩵;

    const-string p1, "Not yet supported"

    .line 11
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 57
    throw p0
.end method

.method public static ۙ(Ljava/util/List;)Z
    .locals 3

    .line 35
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x6

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 38
    :cond_0
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܳ᩶ۗ;

    .line 39
    invoke-virtual {p0}, Ll/ܳ᩶ۗ;->ۙ()Ll/᩸᩶ۗ;

    move-result-object v0

    sget-object v1, Ll/᩸᩶ۗ;->ۙۙ:Ll/᩸᩶ۗ;

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {p0}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/۠ܰۗ;

    .line 43
    invoke-interface {p0}, Ll/۠ܰۗ;->getType()Ll/᩷᩶ۗ;

    move-result-object v0

    sget-object v1, Ll/᩷᩶ۗ;->֨:Ll/᩷᩶ۗ;

    if-eq v0, v1, :cond_2

    goto :goto_0

    .line 46
    :cond_2
    invoke-interface {p0}, Ll/۠ܰۗ;->ۤ()Ll/۬ܰۗ;

    move-result-object p0

    .line 47
    invoke-interface {p0}, Ll/۬ܰۗ;->᩸()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Ljava/lang/invoke/LambdaMetafactory;"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    .line 50
    :cond_3
    invoke-interface {p0}, Ll/۬ܰۗ;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "metafactory"

    .line 51
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "altMetafactory"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    return v2

    :cond_5
    :goto_1
    const/4 p0, 0x1

    return p0
.end method
