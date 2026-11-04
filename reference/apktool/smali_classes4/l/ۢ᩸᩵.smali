.class public final Ll/ۢ᩸᩵;
.super Ll/ۛ᩸ۨ;
.source "C6I0"


# direct methods
.method public static ۙ(Ljava/util/List;Ll/ۖۡۗ;Ll/ܿۡۗ;)Z
    .locals 4

    .line 53
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫۠ۗ;

    .line 54
    invoke-virtual {v1}, Ll/۫۠ۗ;->ܽ()Ll/᩷ۡۗ;

    move-result-object v2

    .line 55
    invoke-interface {p2}, Ll/ܿۡۗ;->ܿ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 56
    invoke-static {p2, v1, v2}, Ll/ۢ᩸᩵;->ۙ(Ll/ܿۡۗ;Ll/۫۠ۗ;Ll/᩷ۡۗ;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t wrap try/catch for region: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۨᩳۗ;->ۤ(Ljava/lang/String;)V

    .line 59
    :cond_1
    invoke-interface {p0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 37
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static ۙ(Ll/ܿۡۗ;Ll/۫۠ۗ;Ll/᩷ۡۗ;)Z
    .locals 9

    const/4 v0, 0x0

    if-nez p0, :cond_0

    goto/16 :goto_3

    .line 73
    :cond_0
    instance-of v1, p0, Ll/ۜۖۗ;

    if-eqz v1, :cond_1

    .line 74
    check-cast p0, Ll/ۜۖۗ;

    .line 75
    invoke-virtual {p0}, Ll/ۜۖۗ;->᩷ۙ()Ll/ܿۡۗ;

    move-result-object p0

    invoke-static {p0, p1, p2}, Ll/ۢ᩸᩵;->ۙ(Ll/ܿۡۗ;Ll/۫۠ۗ;Ll/᩷ۡۗ;)Z

    move-result p0

    return p0

    .line 77
    :cond_1
    instance-of v1, p0, Ll/ۗۡۗ;

    if-eqz v1, :cond_2

    .line 78
    invoke-interface {p0}, Ll/ܿۡۗ;->getParent()Ll/ܿۡۗ;

    move-result-object p0

    invoke-static {p0, p1, p2}, Ll/ۢ᩸᩵;->ۙ(Ll/ܿۡۗ;Ll/۫۠ۗ;Ll/᩷ۡۗ;)Z

    move-result p0

    return p0

    .line 81
    :cond_2
    new-instance v1, Ll/ۨۖۗ;

    invoke-direct {v1, p0}, Ll/ۨۖۗ;-><init>(Ll/ܿۡۗ;)V

    .line 82
    invoke-interface {p0}, Ll/ܿۡۗ;->ܿ()Ljava/util/List;

    move-result-object v2

    .line 86
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۛۡۗ;

    .line 87
    invoke-static {p2, v4}, Ll/᩵ۧ᩵;->ۙ(Ll/᩷ۡۗ;Ll/ۛۡۗ;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 121
    invoke-virtual {p1}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ᩴ۠ۗ;

    .line 122
    invoke-virtual {v7}, Ll/ᩴ۠ۗ;->ܳ()Ll/᩷ۡۗ;

    move-result-object v7

    if-eqz v7, :cond_4

    .line 123
    sget-object v8, Ll/֫۟ۗ;->ۜۙ:Ll/֫۟ۗ;

    .line 124
    invoke-virtual {v7, v8}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v8

    if-nez v8, :cond_4

    .line 608
    invoke-static {v4}, Ll/᩵ۧ᩵;->ۙ(Ll/ۛۡۗ;)Ll/᩷ۡۗ;

    move-result-object v8

    if-eqz v8, :cond_5

    .line 610
    invoke-static {v7, v8}, Ll/᩹֫᩵;->ܳ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Z

    move-result v7

    goto :goto_1

    :cond_5
    const/4 v7, 0x0

    :goto_1
    if-eqz v7, :cond_4

    goto :goto_2

    :cond_6
    const/4 v5, 0x0

    :goto_2
    if-eqz v5, :cond_7

    goto :goto_0

    .line 92
    :cond_7
    invoke-virtual {v1, v4}, Ll/ۨۖۗ;->ۙ(Ll/ۛۡۗ;)V

    goto :goto_0

    .line 95
    :cond_8
    invoke-virtual {v1}, Ll/ۨۖۗ;->ܿ()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_9

    goto :goto_3

    .line 99
    :cond_9
    new-instance p2, Ll/ܿۖۗ;

    invoke-direct {p2, p0, v1}, Ll/ܿۖۗ;-><init>(Ll/ܿۡۗ;Ll/ۨۖۗ;)V

    .line 100
    invoke-virtual {v1, p2}, Ll/᩵ۖۗ;->ۙ(Ll/᩵ۖۗ;)V

    .line 101
    invoke-virtual {p2, p1}, Ll/ܿۖۗ;->ۙ(Ll/۫۠ۗ;)V

    .line 104
    invoke-virtual {v1}, Ll/ۨۖۗ;->ܿ()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛۡۗ;

    .line 105
    invoke-interface {p0, p1, p2}, Ll/ܿۡۗ;->ۙ(Ll/ۛۡۗ;Ll/ۛۡۗ;)Z

    move-result p0

    if-nez p0, :cond_a

    :goto_3
    return v0

    .line 108
    :cond_a
    invoke-virtual {v1}, Ll/ۨۖۗ;->ܿ()Ljava/util/List;

    move-result-object p0

    invoke-interface {v2, p0}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 111
    invoke-virtual {v1}, Ll/ۨۖۗ;->ܿ()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_b
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛۡۗ;

    .line 112
    instance-of p2, p1, Ll/᩵ۖۗ;

    if-eqz p2, :cond_b

    .line 113
    check-cast p1, Ll/᩵ۖۗ;

    .line 114
    invoke-virtual {p1, v1}, Ll/᩵ۖۗ;->ۙ(Ll/᩵ۖۗ;)V

    goto :goto_4

    :cond_c
    return v5
.end method
