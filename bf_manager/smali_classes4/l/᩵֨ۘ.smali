.class public final Ll/᩵֨ۘ;
.super Ljava/lang/Object;
.source "R2SJ"


# static fields
.field private static final ۚܽ֨:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x20

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩵֨ۘ;->ۚܽ֨:[S

    return-void

    :array_0
    .array-data 2
        0x123es
        0x4f8ds
        0x4f87s
        0x4fc1s
        0x4f9es
        0x4f82s
        0x4f9bs
        0x4f89s
        0x4f87s
        0x4f80s
        0x4fc1s
        0x4f9bs
        0x4f9es
        0x4f8as
        0x4f8fs
        0x4f9as
        0x4f8bs
        0x4f8as
        0x4f8fs
        0x4f9as
        0x4f8fs
        0x4f87s
        0x4f9as
        0x4f8bs
        0x4f83s
        0x4f9ds
        0x4f85s
        0x4f80s
        0x4f8as
        0x4f98s
        0x4f9ds
        0x4f81s
    .end array-data
.end method

.method public static ۙ()Ll/۠֨ۘ;
    .locals 1

    .line 101
    new-instance v0, Ll/ᩳ֨ۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0
.end method

.method public static ۙ(Ljava/lang/String;)Ll/۠֨ۘ;
    .locals 1

    .line 58
    new-instance v0, Ll/᩸֨ۘ;

    invoke-direct {v0, p0}, Ll/᩸֨ۘ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static ܰ()Ljava/util/List;
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

    const/16 v25, 0x0

    const v26, -0x11791fc6

    sget v27, Ll/֨ܰ;->ۢ᩷۟:I

    sget v28, Ll/֡۠;->ۛ᩻ۧ:I

    const-string v29, "\u1a7a\u06e7"

    invoke-static/range {v29 .. v29}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v29

    add-int v29, v29, v27

    mul-int/lit8 v29, v29, -0x15

    xor-int v0, v29, v28

    mul-int/lit16 v0, v0, 0x5175

    const v31, 0x57ca2247

    xor-int v0, v0, v31

    const v31, -0x5d7be02a

    xor-int v29, v29, v31

    move-object/from16 v21, v2

    move-object/from16 v30, v5

    move-object/from16 v25, v9

    move-object v11, v10

    move-object v1, v15

    move-object/from16 v2, v16

    move-object/from16 v9, v24

    const/4 v3, 0x0

    const/4 v10, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-object v5, v4

    move-object/from16 v24, v8

    move-object v15, v14

    move-object/from16 v8, v23

    const/4 v4, 0x0

    move-object/from16 v23, v7

    move-object v14, v13

    move-object/from16 v7, v22

    move-object/from16 v22, v6

    move-object v13, v12

    const/4 v12, 0x0

    :goto_0
    xor-int v6, v26, v28

    mul-int/lit16 v6, v6, -0x6261

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v0, v6

    xor-int v26, v29, v0

    sparse-switch v26, :sswitch_data_0

    sget-boolean v0, Ll/֨᩸;->ۚۢۧ:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_1
    move/from16 v29, v4

    move-object/from16 v31, v9

    move v6, v10

    :goto_2
    move-object/from16 v10, v25

    move-object/from16 v9, v30

    move-object/from16 v25, v1

    move-object/from16 v30, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v33

    goto/16 :goto_1b

    :cond_1
    move/from16 v29, v4

    move-object/from16 v31, v9

    move v6, v10

    :goto_3
    move-object/from16 v10, v25

    move-object/from16 v9, v30

    move-object/from16 v25, v1

    move-object/from16 v1, v17

    move-object/from16 v30, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v33

    move-object/from16 v33, v5

    goto/16 :goto_25

    .line 216
    :sswitch_0
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    sget v0, Ll/֫;->ܶܺ᩻:I

    if-gez v0, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "\u0733\u05a1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v27, v0

    mul-int/lit8 v0, v0, -0x2f

    xor-int v6, v0, v28

    mul-int/lit16 v6, v6, -0x156b

    const v29, -0x28a9eff7

    xor-int v6, v6, v29

    const v29, 0x34f97af1

    goto/16 :goto_a

    :sswitch_1
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v0

    if-nez v0, :cond_3

    goto :goto_5

    :cond_3
    move/from16 v29, v4

    move-object v4, v9

    move v6, v10

    goto/16 :goto_e

    .line 313
    :sswitch_2
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    sget v0, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v0, :cond_4

    goto :goto_1

    :cond_4
    move/from16 v29, v4

    :goto_4
    move-object v4, v9

    move-object/from16 v9, v30

    goto/16 :goto_10

    .line 362
    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    sget v0, Ll/֫۟;->᩸ᩴܿ:I

    if-gez v0, :cond_0

    goto :goto_6

    .line 220
    :sswitch_4
    sget v0, Ll/֫֡;->ۡ᩹ۗ:I

    if-lez v0, :cond_5

    goto :goto_8

    :cond_5
    :goto_5
    const-string v0, "\u06e8\u1a7a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v28

    xor-int v6, v0, v27

    mul-int/lit16 v6, v6, -0x596f

    const v29, -0x1bb79769

    xor-int v6, v6, v29

    const v29, 0x1dbea957

    goto/16 :goto_a

    .line 402
    :sswitch_5
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    sget v0, Ll/֨᩺;->۬᩺ܰ:I

    if-gez v0, :cond_6

    goto :goto_7

    :cond_6
    :goto_6
    const-string v0, "\u06df\u1a7b"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v6, v0, v28

    mul-int/lit16 v6, v6, -0x11a9

    const v29, -0x1aa9ba39

    xor-int v6, v6, v29

    const v29, -0x5d954750

    goto/16 :goto_a

    .line 477
    :sswitch_6
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    sget v0, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v0, :cond_7

    goto :goto_8

    :cond_7
    :goto_7
    const-string v0, "\u073a\u0730"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v28

    mul-int/lit8 v0, v0, 0x21

    xor-int v6, v0, v27

    mul-int/lit16 v6, v6, 0x66d3

    const v29, 0x5de2975a

    xor-int v6, v6, v29

    const v29, -0x4c26af56

    goto :goto_a

    :sswitch_7
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    :goto_8
    const-string v0, "\u1a75\u06d6"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v27

    mul-int/lit8 v0, v0, 0x2f

    xor-int v6, v0, v28

    mul-int/lit16 v6, v6, 0x499

    const v29, 0x4d16fc95    # 1.5832098E8f

    xor-int v6, v6, v29

    const v29, -0x582de9c2

    goto :goto_a

    :sswitch_8
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    const/4 v0, 0x0

    return-object v0

    .line 161
    :sswitch_9
    invoke-virtual {v14, v4}, Ll/ᩴ֨ۘ;->ۙ(Z)V

    .line 162
    invoke-static {v11, v14}, Ll/ۖۗ;->ۨۜܰ(Ljava/lang/Object;Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    move/from16 v29, v4

    move-object v4, v9

    move v6, v10

    move-object/from16 v10, v24

    move-object/from16 v0, v25

    move-object/from16 v9, v30

    move-object/from16 v25, v1

    move-object/from16 v1, v23

    goto/16 :goto_12

    :sswitch_a
    const/4 v0, 0x1

    const/4 v4, 0x1

    goto :goto_9

    :sswitch_b
    const/4 v0, 0x0

    const/4 v4, 0x0

    :goto_9
    const-string v0, "\u06d6\u06da"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v6, v0, v28

    mul-int/lit16 v6, v6, -0x286f

    const v29, -0x772144fe

    xor-int v6, v6, v29

    const v29, 0x6e0c38fa

    :goto_a
    xor-int v29, v0, v29

    :goto_b
    move v0, v6

    goto/16 :goto_0

    .line 160
    :sswitch_c
    sget-object v0, Ll/᩵֨ۘ;->ۚܽ֨:[S

    const/16 v6, 0x1f

    move/from16 v29, v4

    const/4 v4, 0x1

    invoke-static {v0, v6, v4, v3}, Ll/ۘۧ;->ܿܶ֫([SIII)Ljava/lang/String;

    move-result-object v0

    .line 161
    invoke-static {v13, v0}, Ll/֫ܳ;->᩵ۛۤ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, "\u0736\u073d"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v28

    xor-int v4, v0, v27

    mul-int/lit16 v4, v4, -0x7b11

    const v6, 0x7319cbf2

    xor-int/2addr v4, v6

    const v6, 0x3c4ef64d

    goto :goto_c

    :cond_8
    const-string v0, "\u05ab\u06df"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v28

    xor-int v4, v0, v27

    mul-int/lit16 v4, v4, 0x59f1

    const v6, 0x4dcb7b83    # 4.2673366E8f

    xor-int/2addr v4, v6

    const v6, 0xebaeb1f

    goto :goto_c

    :sswitch_d
    move/from16 v29, v4

    const/4 v0, 0x1

    .line 159
    invoke-static {v9, v10, v0, v3}, Ll/֡֡;->ۨܶ᩷([SIII)Ljava/lang/String;

    move-result-object v0

    .line 160
    invoke-static {v13, v0}, Ll/֡᩸;->ۛ᩵ۨ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    move-object v4, v9

    move v6, v10

    int-to-long v9, v0

    invoke-virtual {v14, v9, v10}, Ll/ᩴ֨ۘ;->ۙ(J)V

    sget v0, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v0, :cond_9

    move-object/from16 v31, v4

    goto/16 :goto_2

    :cond_9
    const-string v0, "\u1a77\u1a73"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v9, v0, v28

    mul-int/lit16 v9, v9, -0x3917

    const v10, 0x2c933b0a

    xor-int/2addr v9, v10

    const v10, -0x32fc4348

    goto/16 :goto_f

    :sswitch_e
    move/from16 v29, v4

    .line 158
    invoke-virtual {v14, v2}, Ll/ᩴ֨ۘ;->۬(Ljava/lang/String;)V

    .line 159
    invoke-static {v13, v5}, Ll/֡᩸;->ۛ᩵ۨ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {v14, v0}, Ll/ᩴ֨ۘ;->ۚ(I)V

    sget-object v9, Ll/᩵֨ۘ;->ۚܽ֨:[S

    const/16 v10, 0x1e

    .line 325
    sget v0, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v0, :cond_a

    goto/16 :goto_4

    :cond_a
    const-string v0, "\u06e4\u06d6"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    mul-int/lit8 v0, v0, 0x4d

    xor-int v4, v0, v28

    mul-int/lit16 v4, v4, 0x3841

    const v6, -0x569a06a5

    xor-int/2addr v4, v6

    const v6, 0xccdca08

    :goto_c
    xor-int/2addr v0, v6

    goto/16 :goto_27

    :sswitch_f
    move/from16 v29, v4

    move-object v4, v9

    move v6, v10

    .line 157
    invoke-virtual {v14, v1}, Ll/ᩴ֨ۘ;->ۙ(Ljava/lang/String;)V

    sget-object v0, Ll/᩵֨ۘ;->ۚܽ֨:[S

    const/16 v2, 0x1d

    const/4 v9, 0x1

    invoke-static {v0, v2, v9, v3}, Ll/۟;->ܳܳ᩶([SIII)Ljava/lang/String;

    move-result-object v0

    .line 158
    invoke-static {v13, v0}, Ll/ۖۧ;->ܺܶ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget-boolean v0, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v0, :cond_b

    move-object/from16 v31, v4

    goto/16 :goto_3

    :cond_b
    const-string v0, "\u06d8\u06df"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v28

    mul-int/lit8 v0, v0, -0x35

    xor-int v9, v0, v27

    mul-int/lit16 v9, v9, 0x5f2d

    const v10, 0x775f292a

    xor-int/2addr v9, v10

    const v10, 0x36c0e5e9

    goto/16 :goto_f

    :sswitch_10
    move/from16 v29, v4

    move-object v4, v9

    move v6, v10

    const/16 v0, 0x1c

    const/4 v1, 0x1

    .line 156
    invoke-static {v8, v0, v1, v3}, Ll/֡֡;->ۨܶ᩷([SIII)Ljava/lang/String;

    move-result-object v0

    .line 157
    invoke-static {v13, v0}, Ll/֫ۚ;->ᩳܶ֡(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 229
    sget v0, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v0, :cond_c

    move-object/from16 v0, v24

    move-object/from16 v10, v25

    move-object/from16 v9, v30

    :goto_d
    move-object/from16 v24, v2

    goto/16 :goto_13

    :cond_c
    const-string v0, "\u0736\u06e7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v9, v0, v28

    mul-int/lit16 v9, v9, 0x4da3

    const v10, 0x49a9c0ba

    xor-int/2addr v9, v10

    const v10, 0xaacff2e

    goto :goto_f

    :sswitch_11
    move/from16 v29, v4

    move-object v4, v9

    move v6, v10

    const/16 v0, 0x1b

    const/4 v8, 0x1

    .line 155
    invoke-static {v7, v0, v8, v3}, Ll/֡۠;->֨ۛ֨([SIII)Ljava/lang/String;

    move-result-object v0

    .line 156
    invoke-static {v13, v0}, Ll/ۖۧ;->ܺܶ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ll/ᩴ֨ۘ;->ۨ(Ljava/lang/String;)V

    sget-object v8, Ll/᩵֨ۘ;->ۚܽ֨:[S

    .line 164
    sget v0, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v0, :cond_d

    :goto_e
    const-string v0, "\u06d8\u06db"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v28

    xor-int v9, v0, v27

    mul-int/lit16 v9, v9, -0x17a1

    const v10, -0x333334eb

    xor-int/2addr v9, v10

    const v10, 0x38bb6d0a

    goto :goto_f

    :cond_d
    const-string v0, "\u1a75\u0733"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v28

    xor-int v9, v0, v27

    mul-int/lit16 v9, v9, -0x492b

    const v10, -0x2168a379

    xor-int/2addr v9, v10

    const v10, -0x45a008ff

    :goto_f
    xor-int/2addr v0, v10

    move v10, v6

    move/from16 v34, v29

    move/from16 v29, v0

    move v0, v9

    move-object v9, v4

    goto/16 :goto_28

    :sswitch_12
    move/from16 v29, v4

    move-object v4, v9

    move v6, v10

    .line 154
    invoke-static {v13, v15}, Ll/֫ܳ;->᩵ۛۤ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {v14, v0}, Ll/ᩴ֨ۘ;->ۨ(I)V

    move-object/from16 v9, v30

    .line 155
    invoke-static {v13, v9}, Ll/ۖۧ;->ܺܶ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ll/ᩴ֨ۘ;->ۖ(Ljava/lang/String;)V

    sget-object v7, Ll/᩵֨ۘ;->ۚܽ֨:[S

    .line 375
    sget v0, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v0, :cond_e

    move v10, v6

    :goto_10
    const-string v0, "\u06e1\u0730"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v28, v0

    mul-int/lit8 v0, v0, -0x5b

    xor-int v6, v0, v27

    mul-int/lit16 v6, v6, -0x178b

    const v30, -0xfef5c4d

    xor-int v6, v6, v30

    const v30, -0x1308d4c3

    xor-int v0, v0, v30

    move-object/from16 v30, v9

    move-object v9, v4

    move/from16 v4, v29

    move/from16 v29, v0

    goto/16 :goto_b

    :cond_e
    const-string v0, "\u073f\u1a74"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v10, v0, v28

    mul-int/lit16 v10, v10, -0x187

    const v30, 0x2c2dbe7b

    xor-int v10, v10, v30

    const v30, -0x245b23c9

    xor-int v0, v0, v30

    move-object/from16 v30, v9

    move-object v9, v4

    move/from16 v4, v29

    move/from16 v29, v0

    move v0, v10

    goto/16 :goto_22

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
    new-instance v14, Ll/ᩴ֨ۘ;

    invoke-direct {v14}, Ll/ᩴ֨ۘ;-><init>()V

    sget-object v0, Ll/᩵֨ۘ;->ۚܽ֨:[S

    const/16 v15, 0x1a

    move-object/from16 v25, v1

    const/4 v1, 0x1

    invoke-static {v0, v15, v1, v3}, Ll/֫ܳ;->᩵ۘ᩵([SIII)Ljava/lang/String;

    move-result-object v15

    .line 241
    sget-boolean v0, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v0, :cond_f

    move-object/from16 v0, v24

    move-object/from16 v1, v25

    goto/16 :goto_d

    :cond_f
    const-string v0, "\u1a78\u1a77"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v28

    mul-int/lit8 v0, v0, -0x29

    xor-int v1, v0, v27

    mul-int/lit16 v1, v1, -0x6c01

    const v30, 0x7fc2c9ce

    xor-int v1, v1, v30

    const v30, 0x56152a78

    goto :goto_11

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

    const-string v0, "\u06e0\u05a1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    mul-int/lit8 v0, v0, -0x51

    xor-int v1, v0, v28

    mul-int/lit16 v1, v1, 0x509f

    const v30, 0x335dc99

    xor-int v1, v1, v30

    const v30, -0x3d0af061

    goto :goto_11

    :cond_10
    const-string v0, "\u1a78\u1a79"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v28

    xor-int v1, v0, v27

    mul-int/lit16 v1, v1, 0x336b

    const v30, 0x42486089

    xor-int v1, v1, v30

    const v30, -0x3c78938

    :goto_11
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

    :goto_12
    const-string v23, "\u1a7a\u06e8"

    invoke-static/range {v23 .. v23}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v23

    sub-int v23, v27, v23

    mul-int/lit8 v23, v23, -0x7f

    move-object/from16 v24, v0

    xor-int v0, v23, v28

    mul-int/lit16 v0, v0, 0x1b99

    const v30, -0x562e8b4d

    xor-int v0, v0, v30

    const v30, -0x7065edd5

    xor-int v23, v23, v30

    move-object/from16 v30, v9

    move-object v9, v4

    move/from16 v4, v29

    move/from16 v29, v23

    move-object/from16 v23, v1

    move-object/from16 v1, v25

    move-object/from16 v25, v24

    move-object/from16 v24, v10

    goto/16 :goto_22

    :sswitch_17
    move/from16 v29, v4

    move-object v4, v9

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v9, v30

    move-object/from16 v25, v1

    .line 149
    invoke-virtual/range {v22 .. v22}, Ll/᩹֨ۘ;->ۨ()Lorg/json/JSONObject;

    move-result-object v23

    sget-object v0, Ll/᩵֨ۘ;->ۚܽ֨:[S

    const/16 v1, 0x15

    move-object/from16 v24, v2

    const/4 v2, 0x5

    invoke-static {v0, v1, v2, v3}, Ll/ۗ;->ۘ۫᩹([SIII)Ljava/lang/String;

    move-result-object v0

    sget v1, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v1, :cond_11

    move-object/from16 v1, v25

    :goto_13
    const-string v2, "\u1a73\u073d"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v28, v2

    mul-int/lit8 v2, v2, 0x21

    move-object/from16 v25, v0

    xor-int v0, v2, v27

    mul-int/lit16 v0, v0, 0x5799

    const v30, -0x6acad88c

    xor-int v0, v0, v30

    const v30, 0x7de4b532    # 3.80006E37f

    xor-int v2, v2, v30

    move-object/from16 v30, v9

    move-object v9, v4

    move/from16 v4, v29

    move/from16 v29, v2

    move-object/from16 v2, v24

    move-object/from16 v24, v25

    goto/16 :goto_1d

    :cond_11
    const-string v1, "\u06d6\u05a8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v28

    mul-int/lit8 v1, v1, -0x45

    xor-int v2, v1, v27

    mul-int/lit16 v2, v2, -0x4e27

    const v30, 0x5700311e

    xor-int v2, v2, v30

    const v30, -0x5148ef3c

    xor-int v1, v1, v30

    move-object/from16 v30, v9

    move-object v9, v4

    move/from16 v4, v29

    move/from16 v29, v1

    move-object/from16 v1, v25

    move-object/from16 v25, v10

    move v10, v6

    move-object/from16 v34, v24

    move-object/from16 v24, v0

    move v0, v2

    goto/16 :goto_15

    .line 148
    :sswitch_18
    new-instance v0, Ll/ۙ᩻᩺;

    invoke-virtual/range {v22 .. v22}, Ll/᩹֨ۘ;->ܰ()Ljava/lang/String;

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

    move-object/from16 v34, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v34

    .line 147
    invoke-virtual/range {v22 .. v22}, Ll/᩹֨ۘ;->ۖ()Z

    move-result v0

    if-eqz v0, :cond_12

    const-string v0, "\u06d7\u1a76"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v28

    move-object/from16 v23, v1

    xor-int v1, v0, v27

    mul-int/lit16 v1, v1, 0x4cd5

    const v30, 0x29aa0332

    xor-int v1, v1, v30

    const v30, -0x4f425503

    goto :goto_14

    :cond_12
    move-object/from16 v23, v1

    const-string v0, "\u073d\u073a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v1, v0, v28

    mul-int/lit16 v1, v1, 0x10b

    const v30, -0x675ac51a

    xor-int v1, v1, v30

    const v30, 0x609316f0

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

    move-object/from16 v34, v24

    move-object/from16 v24, v2

    :goto_15
    move-object/from16 v2, v34

    goto/16 :goto_0

    :sswitch_1a
    move/from16 v29, v4

    move-object v4, v9

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v9, v30

    move-object/from16 v25, v1

    move-object/from16 v34, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v34

    .line 474
    :try_start_0
    invoke-static/range {v21 .. v21}, Ll/֡۠;->ۗۛۖ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ᩹ۘ;

    .line 475
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    move-object/from16 v30, v2

    .line 476
    :try_start_1
    invoke-static {v0}, Ll/֨۟;->ۢ᩶۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v9, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 477
    invoke-virtual {v0}, Ll/ۨ᩹ۘ;->۠()I

    move-result v0

    invoke-virtual {v1, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object/from16 v2, v33

    .line 478
    :try_start_2
    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-object/from16 v31, v4

    move-object/from16 v33, v5

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
    move-object/from16 v2, v33

    :goto_17
    move-object/from16 v17, v0

    move-object/from16 v31, v4

    move-object/from16 v33, v5

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

    move-object/from16 v2, v33

    :try_start_3
    sget-object v0, Ll/᩵֨ۘ;->ۚܽ֨:[S
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5

    const/4 v1, 0x3

    move-object/from16 v31, v4

    const/16 v4, 0xe

    :try_start_4
    invoke-static {v0, v1, v4, v3}, Ll/֨ܶ;->ۢ֡᩷([SIII)Ljava/lang/String;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 481
    :try_start_5
    invoke-static {v0}, Ll/ۚ֨ۘ;->ۙ(Ljava/lang/String;)Ll/ۚ֨ۘ;

    move-result-object v0

    sget-object v1, Ll/᩵֨ۘ;->ۚܽ֨:[S
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    const/16 v4, 0x11

    move-object/from16 v33, v5

    const/4 v5, 0x4

    :try_start_6
    invoke-static {v1, v4, v5, v3}, Ll/ۗܳ;->ۡܿۘ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 482
    invoke-static {v2}, Ll/֨ۖ;->ܳۤۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v1, v4}, Ll/ۘ֡;->۫ۜۗ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 483
    invoke-virtual {v0}, Ll/ۚ֨ۘ;->ܰ()Ll/᩹֨ۘ;

    move-result-object v22
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_7

    const-string v0, "\u06d9\u073a"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    mul-int/lit8 v0, v0, 0x53

    xor-int v1, v0, v28

    mul-int/lit16 v1, v1, 0x556d

    const v4, 0x41ca80b9

    xor-int/2addr v1, v4

    const v4, 0x37e4742c

    goto/16 :goto_21

    :catch_3
    move-exception v0

    :goto_18
    move-object/from16 v33, v5

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

    move-object/from16 v31, v9

    move v6, v10

    move-object/from16 v30, v24

    move-object/from16 v10, v25

    move-object/from16 v25, v1

    move-object/from16 v24, v2

    move-object/from16 v2, v33

    move-object/from16 v33, v5

    .line 474
    sget-object v0, Ll/᩵֨ۘ;->ۚܽ֨:[S

    const/4 v1, 0x2

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v3}, Ll/ۘۧ;->ܿܶ֫([SIII)Ljava/lang/String;

    move-result-object v0

    if-eqz v18, :cond_13

    const-string v1, "\u1a77\u0736"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v28, v1

    mul-int/lit8 v1, v1, -0x31

    xor-int v4, v1, v27

    mul-int/lit16 v4, v4, 0x57c1

    const v5, -0x3411e8dc    # -3.1206984E7f

    xor-int/2addr v4, v5

    const v5, -0x39743976

    goto :goto_19

    :cond_13
    const-string v1, "\u1a7a\u073d"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v28

    mul-int/lit8 v1, v1, -0x65

    xor-int v4, v1, v27

    mul-int/lit16 v4, v4, -0x7595

    const v5, 0x42991c64

    xor-int/2addr v4, v5

    const v5, -0x7a12beb6

    :goto_19
    xor-int/2addr v1, v5

    move-object/from16 v9, v31

    move-object/from16 v5, v33

    move-object/from16 v33, v2

    move-object/from16 v2, v24

    move-object/from16 v24, v30

    move-object/from16 v30, v0

    move v0, v4

    move/from16 v4, v29

    move/from16 v29, v1

    :goto_1a
    move-object/from16 v1, v25

    goto :goto_1d

    :sswitch_1d
    move/from16 v29, v4

    move-object/from16 v31, v9

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v9, v30

    move-object/from16 v25, v1

    move-object/from16 v30, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v33

    sget-object v0, Ll/᩵֨ۘ;->ۚܽ֨:[S

    const/4 v1, 0x1

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v3}, Ll/֨᩺;->ۧۖܿ([SIII)Ljava/lang/String;

    move-result-object v5

    .line 406
    sget v0, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v0, :cond_14

    :goto_1b
    const-string v0, "\u06e4\u06e8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v1, v0, v28

    mul-int/lit16 v1, v1, 0x1b9b

    const v4, 0xf039582

    xor-int/2addr v1, v4

    const v4, -0x2ebdb168

    goto :goto_1c

    :cond_14
    const-string v0, "\u06d9\u06eb"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v27

    mul-int/lit8 v0, v0, -0x47

    xor-int v1, v0, v28

    mul-int/lit16 v1, v1, 0x1859

    const v4, -0x23397ab6

    xor-int/2addr v1, v4

    const v4, -0x1a686929

    :goto_1c
    xor-int/2addr v0, v4

    move-object/from16 v33, v2

    move-object/from16 v2, v24

    move/from16 v4, v29

    move-object/from16 v24, v30

    move/from16 v29, v0

    move v0, v1

    move-object/from16 v30, v9

    move-object/from16 v1, v25

    move-object/from16 v9, v31

    :goto_1d
    move-object/from16 v25, v10

    goto/16 :goto_22

    :sswitch_1e
    move/from16 v29, v4

    move-object/from16 v31, v9

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v9, v30

    move-object/from16 v25, v1

    move-object/from16 v30, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v33

    move-object/from16 v33, v5

    .line 474
    :try_start_7
    invoke-static/range {v21 .. v21}, Ll/֨۟;->᩵ۨۚ(Ljava/lang/Object;)Z

    move-result v18
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    const-string v0, "\u06dc\u05a8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v1, v0, v28

    mul-int/lit16 v1, v1, -0x286d

    const v4, -0x5eee9758

    xor-int/2addr v1, v4

    const v4, -0x6d5d905e

    goto :goto_21

    .line 485
    :sswitch_1f
    new-instance v0, Ljava/lang/RuntimeException;

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :sswitch_20
    move/from16 v29, v4

    move-object/from16 v31, v9

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v9, v30

    move-object/from16 v25, v1

    move-object/from16 v1, v17

    move-object/from16 v30, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v33

    move-object/from16 v33, v5

    .line 472
    :try_start_8
    invoke-static {}, Ll/ܿۚۘ;->ܰ()Ljava/util/List;

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
    invoke-static {v0}, Ll/ۗ۬;->ۜܿ᩹(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_7

    move-object/from16 v21, v0

    :goto_1e
    const-string v0, "\u06e0\u06d8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v28

    xor-int v4, v0, v27

    mul-int/lit16 v4, v4, -0x3d9d

    const v5, 0x7c1c9863

    xor-int/2addr v4, v5

    const v5, -0x4b828f9f

    goto/16 :goto_26

    :catch_6
    move-exception v0

    const/4 v2, 0x0

    goto :goto_1f

    :catch_7
    move-exception v0

    :goto_1f
    move-object/from16 v17, v0

    :goto_20
    const-string v0, "\u06dc\u05ab"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v1, v0, v28

    mul-int/lit16 v1, v1, -0x20a5

    const v4, 0x5cfcd232

    xor-int/2addr v1, v4

    const v4, 0x2ceb900d

    :goto_21
    xor-int/2addr v0, v4

    move/from16 v4, v29

    move-object/from16 v5, v33

    move/from16 v29, v0

    move v0, v1

    move-object/from16 v33, v2

    move-object/from16 v2, v24

    move-object/from16 v1, v25

    move-object/from16 v24, v30

    move-object/from16 v30, v9

    move-object/from16 v25, v10

    move-object/from16 v9, v31

    :goto_22
    move v10, v6

    goto/16 :goto_0

    .line 144
    :sswitch_21
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    :sswitch_22
    move/from16 v29, v4

    move-object/from16 v31, v9

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v9, v30

    move-object/from16 v25, v1

    move-object/from16 v1, v17

    move-object/from16 v30, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v33

    move-object/from16 v33, v5

    .line 146
    sget v0, Ll/ܶ֨ۘ;->ۙ:I

    const-string v0, "\u06e8\u06dc"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v28

    xor-int v4, v0, v27

    mul-int/lit16 v4, v4, 0x19d7

    const v5, 0x13edc7a7

    xor-int/2addr v4, v5

    const v5, 0x1bbca907

    goto/16 :goto_26

    :sswitch_23
    move/from16 v29, v4

    move-object/from16 v31, v9

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v9, v30

    move-object/from16 v25, v1

    move-object/from16 v1, v17

    move-object/from16 v30, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v33

    move-object/from16 v33, v5

    .line 143
    invoke-static {}, Ll/ܿۚۘ;->ܰ()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/֡᩶;->ۗᩴۛ(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    const-string v0, "\u1a74\u073d"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v28

    mul-int/lit8 v0, v0, -0x45

    xor-int v4, v0, v27

    mul-int/lit16 v4, v4, -0x5699

    const v5, -0x53eceefc

    xor-int/2addr v4, v5

    const v5, 0x6216020d

    goto/16 :goto_26

    :cond_15
    const-string v0, "\u06df\u06e8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v4, v0, v28

    mul-int/lit16 v4, v4, -0xdbf

    const v5, 0x2410a85

    xor-int/2addr v4, v5

    const v5, 0x61296249

    goto/16 :goto_26

    :sswitch_24
    move/from16 v29, v4

    move-object/from16 v31, v9

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v9, v30

    move-object/from16 v25, v1

    move-object/from16 v1, v17

    move-object/from16 v30, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v33

    move-object/from16 v33, v5

    const/16 v0, 0x604c

    const/16 v3, 0x604c

    goto :goto_23

    :sswitch_25
    move/from16 v29, v4

    move-object/from16 v31, v9

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v9, v30

    move-object/from16 v25, v1

    move-object/from16 v1, v17

    move-object/from16 v30, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v33

    move-object/from16 v33, v5

    const/16 v0, 0x4fee

    const/16 v3, 0x4fee

    :goto_23
    const-string v0, "\u05ab\u1a7a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v28

    mul-int/lit8 v0, v0, 0x13

    xor-int v4, v0, v27

    mul-int/lit16 v4, v4, -0x2ad7

    const v5, 0x3b22fb85

    xor-int/2addr v4, v5

    const v5, 0x40610dcc

    goto/16 :goto_26

    :sswitch_26
    move/from16 v29, v4

    move-object/from16 v31, v9

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v9, v30

    move-object/from16 v25, v1

    move-object/from16 v1, v17

    move-object/from16 v30, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v33

    move-object/from16 v33, v5

    add-int v0, v19, v20

    move/from16 v4, v32

    mul-int/lit16 v5, v4, 0x4810

    sub-int/2addr v5, v0

    if-gtz v5, :cond_16

    const-string v0, "\u06e1\u06da"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v5, v0, v28

    mul-int/lit16 v5, v5, -0x72bb

    const v17, -0x33a75bf8    # -5.679107E7f

    xor-int v5, v5, v17

    const v17, -0x1896ded

    :goto_24
    xor-int v0, v0, v17

    move-object/from16 v17, v1

    move/from16 v32, v4

    move-object/from16 v1, v25

    move/from16 v4, v29

    move/from16 v29, v0

    move v0, v5

    move-object/from16 v25, v10

    move-object/from16 v5, v33

    move-object/from16 v33, v2

    move v10, v6

    move-object/from16 v2, v24

    move-object/from16 v24, v30

    move-object/from16 v30, v9

    move-object/from16 v9, v31

    goto/16 :goto_0

    :cond_16
    const-string v0, "\u1a75\u073f"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v27

    mul-int/lit8 v0, v0, -0x69

    xor-int v5, v0, v28

    mul-int/lit16 v5, v5, 0x3b8b

    const v17, -0x66a75a39

    xor-int v5, v5, v17

    const v17, 0x32d41b04

    goto :goto_24

    :sswitch_27
    move/from16 v29, v4

    move-object/from16 v31, v9

    move v6, v10

    move-object/from16 v10, v25

    move-object/from16 v9, v30

    move-object/from16 v25, v1

    move-object/from16 v1, v17

    move-object/from16 v30, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v33

    move-object/from16 v33, v5

    sget-object v0, Ll/᩵֨ۘ;->ۚܽ֨:[S

    const/4 v4, 0x0

    aget-short v32, v0, v4

    mul-int v19, v32, v32

    const v20, 0x5124040

    sget v0, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v0, :cond_17

    :goto_25
    const-string v0, "\u06e4\u06e4"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v27

    mul-int/lit8 v0, v0, 0x57

    xor-int v4, v0, v28

    mul-int/lit16 v4, v4, 0x5971

    const v5, 0x6179f699

    xor-int/2addr v4, v5

    const v5, 0x294d2b48

    goto :goto_26

    :cond_17
    const-string v0, "\u1a76\u06eb"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v28, v0

    mul-int/lit8 v0, v0, 0x6b

    xor-int v4, v0, v27

    mul-int/lit16 v4, v4, 0x406d

    const v5, 0x20b75af6

    xor-int/2addr v4, v5

    const v5, 0x44f41754

    :goto_26
    xor-int/2addr v0, v5

    move-object/from16 v17, v1

    move-object/from16 v1, v25

    move-object/from16 v5, v33

    move-object/from16 v33, v2

    move-object/from16 v25, v10

    move-object/from16 v2, v24

    move-object/from16 v24, v30

    move v10, v6

    move-object/from16 v30, v9

    move-object/from16 v9, v31

    :goto_27
    move/from16 v34, v29

    move/from16 v29, v0

    move v0, v4

    :goto_28
    move/from16 v4, v34

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7eea5251 -> :sswitch_12
        -0x7e3aec13 -> :sswitch_25
        -0x7b5778ad -> :sswitch_18
        -0x7b2474b8 -> :sswitch_6
        -0x6ee1262a -> :sswitch_0
        -0x6846bc76 -> :sswitch_1c
        -0x65a2fbce -> :sswitch_1a
        -0x5ff914cd -> :sswitch_16
        -0x5be8853b -> :sswitch_11
        -0x5bac9628 -> :sswitch_21
        -0x58d430c8 -> :sswitch_10
        -0x56f55702 -> :sswitch_1e
        -0x534e1871 -> :sswitch_15
        -0x5330f93d -> :sswitch_24
        -0x5262222d -> :sswitch_11
        -0x5235b81b -> :sswitch_17
        -0x510e3005 -> :sswitch_4
        -0x4d4c507d -> :sswitch_c
        -0x453d4168 -> :sswitch_1
        -0x41ba81aa -> :sswitch_a
        -0x36e7bcfe -> :sswitch_1f
        -0x2f11e92d -> :sswitch_e
        -0x2c96c21a -> :sswitch_2
        -0x2aabfb5a -> :sswitch_8
        -0x2226f5d5 -> :sswitch_6
        -0x1ebefda1 -> :sswitch_9
        -0x1eb3c552 -> :sswitch_14
        -0x1ce9c3d7 -> :sswitch_26
        -0x1b30433a -> :sswitch_1b
        -0x12ee17f7 -> :sswitch_1d
        -0xd8b4d4c -> :sswitch_d
        -0xa36f9f7 -> :sswitch_10
        0xba1a1b -> :sswitch_1b
        0xc95aa2 -> :sswitch_5
        0x6cb7694 -> :sswitch_20
        0xb90bbb2 -> :sswitch_26
        0xef909bd -> :sswitch_16
        0x11bfbfd9 -> :sswitch_9
        0x13cd5eec -> :sswitch_b
        0x15d1cfd8 -> :sswitch_25
        0x1652bcfc -> :sswitch_17
        0x1a03d163 -> :sswitch_7
        0x1e4ab8d0 -> :sswitch_12
        0x1e9ae447 -> :sswitch_22
        0x1f20ac8a -> :sswitch_18
        0x213913ed -> :sswitch_a
        0x232a8020 -> :sswitch_e
        0x2481790a -> :sswitch_27
        0x25ccb56e -> :sswitch_2
        0x27437e15 -> :sswitch_4
        0x28051792 -> :sswitch_15
        0x28b57607 -> :sswitch_5
        0x2e0b4bbb -> :sswitch_b
        0x30117d7f -> :sswitch_13
        0x3254ba71 -> :sswitch_f
        0x33194554 -> :sswitch_8
        0x36e0525f -> :sswitch_20
        0x4841cf6b -> :sswitch_22
        0x4cbabdf5 -> :sswitch_1e
        0x4d27a19d -> :sswitch_3
        0x4e33f23a -> :sswitch_27
        0x4f0009b7 -> :sswitch_1
        0x4f72f249 -> :sswitch_0
        0x50d0e73e -> :sswitch_19
        0x52b559cc -> :sswitch_14
        0x535817a5 -> :sswitch_1f
        0x53599f35 -> :sswitch_c
        0x5ac73365 -> :sswitch_13
        0x643033d9 -> :sswitch_d
        0x69757c89 -> :sswitch_1a
        0x6bf70ee5 -> :sswitch_3
        0x6ca13d56 -> :sswitch_19
        0x6dbad997 -> :sswitch_21
        0x6f3a4be6 -> :sswitch_23
        0x6f854fee -> :sswitch_23
        0x7093bcc6 -> :sswitch_1c
        0x71931585 -> :sswitch_1d
        0x735423e4 -> :sswitch_24
        0x751f44b8 -> :sswitch_f
        0x7fac6e97 -> :sswitch_7
    .end sparse-switch
.end method
