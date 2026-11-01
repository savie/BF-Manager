.class public final Ll/֨᩵᩺;
.super Ljava/lang/Object;
.source "U4EL"


# static fields
.field public static final synthetic ۙ:I

.field public static final ۨ:Ljava/util/regex/Pattern;

.field private static final ۨ۫ۡ:[S

.field public static final ܰ:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 21

    const/16 v0, 0x40

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/֨᩵᩺;->ۨ۫ۡ:[S

    const/4 v1, 0x0

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

    const v13, -0xfc49031

    sget v14, Ll/֨᩹;->᩻ᩳ֨:I

    sget v15, Ll/֫۟;->᩸ᩴܿ:I

    const-string v16, "\u1a78\u1a7a"

    invoke-static/range {v16 .. v16}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v14

    xor-int v0, v16, v15

    mul-int/lit16 v0, v0, 0x6a13

    const v18, -0x18139be2

    xor-int v0, v0, v18

    const v18, -0x15410d17

    xor-int v16, v16, v18

    const/16 v18, 0x0

    const/16 v17, 0x0

    :goto_0
    xor-int/2addr v13, v15

    mul-int/lit16 v13, v13, 0x47a3

    shr-int/lit8 v13, v13, 0x1f

    and-int/2addr v0, v13

    xor-int v13, v16, v0

    sparse-switch v13, :sswitch_data_0

    move/from16 v19, v4

    move-object/from16 v16, v7

    .line 18
    sget v0, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v0, :cond_d

    const/16 v12, 0xd

    goto/16 :goto_9

    .line 0
    :sswitch_0
    invoke-static {v7, v8, v9, v6}, Ll/֨᩸;->۫ۜܽ([SIII)Ljava/lang/String;

    move-result-object v18

    sget v0, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v0, "\u0733\u06ec"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x2f

    move-object/from16 v16, v7

    xor-int v7, v0, v14

    mul-int/lit16 v7, v7, 0x1c2f

    const v19, 0x6641dd52

    xor-int v7, v7, v19

    const v19, 0x6c7bef0a

    move/from16 v19, v4

    move v4, v7

    move-object/from16 v7, v16

    const v16, 0x6c7bef0a

    goto/16 :goto_a

    :sswitch_1
    move-object/from16 v16, v7

    const/16 v0, 0x4d8e

    goto/16 :goto_2

    :sswitch_2
    move-object/from16 v16, v7

    .line 19
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    sget v0, Ll/ۗ᩺;->ۢۜ᩶:I

    if-lez v0, :cond_1

    goto/16 :goto_1

    :cond_1
    move/from16 v19, v4

    goto/16 :goto_5

    :sswitch_3
    move-object/from16 v16, v7

    mul-int v0, v2, v5

    sub-int v0, v4, v0

    if-gez v0, :cond_2

    const-string v0, "\u05a1\u06d7"

    .line 0
    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v7, v0, v14

    mul-int/lit16 v7, v7, -0x131b

    const v19, -0x2b11d77b

    xor-int v7, v7, v19

    const v19, -0x38da8a07

    move/from16 v19, v4

    move v4, v7

    move-object/from16 v7, v16

    const v16, -0x38da8a07

    goto/16 :goto_a

    :cond_2
    const-string v0, "\u06d9\u06d6"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x39

    xor-int v7, v0, v15

    mul-int/lit16 v7, v7, 0x7909

    const v19, 0x7853d0ac

    xor-int v7, v7, v19

    const v19, 0x70d18a1e

    move/from16 v19, v4

    move v4, v7

    move-object/from16 v7, v16

    const v16, 0x70d18a1e

    goto/16 :goto_a

    :sswitch_4
    sget-object v7, Ll/֨᩵᩺;->ۨ۫ۡ:[S

    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v8, 0x1

    goto/16 :goto_3

    :cond_3
    const-string v0, "\u1a74\u073f"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x61

    xor-int v8, v0, v14

    mul-int/lit16 v8, v8, 0x5065

    const v19, 0x1e17be3a

    xor-int v8, v8, v19

    const v19, 0x7462b3a3

    move/from16 v19, v4

    move v4, v8

    const/4 v8, 0x1

    const v16, 0x7462b3a3

    goto/16 :goto_a

    :sswitch_5
    move-object/from16 v16, v7

    const/16 v9, 0x32

    .line 4
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    move-result v0

    if-eqz v0, :cond_4

    :goto_1
    move/from16 v19, v4

    goto/16 :goto_9

    :cond_4
    const-string v0, "\u1a73\u06e8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x6d

    xor-int v7, v0, v15

    mul-int/lit16 v7, v7, 0x33bd

    const v19, 0x1b1380eb

    xor-int v7, v7, v19

    const v19, -0x3e9d33e0

    move/from16 v19, v4

    move v4, v7

    move-object/from16 v7, v16

    const v16, -0x3e9d33e0

    goto/16 :goto_a

    :sswitch_6
    move-object/from16 v16, v7

    const v0, 0xa43c

    :goto_2
    const-string v6, "\u06e8\u06db"

    .line 0
    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v14

    mul-int/lit8 v6, v6, -0x5b

    xor-int v7, v6, v15

    mul-int/lit16 v7, v7, 0x44cb

    const v19, 0x654308f1

    xor-int v7, v7, v19

    const v19, -0x7e86a594

    move/from16 v19, v4

    move v4, v7

    move-object/from16 v7, v16

    const v16, -0x7e86a594

    move/from16 v20, v6

    move v6, v0

    move/from16 v0, v20

    goto/16 :goto_a

    :sswitch_7
    move-object/from16 v16, v7

    .line 18
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    sget v0, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v0, :cond_5

    move/from16 v19, v4

    goto :goto_4

    :cond_5
    move-object/from16 v7, v16

    :goto_3
    const-string v0, "\u0730\u06ec"

    .line 0
    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    move/from16 v19, v4

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, 0x4c93

    const v16, 0x37aae994

    xor-int v4, v4, v16

    const v16, 0x40e41baf

    goto/16 :goto_a

    :sswitch_8
    move-object/from16 v16, v7

    mul-int v4, v3, v3

    const v5, 0xd7dc

    .line 19
    sget-boolean v0, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v0, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v0, "\u06da\u1a78"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v7, v0, v14

    mul-int/lit16 v7, v7, -0x16ef

    const v19, -0x7a6b0701

    xor-int v7, v7, v19

    const v19, -0x59dd65fa

    move/from16 v19, v4

    move v4, v7

    move-object/from16 v7, v16

    const v16, -0x59dd65fa

    goto/16 :goto_a

    :sswitch_9
    move/from16 v19, v4

    move-object/from16 v16, v7

    .line 18
    sget-boolean v0, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v0, :cond_7

    goto/16 :goto_5

    :cond_7
    :goto_4
    move/from16 v4, v19

    goto/16 :goto_6

    :sswitch_a
    move/from16 v19, v4

    move-object/from16 v16, v7

    .line 19
    invoke-static/range {v18 .. v18}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/֨᩵᩺;->ۨ:Ljava/util/regex/Pattern;

    sget v0, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v0, :cond_8

    const-string v0, "\u1a7b\u06e7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x3f

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x3dd7

    const v7, 0x44cdcd69

    xor-int/2addr v4, v7

    const v7, -0x62b4b878

    move-object/from16 v7, v16

    const v16, -0x62b4b878

    goto/16 :goto_a

    :cond_8
    const-string v0, "\u06e1\u0730"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x2b

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0x6fb

    const v7, 0x5f663549

    xor-int/2addr v4, v7

    const v7, 0x49490f76    # 823543.4f

    move-object/from16 v7, v16

    const v16, 0x49490f76    # 823543.4f

    goto/16 :goto_a

    .line 10
    :sswitch_b
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :sswitch_c
    move/from16 v19, v4

    move-object/from16 v16, v7

    .line 18
    sget-object v17, Ll/֨᩵᩺;->ۨ۫ۡ:[S

    const/4 v1, 0x0

    .line 0
    sget v0, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v0, :cond_9

    goto :goto_4

    :cond_9
    const-string v0, "\u0736\u0736"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x6d

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0x5325

    const v7, -0x5fde1d4b

    xor-int/2addr v4, v7

    const v7, -0x2067c02c

    move-object/from16 v7, v16

    const v16, -0x2067c02c

    goto/16 :goto_a

    :sswitch_d
    move/from16 v19, v4

    move-object/from16 v16, v7

    .line 18
    aget-short v2, v17, v1

    sget v0, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v0, :cond_a

    :goto_5
    const-string v0, "\u0733\u05ab"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x52bf

    const v7, 0xa7d0f66

    xor-int/2addr v4, v7

    const v7, -0x150ae936

    move-object/from16 v7, v16

    const v16, -0x150ae936

    goto/16 :goto_a

    :cond_a
    const-string v0, "\u1a7a\u1a76"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x2e9f

    const v7, 0x379c4f10

    xor-int/2addr v4, v7

    const v7, 0x23e37527

    move-object/from16 v7, v16

    const v16, 0x23e37527

    goto/16 :goto_a

    :sswitch_e
    move/from16 v19, v4

    move-object/from16 v16, v7

    add-int/lit16 v3, v2, 0x35f7

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result v0

    if-ltz v0, :cond_b

    goto/16 :goto_4

    :cond_b
    const-string v0, "\u06e2\u1a7b"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x49

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0x480d

    const v7, 0x2940da5

    xor-int/2addr v4, v7

    const v7, 0x6bedb015

    move-object/from16 v7, v16

    const v16, 0x6bedb015

    goto/16 :goto_a

    :sswitch_f
    move/from16 v19, v4

    move-object/from16 v16, v7

    .line 16
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    goto :goto_9

    .line 19
    :sswitch_10
    invoke-static {v10, v11, v12, v6}, Ll/֡֡;->ۨܶ᩷([SIII)Ljava/lang/String;

    move-result-object v0

    .line 20
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/֨᩵᩺;->ܰ:Ljava/util/regex/Pattern;

    return-void

    :sswitch_11
    move/from16 v19, v4

    move-object/from16 v16, v7

    .line 19
    sget-object v10, Ll/֨᩵᩺;->ۨ۫ۡ:[S

    .line 17
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v0

    if-eqz v0, :cond_c

    const/16 v0, 0x33

    move/from16 v4, v19

    const/16 v11, 0x33

    :goto_6
    const-string v0, "\u06dc\u06eb"

    .line 0
    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x37

    xor-int v7, v0, v15

    mul-int/lit16 v7, v7, -0x75bf

    const v19, -0x62e2b8ce

    xor-int v7, v7, v19

    const v19, 0xc312cb2

    xor-int v0, v0, v19

    move-object/from16 v20, v16

    move/from16 v16, v0

    move v0, v7

    move-object/from16 v7, v20

    goto/16 :goto_0

    :cond_c
    const-string v0, "\u073a\u1a75"

    .line 17
    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x12d5

    const v7, -0x75359d6e

    xor-int/2addr v4, v7

    const v7, 0x4d45e96f    # 2.0752562E8f

    xor-int/2addr v0, v7

    const/16 v11, 0x33

    :goto_7
    move-object/from16 v7, v16

    move/from16 v16, v0

    :goto_8
    move v0, v4

    move/from16 v4, v19

    goto/16 :goto_0

    :goto_9
    const-string v0, "\u06dc\u073f"

    .line 4
    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x2d

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0xb83

    const v7, 0x53a68f84

    xor-int/2addr v4, v7

    const v7, 0x5f00bec2

    move-object/from16 v7, v16

    const v16, 0x5f00bec2

    :goto_a
    xor-int v16, v0, v16

    goto :goto_8

    :cond_d
    const-string v0, "\u1a79\u073d"

    .line 20
    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x31

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x1919

    const v7, -0xc7705a0

    xor-int/2addr v4, v7

    const v7, 0x5371b2a6

    xor-int/2addr v0, v7

    const/16 v12, 0xd

    goto :goto_7

    :sswitch_data_0
    .sparse-switch
        -0x75e734f4 -> :sswitch_11
        -0x5c3888c4 -> :sswitch_11
        -0x52dc73d3 -> :sswitch_10
        -0x4f36b02f -> :sswitch_f
        -0x4b65297c -> :sswitch_e
        -0x46fa8892 -> :sswitch_d
        -0x3e5777ea -> :sswitch_c
        -0x326c97b0 -> :sswitch_b
        -0x2e92a6b5 -> :sswitch_a
        -0x2be9fad8 -> :sswitch_c
        -0x2861ed74 -> :sswitch_9
        -0x263adf9e -> :sswitch_9
        -0x2325b057 -> :sswitch_8
        -0x20ac6de2 -> :sswitch_7
        -0x970d1f6 -> :sswitch_e
        0x7263987 -> :sswitch_7
        0xf0cc075 -> :sswitch_6
        0x12afac09 -> :sswitch_5
        0x18c7bb28 -> :sswitch_6
        0x2e4f726a -> :sswitch_4
        0x31589847 -> :sswitch_3
        0x31acafc4 -> :sswitch_3
        0x4214f3c8 -> :sswitch_4
        0x4d8ce9a6 -> :sswitch_2
        0x4f3bf660 -> :sswitch_5
        0x505f2c30 -> :sswitch_1
        0x5c3fbf32 -> :sswitch_a
        0x5f86be31 -> :sswitch_1
        0x64dab9f8 -> :sswitch_0
        0x655a2d37 -> :sswitch_10
        0x67f53ab6 -> :sswitch_0
        0x6a1d5b8d -> :sswitch_b
        0x6bfad4df -> :sswitch_2
        0x70fa6d35 -> :sswitch_8
        0x780dfc53 -> :sswitch_d
        0x7d8f1e8d -> :sswitch_f
    .end sparse-switch

    :array_0
    .array-data 2
        0x7b6s
        -0x5b9es
        -0x5b99s
        -0x5ba3s
        -0x5befs
        -0x5bbas
        -0x5b83s
        -0x5befs
        -0x5b9as
        -0x5bf4s
        -0x5befs
        -0x5bfbs
        -0x5b9ds
        -0x5bees
        -0x5ba0s
        -0x5befs
        -0x5b9fs
        -0x5be9s
        -0x5b84s
        -0x5b99s
        -0x5ba3s
        -0x5befs
        -0x5bbas
        -0x5b83s
        -0x5befs
        -0x5b9as
        -0x5bf4s
        -0x5befs
        -0x5bfbs
        -0x5b9ds
        -0x5bees
        -0x5ba0s
        -0x5befs
        -0x5b9fs
        -0x5be9s
        -0x5ba0s
        -0x5bees
        -0x5b99s
        -0x5ba3s
        -0x5befs
        -0x5bbas
        -0x5b83s
        -0x5befs
        -0x5b9as
        -0x5b9fs
        -0x5bb9s
        -0x5bf2s
        -0x5bf0s
        -0x5bf6s
        -0x5bbfs
        -0x5be8s
        -0x5b9es
        -0x5bf3s
        -0x5b99s
        -0x5bf1s
        -0x5befs
        -0x5bfbs
        -0x5b9fs
        -0x5ba0s
        -0x5ba8s
        -0x5bb9s
        -0x5bfbs
        -0x5bbfs
        -0x5be8s
    .end array-data
.end method

.method public static ۖ(Ljava/lang/String;)Z
    .locals 13

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, -0x66eb43ec

    sget v8, Ll/֡ܳ;->֡۠ۧ:I

    sget v9, Ll/֨ۢ;->ۢ۬ۧ:I

    const-string v10, "\u0730\u05a8"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x21d

    const v12, 0x38b5f6b1

    xor-int/2addr v11, v12

    const v12, -0x737c9ae9

    :goto_0
    xor-int/2addr v10, v12

    :goto_1
    xor-int/2addr v7, v9

    mul-int/lit16 v7, v7, -0xb7d

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    const/16 v10, 0x30

    if-lt v6, v10, :cond_3

    const-string v10, "\u06db\u0730"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x7f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x1b0f

    const v12, 0x3c25ed51

    xor-int/2addr v11, v12

    const v12, -0x7add4ec6

    goto :goto_0

    .line 4
    :sswitch_0
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    sget v10, Ll/֫;->ܶܺ᩻:I

    if-ltz v10, :cond_d

    goto/16 :goto_9

    .line 22
    :sswitch_1
    sget v10, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-lez v10, :cond_10

    goto :goto_2

    :sswitch_2
    sget v10, Ll/ۘۗ;->ۖۧ۬:I

    if-gez v10, :cond_0

    goto :goto_2

    :cond_0
    const-string v10, "\u06da\u05a8"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x3f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x79c5

    const v12, 0x44cdd26e

    xor-int/2addr v11, v12

    const v12, 0xbef7911

    goto :goto_0

    :sswitch_3
    sget v10, Ll/ۗ;->֨۬ۖ:I

    if-gez v10, :cond_1

    goto/16 :goto_b

    :cond_1
    const-string v10, "\u06eb\u073a"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x5625

    const v12, -0x4d23b469

    xor-int/2addr v11, v12

    const v12, -0x6606153a

    goto :goto_0

    .line 21
    :sswitch_4
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v10

    if-nez v10, :cond_2

    goto/16 :goto_b

    :cond_2
    :goto_2
    const-string v10, "\u1a75\u0733"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x6321

    const v12, -0x55404ff

    xor-int/2addr v11, v12

    const v12, 0x6802cb5

    goto/16 :goto_0

    :sswitch_5
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v10

    if-eqz v10, :cond_12

    goto/16 :goto_b

    .line 22
    :sswitch_6
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    goto/16 :goto_b

    .line 7
    :sswitch_7
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    const/4 p0, 0x0

    return p0

    :sswitch_8
    return v2

    :sswitch_9
    const/16 v10, 0x39

    if-le v6, v10, :cond_4

    goto :goto_3

    :sswitch_a
    const/16 v10, 0x5f

    if-eq v6, v10, :cond_4

    const-string v10, "\u06e0\u1a75"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x1b

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x6027

    const v12, 0x21b3c4a1

    xor-int/2addr v11, v12

    const v12, -0x3cffcd9d

    goto/16 :goto_0

    :sswitch_b
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_6

    :sswitch_c
    const/16 v10, 0x5a

    if-le v6, v10, :cond_4

    goto :goto_4

    :cond_3
    :goto_3
    const-string v10, "\u05a8\u1a73"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x403d

    const v12, -0x71a38e00

    xor-int/2addr v11, v12

    const v12, -0x535040d9

    goto/16 :goto_0

    :sswitch_d
    const/16 v10, 0x7a

    if-le v6, v10, :cond_4

    goto :goto_5

    :cond_4
    const-string v10, "\u06ec\u1a76"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x3

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x510d

    const v12, 0x2eb594c0

    xor-int/2addr v11, v12

    const v12, 0x535ee046

    goto/16 :goto_0

    :sswitch_e
    const/16 v10, 0x41

    if-lt v6, v10, :cond_5

    const-string v10, "\u06ec\u1a75"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x69

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x78df

    const v12, -0x6cc71d01

    xor-int/2addr v11, v12

    const v12, -0x2dd6a2c2

    goto/16 :goto_0

    :cond_5
    :goto_4
    const-string v10, "\u06e1\u05a1"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x7919

    const v12, 0x369e319a

    xor-int/2addr v11, v12

    const v12, -0xf8aa35

    goto/16 :goto_0

    .line 33
    :sswitch_f
    aget-char v6, v3, v5

    const/16 v10, 0x61

    if-lt v6, v10, :cond_6

    const-string v10, "\u05a8\u05a8"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x5cd1

    const v12, -0x449c4573

    xor-int/2addr v11, v12

    const v12, 0x52c1f33

    goto/16 :goto_0

    :cond_6
    :goto_5
    const-string v10, "\u05ab\u06ec"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x5bf9

    const v12, 0x5ffe7d9b

    xor-int/2addr v11, v12

    const v12, 0x2316f249

    goto/16 :goto_0

    :sswitch_10
    const/4 p0, 0x1

    return p0

    :sswitch_11
    if-ge v5, v4, :cond_7

    const-string v10, "\u0730\u06e0"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x1f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x655d

    const v12, 0x448f4066

    xor-int/2addr v11, v12

    const v12, 0x455b5ca6

    goto/16 :goto_0

    :cond_7
    const-string v10, "\u06d8\u06d8"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, -0x4f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x52d5

    const v12, 0x460b88d1

    xor-int/2addr v11, v12

    const v12, -0x28f53b8    # -1.9994328E37f

    goto/16 :goto_0

    :sswitch_12
    return v2

    :sswitch_13
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_6
    const-string v10, "\u06dc\u06e7"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x39

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x7289

    const v12, -0x231157

    xor-int/2addr v11, v12

    const v12, -0x4a1b96fc

    goto/16 :goto_0

    .line 27
    :sswitch_14
    invoke-static {v0, v1, p0}, Ll/֨᩵᩺;->ۙ(IILjava/lang/String;)Z

    move-result v2

    const/4 v10, 0x0

    if-nez v2, :cond_8

    const-string v2, "\u06db\u06db"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v9

    xor-int v11, v2, v8

    mul-int/lit16 v11, v11, 0x1ecf

    const v12, -0x6d2903f6

    xor-int/2addr v11, v12

    const v12, 0x32b91b5b

    goto :goto_7

    :cond_8
    const-string v2, "\u06e4\u06e1"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v8

    xor-int v11, v2, v9

    mul-int/lit16 v11, v11, 0x11b5

    const v12, -0x1c87275

    xor-int/2addr v11, v12

    const v12, 0x3727e87c    # 1.0008105E-5f

    :goto_7
    xor-int/2addr v2, v12

    move v10, v2

    const/4 v2, 0x0

    goto/16 :goto_1

    :sswitch_15
    const/16 v1, 0x18

    .line 14
    sget v10, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v10, :cond_9

    const-string v10, "\u1a7b\u073a"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x4d

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x2d91

    const v12, 0x77de924a

    xor-int/2addr v11, v12

    const v12, -0x48e53fa2

    goto/16 :goto_0

    :cond_9
    const-string v10, "\u06db\u1a77"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x7d

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x14b5

    const v12, -0x4c6faa59

    xor-int/2addr v11, v12

    const v12, -0x2bc25c9a

    goto/16 :goto_0

    :sswitch_16
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    move-result v10

    if-eqz v10, :cond_a

    goto :goto_8

    :cond_a
    const-string v10, "\u06df\u05ab"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x79

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x7d5d

    const v12, 0x6b5005af

    xor-int/2addr v11, v12

    const v12, -0x3b4df8ec

    goto/16 :goto_0

    :sswitch_17
    sget-boolean v10, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v10, :cond_b

    goto :goto_8

    :cond_b
    const-string v10, "\u1a76\u0730"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x45

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x2d3b

    const v12, -0x551a7563

    xor-int/2addr v11, v12

    const v12, -0x4d81cecd

    goto/16 :goto_0

    :sswitch_18
    sget-boolean v10, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v10, :cond_c

    goto/16 :goto_a

    :cond_c
    const-string v10, "\u06e0\u073a"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x3

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x2cf7

    const v12, -0x5d6eb37a

    xor-int/2addr v11, v12

    const v12, 0x3bc9d228

    goto/16 :goto_0

    .line 25
    :sswitch_19
    sget v10, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v10, :cond_e

    :cond_d
    :goto_8
    const-string v10, "\u06e7\u1a7a"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x61

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x413

    const v12, 0x48fa3782

    xor-int/2addr v11, v12

    const v12, 0x31dafee9

    goto/16 :goto_0

    :cond_e
    const-string v10, "\u06d7\u06e0"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x6203

    const v12, -0x747ff122

    xor-int/2addr v11, v12

    const v12, 0x33f14c52

    goto/16 :goto_0

    :sswitch_1a
    sget-boolean v10, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v10, :cond_f

    goto :goto_9

    :cond_f
    const-string v10, "\u1a75\u05a1"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x45

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x6953

    const v12, 0x2190dcf0

    xor-int/2addr v11, v12

    const v12, 0x650603d1

    goto/16 :goto_0

    .line 9
    :sswitch_1b
    sget v10, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v10, :cond_11

    :cond_10
    :goto_9
    const-string v10, "\u06e0\u0736"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x1c23

    const v12, 0x67b04608

    xor-int/2addr v11, v12

    const v12, -0x5853d0a6

    goto/16 :goto_0

    :cond_11
    const-string v10, "\u06e4\u0736"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x6dc1

    const v12, 0x35c5e848

    xor-int/2addr v11, v12

    const v12, -0x6dceb2a9

    goto/16 :goto_0

    .line 8
    :sswitch_1c
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v10

    if-gtz v10, :cond_13

    :cond_12
    :goto_a
    const-string v10, "\u1a78\u1a77"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x5f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x3fcb

    const v12, -0x40085379

    xor-int/2addr v11, v12

    const v12, 0x175cdb18

    goto/16 :goto_0

    :cond_13
    const-string v10, "\u0730\u06df"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x7b

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x79db

    const v12, 0xe9161b6

    xor-int/2addr v11, v12

    const v12, 0x206709a0

    goto/16 :goto_0

    .line 9
    :sswitch_1d
    sget-boolean v10, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v10, :cond_14

    goto :goto_b

    :cond_14
    const-string v10, "\u06d9\u06eb"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x55

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x3f5d

    const v12, -0x421ab6f5

    xor-int/2addr v11, v12

    const v12, -0x5bc4f10d

    goto/16 :goto_0

    :sswitch_1e
    const/4 v0, 0x4

    .line 25
    sget-boolean v10, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v10, :cond_15

    :goto_b
    const-string v10, "\u1a75\u1a78"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x5f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x7b5

    const v12, -0x66e84195

    xor-int/2addr v11, v12

    const v12, 0x2c799025

    goto/16 :goto_0

    :cond_15
    const-string v10, "\u1a7b\u06eb"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x13

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x5669

    const v12, 0x551d3135

    xor-int/2addr v11, v12

    const v12, -0x12dff6d3

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7dd47030 -> :sswitch_c
        -0x7b1bb5c5 -> :sswitch_1c
        -0x75bc50ec -> :sswitch_15
        -0x70c6e8e7 -> :sswitch_d
        -0x6eafc1fb -> :sswitch_8
        -0x6dcce090 -> :sswitch_c
        -0x6acd6a79 -> :sswitch_f
        -0x650fccd8 -> :sswitch_6
        -0x621d7f7a -> :sswitch_1d
        -0x5e2abe37 -> :sswitch_7
        -0x57bb5372 -> :sswitch_1b
        -0x5381b7b1 -> :sswitch_1d
        -0x47ad99af -> :sswitch_17
        -0x42199cdb -> :sswitch_2
        -0x347ee6e2 -> :sswitch_10
        -0x34435e27 -> :sswitch_b
        -0x32ee905f -> :sswitch_17
        -0x30ddbc9e -> :sswitch_9
        -0x2da27e90 -> :sswitch_1
        -0x2b1ec9b8 -> :sswitch_1e
        -0x2a62a104 -> :sswitch_d
        -0x23a2c13a -> :sswitch_0
        -0x221220e9 -> :sswitch_1
        -0x214651cd -> :sswitch_b
        -0x1df7cb0c -> :sswitch_12
        -0x1d4fbb1b -> :sswitch_8
        -0x1cbf9d8c -> :sswitch_18
        -0x1a385545 -> :sswitch_5
        -0x109be15a -> :sswitch_1c
        -0xdb03506 -> :sswitch_16
        -0xd97c042 -> :sswitch_9
        -0xc7ce067 -> :sswitch_14
        -0xb323e35 -> :sswitch_a
        -0x8833adb -> :sswitch_7
        -0xf329c7 -> :sswitch_f
        -0x31bbd5 -> :sswitch_2
        0x661199c -> :sswitch_a
        0xc32be57 -> :sswitch_18
        0x1bcfc0a6 -> :sswitch_11
        0x1dae8acb -> :sswitch_0
        0x1e268d06 -> :sswitch_12
        0x26553272 -> :sswitch_4
        0x2c3f0b16 -> :sswitch_19
        0x34903ae4 -> :sswitch_3
        0x34e22449 -> :sswitch_1e
        0x351331b8 -> :sswitch_1a
        0x4280654a -> :sswitch_1a
        0x4948c3a6 -> :sswitch_4
        0x49800d50 -> :sswitch_19
        0x4ad00955 -> :sswitch_e
        0x4b0aa943 -> :sswitch_1b
        0x4ef08128 -> :sswitch_3
        0x5a4ab7f4 -> :sswitch_13
        0x5ee1a0cc -> :sswitch_5
        0x60361637 -> :sswitch_15
        0x609d7c2e -> :sswitch_14
        0x6429a557 -> :sswitch_10
        0x65da58a4 -> :sswitch_11
        0x6712d0bd -> :sswitch_16
        0x6f458326 -> :sswitch_13
        0x710b8f92 -> :sswitch_6
        0x7b74f3cf -> :sswitch_e
    .end sparse-switch
.end method

.method public static ۙ(IILjava/lang/String;)Z
    .locals 7

    const/4 v0, 0x0

    const v1, 0x231e7974

    sget v2, Ll/ۗ۬;->ۤᩴ᩻:I

    sget v3, Ll/ۖۧ;->ܺۚۖ:I

    const-string v4, "\u1a75\u1a75"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2fdb

    const v6, 0x4125bfc6

    xor-int/2addr v5, v6

    const v6, -0x3a097841

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x60dd

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 7
    sget v4, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v4, :cond_a

    goto/16 :goto_2

    :sswitch_0
    sget-boolean v4, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v4, :cond_c

    goto/16 :goto_3

    :sswitch_1
    sget v4, Ll/֫ܽ;->֡ᩴܶ:I

    if-gez v4, :cond_7

    goto/16 :goto_1

    .line 33
    :sswitch_2
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    sget v4, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v4, :cond_4

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    const/4 p0, 0x0

    return p0

    :sswitch_5
    const/4 p0, 0x1

    return p0

    :sswitch_6
    if-gt v0, p1, :cond_0

    const-string v4, "\u06e0\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x37

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2afb

    const v6, -0x24cd7a7b

    xor-int/2addr v5, v6

    const v6, -0x52d96b5f

    goto :goto_0

    :sswitch_7
    const/4 p0, 0x0

    return p0

    .line 69
    :sswitch_8
    invoke-static {p2}, Ll/֫ᩳ;->ܶ᩷᩺(Ljava/lang/Object;)I

    move-result v0

    if-gt p0, v0, :cond_0

    const-string v4, "\u06df\u1a78"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x67

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xc57

    const v6, -0x13e132e

    xor-int/2addr v5, v6

    const v6, -0xf3eedf8

    goto :goto_0

    :sswitch_9
    if-nez p2, :cond_1

    :cond_0
    const-string v4, "\u0736\u06d8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x1d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x437f

    const v6, 0x2a40fa94

    xor-int/2addr v5, v6

    const v6, 0x350079e0

    goto/16 :goto_0

    :cond_1
    const-string v4, "\u1a7a\u05a1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2cb

    const v6, -0x397d8e01

    xor-int/2addr v5, v6

    const v6, -0x344640c9    # -2.4346222E7f

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "\u073d\u06ec"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x9

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x21af

    const v6, -0x2984b5cd

    xor-int/2addr v5, v6

    const v6, 0x6dac8c58

    goto/16 :goto_0

    .line 21
    :sswitch_b
    sget-boolean v4, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v4, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v4, "\u073f\u1a74"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x49

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x205d

    const v6, -0x2ceca7d3

    xor-int/2addr v5, v6

    const v6, 0x19604cd9

    goto/16 :goto_0

    .line 2
    :sswitch_c
    sget v4, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v4, :cond_5

    :cond_4
    :goto_1
    const-string v4, "\u0733\u05a1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x21

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xdad

    const v6, 0x714da68

    xor-int/2addr v5, v6

    const v6, 0x7949ebd7

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u0733\u1a74"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x1d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5f6f

    const v6, 0x5152f39

    xor-int/2addr v5, v6

    const v6, 0x2b7718f6

    goto/16 :goto_0

    .line 40
    :sswitch_d
    sget v4, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v4, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v4, "\u06dc\u1a77"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x41

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x48b

    const v6, -0x1802db85

    xor-int/2addr v5, v6

    const v6, 0x4632beb4

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v4, :cond_8

    :cond_7
    const-string v4, "\u073a\u1a77"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x2b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1f49

    const v6, -0x3f6ff287

    xor-int/2addr v5, v6

    const v6, 0xb2694d4

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e7\u073f"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x33

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1641

    const v6, -0x1b3b42b3

    xor-int/2addr v5, v6

    const v6, 0x3bc676ea

    goto/16 :goto_0

    .line 49
    :sswitch_f
    sget v4, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v4, :cond_9

    goto :goto_2

    :cond_9
    const-string v4, "\u1a78\u0730"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x76e1

    const v6, -0x67b4eef0

    xor-int/2addr v5, v6

    const v6, 0x47efd1c0    # 122787.5f

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a7b\u1a7b"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xd5f

    const v6, -0x69688450

    xor-int/2addr v5, v6

    const v6, -0x6084e857

    goto/16 :goto_0

    .line 23
    :sswitch_10
    sget-boolean v4, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v4, :cond_b

    :goto_2
    const-string v4, "\u073d\u0736"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5e79

    const v6, -0x384554d4

    xor-int/2addr v5, v6

    const v6, 0x1628f4cd

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u1a7a\u06e8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x59

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x137f

    const v6, 0x37e96ad

    xor-int/2addr v5, v6

    const v6, -0x6ac2b318

    goto/16 :goto_0

    :sswitch_11
    sget v4, Ll/֫;->ܶܺ᩻:I

    if-ltz v4, :cond_d

    :cond_c
    const-string v4, "\u073a\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x61

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5e55

    const v6, -0x433e8726

    xor-int/2addr v5, v6

    const v6, 0x30264b6f

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u0730\u06d6"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x23

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4931

    const v6, -0x4cf11183

    xor-int/2addr v5, v6

    const v6, 0x5fa4bb12

    goto/16 :goto_0

    .line 16
    :sswitch_12
    sget v4, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v4, :cond_e

    :goto_3
    const-string v4, "\u073f\u06e2"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2b49

    const v6, -0x72caabd2

    xor-int/2addr v5, v6

    const v6, 0x1acfff99

    goto/16 :goto_0

    :cond_e
    const-string v4, "\u06d9\u06e8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x5d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5505

    const v6, 0x649c8cd5

    xor-int/2addr v5, v6

    const v6, 0x4b32e959    # 1.1725145E7f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x72b880ad -> :sswitch_3
        -0x708e4d20 -> :sswitch_e
        -0x63e26f31 -> :sswitch_9
        -0x625e39ac -> :sswitch_d
        -0x5e932ad2 -> :sswitch_5
        -0x5daeffdf -> :sswitch_b
        -0x4de5907e -> :sswitch_1
        -0x4a3b300f -> :sswitch_12
        -0x47915a22 -> :sswitch_3
        -0x44747c42 -> :sswitch_8
        -0x351e3694 -> :sswitch_c
        -0x308e46d6 -> :sswitch_a
        -0x21406b36 -> :sswitch_12
        -0x1a6729b0 -> :sswitch_d
        -0x1a6265ef -> :sswitch_10
        -0x19110031 -> :sswitch_e
        -0x10b6a1d9 -> :sswitch_f
        -0xfcf2b15 -> :sswitch_a
        0x58d23a -> :sswitch_2
        0x2919f43 -> :sswitch_2
        0x856f735 -> :sswitch_7
        0x1623a688 -> :sswitch_b
        0x2c679de5 -> :sswitch_6
        0x3a9ed981 -> :sswitch_c
        0x3abcc6f5 -> :sswitch_5
        0x3c8ac26b -> :sswitch_8
        0x4775225d -> :sswitch_6
        0x4d5d773b -> :sswitch_11
        0x54ce9056 -> :sswitch_0
        0x5c8d2941 -> :sswitch_10
        0x5d120be4 -> :sswitch_7
        0x661915ba -> :sswitch_0
        0x6afe1ef4 -> :sswitch_4
        0x6c7f3bb0 -> :sswitch_f
        0x74f6861c -> :sswitch_9
        0x76d2322e -> :sswitch_11
        0x78e18646 -> :sswitch_1
        0x79c5c50c -> :sswitch_4
    .end sparse-switch
.end method

.method public static ۙ(Ljava/lang/String;)Z
    .locals 7

    const/4 v0, 0x0

    const v1, -0x3d1dfd3d

    sget v2, Ll/ۗ۬;->ۤᩴ᩻:I

    sget v3, Ll/֨ܶ;->ۛۛۛ:I

    const-string v4, "\u073d\u073f"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2429

    const v6, -0x7fec46cc

    xor-int/2addr v5, v6

    const v6, -0x106cfe44

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x3859

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget-boolean v4, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v4, :cond_3

    goto/16 :goto_1

    :sswitch_0
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v4

    if-ltz v4, :cond_5

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    sget v4, Ll/֡᩶;->ۗ֨ܺ:I

    if-lez v4, :cond_8

    goto/16 :goto_3

    :sswitch_2
    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v4, :cond_c

    goto/16 :goto_3

    .line 46
    :sswitch_3
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    goto/16 :goto_3

    .line 7
    :sswitch_4
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    const/4 p0, 0x0

    return p0

    :sswitch_5
    const/4 p0, 0x0

    return p0

    .line 57
    :sswitch_6
    sget-object v0, Ll/֨᩵᩺;->ۨ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result p0

    return p0

    :sswitch_7
    const/16 v4, 0x20

    .line 55
    invoke-static {v0, v4, p0}, Ll/֨᩵᩺;->ۙ(IILjava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v4, "\u1a75\u05a8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x39

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6245

    const v6, 0x1372b4b6

    xor-int/2addr v5, v6

    const v6, -0x49f1b57

    goto :goto_0

    :cond_0
    const-string v4, "\u05ab\u1a75"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x654f

    const v6, -0x7d680e9e

    xor-int/2addr v5, v6

    const v6, -0x4a3e0748

    goto :goto_0

    :sswitch_8
    sget v4, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v4, "\u1a73\u06e0"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x79

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x55e3

    const v6, 0x494290c4    # 796940.25f

    xor-int/2addr v5, v6

    const v6, 0x703e8415

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v4, :cond_2

    goto :goto_1

    :cond_2
    const-string v4, "\u073a\u06ec"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x15

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6b73

    const v6, -0x55b59bf0

    xor-int/2addr v5, v6

    const v6, 0x6feb1294

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06e8\u0730"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x68d3

    const v6, 0x73739ff8

    xor-int/2addr v5, v6

    const v6, -0x7606fba5

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v4, :cond_4

    :goto_1
    const-string v4, "\u073d\u06e1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x480f

    const v6, 0x2460e03d

    xor-int/2addr v5, v6

    const v6, 0x707c658d

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u05a8\u06e1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x429b

    const v6, -0x4cd408e8

    xor-int/2addr v5, v6

    const v6, 0x4e6ade77    # 9.85112E8f

    goto/16 :goto_0

    .line 6
    :sswitch_b
    sget v4, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v4, :cond_6

    :cond_5
    const-string v4, "\u06eb\u06d7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1dcb

    const v6, 0xc7142d7

    xor-int/2addr v5, v6

    const v6, -0x74af5b50

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06d9\u06d8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1883

    const v6, 0x25f82767

    xor-int/2addr v5, v6

    const v6, 0x3eb16ebb

    goto/16 :goto_0

    .line 25
    :sswitch_c
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_2

    :cond_7
    const-string v4, "\u05a1\u1a76"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x2f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6b3d

    const v6, -0x3994cf6e

    xor-int/2addr v5, v6

    const v6, 0x5552940d

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v4

    if-nez v4, :cond_9

    :cond_8
    :goto_2
    const-string v4, "\u06d7\u06e0"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x53

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x32ad

    const v6, -0xd5baf44

    xor-int/2addr v5, v6

    const v6, 0x465750b4

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06ec\u1a75"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0xb

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x787b

    const v6, -0x24526a3a

    xor-int/2addr v5, v6

    const v6, 0x28732030

    goto/16 :goto_0

    .line 7
    :sswitch_e
    sget v4, Ll/֫;->ܶܺ᩻:I

    if-ltz v4, :cond_a

    goto :goto_3

    :cond_a
    const-string v4, "\u06e2\u0730"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x2b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5b67

    const v6, 0x38b3762d

    xor-int/2addr v5, v6

    const v6, -0x7ec96125

    goto/16 :goto_0

    .line 52
    :sswitch_f
    sget v4, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v4, :cond_b

    :goto_3
    const-string v4, "\u06df\u05ab"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6f0d

    const v6, -0x262e0573

    xor-int/2addr v5, v6

    const v6, -0x1a6b5666

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u073a\u05ab"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x59

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4fb7

    const v6, 0x1bc6d2b3

    xor-int/2addr v5, v6

    const v6, 0x484c436e

    goto/16 :goto_0

    :sswitch_10
    const/4 v0, 0x6

    .line 55
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v4

    if-ltz v4, :cond_d

    :cond_c
    const-string v4, "\u1a74\u1a74"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x33c3

    const v6, -0x4e13a7a

    xor-int/2addr v5, v6

    const v6, -0x3786ac19

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06da\u1a79"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2685

    const v6, -0xcf95436

    xor-int/2addr v5, v6

    const v6, -0x61794294

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x75fdf8c8 -> :sswitch_d
        -0x71f4fdc6 -> :sswitch_b
        -0x70e68195 -> :sswitch_d
        -0x6ac4bd0c -> :sswitch_5
        -0x6a2d36f9 -> :sswitch_4
        -0x5a0b254b -> :sswitch_8
        -0x4db6ce88 -> :sswitch_e
        -0x3810948b -> :sswitch_f
        -0x20f034e4 -> :sswitch_2
        -0x16a07cad -> :sswitch_2
        -0x1406d547 -> :sswitch_a
        -0x11861c96 -> :sswitch_9
        -0x113f167e -> :sswitch_f
        -0x66cea55 -> :sswitch_6
        -0x5737b78 -> :sswitch_c
        0x3a38f8 -> :sswitch_0
        0x3441aa8 -> :sswitch_4
        0x41ab9fb -> :sswitch_5
        0x113885f4 -> :sswitch_7
        0x14c32725 -> :sswitch_6
        0x25907c6f -> :sswitch_b
        0x28fbcca4 -> :sswitch_9
        0x29f254c4 -> :sswitch_3
        0x2a526c4b -> :sswitch_1
        0x2f6928a1 -> :sswitch_10
        0x4e91f3a9 -> :sswitch_10
        0x4ef70f95 -> :sswitch_a
        0x532c0b9b -> :sswitch_0
        0x68b7ff2a -> :sswitch_e
        0x697808d0 -> :sswitch_3
        0x69b1f4bf -> :sswitch_7
        0x6a497d3b -> :sswitch_8
        0x6b9b394e -> :sswitch_1
        0x7b3df485 -> :sswitch_c
    .end sparse-switch
.end method

.method public static ۚ(Ljava/lang/String;)Z
    .locals 7

    const/4 v0, 0x0

    const v1, -0x37eba153

    sget v2, Ll/֫᩺;->᩺۟ۘ:I

    sget v3, Ll/ۖۧ;->ܺۚۖ:I

    const-string v4, "\u05a8\u0733"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x43

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7ff9

    const v6, -0x318a1404

    xor-int/2addr v5, v6

    const v6, 0x57c71718

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x2797

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    const/4 p0, 0x0

    return p0

    .line 50
    :sswitch_0
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    sget-boolean v4, Ll/֨᩸;->ۚۢۧ:Z

    if-eqz v4, :cond_b

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v4, "\u073a\u05a1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x9

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5767

    const v6, 0x255ad7d6

    xor-int/2addr v5, v6

    const v6, 0x3ad20baa

    goto :goto_0

    .line 1
    :sswitch_2
    sget v4, Ll/֨ۧ;->֫۠֡:I

    if-lez v4, :cond_9

    goto/16 :goto_2

    .line 42
    :sswitch_3
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    const/4 p0, 0x0

    return p0

    .line 63
    :sswitch_5
    sget-object v0, Ll/֨᩵᩺;->ܰ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result p0

    return p0

    :sswitch_6
    const/16 v4, 0x18

    .line 61
    invoke-static {v0, v4, p0}, Ll/֨᩵᩺;->ۙ(IILjava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "\u06e8\u0730"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x73

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2b39

    const v6, 0x179527d8

    xor-int/2addr v5, v6

    const v6, -0x4bdc2a34

    goto :goto_0

    :cond_1
    const-string v4, "\u1a7a\u1a76"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x21

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4d9

    const v6, -0x5642c539

    xor-int/2addr v5, v6

    const v6, -0x48c8dc43

    goto/16 :goto_0

    .line 25
    :sswitch_7
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v4

    if-gtz v4, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v4, "\u073a\u06da"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xa1d

    const v6, -0x29e1b48d

    xor-int/2addr v5, v6

    const v6, -0x579d144f

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u06ec\u06db"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x79

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x40fb

    const v6, -0x3b3009d6

    xor-int/2addr v5, v6

    const v6, 0x7c4ba06f

    goto/16 :goto_0

    .line 52
    :sswitch_9
    sget v4, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u1a76\u06ec"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x5b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x16af

    const v6, -0x3926af45

    xor-int/2addr v5, v6

    const v6, 0x317af8c

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/֫;->ܶܺ᩻:I

    if-ltz v4, :cond_5

    goto :goto_2

    :cond_5
    const-string v4, "\u06dc\u1a7b"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x290b

    const v6, -0x2d988fae

    xor-int/2addr v5, v6

    const v6, 0x71807f6b

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u1a77\u1a77"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1e4d

    const v6, -0x71a522a2

    xor-int/2addr v5, v6

    const v6, 0x477a7e92

    goto/16 :goto_0

    .line 43
    :sswitch_c
    sget v4, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v4, :cond_7

    :goto_2
    const-string v4, "\u06d6\u06ec"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7fa1

    const v6, -0x24b18448

    xor-int/2addr v5, v6

    const v6, -0x5c905a37

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u1a74\u06d8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x25

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x23d

    const v6, -0x1fa7649e

    xor-int/2addr v5, v6

    const v6, -0x8181a73

    goto/16 :goto_0

    .line 36
    :sswitch_d
    sget v4, Ll/ۗ;->֨۬ۖ:I

    if-ltz v4, :cond_8

    goto :goto_4

    :cond_8
    const-string v4, "\u0733\u05a1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5283

    const v6, -0x12949024

    xor-int/2addr v5, v6

    const v6, -0x44deeed3

    goto/16 :goto_0

    .line 7
    :sswitch_e
    sget v4, Ll/֫;->ܶܺ᩻:I

    if-ltz v4, :cond_a

    :cond_9
    :goto_3
    const-string v4, "\u073a\u06eb"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x41

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x187d

    const v6, 0x4e7736dd

    xor-int/2addr v5, v6

    const v6, -0x8cdb31e

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06da\u073d"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x37bd

    const v6, -0x2b9d4359

    xor-int/2addr v5, v6

    const v6, 0x23960248

    goto/16 :goto_0

    :sswitch_f
    sget v4, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u1a76\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x42b

    const v6, 0x156eedf1

    xor-int/2addr v5, v6

    const v6, 0x6f3298d8

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u073a\u1a75"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0xf

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1d9f

    const v6, -0x2a54eea4

    xor-int/2addr v5, v6

    const v6, -0x25f40baa

    goto/16 :goto_0

    :sswitch_10
    const/4 v0, 0x4

    .line 58
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v4

    if-eqz v4, :cond_d

    :goto_5
    const-string v4, "\u06e0\u1a7b"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5155

    const v6, 0x1def960d

    xor-int/2addr v5, v6

    const v6, -0x3197b786

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06da\u06e7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x63

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7783

    const v6, 0x42883800    # 68.109375f

    xor-int/2addr v5, v6

    const v6, 0x6bf96c36

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x77a37aff -> :sswitch_e
        -0x7570195a -> :sswitch_a
        -0x6bacc674 -> :sswitch_f
        -0x626e429d -> :sswitch_7
        -0x5b5885bf -> :sswitch_4
        -0x54bd1e30 -> :sswitch_b
        -0x41a65ef1 -> :sswitch_0
        -0x34ef0cf3 -> :sswitch_c
        -0x2b0b06ec -> :sswitch_4
        -0x27acf441 -> :sswitch_6
        -0x2257ccee -> :sswitch_5
        -0x13f77502 -> :sswitch_2
        -0xea48aa2 -> :sswitch_2
        -0xb621ef1 -> :sswitch_10
        0x5fe4af6 -> :sswitch_1
        0x61b167f -> :sswitch_9
        0xbda6dd3 -> :sswitch_7
        0x1e7bd2b8 -> :sswitch_8
        0x1f00a5b2 -> :sswitch_1
        0x21fce8cc -> :sswitch_5
        0x23d41a37 -> :sswitch_10
        0x24942a28 -> :sswitch_0
        0x2a80c93e -> :sswitch_f
        0x30e2b679 -> :sswitch_a
        0x3df17015 -> :sswitch_d
        0x3e866703 -> :sswitch_b
        0x3fbd8aa4 -> :sswitch_3
        0x484157ec -> :sswitch_8
        0x48e638ed -> :sswitch_e
        0x540d5fe0 -> :sswitch_d
        0x59c36b2e -> :sswitch_c
        0x743dbf93 -> :sswitch_9
        0x74f5ac21 -> :sswitch_3
        0x77fb7fa3 -> :sswitch_6
    .end sparse-switch
.end method

.method public static ۨ(Ljava/lang/String;)Z
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v6, -0x229cefaa

    sget v7, Ll/֫;->ܶܺ᩻:I

    sget v8, Ll/۟;->ۨᩴۛ:I

    const-string v9, "\u1a79\u1a77"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x39b7

    const v11, -0x220479a8

    xor-int/2addr v10, v11

    const v11, 0x19942a73

    :goto_0
    xor-int/2addr v9, v11

    :goto_1
    xor-int/2addr v6, v8

    mul-int/lit16 v6, v6, -0x41ad

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    return v2

    .line 14
    :sswitch_0
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    sget v9, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v9, :cond_5

    goto/16 :goto_5

    .line 23
    :sswitch_1
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    sget v9, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v9, :cond_7

    goto/16 :goto_6

    .line 0
    :sswitch_2
    sget v9, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v9, :cond_a

    goto/16 :goto_7

    .line 35
    :sswitch_3
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    invoke-static {}, Ll/֫;->ۛۖۤ()I

    goto/16 :goto_7

    .line 12
    :sswitch_4
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    const/4 p0, 0x0

    return p0

    :sswitch_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 48
    :sswitch_6
    aget-char v9, v3, v5

    if-ne v9, v1, :cond_0

    const-string v9, "\u1a79\u1a76"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, -0x63

    xor-int v10, v9, v8

    mul-int/lit8 v10, v10, 0x55

    const v11, -0x23edc482

    xor-int/2addr v10, v11

    const v11, -0x6296201

    goto :goto_0

    :cond_0
    const-string v9, "\u06e7\u06e2"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x4d21

    const v11, 0x7f617f41

    xor-int/2addr v10, v11

    const v11, -0x6b55f6f1

    goto :goto_0

    :sswitch_7
    const/4 p0, 0x1

    return p0

    :sswitch_8
    if-ge v5, v4, :cond_1

    const-string v9, "\u073a\u06dc"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, -0x3f

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x48cb

    const v11, 0xb17f37c

    xor-int/2addr v10, v11

    const v11, -0x2ac297d4

    goto :goto_0

    :cond_1
    const-string v9, "\u06ec\u0733"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x4527

    const v11, 0x3b819f2f

    xor-int/2addr v10, v11

    const v11, -0x13d362f1

    goto/16 :goto_0

    :sswitch_9
    return v2

    :sswitch_a
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_2
    const-string v9, "\u1a78\u06da"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x647f

    const v11, -0x28313b6

    xor-int/2addr v10, v11

    const v11, -0x6761e2d3

    goto/16 :goto_0

    .line 42
    :sswitch_b
    invoke-static {v0, v1, p0}, Ll/֨᩵᩺;->ۙ(IILjava/lang/String;)Z

    move-result v2

    const/4 v9, 0x0

    if-nez v2, :cond_2

    const-string v2, "\u06db\u0736"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v7

    mul-int/lit8 v2, v2, -0x6f

    xor-int v10, v2, v8

    mul-int/lit16 v10, v10, -0x375b

    const v11, -0x6b238110

    xor-int/2addr v10, v11

    const v11, -0x66a12425

    goto :goto_3

    :cond_2
    const-string v2, "\u1a7b\u1a77"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v8

    mul-int/lit8 v2, v2, -0x19

    xor-int v10, v2, v7

    mul-int/lit16 v10, v10, -0x7d09

    const v11, -0x899859a

    xor-int/2addr v10, v11

    const v11, -0x5e1aa5e2

    :goto_3
    xor-int/2addr v2, v11

    move v9, v2

    const/4 v2, 0x0

    goto/16 :goto_1

    :sswitch_c
    const/16 v1, 0x20

    .line 5
    sget v9, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v9, :cond_3

    goto/16 :goto_8

    :cond_3
    const-string v9, "\u073f\u05ab"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x7a1f

    const v11, -0x733cd821

    xor-int/2addr v10, v11

    const v11, -0xefd22e6

    goto/16 :goto_0

    .line 13
    :sswitch_d
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result v9

    if-eqz v9, :cond_4

    goto :goto_4

    :cond_4
    const-string v9, "\u05a8\u073a"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x6b

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x7cf5

    const v11, 0x6084c769

    xor-int/2addr v10, v11

    const v11, -0x418013e1

    goto/16 :goto_0

    .line 4
    :sswitch_e
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v9

    if-nez v9, :cond_6

    :cond_5
    :goto_4
    const-string v9, "\u1a76\u05ab"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x5b

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x7701

    const v11, 0x467b74b0

    xor-int/2addr v10, v11

    const v11, 0x6edb298d

    goto/16 :goto_0

    :cond_6
    const-string v9, "\u05a1\u1a73"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x3313

    const v11, -0x73c4d0a

    xor-int/2addr v10, v11

    const v11, -0x78910cee

    goto/16 :goto_0

    .line 11
    :sswitch_f
    sget v9, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v9, :cond_8

    :cond_7
    :goto_5
    const-string v9, "\u06ec\u1a79"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x17

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x7f5

    const v11, -0x64a687d3

    xor-int/2addr v10, v11

    const v11, -0x33bdbe5e    # -5.0923144E7f

    goto/16 :goto_0

    :cond_8
    const-string v9, "\u06dc\u06d7"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x35

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x7897

    const v11, 0x3176885f

    xor-int/2addr v10, v11

    const v11, 0x731d66e2

    goto/16 :goto_0

    :sswitch_10
    sget v9, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v9, :cond_9

    goto/16 :goto_7

    :cond_9
    const-string v9, "\u06da\u1a79"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x70f1

    const v11, 0x4603fcac

    xor-int/2addr v10, v11

    const v11, 0x3b661024

    goto/16 :goto_0

    :sswitch_11
    sget-boolean v9, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v9, :cond_b

    :cond_a
    :goto_6
    const-string v9, "\u1a78\u06d8"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x1f

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x52a5

    const v11, 0x69742f6d

    xor-int/2addr v10, v11

    const v11, 0x335c301f

    goto/16 :goto_0

    :cond_b
    const-string v9, "\u06db\u06df"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x3a1d

    const v11, 0x1748871c

    xor-int/2addr v10, v11

    const v11, -0x314dcd8b    # -1.4948256E9f

    goto/16 :goto_0

    :sswitch_12
    sget v9, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v9, :cond_c

    goto :goto_8

    :cond_c
    const-string v9, "\u06db\u1a74"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x213d

    const v11, 0x27aa73c2

    xor-int/2addr v10, v11

    const v11, 0x1385fd52

    goto/16 :goto_0

    .line 21
    :sswitch_13
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v9

    if-gtz v9, :cond_d

    goto :goto_7

    :cond_d
    const-string v9, "\u05a1\u06ec"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x171b

    const v11, 0x34caeb3b

    xor-int/2addr v10, v11

    const v11, -0x39ea35c0    # -9586.5625f

    goto/16 :goto_0

    .line 33
    :sswitch_14
    sget-boolean v9, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v9, :cond_e

    :goto_7
    const-string v9, "\u1a75\u1a7a"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, 0x29

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0xe11

    const v11, -0x657de907

    xor-int/2addr v10, v11

    const v11, -0x2df9b919

    goto/16 :goto_0

    :cond_e
    const-string v9, "\u1a78\u06e1"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x6e95

    const v11, 0x445ffbd9

    xor-int/2addr v10, v11

    const v11, 0x471607f3

    goto/16 :goto_0

    :sswitch_15
    const/4 v0, 0x7

    sget-boolean v9, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v9, :cond_f

    :goto_8
    const-string v9, "\u1a78\u1a79"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x1e31

    const v11, -0x241a3dad

    xor-int/2addr v10, v11

    const v11, 0x56eb04ab

    goto/16 :goto_0

    :cond_f
    const-string v9, "\u06e7\u06da"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x2b71

    const v11, 0x3c41d94a

    xor-int/2addr v10, v11

    const v11, 0x2deba416

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7cec1c7a -> :sswitch_9
        -0x73a92e0a -> :sswitch_14
        -0x731a80c2 -> :sswitch_0
        -0x65fa4b8d -> :sswitch_a
        -0x6373e17b -> :sswitch_0
        -0x5f3077a8 -> :sswitch_a
        -0x5cfc46d4 -> :sswitch_13
        -0x4e259472 -> :sswitch_3
        -0x4911d3af -> :sswitch_d
        -0x45ac9393 -> :sswitch_b
        -0x4473b503 -> :sswitch_4
        -0x32cc2a66 -> :sswitch_7
        -0x281d2f98 -> :sswitch_4
        -0x244e4614 -> :sswitch_10
        -0x1b454cdf -> :sswitch_6
        -0x1870d216 -> :sswitch_14
        -0x14c773ed -> :sswitch_c
        -0xefd542c -> :sswitch_f
        -0xb455238 -> :sswitch_8
        -0x86c69e3 -> :sswitch_11
        -0x71d2212 -> :sswitch_1
        -0x681ea19 -> :sswitch_e
        -0x27e1f25 -> :sswitch_15
        0x3ca689e -> :sswitch_f
        0xc712a04 -> :sswitch_12
        0xd0d070c -> :sswitch_9
        0x1582bfb9 -> :sswitch_12
        0x1775fc90 -> :sswitch_2
        0x1b7ad93f -> :sswitch_11
        0x1cf33045 -> :sswitch_13
        0x264815e7 -> :sswitch_7
        0x2aa46ca7 -> :sswitch_10
        0x2cb809ea -> :sswitch_6
        0x2e2d7afb -> :sswitch_c
        0x3b666e79 -> :sswitch_b
        0x45be41a1 -> :sswitch_5
        0x4da615d9 -> :sswitch_2
        0x5a29e9c0 -> :sswitch_3
        0x5fc47e02 -> :sswitch_15
        0x6378be56 -> :sswitch_d
        0x6a33ee7e -> :sswitch_e
        0x70bc5062 -> :sswitch_5
        0x7bfc0844 -> :sswitch_1
        0x7c8ba3f9 -> :sswitch_8
    .end sparse-switch
.end method

.method public static ܰ(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x1

    const/16 v1, 0x18

    .line 23
    invoke-static {v0, v1, p0}, Ll/֨᩵᩺;->ۙ(IILjava/lang/String;)Z

    move-result p0

    return p0
.end method
