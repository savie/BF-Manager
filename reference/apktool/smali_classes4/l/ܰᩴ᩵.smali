.class public final Ll/ܰᩴ᩵;
.super Ljava/lang/Object;
.source "X6IH"


# static fields
.field public static final synthetic ۤ:I

.field public static final ᩸:Ll/᩻ܽ᩺;


# instance fields
.field public final ۙ:Ll/ۖۡۗ;

.field public final ᩷:Ll/ۗᩴ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 44
    const-class v0, Ll/ܰᩴ᩵;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/ܰᩴ᩵;->᩸:Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>(Ll/ۖۡۗ;Ll/ۗᩴ᩵;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Ll/ܰᩴ᩵;->ۙ:Ll/ۖۡۗ;

    .line 48
    iput-object p2, p0, Ll/ܰᩴ᩵;->᩷:Ll/ۗᩴ᩵;

    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ܰۖۗ;)V
    .locals 5

    .line 87
    invoke-virtual {p1}, Ll/ܰۖۗ;->ۖ()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘۖۗ;

    .line 88
    invoke-virtual {v1}, Ll/ۘۖۗ;->ۙ()Ll/ۛۡۗ;

    move-result-object v1

    .line 396
    new-instance v2, Ll/ܿۧ᩵;

    invoke-direct {v2, p0}, Ll/ܿۧ᩵;-><init>(Ll/ۖۡۗ;)V

    .line 397
    new-instance v3, Ll/۬֨ۗ;

    const/4 v4, 0x1

    invoke-direct {v3, v4, v2}, Ll/۬֨ۗ;-><init>(ILjava/lang/Object;)V

    invoke-static {p0, v1, v3}, Ll/᩵ۧ᩵;->ۙ(Ll/ۖۡۗ;Ll/ۛۡۗ;Ll/۬֨ۗ;)V

    .line 398
    new-instance v3, Ll/ۘᩴ᩵;

    invoke-direct {v3, v1, v2, p1}, Ll/ۘᩴ᩵;-><init>(Ll/ۛۡۗ;Ll/ܿۧ᩵;Ll/ܰۖۗ;)V

    invoke-static {p0, v1, v3}, Ll/᩺᩸᩵;->ۙ(Ll/ۖۡۗ;Ll/ۛۡۗ;Ll/ۛ᩸ۨ;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ۙ(Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)Z
    .locals 2

    .line 334
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    if-eqz v0, :cond_0

    .line 335
    invoke-virtual {v1, v0}, Ll/᩷ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 338
    :cond_0
    invoke-virtual {p1, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۡۗ;

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic ۙ(Ll/ܰᩴ᩵;Ll/᩷ۡۗ;Ll/ۘۖۗ;)Z
    .locals 1

    .line 291
    invoke-virtual {p2}, Ll/ۘۖۗ;->᩷()Ljava/util/List;

    move-result-object p0

    sget-object v0, Ll/ܰۖۗ;->ۢ:Ljava/lang/Object;

    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 292
    invoke-virtual {p2}, Ll/ۘۖۗ;->ۙ()Ll/ۛۡۗ;

    move-result-object p0

    invoke-static {p1, p0}, Ll/ܰᩴ᩵;->ۙ(Ll/᩷ۡۗ;Ll/ۛۡۗ;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۙ(Ll/᩷ۡۗ;Ll/ۛۡۗ;)Z
    .locals 2

    .line 363
    invoke-static {p1}, Ll/᩵ۧ᩵;->ۧ(Ll/ۛۡۗ;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_4

    .line 314
    instance-of v0, p1, Ll/᩷ۡۗ;

    if-eqz v0, :cond_0

    .line 316
    check-cast p1, Ll/᩷ۡۗ;

    invoke-static {p1}, Ll/᩹֫᩵;->᩷(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    move-result-object p1

    if-ne p1, p0, :cond_4

    goto :goto_0

    .line 317
    :cond_0
    instance-of v0, p1, Ll/ܿۡۗ;

    if-eqz v0, :cond_3

    .line 319
    check-cast p1, Ll/ܿۡۗ;

    invoke-interface {p1}, Ll/ܿۡۗ;->ܿ()Ljava/util/List;

    move-result-object p1

    .line 320
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛۡۗ;

    .line 321
    invoke-static {p0, v0}, Ll/ܰᩴ᩵;->ۙ(Ll/᩷ۡۗ;Ll/ۛۡۗ;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0

    .line 327
    :cond_3
    sget-object p0, Ll/ܰᩴ᩵;->᩸:Ll/᩻ܽ᩺;

    const-string p1, "Unexpected container type in switch"

    invoke-interface {p0, p1}, Ll/᩻ܽ᩺;->᩷(Ljava/lang/String;)V

    :cond_4
    :goto_1
    return v1
.end method


# virtual methods
.method public final ۙ(Ll/ۨۖۗ;Ll/᩷ۡۗ;Ll/֨ۢۗ;Ll/ۨᩴ᩵;)Ll/᩷ۡۗ;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    .line 53
    invoke-virtual/range {p3 .. p3}, Ll/֨ۢۗ;->ܿۙ()[I

    move-result-object v4

    array-length v4, v4

    .line 54
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 55
    invoke-virtual/range {p3 .. p3}, Ll/֨ۢۗ;->᩶ۙ()[Ll/᩷ۡۗ;

    move-result-object v6

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v4, :cond_0

    .line 57
    aget-object v8, v6, v7

    new-instance v9, Ll/۫۫ۚ;

    const/4 v10, 0x6

    invoke-direct {v9, v10}, Ll/۫۫ۚ;-><init>(I)V

    invoke-static {v5, v8, v9}, Ll/ۧۚۗ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    .line 58
    invoke-virtual {v2, v7}, Ll/֨ۢۗ;->۫(I)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 60
    :cond_0
    invoke-virtual/range {p3 .. p3}, Ll/֨ۢۗ;->ۛۙ()Ll/᩷ۡۗ;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 62
    new-instance v6, Ll/۠ۚ۫;

    const/4 v7, 0x6

    invoke-direct {v6, v7}, Ll/۠ۚ۫;-><init>(I)V

    invoke-static {v5, v4, v6}, Ll/ۧۚۗ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    .line 63
    sget-object v7, Ll/ܰۖۗ;->ۢ:Ljava/lang/Object;

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    :cond_1
    new-instance v6, Ll/ܰۖۗ;

    move-object/from16 v7, p1

    invoke-direct {v6, v7, v1}, Ll/ܰۖۗ;-><init>(Ll/ܿۡۗ;Ll/᩷ۡۗ;)V

    .line 67
    new-instance v8, Ll/ۘᩳۗ;

    invoke-direct {v8, v6}, Ll/ۘᩳۗ;-><init>(Ll/ܰۖۗ;)V

    invoke-virtual {v2, v8}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 68
    invoke-virtual/range {p1 .. p1}, Ll/ۨۖۗ;->ܿ()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    invoke-virtual {v3, v6}, Ll/ۨᩴ᩵;->ۙ(Ll/᩵ۖۗ;)V

    .line 148
    iget-object v7, v0, Ll/ܰᩴ᩵;->ۙ:Ll/ۖۡۗ;

    invoke-static {v7}, Ll/᩹֫᩵;->᩷(Ll/ۖۡۗ;)Ljava/util/BitSet;

    move-result-object v8

    .line 149
    invoke-virtual/range {p2 .. p2}, Ll/᩷ۡۗ;->۠()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩷ۡۗ;

    .line 150
    sget-object v11, Ll/֫۟ۗ;->᩶ۙ:Ll/֫۟ۗ;

    invoke-virtual {v10, v11}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v11

    if-eqz v11, :cond_2

    goto :goto_1

    .line 154
    :cond_2
    invoke-virtual {v10}, Ll/᩷ۡۗ;->ۜ()Ljava/util/BitSet;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    goto :goto_1

    .line 156
    :cond_3
    invoke-virtual/range {p2 .. p2}, Ll/᩷ۡۗ;->getId()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/util/BitSet;->clear(I)V

    .line 157
    invoke-virtual {v7}, Ll/ۖۡۗ;->ۗۙ()Ll/᩷ۡۗ;

    move-result-object v9

    invoke-virtual {v9}, Ll/᩷ۡۗ;->getId()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/util/BitSet;->clear(I)V

    .line 160
    invoke-virtual {v8}, Ljava/util/BitSet;->cardinality()I

    move-result v9

    iget-object v10, v0, Ll/ܰᩴ᩵;->᩷:Ll/ۗᩴ᩵;

    const/4 v11, 0x1

    if-ne v9, v11, :cond_4

    .line 162
    invoke-static {v7, v8}, Ll/᩹֫᩵;->᩷(Ll/ۖۡۗ;Ljava/util/BitSet;)Ll/᩷ۡۗ;

    move-result-object v8

    goto/16 :goto_5

    .line 166
    :cond_4
    invoke-virtual {v7, v1}, Ll/ۖۡۗ;->᩷(Ll/᩷ۡۗ;)Ll/ۧᩳۗ;

    move-result-object v9

    if-eqz v9, :cond_c

    .line 168
    invoke-virtual {v9}, Ll/ۧᩳۗ;->ۚ()Ll/᩷ۡۗ;

    move-result-object v11

    invoke-virtual {v11}, Ll/᩷ۡۗ;->ۚۙ()Ljava/util/BitSet;

    move-result-object v11

    invoke-virtual {v8, v11}, Ljava/util/BitSet;->andNot(Ljava/util/BitSet;)V

    .line 169
    invoke-virtual {v9}, Ll/ۧᩳۗ;->ۙ()Ll/᩷ۡۗ;

    move-result-object v11

    invoke-virtual {v11}, Ll/᩷ۡۗ;->ۚۙ()Ljava/util/BitSet;

    move-result-object v11

    invoke-virtual {v8, v11}, Ljava/util/BitSet;->andNot(Ljava/util/BitSet;)V

    .line 170
    invoke-virtual {v9}, Ll/ۧᩳۗ;->ۙ()Ll/᩷ۡۗ;

    move-result-object v9

    .line 171
    invoke-virtual {v8}, Ljava/util/BitSet;->cardinality()I

    move-result v11

    const/4 v12, 0x2

    if-ne v11, v12, :cond_b

    invoke-virtual {v9}, Ll/᩷ۡۗ;->getId()I

    move-result v11

    invoke-virtual {v8, v11}, Ljava/util/BitSet;->get(I)Z

    move-result v11

    if-eqz v11, :cond_b

    .line 174
    invoke-static {v7, v8}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ljava/util/BitSet;)Ljava/util/List;

    move-result-object v11

    .line 175
    invoke-interface {v11, v9}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 176
    invoke-static {v11}, Ll/ۘۧ᩵;->ۙ(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/᩷ۡۗ;

    if-eqz v11, :cond_b

    .line 368
    invoke-virtual/range {p2 .. p2}, Ll/᩷ۡۗ;->۠()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    const/4 v13, 0x0

    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_a

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/᩷ۡۗ;

    .line 369
    invoke-virtual {v14}, Ll/᩷ۡۗ;->ۜ()Ljava/util/BitSet;

    move-result-object v15

    invoke-virtual {v9}, Ll/᩷ۡۗ;->getId()I

    move-result v2

    invoke-virtual {v15, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    if-eqz v2, :cond_8

    if-eq v14, v11, :cond_8

    .line 371
    new-instance v2, Ljava/util/HashSet;

    invoke-static {v7, v14, v14}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Ljava/util/ArrayList;

    move-result-object v15

    invoke-direct {v2, v15}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 372
    invoke-virtual {v2, v11}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_8

    invoke-virtual {v11}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v15

    invoke-static {v15}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v15

    move-object/from16 p1, v11

    new-instance v11, Ll/ۤۖ᩺;

    move-object/from16 v16, v12

    const/4 v12, 0x1

    invoke-direct {v11, v12, v2}, Ll/ۤۖ᩺;-><init>(ILjava/lang/Object;)V

    invoke-interface {v15, v11}, Ll/᩵ܺۗ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result v11

    if-eqz v11, :cond_5

    goto :goto_3

    .line 375
    :cond_5
    invoke-virtual {v9}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_6
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_9

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩷ۡۗ;

    .line 376
    invoke-virtual {v2, v12}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_7

    if-ne v12, v14, :cond_6

    .line 377
    :cond_7
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    sget-object v2, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v12, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 378
    invoke-virtual {v12}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v2

    new-instance v11, Ll/ᩳۡۗ;

    sget-object v12, Ll/᩺ۢۗ;->᩷ۙ:Ll/᩺ۢۗ;

    const/4 v13, 0x0

    invoke-direct {v11, v12, v13}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x1

    const/4 v13, 0x1

    goto :goto_3

    :cond_8
    move-object/from16 p1, v11

    move-object/from16 v16, v12

    :cond_9
    :goto_3
    move-object/from16 v11, p1

    move-object/from16 v2, p3

    move-object/from16 v12, v16

    goto/16 :goto_2

    :cond_a
    move-object/from16 p1, v11

    if-eqz v13, :cond_b

    .line 178
    invoke-virtual {v9}, Ll/᩷ۡۗ;->getId()I

    move-result v2

    invoke-virtual {v8, v2}, Ljava/util/BitSet;->clear(I)V

    move-object/from16 v11, p1

    goto :goto_4

    :cond_b
    const/4 v11, 0x0

    .line 182
    :goto_4
    invoke-virtual {v8}, Ljava/util/BitSet;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_d

    .line 184
    invoke-virtual {v7}, Ll/ۖۡۗ;->ۗۙ()Ll/᩷ۡۗ;

    move-result-object v1

    goto/16 :goto_c

    :cond_c
    const/4 v2, 0x0

    move-object v11, v2

    :cond_d
    if-nez v11, :cond_f

    .line 188
    invoke-virtual/range {p2 .. p2}, Ll/᩷ۡۗ;->ᩴۙ()Ll/᩷ۡۗ;

    move-result-object v2

    .line 189
    invoke-virtual {v2}, Ll/᩷ۡۗ;->getId()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/util/BitSet;->get(I)Z

    move-result v9

    if-eqz v9, :cond_e

    move-object v8, v2

    goto :goto_5

    .line 192
    :cond_e
    invoke-virtual/range {p2 .. p2}, Ll/᩷ۡۗ;->ۚۙ()Ljava/util/BitSet;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/util/BitSet;->andNot(Ljava/util/BitSet;)V

    .line 193
    invoke-static {v7, v8}, Ll/᩹֫᩵;->᩷(Ll/ۖۡۗ;Ljava/util/BitSet;)Ll/᩷ۡۗ;

    move-result-object v8

    goto :goto_5

    :cond_f
    move-object v8, v11

    :goto_5
    if-eqz v8, :cond_10

    .line 197
    invoke-virtual {v7, v8}, Ll/ۖۡۗ;->ۤ(Ll/᩷ۡۗ;)Z

    move-result v2

    if-eqz v2, :cond_10

    .line 199
    invoke-virtual {v7}, Ll/ۖۡۗ;->ۗۙ()Ll/᩷ۡۗ;

    move-result-object v8

    .line 201
    :cond_10
    invoke-virtual/range {p2 .. p2}, Ll/᩷ۡۗ;->ᩴۙ()Ll/᩷ۡۗ;

    move-result-object v2

    if-nez v8, :cond_1c

    .line 202
    invoke-virtual {v7}, Ll/ۖۡۗ;->ۗۙ()Ll/᩷ۡۗ;

    move-result-object v9

    if-ne v2, v9, :cond_1c

    .line 229
    invoke-virtual {v7}, Ll/ۖۡۗ;->ۗۙ()Ll/᩷ۡۗ;

    move-result-object v1

    .line 230
    invoke-virtual {v1}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v2

    .line 231
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x1

    if-ne v8, v9, :cond_11

    const/4 v1, 0x0

    .line 233
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    goto/16 :goto_c

    .line 235
    :cond_11
    invoke-virtual {v7}, Ll/ۖۡۗ;->ۤ()Ll/֫֨ۗ;

    move-result-object v9

    sget-object v11, Ll/֫֨ۗ;->ۜ:Ll/֫֨ۗ;

    if-ne v9, v11, :cond_13

    .line 236
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_12
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_19

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/᩷ۡۗ;

    .line 237
    invoke-static {v11}, Ll/᩹֫᩵;->᩷(Ll/᩹ۡۗ;)Ll/ᩳۡۗ;

    move-result-object v11

    if-eqz v11, :cond_20

    .line 238
    invoke-virtual {v11}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v11

    sget-object v12, Ll/᩺ۢۗ;->ۢۙ:Ll/᩺ۢۗ;

    if-eq v11, v12, :cond_12

    goto/16 :goto_c

    .line 243
    :cond_13
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 244
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_6
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_15

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩷ۡۗ;

    .line 245
    invoke-static {v12}, Ll/᩹֫᩵;->᩷(Ll/᩹ۡۗ;)Ll/ᩳۡۗ;

    move-result-object v12

    if-eqz v12, :cond_20

    .line 246
    invoke-virtual {v12}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v13

    sget-object v14, Ll/᩺ۢۗ;->ۢۙ:Ll/᩺ۢۗ;

    if-eq v13, v14, :cond_14

    goto/16 :goto_c

    :cond_14
    const/4 v13, 0x0

    .line 249
    invoke-virtual {v12, v13}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v12

    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_15
    const/4 v11, 0x0

    .line 251
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ܺ֨ۗ;

    .line 252
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v12, v11, Ll/ۛ֨ۗ;

    if-eqz v12, :cond_17

    .line 253
    check-cast v11, Ll/ۛ֨ۗ;

    const/4 v12, 0x1

    :goto_7
    if-ge v12, v8, :cond_19

    .line 255
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ܺ֨ۗ;

    .line 256
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v14, v13, Ll/ۛ֨ۗ;

    if-eqz v14, :cond_20

    .line 256
    check-cast v13, Ll/ۛ֨ۗ;

    invoke-virtual {v13, v11}, Ll/ۛ֨ۗ;->᩷(Ll/ۛ֨ۗ;)Z

    move-result v13

    if-nez v13, :cond_16

    goto/16 :goto_c

    :cond_16
    add-int/lit8 v12, v12, 0x1

    goto :goto_7

    :cond_17
    const/4 v12, 0x1

    :goto_8
    if-ge v12, v8, :cond_19

    .line 262
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ܺ֨ۗ;

    .line 263
    invoke-virtual {v13, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_18

    goto/16 :goto_c

    :cond_18
    add-int/lit8 v12, v12, 0x1

    goto :goto_8

    .line 94
    :cond_19
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩷ۡۗ;

    .line 95
    invoke-virtual {v3, v9}, Ll/ۨᩴ᩵;->ۙ(Ll/᩷ۡۗ;)V

    goto :goto_9

    :cond_1a
    const/4 v1, 0x1

    :goto_a
    if-ge v1, v8, :cond_1b

    .line 273
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩷ۡۗ;

    .line 274
    sget-object v11, Ll/֫۟ۗ;->ۜۙ:Ll/֫۟ۗ;

    invoke-virtual {v9, v11}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 275
    sget-object v11, Ll/֫۟ۗ;->᩶:Ll/֫۟ۗ;

    invoke-virtual {v9, v11}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_1b
    const/4 v1, 0x0

    .line 277
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    goto :goto_c

    .line 207
    :cond_1c
    invoke-virtual/range {p3 .. p3}, Ll/֨ۢۗ;->ۛۙ()Ll/᩷ۡۗ;

    move-result-object v9

    if-ne v2, v9, :cond_1d

    .line 208
    invoke-virtual/range {p2 .. p2}, Ll/᩷ۡۗ;->۠()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1d

    .line 209
    invoke-virtual/range {p2 .. p2}, Ll/᩷ۡۗ;->ۜ()Ljava/util/BitSet;

    move-result-object v9

    invoke-virtual {v2}, Ll/᩷ۡۗ;->getId()I

    move-result v11

    invoke-virtual {v9, v11}, Ljava/util/BitSet;->get(I)Z

    move-result v9

    if-eqz v9, :cond_1d

    .line 211
    invoke-virtual {v3, v2}, Ll/ۨᩴ᩵;->ۙ(Ll/᩷ۡۗ;)V

    :cond_1d
    if-nez v8, :cond_1e

    .line 214
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v8, "Failed to find \'out\' block for switch in "

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, ". Please report as an issue."

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    .line 216
    invoke-virtual/range {p2 .. p2}, Ll/᩷ۡۗ;->ᩴۙ()Ll/᩷ۡۗ;

    move-result-object v2

    goto :goto_b

    :cond_1e
    move-object v2, v8

    :goto_b
    if-eqz v2, :cond_1f

    .line 218
    invoke-virtual {v10, v2}, Ll/ۗᩴ᩵;->᩷(Ll/᩷ۡۗ;)Z

    move-result v8

    if-eqz v8, :cond_1f

    .line 222
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Switch \'out\' block "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " already processed. Defaulting to fallback option."

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    .line 223
    invoke-virtual/range {p2 .. p2}, Ll/᩷ۡۗ;->ᩴۙ()Ll/᩷ۡۗ;

    move-result-object v1

    goto :goto_c

    :cond_1f
    move-object v1, v2

    .line 72
    :cond_20
    :goto_c
    invoke-virtual {v3, v1}, Ll/ۨᩴ᩵;->ۙ(Ll/᩷ۡۗ;)V

    .line 94
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    if-eqz v1, :cond_27

    .line 97
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v8

    .line 371
    invoke-static {v7}, Ll/᩹֫᩵;->᩷(Ll/ۖۡۗ;)Ljava/util/BitSet;

    move-result-object v9

    .line 372
    invoke-interface {v8}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_d
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_21

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/᩷ۡۗ;

    .line 373
    invoke-virtual {v11}, Ll/᩷ۡۗ;->getId()I

    move-result v11

    invoke-virtual {v9, v11}, Ljava/util/BitSet;->set(I)V

    goto :goto_d

    .line 98
    :cond_21
    invoke-virtual {v1}, Ll/᩷ۡۗ;->۫ۙ()I

    move-result v8

    invoke-virtual {v9, v8}, Ljava/util/BitSet;->clear(I)V

    .line 99
    invoke-virtual {v6}, Ll/ܰۖۗ;->۠()Ll/᩷ۡۗ;

    move-result-object v8

    invoke-virtual {v8}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_22
    :goto_e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_24

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/᩷ۡۗ;

    .line 100
    invoke-virtual {v11}, Ll/᩷ۡۗ;->ۜ()Ljava/util/BitSet;

    move-result-object v12

    .line 101
    invoke-virtual {v12, v9}, Ljava/util/BitSet;->intersects(Ljava/util/BitSet;)Z

    move-result v13

    if-eqz v13, :cond_22

    .line 363
    new-instance v13, Ljava/util/BitSet;

    invoke-virtual {v7}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v14

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/BitSet;-><init>(I)V

    .line 364
    invoke-virtual {v12}, Ljava/util/BitSet;->isEmpty()Z

    move-result v14

    if-nez v14, :cond_23

    .line 365
    invoke-virtual {v13, v12}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    .line 140
    :cond_23
    invoke-virtual {v1}, Ll/᩷ۡۗ;->۫ۙ()I

    move-result v12

    invoke-virtual {v13, v12}, Ljava/util/BitSet;->clear(I)V

    .line 141
    invoke-virtual {v13, v9}, Ljava/util/BitSet;->and(Ljava/util/BitSet;)V

    .line 142
    invoke-static {v7, v13}, Ll/᩹֫᩵;->᩷(Ll/ۖۡۗ;Ljava/util/BitSet;)Ll/᩷ۡۗ;

    move-result-object v12

    .line 103
    invoke-interface {v2, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_e

    .line 107
    :cond_24
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_27

    invoke-static {v5, v2}, Ll/ܰᩴ᩵;->ۙ(Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)Z

    move-result v8

    if-eqz v8, :cond_27

    .line 345
    new-instance v8, Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 346
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 347
    new-instance v9, Ll/᩺ᩴ᩵;

    invoke-direct {v9, v2}, Ll/᩺ᩴ᩵;-><init>(Ljava/util/LinkedHashMap;)V

    invoke-static {v8, v9}, Ll/۫ۚۗ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 359
    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v11

    invoke-direct {v9, v11}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 360
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_25

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/᩷ۡۗ;

    .line 361
    invoke-virtual {v5, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/List;

    invoke-interface {v9, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_f

    .line 109
    :cond_25
    invoke-static {v9, v2}, Ll/ܰᩴ᩵;->ۙ(Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)Z

    move-result v8

    if-eqz v8, :cond_26

    const-string v8, "Can\'t fix incorrect switch cases order, some code will duplicate"

    .line 110
    invoke-virtual {v7, v8}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    .line 111
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->clear()V

    goto :goto_10

    :cond_26
    move-object v5, v9

    .line 117
    :cond_27
    :goto_10
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_11
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    .line 118
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    .line 119
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩷ۡۗ;

    .line 121
    invoke-virtual {v3, v8}, Ll/ۨᩴ᩵;->᩷(Ll/᩷ۡۗ;)Z

    move-result v11

    if-eqz v11, :cond_28

    .line 122
    new-instance v8, Ll/ۨۖۗ;

    invoke-virtual/range {p4 .. p4}, Ll/ۨᩴ᩵;->ۤ()Ll/ܿۡۗ;

    move-result-object v11

    invoke-direct {v8, v11}, Ll/ۨۖۗ;-><init>(Ll/ܿۡۗ;)V

    goto :goto_12

    .line 124
    :cond_28
    invoke-virtual {v2, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/᩷ۡۗ;

    .line 125
    invoke-virtual {v3, v11}, Ll/ۨᩴ᩵;->ۙ(Ll/᩷ۡۗ;)V

    .line 126
    invoke-virtual {v10, v8}, Ll/ۗᩴ᩵;->ۤ(Ll/᩷ۡۗ;)Ll/ۨۖۗ;

    move-result-object v8

    .line 127
    invoke-virtual {v3, v11}, Ll/ۨᩴ᩵;->ۤ(Ll/᩷ۡۗ;)V

    if-eqz v11, :cond_29

    .line 129
    sget-object v12, Ll/֫۟ۗ;->ܶۙ:Ll/֫۟ۗ;

    invoke-virtual {v11, v12}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 130
    invoke-virtual {v8, v12}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 133
    :cond_29
    :goto_12
    invoke-virtual {v6, v9, v8}, Ll/ܰۖۗ;->ۙ(Ljava/util/List;Ll/ۛۡۗ;)V

    goto :goto_11

    :cond_2a
    if-nez v4, :cond_2b

    const/4 v2, 0x1

    goto :goto_13

    .line 290
    :cond_2b
    invoke-virtual {v6}, Ll/ܰۖۗ;->ۖ()Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {v2}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v2

    new-instance v4, Ll/ۛᩴ᩵;

    invoke-direct {v4, v0, v1}, Ll/ۛᩴ᩵;-><init>(Ll/ܰᩴ᩵;Ll/᩷ۡۗ;)V

    .line 291
    invoke-interface {v2, v4}, Ll/᩵ܺۗ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result v2

    :goto_13
    if-eqz v2, :cond_2e

    .line 295
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v6}, Ll/ܰۖۗ;->ۖ()Ljava/util/ArrayList;

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 296
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2c
    :goto_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۘۖۗ;

    .line 297
    invoke-virtual {v4}, Ll/ۘۖۗ;->ۙ()Ll/ۛۡۗ;

    move-result-object v5

    invoke-static {v1, v5}, Ll/ܰᩴ᩵;->ۙ(Ll/᩷ۡۗ;Ll/ۛۡۗ;)Z

    move-result v5

    if-eqz v5, :cond_2c

    .line 298
    invoke-virtual {v4}, Ll/ۘۖۗ;->᩷()Ljava/util/List;

    move-result-object v5

    .line 299
    sget-object v8, Ll/ܰۖۗ;->ۢ:Ljava/lang/Object;

    invoke-interface {v5, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2d

    invoke-virtual/range {p3 .. p3}, Ll/֨ۢۗ;->ᩴۤ()Z

    move-result v5

    if-eqz v5, :cond_2c

    .line 301
    :cond_2d
    invoke-virtual {v4}, Ll/ۘۖۗ;->ۙ()Ll/ۛۡۗ;

    move-result-object v5

    sget-object v8, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-static {v7, v5, v8}, Ll/᩵ۧ᩵;->ۙ(Ll/ۖۡۗ;Ll/ۛۡۗ;Ll/֫۟ۗ;)V

    .line 302
    invoke-virtual {v6}, Ll/ܰۖۗ;->ۖ()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_14

    .line 77
    :cond_2e
    invoke-virtual/range {p4 .. p4}, Ll/ۨᩴ᩵;->᩸()V

    return-object v1
.end method
