.class public final Ll/ᩳ۬ۗ;
.super Ll/ܺ۠ۗ;
.source "Z6FM"


# direct methods
.method public static ۙ(Ll/֫ۖۗ;Ljava/util/LinkedHashSet;Ljava/util/HashSet;Ll/֫֨ۗ;)I
    .locals 6

    .line 305
    sget-object v0, Ll/֫֨ۗ;->ܰ:Ll/֫֨ۗ;

    invoke-static {p3, v0}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 308
    :cond_0
    invoke-interface {p1, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    return v1

    .line 312
    :cond_1
    invoke-virtual {p0, p3}, Ll/֫ۖۗ;->ۙ(Ll/֫֨ۗ;)Ll/᩻ۡۗ;

    move-result-object v0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    .line 314
    invoke-static {v0, p1, p2}, Ll/ᩳ۬ۗ;->ۙ(Ll/᩻ۡۗ;Ljava/util/LinkedHashSet;Ljava/util/HashSet;)V

    return v2

    .line 317
    :cond_2
    invoke-virtual {p0}, Ll/֫ۖۗ;->᩷ۙ()Ll/᩷֡ۗ;

    move-result-object v0

    invoke-virtual {v0, p3}, Ll/᩷֡ۗ;->ۙ(Ll/֫֨ۗ;)Ll/ۜܿۗ;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 320
    invoke-virtual {v0}, Ll/ۜܿۗ;->᩸()[Ll/֫֨ۗ;

    move-result-object v0

    array-length v3, v0

    const/4 v4, 0x0

    :goto_1
    if-ge v1, v3, :cond_3

    aget-object v5, v0, v1

    .line 321
    invoke-static {p0, p1, p2, v5}, Ll/ᩳ۬ۗ;->ۙ(Ll/֫ۖۗ;Ljava/util/LinkedHashSet;Ljava/util/HashSet;Ll/֫֨ۗ;)I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    if-nez v4, :cond_4

    .line 324
    invoke-virtual {p3}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_4
    return v2

    .line 329
    :cond_5
    invoke-virtual {p3}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return v2
.end method

.method public static ۙ(Ll/ۖۡۗ;Ljava/util/ArrayList;Ljava/util/HashSet;Ll/ܶᩳۗ;)Ll/ܶᩳۗ;
    .locals 4

    .line 163
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    if-nez p3, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-nez p3, :cond_1

    .line 168
    invoke-static {p1}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object p1

    invoke-interface {p1}, Ll/᩵ܺۗ;->distinct()Ll/᩵ܺۗ;

    move-result-object p1

    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object p3

    invoke-interface {p1, p3}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    const/4 p3, 0x0

    .line 169
    invoke-static {p0, p1, p2, p3}, Ll/ᩳ۬ۗ;->ۙ(Ll/ۖۡۗ;Ljava/util/List;Ljava/util/Set;Z)Ll/ܶᩳۗ;

    move-result-object p0

    return-object p0

    .line 172
    :cond_1
    invoke-virtual {p3}, Ll/ܶᩳۗ;->᩷()Ljava/util/List;

    move-result-object v0

    .line 238
    invoke-static {p1}, Ll/ۘۧ᩵;->ۙ(Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_2

    move-object p1, v0

    goto :goto_0

    .line 241
    :cond_2
    invoke-static {v0}, Ll/ۘۧ᩵;->ۙ(Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    .line 244
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v3, v2

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 245
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 246
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move-object p1, v1

    .line 173
    :goto_0
    invoke-static {p1}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object p1

    invoke-interface {p1}, Ll/᩵ܺۗ;->distinct()Ll/᩵ܺۗ;

    move-result-object p1

    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 174
    invoke-virtual {p3}, Ll/ܶᩳۗ;->ۙ()Ljava/util/Set;

    move-result-object p3

    .line 251
    invoke-static {p2}, Ll/ۘۧ᩵;->ۙ(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_4

    move-object p2, p3

    goto :goto_1

    .line 254
    :cond_4
    invoke-static {p3}, Ll/ۘۧ᩵;->ۙ(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_1

    .line 257
    :cond_5
    new-instance v0, Ljava/util/HashSet;

    invoke-virtual {p2}, Ljava/util/HashSet;->size()I

    move-result v1

    invoke-interface {p3}, Ljava/util/Set;->size()I

    move-result v2

    add-int/2addr v2, v1

    invoke-direct {v0, v2}, Ljava/util/HashSet;-><init>(I)V

    .line 258
    invoke-interface {v0, p2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 259
    invoke-interface {v0, p3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    move-object p2, v0

    :goto_1
    const/4 p3, 0x1

    .line 175
    invoke-static {p0, p1, p2, p3}, Ll/ᩳ۬ۗ;->ۙ(Ll/ۖۡۗ;Ljava/util/List;Ljava/util/Set;Z)Ll/ܶᩳۗ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/ۖۡۗ;Ljava/util/List;Ljava/util/Set;Z)Ll/ܶᩳۗ;
    .locals 6

    .line 232
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 233
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶ۡۗ;

    .line 235
    instance-of v2, v1, Ll/ۖۡۗ;

    if-eqz v2, :cond_0

    .line 236
    check-cast v1, Ll/ۖۡۗ;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 182
    :cond_1
    sget-object p0, Ll/ۧ۟ۗ;->ᩳ:Ll/ۧ۟ۗ;

    if-eqz p3, :cond_6

    .line 184
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖۡۗ;

    .line 185
    invoke-virtual {v2, p0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v2

    check-cast v2, Ll/ܶᩳۗ;

    if-eqz v2, :cond_2

    .line 188
    invoke-virtual {v2}, Ll/ܶᩳۗ;->ܳ()Ljava/util/SortedSet;

    move-result-object v1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_4

    .line 193
    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    .line 195
    :cond_4
    new-instance v1, Ljava/util/TreeSet;

    invoke-direct {v1, v0}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    .line 197
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖۡۗ;

    .line 198
    invoke-virtual {v3, p0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v3

    check-cast v3, Ll/ܶᩳۗ;

    if-eqz v3, :cond_5

    .line 200
    invoke-virtual {v3}, Ll/ܶᩳۗ;->ܳ()Ljava/util/SortedSet;

    move-result-object v3

    if-eq v1, v3, :cond_5

    .line 202
    invoke-interface {v1, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_3

    .line 207
    :cond_6
    new-instance v1, Ljava/util/TreeSet;

    invoke-direct {v1, v0}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    .line 211
    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖۡۗ;

    if-nez v2, :cond_8

    const/4 v2, 0x1

    goto :goto_4

    :cond_8
    if-eqz p3, :cond_9

    .line 218
    invoke-virtual {v3, p0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v4

    check-cast v4, Ll/ܶᩳۗ;

    if-eqz v4, :cond_9

    .line 220
    invoke-virtual {v4, v1}, Ll/ܶᩳۗ;->ۙ(Ljava/util/SortedSet;)V

    goto :goto_4

    .line 224
    :cond_9
    new-instance v4, Ll/ܶᩳۗ;

    if-nez v2, :cond_a

    move-object v5, p1

    goto :goto_5

    .line 230
    :cond_a
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    if-lt v2, v5, :cond_b

    .line 232
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_5

    .line 234
    :cond_b
    invoke-interface {p1, v2, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v5

    .line 224
    :goto_5
    invoke-direct {v4, v5, v1, p2}, Ll/ܶᩳۗ;-><init>(Ljava/util/List;Ljava/util/SortedSet;Ljava/util/Set;)V

    invoke-virtual {v3, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 227
    :cond_c
    new-instance p0, Ll/ܶᩳۗ;

    invoke-direct {p0, p1, v1, p2}, Ll/ܶᩳۗ;-><init>(Ljava/util/List;Ljava/util/SortedSet;Ljava/util/Set;)V

    return-object p0
.end method

.method public static ۙ(Ll/᩻ۡۗ;Ljava/util/LinkedHashSet;Ljava/util/HashSet;)V
    .locals 4

    .line 290
    invoke-virtual {p0}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    .line 292
    invoke-virtual {p0}, Ll/᩻ۡۗ;->۟ۙ()Ll/֫֨ۗ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 294
    invoke-static {v0, p1, p2, v1}, Ll/ᩳ۬ۗ;->ۙ(Ll/֫ۖۗ;Ljava/util/LinkedHashSet;Ljava/util/HashSet;Ll/֫֨ۗ;)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 296
    :goto_0
    invoke-virtual {p0}, Ll/᩻ۡۗ;->ܳۙ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫֨ۗ;

    .line 297
    invoke-static {v0, p1, p2, v3}, Ll/ᩳ۬ۗ;->ۙ(Ll/֫ۖۗ;Ljava/util/LinkedHashSet;Ljava/util/HashSet;Ll/֫֨ۗ;)I

    move-result v3

    add-int/2addr v1, v3

    goto :goto_1

    :cond_1
    if-nez v1, :cond_2

    .line 300
    invoke-virtual {p0}, Ll/᩻ۡۗ;->getType()Ll/֫֨ۗ;

    move-result-object p0

    invoke-virtual {p0}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "OverrideMethodVisitor"

    return-object v0
.end method

.method public final ۙ(Ll/᩻ۡۗ;)Z
    .locals 17

    move-object/from16 v0, p1

    .line 277
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 278
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 279
    invoke-static {v0, v1, v2}, Ll/ᩳ۬ۗ;->ۙ(Ll/᩻ۡۗ;Ljava/util/LinkedHashSet;Ljava/util/HashSet;)V

    .line 280
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    move-object v3, v4

    goto :goto_0

    .line 283
    :cond_0
    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2a

    .line 286
    new-instance v3, Ll/۟۬ۗ;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {v3, v5, v2}, Ll/۟۬ۗ;-><init>(Ljava/util/ArrayList;Ljava/util/HashSet;)V

    :goto_0
    if-eqz v3, :cond_29

    .line 50
    invoke-virtual/range {p1 .. p1}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_29

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖۡۗ;

    .line 58
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܳ᩷()Z

    move-result v2

    if-nez v2, :cond_27

    invoke-virtual {v1}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۢᩳۗ;->ܶ()Z

    move-result v2

    if-nez v2, :cond_27

    invoke-virtual {v1}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۢᩳۗ;->᩻()Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_14

    .line 80
    :cond_1
    sget-object v2, Ll/ۧ۟ۗ;->ᩳ:Ll/ۧ۟ۗ;

    invoke-virtual {v1, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v5

    check-cast v5, Ll/ܶᩳۗ;

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    move-object/from16 p1, v0

    goto/16 :goto_7

    .line 84
    :cond_2
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v5

    .line 85
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v7

    .line 72
    invoke-virtual {v7, v6, v6}, Ll/᩷ۢۗ;->ۙ(ZZ)Ljava/lang/String;

    move-result-object v6

    .line 86
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 87
    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 88
    invoke-virtual {v3}, Ll/۟۬ۗ;->᩷()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_12

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/֫֨ۗ;

    .line 89
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v11

    invoke-virtual {v11, v10}, Ll/֫ۖۗ;->ۙ(Ll/֫֨ۗ;)Ll/᩻ۡۗ;

    move-result-object v11

    if-eqz v11, :cond_e

    .line 136
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v12

    invoke-virtual {v12}, Ll/᩷ۢۗ;->ܺ()Ljava/lang/String;

    move-result-object v12

    .line 137
    invoke-virtual {v11}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_4

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/ۖۡۗ;

    .line 138
    invoke-virtual {v14}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v15

    invoke-virtual {v15}, Ll/᩷ۢۗ;->ܺ()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_3

    invoke-virtual {v14}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v15

    invoke-virtual {v15}, Ll/ۢᩳۗ;->ܶ()Z

    move-result v15

    if-nez v15, :cond_3

    move-object/from16 p1, v0

    goto/16 :goto_4

    .line 143
    :cond_4
    invoke-virtual {v11}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_5
    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object v14, v13

    check-cast v14, Ll/ۖۡۗ;

    .line 144
    invoke-virtual {v14}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v13

    invoke-virtual {v13}, Ll/᩷ۢۗ;->ܺ()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_5

    invoke-virtual {v14}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v13

    invoke-virtual {v13}, Ll/ۢᩳۗ;->ܶ()Z

    move-result v13

    if-nez v13, :cond_5

    .line 145
    invoke-virtual {v11}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v13

    invoke-virtual {v13}, Ll/֫ۖۗ;->ܽۙ()Ll/۠ܳ᩵;

    move-result-object v13

    .line 146
    invoke-virtual {v14}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v15

    invoke-virtual {v15}, Ll/᩷ۢۗ;->ۤ()Ll/֫֨ۗ;

    move-result-object v15

    .line 147
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v16

    move-object/from16 p1, v0

    invoke-virtual/range {v16 .. v16}, Ll/᩷ۢۗ;->ۤ()Ll/֫֨ۗ;

    move-result-object v0

    .line 148
    invoke-virtual {v13, v15, v0}, Ll/۠ܳ᩵;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;)Ll/ۜܳ᩵;

    move-result-object v0

    .line 149
    invoke-virtual {v0}, Ll/ۜܳ᩵;->ۧ()Z

    move-result v13

    if-eqz v13, :cond_6

    goto :goto_4

    .line 152
    :cond_6
    sget-object v13, Ll/ۜܳ᩵;->ۢ:Ll/ۜܳ᩵;

    if-eq v0, v13, :cond_7

    sget-object v13, Ll/ۜܳ᩵;->᩶:Ll/ۜܳ᩵;

    if-ne v0, v13, :cond_8

    .line 153
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v13, "Possible override for method "

    invoke-direct {v0, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v13

    invoke-virtual {v13}, Ll/᩷ۢۗ;->֫()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;)V

    :cond_8
    move-object/from16 v0, p1

    goto :goto_3

    :cond_9
    move-object/from16 p1, v0

    move-object v14, v4

    :goto_4
    if-eqz v14, :cond_10

    .line 246
    invoke-virtual {v14}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v0

    .line 247
    invoke-virtual {v0}, Ll/ۢᩳۗ;->᩻()Z

    move-result v11

    if-eqz v11, :cond_a

    const/4 v0, 0x0

    goto :goto_6

    .line 250
    :cond_a
    invoke-virtual {v0}, Ll/ۢᩳۗ;->ܽ()Z

    move-result v11

    if-nez v11, :cond_c

    invoke-virtual {v0}, Ll/ۢᩳۗ;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_5

    .line 254
    :cond_b
    invoke-virtual {v14}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩻ۡۗ;->᩺ۙ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Ll/᩻ۡۗ;->᩺ۙ()Ljava/lang/String;

    move-result-object v11

    invoke-static {v0, v11}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_6

    :cond_c
    :goto_5
    const/4 v0, 0x1

    :goto_6
    if-eqz v0, :cond_10

    .line 94
    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    invoke-virtual {v14, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v0

    check-cast v0, Ll/ܶᩳۗ;

    if-eqz v0, :cond_10

    .line 124
    invoke-virtual {v3}, Ll/۟۬ۗ;->ۙ()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v10}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v5

    check-cast v2, Ljava/util/HashSet;

    invoke-virtual {v2, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 125
    invoke-static {v7}, Ll/ۘۧ᩵;->᩷(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶ۡۗ;

    if-eqz v2, :cond_d

    .line 127
    invoke-virtual {v8, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 98
    :cond_d
    invoke-static {v1, v7, v8, v0}, Ll/ᩳ۬ۗ;->ۙ(Ll/ۖۡۗ;Ljava/util/ArrayList;Ljava/util/HashSet;Ll/ܶᩳۗ;)Ll/ܶᩳۗ;

    move-result-object v5

    goto :goto_7

    :cond_e
    move-object/from16 p1, v0

    .line 103
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫ۖۗ;->᩷ۙ()Ll/᩷֡ۗ;

    move-result-object v0

    invoke-virtual {v0, v10}, Ll/᩷֡ۗ;->ۙ(Ll/֫֨ۗ;)Ll/ۜܿۗ;

    move-result-object v0

    if-eqz v0, :cond_10

    .line 105
    invoke-virtual {v0}, Ll/ۜܿۗ;->᩷()Ljava/util/Map;

    move-result-object v0

    .line 106
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map$Entry;

    .line 107
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    .line 110
    invoke-virtual {v12, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_f

    .line 111
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶ۡۗ;

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    :cond_10
    invoke-virtual {v3}, Ll/۟۬ۗ;->ۙ()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v10}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v10

    check-cast v0, Ljava/util/HashSet;

    invoke-virtual {v0, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 125
    invoke-static {v7}, Ll/ۘۧ᩵;->᩷(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶ۡۗ;

    if-eqz v0, :cond_11

    .line 127
    invoke-virtual {v8, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_11
    move-object/from16 v0, p1

    goto/16 :goto_2

    :cond_12
    move-object/from16 p1, v0

    .line 119
    invoke-static {v1, v7, v8, v4}, Ll/ᩳ۬ۗ;->ۙ(Ll/ۖۡۗ;Ljava/util/ArrayList;Ljava/util/HashSet;Ll/ܶᩳۗ;)Ll/ܶᩳۗ;

    move-result-object v5

    :goto_7
    if-eqz v5, :cond_28

    .line 63
    invoke-virtual {v5}, Ll/ܶᩳۗ;->ۙ()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_26

    .line 66
    invoke-virtual {v1, v5}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 67
    invoke-virtual {v5}, Ll/ܶᩳۗ;->ۙ()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_14

    .line 340
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v5, 0x1

    if-eq v2, v5, :cond_13

    goto :goto_8

    .line 343
    :cond_13
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    goto :goto_9

    :cond_14
    :goto_8
    move-object v0, v4

    .line 67
    :goto_9
    check-cast v0, Ll/᩶ۡۗ;

    if-eqz v0, :cond_28

    .line 334
    invoke-virtual {v1}, Ll/ۖۡۗ;->ۤ()Ll/֫֨ۗ;

    move-result-object v2

    .line 335
    sget-object v5, Ll/֫֨ۗ;->ۜ:Ll/֫֨ۗ;

    if-ne v2, v5, :cond_15

    const/4 v2, 0x0

    goto/16 :goto_c

    .line 346
    :cond_15
    invoke-interface {v0}, Ll/᩶ۡۗ;->ۤ()Ll/֫֨ۗ;

    move-result-object v5

    .line 347
    invoke-virtual {v1}, Ll/ۖۡۗ;->ۤ()Ll/֫֨ۗ;

    move-result-object v6

    invoke-virtual {v6, v5}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_16

    goto :goto_a

    .line 350
    :cond_16
    invoke-virtual {v5}, Ll/֫֨ۗ;->᩸()Z

    move-result v6

    if-nez v6, :cond_17

    goto :goto_a

    .line 353
    :cond_17
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v6

    invoke-virtual {v6}, Ll/֫ۖۗ;->ܶۙ()Ll/ۢ۫᩵;

    move-result-object v6

    invoke-virtual {v6}, Ll/ۢ۫᩵;->ۙ()Ll/۠ܳ᩵;

    move-result-object v6

    .line 354
    invoke-interface {v0}, Ll/᩶ۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v7

    invoke-virtual {v7}, Ll/᩷ۢۗ;->۫()Ll/֨ᩳۗ;

    move-result-object v7

    invoke-virtual {v7}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object v7

    .line 355
    invoke-virtual {v3}, Ll/۟۬ۗ;->᩷()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_18
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_19

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/֫֨ۗ;

    .line 356
    invoke-virtual {v6, v9, v7}, Ll/۠ܳ᩵;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;)Ll/ۜܳ᩵;

    move-result-object v10

    .line 357
    sget-object v11, Ll/ۜܳ᩵;->ᩳ:Ll/ۜܳ᩵;

    if-ne v10, v11, :cond_18

    .line 358
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v10

    invoke-virtual {v10}, Ll/֫ۖۗ;->᩹ۙ()Ll/ۗۖۗ;

    move-result-object v10

    .line 166
    invoke-virtual {v10, v9, v9, v5}, Ll/ۗۖۗ;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object v9

    if-eqz v9, :cond_18

    .line 360
    invoke-virtual {v9}, Ll/֫֨ۗ;->᩸()Z

    move-result v10

    if-nez v10, :cond_18

    .line 361
    invoke-virtual {v1}, Ll/ۖۡۗ;->ۤ()Ll/֫֨ۗ;

    move-result-object v10

    invoke-virtual {v9, v10}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_18

    .line 362
    invoke-virtual {v1, v9}, Ll/ۖۡۗ;->᩷(Ll/֫֨ۗ;)V

    const/4 v5, 0x1

    goto :goto_b

    :cond_19
    :goto_a
    const/4 v5, 0x0

    :goto_b
    if-eqz v5, :cond_1a

    .line 340
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Return type fixed from \'"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\' to match base method"

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;)V

    :cond_1a
    move v2, v5

    .line 371
    :goto_c
    invoke-virtual {v1}, Ll/ۖۡۗ;->ᩴ()Ljava/util/List;

    move-result-object v5

    .line 372
    invoke-interface {v0}, Ll/᩶ۡۗ;->ᩴ()Ljava/util/List;

    move-result-object v6

    .line 373
    invoke-interface {v5, v6}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1b

    goto :goto_d

    .line 376
    :cond_1b
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    .line 377
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-eq v7, v6, :cond_1c

    :goto_d
    const/4 v0, 0x0

    goto/16 :goto_13

    .line 381
    :cond_1c
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_e
    if-ge v9, v7, :cond_22

    .line 398
    invoke-virtual {v1}, Ll/ۖۡۗ;->ᩴ()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/֫֨ۗ;

    .line 399
    invoke-interface {v0}, Ll/᩶ۡۗ;->ᩴ()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/֫֨ۗ;

    .line 400
    invoke-virtual {v10, v11}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1d

    goto :goto_f

    .line 403
    :cond_1d
    invoke-virtual {v11}, Ll/֫֨ۗ;->᩸()Z

    move-result v12

    if-nez v12, :cond_1e

    :goto_f
    move-object/from16 v16, v0

    goto :goto_11

    .line 406
    :cond_1e
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v4

    invoke-virtual {v4}, Ll/֫ۖۗ;->ܶۙ()Ll/ۢ۫᩵;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۢ۫᩵;->ۙ()Ll/۠ܳ᩵;

    move-result-object v4

    .line 407
    invoke-interface {v0}, Ll/᩶ۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v12

    invoke-virtual {v12}, Ll/᩷ۢۗ;->۫()Ll/֨ᩳۗ;

    move-result-object v12

    invoke-virtual {v12}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object v12

    .line 408
    invoke-virtual {v3}, Ll/۟۬ۗ;->᩷()Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/util/ArrayList;

    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_10
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_20

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/֫֨ۗ;

    .line 409
    invoke-virtual {v4, v14, v12}, Ll/۠ܳ᩵;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;)Ll/ۜܳ᩵;

    move-result-object v15

    move-object/from16 v16, v0

    .line 410
    sget-object v0, Ll/ۜܳ᩵;->ᩳ:Ll/ۜܳ᩵;

    if-ne v15, v0, :cond_1f

    .line 411
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫ۖۗ;->᩹ۙ()Ll/ۗۖۗ;

    move-result-object v0

    .line 166
    invoke-virtual {v0, v14, v14, v11}, Ll/ۗۖۗ;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object v0

    if-eqz v0, :cond_1f

    .line 413
    invoke-virtual {v0}, Ll/֫֨ۗ;->᩸()Z

    move-result v14

    if-nez v14, :cond_1f

    .line 414
    invoke-virtual {v0, v10}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_1f

    move-object v4, v0

    goto :goto_11

    :cond_1f
    move-object/from16 v0, v16

    goto :goto_10

    :cond_20
    move-object/from16 v16, v0

    const/4 v4, 0x0

    :goto_11
    if-eqz v4, :cond_21

    .line 386
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v8, 0x1

    goto :goto_12

    .line 388
    :cond_21
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫֨ۗ;

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_12
    add-int/lit8 v9, v9, 0x1

    const/4 v4, 0x0

    move-object/from16 v0, v16

    goto/16 :goto_e

    :cond_22
    if-eqz v8, :cond_23

    .line 392
    invoke-virtual {v1, v6}, Ll/ۖۡۗ;->᩷(Ljava/util/ArrayList;)V

    :cond_23
    move v0, v8

    :goto_13
    or-int/2addr v0, v2

    if-eqz v0, :cond_25

    .line 423
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩷ۢۗ;->ۙ()Ljava/lang/String;

    move-result-object v0

    .line 424
    invoke-virtual {v1}, Ll/ۖۡۗ;->ᩴ()Ljava/util/List;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v0, v2, v4}, Ll/᩷ۢۗ;->ۙ(Ljava/lang/String;Ljava/util/List;Ll/֫֨ۗ;)Ljava/lang/String;

    move-result-object v2

    .line 425
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_24
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_28

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۖۡۗ;

    .line 426
    invoke-virtual {v6}, Ll/ۖۡۗ;->ۤۙ()Ljava/lang/String;

    move-result-object v7

    .line 427
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_24

    if-eq v6, v1, :cond_24

    .line 428
    invoke-virtual {v6}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v7

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-virtual {v7, v8, v9}, Ll/᩷ۢۗ;->ۙ(ZZ)Ljava/lang/String;

    move-result-object v7

    .line 429
    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_24

    .line 430
    new-instance v0, Ll/ܺᩳۗ;

    invoke-direct {v0, v1}, Ll/ܺᩳۗ;-><init>(Ll/ۖۡۗ;)V

    invoke-virtual {v6, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    goto :goto_15

    :cond_25
    const/4 v0, 0x0

    move-object v4, v0

    goto :goto_15

    .line 64
    :cond_26
    new-instance v0, Ll/۠ۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No base methods for override attribute: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ll/ܶᩳۗ;->᩷()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 64
    throw v0

    :cond_27
    :goto_14
    move-object/from16 p1, v0

    :cond_28
    :goto_15
    move-object/from16 v0, p1

    goto/16 :goto_1

    :cond_29
    const/4 v0, 0x1

    return v0

    .line 284
    :cond_2a
    new-instance v1, Ll/۠ۧ᩵;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "No end types in class hierarchy: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 284
    throw v1
.end method
