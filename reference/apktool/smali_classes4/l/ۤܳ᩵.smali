.class public final Ll/ۤܳ᩵;
.super Ll/ܺ۠ۗ;
.source "5IWP"


# direct methods
.method public static ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;I)Ll/ᩳۢۗ;
    .locals 3

    .line 101
    sget-object v0, Ll/ۧ۟ۗ;->ۖ:Ll/ۧ۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v0

    check-cast v0, Ll/ۛᩳۗ;

    if-nez v0, :cond_0

    .line 103
    new-instance v0, Ll/ۛᩳۗ;

    invoke-direct {v0}, Ll/ۛᩳۗ;-><init>()V

    .line 104
    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 106
    :cond_0
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    .line 107
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܽۙ()Ll/᩷ۡۗ;

    move-result-object v2

    if-ne v2, p1, :cond_3

    .line 108
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۡۙ()Ll/ۛ֨ۗ;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 109
    invoke-virtual {v2}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v2

    if-ne v2, p2, :cond_1

    goto :goto_0

    .line 112
    :cond_1
    invoke-virtual {p0}, Ll/ۖۡۗ;->۫ۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ֨ۗ;

    .line 113
    invoke-virtual {v2}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v2

    if-ne v2, p2, :cond_2

    :goto_0
    add-int/lit8 v1, v1, 0x1

    .line 120
    :cond_3
    new-instance p0, Ll/ᩳۢۗ;

    invoke-direct {p0, p2, v1}, Ll/ᩳۢۗ;-><init>(II)V

    .line 121
    invoke-virtual {v0}, Ll/ۛᩳۗ;->ۙ()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/ArrayList;

    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    invoke-virtual {p1}, Ll/᩷ۡۗ;->᩻ۙ()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ᩳۡۗ;->ܳ(I)V

    return-object p0
.end method

.method public static synthetic ۙ(Ll/ۛ֨ۗ;)V
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۤܳ᩵;->᩷(Ll/ۛ֨ۗ;)V

    return-void
.end method

.method public static ۙ(Ll/᩷ܳ᩵;Ll/ᩳۢۗ;)V
    .locals 4

    .line 186
    invoke-virtual {p1}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v0

    .line 187
    invoke-virtual {p0, v0}, Ll/᩷ܳ᩵;->ۙ(I)Ll/ܿ֨ۗ;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 191
    :cond_0
    invoke-virtual {p0}, Ll/᩷ܳ᩵;->ۙ()Ll/᩷ۡۗ;

    move-result-object p0

    .line 38
    invoke-virtual {p1}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v1

    invoke-virtual {p1}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۛ֨ۗ;->ܺۙ()Ll/֫֨ۗ;

    move-result-object v2

    .line 31
    new-instance v3, Ll/ۛ֨ۗ;

    invoke-direct {v3, v1, v2}, Ll/ۛ֨ۗ;-><init>(ILl/֫֨ۗ;)V

    .line 39
    invoke-virtual {p1, v3, p0}, Ll/ᩳۢۗ;->ۙ(Ll/ۛ֨ۗ;Ll/᩷ۡۗ;)V

    .line 192
    invoke-virtual {v0, v3}, Ll/ܿ֨ۗ;->ۤ(Ll/ۛ֨ۗ;)V

    .line 193
    invoke-virtual {v0, p1}, Ll/ܿ֨ۗ;->ۙ(Ll/ᩳۢۗ;)V

    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/ᩳۢۗ;Ll/ۛ֨ۗ;)Z
    .locals 5

    .line 435
    invoke-virtual {p2}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 439
    :cond_0
    invoke-virtual {p3}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 442
    :cond_1
    invoke-virtual {v0}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v0

    .line 443
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ֨ۗ;

    .line 444
    invoke-virtual {v1}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v2

    if-eqz v2, :cond_5

    if-ne v2, p2, :cond_3

    goto :goto_1

    .line 448
    :cond_3
    invoke-virtual {v1}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v3

    invoke-virtual {p3}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v4

    if-ne v3, v4, :cond_4

    .line 451
    invoke-virtual {v1}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v2

    invoke-virtual {v2, v1}, Ll/ܿ֨ۗ;->ۙ(Ll/ۛ֨ۗ;)V

    .line 452
    invoke-virtual {p3}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v2

    invoke-virtual {v2, v1}, Ll/ܿ֨ۗ;->ۤ(Ll/ۛ֨ۗ;)V

    goto :goto_0

    .line 455
    :cond_4
    invoke-virtual {p3}, Ll/ۛ֨ۗ;->۠()Ll/ۛ֨ۗ;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_5
    :goto_1
    const/4 p0, 0x0

    return p0

    .line 460
    :cond_6
    sget-object v0, Ll/ۧ۟ۗ;->᩻:Ll/ۧ۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 462
    invoke-virtual {p3}, Ll/ۛ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 463
    invoke-virtual {p1}, Ll/ᩳۡۗ;->ܶۙ()Z

    move-result p3

    if-nez p3, :cond_7

    .line 464
    sget-object p3, Ll/֫۟ۗ;->ۤۙ:Ll/֫۟ۗ;

    invoke-virtual {p1, p3}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 467
    :cond_7
    invoke-static {p0, p2}, Ll/ۢ֫᩵;->ۤ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static ۤ(Ll/ۛ֨ۗ;)V
    .locals 1

    if-eqz p0, :cond_0

    .line 473
    invoke-static {p0}, Ll/ۤܳ᩵;->᩷(Ll/ۛ֨ۗ;)V

    .line 474
    invoke-virtual {p0}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object p0

    new-instance v0, Ll/ۚۢ᩻;

    invoke-direct {v0}, Ll/ۚۢ᩻;-><init>()V

    invoke-static {p0, v0}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    :cond_0
    return-void
