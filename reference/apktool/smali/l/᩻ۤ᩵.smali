.class public final Ll/᩻ۤ᩵;
.super Ll/ۙۤ᩵;
.source "ZIV7"


# virtual methods
.method public final ᩷()Ljava/util/List;
    .locals 13

    .line 40
    invoke-virtual {p0}, Ll/ۙۤ᩵;->ۙ()Ll/۟ۤ᩵;

    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ll/۟ۤ᩵;->ᩴ()Ll/֨ۤ᩵;

    move-result-object v1

    .line 42
    invoke-virtual {v0}, Ll/۟ۤ᩵;->᩸()Ll/֨ۤ᩵;

    move-result-object v2

    .line 44
    invoke-virtual {v1}, Ll/֨ۤ᩵;->᩸()Ll/ۢۤ᩵;

    move-result-object v3

    sget-object v4, Ll/ۢۤ᩵;->֡:Ll/ۢۤ᩵;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-ne v3, v4, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 45
    :goto_0
    invoke-virtual {v2}, Ll/֨ۤ᩵;->᩸()Ll/ۢۤ᩵;

    move-result-object v7

    if-ne v7, v4, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eqz v3, :cond_5

    if-eqz v4, :cond_5

    .line 49
    check-cast v1, Ll/ۡۤ᩵;

    check-cast v2, Ll/ۡۤ᩵;

    .line 66
    invoke-virtual {v1}, Ll/ۡۤ᩵;->ۧ()Ljava/util/List;

    move-result-object v0

    .line 67
    invoke-virtual {v2}, Ll/ۡۤ᩵;->ۧ()Ljava/util/List;

    move-result-object v1

    .line 69
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    .line 70
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    .line 73
    rem-int v4, v3, v2

    if-nez v4, :cond_4

    if-ne v3, v2, :cond_4

    .line 25
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 77
    div-int/2addr v3, v2

    .line 79
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v3, :cond_3

    .line 81
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v7, 0x0

    :goto_3
    if-ge v7, v2, :cond_2

    mul-int v8, v5, v2

    add-int/2addr v8, v7

    .line 83
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩷ۡۗ;

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    .line 128
    :cond_2
    invoke-virtual {p0}, Ll/ۙۤ᩵;->ۙ()Ll/۟ۤ᩵;

    move-result-object v7

    .line 129
    invoke-virtual {p0}, Ll/ۙۤ᩵;->ۙ()Ll/۟ۤ᩵;

    move-result-object v8

    invoke-virtual {v8}, Ll/۟ۤ᩵;->ܳ()Ll/ܺܳܺ;

    move-result-object v8

    invoke-virtual {v8}, Ll/ܺܳܺ;->ۙ()Ll/ۖۡۗ;

    move-result-object v8

    .line 131
    invoke-virtual {v7}, Ll/۟ۤ᩵;->ᩴ()Ll/֨ۤ᩵;

    move-result-object v9

    .line 132
    invoke-virtual {v7}, Ll/۟ۤ᩵;->᩸()Ll/֨ۤ᩵;

    move-result-object v10

    .line 134
    invoke-virtual {v7, v9}, Ll/۟ۤ᩵;->ۙ(Ll/֨ۤ᩵;)Ll/ۡ᩷᩵;

    move-result-object v11

    .line 135
    invoke-virtual {v9}, Ll/֨ۤ᩵;->᩷()Ll/֡᩷᩵;

    move-result-object v9

    .line 137
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v4}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ljava/util/ArrayList;)Ll/᩷ۡۗ;

    move-result-object v11

    .line 139
    invoke-static {v9, v4, v11}, Ll/ܶۤ᩵;->ۙ(Ll/֡᩷᩵;Ljava/util/ArrayList;Ll/᩷ۡۗ;)Ll/۬᩷᩵;

    move-result-object v9

    .line 141
    invoke-virtual {v7, v10}, Ll/۟ۤ᩵;->ۙ(Ll/֨ۤ᩵;)Ll/ۡ᩷᩵;

    move-result-object v11

    .line 142
    invoke-virtual {v10}, Ll/֨ۤ᩵;->᩷()Ll/֡᩷᩵;

    move-result-object v10

    .line 144
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v6}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ljava/util/ArrayList;)Ll/᩷ۡۗ;

    move-result-object v8

    .line 146
    invoke-static {v10, v6, v8}, Ll/ܶۤ᩵;->ۙ(Ll/֡᩷᩵;Ljava/util/ArrayList;Ll/᩷ۡۗ;)Ll/۬᩷᩵;

    move-result-object v6

    .line 148
    invoke-static {v7, v9, v6}, Ll/۟ۤ᩵;->ۙ(Ll/۟ۤ᩵;Ll/۬᩷᩵;Ll/۬᩷᩵;)Ll/۟ۤ᩵;

    move-result-object v6

    .line 87
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_3
    return-object v1

    .line 90
    :cond_4
    sget-object v0, Ll/ܰۤ᩵;->۟:Ll/ܰۤ᩵;

    .line 91
    invoke-static {v0}, Ll/᩶ۤ᩵;->ۙ(Ll/ܰۤ᩵;)Ll/۬᩷᩵;

    move-result-object v1

    .line 93
    invoke-static {v0}, Ll/᩶ۤ᩵;->ۙ(Ll/ܰۤ᩵;)Ll/۬᩷᩵;

    move-result-object v0

    .line 95
    invoke-virtual {p0}, Ll/ۙۤ᩵;->ۙ()Ll/۟ۤ᩵;

    move-result-object v2

    invoke-static {v2, v1, v0}, Ll/۟ۤ᩵;->ۙ(Ll/۟ۤ᩵;Ll/۬᩷᩵;Ll/۬᩷᩵;)Ll/۟ۤ᩵;

    move-result-object v0

    new-array v1, v5, [Ljava/lang/Object;

    aput-object v0, v1, v6

    .line 0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v1, v1, v6

    invoke-static {v1, v0, v1, v0}, Ll/᩺᩸ۚ;->ۙ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_5
    if-eqz v3, :cond_6

    .line 54
    check-cast v1, Ll/ۡۤ᩵;

    goto :goto_4

    .line 57
    :cond_6
    check-cast v2, Ll/ۡۤ᩵;

    move-object v12, v2

    move-object v2, v1

    move-object v1, v12

    .line 104
    :goto_4
    invoke-virtual {v1}, Ll/ۡۤ᩵;->ۧ()Ljava/util/List;

    move-result-object v4

    .line 105
    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 106
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩷ۡۗ;

    .line 107
    invoke-virtual {v1}, Ll/֨ۤ᩵;->᩷()Ll/֡᩷᩵;

    move-result-object v8

    .line 108
    new-instance v9, Ll/ᩳۤ᩵;

    .line 17
    invoke-direct {v9, v7, v6, v6}, Ll/ᩳۤ᩵;-><init>(Ll/᩷ۡۗ;II)V

    .line 110
    invoke-static {v8, v9}, Ll/ۗۤ᩵;->ۙ(Ll/֡᩷᩵;Ll/ᩳۤ᩵;)Ll/۬᩷᩵;

    move-result-object v7

    .line 111
    new-instance v8, Ll/ۜ᩷᩵;

    invoke-direct {v8, v2}, Ll/ۜ᩷᩵;-><init>(Ll/֨ۤ᩵;)V

    .line 113
    invoke-virtual {v0}, Ll/۟ۤ᩵;->ۙ()Ll/۟ۤ᩵;

    move-result-object v9

    if-eqz v3, :cond_7

    .line 117
    invoke-static {v9, v7, v8}, Ll/۟ۤ᩵;->ۙ(Ll/۟ۤ᩵;Ll/۬᩷᩵;Ll/۬᩷᩵;)Ll/۟ۤ᩵;

    move-result-object v7

    goto :goto_6

    .line 120
    :cond_7
    invoke-static {v9, v8, v7}, Ll/۟ۤ᩵;->ۙ(Ll/۟ۤ᩵;Ll/۬᩷᩵;Ll/۬᩷᩵;)Ll/۟ۤ᩵;

    move-result-object v7

    .line 122
    :goto_6
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_8
    return-object v5
.end method
