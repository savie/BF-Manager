.class public final Ll/᩻ۙ᩵;
.super Ll/ܺ۠ۗ;
.source "A6D3"


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 28

    move-object/from16 v0, p1

    .line 42
    sget-object v1, Ll/᩶۟ۗ;->᩶:Ll/᩶۟ۗ;

    invoke-static {v0, v1}, Ll/ܿ۟ۗ;->᩷(Ll/ۖۡۗ;Ll/᩶۟ۗ;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_12

    .line 45
    :cond_0
    new-instance v1, Ll/ۢ֫᩵;

    const/4 v2, 0x0

    .line 42
    invoke-direct {v1, v2, v0}, Ll/ۢ֫᩵;-><init>(Ll/᩷ۡۗ;Ll/ۖۡۗ;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 49
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩷ۡۗ;

    .line 50
    invoke-virtual {v6}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v7

    .line 51
    check-cast v7, Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v9, 0x0

    :goto_2
    if-ge v9, v8, :cond_1a

    .line 70
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ᩳۡۗ;

    .line 71
    invoke-virtual {v10}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v11

    sget-object v12, Ll/᩺ۢۗ;->ۘۙ:Ll/᩺ۢۗ;

    if-ne v11, v12, :cond_1

    sget-object v11, Ll/֫۟ۗ;->ۜۙ:Ll/֫۟ۗ;

    invoke-virtual {v10, v11}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v11

    if-nez v11, :cond_1

    .line 72
    check-cast v10, Ll/۟ۢۗ;

    .line 79
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v11

    invoke-virtual {v10, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v2

    invoke-static {v11, v2}, Ll/۠֫᩵;->ۙ(Ll/֫ۖۗ;Ll/ܺ֨ۗ;)Ljava/lang/Object;

    move-result-object v2

    .line 80
    instance-of v11, v2, Ll/᩹֨ۗ;

    if-nez v11, :cond_2

    :cond_1
    :goto_3
    move/from16 v19, v3

    move-object/from16 v17, v4

    move/from16 v22, v5

    move-object/from16 v18, v6

    move/from16 v16, v8

    move v3, v9

    goto/16 :goto_10

    .line 83
    :cond_2
    check-cast v2, Ll/᩹֨ۗ;

    invoke-virtual {v2}, Ll/᩹֨ۗ;->ۧۙ()J

    move-result-wide v11

    long-to-int v2, v11

    if-nez v2, :cond_3

    goto :goto_3

    .line 87
    :cond_3
    invoke-virtual {v10}, Ll/۟ۢۗ;->᩵ۙ()Ll/֫֨ۗ;

    move-result-object v11

    .line 88
    invoke-virtual {v11}, Ll/֫֨ۗ;->ܳ()Ll/֫֨ۗ;

    move-result-object v12

    .line 89
    invoke-virtual {v11}, Ll/֫֨ۗ;->ᩴ()I

    move-result v11

    const/4 v13, 0x1

    if-ne v11, v13, :cond_4

    invoke-virtual {v12}, Ll/֫֨ۗ;->ܰ()Z

    move-result v11

    if-eqz v11, :cond_4

    .line 90
    div-int/lit8 v11, v2, 0x2

    goto :goto_4

    :cond_4
    move v11, v2

    .line 92
    :goto_4
    invoke-virtual {v10}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v13

    .line 93
    invoke-virtual {v13}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v14

    invoke-virtual {v14}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v14

    .line 94
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v15

    if-ge v15, v11, :cond_5

    goto :goto_3

    .line 99
    :cond_5
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_5
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_1

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ll/ۛ֨ۗ;

    .line 100
    invoke-virtual/range {v16 .. v16}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v16

    if-eqz v16, :cond_19

    move-object/from16 v17, v4

    .line 101
    invoke-virtual/range {v16 .. v16}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v4

    move/from16 v16, v8

    sget-object v8, Ll/᩺ۢۗ;->ܿ:Ll/᩺ۢۗ;

    if-ne v4, v8, :cond_18

    .line 110
    new-instance v4, Ljava/util/TreeMap;

    invoke-direct {v4}, Ljava/util/TreeMap;-><init>()V

    .line 112
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const/4 v14, 0x0

    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_d

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/ۛ֨ۗ;

    .line 113
    invoke-virtual {v15}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v15

    if-eqz v15, :cond_a

    move-object/from16 v18, v8

    .line 115
    invoke-virtual {v15}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v8

    move/from16 v19, v3

    sget-object v3, Ll/᩺ۢۗ;->ܿ:Ll/᩺ۢۗ;

    if-ne v8, v3, :cond_b

    const/4 v3, 0x0

    .line 116
    invoke-virtual {v15, v3}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v3

    invoke-virtual {v13, v3}, Ll/ۛ֨ۗ;->᩷(Ll/ܺ֨ۗ;)Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_7

    .line 122
    :cond_6
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v3

    const/4 v8, 0x1

    invoke-virtual {v15, v8}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v8

    invoke-static {v3, v8}, Ll/۠֫᩵;->ۙ(Ll/֫ۖۗ;Ll/ܺ֨ۗ;)Ljava/lang/Object;

    move-result-object v3

    .line 123
    instance-of v8, v3, Ll/᩹֨ۗ;

    if-nez v8, :cond_7

    move v3, v9

    goto/16 :goto_a

    .line 126
    :cond_7
    check-cast v3, Ll/᩹֨ۗ;

    invoke-virtual {v3}, Ll/᩹֨ۗ;->ۧۙ()J

    move-result-wide v20

    move v3, v9

    int-to-long v8, v2

    cmp-long v22, v20, v8

    if-ltz v22, :cond_8

    goto/16 :goto_a

    .line 130
    :cond_8
    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    goto :goto_9

    .line 134
    :cond_9
    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v4, v8, v15}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    :cond_a
    move/from16 v19, v3

    move-object/from16 v18, v8

    :cond_b
    :goto_7
    move v3, v9

    if-nez v14, :cond_c

    move-object v14, v15

    :cond_c
    :goto_8
    move v9, v3

    move-object/from16 v8, v18

    move/from16 v3, v19

    goto :goto_6

    :cond_d
    move/from16 v19, v3

    move v3, v9

    .line 136
    :goto_9
    invoke-virtual {v4}, Ljava/util/TreeMap;->size()I

    move-result v8

    if-ge v8, v11, :cond_e

    goto :goto_a

    .line 185
    :cond_e
    new-instance v8, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 186
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    .line 188
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v11, v9, :cond_f

    goto :goto_a

    .line 191
    :cond_f
    new-instance v9, Ljava/util/IdentityHashMap;

    invoke-direct {v9}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static {v9}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v9

    .line 192
    invoke-interface {v9, v7}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 193
    invoke-interface {v9, v8}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v9

    if-nez v9, :cond_10

    goto :goto_a

    .line 197
    :cond_10
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_11
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const/4 v11, 0x2

    if-eqz v9, :cond_12

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ᩳۡۗ;

    .line 198
    invoke-virtual {v9, v11}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v9

    .line 199
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    invoke-static {v9, v13}, Ll/۠֫᩵;->ۙ(Ll/ܺ֨ۗ;Ll/ۛ֨ۗ;)Z

    move-result v9

    if-eqz v9, :cond_11

    :goto_a
    move/from16 v22, v5

    move-object/from16 v18, v6

    goto/16 :goto_10

    .line 144
    :cond_12
    new-instance v8, Ll/᩻ۢۗ;

    invoke-direct {v8, v2, v12}, Ll/᩻ۢۗ;-><init>(ILl/֫֨ۗ;)V

    .line 145
    invoke-virtual {v13}, Ll/ۛ֨ۗ;->۠()Ll/ۛ֨ۗ;

    move-result-object v9

    invoke-virtual {v8, v9}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    .line 430
    invoke-virtual {v8, v10}, Ll/ܺ۟ۗ;->ۙ(Ll/ܺ۟ۗ;)V

    .line 431
    invoke-virtual {v8, v10}, Ll/ۚᩳۗ;->ۙ(Ll/ۚᩳۗ;)V

    .line 147
    invoke-virtual {v8, v10}, Ll/ᩳۡۗ;->ۤ(Ll/ᩳۡۗ;)V

    .line 148
    invoke-virtual {v10}, Ll/ᩳۡۗ;->getOffset()I

    move-result v9

    invoke-virtual {v8, v9}, Ll/ᩳۡۗ;->ܳ(I)V

    .line 151
    invoke-virtual {v4}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const-wide/16 v20, -0x1

    :goto_b
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    move/from16 v22, v5

    move-object/from16 v18, v6

    const-wide/16 v5, 0x0

    const-wide/16 v23, 0x1

    if-eqz v13, :cond_15

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Map$Entry;

    .line 152
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Long;

    invoke-virtual {v15}, Ljava/lang/Long;->longValue()J

    move-result-wide v25

    cmp-long v15, v25, v20

    if-eqz v15, :cond_13

    :goto_c
    add-long v20, v20, v23

    cmp-long v15, v20, v25

    if-gez v15, :cond_13

    .line 62
    invoke-static {v5, v6, v12}, Ll/᩹֨ۗ;->᩷(JLl/֫֨ۗ;)Ll/᩹֨ۗ;

    move-result-object v15

    .line 156
    invoke-virtual {v8, v15}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    goto :goto_c

    .line 159
    :cond_13
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۡۗ;

    .line 160
    invoke-virtual {v5, v11}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v6

    .line 207
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v11, v6, Ll/᩹֨ۗ;

    if-eqz v11, :cond_14

    .line 208
    invoke-virtual/range {p1 .. p1}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v11

    move-object v13, v6

    check-cast v13, Ll/᩹֨ۗ;

    invoke-virtual {v11, v13}, Ll/᩻ۡۗ;->ۙ(Ll/᩹֨ۗ;)Ll/ۘۡۗ;

    move-result-object v11

    if-eqz v11, :cond_14

    .line 210
    new-instance v6, Ll/ۗۢۗ;

    sget-object v13, Ll/᩺ۢۗ;->֨ۙ:Ll/᩺ۢۗ;

    invoke-interface {v11}, Ll/ۘۡۗ;->᩺()Ll/۬ᩳۗ;

    move-result-object v15

    move-object/from16 v27, v9

    const/4 v9, 0x0

    invoke-direct {v6, v13, v15, v9}, Ll/ۗۢۗ;-><init>(Ll/᩺ۢۗ;Ljava/lang/Object;I)V

    .line 211
    invoke-static {v6}, Ll/ܺ֨ۗ;->᩷(Ll/ᩳۡۗ;)Ll/ܽ֨ۗ;

    move-result-object v6

    .line 212
    invoke-static {v11, v0}, Ll/ܿ۬ۗ;->ۙ(Ll/ۘۡۗ;Ll/ۖۡۗ;)V

    goto :goto_d

    :cond_14
    move-object/from16 v27, v9

    .line 216
    invoke-virtual {v6}, Ll/ܺ֨ۗ;->۠()Ll/ܺ֨ۗ;

    move-result-object v6

    .line 160
    :goto_d
    invoke-virtual {v8, v6}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    .line 161
    invoke-virtual {v1, v5}, Ll/ۢ֫᩵;->ۙ(Ll/ᩳۡۗ;)V

    const/4 v11, 0x2

    move-object/from16 v6, v18

    move/from16 v5, v22

    move-wide/from16 v20, v25

    move-object/from16 v9, v27

    goto :goto_b

    :cond_15
    :goto_e
    add-long v20, v20, v23

    int-to-long v5, v2

    cmp-long v9, v20, v5

    if-gez v9, :cond_16

    const-wide/16 v5, 0x0

    .line 62
    invoke-static {v5, v6, v12}, Ll/᩹֨ۗ;->᩷(JLl/֫֨ۗ;)Ll/᩹֨ۗ;

    move-result-object v9

    .line 166
    invoke-virtual {v8, v9}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    goto :goto_e

    .line 168
    :cond_16
    invoke-virtual {v1, v10}, Ll/ۢ֫᩵;->ۙ(Ll/ᩳۡۗ;)V

    .line 171
    invoke-virtual {v4}, Ljava/util/TreeMap;->lastKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۡۗ;

    .line 172
    invoke-static {v7, v2}, Ll/᩶֫᩵;->ۙ(Ljava/util/List;Ll/ᩳۡۗ;)I

    move-result v2

    if-eqz v14, :cond_17

    .line 174
    invoke-static {v7, v14}, Ll/᩶֫᩵;->ۙ(Ljava/util/List;Ll/ᩳۡۗ;)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_17

    .line 177
    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 180
    :cond_17
    invoke-virtual {v7, v2, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const/4 v2, 0x1

    goto :goto_11

    :cond_18
    move/from16 v19, v3

    move/from16 v22, v5

    move-object/from16 v18, v6

    goto :goto_f

    :cond_19
    move/from16 v19, v3

    move-object/from16 v17, v4

    move/from16 v22, v5

    move-object/from16 v18, v6

    move/from16 v16, v8

    :goto_f
    move v3, v9

    move v9, v3

    move/from16 v8, v16

    move-object/from16 v4, v17

    move-object/from16 v6, v18

    move/from16 v3, v19

    move/from16 v5, v22

    goto/16 :goto_5

    :goto_10
    const/4 v2, 0x0

    :goto_11
    or-int v5, v22, v2

    add-int/lit8 v9, v3, 0x1

    const/4 v2, 0x0

    move/from16 v8, v16

    move-object/from16 v4, v17

    move-object/from16 v6, v18

    move/from16 v3, v19

    goto/16 :goto_2

    :cond_1a
    move/from16 v19, v3

    move-object/from16 v17, v4

    move/from16 v22, v5

    .line 55
    invoke-virtual {v1, v6}, Ll/ۢ֫᩵;->ۙ(Ll/᩷ۡۗ;)V

    const/4 v2, 0x0

    goto/16 :goto_1

    :cond_1b
    move/from16 v19, v3

    if-eqz v5, :cond_1d

    .line 58
    invoke-static/range {p1 .. p1}, Ll/ۜᩴ᩵;->᩷(Ll/ۖۡۗ;)V

    add-int/lit8 v3, v19, 0x1

    const/16 v2, 0x64

    move/from16 v4, v19

    if-le v4, v2, :cond_1c

    const-string v1, "Reached limit for ReplaceNewArray iterations"

    .line 63
    invoke-virtual {v0, v1}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    return-void

    :cond_1c
    const/4 v2, 0x0

    goto/16 :goto_0

    :cond_1d
    :goto_12
    return-void
.end method
