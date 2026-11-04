.class public final Ll/ܺ᩷᩵;
.super Ljava/lang/Object;
.source "7IUA"


# direct methods
.method public static ۙ([Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Ljava/util/BitSet;
    .locals 3

    .line 112
    new-instance v0, Ljava/util/BitSet;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    .line 115
    :goto_0
    invoke-virtual {p1}, Ll/᩷ۡۗ;->getId()I

    move-result v1

    .line 116
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v0

    .line 119
    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 120
    invoke-virtual {p1}, Ll/᩷ۡۗ;->᩷ۙ()Ljava/util/BitSet;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 123
    invoke-virtual {v0, p1}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    return-object v0

    .line 126
    :cond_1
    aget-object p1, p0, v1

    goto :goto_0
.end method

.method public static ۙ(Ll/ۖۡۗ;)V
    .locals 8

    .line 132
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object p0

    .line 133
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    const/4 v2, 0x0

    .line 134
    invoke-virtual {v1, v2}, Ll/᩷ۡۗ;->ۙ(Ljava/util/BitSet;)V

    goto :goto_0

    .line 136
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    .line 137
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 138
    invoke-virtual {v2}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v3

    .line 139
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x2

    if-lt v4, v5, :cond_1

    .line 140
    invoke-virtual {v2}, Ll/᩷ۡۗ;->ۤۙ()Ll/᩷ۡۗ;

    move-result-object v4

    .line 141
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩷ۡۗ;

    :goto_1
    if-eq v5, v4, :cond_2

    .line 159
    invoke-virtual {v5}, Ll/᩷ۡۗ;->ۜ()Ljava/util/BitSet;

    move-result-object v6

    if-nez v6, :cond_3

    .line 161
    new-instance v6, Ljava/util/BitSet;

    invoke-direct {v6, v0}, Ljava/util/BitSet;-><init>(I)V

    .line 162
    invoke-virtual {v5, v6}, Ll/᩷ۡۗ;->ۙ(Ljava/util/BitSet;)V

    .line 164
    :cond_3
    invoke-virtual {v2}, Ll/᩷ۡۗ;->getId()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/util/BitSet;->set(I)V

    .line 145
    invoke-virtual {v5}, Ll/᩷ۡۗ;->ۤۙ()Ll/᩷ۡۗ;

    move-result-object v5

    goto :goto_1

    .line 150
    :cond_4
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_5
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۡۗ;

    .line 151
    invoke-virtual {v0}, Ll/᩷ۡۗ;->ۜ()Ljava/util/BitSet;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 152
    invoke-virtual {v1}, Ljava/util/BitSet;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 153
    :cond_6
    sget-object v1, Ll/᩵֫᩵;->ܰ:Ll/᩵֫᩵;

    invoke-virtual {v0, v1}, Ll/᩷ۡۗ;->ۙ(Ljava/util/BitSet;)V

    goto :goto_2

    :cond_7
    return-void
.end method

.method public static ۙ(Ljava/util/ArrayList;Ljava/util/function/Function;)[Ll/᩷ۡۗ;
    .locals 10

    .line 41
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 42
    new-array v1, v0, [Ll/᩷ۡۗ;

    const/4 v2, 0x0

    .line 43
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ۡۗ;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    :cond_0
    if-eqz v2, :cond_b

    const/4 v2, 0x0

    const/4 v3, 0x1

    :goto_0
    if-ge v3, v0, :cond_0

    .line 48
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ۡۗ;

    .line 49
    invoke-interface {p1, v4}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 52
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩷ۡۗ;

    .line 53
    invoke-virtual {v7}, Ll/᩷ۡۗ;->getId()I

    move-result v8

    .line 54
    aget-object v9, v1, v8

    if-eqz v9, :cond_1

    goto :goto_1

    :cond_2
    const/4 v8, -0x1

    const/4 v7, 0x0

    :goto_1
    if-eqz v7, :cond_a

    .line 63
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩷ۡۗ;

    .line 64
    invoke-virtual {v5}, Ll/᩷ۡۗ;->getId()I

    move-result v6

    if-ne v6, v8, :cond_4

    goto :goto_2

    .line 68
    :cond_4
    aget-object v6, v1, v6

    if-eqz v6, :cond_3

    .line 82
    invoke-virtual {v5}, Ll/᩷ۡۗ;->getId()I

    move-result v5

    .line 83
    invoke-virtual {v7}, Ll/᩷ۡۗ;->getId()I

    move-result v6

    :cond_5
    if-eq v5, v6, :cond_7

    :goto_3
    if-le v5, v6, :cond_6

    .line 86
    aget-object v5, v1, v5

    invoke-virtual {v5}, Ll/᩷ۡۗ;->getId()I

    move-result v5

    goto :goto_3

    :cond_6
    :goto_4
    if-le v6, v5, :cond_5

    .line 89
    aget-object v6, v1, v6

    invoke-virtual {v6}, Ll/᩷ۡۗ;->getId()I

    move-result v6

    goto :goto_4

    .line 92
    :cond_7
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Ll/᩷ۡۗ;

    goto :goto_2

    .line 72
    :cond_8
    aget-object v4, v1, v3

    if-eq v4, v7, :cond_9

    .line 73
    aput-object v7, v1, v3

    const/4 v2, 0x1

    :cond_9
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 61
    :cond_a
    new-instance p0, Ll/۠ۧ᩵;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "No immediate dominator for block: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 61
    throw p0

    :cond_b
    return-object v1
.end method
