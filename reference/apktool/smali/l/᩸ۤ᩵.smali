.class public final Ll/᩸ۤ᩵;
.super Ll/ۙۤ᩵;
.source "WIVV"


# virtual methods
.method public final ᩷()Ljava/util/List;
    .locals 28

    .line 27
    invoke-virtual/range {p0 .. p0}, Ll/ۙۤ᩵;->ۙ()Ll/۟ۤ᩵;

    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ll/۟ۤ᩵;->ܳ()Ll/ܺܳܺ;

    move-result-object v1

    .line 30
    invoke-virtual {v0}, Ll/۟ۤ᩵;->ᩴ()Ll/֨ۤ᩵;

    move-result-object v2

    .line 31
    invoke-virtual {v0}, Ll/۟ۤ᩵;->᩸()Ll/֨ۤ᩵;

    move-result-object v3

    .line 33
    invoke-virtual {v2}, Ll/֨ۤ᩵;->ۙ()Ll/ᩳۤ᩵;

    move-result-object v2

    .line 34
    invoke-virtual {v3}, Ll/֨ۤ᩵;->ۙ()Ll/ᩳۤ᩵;

    move-result-object v3

    .line 35
    invoke-virtual {v2}, Ll/ᩳۤ᩵;->᩷()Ll/᩷ۡۗ;

    move-result-object v2

    .line 36
    invoke-virtual {v3}, Ll/ᩳۤ᩵;->᩷()Ll/᩷ۡۗ;

    move-result-object v3

    .line 124
    invoke-virtual {v0}, Ll/۟ۤ᩵;->ᩴ()Ll/֨ۤ᩵;

    move-result-object v4

    .line 125
    invoke-virtual {v0}, Ll/۟ۤ᩵;->᩸()Ll/֨ۤ᩵;

    move-result-object v5

    .line 127
    invoke-virtual {v4}, Ll/֨ۤ᩵;->ۙ()Ll/ᩳۤ᩵;

    move-result-object v6

    .line 128
    invoke-virtual {v5}, Ll/֨ۤ᩵;->ۙ()Ll/ᩳۤ᩵;

    move-result-object v7

    if-eqz v6, :cond_20

    if-eqz v7, :cond_20

    .line 135
    invoke-virtual {v6}, Ll/ᩳۤ᩵;->᩷()Ll/᩷ۡۗ;

    move-result-object v8

    .line 136
    invoke-virtual {v7}, Ll/ᩳۤ᩵;->᩷()Ll/᩷ۡۗ;

    move-result-object v9

    .line 138
    invoke-virtual {v6}, Ll/ᩳۤ᩵;->ᩴ()Ljava/util/List;

    move-result-object v10

    .line 139
    invoke-virtual {v7}, Ll/ᩳۤ᩵;->ᩴ()Ljava/util/List;

    move-result-object v11

    .line 140
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v12

    .line 141
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v13

    .line 143
    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    move-result v14

    .line 145
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15, v14}, Ljava/util/ArrayList;-><init>(I)V

    const/16 v16, 0x0

    move-object/from16 v17, v1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v14, :cond_12

    sub-int v16, v13, v1

    move-object/from16 v18, v3

    add-int/lit8 v3, v16, -0x1

    .line 149
    invoke-interface {v11, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۡۗ;

    sub-int v16, v12, v1

    move-object/from16 v19, v11

    add-int/lit8 v11, v16, -0x1

    .line 150
    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ᩳۡۗ;

    .line 41
    invoke-virtual {v3, v11}, Ll/ᩳۡۗ;->ᩴ(Ll/ᩳۡۗ;)Z

    move-result v16

    if-nez v16, :cond_0

    move-object/from16 v16, v2

    move-object/from16 v21, v4

    move-object/from16 v22, v5

    move-object/from16 v24, v8

    move-object/from16 v23, v9

    move-object/from16 v20, v10

    move/from16 v26, v14

    goto/16 :goto_b

    :cond_0
    const/16 v16, 0x0

    move-object/from16 v16, v2

    move-object/from16 v20, v10

    const/4 v10, 0x0

    .line 44
    :goto_1
    invoke-virtual {v3}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v2

    if-ge v10, v2, :cond_10

    .line 45
    invoke-virtual {v3, v10}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v2

    move-object/from16 v21, v4

    .line 46
    invoke-virtual {v11, v10}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v4

    if-nez v2, :cond_1

    move-object/from16 v22, v5

    move-object/from16 v24, v8

    move-object/from16 v23, v9

    :goto_2
    move/from16 v26, v14

    goto/16 :goto_8

    :cond_1
    move-object/from16 v22, v5

    .line 0
    instance-of v5, v2, Ll/ۛ֨ۗ;

    .line 60
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v23, v9

    .line 0
    instance-of v9, v4, Ll/ۛ֨ۗ;

    if-eq v5, v9, :cond_2

    move-object/from16 v24, v8

    goto :goto_2

    :cond_2
    if-eqz v5, :cond_9

    .line 64
    move-object v5, v2

    check-cast v5, Ll/ۛ֨ۗ;

    .line 65
    move-object v9, v4

    check-cast v9, Ll/ۛ֨ۗ;

    .line 66
    invoke-virtual {v5, v9}, Ll/ۛ֨ۗ;->᩷(Ll/ۛ֨ۗ;)Z

    move-result v24

    if-nez v24, :cond_9

    move-object/from16 v24, v8

    .line 14
    sget-object v8, Ll/ۧ۟ۗ;->ۜ:Ll/ۧ۟ۗ;

    invoke-virtual {v9, v8}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v25

    move/from16 v26, v14

    move-object/from16 v14, v25

    check-cast v14, Ll/᩺ᩳۗ;

    .line 15
    invoke-virtual {v5, v8}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v8

    check-cast v8, Ll/᩺ᩳۗ;

    if-eqz v14, :cond_4

    if-nez v8, :cond_3

    goto :goto_3

    .line 19
    :cond_3
    invoke-virtual {v8, v14}, Ll/᩺ᩳۗ;->equals(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_4

    :cond_4
    :goto_3
    const/4 v8, 0x0

    :goto_4
    if-nez v8, :cond_a

    .line 23
    invoke-virtual {v9}, Ll/ۛ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v8

    .line 24
    invoke-virtual {v5}, Ll/ۛ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v5

    if-eqz v8, :cond_8

    if-nez v5, :cond_5

    goto :goto_5

    .line 28
    :cond_5
    invoke-virtual {v8, v5}, Ll/ᩳۡۗ;->ᩴ(Ll/ᩳۡۗ;)Z

    move-result v9

    if-nez v9, :cond_6

    goto :goto_5

    .line 31
    :cond_6
    invoke-virtual {v8}, Ll/ᩳۡۗ;->ܶۙ()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual {v5}, Ll/ᩳۡۗ;->ܶۙ()Z

    move-result v5

    if-eqz v5, :cond_7

    .line 34
    invoke-virtual {v8}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v8}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v8

    invoke-static {v5, v8}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    xor-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_7
    const/4 v5, 0x0

    goto :goto_6

    :cond_8
    :goto_5
    const/4 v5, 0x1

    :goto_6
    if-eqz v5, :cond_a

    goto :goto_8

    :cond_9
    move-object/from16 v24, v8

    move/from16 v26, v14

    .line 72
    :cond_a
    invoke-virtual {v2}, Ll/ܺ֨ۗ;->᩷ۙ()Z

    move-result v5

    .line 73
    invoke-virtual {v4}, Ll/ܺ֨ۗ;->᩷ۙ()Z

    move-result v8

    if-eq v5, v8, :cond_b

    goto :goto_8

    :cond_b
    if-eqz v5, :cond_e

    .line 281
    invoke-virtual {v2}, Ll/ܺ֨ۗ;->᩷ۙ()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-virtual {v4}, Ll/ܺ֨ۗ;->᩷ۙ()Z

    move-result v5

    if-eqz v5, :cond_c

    .line 282
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_7

    :cond_c
    const/4 v2, 0x0

    :goto_7
    if-eqz v2, :cond_d

    goto :goto_9

    :cond_d
    :goto_8
    const/4 v2, 0x0

    goto :goto_a

    :cond_e
    :goto_9
    const/4 v2, 0x1

    :goto_a
    if-nez v2, :cond_f

    :goto_b
    const/4 v2, 0x0

    goto :goto_c

    :cond_f
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v4, v21

    move-object/from16 v5, v22

    move-object/from16 v9, v23

    move-object/from16 v8, v24

    move/from16 v14, v26

    goto/16 :goto_1

    :cond_10
    move-object/from16 v21, v4

    move-object/from16 v22, v5

    move-object/from16 v24, v8

    move-object/from16 v23, v9

    move/from16 v26, v14

    const/4 v2, 0x1

    :goto_c
    if-nez v2, :cond_11

    goto :goto_d

    .line 156
    :cond_11
    new-instance v2, Ll/ۙۧ᩵;

    invoke-direct {v2, v11, v3}, Ll/ۙۧ᩵;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 157
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    move-object/from16 v2, v16

    move-object/from16 v3, v18

    move-object/from16 v11, v19

    move-object/from16 v10, v20

    move-object/from16 v4, v21

    move-object/from16 v5, v22

    move-object/from16 v9, v23

    move-object/from16 v8, v24

    move/from16 v14, v26

    goto/16 :goto_0

    :cond_12
    move-object/from16 v16, v2

    move-object/from16 v18, v3

    move-object/from16 v21, v4

    move-object/from16 v22, v5

    move-object/from16 v24, v8

    move-object/from16 v23, v9

    move/from16 v26, v14

    .line 160
    :goto_d
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 162
    invoke-virtual {v0, v6, v1}, Ll/۟ۤ᩵;->ۙ(Ll/ᩳۤ᩵;I)V

    .line 163
    invoke-virtual {v0, v7, v1}, Ll/۟ۤ᩵;->ۙ(Ll/ᩳۤ᩵;I)V

    if-le v12, v13, :cond_13

    const/4 v2, 0x1

    goto :goto_e

    :cond_13
    const/4 v2, 0x0

    :goto_e
    if-ge v12, v13, :cond_14

    const/4 v3, 0x1

    goto :goto_f

    :cond_14
    const/4 v3, 0x0

    :goto_f
    if-nez v2, :cond_15

    if-nez v3, :cond_15

    const/4 v2, 0x1

    goto :goto_10

    :cond_15
    const/4 v2, 0x0

    :goto_10
    move/from16 v3, v26

    if-ne v1, v3, :cond_16

    const/4 v3, 0x1

    goto :goto_11

    :cond_16
    const/4 v3, 0x0

    :goto_11
    if-nez v1, :cond_17

    const/4 v1, 0x1

    goto :goto_12

    :cond_17
    const/4 v1, 0x0

    .line 171
    :goto_12
    invoke-virtual {v0}, Ll/۟ۤ᩵;->۫()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4, v15}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    if-eqz v3, :cond_1a

    if-eqz v2, :cond_18

    .line 25
    invoke-virtual {v0}, Ll/۟ۤ᩵;->ᩴ()Ll/֨ۤ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨ۤ᩵;->᩷()Ll/֡᩷᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/֡᩷᩵;->ۙ()Ll/֡᩷᩵;

    move-result-object v1

    .line 26
    invoke-virtual {v0}, Ll/۟ۤ᩵;->᩸()Ll/֨ۤ᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/֨ۤ᩵;->᩷()Ll/֡᩷᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/֡᩷᩵;->ۙ()Ll/֡᩷᩵;

    move-result-object v2

    const/4 v3, 0x0

    .line 28
    invoke-virtual {v1, v3}, Ll/֡᩷᩵;->ۙ(Z)V

    .line 29
    invoke-virtual {v2, v3}, Ll/֡᩷᩵;->ۙ(Z)V

    .line 30
    invoke-virtual {v1}, Ll/֡᩷᩵;->ᩴ()V

    .line 31
    invoke-virtual {v2}, Ll/֡᩷᩵;->ᩴ()V

    move-object/from16 v3, v24

    .line 34
    invoke-static {v1, v3}, Ll/ۨۤ᩵;->ۙ(Ll/֡᩷᩵;Ll/᩷ۡۗ;)Ll/۬᩷᩵;

    move-result-object v1

    move-object/from16 v4, v23

    .line 36
    invoke-static {v2, v4}, Ll/ۨۤ᩵;->ۙ(Ll/֡᩷᩵;Ll/᩷ۡۗ;)Ll/۬᩷᩵;

    move-result-object v2

    .line 38
    invoke-static {v0, v1, v2}, Ll/۟ۤ᩵;->ۙ(Ll/۟ۤ᩵;Ll/۬᩷᩵;Ll/۬᩷᩵;)Ll/۟ۤ᩵;

    move-result-object v0

    goto/16 :goto_16

    :cond_18
    move-object/from16 v4, v23

    move-object/from16 v3, v24

    const/4 v1, 0x0

    .line 45
    invoke-static {v12, v13}, Ljava/lang/Math;->max(II)I

    move-result v2

    if-le v12, v13, :cond_19

    .line 54
    invoke-virtual/range {v22 .. v22}, Ll/֨ۤ᩵;->᩷()Ll/֡᩷᩵;

    move-result-object v3

    invoke-virtual {v3}, Ll/֡᩷᩵;->ۙ()Ll/֡᩷᩵;

    move-result-object v3

    .line 55
    invoke-virtual {v3, v1}, Ll/֡᩷᩵;->ۙ(Z)V

    .line 56
    invoke-virtual {v3}, Ll/֡᩷᩵;->ᩴ()V

    .line 57
    invoke-virtual/range {v21 .. v21}, Ll/֨ۤ᩵;->᩷()Ll/֡᩷᩵;

    move-result-object v5

    .line 58
    invoke-virtual {v5, v1}, Ll/֡᩷᩵;->ۙ(Z)V

    .line 59
    invoke-virtual {v5}, Ll/֡᩷᩵;->ᩴ()V

    sub-int/2addr v12, v2

    .line 62
    new-instance v1, Ll/ۜ᩷᩵;

    move-object/from16 v5, v21

    invoke-direct {v1, v5}, Ll/ۜ᩷᩵;-><init>(Ll/֨ۤ᩵;)V

    .line 63
    invoke-virtual {v5}, Ll/֨ۤ᩵;->ۙ()Ll/ᩳۤ᩵;

    move-result-object v2

    .line 64
    invoke-static {v3, v4}, Ll/ۨۤ᩵;->ۙ(Ll/֡᩷᩵;Ll/᩷ۡۗ;)Ll/۬᩷᩵;

    move-result-object v3

    goto :goto_13

    :cond_19
    move-object/from16 v5, v21

    .line 67
    invoke-virtual {v5}, Ll/֨ۤ᩵;->᩷()Ll/֡᩷᩵;

    move-result-object v4

    invoke-virtual {v4}, Ll/֡᩷᩵;->ۙ()Ll/֡᩷᩵;

    move-result-object v4

    .line 68
    invoke-virtual {v4, v1}, Ll/֡᩷᩵;->ۙ(Z)V

    .line 69
    invoke-virtual {v4}, Ll/֡᩷᩵;->ᩴ()V

    .line 70
    invoke-virtual/range {v22 .. v22}, Ll/֨ۤ᩵;->᩷()Ll/֡᩷᩵;

    move-result-object v5

    .line 71
    invoke-virtual {v5, v1}, Ll/֡᩷᩵;->ۙ(Z)V

    .line 72
    invoke-virtual {v5}, Ll/֡᩷᩵;->ᩴ()V

    sub-int v12, v13, v2

    .line 75
    invoke-virtual/range {v22 .. v22}, Ll/֨ۤ᩵;->᩷()Ll/֡᩷᩵;

    move-result-object v2

    invoke-virtual {v2, v1}, Ll/֡᩷᩵;->ۙ(Z)V

    .line 76
    new-instance v1, Ll/ۜ᩷᩵;

    move-object/from16 v2, v22

    invoke-direct {v1, v2}, Ll/ۜ᩷᩵;-><init>(Ll/֨ۤ᩵;)V

    .line 77
    invoke-virtual {v2}, Ll/֨ۤ᩵;->ۙ()Ll/ᩳۤ᩵;

    move-result-object v2

    .line 78
    invoke-static {v4, v3}, Ll/ۨۤ᩵;->ۙ(Ll/֡᩷᩵;Ll/᩷ۡۗ;)Ll/۬᩷᩵;

    move-result-object v3

    move-object/from16 v27, v3

    move-object v3, v1

    move-object/from16 v1, v27

    .line 80
    :goto_13
    invoke-virtual {v2}, Ll/ᩳۤ᩵;->᩸()I

    move-result v4

    add-int/2addr v4, v12

    invoke-virtual {v2, v4}, Ll/ᩳۤ᩵;->᩷(I)V

    .line 82
    invoke-static {v0, v1, v3}, Ll/۟ۤ᩵;->ۙ(Ll/۟ۤ᩵;Ll/۬᩷᩵;Ll/۬᩷᩵;)Ll/۟ۤ᩵;

    move-result-object v0

    goto :goto_16

    :cond_1a
    move-object/from16 v5, v21

    move-object/from16 v2, v22

    move-object/from16 v4, v23

    move-object/from16 v3, v24

    if-eqz v1, :cond_1e

    .line 199
    invoke-virtual {v5}, Ll/֨ۤ᩵;->᩷()Ll/֡᩷᩵;

    move-result-object v1

    .line 200
    invoke-virtual {v2}, Ll/֨ۤ᩵;->᩷()Ll/֡᩷᩵;

    move-result-object v6

    .line 202
    invoke-virtual {v1}, Ll/֡᩷᩵;->᩸()Z

    move-result v1

    if-nez v1, :cond_1c

    invoke-virtual {v6}, Ll/֡᩷᩵;->᩸()Z

    move-result v1

    if-eqz v1, :cond_1b

    goto :goto_14

    :cond_1b
    const/4 v1, 0x0

    goto :goto_15

    :cond_1c
    :goto_14
    const/4 v1, 0x1

    :goto_15
    if-eqz v1, :cond_1e

    .line 88
    invoke-virtual {v5}, Ll/֨ۤ᩵;->᩷()Ll/֡᩷᩵;

    move-result-object v1

    .line 89
    invoke-virtual {v2}, Ll/֨ۤ᩵;->᩷()Ll/֡᩷᩵;

    move-result-object v6

    .line 96
    invoke-virtual {v1}, Ll/֡᩷᩵;->᩸()Z

    move-result v7

    if-eqz v7, :cond_1d

    .line 97
    invoke-virtual {v1}, Ll/֡᩷᩵;->ᩴ()V

    .line 99
    invoke-static {v1, v3}, Ll/ۨۤ᩵;->ۙ(Ll/֡᩷᩵;Ll/᩷ۡۗ;)Ll/۬᩷᩵;

    move-result-object v1

    .line 100
    new-instance v3, Ll/ۜ᩷᩵;

    invoke-direct {v3, v2}, Ll/ۜ᩷᩵;-><init>(Ll/֨ۤ᩵;)V

    .line 101
    invoke-static {v0, v1, v3}, Ll/۟ۤ᩵;->ۙ(Ll/۟ۤ᩵;Ll/۬᩷᩵;Ll/۬᩷᩵;)Ll/۟ۤ᩵;

    move-result-object v0

    goto :goto_16

    .line 103
    :cond_1d
    invoke-virtual {v6}, Ll/֡᩷᩵;->ᩴ()V

    .line 105
    invoke-static {v6, v4}, Ll/ۨۤ᩵;->ۙ(Ll/֡᩷᩵;Ll/᩷ۡۗ;)Ll/۬᩷᩵;

    move-result-object v1

    .line 106
    new-instance v2, Ll/ۜ᩷᩵;

    invoke-direct {v2, v5}, Ll/ۜ᩷᩵;-><init>(Ll/֨ۤ᩵;)V

    .line 107
    invoke-static {v0, v2, v1}, Ll/۟ۤ᩵;->ۙ(Ll/۟ۤ᩵;Ll/۬᩷᩵;Ll/۬᩷᩵;)Ll/۟ۤ᩵;

    move-result-object v0

    goto :goto_16

    .line 112
    :cond_1e
    sget-object v1, Ll/ܰۤ᩵;->ܿ:Ll/ܰۤ᩵;

    .line 113
    invoke-static {v1}, Ll/᩶ۤ᩵;->ۙ(Ll/ܰۤ᩵;)Ll/۬᩷᩵;

    move-result-object v2

    .line 115
    invoke-static {v1}, Ll/᩶ۤ᩵;->ۙ(Ll/ܰۤ᩵;)Ll/۬᩷᩵;

    move-result-object v1

    .line 117
    invoke-static {v0, v2, v1}, Ll/۟ۤ᩵;->ۙ(Ll/۟ۤ᩵;Ll/۬᩷᩵;Ll/۬᩷᩵;)Ll/۟ۤ᩵;

    move-result-object v0

    :goto_16
    if-eqz v16, :cond_1f

    if-eqz v18, :cond_1f

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    .line 0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v2, v2, v3

    invoke-static {v2, v4, v2, v4}, Ll/᩺᩸ۚ;->ۙ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v2

    move-object/from16 v5, v16

    move-object/from16 v4, v17

    move-object/from16 v6, v18

    .line 42
    invoke-virtual {v4, v5, v6, v2}, Ll/ܺܳܺ;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ljava/util/List;)V

    goto :goto_17

    :cond_1f
    const/4 v1, 0x1

    const/4 v3, 0x0

    .line 0
    :goto_17
    new-array v2, v1, [Ljava/lang/Object;

    aput-object v0, v2, v3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v1, v2, v3

    invoke-static {v1, v0, v1, v0}, Ll/᩺᩸ۚ;->ۙ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 131
    :cond_20
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "The instruction comparator handler has received a state which does not support block insn info"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
