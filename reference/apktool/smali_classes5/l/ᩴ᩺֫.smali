.class public final Ll/ᩴ᩺֫;
.super Ljava/lang/Object;
.source "R2SJ"


# static fields
.field private static final ܺ᩹ܰ:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x20

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩴ᩺֫;->ܺ᩹ܰ:[S

    return-void

    :array_0
    .array-data 2
        0x1d43s
        -0x5427s
        -0x542ds
        -0x546bs
        -0x5436s
        -0x542as
        -0x5431s
        -0x5423s
        -0x542ds
        -0x542cs
        -0x546bs
        -0x5431s
        -0x5436s
        -0x5422s
        -0x5425s
        -0x5432s
        -0x5421s
        -0x5422s
        -0x5425s
        -0x5432s
        -0x5425s
        -0x542ds
        -0x5432s
        -0x5421s
        -0x5429s
        -0x5437s
        -0x542fs
        -0x542cs
        -0x5422s
        -0x5434s
        -0x5437s
        -0x542bs
    .end array-data
.end method

.method public static ۙ()Ll/᩸᩺֫;
    .locals 1

    .line 101
    new-instance v0, Ll/᩷᩺֫;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0
.end method

.method public static ۙ(Ljava/lang/String;)Ll/᩸᩺֫;
    .locals 1

    .line 58
    new-instance v0, Ll/ۙ᩺֫;

    invoke-direct {v0, p0}, Ll/ۙ᩺֫;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static ᩷()Ljava/util/List;
    .locals 35

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const v25, -0x6772955d

    sget v26, Ll/ۘܶ;->ܶ᩵ۢ:I

    sget v27, Ll/᩺;->۫۬۫:I

    const-string v28, "\u1a78\u0733"

    invoke-static/range {v28 .. v28}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v28

    add-int v28, v28, v27

    mul-int/lit8 v28, v28, -0x5b

    xor-int v0, v28, v26

    mul-int/lit16 v0, v0, 0x6269

    const v30, 0x2fffb23e

    xor-int v0, v0, v30

    const v30, -0x1457220d

    xor-int v28, v28, v30

    move-object/from16 v30, v5

    move-object/from16 v24, v8

    move-object/from16 v25, v9

    move-object v11, v10

    move-object v1, v15

    move-object/from16 v8, v22

    move-object/from16 v9, v23

    move/from16 v29, v28

    const/4 v3, 0x0

    const/4 v10, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v28, -0x6772955d

    const/16 v31, 0x0

    move-object v5, v4

    move-object/from16 v22, v6

    move-object/from16 v23, v7

    move-object v15, v14

    move-object/from16 v7, v21

    const/4 v4, 0x0

    move-object/from16 v21, v2

    move-object v14, v13

    move-object/from16 v2, v16

    move-object v13, v12

    const/4 v12, 0x0

    :goto_0
    xor-int v6, v28, v26

    mul-int/lit16 v6, v6, 0x2957

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v0, v6

    xor-int v28, v29, v0

    sparse-switch v28, :sswitch_data_0

    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    sget v0, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v0, :cond_6

    :cond_0
    move/from16 v29, v4

    move-object v4, v9

    move v6, v10

    move-object/from16 v0, v24

    move-object/from16 v10, v25

    move-object/from16 v9, v30

    :goto_1
    move-object/from16 v25, v1

    move-object/from16 v24, v2

    goto/16 :goto_12

    :sswitch_0
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    sget v0, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v0, :cond_2

    :cond_1
    :goto_2
    move/from16 v29, v4

    move-object v4, v9

    move v6, v10

    move-object/from16 v9, v30

    goto/16 :goto_e

    :cond_2
    const-string v0, "\u1a7a\u0733"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v27, v0

    mul-int/lit8 v0, v0, 0x3

    xor-int v6, v0, v26

    mul-int/lit8 v6, v6, 0x3f

    const v29, 0x8308004

    xor-int v6, v6, v29

    const v29, -0x2b423cbc

    goto/16 :goto_7

    .line 218
    :sswitch_1
    sget v0, Ll/֫֨;->᩶ܺۡ:I

    if-lez v0, :cond_4

    :cond_3
    :goto_3
    move/from16 v29, v4

    move-object v4, v9

    move v6, v10

    goto/16 :goto_b

    :cond_4
    move/from16 v29, v4

    move-object v4, v9

    move v6, v10

    goto/16 :goto_8

    .line 100
    :sswitch_2
    sget-boolean v0, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    move/from16 v29, v4

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v25, v1

    move-object/from16 v33, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v31

    move-object/from16 v31, v9

    move-object/from16 v9, v30

    move-object/from16 v30, v33

    goto/16 :goto_1c

    :cond_6
    move/from16 v29, v4

    move-object v4, v9

    move v6, v10

    goto/16 :goto_a

    .line 182
    :sswitch_3
    sget-boolean v0, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-nez v0, :cond_3

    goto :goto_2

    .line 37
    :sswitch_4
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    sget v0, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v0, :cond_0

    goto :goto_4

    :sswitch_5
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_2

    :cond_7
    :goto_4
    const-string v0, "\u1a73\u06ec"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    mul-int/lit8 v0, v0, 0x29

    xor-int v6, v0, v26

    mul-int/lit16 v6, v6, -0x5171

    const v29, -0x2b4647fb

    xor-int v6, v6, v29

    const v29, 0x5e5ee3c7

    goto/16 :goto_7

    .line 423
    :sswitch_6
    sget-boolean v0, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v0, :cond_1

    :goto_5
    move/from16 v29, v4

    move-object/from16 v32, v5

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v25, v1

    move-object/from16 v1, v17

    move-object/from16 v33, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v31

    move-object/from16 v31, v9

    move-object/from16 v9, v30

    move-object/from16 v30, v33

    goto/16 :goto_24

    :sswitch_7
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    goto :goto_5

    .line 451
    :sswitch_8
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    const/4 v0, 0x0

    return-object v0

    .line 161
    :sswitch_9
    invoke-virtual {v14, v4}, Ll/ۤ᩺֫;->ۙ(Z)V

    .line 162
    invoke-static {v11, v14}, Ll/֨᩻;->ܿ֨᩹(Ljava/lang/Object;Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    move/from16 v29, v4

    move-object v4, v9

    move v6, v10

    move-object/from16 v10, v24

    move-object/from16 v0, v25

    move-object/from16 v9, v30

    move-object/from16 v25, v1

    move-object/from16 v1, v23

    goto/16 :goto_11

    :sswitch_a
    const/4 v0, 0x1

    const/4 v4, 0x1

    goto :goto_6

    :sswitch_b
    const/4 v0, 0x0

    const/4 v4, 0x0

    :goto_6
    const-string v0, "\u05a8\u06d9"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    mul-int/lit8 v0, v0, -0x79

    xor-int v6, v0, v27

    mul-int/lit16 v6, v6, 0x3013

    const v29, -0x759d2140

    xor-int v6, v6, v29

    const v29, -0x738dcd4

    :goto_7
    xor-int v29, v0, v29

    move v0, v6

    goto/16 :goto_0

    .line 160
    :sswitch_c
    sget-object v0, Ll/ᩴ᩺֫;->ܺ᩹ܰ:[S

    const/16 v6, 0x1f

    move/from16 v29, v4

    const/4 v4, 0x1

    invoke-static {v0, v6, v4, v3}, Ll/ۖ֨;->۟ۢ۫([SIII)Ljava/lang/String;

    move-result-object v0

    .line 161
    invoke-static {v13, v0}, Ll/ۖ֡;->۠ۛܰ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, "\u06d6\u06dc"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v4, v0, v26

    mul-int/lit16 v4, v4, -0x6e3f

    const v6, 0x135abbc9

    xor-int/2addr v4, v6

    const v6, 0x7c76f009

    goto/16 :goto_9

    :cond_8
    const-string v0, "\u1a79\u06e8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v4, v0, v26

    mul-int/lit16 v4, v4, -0x3633

    const v6, -0x65dfa282

    xor-int/2addr v4, v6

    const v6, -0x448b58f0

    goto/16 :goto_9

    :sswitch_d
    move/from16 v29, v4

    const/4 v0, 0x1

    .line 159
    invoke-static {v9, v10, v0, v3}, Ll/ۖۖ;->ܺۙᩴ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 160
    invoke-static {v13, v0}, Ll/ۖ֡;->۠ۛܰ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    move-object v4, v9

    move v6, v10

    int-to-long v9, v0

    invoke-virtual {v14, v9, v10}, Ll/ۤ᩺֫;->ۙ(J)V

    .line 260
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result v0

    if-gtz v0, :cond_9

    :goto_8
    const-string v0, "\u1a7b\u06db"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    mul-int/lit8 v0, v0, 0x3b

    xor-int v9, v0, v27

    mul-int/lit16 v9, v9, 0x3ec1

    const v10, 0xba42824

    xor-int/2addr v9, v10

    const v10, 0x4db9efbc    # 3.8993702E8f

    goto/16 :goto_c

    :cond_9
    const-string v0, "\u06df\u06e0"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    mul-int/lit8 v0, v0, 0x41

    xor-int v9, v0, v27

    mul-int/lit16 v9, v9, -0x4a51

    const v10, 0x5fd97ad1

    xor-int/2addr v9, v10

    const v10, -0x6c799441

    goto/16 :goto_c

    :sswitch_e
    move/from16 v29, v4

    .line 158
    invoke-virtual {v14, v2}, Ll/ۤ᩺֫;->ۚ(Ljava/lang/String;)V

    .line 159
    invoke-static {v13, v5}, Ll/ۖܰ;->۫ۗۧ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {v14, v0}, Ll/ۤ᩺֫;->ᩴ(I)V

    sget-object v9, Ll/ᩴ᩺֫;->ܺ᩹ܰ:[S

    const/16 v10, 0x1e

    .line 71
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    move-result v0

    if-gtz v0, :cond_a

    move-object v4, v9

    move-object/from16 v0, v24

    move-object/from16 v10, v25

    move-object/from16 v9, v30

    const/16 v6, 0x1e

    goto/16 :goto_1

    :cond_a
    const-string v0, "\u073f\u06e8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v27

    mul-int/lit8 v0, v0, 0x13

    xor-int v4, v0, v26

    mul-int/lit16 v4, v4, -0x63dd

    const v6, 0x5b531ba4

    xor-int/2addr v4, v6

    const v6, -0x452a9710

    :goto_9
    xor-int/2addr v0, v6

    move/from16 v33, v29

    move/from16 v29, v0

    move v0, v4

    goto/16 :goto_d

    :sswitch_f
    move/from16 v29, v4

    move-object v4, v9

    move v6, v10

    .line 157
    invoke-virtual {v14, v1}, Ll/ۤ᩺֫;->ۙ(Ljava/lang/String;)V

    sget-object v0, Ll/ᩴ᩺֫;->ܺ᩹ܰ:[S

    const/16 v2, 0x1d

    const/4 v9, 0x1

    invoke-static {v0, v2, v9, v3}, Ll/֨᩻;->ۧ᩹ܿ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 158
    invoke-static {v13, v0}, Ll/֨ۨ;->᩹ۧ۬(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 336
    sget-boolean v0, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v0, :cond_b

    :goto_a
    const-string v0, "\u06da\u0730"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    xor-int v9, v0, v27

    mul-int/lit16 v9, v9, 0x1a69

    const v10, -0x6e7ddafe

    xor-int/2addr v9, v10

    const v10, -0x1c150aed

    goto/16 :goto_c

    :cond_b
    const-string v0, "\u06e8\u073d"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v26, v0

    mul-int/lit8 v0, v0, -0x71

    xor-int v9, v0, v27

    mul-int/lit16 v9, v9, -0x93b

    const v10, 0x77ca90db

    xor-int/2addr v9, v10

    const v10, 0x3c76cb05

    goto/16 :goto_c

    :sswitch_10
    move/from16 v29, v4

    move-object v4, v9

    move v6, v10

    const/16 v0, 0x1c

    const/4 v1, 0x1

    .line 156
    invoke-static {v8, v0, v1, v3}, Ll/᩶;->ᩳܿܰ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 157
    invoke-static {v13, v0}, Ll/ۗ᩶;->ᩳᩳۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget v0, Ll/ۖ;->ܿۚ֡:I

    if-ltz v0, :cond_c

    const-string v0, "\u06eb\u05a8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    mul-int/lit8 v0, v0, -0x19

    xor-int v9, v0, v27

    mul-int/lit16 v9, v9, 0x581f

    const v10, -0x38dea68

    xor-int/2addr v9, v10

    const v10, -0xf42d1b

    goto :goto_c

    :cond_c
    const-string v0, "\u06d6\u06ec"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    mul-int/lit8 v0, v0, -0x55

    xor-int v9, v0, v26

    mul-int/lit16 v9, v9, 0x66bf

    const v10, 0x1c46fe11

    xor-int/2addr v9, v10

    const v10, -0x23f46721

    goto :goto_c

    :sswitch_11
    move/from16 v29, v4

    move-object v4, v9

    move v6, v10

    const/16 v0, 0x1b

    const/4 v8, 0x1

    .line 155
    invoke-static {v7, v0, v8, v3}, Ll/ۗ᩺;->۬֫ۜ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 156
    invoke-static {v13, v0}, Ll/֨ۨ;->᩹ۧ۬(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ll/ۤ᩺֫;->ۤ(Ljava/lang/String;)V

    sget-object v8, Ll/ᩴ᩺֫;->ܺ᩹ܰ:[S

    .line 261
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    move-result v0

    if-gtz v0, :cond_d

    :goto_b
    const-string v0, "\u0733\u0730"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v9, v0, v26

    mul-int/lit16 v9, v9, 0x535d

    const v10, -0x607372de

    xor-int/2addr v9, v10

    const v10, -0x2d6d2102

    goto :goto_c

    :cond_d
    const-string v0, "\u06eb\u06e8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    mul-int/lit8 v0, v0, 0x3d

    xor-int v9, v0, v27

    mul-int/lit16 v9, v9, 0x724d

    const v10, 0x2a7ccd40

    xor-int/2addr v9, v10

    const v10, -0x4eb4c68a

    :goto_c
    xor-int/2addr v0, v10

    move v10, v6

    move/from16 v33, v29

    move/from16 v29, v0

    move v0, v9

    move-object v9, v4

    :goto_d
    move/from16 v4, v33

    goto/16 :goto_0

    :sswitch_12
    move/from16 v29, v4

    move-object v4, v9

    move v6, v10

    .line 154
    invoke-static {v13, v15}, Ll/ۖ֡;->۠ۛܰ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {v14, v0}, Ll/ۤ᩺֫;->ۤ(I)V

    move-object/from16 v9, v30

    .line 155
    invoke-static {v13, v9}, Ll/ۗ᩶;->ᩳᩳۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ll/ۤ᩺֫;->᩸(Ljava/lang/String;)V

    sget-object v7, Ll/ᩴ᩺֫;->ܺ᩹ܰ:[S

    .line 422
    sget v0, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v0, :cond_e

    :goto_e
    const-string v0, "\u06eb\u06e4"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v10, v0, v26

    mul-int/lit16 v10, v10, -0x55c5

    const v30, 0x7ad93a9a

    xor-int v10, v10, v30

    const v30, 0x562ef557

    goto :goto_f

    :cond_e
    const-string v0, "\u06dc\u06e2"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    xor-int v10, v0, v27

    mul-int/lit16 v10, v10, -0x18c9

    const v30, -0x6cdc9ba7

    xor-int v10, v10, v30

    const v30, 0x3c9fb0c1

    :goto_f
    xor-int v0, v0, v30

    move-object/from16 v30, v9

    move-object v9, v4

    move/from16 v4, v29

    move/from16 v29, v0

    move v0, v10

    goto/16 :goto_1b

    :sswitch_13
    move/from16 v29, v4

    move-object v4, v9

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v9, v30

    .line 152
    invoke-virtual {v10, v12}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v13

    .line 153
    new-instance v14, Ll/ۤ᩺֫;

    invoke-direct {v14}, Ll/ۤ᩺֫;-><init>()V

    sget-object v0, Ll/ᩴ᩺֫;->ܺ᩹ܰ:[S

    const/16 v15, 0x1a

    move-object/from16 v25, v1

    const/4 v1, 0x1

    invoke-static {v0, v15, v1, v3}, Ll/ۖۙ;->ۘ᩹ܰ([SIII)Ljava/lang/String;

    move-result-object v15

    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v0

    if-eqz v0, :cond_f

    move-object/from16 v30, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v31

    move-object/from16 v31, v4

    goto/16 :goto_1c

    :cond_f
    const-string v0, "\u1a7b\u1a74"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v1, v0, v26

    mul-int/lit16 v1, v1, 0x45e9

    const v30, 0x2f7953b2

    xor-int v1, v1, v30

    const v30, 0x6490cbdc

    goto :goto_10

    :sswitch_14
    return-object v11

    :sswitch_15
    move/from16 v29, v4

    move-object v4, v9

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v9, v30

    move-object/from16 v25, v1

    .line 151
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v12, v0, :cond_10

    const-string v0, "\u06eb\u073a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v27, v0

    mul-int/lit8 v0, v0, 0x33

    xor-int v1, v0, v26

    mul-int/lit16 v1, v1, -0x6765

    const v30, 0x438b5e60

    xor-int v1, v1, v30

    const v30, -0x7fbb51e5

    goto :goto_10

    :cond_10
    const-string v0, "\u06e4\u06e0"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    xor-int v1, v0, v27

    mul-int/lit16 v1, v1, -0x54ef

    const v30, -0x7d246145

    xor-int v1, v1, v30

    const v30, -0x6b51e445

    :goto_10
    xor-int v0, v0, v30

    move-object/from16 v30, v9

    move-object v9, v4

    move/from16 v4, v29

    move/from16 v29, v0

    move v0, v1

    goto/16 :goto_1a

    :sswitch_16
    move-object/from16 v25, v1

    move/from16 v29, v4

    move-object v4, v9

    move v6, v10

    move-object/from16 v1, v23

    move-object/from16 v10, v24

    move-object/from16 v9, v30

    .line 149
    invoke-virtual {v1, v10}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 150
    new-instance v11, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v12

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v12, 0x0

    :goto_11
    const-string v23, "\u1a73\u06d6"

    invoke-static/range {v23 .. v23}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v23

    xor-int v23, v23, v26

    mul-int/lit8 v23, v23, -0x4d

    move-object/from16 v24, v0

    xor-int v0, v23, v27

    mul-int/lit16 v0, v0, -0x619

    const v30, -0x37beb49d

    xor-int v0, v0, v30

    const v30, -0x4c02c44

    xor-int v23, v23, v30

    move-object/from16 v30, v9

    move-object v9, v4

    move/from16 v4, v29

    move/from16 v29, v23

    move-object/from16 v23, v1

    move-object/from16 v1, v25

    move-object/from16 v25, v24

    move-object/from16 v24, v10

    goto/16 :goto_1b

    :sswitch_17
    move/from16 v29, v4

    move-object v4, v9

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v9, v30

    move-object/from16 v25, v1

    .line 149
    invoke-virtual/range {v22 .. v22}, Ll/ۢۛ֫;->ۤ()Lorg/json/JSONObject;

    move-result-object v23

    sget-object v0, Ll/ᩴ᩺֫;->ܺ᩹ܰ:[S

    const/16 v1, 0x15

    move-object/from16 v24, v2

    const/4 v2, 0x5

    invoke-static {v0, v1, v2, v3}, Ll/ۘ֡;->۫ܺۡ([SIII)Ljava/lang/String;

    move-result-object v0

    sget-boolean v1, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v1, :cond_11

    :goto_12
    const-string v1, "\u05a1\u06d6"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v26, v1

    mul-int/lit8 v1, v1, 0x11

    xor-int v2, v1, v27

    mul-int/lit16 v2, v2, -0x157b

    const v30, 0x16638199

    xor-int v2, v2, v30

    const v30, -0x4cb1412e

    goto :goto_13

    :cond_11
    const-string v1, "\u06dc\u05ab"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v27

    xor-int v2, v1, v26

    mul-int/lit16 v2, v2, 0x42f

    const v30, -0x36f4ee53

    xor-int v2, v2, v30

    const v30, -0x3e46a861

    :goto_13
    xor-int v1, v1, v30

    move-object/from16 v30, v9

    move-object v9, v4

    move/from16 v4, v29

    move/from16 v29, v1

    move-object/from16 v1, v25

    move-object/from16 v25, v10

    move v10, v6

    move-object/from16 v33, v24

    move-object/from16 v24, v0

    move v0, v2

    goto/16 :goto_15

    .line 148
    :sswitch_18
    new-instance v0, Ll/ۙۧܺ;

    invoke-virtual/range {v22 .. v22}, Ll/ۢۛ֫;->᩷()Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 148
    throw v0

    :sswitch_19
    move/from16 v29, v4

    move-object v4, v9

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v9, v30

    move-object/from16 v25, v1

    move-object/from16 v1, v23

    move-object/from16 v33, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v33

    .line 147
    invoke-virtual/range {v22 .. v22}, Ll/ۢۛ֫;->᩸()Z

    move-result v0

    if-eqz v0, :cond_12

    const-string v0, "\u0733\u1a79"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    move-object/from16 v23, v1

    xor-int v1, v0, v26

    mul-int/lit16 v1, v1, -0xe8f

    const v30, -0x21399239

    xor-int v1, v1, v30

    const v30, -0x1408fd07

    goto :goto_14

    :cond_12
    move-object/from16 v23, v1

    const-string v0, "\u073a\u0736"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v26, v0

    mul-int/lit8 v0, v0, 0x13

    xor-int v1, v0, v27

    mul-int/lit16 v1, v1, 0x21d7

    const v30, 0x6b21cb83

    xor-int v1, v1, v30

    const v30, 0x3330bb57

    :goto_14
    xor-int v0, v0, v30

    move-object/from16 v30, v9

    move-object v9, v4

    move/from16 v4, v29

    move/from16 v29, v0

    move v0, v1

    move-object/from16 v1, v25

    move-object/from16 v25, v10

    move v10, v6

    move-object/from16 v33, v24

    move-object/from16 v24, v2

    :goto_15
    move-object/from16 v2, v33

    goto/16 :goto_0

    :sswitch_1a
    move/from16 v29, v4

    move-object v4, v9

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v9, v30

    move-object/from16 v25, v1

    move-object/from16 v33, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v33

    .line 474
    :try_start_0
    invoke-static/range {v21 .. v21}, Ll/֨ۚ;->ᩳ᩷ܺ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿۨ֫;

    .line 475
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    move-object/from16 v30, v2

    .line 476
    :try_start_1
    invoke-static {v0}, Ll/ۖ֨;->᩷۟᩷(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v9, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 477
    invoke-virtual {v0}, Ll/ܿۨ֫;->ۗ()I

    move-result v0

    invoke-virtual {v1, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object/from16 v2, v31

    .line 478
    :try_start_2
    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-object/from16 v31, v4

    move-object/from16 v32, v5

    move-object/from16 v1, v17

    goto/16 :goto_1e

    :catch_0
    move-exception v0

    goto :goto_17

    :catch_1
    move-exception v0

    goto :goto_16

    :catch_2
    move-exception v0

    move-object/from16 v30, v2

    :goto_16
    move-object/from16 v2, v31

    :goto_17
    move-object/from16 v17, v0

    move-object/from16 v31, v4

    move-object/from16 v32, v5

    goto/16 :goto_20

    :sswitch_1b
    move/from16 v29, v4

    move-object v4, v9

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v9, v30

    move-object/from16 v25, v1

    move-object/from16 v30, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v31

    :try_start_3
    sget-object v0, Ll/ᩴ᩺֫;->ܺ᩹ܰ:[S
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5

    const/4 v1, 0x3

    move-object/from16 v31, v4

    const/16 v4, 0xe

    :try_start_4
    invoke-static {v0, v1, v4, v3}, Ll/֫֡;->ܺۜᩴ([SIII)Ljava/lang/String;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 481
    :try_start_5
    invoke-static {v0}, Ll/ᩳۛ֫;->ۙ(Ljava/lang/String;)Ll/ᩳۛ֫;

    move-result-object v0

    sget-object v1, Ll/ᩴ᩺֫;->ܺ᩹ܰ:[S
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    const/16 v4, 0x11

    move-object/from16 v32, v5

    const/4 v5, 0x4

    :try_start_6
    invoke-static {v1, v4, v5, v3}, Ll/֡ܳ;->ܺܽۧ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 482
    invoke-static {v2}, Ll/֨ۢ;->ܿܽ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v1, v4}, Ll/ۘܶ;->᩻֡ۖ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 483
    invoke-virtual {v0}, Ll/ᩳۛ֫;->᩷()Ll/ۢۛ֫;

    move-result-object v22
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_7

    const-string v0, "\u1a74\u06da"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    mul-int/lit8 v0, v0, -0x3d

    xor-int v1, v0, v27

    mul-int/lit16 v1, v1, 0x67fb

    const v4, 0x3b5f915c

    xor-int/2addr v1, v4

    const v4, 0x7ca42807

    goto/16 :goto_21

    :catch_3
    move-exception v0

    :goto_18
    move-object/from16 v32, v5

    goto/16 :goto_1f

    :catch_4
    move-exception v0

    goto :goto_18

    :catch_5
    move-exception v0

    move-object/from16 v31, v4

    goto :goto_18

    :sswitch_1c
    move/from16 v29, v4

    move-object/from16 v32, v5

    move v6, v10

    move-object/from16 v30, v24

    move-object/from16 v10, v25

    move-object/from16 v25, v1

    move-object/from16 v24, v2

    move-object/from16 v2, v31

    move-object/from16 v31, v9

    .line 474
    sget-object v0, Ll/ᩴ᩺֫;->ܺ᩹ܰ:[S

    const/4 v1, 0x2

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v3}, Ll/֨ᩳ;->ۘ᩸֨([SIII)Ljava/lang/String;

    move-result-object v0

    if-eqz v18, :cond_13

    const-string v1, "\u1a77\u05a1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v27, v1

    mul-int/lit8 v1, v1, 0x13

    xor-int v4, v1, v26

    mul-int/lit16 v4, v4, 0x4ad

    const v5, -0x480cd62

    xor-int/2addr v4, v5

    const v5, 0x7d6b61e3

    goto :goto_19

    :cond_13
    const-string v1, "\u1a75\u1a74"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v26

    mul-int/lit8 v1, v1, 0x57

    xor-int v4, v1, v27

    mul-int/lit16 v4, v4, -0x5d2b

    const v5, -0x31277c34

    xor-int/2addr v4, v5

    const v5, 0x52af28e1

    :goto_19
    xor-int/2addr v1, v5

    move-object/from16 v9, v31

    move-object/from16 v5, v32

    move-object/from16 v31, v2

    move-object/from16 v2, v24

    move-object/from16 v24, v30

    move-object/from16 v30, v0

    move v0, v4

    move/from16 v4, v29

    move/from16 v29, v1

    :goto_1a
    move-object/from16 v1, v25

    move-object/from16 v25, v10

    :goto_1b
    move v10, v6

    goto/16 :goto_0

    :sswitch_1d
    move/from16 v29, v4

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v25, v1

    move-object/from16 v33, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v31

    move-object/from16 v31, v9

    move-object/from16 v9, v30

    move-object/from16 v30, v33

    sget-object v0, Ll/ᩴ᩺֫;->ܺ᩹ܰ:[S

    const/4 v1, 0x1

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v3}, Ll/ۗ֨;->ᩴᩴܽ([SIII)Ljava/lang/String;

    move-result-object v5

    sget v0, Ll/֫֡;->֫ۙۖ:I

    if-gtz v0, :cond_14

    :goto_1c
    const-string v0, "\u06ec\u1a7b"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v1, v0, v26

    mul-int/lit16 v1, v1, -0xe2f

    const v4, -0x2a72252e

    xor-int/2addr v1, v4

    const v4, 0xe88669b

    goto :goto_1d

    :cond_14
    const-string v0, "\u0730\u06d6"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v27

    mul-int/lit8 v0, v0, 0x7d

    xor-int v1, v0, v26

    mul-int/lit16 v1, v1, 0x752b

    const v4, 0x4d26f7cd    # 1.7507861E8f

    xor-int/2addr v1, v4

    const v4, 0x524c3eec

    :goto_1d
    xor-int/2addr v0, v4

    move/from16 v4, v29

    goto/16 :goto_22

    :sswitch_1e
    move/from16 v29, v4

    move-object/from16 v32, v5

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v25, v1

    move-object/from16 v33, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v31

    move-object/from16 v31, v9

    move-object/from16 v9, v30

    move-object/from16 v30, v33

    :try_start_7
    invoke-static/range {v21 .. v21}, Ll/ۘ۟;->ᩳۘ᩸(Ljava/lang/Object;)Z

    move-result v18
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    const-string v0, "\u06d8\u06d7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    xor-int v1, v0, v27

    mul-int/lit16 v1, v1, -0x2c57

    const v4, -0x77b3c250

    xor-int/2addr v1, v4

    const v4, -0x3ee68573

    goto :goto_21

    .line 485
    :sswitch_1f
    new-instance v0, Ljava/lang/RuntimeException;

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :sswitch_20
    move/from16 v29, v4

    move-object/from16 v32, v5

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v25, v1

    move-object/from16 v1, v17

    move-object/from16 v33, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v31

    move-object/from16 v31, v9

    move-object/from16 v9, v30

    move-object/from16 v30, v33

    .line 472
    :try_start_8
    invoke-static {}, Ll/᩹ۨ֫;->᩷()Ljava/util/List;

    move-result-object v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7

    .line 473
    :try_start_9
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6

    .line 474
    :try_start_a
    invoke-static {v0}, Ll/᩺;->ܰ֨ۗ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_7

    move-object/from16 v21, v0

    :goto_1e
    const-string v0, "\u1a76\u06e0"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    mul-int/lit8 v0, v0, -0x79

    xor-int v4, v0, v26

    mul-int/lit16 v4, v4, -0x6759

    const v5, -0x57a76fd6

    xor-int/2addr v4, v5

    const v5, -0x5cb21714

    goto/16 :goto_25

    :catch_6
    move-exception v0

    const/4 v2, 0x0

    goto :goto_1f

    :catch_7
    move-exception v0

    :goto_1f
    move-object/from16 v17, v0

    :goto_20
    const-string v0, "\u05ab\u1a7b"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    mul-int/lit8 v0, v0, 0x2b

    xor-int v1, v0, v27

    mul-int/lit16 v1, v1, 0x811

    const v4, 0x46e2a4e8

    xor-int/2addr v1, v4

    const v4, -0x4aea779f

    :goto_21
    xor-int/2addr v0, v4

    move/from16 v4, v29

    move-object/from16 v5, v32

    :goto_22
    move/from16 v29, v0

    move v0, v1

    move-object/from16 v1, v25

    move-object/from16 v25, v10

    move v10, v6

    move-object/from16 v33, v31

    move-object/from16 v31, v2

    move-object/from16 v2, v24

    move-object/from16 v24, v30

    move-object/from16 v30, v9

    move-object/from16 v9, v33

    goto/16 :goto_0

    .line 144
    :sswitch_21
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    :sswitch_22
    move/from16 v29, v4

    move-object/from16 v32, v5

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v25, v1

    move-object/from16 v1, v17

    move-object/from16 v33, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v31

    move-object/from16 v31, v9

    move-object/from16 v9, v30

    move-object/from16 v30, v33

    .line 146
    sget v0, Ll/۬ۛ֫;->ۙ:I

    const-string v0, "\u1a78\u06d8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v4, v0, v26

    mul-int/lit16 v4, v4, -0x33f7

    const v5, 0x38d22955

    xor-int/2addr v4, v5

    const v5, -0x64215895

    goto/16 :goto_25

    :sswitch_23
    move/from16 v29, v4

    move-object/from16 v32, v5

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v25, v1

    move-object/from16 v1, v17

    move-object/from16 v33, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v31

    move-object/from16 v31, v9

    move-object/from16 v9, v30

    move-object/from16 v30, v33

    .line 143
    invoke-static {}, Ll/᩹ۨ֫;->᩷()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/֡ۖ;->֨ۤ᩺(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    const-string v0, "\u073f\u1a78"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    mul-int/lit8 v0, v0, 0x2f

    xor-int v4, v0, v26

    mul-int/lit16 v4, v4, -0x5dd1

    const v5, -0x129152ea

    xor-int/2addr v4, v5

    const v5, 0x2c4fded5

    goto/16 :goto_25

    :cond_15
    const-string v0, "\u1a76\u1a74"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    xor-int v4, v0, v27

    mul-int/lit16 v4, v4, -0x5683

    const v5, -0xe1ffe95

    xor-int/2addr v4, v5

    const v5, -0x7fd0ebb6

    goto/16 :goto_25

    :sswitch_24
    move/from16 v29, v4

    move-object/from16 v32, v5

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v25, v1

    move-object/from16 v1, v17

    move-object/from16 v33, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v31

    move-object/from16 v31, v9

    move-object/from16 v9, v30

    move-object/from16 v30, v33

    const/16 v0, 0x44f6

    const/16 v3, 0x44f6

    goto :goto_23

    :sswitch_25
    move/from16 v29, v4

    move-object/from16 v32, v5

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v25, v1

    move-object/from16 v1, v17

    move-object/from16 v33, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v31

    move-object/from16 v31, v9

    move-object/from16 v9, v30

    move-object/from16 v30, v33

    const v0, 0xabba

    const v3, 0xabba

    :goto_23
    const-string v0, "\u1a79\u06da"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    xor-int v4, v0, v27

    mul-int/lit16 v4, v4, 0x3e63

    const v5, 0x6724b977

    xor-int/2addr v4, v5

    const v5, 0x50c9e972

    goto/16 :goto_25

    :sswitch_26
    move/from16 v29, v4

    move-object/from16 v32, v5

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v25, v1

    move-object/from16 v1, v17

    move-object/from16 v33, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v31

    move-object/from16 v31, v9

    move-object/from16 v9, v30

    move-object/from16 v30, v33

    mul-int/lit8 v0, v19, 0x2

    add-int/lit8 v0, v0, 0x1

    sub-int v0, v20, v0

    if-gez v0, :cond_16

    const-string v0, "\u073a\u1a78"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v4, v0, v26

    mul-int/lit16 v4, v4, -0x215b

    const v5, 0x19677023

    xor-int/2addr v4, v5

    const v5, 0x1ee4abf0

    goto :goto_25

    :cond_16
    const-string v0, "\u06ec\u073f"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v26, v0

    mul-int/lit8 v0, v0, -0x37

    xor-int v4, v0, v27

    mul-int/lit16 v4, v4, -0x6993

    const v5, 0x855a438

    xor-int/2addr v4, v5

    const v5, -0x492c9e9b

    goto :goto_25

    :sswitch_27
    move/from16 v29, v4

    move-object/from16 v32, v5

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v25, v1

    move-object/from16 v1, v17

    move-object/from16 v33, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v31

    move-object/from16 v31, v9

    move-object/from16 v9, v30

    move-object/from16 v30, v33

    sget-object v0, Ll/ᩴ᩺֫;->ܺ᩹ܰ:[S

    const/4 v4, 0x0

    aget-short v19, v0, v4

    add-int/lit8 v0, v19, 0x1

    mul-int v20, v0, v0

    sget v0, Ll/֫֡;->֫ۙۖ:I

    if-gtz v0, :cond_17

    :goto_24
    const-string v0, "\u1a74\u06e7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v26

    mul-int/lit8 v0, v0, -0x39

    xor-int v4, v0, v27

    mul-int/lit16 v4, v4, 0x16a3

    const v5, 0x66f28f46

    xor-int/2addr v4, v5

    const v5, 0x6b67e12e

    goto :goto_25

    :cond_17
    const-string v0, "\u06e4\u073d"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v4, v0, v26

    mul-int/lit16 v4, v4, 0x59df

    const v5, 0x25159918

    xor-int/2addr v4, v5

    const v5, 0x3bce797e

    :goto_25
    xor-int/2addr v0, v5

    move-object/from16 v17, v1

    move-object/from16 v1, v25

    move-object/from16 v5, v32

    move-object/from16 v25, v10

    move v10, v6

    move/from16 v33, v29

    move/from16 v29, v0

    move v0, v4

    move/from16 v4, v33

    move-object/from16 v34, v31

    move-object/from16 v31, v2

    move-object/from16 v2, v24

    move-object/from16 v24, v30

    move-object/from16 v30, v9

    move-object/from16 v9, v34

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e6b30f7 -> :sswitch_b
        -0x7aea8af9 -> :sswitch_b
        -0x776652ad -> :sswitch_1b
        -0x775c6838 -> :sswitch_1e
        -0x75d7a992 -> :sswitch_11
        -0x740b4c0d -> :sswitch_26
        -0x6fd08ac9 -> :sswitch_6
        -0x6eae443a -> :sswitch_5
        -0x6ead7a32 -> :sswitch_2
        -0x6e150d1c -> :sswitch_c
        -0x6d78845a -> :sswitch_14
        -0x6cdc3360 -> :sswitch_1c
        -0x6bd34b30 -> :sswitch_e
        -0x5ec13063 -> :sswitch_20
        -0x57b3a1e1 -> :sswitch_20
        -0x52776666 -> :sswitch_8
        -0x51870ae1 -> :sswitch_f
        -0x4b74c727 -> :sswitch_f
        -0x4562307c -> :sswitch_27
        -0x43512b68 -> :sswitch_10
        -0x43472440 -> :sswitch_18
        -0x3364002b -> :sswitch_5
        -0x2eeb5737 -> :sswitch_17
        -0x28ff2cf7 -> :sswitch_0
        -0x1c7bd36c -> :sswitch_21
        -0x1bdaf443 -> :sswitch_d
        -0x19c93a66 -> :sswitch_1c
        -0x19821026 -> :sswitch_23
        -0x178e94cb -> :sswitch_4
        -0x172b3387 -> :sswitch_15
        -0x159b29f0 -> :sswitch_1a
        -0x12cc53a9 -> :sswitch_23
        -0x1204be81 -> :sswitch_3
        -0xf19b2de -> :sswitch_15
        -0xc5101f9 -> :sswitch_17
        -0xafd8d00 -> :sswitch_7
        -0x8c80c89 -> :sswitch_c
        -0x6fc196c -> :sswitch_18
        -0x67493f8 -> :sswitch_11
        -0x4a521ba -> :sswitch_16
        -0x45c2c3a -> :sswitch_27
        -0xa6a3d1 -> :sswitch_19
        0x12df631 -> :sswitch_26
        0x5f30952 -> :sswitch_1f
        0x802e5e3 -> :sswitch_25
        0xba24c5e -> :sswitch_24
        0xbbe0baa -> :sswitch_19
        0xd092a57 -> :sswitch_0
        0x13ea8615 -> :sswitch_1
        0x14eae60d -> :sswitch_4
        0x1be9894f -> :sswitch_1f
        0x2219faee -> :sswitch_14
        0x23ca8487 -> :sswitch_1a
        0x24070218 -> :sswitch_24
        0x243137fb -> :sswitch_16
        0x2dd12fcb -> :sswitch_22
        0x33ae3e60 -> :sswitch_6
        0x369b67dd -> :sswitch_22
        0x389b42d2 -> :sswitch_10
        0x3b1ca0ea -> :sswitch_8
        0x3b59d31e -> :sswitch_13
        0x3ccfb00b -> :sswitch_25
        0x3fd91eab -> :sswitch_1d
        0x429fc999 -> :sswitch_1e
        0x44545aa9 -> :sswitch_a
        0x46795cf7 -> :sswitch_12
        0x46957959 -> :sswitch_a
        0x4bcaa819 -> :sswitch_1b
        0x555d13ac -> :sswitch_3
        0x56c4780f -> :sswitch_2
        0x5bf86284 -> :sswitch_9
        0x5e70d713 -> :sswitch_12
        0x5f94c7b5 -> :sswitch_d
        0x641d8593 -> :sswitch_1
        0x64d077da -> :sswitch_13
        0x65097869 -> :sswitch_e
        0x6ccd7b98 -> :sswitch_7
        0x772b659a -> :sswitch_21
        0x77ae9d5b -> :sswitch_1d
        0x7f5a46de -> :sswitch_9
    .end sparse-switch
.end method
