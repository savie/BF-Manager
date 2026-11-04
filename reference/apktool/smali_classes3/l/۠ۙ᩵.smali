.class public final Ll/۠ۙ᩵;
.super Ljava/lang/Object;
.source "A6I0"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 53
    const-class v0, Ll/۠ۙ᩵;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic ۙ(Ll/ᩴ۠ۗ;)Ll/᩵ܺۗ;
    .locals 0

    .line 399
    invoke-virtual {p0}, Ll/ᩴ۠ۗ;->ۤ()Ljava/util/ArrayList;

    move-result-object p0

    invoke-static {p0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۙ(Ll/᩷ۡۗ;)Ll/᩵ܺۗ;
    .locals 0

    .line 687
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/ۖۡۗ;Ljava/util/List;Ll/ܿۧ᩵;)V
    .locals 5

    .line 756
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܶۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴ۠ۗ;

    .line 758
    invoke-virtual {v1}, Ll/ᩴ۠ۗ;->ܳ()Ll/᩷ۡۗ;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 759
    invoke-virtual {p2, v2}, Ll/ܿۧ᩵;->ۤ(Ll/᩷ۡۗ;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 762
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۫۠ۗ;

    .line 763
    invoke-virtual {v4}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    .line 769
    :cond_3
    invoke-static {v2, p0}, Ll/ܳ᩷᩵;->ۤ(Ll/᩷ۡۗ;Ll/ۖۡۗ;)V

    goto :goto_0

    :cond_4
    return-void
.end method

.method public static synthetic ۙ(Ll/۫۠ۗ;)V
    .locals 2

    .line 367
    invoke-virtual {p0}, Ll/۫۠ۗ;->ۙ()Ljava/util/List;

    move-result-object p0

    new-instance v0, Ll/ܿۡۤ;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ll/ܿۡۤ;-><init>(I)V

    invoke-static {p0, v0}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    return-void
.end method

.method public static ۙ(Ll/۫۠ۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V
    .locals 2

    .line 611
    invoke-virtual {p0}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

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

    check-cast v1, Ll/ᩴ۠ۗ;

    .line 612
    invoke-virtual {v1}, Ll/ᩴ۠ۗ;->ܳ()Ll/᩷ۡۗ;

    move-result-object v1

    .line 613
    invoke-static {p1, v1}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    if-eqz p2, :cond_0

    .line 615
    invoke-static {p2, v1}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    goto :goto_0

    .line 618
    :cond_1
    invoke-virtual {p0}, Ll/۫۠ۗ;->᩻()Ll/۫۠ۗ;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 620
    invoke-static {p0, p1, p2}, Ll/۠ۙ᩵;->ۙ(Ll/۫۠ۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    :cond_2
    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;)Z
    .locals 19

    move-object/from16 v0, p0

    .line 56
    invoke-virtual/range {p0 .. p0}, Ll/ۖۡۗ;->᩻᩷()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    .line 59
    :cond_0
    sget v1, Ll/ܳ᩷᩵;->ܰ:I

    .line 127
    invoke-virtual/range {p0 .. p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ll/۟ܿۗ;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ll/۟ܿۗ;-><init>(I)V

    invoke-static {v1, v2}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 60
    invoke-static/range {p0 .. p0}, Ll/ܺ᩷᩵;->ۙ(Ll/ۖۡۗ;)V

    .line 62
    invoke-static/range {p0 .. p0}, Ll/۠ۙ᩵;->᩷(Ll/ۖۡۗ;)V

    .line 258
    invoke-virtual/range {p0 .. p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    .line 259
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x2

    .line 260
    sget-object v6, Ll/ۧ۟ۗ;->᩻:Ll/ۧ۟ۗ;

    if-ge v4, v2, :cond_6

    .line 261
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩷ۡۗ;

    .line 262
    invoke-static {v7}, Ll/᩹֫᩵;->ۤ(Ll/᩷ۡۗ;)Ll/ᩳۡۗ;

    move-result-object v8

    if-nez v8, :cond_1

    goto/16 :goto_2

    .line 266
    :cond_1
    invoke-virtual {v8, v6}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v9

    check-cast v9, Ll/ۤ۠ۗ;

    if-nez v9, :cond_2

    goto/16 :goto_2

    .line 270
    :cond_2
    invoke-virtual {v8, v6}, Ll/ܺ۟ۗ;->ۤ(Ll/֫᩶ۗ;)V

    .line 294
    sget-object v6, Ll/ۧ۟ۗ;->ۤۙ:Ll/ۧ۟ۗ;

    invoke-virtual {v7, v6}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v8

    check-cast v8, Ll/۟ᩳۗ;

    if-eqz v8, :cond_3

    .line 297
    invoke-virtual {v8}, Ll/۟ᩳۗ;->ۙ()Ll/᩷ۡۗ;

    move-result-object v8

    invoke-static {v8, v7}, Ll/᩻᩷᩵;->ۤ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 298
    invoke-virtual {v7, v6}, Ll/ܺ۟ۗ;->ۤ(Ll/֫᩶ۗ;)V

    .line 273
    :cond_3
    invoke-virtual {v9}, Ll/ۤ۠ۗ;->ۙ()Ll/ᩴ۠ۗ;

    move-result-object v6

    .line 274
    invoke-virtual {v7}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_4

    .line 275
    invoke-virtual {v6, v7}, Ll/ᩴ۠ۗ;->᩷(Ll/᩷ۡۗ;)V

    .line 276
    invoke-virtual {v7, v9}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 277
    invoke-virtual {v6, v7}, Ll/ᩴ۠ۗ;->ۙ(Ll/᩷ۡۗ;)V

    .line 278
    invoke-static {v0, v7, v7}, Ll/᩹֫᩵;->᩷(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Ljava/util/LinkedHashSet;

    move-result-object v8

    .line 279
    new-instance v10, Ll/᩹۬ۗ;

    invoke-direct {v10, v5, v6}, Ll/᩹۬ۗ;-><init>(ILjava/lang/Object;)V

    invoke-static {v8, v10}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    goto :goto_1

    .line 282
    :cond_4
    invoke-virtual {v7}, Ll/᩷ۡۗ;->᩻ۙ()I

    move-result v5

    invoke-static {v0, v5}, Ll/᩻᩷᩵;->ۙ(Ll/ۖۡۗ;I)Ll/᩷ۡۗ;

    move-result-object v5

    .line 283
    sget-object v8, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v5, v8}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 284
    invoke-virtual {v5, v9}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 285
    invoke-static {v5, v7}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 286
    invoke-virtual {v6, v5}, Ll/ᩴ۠ۗ;->᩷(Ll/᩷ۡۗ;)V

    .line 287
    invoke-virtual {v6, v5}, Ll/ᩴ۠ۗ;->ۙ(Ll/᩷ۡۗ;)V

    .line 625
    :goto_1
    invoke-virtual {v9}, Ll/ۤ۠ۗ;->ۙ()Ll/ᩴ۠ۗ;

    move-result-object v5

    .line 626
    invoke-virtual {v5}, Ll/ᩴ۠ۗ;->᩷()Ll/֫֨ۗ;

    move-result-object v6

    .line 627
    invoke-static {v7}, Ll/᩹֫᩵;->᩷(Ll/᩹ۡۗ;)Ll/ᩳۡۗ;

    move-result-object v7

    if-eqz v7, :cond_5

    .line 628
    invoke-virtual {v7}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v8

    sget-object v10, Ll/᩺ۢۗ;->᩵ۙ:Ll/᩺ۢۗ;

    if-ne v8, v10, :cond_5

    .line 630
    invoke-virtual {v7}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v8

    invoke-virtual {v8}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v8

    .line 31
    new-instance v10, Ll/ۛ֨ۗ;

    invoke-direct {v10, v8, v6}, Ll/ۛ֨ۗ;-><init>(ILl/֫֨ۗ;)V

    .line 631
    invoke-virtual {v10, v7}, Ll/ܺ۟ۗ;->ۙ(Ll/ܺ۟ۗ;)V

    .line 632
    invoke-virtual {v7, v10}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    .line 633
    sget-object v6, Ll/֫۟ۗ;->ۤۙ:Ll/֫۟ۗ;

    invoke-virtual {v7, v6}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 634
    sget-object v6, Ll/֫۟ۗ;->ۜ:Ll/֫۟ۗ;

    invoke-virtual {v10, v6}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 635
    invoke-virtual {v5, v10}, Ll/ᩴ۠ۗ;->ۙ(Ll/ܺ֨ۗ;)V

    .line 636
    invoke-virtual {v7, v9}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    goto :goto_2

    .line 640
    :cond_5
    new-instance v7, Ll/᩵֨ۗ;

    const-string v8, "unused"

    invoke-direct {v7, v6, v8}, Ll/᩵֨ۗ;-><init>(Ll/֫֨ۗ;Ljava/lang/String;)V

    invoke-virtual {v5, v7}, Ll/ᩴ۠ۗ;->ۙ(Ll/ܺ֨ۗ;)V

    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 64
    :cond_6
    invoke-static/range {p0 .. p0}, Ll/۠֫᩵;->ۙ(Ll/ۖۡۗ;)Z

    move-result v1

    sget-object v2, Ll/ۧ۟ۗ;->ۧ:Ll/ۧ۟ۗ;

    if-eqz v1, :cond_19

    .line 134
    invoke-virtual/range {p0 .. p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    .line 135
    new-instance v4, Ljava/util/IdentityHashMap;

    invoke-direct {v4}, Ljava/util/IdentityHashMap;-><init>()V

    .line 136
    new-instance v5, Ll/ܺ۬ۗ;

    invoke-direct {v5, v4, v0, v3}, Ll/ܺ۬ۗ;-><init>(Ljava/lang/Object;Ll/ۖۡۗ;I)V

    invoke-static {v1, v5}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 140
    :cond_7
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    sub-int/2addr v5, v3

    const/4 v7, 0x0

    :goto_3
    if-ltz v5, :cond_f

    .line 141
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩷ۡۗ;

    .line 142
    new-instance v9, Ljava/util/BitSet;

    invoke-virtual/range {p0 .. p0}, Ll/ۖۡۗ;->ۢۙ()I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/BitSet;-><init>(I)V

    .line 143
    invoke-virtual {v8}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/᩷ۡۗ;

    .line 144
    invoke-virtual {v4, v11}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/BitSet;

    invoke-virtual {v9, v11}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    goto :goto_4

    .line 146
    :cond_8
    invoke-virtual {v8}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v10

    .line 147
    check-cast v10, Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v11

    sub-int/2addr v11, v3

    :goto_5
    if-ltz v11, :cond_d

    .line 148
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ᩳۡۗ;

    .line 149
    invoke-virtual {v12}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v13

    if-eqz v13, :cond_9

    .line 150
    invoke-virtual {v12}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v13

    invoke-virtual {v13}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v13

    invoke-virtual {v9, v13}, Ljava/util/BitSet;->clear(I)V

    .line 152
    :cond_9
    invoke-virtual {v12}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v13

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_a
    :goto_6
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_b

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/ܺ֨ۗ;

    .line 153
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v15, v14, Ll/ۛ֨ۗ;

    if-eqz v15, :cond_a

    .line 154
    check-cast v14, Ll/ۛ֨ۗ;

    invoke-virtual {v14}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v14

    invoke-virtual {v9, v14}, Ljava/util/BitSet;->set(I)V

    goto :goto_6

    .line 157
    :cond_b
    invoke-virtual {v12, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v12

    check-cast v12, Ll/᩷۠ۗ;

    if-eqz v12, :cond_c

    .line 159
    invoke-virtual {v12}, Ll/᩷۠ۗ;->᩷()Ljava/util/List;

    move-result-object v12

    check-cast v12, Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_7
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_c

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ᩴ۠ۗ;

    .line 160
    invoke-virtual {v13}, Ll/ᩴ۠ۗ;->ܳ()Ll/᩷ۡۗ;

    move-result-object v13

    invoke-virtual {v4, v13}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/BitSet;

    invoke-virtual {v9, v13}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    goto :goto_7

    :cond_c
    add-int/lit8 v11, v11, -0x1

    goto :goto_5

    .line 164
    :cond_d
    invoke-virtual {v4, v8}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/util/BitSet;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_e

    .line 165
    invoke-virtual {v4, v8, v9}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v7, 0x1

    :cond_e
    add-int/lit8 v5, v5, -0x1

    goto/16 :goto_3

    :cond_f
    if-nez v7, :cond_7

    .line 89
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual/range {p0 .. p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v5

    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_15

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩷ۡۗ;

    .line 90
    new-instance v7, Ljava/util/BitSet;

    invoke-virtual/range {p0 .. p0}, Ll/ۖۡۗ;->ۢۙ()I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/BitSet;-><init>(I)V

    .line 91
    invoke-virtual {v5}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_11
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_12

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ᩳۡۗ;

    .line 92
    invoke-virtual {v9, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v9

    check-cast v9, Ll/᩷۠ۗ;

    if-eqz v9, :cond_11

    .line 94
    invoke-virtual {v9}, Ll/᩷۠ۗ;->᩷()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_8
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_11

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ᩴ۠ۗ;

    .line 95
    invoke-virtual {v10}, Ll/ᩴ۠ۗ;->ܳ()Ll/᩷ۡۗ;

    move-result-object v10

    invoke-virtual {v4, v10}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/BitSet;

    invoke-virtual {v7, v10}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    goto :goto_8

    :cond_12
    const/4 v8, 0x0

    .line 100
    :goto_9
    invoke-virtual {v5}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    sub-int/2addr v9, v3

    if-ge v8, v9, :cond_10

    .line 101
    invoke-virtual {v5}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/util/ArrayList;

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ᩳۡۗ;

    invoke-virtual {v9}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v9

    if-eqz v9, :cond_14

    .line 102
    invoke-virtual {v9}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v9

    invoke-virtual {v7, v9}, Ljava/util/BitSet;->get(I)Z

    move-result v9

    if-eqz v9, :cond_14

    .line 175
    invoke-virtual {v5}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v9

    add-int/lit8 v8, v8, 0x1

    .line 176
    check-cast v9, Ljava/util/ArrayList;

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ᩳۡۗ;

    invoke-virtual {v10}, Ll/ᩳۡۗ;->getOffset()I

    move-result v10

    invoke-static {v0, v10}, Ll/᩻᩷᩵;->ۙ(Ll/ۖۡۗ;I)Ll/᩷ۡۗ;

    move-result-object v10

    .line 177
    invoke-virtual {v10, v5}, Ll/ܺ۟ۗ;->ۙ(Ll/ܺ۟ۗ;)V

    .line 178
    invoke-virtual {v10, v6}, Ll/ܺ۟ۗ;->ۤ(Ll/֫᩶ۗ;)V

    .line 179
    invoke-virtual {v10}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v11

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v12

    invoke-virtual {v9, v8, v12}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v12

    check-cast v11, Ljava/util/ArrayList;

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 180
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v11

    invoke-virtual {v9, v8, v11}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->clear()V

    .line 181
    new-instance v8, Ljava/util/ArrayList;

    invoke-virtual {v5}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_13

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩷ۡۗ;

    .line 182
    invoke-static {v5, v9}, Ll/᩻᩷᩵;->ۤ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 183
    invoke-static {v10, v9}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    goto :goto_a

    .line 185
    :cond_13
    invoke-static {v5, v10}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    const/4 v8, -0x1

    move-object v5, v10

    :cond_14
    add-int/2addr v8, v3

    goto/16 :goto_9

    .line 108
    :cond_15
    invoke-virtual/range {p0 .. p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_16

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ۡۗ;

    .line 109
    invoke-virtual {v4, v2}, Ll/ܺ۟ۗ;->ۤ(Ll/֫᩶ۗ;)V

    .line 110
    sget-object v5, Ll/֫۟ۗ;->ܺ᩷:Ll/֫۟ۗ;

    invoke-virtual {v4, v5}, Ll/ܺ۟ۗ;->ۤ(Ll/֫۟ۗ;)V

    .line 111
    sget-object v5, Ll/֫۟ۗ;->ܽ᩷:Ll/֫۟ۗ;

    invoke-virtual {v4, v5}, Ll/ܺ۟ۗ;->ۤ(Ll/֫۟ۗ;)V

    goto :goto_b

    .line 113
    :cond_16
    invoke-static/range {p0 .. p0}, Ll/۠ۙ᩵;->᩷(Ll/ۖۡۗ;)V

    .line 114
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual/range {p0 .. p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_17
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_18

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ۡۗ;

    .line 115
    invoke-virtual {v4, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v5

    check-cast v5, Ll/᩷۠ۗ;

    if-eqz v5, :cond_17

    .line 117
    invoke-static {v4, v0}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/ۖۡۗ;)Ll/᩷ۡۗ;

    move-result-object v6

    .line 118
    sget-object v7, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v6, v7}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 119
    sget-object v7, Ll/֫۟ۗ;->᩻ۙ:Ll/֫۟ۗ;

    invoke-virtual {v6, v7}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 120
    new-instance v7, Ll/ܰᩳۗ;

    invoke-direct {v7, v4}, Ll/ܰᩳۗ;-><init>(Ll/᩷ۡۗ;)V

    invoke-virtual {v6, v7}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 121
    invoke-virtual {v5}, Ll/᩷۠ۗ;->᩷()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_17

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩴ۠ۗ;

    .line 122
    invoke-virtual {v5}, Ll/ᩴ۠ۗ;->ܳ()Ll/᩷ۡۗ;

    move-result-object v5

    invoke-static {v6, v5}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    goto :goto_c

    .line 126
    :cond_18
    invoke-virtual/range {p0 .. p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ll/۟ܿۗ;

    invoke-direct {v2, v3}, Ll/۟ܿۗ;-><init>(I)V

    invoke-static {v1, v2}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 127
    new-instance v1, Ll/ܿۧ᩵;

    invoke-direct {v1, v0}, Ll/ܿۧ᩵;-><init>(Ll/ۖۡۗ;)V

    .line 128
    new-instance v2, Ll/۬֨ۗ;

    invoke-direct {v2, v3, v1}, Ll/۬֨ۗ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v2}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ljava/util/function/Consumer;)V

    .line 129
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-static {v0, v2, v1}, Ll/۠ۙ᩵;->ۙ(Ll/ۖۡۗ;Ljava/util/List;Ll/ܿۧ᩵;)V

    return v3

    .line 303
    :cond_19
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 304
    invoke-virtual/range {p0 .. p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩷ۡۗ;

    .line 305
    invoke-virtual {v6, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v7

    check-cast v7, Ll/᩷۠ۗ;

    if-eqz v7, :cond_1a

    .line 307
    invoke-virtual {v7}, Ll/᩷۠ۗ;->᩷()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ᩴ۠ۗ;

    .line 308
    new-instance v9, Ll/ᩴۡۗ;

    const/4 v10, 0x6

    invoke-direct {v9, v10}, Ll/ᩴۡۗ;-><init>(I)V

    .line 309
    invoke-static {v1, v8, v9}, Ll/ۧۚۗ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    .line 310
    invoke-interface {v8, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_d

    .line 318
    :cond_1b
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1c

    .line 320
    invoke-virtual/range {p0 .. p0}, Ll/ۖۡۗ;->ܶۙ()Ljava/util/List;

    move-result-object v4

    new-instance v6, Ll/ۡۙ᩵;

    invoke-direct {v6, v0}, Ll/ۡۙ᩵;-><init>(Ll/ۖۡۗ;)V

    invoke-static {v4, v6}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    goto :goto_e

    .line 323
    :cond_1c
    new-instance v4, Ll/ۖۙ᩵;

    invoke-direct {v4, v0}, Ll/ۖۙ᩵;-><init>(Ll/ۖۡۗ;)V

    invoke-static {v1, v4}, Ll/ۧۚۗ;->forEach(Ljava/util/Map;Ljava/util/function/BiConsumer;)V

    .line 329
    :goto_e
    invoke-static/range {p0 .. p0}, Ll/᩻᩷᩵;->᩷(Ll/ۖۡۗ;)V

    .line 330
    invoke-virtual/range {p0 .. p0}, Ll/ۖۡۗ;->ۜ()V

    .line 331
    invoke-virtual/range {p0 .. p0}, Ll/ۖۡۗ;->᩻᩷()Z

    move-result v4

    const/4 v6, 0x3

    if-eqz v4, :cond_1d

    .line 332
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto/16 :goto_17

    .line 335
    :cond_1d
    new-instance v4, Ll/ᩴۚ᩵;

    invoke-direct {v4, v3}, Ll/ᩴۚ᩵;-><init>(I)V

    invoke-static {v1, v4}, Ll/ۧۚۗ;->forEach(Ljava/util/Map;Ljava/util/function/BiConsumer;)V

    .line 340
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 341
    new-instance v7, Ll/᩶ۙ᩵;

    invoke-direct {v7, v4}, Ll/᩶ۙ᩵;-><init>(Ljava/util/ArrayList;)V

    invoke-static {v1, v7}, Ll/ۧۚۗ;->forEach(Ljava/util/Map;Ljava/util/function/BiConsumer;)V

    .line 346
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-le v1, v3, :cond_24

    .line 374
    :goto_f
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_24

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۫۠ۗ;

    .line 375
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_1f
    :goto_10
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1e

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/۫۠ۗ;

    if-eq v7, v9, :cond_1f

    .line 376
    invoke-virtual {v9}, Ll/۫۠ۗ;->᩻()Ll/۫۠ۗ;

    move-result-object v10

    if-eqz v10, :cond_20

    goto :goto_10

    .line 389
    :cond_20
    invoke-virtual {v7}, Ll/۫۠ۗ;->ۙ()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v9}, Ll/۫۠ۗ;->ۙ()Ljava/util/List;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_21

    .line 391
    invoke-virtual {v7}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v9}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

    move-result-object v8

    invoke-static {v1, v8}, Ll/ۛܿۗ;->ۙ(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 392
    new-instance v8, Ll/۫۠ۗ;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v10

    invoke-virtual {v7}, Ll/۫۠ۗ;->ۙ()Ljava/util/List;

    move-result-object v11

    invoke-direct {v8, v10, v1, v11}, Ll/۫۠ۗ;-><init>(ILjava/util/List;Ljava/util/List;)V

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 393
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 394
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_f

    .line 398
    :cond_21
    invoke-virtual {v9}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

    move-result-object v10

    invoke-static {v10}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v10

    new-instance v11, Ll/᩶֨ۗ;

    invoke-direct {v11, v6}, Ll/᩶֨ۗ;-><init>(I)V

    .line 399
    invoke-interface {v10, v11}, Ll/᩵ܺۗ;->flatMap(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v10

    .line 400
    invoke-static {}, Ll/֫ܺۗ;->toSet()Ll/ۚܺۗ;

    move-result-object v11

    invoke-interface {v10, v11}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Set;

    .line 401
    invoke-static {v10}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v11

    .line 429
    new-instance v12, Ll/ۢۙ᩵;

    invoke-direct {v12, v7}, Ll/ۢۙ᩵;-><init>(Ll/۫۠ۗ;)V

    .line 401
    invoke-interface {v11, v12}, Ll/᩵ܺۗ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result v11

    .line 402
    invoke-virtual {v9}, Ll/۫۠ۗ;->ۙ()Ljava/util/List;

    move-result-object v12

    invoke-static {v12}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v12

    .line 429
    new-instance v13, Ll/ۢۙ᩵;

    invoke-direct {v13, v7}, Ll/ۢۙ᩵;-><init>(Ll/۫۠ۗ;)V

    .line 402
    invoke-interface {v12, v13}, Ll/᩵ܺۗ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result v12

    .line 403
    invoke-virtual {v7}, Ll/۫۠ۗ;->ۙ()Ljava/util/List;

    move-result-object v13

    invoke-static {v13}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v13

    new-instance v14, Ll/ᩳ᩸ۘ;

    invoke-direct {v14, v3, v10}, Ll/ᩳ᩸ۘ;-><init>(ILjava/lang/Object;)V

    invoke-interface {v13, v14}, Ll/᩵ܺۗ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result v10

    if-eqz v11, :cond_23

    if-nez v12, :cond_22

    if-eqz v10, :cond_23

    .line 407
    :cond_22
    invoke-virtual {v7}, Ll/۫۠ۗ;->ۙ()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v9}, Ll/۫۠ۗ;->ۙ()Ljava/util/List;

    move-result-object v11

    invoke-static {v10, v11}, Ll/ۛܿۗ;->ۙ(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v10

    .line 408
    invoke-virtual {v9}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

    move-result-object v11

    invoke-virtual {v7}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 409
    invoke-virtual {v9, v7}, Ll/۫۠ۗ;->᩷(Ll/۫۠ۗ;)V

    .line 410
    invoke-virtual {v7, v9}, Ll/۫۠ۗ;->ۙ(Ll/۫۠ۗ;)V

    .line 411
    invoke-virtual {v7, v10}, Ll/۫۠ۗ;->ۙ(Ljava/util/List;)V

    goto/16 :goto_10

    .line 414
    :cond_23
    new-instance v10, Ljava/util/HashSet;

    invoke-virtual {v9}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

    move-result-object v11

    invoke-direct {v10, v11}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 415
    invoke-virtual {v7}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v10

    if-eqz v10, :cond_1f

    .line 417
    invoke-virtual {v7}, Ll/۫۠ۗ;->ۙ()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v9}, Ll/۫۠ۗ;->ۙ()Ljava/util/List;

    move-result-object v8

    invoke-static {v1, v8}, Ll/ۛܿۗ;->ۙ(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 418
    invoke-virtual {v7}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v9}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

    move-result-object v10

    invoke-static {v8, v10}, Ll/ۛܿۗ;->ۙ(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    .line 419
    new-instance v10, Ll/۫۠ۗ;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v11

    invoke-direct {v10, v11, v8, v1}, Ll/۫۠ۗ;-><init>(ILjava/util/List;Ljava/util/List;)V

    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 420
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 421
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto/16 :goto_f

    .line 660
    :cond_24
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v7, 0x0

    :cond_25
    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/۫۠ۗ;

    .line 672
    invoke-virtual {v8}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    if-ge v9, v5, :cond_26

    goto/16 :goto_13

    .line 675
    :cond_26
    invoke-virtual {v8}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_27
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_29

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ᩴ۠ۗ;

    .line 676
    invoke-virtual {v10}, Ll/ᩴ۠ۗ;->ۤ()Ljava/util/ArrayList;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-eq v11, v3, :cond_28

    goto/16 :goto_13

    .line 679
    :cond_28
    invoke-virtual {v10}, Ll/ᩴ۠ۗ;->ܳ()Ll/᩷ۡۗ;

    move-result-object v10

    .line 680
    invoke-virtual {v10}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ne v11, v3, :cond_2d

    sget-object v11, Ll/᩺ۢۗ;->᩵ۙ:Ll/᩺ۢۗ;

    .line 681
    invoke-static {v10, v11}, Ll/᩹֫᩵;->ۙ(Ll/᩹ۡۗ;Ll/᩺ۢۗ;)Z

    move-result v10

    if-nez v10, :cond_27

    goto/16 :goto_13

    .line 685
    :cond_29
    invoke-virtual {v8}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

    move-result-object v9

    new-instance v10, Ll/ۛۧᩴ;

    const/4 v11, 0x5

    invoke-direct {v10, v11}, Ll/ۛۧᩴ;-><init>(I)V

    invoke-static {v9, v10}, Ll/ۜ֫᩵;->ۙ(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    move-result-object v9

    .line 686
    invoke-static {v9}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v10

    new-instance v12, Ll/ᩳۡۤ;

    invoke-direct {v12, v11}, Ll/ᩳۡۤ;-><init>(I)V

    .line 687
    invoke-interface {v10, v12}, Ll/᩵ܺۗ;->flatMap(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v10

    .line 688
    invoke-interface {v10}, Ll/᩵ܺۗ;->distinct()Ll/᩵ܺۗ;

    move-result-object v10

    .line 689
    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object v12

    invoke-interface {v10, v12}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/List;

    .line 690
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v12

    if-eq v12, v3, :cond_2a

    goto :goto_13

    :cond_2a
    const/4 v12, 0x0

    .line 693
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩷ۡۗ;

    .line 694
    invoke-virtual {v10}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v10

    .line 47
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v12

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v13

    if-eq v12, v13, :cond_2b

    const/4 v9, 0x0

    goto :goto_12

    .line 50
    :cond_2b
    invoke-interface {v10, v9}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v9

    :goto_12
    if-nez v9, :cond_2c

    goto :goto_13

    .line 697
    :cond_2c
    invoke-virtual {v8}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

    move-result-object v9

    invoke-static {v9}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v9

    new-instance v10, Ll/ۡᩴ᩺;

    invoke-direct {v10, v11}, Ll/ۡᩴ᩺;-><init>(I)V

    .line 698
    invoke-interface {v9, v10}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v9

    .line 699
    invoke-interface {v9}, Ll/᩵ܺۗ;->distinct()Ll/᩵ܺۗ;

    move-result-object v9

    .line 700
    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object v10

    invoke-interface {v9, v10}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    .line 701
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    if-eq v9, v3, :cond_2e

    :cond_2d
    :goto_13
    const/4 v8, 0x0

    goto :goto_14

    .line 706
    :cond_2e
    invoke-virtual {v8}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

    move-result-object v9

    const/4 v10, 0x0

    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ᩴ۠ۗ;

    .line 707
    invoke-virtual {v8}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

    move-result-object v8

    new-instance v10, Ll/ܿۙ᩵;

    invoke-direct {v10, v0, v9}, Ll/ܿۙ᩵;-><init>(Ll/ۖۡۗ;Ll/ᩴ۠ۗ;)V

    invoke-static {v8, v10}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    const/4 v8, 0x1

    :goto_14
    if-eqz v8, :cond_25

    const/4 v7, 0x1

    goto/16 :goto_11

    :cond_2f
    if-eqz v7, :cond_30

    .line 666
    invoke-static/range {p0 .. p0}, Ll/᩻᩷᩵;->᩷(Ll/ۖۡۗ;)V

    .line 667
    invoke-virtual/range {p0 .. p0}, Ll/ۖۡۗ;->ۜ()V

    .line 367
    :cond_30
    new-instance v1, Ll/֡ۙ᩵;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v4, v1}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 368
    new-instance v1, Ll/ܿۧ᩺;

    invoke-direct {v1, v6}, Ll/ܿۧ᩺;-><init>(I)V

    invoke-static {v4, v1}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 369
    invoke-virtual/range {p0 .. p0}, Ll/ۖۡۗ;->ۜ()V

    .line 370
    invoke-static/range {p0 .. p0}, Ll/᩻᩷᩵;->᩷(Ll/ۖۡۗ;)V

    .line 719
    invoke-virtual/range {p0 .. p0}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֫ۖۗ;->ܽۙ()Ll/۠ܳ᩵;

    move-result-object v1

    .line 720
    invoke-virtual {v1}, Ll/۠ܳ᩵;->᩷()Ljava/util/Comparator;

    move-result-object v1

    .line 721
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_15
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_32

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۫۠ۗ;

    .line 722
    invoke-virtual {v7}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_16
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_31

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ᩴ۠ۗ;

    .line 723
    invoke-virtual {v9}, Ll/ᩴ۠ۗ;->ᩴ()Ljava/util/ArrayList;

    move-result-object v9

    new-instance v10, Ll/۟ۙ᩵;

    invoke-direct {v10, v1}, Ll/۟ۙ᩵;-><init>(Ljava/util/Comparator;)V

    invoke-static {v9, v10}, Ll/۫ۚۗ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    goto :goto_16

    .line 725
    :cond_31
    invoke-virtual {v7}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

    move-result-object v8

    new-instance v9, Ll/ᩳۙ᩵;

    invoke-direct {v9, v7, v1}, Ll/ᩳۙ᩵;-><init>(Ll/۫۠ۗ;Ljava/util/Comparator;)V

    invoke-static {v8, v9}, Ll/۫ۚۗ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    goto :goto_15

    :cond_32
    move-object v1, v4

    .line 195
    :goto_17
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_33

    goto/16 :goto_29

    .line 198
    :cond_33
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    mul-int/lit8 v4, v4, 0x3

    .line 200
    new-instance v6, Ljava/util/ArrayDeque;

    invoke-direct {v6, v1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    const/4 v7, 0x0

    .line 201
    :goto_18
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_51

    .line 202
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/۫۠ۗ;

    .line 441
    invoke-virtual {v8}, Ll/۫۠ۗ;->ۙ()Ljava/util/List;

    move-result-object v9

    .line 548
    invoke-static {v9}, Ll/᩹֫᩵;->᩷(Ljava/util/List;)Ll/᩷ۡۗ;

    move-result-object v10

    if-eqz v10, :cond_34

    .line 567
    invoke-virtual {v10}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v11

    if-ne v11, v3, :cond_37

    invoke-virtual {v10, v2}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v11

    if-nez v11, :cond_37

    .line 569
    invoke-virtual {v10}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v10

    :goto_19
    const/4 v11, 0x0

    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩷ۡۗ;

    goto :goto_1a

    :cond_34
    const/4 v10, 0x0

    .line 975
    invoke-static/range {p0 .. p0}, Ll/᩹֫᩵;->᩷(Ll/ۖۡۗ;)Ljava/util/BitSet;

    move-result-object v11

    .line 977
    invoke-virtual/range {p0 .. p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v12

    invoke-virtual {v11, v10, v12}, Ljava/util/BitSet;->set(II)V

    .line 978
    new-instance v12, Ll/ܺ֫᩵;

    invoke-direct {v12, v10, v11}, Ll/ܺ֫᩵;-><init>(ILjava/lang/Object;)V

    invoke-static {v9, v12}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 980
    invoke-static/range {p0 .. p0}, Ll/᩹֫᩵;->᩷(Ll/ۖۡۗ;)Ljava/util/BitSet;

    move-result-object v12

    .line 981
    invoke-virtual {v12, v11}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    .line 982
    new-instance v13, Ll/ܽ֫᩵;

    invoke-direct {v13, v10, v12}, Ll/ܽ֫᩵;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v11, v13}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ljava/util/BitSet;Ljava/util/function/Consumer;)V

    .line 989
    invoke-static {v0, v12}, Ll/᩹֫᩵;->᩷(Ll/ۖۡۗ;Ljava/util/BitSet;)Ll/᩷ۡۗ;

    move-result-object v11

    if-eqz v11, :cond_50

    .line 555
    invoke-virtual {v11}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v12

    if-ne v12, v3, :cond_35

    .line 556
    invoke-virtual {v11}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩷ۡۗ;

    .line 557
    invoke-interface {v9, v10}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_35

    goto :goto_1a

    .line 567
    :cond_35
    invoke-virtual {v11}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    if-ne v10, v3, :cond_36

    invoke-virtual {v11, v2}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v10

    if-nez v10, :cond_36

    .line 569
    invoke-virtual {v11}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v10

    goto :goto_19

    :cond_36
    move-object v10, v11

    .line 443
    :cond_37
    :goto_1a
    invoke-virtual {v10}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_38

    invoke-virtual/range {p0 .. p0}, Ll/ۖۡۗ;->ܽۙ()Ll/᩷ۡۗ;

    move-result-object v11

    if-eq v10, v11, :cond_38

    .line 205
    invoke-virtual {v6, v8}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    goto/16 :goto_28

    :cond_38
    const/4 v11, 0x0

    .line 888
    invoke-static {v9, v11}, Ll/᩹֫᩵;->ۙ(Ljava/util/List;Z)Ll/᩷ۡۗ;

    move-result-object v11

    if-eqz v11, :cond_39

    goto :goto_1c

    .line 584
    :cond_39
    invoke-static {v0, v9}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ljava/util/List;)Ll/᩷ۡۗ;

    move-result-object v11

    if-nez v11, :cond_3a

    const/4 v11, 0x0

    goto :goto_1c

    .line 588
    :cond_3a
    new-instance v12, Ljava/util/ArrayList;

    invoke-virtual {v11}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 589
    invoke-virtual {v12, v9}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 590
    invoke-static {v12}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v12

    new-instance v13, Ll/ܿ֫᩵;

    invoke-direct {v13, v5, v9}, Ll/ܿ֫᩵;-><init>(ILjava/lang/Object;)V

    .line 591
    invoke-interface {v12, v13}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object v5

    .line 592
    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object v12

    invoke-interface {v5, v12}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 595
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_3d

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v12

    invoke-virtual {v11}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v13

    if-ne v12, v13, :cond_3b

    goto :goto_1c

    .line 599
    :cond_3b
    invoke-static {v11, v0}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/ۖۡۗ;)Ll/᩷ۡۗ;

    move-result-object v12

    .line 600
    sget-object v13, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v12, v13}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 601
    new-instance v13, Ll/۠۟ۗ;

    invoke-direct {v13, v11}, Ll/۠۟ۗ;-><init>(Ll/᩷ۡۗ;)V

    invoke-virtual {v12, v13}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 602
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_3c

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/᩷ۡۗ;

    .line 604
    invoke-static {v13, v12, v11}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    goto :goto_1b

    :cond_3c
    move-object v11, v12

    :cond_3d
    :goto_1c
    if-eqz v11, :cond_3e

    .line 240
    sget-object v5, Ll/֫۟ۗ;->ᩴ᩷:Ll/֫۟ۗ;

    invoke-virtual {v11, v5}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v5

    if-eqz v5, :cond_3e

    .line 453
    invoke-static {v11, v0}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/ۖۡۗ;)Ll/᩷ۡۗ;

    move-result-object v5

    .line 454
    sget-object v12, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v5, v12}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    move-object/from16 v18, v11

    move-object v11, v5

    move-object/from16 v5, v18

    goto :goto_1d

    :cond_3e
    const/4 v5, 0x0

    .line 529
    :goto_1d
    invoke-virtual/range {p0 .. p0}, Ll/ۖۡۗ;->ܽۙ()Ll/᩷ۡۗ;

    move-result-object v12

    if-ne v10, v12, :cond_3f

    .line 530
    invoke-virtual/range {p0 .. p0}, Ll/ۖۡۗ;->ܽۙ()Ll/᩷ۡۗ;

    move-result-object v10

    invoke-virtual {v10}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v10

    const/4 v12, 0x0

    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩷ۡۗ;

    .line 531
    invoke-static {v10, v0}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/ۖۡۗ;)Ll/᩷ۡۗ;

    move-result-object v10

    goto :goto_1f

    .line 533
    :cond_3f
    invoke-virtual {v10}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v12

    sget-object v13, Ll/֫۟ۗ;->᩻ۙ:Ll/֫۟ۗ;

    invoke-static {v12, v13}, Ll/᩹֫᩵;->ۙ(Ljava/util/List;Ll/֫۟ۗ;)Ll/᩷ۡۗ;

    move-result-object v12

    if-eqz v12, :cond_40

    :goto_1e
    move-object v10, v12

    goto :goto_1f

    .line 538
    :cond_40
    invoke-virtual {v10}, Ll/᩷ۡۗ;->۠()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v12

    if-ne v12, v3, :cond_41

    invoke-virtual {v10}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v12

    check-cast v12, Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_41

    .line 539
    invoke-virtual {v10}, Ll/᩷ۡۗ;->۠()Ljava/util/List;

    move-result-object v12

    invoke-static {v12, v13}, Ll/᩹֫᩵;->ۙ(Ljava/util/List;Ll/֫۟ۗ;)Ll/᩷ۡۗ;

    move-result-object v12

    if-eqz v12, :cond_41

    .line 540
    invoke-virtual {v12}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v13

    if-ne v13, v3, :cond_41

    goto :goto_1e

    .line 544
    :cond_41
    invoke-static {v10, v0}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/ۖۡۗ;)Ll/᩷ۡۗ;

    move-result-object v10

    .line 462
    :goto_1f
    sget-object v12, Ll/֫۟ۗ;->᩻ۙ:Ll/֫۟ۗ;

    invoke-virtual {v10, v12}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 463
    sget-object v12, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v10, v12}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 465
    invoke-virtual {v8}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

    move-result-object v13

    invoke-static {v13}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v13

    new-instance v14, Ll/֨ۙ᩵;

    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    invoke-interface {v13, v14}, Ll/᩵ܺۗ;->mapToInt(Ljava/util/function/ToIntFunction;)Ll/ܽܺۗ;

    move-result-object v13

    invoke-interface {v13}, Ll/ܽܺۗ;->sum()I

    move-result v13

    if-eqz v11, :cond_46

    if-nez v13, :cond_42

    goto :goto_24

    .line 471
    :cond_42
    invoke-virtual {v11}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v13

    sget-object v14, Ll/֫۟ۗ;->ۧۙ:Ll/֫۟ۗ;

    invoke-static {v13, v14}, Ll/᩹֫᩵;->ۙ(Ljava/util/List;Ll/֫۟ۗ;)Ll/᩷ۡۗ;

    move-result-object v13

    if-eqz v13, :cond_43

    goto :goto_20

    :cond_43
    const/4 v13, -0x1

    .line 472
    invoke-static {v0, v13}, Ll/᩻᩷᩵;->ۙ(Ll/ۖۡۗ;I)Ll/᩷ۡۗ;

    move-result-object v13

    .line 473
    :goto_20
    invoke-virtual {v13, v14}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 474
    invoke-virtual {v13, v12}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 475
    invoke-static {v11, v13}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    if-eqz v5, :cond_47

    .line 478
    invoke-virtual {v11}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v12

    invoke-static {v0, v12}, Ll/ܿۧ᩵;->ۙ(Ll/ۖۡۗ;Ljava/util/List;)Ll/ܿۧ᩵;

    move-result-object v12

    .line 479
    invoke-virtual {v8}, Ll/۫۠ۗ;->ܳ()Ljava/util/List;

    move-result-object v14

    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_21
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_47

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/ᩴ۠ۗ;

    .line 480
    invoke-virtual {v15}, Ll/ᩴ۠ۗ;->ۤ()Ljava/util/ArrayList;

    move-result-object v16

    .line 85
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_22
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_45

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v3, v17

    check-cast v3, Ll/᩷ۡۗ;

    .line 86
    invoke-virtual {v12, v3}, Ll/ܿۧ᩵;->ۤ(Ll/᩷ۡۗ;)Z

    move-result v3

    if-eqz v3, :cond_44

    .line 481
    invoke-virtual {v15}, Ll/ᩴ۠ۗ;->ۤ()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v12, v3}, Ll/ܿۧ᩵;->ۙ(Ljava/util/ArrayList;)Ll/ܿۧ᩵;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܿۧ᩵;->᩷()Ll/᩷ۡۗ;

    move-result-object v3

    if-eqz v3, :cond_45

    .line 483
    invoke-static {v3, v11, v5}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    goto :goto_23

    :cond_44
    const/4 v3, 0x1

    goto :goto_22

    :cond_45
    :goto_23
    const/4 v3, 0x1

    goto :goto_21

    :cond_46
    :goto_24
    const/4 v13, 0x0

    .line 494
    :cond_47
    invoke-static {v8, v10, v13}, Ll/۠ۙ᩵;->ۙ(Ll/۫۠ۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    if-eqz v11, :cond_4a

    .line 500
    sget-object v3, Ll/ۧ۟ۗ;->ܺ:Ll/ۧ۟ۗ;

    invoke-virtual {v11, v3}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v5

    if-eqz v5, :cond_4a

    .line 501
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 502
    invoke-virtual {v11}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_48
    :goto_25
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_49

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/᩷ۡۗ;

    .line 503
    invoke-static {v11, v14}, Ll/᩹֫᩵;->᩷(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Z

    move-result v15

    if-eqz v15, :cond_48

    .line 504
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_25

    .line 507
    :cond_49
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_26
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_4a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩷ۡۗ;

    .line 509
    invoke-virtual {v11, v3}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v14

    check-cast v14, Ll/۠۟ۗ;

    invoke-virtual {v14}, Ll/۠۟ۗ;->ۙ()Ll/᩷ۡۗ;

    move-result-object v14

    invoke-static {v12, v11, v14}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    goto :goto_26

    .line 513
    :cond_4a
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4b
    :goto_27
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩷ۡۗ;

    .line 514
    sget-object v9, Ll/ۧ۟ۗ;->᩸ۙ:Ll/ۧ۟ۗ;

    invoke-virtual {v5, v9}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v9

    check-cast v9, Ll/۫۠ۗ;

    if-eqz v9, :cond_4c

    .line 515
    invoke-virtual {v9}, Ll/۫۠ۗ;->ۚ()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4b

    .line 516
    :cond_4c
    invoke-virtual {v5, v8}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    goto :goto_27

    .line 519
    :cond_4d
    invoke-virtual {v8, v10}, Ll/۫۠ۗ;->᩷(Ll/᩷ۡۗ;)V

    .line 521
    invoke-virtual {v10}, Ll/᩷ۡۗ;->᩹ۙ()V

    if-eqz v13, :cond_4e

    .line 523
    invoke-virtual {v13}, Ll/᩷ۡۗ;->᩹ۙ()V

    :cond_4e
    :goto_28
    add-int/lit8 v3, v7, 0x1

    if-gt v7, v4, :cond_4f

    const/4 v5, 0x2

    move v7, v3

    const/4 v3, 0x1

    goto/16 :goto_18

    .line 208
    :cond_4f
    new-instance v0, Ll/۠ۧ᩵;

    const-string v1, "Try blocks wrapping queue limit reached! Please report as an issue!"

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 208
    throw v0

    .line 563
    :cond_50
    new-instance v0, Ll/۠ۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to find top block for try-catch from: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 563
    throw v0

    .line 71
    :cond_51
    :goto_29
    sget-object v2, Ll/ۧ۟ۗ;->ᩴۙ:Ll/ۧ۟ۗ;

    invoke-virtual {v0, v2, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;Ljava/util/List;)V

    .line 72
    invoke-virtual/range {p0 .. p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v2

    new-instance v3, Ll/۟ܿۗ;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Ll/۟ܿۗ;-><init>(I)V

    invoke-static {v2, v3}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 75
    invoke-virtual/range {p0 .. p0}, Ll/ۖۡۗ;->ܶۙ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_52
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_56

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴ۠ۗ;

    .line 644
    invoke-virtual {v3}, Ll/ᩴ۠ۗ;->ۤ()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_52

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ۡۗ;

    .line 645
    new-instance v5, Ll/ۢ֫᩵;

    invoke-direct {v5, v4, v0}, Ll/ۢ֫᩵;-><init>(Ll/᩷ۡۗ;Ll/ۖۡۗ;)V

    .line 646
    invoke-virtual {v4}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_53
    :goto_2b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_55

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳۡۗ;

    .line 647
    invoke-virtual {v6}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v7

    sget-object v8, Ll/᩺ۢۗ;->ܶۙ:Ll/᩺ۢۗ;

    if-ne v7, v8, :cond_54

    goto :goto_2c

    .line 650
    :cond_54
    invoke-virtual {v6}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v7

    sget-object v8, Ll/᩺ۢۗ;->᩹ۙ:Ll/᩺ۢۗ;

    if-ne v7, v8, :cond_53

    .line 651
    invoke-virtual {v5, v6}, Ll/ۢ֫᩵;->ۙ(Ll/ᩳۡۗ;)V

    goto :goto_2b

    .line 654
    :cond_55
    :goto_2c
    invoke-virtual {v5}, Ll/ۢ֫᩵;->ۙ()V

    goto :goto_2a

    .line 78
    :cond_56
    invoke-static/range {p0 .. p0}, Ll/ܳ᩷᩵;->᩸(Ll/ۖۡۗ;)V

    .line 80
    new-instance v2, Ll/ܿۧ᩵;

    invoke-direct {v2, v0}, Ll/ܿۧ᩵;-><init>(Ll/ۖۡۗ;)V

    .line 81
    new-instance v3, Ll/۬֨ۗ;

    const/4 v4, 0x1

    invoke-direct {v3, v4, v2}, Ll/۬֨ۗ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v3}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ljava/util/function/Consumer;)V

    .line 82
    invoke-static {v0, v1, v2}, Ll/۠ۙ᩵;->ۙ(Ll/ۖۡۗ;Ljava/util/List;Ll/ܿۧ᩵;)V

    return v4
.end method

.method public static ᩷(Ll/ۖۡۗ;)V
    .locals 6

    .line 214
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    sget-object v2, Ll/ۧ۟ۗ;->ۧ:Ll/ۧ۟ۗ;

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    .line 215
    invoke-virtual {v1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۡۗ;

    .line 216
    invoke-virtual {v3, v2}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Ll/ᩳۡۗ;->ۤۙ()Z

    move-result v4

    if-nez v4, :cond_1

    .line 217
    invoke-virtual {v3, v2}, Ll/ܺ۟ۗ;->ۤ(Ll/֫᩶ۗ;)V

    goto :goto_0

    .line 222
    :cond_2
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۡۗ;

    .line 241
    invoke-virtual {v0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    move-object v4, v3

    :cond_4
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۡۗ;

    .line 242
    invoke-virtual {v5, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v5

    check-cast v5, Ll/᩷۠ۗ;

    if-eqz v5, :cond_4

    if-nez v4, :cond_5

    move-object v4, v5

    goto :goto_1

    .line 248
    :cond_5
    invoke-virtual {v4, v5}, Ll/᩷۠ۗ;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_2

    :cond_6
    move-object v3, v4

    :goto_2
    if-eqz v3, :cond_3

    .line 225
    invoke-virtual {v0, v3}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 226
    invoke-virtual {v0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۡۗ;

    .line 227
    sget-object v4, Ll/֫۟ۗ;->ܺ᩷:Ll/֫۟ۗ;

    invoke-virtual {v3, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 228
    invoke-virtual {v0, v4}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 230
    :cond_8
    sget-object v4, Ll/֫۟ۗ;->ܽ᩷:Ll/֫۟ۗ;

    invoke-virtual {v3, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 231
    invoke-virtual {v0, v4}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    goto :goto_3

    :cond_9
    return-void
.end method
