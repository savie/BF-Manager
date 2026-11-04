.class public final Ll/ܽۢ᩻;
.super Ljava/lang/Object;
.source "F1FO"


# static fields
.field private static final ܰۛܳ:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x9

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܽۢ᩻;->ܰۛܳ:[S

    return-void

    :array_0
    .array-data 2
        0x229s
        -0x3bdas
        -0x3bdcs
        -0x3bcds
        -0x3bd2s
        -0x3bcfs
        -0x3bd2s
        -0x3bcds
        -0x3bc2s
    .end array-data
.end method

.method public static ۙ(Ll/ܽ֡֫;ZZLjava/lang/Runnable;)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const v11, -0x3f024b64

    sget v12, Ll/֫֨;->᩶ܺۡ:I

    sget v13, Ll/ۗܰ;->ܶۜ۬:I

    const-string v14, "\u1a77\u06dc"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x3b

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x4c3f

    const v16, -0x72bdf444

    xor-int v15, v15, v16

    const v16, -0x3bb05ced

    :goto_0
    xor-int v14, v14, v16

    :goto_1
    xor-int/2addr v11, v13

    mul-int/lit16 v11, v11, -0x78d9

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    .line 493
    invoke-static/range {p3 .. p3}, Ll/֨ۢ;->ۢܶᩴ(Ljava/lang/Object;)V

    sget-object v14, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    goto :goto_4

    .line 464
    :sswitch_0
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v14

    if-gtz v14, :cond_1

    :cond_0
    :goto_2
    move/from16 v14, p1

    goto/16 :goto_b

    :cond_1
    move/from16 v14, p1

    goto/16 :goto_a

    .line 459
    :sswitch_1
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    sget v14, Ll/ۖ֡;->ۚۛᩳ:I

    if-lez v14, :cond_2

    goto :goto_2

    :cond_2
    move/from16 v14, p1

    goto/16 :goto_8

    .line 488
    :sswitch_2
    sget v14, Ll/۬;->᩸ۜ᩹:I

    if-eqz v14, :cond_0

    :goto_3
    move/from16 v14, p1

    goto/16 :goto_9

    .line 248
    :sswitch_3
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    goto :goto_3

    .line 205
    :sswitch_4
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    return-void

    .line 492
    :sswitch_5
    new-instance v14, Ll/ܺۖ᩻;

    const/4 v15, 0x0

    .line 31
    invoke-direct {v14, v0, v15}, Ll/ܺۖ᩻;-><init>(Ll/ܽ֡֫;Ll/ۤۢ᩻;)V

    if-eqz v2, :cond_3

    const-string v14, "\u06e0\u073a"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0xb2d

    const v16, -0x4df86583

    xor-int v15, v15, v16

    const v16, -0x5d9187c8

    goto :goto_0

    :cond_3
    :goto_4
    move/from16 v14, p1

    goto :goto_5

    .line 488
    :sswitch_6
    invoke-static/range {p3 .. p3}, Ll/֫ܺ;->۫֨᩷(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    .line 491
    :sswitch_8
    invoke-static {}, Ll/ۖ֡;->ܺۙᩴ()Z

    move-result v14

    if-nez v14, :cond_4

    const-string v14, "\u06e2\u06e0"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x79

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x74f7

    const v16, 0x1c602b3d

    xor-int v15, v15, v16

    const v16, -0x6dc7273

    goto :goto_0

    :cond_4
    move/from16 v14, p1

    goto :goto_6

    .line 495
    :sswitch_9
    new-instance v3, Ll/֨ۢ᩻;

    move/from16 v14, p1

    invoke-direct {v3, v0, v14, v1, v2}, Ll/֨ۢ᩻;-><init>(Ll/ܽ֡֫;ZZLjava/lang/Runnable;)V

    return-void

    :sswitch_a
    move/from16 v14, p1

    if-eqz v2, :cond_5

    const-string v15, "\u1a78\u1a76"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v13

    mul-int/lit8 v15, v15, 0x7f

    xor-int v2, v15, v12

    mul-int/lit16 v2, v2, -0x40c7

    const v16, -0x2b095fb6

    xor-int v2, v2, v16

    const v16, 0x3ba8da5f

    xor-int v15, v15, v16

    move v14, v15

    move v15, v2

    goto/16 :goto_d

    :cond_5
    :goto_5
    const-string v2, "\u06e8\u06e0"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v12, v2

    mul-int/lit8 v2, v2, 0x23

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, -0x2c8f

    const v16, 0x44ba823c

    xor-int v15, v15, v16

    const v16, -0x567b7de6

    goto/16 :goto_c

    :sswitch_b
    move/from16 v14, p1

    if-eqz v1, :cond_6

    const-string v2, "\u073f\u073d"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v15, v2, v12

    mul-int/lit16 v15, v15, -0x1509

    const v16, 0x1d9fa8bf

    xor-int v15, v15, v16

    const v16, 0xf937ca7

    goto/16 :goto_c

    :cond_6
    :goto_6
    const-string v2, "\u06db\u06e7"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v15, v2, v12

    mul-int/lit16 v15, v15, 0x75c7

    const v16, 0x2a709429

    xor-int v15, v15, v16

    const v16, 0x1ab17f68

    goto/16 :goto_c

    :sswitch_c
    move/from16 v14, p1

    .line 5
    invoke-static {v0, v3}, Ll/ۗ᩺;->֫᩶֫(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 469
    invoke-static {}, Ll/֨ۢ᩻;->ۙ()Ll/᩻֫ܺ;

    move-result-object v2

    .line 487
    invoke-virtual {v2}, Ll/᩻֫ܺ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_7

    const-string v2, "\u06ec\u1a75"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v12

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, 0x58d9

    const v16, -0x3948126d

    xor-int v15, v15, v16

    const v16, -0x2b185017

    goto/16 :goto_c

    :cond_7
    const-string v2, "\u06e2\u06df"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v12, v2

    mul-int/lit8 v2, v2, -0x61

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, -0x7409

    const v16, -0x1281f98d

    xor-int v15, v15, v16

    const v16, 0x10b71b08

    goto/16 :goto_c

    :sswitch_d
    move/from16 v14, p1

    .line 0
    sget-object v2, Ll/ܽۢ᩻;->ܰۛܳ:[S

    const/4 v3, 0x1

    const/16 v15, 0x8

    invoke-static {v2, v3, v15, v10}, Ll/֡ۢ;->֡֨ۛ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    move-result v2

    if-nez v2, :cond_8

    goto/16 :goto_8

    :cond_8
    const-string v2, "\u06df\u1a77"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v15, v2, v12

    mul-int/lit16 v15, v15, -0x4f89

    const v16, -0x40f613dd

    xor-int v15, v15, v16

    const v16, 0x48b442f0    # 369175.5f

    goto/16 :goto_c

    :sswitch_e
    move/from16 v14, p1

    const/16 v2, 0x78bc

    const/16 v10, 0x78bc

    goto :goto_7

    :sswitch_f
    move/from16 v14, p1

    const v2, 0xc447

    const v10, 0xc447

    :goto_7
    const-string v2, "\u06da\u05a8"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    mul-int/lit8 v2, v2, -0x5d

    xor-int v15, v2, v12

    mul-int/lit16 v15, v15, 0x5a2b

    const v16, -0x5bf2f872

    xor-int v15, v15, v16

    const v16, 0x33d5497f

    goto/16 :goto_c

    :sswitch_10
    move/from16 v14, p1

    add-int v2, v8, v9

    add-int/2addr v2, v2

    sub-int v2, v7, v2

    if-lez v2, :cond_9

    const-string v2, "\u1a79\u073f"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v12

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, -0x1233

    const v16, 0x6467ed05

    xor-int v15, v15, v16

    const v16, -0x5daf035

    goto/16 :goto_c

    :cond_9
    const-string v2, "\u073f\u1a74"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v15, v2, v12

    mul-int/lit16 v15, v15, 0x5725

    const v16, -0x59375452

    xor-int v15, v15, v16

    const v16, -0x46c2b00b

    goto/16 :goto_c

    :sswitch_11
    move/from16 v14, p1

    add-int v2, v5, v6

    mul-int v7, v2, v2

    mul-int v8, v5, v5

    const v9, 0x166099

    .line 82
    sget v2, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v2, :cond_a

    goto :goto_8

    :cond_a
    const-string v2, "\u05a1\u1a73"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v12

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, 0x7535

    const v16, -0x2114851a

    xor-int v15, v15, v16

    const v16, -0x34cfbd24    # -1.1551452E7f

    goto/16 :goto_c

    :sswitch_12
    move/from16 v14, p1

    const/4 v2, 0x0

    aget-short v5, v4, v2

    const/16 v6, 0x4bb

    .line 13
    sget v2, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v2, :cond_b

    const-string v2, "\u1a74\u06da"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v12, v2

    mul-int/lit8 v2, v2, -0x65

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, -0x1137

    const v16, -0x3e890bb9

    xor-int v15, v15, v16

    const v16, 0x5166291a

    goto/16 :goto_c

    :cond_b
    const-string v2, "\u1a74\u1a7b"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v12

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, -0x1273

    const v16, -0x43d5b5f1

    xor-int v15, v15, v16

    const v16, -0x1ca9f4ff

    goto/16 :goto_c

    :sswitch_13
    move/from16 v14, p1

    sget-object v4, Ll/ܽۢ᩻;->ܰۛܳ:[S

    .line 313
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v2

    if-ltz v2, :cond_c

    :goto_8
    const-string v2, "\u06d9\u06df"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v15, v2, v12

    mul-int/lit16 v15, v15, 0x4e3

    const v16, 0x2e2b9c1

    xor-int v15, v15, v16

    const v16, -0x70307f42

    goto/16 :goto_c

    :cond_c
    const-string v2, "\u06e7\u06e8"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v15, v2, v12

    mul-int/lit16 v15, v15, -0x7317

    const v16, 0x3818adad

    xor-int v15, v15, v16

    const v16, 0x3a30cff1

    goto/16 :goto_c

    :sswitch_14
    move/from16 v14, p1

    sget v2, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v2, :cond_d

    goto/16 :goto_a

    :cond_d
    const-string v2, "\u073d\u1a74"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v15, v2, v12

    mul-int/lit16 v15, v15, -0x3edd

    const v16, -0x3dbd12b9

    xor-int v15, v15, v16

    const v16, -0x6827833b

    goto/16 :goto_c

    :sswitch_15
    move/from16 v14, p1

    .line 39
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v2

    if-eqz v2, :cond_e

    goto/16 :goto_b

    :cond_e
    const-string v2, "\u1a7a\u06d8"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v12

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, -0x5487

    const v16, 0xa22dc0e

    xor-int v15, v15, v16

    const v16, -0x4709075a

    goto/16 :goto_c

    :sswitch_16
    move/from16 v14, p1

    .line 159
    sget v2, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v2, :cond_f

    goto/16 :goto_b

    :cond_f
    const-string v2, "\u1a79\u1a75"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v12

    mul-int/lit8 v2, v2, -0x57

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, -0x38f7

    const v16, 0x55a2b661

    xor-int v15, v15, v16

    const v16, -0x4cd674d3

    goto/16 :goto_c

    :sswitch_17
    move/from16 v14, p1

    .line 332
    sget v2, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v2, :cond_10

    :goto_9
    const-string v2, "\u0730\u1a7a"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v12

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, -0x4c49

    const v16, -0x82353e5

    xor-int v15, v15, v16

    const v16, 0x2afd7d96

    goto/16 :goto_c

    :cond_10
    const-string v2, "\u1a7b\u06dc"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    mul-int/lit8 v2, v2, 0x27

    xor-int v15, v2, v12

    mul-int/lit16 v15, v15, 0x720f

    const v16, -0x54615599

    xor-int v15, v15, v16

    const v16, 0x7786d53c

    goto :goto_c

    :sswitch_18
    move/from16 v14, p1

    .line 57
    sget v2, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v2, :cond_11

    :goto_a
    const-string v2, "\u06df\u06d9"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v15, v2, v12

    mul-int/lit16 v15, v15, 0x4b95

    const v16, 0x326540f2

    xor-int v15, v15, v16

    const v16, -0x7417aca1

    goto :goto_c

    :cond_11
    const-string v2, "\u06da\u0736"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v12

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, 0x12c5

    const v16, -0x10879e70

    xor-int v15, v15, v16

    const v16, 0x4aeb621b    # 7713037.5f

    goto :goto_c

    :sswitch_19
    move/from16 v14, p1

    .line 205
    sget v2, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v2, :cond_12

    :goto_b
    const-string v2, "\u1a74\u06e4"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v12

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, -0x4279

    const v16, 0x597d6e01

    xor-int v15, v15, v16

    const v16, -0x4e82fd16

    goto :goto_c

    :cond_12
    const-string v2, "\u05a8\u06da"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    mul-int/lit8 v2, v2, -0x11

    xor-int v15, v2, v12

    mul-int/lit16 v15, v15, -0x46d

    const v16, -0xebf4ad4

    xor-int v15, v15, v16

    const v16, -0x6a6afbf

    :goto_c
    xor-int v2, v2, v16

    move v14, v2

    :goto_d
    move-object/from16 v2, p3

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7f4e2a62 -> :sswitch_e
        -0x663d5bcb -> :sswitch_11
        -0x638e0abe -> :sswitch_b
        -0x5f02eed2 -> :sswitch_c
        -0x5ed657fd -> :sswitch_0
        -0x5dffda63 -> :sswitch_4
        -0x518f40ad -> :sswitch_a
        -0x517f0279 -> :sswitch_d
        -0x4f851510 -> :sswitch_5
        -0x4e589463 -> :sswitch_10
        -0x4dc9e25a -> :sswitch_c
        -0x3d9ddd75 -> :sswitch_14
        -0x378ea0f4 -> :sswitch_e
        -0x34162657 -> :sswitch_3
        -0x2ff26a3a -> :sswitch_2
        -0x2d86504a -> :sswitch_12
        -0x1baed656 -> :sswitch_15
        -0x1825d821 -> :sswitch_8
        -0x178d1c8b -> :sswitch_19
        -0xdc3e7fb -> :sswitch_0
        -0xd07e75e -> :sswitch_9
        -0xb93297b -> :sswitch_b
        -0xb04198b -> :sswitch_13
        -0x3389056 -> :sswitch_1
        0xba897e -> :sswitch_6
        0x5901c03 -> :sswitch_6
        0x6e75984 -> :sswitch_9
        0x85f9a28 -> :sswitch_5
        0x12046d6b -> :sswitch_3
        0x132b5de8 -> :sswitch_f
        0x14dc758d -> :sswitch_16
        0x239d3e0c -> :sswitch_18
        0x2fd9ae36 -> :sswitch_14
        0x307c5834 -> :sswitch_17
        0x33c0b50f -> :sswitch_12
        0x352d4b90 -> :sswitch_d
        0x4ddb8aa8 -> :sswitch_10
        0x506a656f -> :sswitch_4
        0x51740846 -> :sswitch_f
        0x56bb6cf4 -> :sswitch_16
        0x5e53d3f0 -> :sswitch_7
        0x5ea71f50 -> :sswitch_11
        0x612ed17c -> :sswitch_a
        0x63a13423 -> :sswitch_1
        0x6786e73e -> :sswitch_2
        0x6a7f1c6d -> :sswitch_18
        0x6a9d48bd -> :sswitch_8
        0x6b21278b -> :sswitch_7
        0x75b710c9 -> :sswitch_17
        0x78f729e2 -> :sswitch_15
        0x7a0ff1cb -> :sswitch_19
        0x7f913ab4 -> :sswitch_13
    .end sparse-switch
.end method
