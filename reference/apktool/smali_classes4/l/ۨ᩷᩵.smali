.class public final Ll/ۨ᩷᩵;
.super Ljava/lang/Object;
.source "H6GW"


# direct methods
.method public static ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Z
    .locals 9

    .line 53
    invoke-virtual {p2}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v0

    .line 54
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-le v1, v3, :cond_4

    .line 55
    invoke-static {v0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v1

    new-instance v4, Ll/ܳ֫᩵;

    const/4 v5, 0x3

    invoke-direct {v4, v5}, Ll/ܳ֫᩵;-><init>(I)V

    invoke-interface {v1, v4}, Ll/᩵ܺۗ;->allMatch(Ljava/util/function/Predicate;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 56
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 57
    invoke-static {p0, p2, v2}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Z)Ljava/util/ArrayList;

    move-result-object v0

    .line 67
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Ll/ۜ֫᩵;->᩷(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩳۡۗ;

    if-eqz v4, :cond_0

    .line 68
    invoke-virtual {v4}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v5

    sget-object v6, Ll/᩺ۢۗ;->ܽۙ:Ll/᩺ۢۗ;

    if-ne v5, v6, :cond_0

    .line 69
    invoke-virtual {v4, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v4

    .line 70
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v5, v4, Ll/ۛ֨ۗ;

    if-eqz v5, :cond_0

    .line 71
    check-cast v4, Ll/ۛ֨ۗ;

    invoke-virtual {v4}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v4

    .line 72
    invoke-static {p2}, Ll/᩹֫᩵;->ۤ(Ll/᩷ۡۗ;)Ll/ᩳۡۗ;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 74
    invoke-virtual {v5}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v6

    sget-object v7, Ll/᩺ۢۗ;->ۗۙ:Ll/᩺ۢۗ;

    if-ne v6, v7, :cond_0

    .line 75
    invoke-virtual {v5}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v5

    if-ne v5, v4, :cond_0

    .line 76
    invoke-virtual {p2}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 80
    :cond_0
    new-instance v2, Ll/ۗ᩷᩵;

    const/4 v4, 0x0

    invoke-direct {v2, v4}, Ll/ۗ᩷᩵;-><init>(I)V

    invoke-static {v1, v2}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 86
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ۡۗ;

    if-nez v2, :cond_1

    move-object v2, v4

    goto :goto_0

    .line 90
    :cond_1
    invoke-virtual {v4}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v5

    invoke-static {p2, v5}, Ll/᩹֫᩵;->ۙ(Ll/᩷ۡۗ;Ljava/util/List;)Ll/᩷ۡۗ;

    move-result-object v5

    .line 91
    invoke-static {v4, p2}, Ll/᩻᩷᩵;->ۤ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 92
    invoke-static {v4, v5}, Ll/᩻᩷᩵;->ۤ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 93
    invoke-static {p0, v0}, Ll/᩻᩷᩵;->ۙ(Ll/ۖۡۗ;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v6

    .line 94
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩷ۡۗ;

    .line 95
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v8

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩷ۡۗ;

    .line 96
    invoke-static {v4, v7}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 97
    invoke-static {v6, v5}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    goto :goto_0

    :cond_2
    if-eqz v2, :cond_3

    .line 101
    invoke-virtual {v2}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object p0

    invoke-static {p2, p0}, Ll/᩹֫᩵;->ۙ(Ll/᩷ۡۗ;Ljava/util/List;)Ll/᩷ۡۗ;

    move-result-object p0

    .line 102
    invoke-static {v2, p0}, Ll/᩻᩷᩵;->ۤ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 103
    invoke-static {p1, p0}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    :cond_3
    return v3

    :cond_4
    return v2
.end method
