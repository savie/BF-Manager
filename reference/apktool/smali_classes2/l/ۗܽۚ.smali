.class public final Ll/ۗܽۚ;
.super Ljava/lang/Object;
.source "EIS7"


# direct methods
.method public static ۙ(Ll/۟ܶۚ;Ll/᩺ۨۚ;Ljava/util/ArrayList;)Ll/ܽܽۚ;
    .locals 28

    move-object/from16 v1, p1

    .line 24
    iget-object v0, v1, Ll/᩺ۨۚ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    const-string v3, "warning"

    if-nez v2, :cond_29

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/16 v4, 0xc8

    if-gt v2, v4, :cond_29

    .line 27
    invoke-virtual/range {p0 .. p0}, Ll/۟ܶۚ;->᩷()Ll/ۤܶۚ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۤܶۚ;->ۙ()Ll/ۜܳۤ;

    move-result-object v2

    .line 28
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 29
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    const/4 v6, 0x0

    .line 30
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v6, v7, :cond_1b

    .line 31
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۛۨۚ;

    :try_start_0
    const-string v8, "type_variant"

    .line 33
    iget-object v9, v7, Ll/ۛۨۚ;->ۙ:Ljava/lang/String;

    iget-object v10, v7, Ll/ۛۨۚ;->ᩴ:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    const-string v9, "resource"

    .line 34
    iget-object v12, v7, Ll/ۛۨۚ;->ۙ:Ljava/lang/String;

    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9
    :try_end_0
    .catch Ll/ۢܳۚ; {:try_start_0 .. :try_end_0} :catch_2

    const/16 v12, 0x10

    if-eqz v8, :cond_0

    const v13, 0xffff

    .line 35
    :try_start_1
    iget v14, v7, Ll/ۛۨۚ;->᩷:I

    shl-int/lit8 v14, v14, 0x18

    iget v7, v7, Ll/ۛۨۚ;->᩸:I
    :try_end_1
    .catch Ll/ۢܳۚ; {:try_start_1 .. :try_end_1} :catch_0

    shl-int/2addr v7, v12

    or-int/2addr v7, v14

    goto :goto_1

    :catch_0
    move-exception v0

    goto/16 :goto_11

    :cond_0
    const v13, 0xffff

    .line 36
    :try_start_2
    iget-object v7, v7, Ll/ۛۨۚ;->ۤ:Ljava/lang/String;

    const/4 v14, 0x2

    invoke-virtual {v7, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v12}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v14

    long-to-int v7, v14

    :goto_1
    ushr-int/lit8 v12, v7, 0x18

    ushr-int/lit8 v14, v7, 0x10

    and-int/lit16 v14, v14, 0xff

    .line 130
    invoke-interface {v2}, Ll/ۜܳۤ;->۠()Ljava/lang/Iterable;

    move-result-object v15

    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    const/16 v16, 0x0

    move-object/from16 v11, v16

    :goto_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16
    :try_end_2
    .catch Ll/ۢܳۚ; {:try_start_2 .. :try_end_2} :catch_2

    move-object/from16 v17, v0

    const-string v0, "The resource deletion target does not have a unique identity."

    move-object/from16 v18, v2

    const-string v2, "RESOURCE_TARGET_AMBIGUOUS"

    if-eqz v16, :cond_5

    :try_start_3
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ll/ۤ۫ۤ;

    move-object/from16 v19, v15

    .line 131
    invoke-interface/range {v16 .. v16}, Ll/ۤ۫ۤ;->۫()I

    move-result v15

    if-eq v15, v12, :cond_2

    :cond_1
    move/from16 v20, v12

    goto :goto_5

    .line 132
    :cond_2
    invoke-interface/range {v16 .. v16}, Ll/ۤ۫ۤ;->ܽ᩷()Ljava/lang/Iterable;

    move-result-object v15

    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_3
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_1

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ll/ܳ۫ۤ;

    move/from16 v20, v12

    .line 133
    invoke-interface/range {v16 .. v16}, Ll/ܳ۫ۤ;->ܶۙ()I

    move-result v12

    if-eq v12, v14, :cond_3

    goto :goto_4

    :cond_3
    if-nez v11, :cond_4

    move-object/from16 v11, v16

    :goto_4
    move/from16 v12, v20

    goto :goto_3

    :cond_4
    const/4 v4, 0x0

    .line 148
    invoke-static {v4, v2, v0, v3}, Ll/ۢܳۚ;->ۙ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    .line 134
    throw v0
    :try_end_3
    .catch Ll/ۢܳۚ; {:try_start_3 .. :try_end_3} :catch_2

    :goto_5
    move-object/from16 v0, v17

    move-object/from16 v2, v18

    move-object/from16 v15, v19

    move/from16 v12, v20

    goto :goto_2

    :cond_5
    if-eqz v8, :cond_6

    :try_start_4
    const-string v12, "RESOURCE_TYPE_VARIANT_NOT_FOUND"

    goto :goto_6

    :catch_1
    move-exception v0

    goto :goto_7

    :cond_6
    if-eqz v9, :cond_7

    const-string v12, "RESOURCE_NOT_FOUND"
    :try_end_4
    .catch Ll/ۢܳۚ; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_6

    :cond_7
    :try_start_5
    const-string v12, "RESOURCE_VARIANT_NOT_FOUND"
    :try_end_5
    .catch Ll/ۢܳۚ; {:try_start_5 .. :try_end_5} :catch_2

    :goto_6
    const-string v14, "Resource deletion target does not exist."

    if-eqz v11, :cond_1a

    if-nez v6, :cond_8

    if-eqz v8, :cond_8

    .line 42
    :try_start_6
    invoke-interface {v11}, Ll/ܳ۫ۤ;->getTypeName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v10}, Ll/ۤۤۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catch Ll/ۢܳۚ; {:try_start_6 .. :try_end_6} :catch_1

    :cond_8
    const/high16 v15, -0x10000

    and-int/2addr v15, v7

    .line 44
    :try_start_7
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ܽۚ;
    :try_end_7
    .catch Ll/ۢܳۚ; {:try_start_7 .. :try_end_7} :catch_2

    if-nez v1, :cond_9

    .line 45
    :try_start_8
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v15, Ll/᩹ܽۚ;

    invoke-direct {v15, v11}, Ll/᩹ܽۚ;-><init>(Ll/ܳ۫ۤ;)V

    invoke-virtual {v5, v1, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8
    .catch Ll/ۢܳۚ; {:try_start_8 .. :try_end_8} :catch_1

    move-object v1, v15

    goto :goto_8

    :goto_7
    move-object/from16 v1, p1

    goto/16 :goto_11

    .line 46
    :cond_9
    :goto_8
    :try_start_9
    iget-object v15, v1, Ll/᩹ܽۚ;->ۙ:Ljava/util/BitSet;

    move-object/from16 p0, v5

    iget-object v5, v1, Ll/᩹ܽۚ;->᩷:Ljava/util/HashSet;

    iget-object v1, v1, Ll/᩹ܽۚ;->᩸:Ljava/util/HashMap;

    move-object/from16 v16, v12

    new-instance v12, Ll/ܶܽۚ;

    invoke-direct {v12, v11, v7, v8}, Ll/ܶܽۚ;-><init>(Ll/ܳ۫ۤ;IZ)V

    move-object/from16 v19, v14

    iget-object v14, v12, Ll/ܶܽۚ;->ۙ:Ljava/util/ArrayList;
    :try_end_9
    .catch Ll/ۢܳۚ; {:try_start_9 .. :try_end_9} :catch_2

    move/from16 v20, v6

    .line 47
    :try_start_a
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 49
    invoke-interface {v11}, Ll/ܳ۫ۤ;->ۧ()Ljava/lang/Iterable;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v21

    const/16 v22, 0x0

    move-object/from16 v23, v4

    move-object/from16 v4, v22

    :goto_9
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-eqz v22, :cond_e

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v22

    move-object/from16 v24, v12

    move-object/from16 v12, v22

    check-cast v12, Ll/ۖܳۤ;

    move-object/from16 v22, v14

    .line 50
    invoke-static {v12}, Ll/ۢܶۚ;->ۙ(Ll/ۖܳۤ;)Ljava/lang/String;

    move-result-object v14

    .line 51
    invoke-virtual {v6, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v25

    check-cast v25, Ljava/lang/Integer;

    if-nez v25, :cond_a

    const/16 v25, 0x1

    goto :goto_a

    .line 52
    :cond_a
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Integer;->intValue()I

    move-result v25

    add-int/lit8 v25, v25, 0x1

    :goto_a
    move-object/from16 v26, v15

    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v6, v14, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez v8, :cond_d

    and-int v14, v7, v13

    .line 53
    invoke-interface {v12, v14}, Ll/ۖܳۤ;->ܺ(I)Z

    move-result v15

    if-eqz v15, :cond_d

    .line 54
    invoke-interface {v12, v14}, Ll/ۖܳۤ;->ۤ(I)Ljava/lang/String;

    move-result-object v12

    if-eqz v4, :cond_c

    .line 55
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_b

    :cond_b
    const/4 v1, 0x0

    .line 148
    invoke-static {v1, v2, v0, v3}, Ll/ۢܳۚ;->ۙ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    .line 55
    throw v0

    :cond_c
    :goto_b
    move-object v4, v12

    :cond_d
    move-object/from16 v14, v22

    move-object/from16 v12, v24

    move-object/from16 v15, v26

    goto :goto_9

    :cond_e
    move-object/from16 v24, v12

    move-object/from16 v22, v14

    move-object/from16 v26, v15

    .line 59
    invoke-interface {v11}, Ll/ܳ۫ۤ;->ۧ()Ljava/lang/Iterable;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_18

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۖܳۤ;

    .line 60
    invoke-static {v11}, Ll/ۢܶۚ;->ۙ(Ll/ۖܳۤ;)Ljava/lang/String;

    move-result-object v12

    if-nez v9, :cond_f

    .line 61
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_f

    goto :goto_c

    :cond_f
    if-nez v8, :cond_10

    and-int v14, v7, v13

    .line 62
    invoke-interface {v11, v14}, Ll/ۖܳۤ;->ܺ(I)Z

    move-result v14

    if-nez v14, :cond_10

    goto :goto_c

    .line 63
    :cond_10
    invoke-virtual {v6, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    const/4 v15, 0x1

    if-ne v14, v15, :cond_17

    .line 64
    invoke-virtual {v1, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/BitSet;

    if-nez v14, :cond_11

    .line 65
    new-instance v14, Ljava/util/BitSet;

    invoke-direct {v14}, Ljava/util/BitSet;-><init>()V

    invoke-virtual {v1, v12, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_a
    .catch Ll/ۢܳۚ; {:try_start_a .. :try_end_a} :catch_3

    :cond_11
    const-string v15, "Deletion targets overlap; submit each resource value or type variant once."

    move-object/from16 v21, v1

    const-string v1, "RESOURCE_DELETE_OVERLAP"

    if-eqz v8, :cond_15

    .line 67
    :try_start_b
    invoke-virtual {v5, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_14

    invoke-virtual {v14}, Ljava/util/BitSet;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_14

    const/4 v1, 0x0

    .line 69
    :goto_d
    invoke-interface {v11}, Ll/ۖܳۤ;->ۛ()I

    move-result v12

    if-gt v1, v12, :cond_13

    .line 70
    invoke-interface {v11, v1}, Ll/ۖܳۤ;->ܺ(I)Z

    move-result v12

    if-nez v12, :cond_12

    move-object/from16 v12, v26

    goto :goto_e

    .line 71
    :cond_12
    invoke-virtual {v14, v1}, Ljava/util/BitSet;->set(I)V

    move-object/from16 v12, v26

    .line 72
    invoke-virtual {v12, v1}, Ljava/util/BitSet;->set(I)V

    :goto_e
    add-int/lit8 v1, v1, 0x1

    move-object/from16 v26, v12

    goto :goto_d

    :cond_13
    move-object/from16 v1, v22

    move-object/from16 v12, v26

    .line 74
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v22, v4

    move-object/from16 v25, v6

    move/from16 v26, v8

    move-object v4, v12

    move-object v6, v1

    goto :goto_f

    :cond_14
    const/4 v0, 0x0

    .line 148
    invoke-static {v0, v1, v15, v3}, Ll/ۢܳۚ;->ۙ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    .line 67
    throw v0

    :cond_15
    move-object/from16 v25, v6

    move-object/from16 v6, v22

    move-object/from16 v22, v4

    move-object/from16 v4, v26

    move/from16 v26, v8

    and-int v8, v7, v13

    .line 77
    invoke-virtual {v14, v8}, Ljava/util/BitSet;->get(I)Z

    move-result v27

    if-nez v27, :cond_16

    invoke-virtual {v5, v12}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_16

    .line 78
    invoke-virtual {v14, v8}, Ljava/util/BitSet;->set(I)V

    .line 79
    invoke-virtual {v4, v8}, Ljava/util/BitSet;->set(I)V

    .line 80
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_f
    move-object/from16 v1, v21

    move/from16 v8, v26

    move-object/from16 v26, v4

    move-object/from16 v4, v22

    move-object/from16 v22, v6

    move-object/from16 v6, v25

    goto/16 :goto_c

    :cond_16
    const/4 v0, 0x0

    .line 148
    invoke-static {v0, v1, v15, v3}, Ll/ۢܳۚ;->ۙ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    .line 77
    throw v0

    :cond_17
    const/4 v1, 0x0

    .line 148
    invoke-static {v1, v2, v0, v3}, Ll/ۢܳۚ;->ۙ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    .line 63
    throw v0

    :cond_18
    move-object/from16 v6, v22

    .line 83
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_19

    move-object/from16 v0, v23

    move-object/from16 v1, v24

    .line 84
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v20, 0x1

    move-object/from16 v5, p0

    move-object/from16 v1, p1

    move-object v4, v0

    move-object/from16 v0, v17

    move-object/from16 v2, v18

    goto/16 :goto_0

    :cond_19
    const/4 v0, 0x0

    move-object/from16 v12, v16

    move-object/from16 v1, v19

    .line 148
    invoke-static {v0, v12, v1, v3}, Ll/ۢܳۚ;->ۙ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    .line 83
    throw v0

    :catch_2
    move-exception v0

    move/from16 v20, v6

    goto :goto_10

    :cond_1a
    move/from16 v20, v6

    move-object v1, v14

    const/4 v0, 0x0

    .line 148
    invoke-static {v0, v12, v1, v3}, Ll/ۢܳۚ;->ۙ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    .line 40
    throw v0
    :try_end_b
    .catch Ll/ۢܳۚ; {:try_start_b .. :try_end_b} :catch_3

    :catch_3
    move-exception v0

    :goto_10
    move-object/from16 v1, p1

    move/from16 v6, v20

    .line 86
    :goto_11
    invoke-static {v0, v1, v6}, Ll/ܳ᩵ۚ;->ۙ(Ll/ۢܳۚ;Ll/᩺ۨۚ;I)V

    .line 87
    throw v0

    :cond_1b
    move-object v0, v4

    move-object/from16 p0, v5

    const/high16 v1, -0x10000

    const v2, 0xffff

    .line 90
    new-instance v3, Ll/ܽܽۚ;

    invoke-direct {v3}, Ll/ܽܽۚ;-><init>()V

    .line 91
    invoke-virtual/range {p0 .. p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_21

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩹ܽۚ;

    .line 92
    iget v6, v3, Ll/ܽܽۚ;->᩷:I

    iget-object v7, v5, Ll/᩹ܽۚ;->᩷:Ljava/util/HashSet;

    iget-object v8, v5, Ll/᩹ܽۚ;->ۙ:Ljava/util/BitSet;

    iget-object v9, v5, Ll/᩹ܽۚ;->᩸:Ljava/util/HashMap;

    invoke-virtual {v7}, Ljava/util/HashSet;->size()I

    move-result v7

    add-int/2addr v7, v6

    iput v7, v3, Ll/ܽܽۚ;->᩷:I

    .line 93
    invoke-virtual {v9}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_12
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/BitSet;

    iget v10, v3, Ll/ܽܽۚ;->ۤ:I

    invoke-virtual {v7}, Ljava/util/BitSet;->cardinality()I

    move-result v7

    add-int/2addr v7, v10

    iput v7, v3, Ll/ܽܽۚ;->ۤ:I

    goto :goto_12

    :cond_1d
    const/4 v6, 0x0

    .line 94
    :goto_13
    invoke-virtual {v8, v6}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v6

    if-ltz v6, :cond_1c

    .line 96
    iget-object v7, v5, Ll/᩹ܽۚ;->ۤ:Ll/ܳ۫ۤ;

    invoke-interface {v7}, Ll/ܳ۫ۤ;->ۧ()Ljava/lang/Iterable;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_1e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1f

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۖܳۤ;

    .line 97
    invoke-static {v10}, Ll/ۢܶۚ;->ۙ(Ll/ۖܳۤ;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/BitSet;

    .line 98
    invoke-interface {v10, v6}, Ll/ۖܳۤ;->ܺ(I)Z

    move-result v10

    if-eqz v10, :cond_1e

    if-eqz v11, :cond_20

    invoke-virtual {v11, v6}, Ljava/util/BitSet;->get(I)Z

    move-result v10

    if-nez v10, :cond_1e

    goto :goto_14

    .line 103
    :cond_1f
    iget v7, v3, Ll/ܽܽۚ;->ۙ:I

    add-int/lit8 v7, v7, 0x1

    iput v7, v3, Ll/ܽܽۚ;->ۙ:I

    :cond_20
    :goto_14
    add-int/lit8 v6, v6, 0x1

    goto :goto_13

    .line 106
    :cond_21
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_15
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_25

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֨ܶۚ;

    .line 107
    iget v6, v5, Ll/֨ܶۚ;->۫:I

    iget-object v7, v5, Ll/֨ܶۚ;->ܺ:Ljava/lang/String;

    and-int/2addr v6, v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object/from16 v8, p0

    invoke-virtual {v8, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩹ܽۚ;

    if-nez v6, :cond_22

    goto :goto_16

    .line 109
    :cond_22
    iget-object v9, v6, Ll/᩹ܽۚ;->᩸:Ljava/util/HashMap;

    invoke-virtual {v9, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/BitSet;

    .line 110
    iget-object v6, v6, Ll/᩹ܽۚ;->᩷:Ljava/util/HashSet;

    invoke-virtual {v6, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_23

    .line 111
    invoke-virtual {v5}, Ll/֨ܶۚ;->᩷()Z

    move-result v6

    if-nez v6, :cond_24

    if-eqz v9, :cond_24

    iget v6, v5, Ll/֨ܶۚ;->۫:I

    and-int/2addr v6, v2

    invoke-virtual {v9, v6}, Ljava/util/BitSet;->get(I)Z

    move-result v6

    if-eqz v6, :cond_24

    .line 112
    :cond_23
    iget-object v6, v3, Ll/ܽܽۚ;->ᩴ:Ljava/util/HashSet;

    iget-object v5, v5, Ll/֨ܶۚ;->֫:Ljava/lang/String;

    invoke-virtual {v6, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_24
    :goto_16
    move-object/from16 p0, v8

    goto :goto_15

    .line 115
    :cond_25
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_26
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_28

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶܽۚ;

    .line 116
    iget-object v4, v1, Ll/ܶܽۚ;->ۙ:Ljava/util/ArrayList;

    iget-object v5, v1, Ll/ܶܽۚ;->᩸:Ll/ܳ۫ۤ;

    iget v6, v1, Ll/ܶܽۚ;->᩷:I

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_17
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_26

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۖܳۤ;

    .line 117
    invoke-static {v7}, Ll/ۢܶۚ;->ۙ(Ll/ۖܳۤ;)Ljava/lang/String;

    move-result-object v8

    .line 118
    iget-boolean v9, v1, Ll/ܶܽۚ;->ۤ:Z

    if-eqz v9, :cond_27

    .line 120
    invoke-interface {v5}, Ll/ܳ۫ۤ;->getTypeName()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5}, Ll/ܳ۫ۤ;->֫()I

    move-result v9

    .line 119
    invoke-static {v8, v6, v9, v7}, Ll/֨ܶۚ;->ۙ(Ljava/lang/String;IILjava/lang/String;)Ll/֨ܶۚ;

    move-result-object v7

    goto :goto_18

    .line 122
    :cond_27
    invoke-interface {v5}, Ll/ܳ۫ۤ;->getTypeName()Ljava/lang/String;

    move-result-object v9

    and-int v10, v6, v2

    invoke-interface {v7, v10}, Ll/ۖܳۤ;->ۤ(I)Ljava/lang/String;

    move-result-object v7

    .line 121
    invoke-static {v8, v6, v9, v7}, Ll/֨ܶۚ;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ll/֨ܶۚ;

    move-result-object v7

    .line 118
    :goto_18
    iget-object v8, v3, Ll/ܽܽۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_17

    :cond_28
    return-object v3

    :cond_29
    const-string v0, "INVALID_ARGUMENT"

    const-string v1, "deletes must contain between 1 and 200 targets."

    const/4 v2, 0x0

    .line 148
    invoke-static {v2, v0, v1, v3}, Ll/ۢܳۚ;->ۙ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    .line 25
    throw v0
.end method