.end method

.method public static ᩷(Ll/ۛ֨ۗ;)V
    .locals 3

    if-nez p0, :cond_0

    goto :goto_0

    .line 482
    :cond_0
    sget-object v0, Ll/֫۟ۗ;->᩻᩷:Ll/֫۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 483
    sget-object v0, Ll/֫۟ۗ;->᩺ۙ:Ll/֫۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 485
    invoke-virtual {p0}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 487
    invoke-virtual {v0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v1

    sget-object v2, Ll/᩺ۢۗ;->ۗۙ:Ll/᩺ۢۗ;

    if-ne v1, v2, :cond_1

    const/4 v1, 0x0

    .line 488
    invoke-virtual {v0, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    if-ne v1, p0, :cond_1

    .line 489
    invoke-virtual {v0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    .line 490
    invoke-virtual {v1}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v2

    invoke-virtual {p0}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result p0

    if-eq v2, p0, :cond_1

    .line 491
    invoke-virtual {v1}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܿ֨ۗ;->᩶()Z

    move-result p0

    if-nez p0, :cond_1

    .line 492
    invoke-static {v1}, Ll/ۤܳ᩵;->ۤ(Ll/ۛ֨ۗ;)V

    .line 493
    sget-object p0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v0, p0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 16

    move-object/from16 v0, p1

    .line 42
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_20

    .line 49
    :cond_0
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_20

    .line 52
    :cond_1
    new-instance v1, Ll/ۙܳ᩵;

    invoke-direct {v1, v0}, Ll/ۙܳ᩵;-><init>(Ll/ۖۡۗ;)V

    .line 53
    invoke-virtual {v1}, Ll/ۙܳ᩵;->ۙ()V

    .line 54
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۢۙ()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_5

    .line 71
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v5

    .line 72
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    .line 73
    new-instance v7, Ljava/util/BitSet;

    invoke-direct {v7, v6}, Ljava/util/BitSet;-><init>(I)V

    .line 74
    new-instance v8, Ljava/util/BitSet;

    invoke-direct {v8, v6}, Ljava/util/BitSet;-><init>(I)V

    .line 75
    new-instance v6, Ljava/util/ArrayDeque;

    invoke-direct {v6}, Ljava/util/ArrayDeque;-><init>()V

    .line 77
    invoke-virtual {v1, v4}, Ll/ۙܳ᩵;->ۙ(I)Ljava/util/BitSet;

    move-result-object v9

    .line 78
    invoke-virtual {v9, v3}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v10

    :goto_1
    if-ltz v10, :cond_2

    .line 79
    invoke-virtual {v8, v10}, Ljava/util/BitSet;->set(I)V

    .line 80
    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/᩷ۡۗ;

    invoke-virtual {v6, v11}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    .line 78
    invoke-virtual {v9, v10}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v10

    goto :goto_1

    .line 82
    :cond_2
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_4

    .line 83
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩷ۡۗ;

    .line 84
    invoke-virtual {v9}, Ll/᩷ۡۗ;->ۜ()Ljava/util/BitSet;

    move-result-object v9

    .line 85
    invoke-virtual {v9, v3}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v10

    :goto_2
    if-ltz v10, :cond_2

    .line 86
    invoke-virtual {v7, v10}, Ljava/util/BitSet;->get(I)Z

    move-result v11

    if-nez v11, :cond_3

    invoke-virtual {v1, v10, v4}, Ll/ۙܳ᩵;->ۙ(II)Z

    move-result v11

    if-eqz v11, :cond_3

    .line 87
    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/᩷ۡۗ;

    .line 88
    invoke-static {v0, v11, v4}, Ll/ۤܳ᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;I)Ll/ᩳۢۗ;

    move-result-object v12

    .line 89
    invoke-virtual {v11}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/util/ArrayList;

    invoke-virtual {v13, v3, v12}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 90
    invoke-virtual {v7, v10}, Ljava/util/BitSet;->set(I)V

    .line 91
    invoke-virtual {v8, v10}, Ljava/util/BitSet;->get(I)Z

    move-result v12

    if-nez v12, :cond_3

    .line 92
    invoke-virtual {v8, v10}, Ljava/util/BitSet;->set(I)V

    .line 93
    invoke-virtual {v6, v11}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v10, v10, 0x1

    .line 85
    invoke-virtual {v9, v10}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v10

    goto :goto_2

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 127
    :cond_5
    invoke-static/range {p1 .. p1}, Ll/᩷ܳ᩵;->ۙ(Ll/ۖۡۗ;)Ll/᩷ܳ᩵;

    move-result-object v1

    .line 142
    invoke-virtual {v1}, Ll/᩷ܳ᩵;->ۙ()Ll/᩷ۡۗ;

    move-result-object v2

    sget-object v4, Ll/ۧ۟ۗ;->ۖ:Ll/ۧ۟ۗ;

    invoke-virtual {v2, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v2

    check-cast v2, Ll/ۛᩳۗ;

    if-eqz v2, :cond_6

    .line 144
    invoke-virtual {v2}, Ll/ۛᩳۗ;->ۙ()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۢۗ;

    .line 145
    invoke-static {v1, v5}, Ll/ۤܳ᩵;->ۙ(Ll/᩷ܳ᩵;Ll/ᩳۢۗ;)V

    goto :goto_3

    .line 130
    :cond_6
    new-instance v2, Ljava/util/ArrayDeque;

    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 131
    invoke-virtual {v2, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 132
    :cond_7
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_10

    .line 133
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ܳ᩵;

    .line 151
    invoke-virtual {v1}, Ll/᩷ܳ᩵;->ۙ()Ll/᩷ۡۗ;

    move-result-object v5

    .line 152
    invoke-virtual {v5}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_8
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ᩳۡۗ;

    .line 153
    invoke-virtual {v7}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v8

    sget-object v9, Ll/᩺ۢۗ;->۟ۙ:Ll/᩺ۢۗ;

    if-eq v8, v9, :cond_b

    .line 154
    invoke-virtual {v7}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ܺ֨ۗ;

    .line 155
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v10, v9, Ll/ۛ֨ۗ;

    if-nez v10, :cond_9

    goto :goto_5

    .line 158
    :cond_9
    check-cast v9, Ll/ۛ֨ۗ;

    .line 159
    invoke-virtual {v9}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v10

    .line 160
    invoke-virtual {v1, v10}, Ll/᩷ܳ᩵;->ۙ(I)Ll/ܿ֨ۗ;

    move-result-object v11

    if-nez v11, :cond_a

    .line 163
    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "Not initialized variable reg: "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, ", insn: "

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v10, ", block:"

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v10}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    .line 164
    invoke-virtual {v1, v9}, Ll/᩷ܳ᩵;->ۙ(Ll/ۛ֨ۗ;)Ll/ܿ֨ۗ;

    move-result-object v11

    .line 166
    :cond_a
    invoke-virtual {v11, v9}, Ll/ܿ֨ۗ;->ۤ(Ll/ۛ֨ۗ;)V

    goto :goto_5

    .line 169
    :cond_b
    invoke-virtual {v7}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v7

    if-eqz v7, :cond_8

    .line 171
    invoke-virtual {v1, v7}, Ll/᩷ܳ᩵;->ۙ(Ll/ۛ֨ۗ;)Ll/ܿ֨ۗ;

    goto :goto_4

    .line 174
    :cond_c
    invoke-virtual {v5}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_d
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩷ۡۗ;

    .line 175
    invoke-virtual {v6, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v6

    check-cast v6, Ll/ۛᩳۗ;

    if-nez v6, :cond_e

    goto :goto_6

    .line 179
    :cond_e
    invoke-virtual {v6}, Ll/ۛᩳۗ;->ۙ()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ᩳۢۗ;

    .line 180
    invoke-static {v1, v7}, Ll/ۤܳ᩵;->ۙ(Ll/᩷ܳ᩵;Ll/ᩳۢۗ;)V

    goto :goto_7

    .line 135
    :cond_f
    invoke-virtual {v1}, Ll/᩷ܳ᩵;->ۙ()Ll/᩷ۡۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩷ۡۗ;->ۙۙ()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩷ۡۗ;

    .line 136
    invoke-static {v1, v6}, Ll/᩷ܳ᩵;->ۙ(Ll/᩷ܳ᩵;Ll/᩷ۡۗ;)Ll/᩷ܳ᩵;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_8

    .line 60
    :cond_10
    invoke-static/range {p1 .. p1}, Ll/۠֫᩵;->ۙ(Ll/ۖۡۗ;)Z

    move-result v1

    if-nez v1, :cond_17

    .line 200
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 201
    invoke-virtual {v2, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v5

    check-cast v5, Ll/ۛᩳۗ;

    if-eqz v5, :cond_11

    .line 203
    sget-object v6, Ll/ۧ۟ۗ;->᩻:Ll/ۧ۟ۗ;

    invoke-virtual {v2, v6}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v2

    check-cast v2, Ll/ۤ۠ۗ;

    if-eqz v2, :cond_11

    .line 205
    invoke-virtual {v5}, Ll/ۛᩳۗ;->ۙ()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳۢۗ;

    .line 214
    invoke-virtual {v6}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v7

    const/4 v8, 0x0

    :goto_a
    if-ge v8, v7, :cond_15

    .line 217
    invoke-virtual {v6, v8}, Ll/ᩳۢۗ;->᩸(I)Ll/ۛ֨ۗ;

    move-result-object v9

    .line 218
    invoke-virtual {v9}, Ll/ۛ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v10

    if-eqz v10, :cond_14

    .line 232
    invoke-virtual {v10}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v11

    if-eqz v11, :cond_14

    sget-object v11, Ll/֫۟ۗ;->ܽ᩷:Ll/֫۟ۗ;

    .line 233
    invoke-virtual {v10, v11}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v11

    if-eqz v11, :cond_14

    .line 1535
    sget-object v11, Ll/ۧ۟ۗ;->ۧ:Ll/ۧ۟ۗ;

    invoke-virtual {v10, v11}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v12

    check-cast v12, Ll/᩷۠ۗ;

    if-eqz v12, :cond_12

    goto :goto_b

    .line 256
    :cond_12
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v12

    invoke-static {v0, v10, v12}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Ljava/util/List;)Ll/᩷ۡۗ;

    move-result-object v10

    if-nez v10, :cond_13

    const/4 v12, 0x0

    goto :goto_b

    .line 1543
    :cond_13
    invoke-virtual {v10, v11}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v10

    move-object v12, v10

    check-cast v12, Ll/᩷۠ۗ;

    :goto_b
    if-eqz v12, :cond_14

    .line 235
    invoke-virtual {v12}, Ll/᩷۠ۗ;->᩷()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v2}, Ll/ۤ۠ۗ;->ۙ()Ll/ᩴ۠ۗ;

    move-result-object v11

    check-cast v10, Ljava/util/ArrayList;

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_14

    .line 219
    invoke-virtual {v6, v9}, Ll/ᩳۢۗ;->ۤ(Ll/ۛ֨ۗ;)V

    add-int/lit8 v7, v7, -0x1

    goto :goto_a

    :cond_14
    add-int/lit8 v8, v8, 0x1

    goto :goto_a

    .line 225
    :cond_15
    invoke-virtual {v6}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v6

    if-eqz v6, :cond_16

    goto :goto_9

    .line 226
    :cond_16
    new-instance v0, Ll/۠ۧ᩵;

    const-string v1, "PHI empty after try-catch fix!"

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 226
    throw v0

    .line 242
    :cond_17
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_18
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 243
    invoke-virtual {v2, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v5

    check-cast v5, Ll/ۛᩳۗ;

    if-nez v5, :cond_19

    goto :goto_c

    .line 248
    :cond_19
    invoke-virtual {v5}, Ll/ۛᩳۗ;->ۙ()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_18

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳۢۗ;

    const/4 v7, 0x0

    .line 249
    :goto_d
    invoke-virtual {v6}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v8

    if-ge v7, v8, :cond_1a

    .line 250
    invoke-virtual {v6, v7}, Ll/ᩳۢۗ;->᩸(I)Ll/ۛ֨ۗ;

    move-result-object v8

    .line 251
    invoke-virtual {v8}, Ll/ۛ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v9

    if-eqz v9, :cond_1b

    .line 252
    sget-object v10, Ll/֫۟ۗ;->ۜۙ:Ll/֫۟ۗ;

    invoke-virtual {v9, v10}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v10

    if-eqz v10, :cond_1b

    .line 253
    invoke-virtual {v6, v8}, Ll/ᩳۢۗ;->ۤ(Ll/ۛ֨ۗ;)V

    .line 254
    invoke-static {v0, v2, v9}, Ll/ۢ֫᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/ᩳۡۗ;)V

    :cond_1b
    add-int/lit8 v7, v7, 0x1

    goto :goto_d

    .line 265
    :cond_1c
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    const/4 v2, 0x0

    .line 275
    :goto_e
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 276
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v7, 0x0

    :cond_1d
    :goto_f
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const/4 v9, 0x1

    if-eqz v8, :cond_1e

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܿ֨ۗ;

    .line 278
    invoke-virtual {v8}, Ll/ܿ֨ۗ;->᩹()I

    move-result v9

    if-nez v9, :cond_1d

    .line 279
    invoke-virtual {v8}, Ll/ܿ֨ۗ;->ۙ()Ll/ۛ֨ۗ;

    move-result-object v8

    invoke-virtual {v8}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v8

    if-eqz v8, :cond_1d

    .line 280
    invoke-virtual {v8}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v9

    sget-object v10, Ll/᩺ۢۗ;->۟ۙ:Ll/᩺ۢۗ;

    if-ne v9, v10, :cond_1d

    .line 281
    check-cast v8, Ll/ᩳۢۗ;

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v7, 0x1

    goto :goto_f

    .line 286
    :cond_1e
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1f
    :goto_10
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_34

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩷ۡۗ;

    .line 287
    invoke-virtual {v8, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v10

    check-cast v10, Ll/ۛᩳۗ;

    if-nez v10, :cond_20

    goto :goto_10

    .line 291
    :cond_20
    invoke-virtual {v10}, Ll/ۛᩳۗ;->ۙ()Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    .line 292
    :goto_11
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1f

    .line 293
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ᩳۢۗ;

    .line 305
    invoke-virtual {v11}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v12

    if-nez v12, :cond_23

    .line 306
    invoke-virtual {v11}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_21
    :goto_12
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_22

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۛ֨ۗ;

    .line 307
    invoke-virtual {v7}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v9

    if-eqz v9, :cond_21

    .line 308
    invoke-virtual {v9}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v9

    sget-object v12, Ll/᩺ۢۗ;->۟ۙ:Ll/᩺ۢۗ;

    if-ne v9, v12, :cond_21

    .line 309
    invoke-virtual {v11, v7}, Ll/ᩳۢۗ;->ۤ(Ll/ۛ֨ۗ;)V

    goto :goto_12

    .line 312
    :cond_22
    invoke-static {v0, v8, v11}, Ll/ۢ֫᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/ᩳۡۗ;)V

    goto/16 :goto_19

    .line 315
    :cond_23
    invoke-virtual {v11}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v12

    if-eq v12, v9, :cond_2e

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 339
    :goto_13
    invoke-virtual {v11}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v14

    if-ge v12, v14, :cond_2e

    .line 340
    invoke-virtual {v11, v12}, Ll/ᩳۢۗ;->᩸(I)Ll/ۛ֨ۗ;

    move-result-object v3

    if-nez v13, :cond_24

    .line 342
    invoke-virtual {v3}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v3

    move-object v13, v3

    goto/16 :goto_18

    .line 343
    :cond_24
    invoke-virtual {v3}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v3

    if-eq v13, v3, :cond_2d

    .line 353
    invoke-virtual {v11}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v3

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_14
    if-ge v12, v3, :cond_2b

    .line 355
    invoke-virtual {v11, v12}, Ll/ᩳۢۗ;->᩸(I)Ll/ۛ֨ۗ;

    move-result-object v14

    .line 356
    invoke-virtual {v14}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v15

    invoke-virtual {v15}, Ll/ܿ֨ۗ;->᩹()I

    move-result v15

    if-eq v15, v9, :cond_25

    goto :goto_16

    .line 359
    :cond_25
    invoke-virtual {v14}, Ll/ۛ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v9

    if-eqz v9, :cond_2a

    .line 360
    invoke-virtual {v9}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v14

    sget-object v15, Ll/᩺ۢۗ;->ۗۙ:Ll/᩺ۢۗ;

    if-eq v14, v15, :cond_26

    goto :goto_16

    :cond_26
    const/4 v14, 0x0

    .line 363
    invoke-virtual {v9, v14}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v9

    .line 364
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v14, v9, Ll/ۛ֨ۗ;

    if-nez v14, :cond_27

    goto :goto_16

    .line 367
    :cond_27
    check-cast v9, Ll/ۛ֨ۗ;

    invoke-virtual {v9}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v9

    if-nez v13, :cond_28

    move-object v13, v9

    goto :goto_15

    :cond_28
    if-eq v13, v9, :cond_29

    goto :goto_16

    :cond_29
    :goto_15
    add-int/lit8 v12, v12, 0x1

    const/4 v9, 0x1

    goto :goto_14

    :cond_2a
    :goto_16
    const/4 v13, 0x0

    :cond_2b
    if-eqz v13, :cond_33

    .line 321
    invoke-virtual {v13}, Ll/ܿ֨ۗ;->ۙ()Ll/ۛ֨ۗ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۛ֨ۗ;->۠()Ll/ۛ֨ۗ;

    move-result-object v3

    .line 322
    invoke-static {v0, v8, v11, v3}, Ll/ۤܳ᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/ᩳۢۗ;Ll/ۛ֨ۗ;)Z

    move-result v3

    if-eqz v3, :cond_33

    .line 323
    invoke-virtual {v11}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2c
    :goto_17
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_32

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܺ֨ۗ;

    .line 324
    check-cast v7, Ll/ۛ֨ۗ;

    invoke-virtual {v7}, Ll/ۛ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v7

    if-eqz v7, :cond_2c

    .line 326
    sget-object v9, Ll/֫۟ۗ;->ۜۙ:Ll/֫۟ۗ;

    invoke-virtual {v7, v9}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 327
    invoke-static {v0, v7}, Ll/ۢ֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V

    goto :goto_17

    :cond_2d
    :goto_18
    add-int/lit8 v12, v12, 0x1

    const/4 v3, 0x0

    const/4 v9, 0x1

    goto/16 :goto_13

    .line 317
    :cond_2e
    invoke-virtual {v11, v3}, Ll/ᩳۢۗ;->᩸(I)Ll/ۛ֨ۗ;

    move-result-object v3

    .line 407
    invoke-virtual {v8}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v9

    .line 408
    invoke-static {v9, v11}, Ll/᩶֫᩵;->ۙ(Ljava/util/List;Ll/ᩳۡۗ;)I

    move-result v12

    const/4 v13, -0x1

    if-ne v12, v13, :cond_2f

    goto :goto_1a

    .line 412
    :cond_2f
    invoke-virtual {v11}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v7

    invoke-virtual {v7}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v7

    .line 413
    invoke-virtual {v3}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v13

    if-eqz v13, :cond_30

    .line 415
    invoke-virtual {v13, v3}, Ll/ܿ֨ۗ;->ۙ(Ll/ۛ֨ۗ;)V

    .line 416
    invoke-virtual {v13, v11}, Ll/ܿ֨ۗ;->᩷(Ll/ᩳۢۗ;)V

    :cond_30
    const/4 v13, 0x0

    .line 419
    invoke-virtual {v11, v13}, Ll/ᩳۢۗ;->᩸(I)Ll/ۛ֨ۗ;

    move-result-object v13

    invoke-static {v0, v8, v11, v13}, Ll/ۤܳ᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/ᩳۢۗ;Ll/ۛ֨ۗ;)Z

    move-result v13

    if-eqz v13, :cond_31

    .line 420
    check-cast v9, Ljava/util/ArrayList;

    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_19

    .line 422
    :cond_31
    invoke-virtual {v7, v11}, Ll/ܿ֨ۗ;->᩷(Ll/ᩳۢۗ;)V

    .line 424
    new-instance v7, Ll/ᩳۡۗ;

    sget-object v13, Ll/᩺ۢۗ;->ۗۙ:Ll/᩺ۢۗ;

    const/4 v14, 0x1

    invoke-direct {v7, v13, v14}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 425
    sget-object v13, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v7, v13}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 426
    invoke-virtual {v11}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v11

    invoke-virtual {v7, v11}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    .line 427
    invoke-virtual {v7, v3}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    .line 428
    invoke-virtual {v3}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v11

    invoke-virtual {v11, v3}, Ll/ܿ֨ۗ;->ۤ(Ll/ۛ֨ۗ;)V

    .line 429
    check-cast v9, Ljava/util/ArrayList;

    invoke-virtual {v9, v12, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 295
    :cond_32
    :goto_19
    invoke-interface {v10}, Ljava/util/Iterator;->remove()V

    const/4 v7, 0x1

    :cond_33
    :goto_1a
    const/4 v3, 0x0

    const/4 v9, 0x1

    goto/16 :goto_11

    .line 378
    :cond_34
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_35
    :goto_1b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩷ۡۗ;

    .line 379
    invoke-virtual {v6, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v8

    check-cast v8, Ll/ۛᩳۗ;

    if-nez v8, :cond_36

    goto :goto_1b

    .line 383
    :cond_36
    invoke-virtual {v8}, Ll/ۛᩳۗ;->ۙ()Ljava/util/List;

    move-result-object v8

    .line 384
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_37
    :goto_1c
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_3b

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ᩳۢۗ;

    .line 385
    move-object v11, v8

    check-cast v11, Ljava/util/ArrayList;

    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_37

    .line 386
    invoke-virtual {v10}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_38
    :goto_1d
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_3a

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ܺ֨ۗ;

    if-nez v12, :cond_39

    goto :goto_1d

    .line 390
    :cond_39
    check-cast v12, Ll/ۛ֨ۗ;

    invoke-virtual {v12}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v12

    if-eqz v12, :cond_38

    .line 392
    invoke-virtual {v12, v10}, Ll/ܿ֨ۗ;->᩷(Ll/ᩳۢۗ;)V

    goto :goto_1d

    .line 395
    :cond_3a
    invoke-static {v0, v6, v10}, Ll/ۢ֫᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/ᩳۡۗ;)V

    goto :goto_1c

    .line 398
    :cond_3b
    check-cast v8, Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_35

    .line 399
    invoke-virtual {v6, v4}, Ll/ܺ۟ۗ;->ۤ(Ll/֫᩶ۗ;)V

    goto :goto_1b

    .line 402
    :cond_3c
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    if-eqz v7, :cond_3e

    add-int/lit8 v3, v2, 0x1

    if-gt v2, v1, :cond_3d

    const/4 v2, 0x0

    move v2, v3

    const/4 v3, 0x0

    goto/16 :goto_e

    .line 268
    :cond_3d
    new-instance v0, Ll/۠ۧ᩵;

    const-string v1, "Phi nodes fix limit reached!"

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 268
    throw v0

    .line 65
    :cond_3e
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۡۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    invoke-static {v1}, Ll/ۤܳ᩵;->ۤ(Ll/ۛ֨ۗ;)V

    .line 499
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 500
    invoke-virtual {v2}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v2

    new-instance v3, Ll/ᩳۨᩴ;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, Ll/ᩳۨᩴ;-><init>(I)V

    check-cast v2, Ljava/util/ArrayList;

    invoke-static {v2, v3}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    goto :goto_1e

    .line 505
    :cond_3f
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 506
    :cond_40
    :goto_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_41

    .line 507
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿ֨ۗ;

    .line 508
    invoke-virtual {v1}, Ll/ܿ֨ۗ;->᩹()I

    move-result v2

    if-nez v2, :cond_40

    .line 509
    invoke-virtual {v1}, Ll/ܿ֨ۗ;->ۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v1

    if-eqz v1, :cond_40

    .line 510
    invoke-virtual {v1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v2

    sget-object v3, Ll/᩺ۢۗ;->ۧۙ:Ll/᩺ۢۗ;

    if-ne v2, v3, :cond_40

    const/4 v2, 0x0

    .line 511
    invoke-virtual {v1, v2}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    .line 512
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_1f

    :cond_41
    :goto_20
    return-void
.end method
