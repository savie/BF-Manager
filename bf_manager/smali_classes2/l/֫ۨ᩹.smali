.class public final Ll/֫ۨ᩹;
.super Ljava/lang/Object;
.source "970R"

# interfaces
.implements Ll/᩶ۨ᩹;


# static fields
.field private static final ܺۗۡ:[S


# instance fields
.field public final ۖ:Ll/ܰۖ᩹;

.field public final ۙ:I

.field public final ۨ:Ll/ۛۨ᩹;

.field public final ܰ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3f

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/֫ۨ᩹;->ܺۗۡ:[S

    return-void

    :array_0
    .array-data 2
        0x1bffs
        0x6bes
        0x699s
        0x681s
        0x696s
        0x69bs
        0x69es
        0x693s
        0x6d7s
        0x687s
        0x696s
        0x683s
        0x683s
        0x692s
        0x685s
        0x699s
        0x6d7s
        0x687s
        0x696s
        0x683s
        0x694s
        0x69fs
        0x6d7s
        0x69bs
        0x696s
        0x68es
        0x692s
        0x685s
        0x79cs
        -0x6d11s
        -0x6d39s
        -0x6d26s
        -0x6d22s
        -0x6d2ds
        -0x6d76s
        -0x6d34s
        -0x6d3ds
        -0x6d3as
        -0x6d22s
        -0x6d31s
        -0x6d28s
        -0x6d31s
        -0x6d32s
        -0x6d76s
        -0x6d26s
        -0x6d35s
        -0x6d22s
        -0x6d22s
        -0x6d31s
        -0x6d28s
        -0x6d3cs
        -0x6d76s
        -0x6d26s
        -0x6d35s
        -0x6d22s
        -0x6d37s
        -0x6d3es
        -0x6d76s
        -0x6d3as
        -0x6d35s
        -0x6d2ds
        -0x6d31s
        -0x6d28s
    .end array-data
.end method

.method public constructor <init>(Ll/ۛۨ᩹;Ll/ܰۖ᩹;II)V
    .locals 8

    const v0, -0x59cda819

    sget v1, Ll/֫ᩳ;->۬֨᩸:I

    sget v2, Ll/֨᩹;->᩻ᩳ֨:I

    sget-object v3, Ll/֫ۨ᩹;->ܺۗۡ:[S

    const/4 v4, 0x0

    aget-short v3, v3, v4

    add-int/lit8 v4, v3, 0x1

    mul-int v4, v4, v4

    mul-int/lit8 v3, v3, 0x2

    add-int/lit8 v3, v3, 0x1

    sub-int/2addr v3, v4

    if-gtz v3, :cond_0

    const/16 v3, 0x6f7

    goto :goto_0

    :cond_0
    const v3, 0xfbb6

    .line 843
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u06d6\u06ec"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v1

    mul-int/lit8 v4, v4, -0x3f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x77df

    const v6, 0x3b1d88b9

    xor-int/2addr v5, v6

    const v6, -0x1b27669b

    :goto_1
    xor-int/2addr v4, v6

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x3f61

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v5

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_0

    if-ge p3, p4, :cond_e

    const-string v4, "\u1a73\u1a78"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v1

    mul-int/lit16 v5, v5, 0x2c8b

    const v6, 0x74532f3

    xor-int/2addr v5, v6

    const v6, -0x1a536bf5

    goto :goto_1

    .line 291
    :sswitch_0
    sget v4, Ll/֫֡;->ۡ᩹ۗ:I

    if-lez v4, :cond_8

    goto/16 :goto_3

    .line 717
    :sswitch_1
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    sget v4, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v4, :cond_a

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_4

    .line 252
    :sswitch_3
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    goto/16 :goto_4

    .line 836
    :sswitch_4
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 849
    :sswitch_5
    iput p3, p0, Ll/֫ۨ᩹;->ܰ:I

    .line 850
    iput p4, p0, Ll/֫ۨ᩹;->ۙ:I

    return-void

    .line 847
    :sswitch_6
    iput-object p1, p0, Ll/֫ۨ᩹;->ۨ:Ll/ۛۨ᩹;

    .line 848
    iput-object p2, p0, Ll/֫ۨ᩹;->ۖ:Ll/ܰۖ᩹;

    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v4

    if-eqz v4, :cond_2

    :cond_1
    const-string v4, "\u06e0\u073a"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v1

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x463

    const v6, 0x4bda8fcb    # 2.8647318E7f

    xor-int/2addr v5, v6

    const v6, 0x2049d3a3

    goto :goto_1

    :cond_2
    const-string v4, "\u0736\u05ab"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v1

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1ea7

    const v6, 0x19c4fea0

    xor-int/2addr v5, v6

    const v6, 0x7260a968

    goto :goto_1

    .line 845
    :sswitch_7
    new-instance v4, Ljava/lang/IllegalArgumentException;

    sget-object v5, Ll/֫ۨ᩹;->ܺۗۡ:[S

    .line 194
    sget v6, Ll/ۗ;->֨۬ۖ:I

    if-ltz v6, :cond_3

    goto/16 :goto_5

    .line 824
    :cond_3
    sget-boolean v6, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v6, :cond_4

    goto :goto_2

    :cond_4
    sget v6, Ll/۟;->ۨᩴۛ:I

    if-ltz v6, :cond_5

    goto :goto_2

    :cond_5
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_4

    :cond_6
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v6

    if-eqz v6, :cond_7

    goto :goto_4

    .line 42
    :cond_7
    sget v6, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v6, :cond_9

    :cond_8
    :goto_2
    const-string v4, "\u06d9\u1a74"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x61

    xor-int v5, v4, v1

    mul-int/lit16 v5, v5, -0x7113

    const v6, 0x3b9cef24

    xor-int/2addr v5, v6

    const v6, 0x3821e6ed

    goto/16 :goto_1

    :cond_9
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    move-result v6

    if-nez v6, :cond_b

    :cond_a
    :goto_3
    const-string v4, "\u06df\u06e4"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v1

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1d4b

    const v6, 0x42248ac7

    xor-int/2addr v5, v6

    const v6, -0xb96f3d2

    goto/16 :goto_1

    .line 303
    :cond_b
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    move-result v6

    if-gtz v6, :cond_c

    :goto_4
    const-string v4, "\u1a75\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v1

    mul-int/lit16 v5, v5, -0x3719

    const v6, -0x5c7c582a

    xor-int/2addr v5, v6

    const v6, -0x630f3cfd

    goto/16 :goto_1

    :cond_c
    const/4 v6, 0x1

    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    move-result v7

    if-nez v7, :cond_d

    :goto_5
    const-string v4, "\u1a77\u0736"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v1

    mul-int/lit8 v4, v4, -0x41

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5c09

    const v6, -0x3423e862    # -2.8847932E7f

    xor-int/2addr v5, v6

    const v6, -0x26b90dde

    goto/16 :goto_1

    :cond_d
    const/16 p1, 0x1b

    .line 845
    invoke-static {v5, v6, p1, v3}, Ll/ۖۛ;->ܿۤ۟([SIII)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v4, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 844
    :sswitch_8
    invoke-virtual {p2}, Ll/ܰۖ᩹;->ۨ()I

    move-result v4

    if-eqz v4, :cond_e

    const-string v4, "\u073d\u06e7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v1

    mul-int/lit16 v5, v5, -0x1069

    const v6, -0x67316530

    xor-int/2addr v5, v6

    const v6, 0x7e8f2595

    goto/16 :goto_1

    :cond_e
    const-string v4, "\u06e0\u073d"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v1

    mul-int/lit8 v4, v4, 0x13

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xa8d

    const v6, -0x1284536d

    xor-int/2addr v5, v6

    const v6, -0x1a419fbc

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x607f7762 -> :sswitch_7
        -0x5993b5b1 -> :sswitch_2
        -0x4f5db5c4 -> :sswitch_2
        -0x48193265 -> :sswitch_4
        -0x3145106d -> :sswitch_6
        -0x2eec0ebf -> :sswitch_0
        -0x2abb683f -> :sswitch_3
        -0x1f5ae3ac -> :sswitch_6
        -0x13e10bf7 -> :sswitch_4
        -0xd79d3c1 -> :sswitch_0
        -0xc227ca1 -> :sswitch_7
        -0x337fc03 -> :sswitch_1
        0x2065d1d9 -> :sswitch_5
        0x24ef8415 -> :sswitch_5
        0x34b0f8bf -> :sswitch_8
        0x5be71eff -> :sswitch_8
        0x6b420f55 -> :sswitch_1
        0x724c927d -> :sswitch_3
    .end sparse-switch
.end method

.method public static bridge synthetic ۙ(Ll/֫ۨ᩹;)Ll/ۛۨ᩹;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ۨ᩹;->ۨ:Ll/ۛۨ᩹;

    return-object p0
.end method

.method public static synthetic ۙ(Ll/֫ۨ᩹;II[BIII)V
    .locals 15

    move/from16 v0, p6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, 0x2f8073c7

    sget v5, Ll/ۘۚ;->ܺ᩶ܽ:I

    sget v6, Ll/ۗ۬;->ۤᩴ᩻:I

    const-string v7, "\u073a\u073a"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x2e95

    const v9, 0x6f673af7

    xor-int/2addr v8, v9

    const v9, -0x5478550a

    xor-int/2addr v7, v9

    :goto_0
    xor-int/2addr v4, v6

    mul-int/lit16 v4, v4, 0x4a15

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    return-void

    :sswitch_0
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    sget v7, Ll/۟;->ۨᩴۛ:I

    if-gez v7, :cond_1

    :cond_0
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    goto/16 :goto_6

    :cond_1
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    goto/16 :goto_7

    .line 138
    :sswitch_1
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    sget v7, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v7, :cond_0

    :cond_2
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    sget v7, Ll/֫;->ܶܺ᩻:I

    if-gez v7, :cond_2

    :goto_1
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    goto :goto_1

    .line 882
    :sswitch_4
    invoke-static {v2}, Ll/ۛۨ᩹;->ۙ(Ll/ۛۨ᩹;)[B

    move-result-object v7

    sub-int v8, v1, v0

    add-int v9, p4, v1

    sub-int v9, v9, p5

    sub-int v10, v3, v1

    move-object/from16 v11, p3

    invoke-static {v7, v8, v11, v9, v10}, Ll/ۗᩳ;->ۖۧ᩶(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v10, p0

    move/from16 v7, p2

    goto :goto_2

    :sswitch_5
    return-void

    :sswitch_6
    move/from16 v7, p2

    move-object/from16 v11, p3

    int-to-long v2, v7

    int-to-long v8, v0

    move-object v10, p0

    .line 879
    iget-object v12, v10, Ll/֫ۨ᩹;->ۨ:Ll/ۛۨ᩹;

    .line 880
    invoke-static {v12}, Ll/֨֫;->ܿ֡ۜ(Ljava/lang/Object;)I

    move-result v13

    int-to-long v13, v13

    add-long/2addr v8, v13

    .line 879
    invoke-static {v2, v3, v8, v9}, Ll/֡֡;->᩹ᩳ֨(JJ)J

    move-result-wide v2

    long-to-int v3, v2

    if-ge v1, v3, :cond_3

    const-string v2, "\u06e8\u06da"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v5

    mul-int/lit8 v2, v2, -0x15

    xor-int v8, v2, v6

    mul-int/lit16 v8, v8, 0x163b

    const v9, -0x7954e7e9

    xor-int/2addr v8, v9

    const v9, 0x5152364a

    xor-int/2addr v2, v9

    move v7, v2

    move-object v2, v12

    goto/16 :goto_0

    :cond_3
    move-object v2, v12

    :goto_2
    const-string v8, "\u073a\u06dc"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v5

    mul-int/lit16 v9, v9, 0x5847

    const v12, 0xf8d516a

    xor-int/2addr v9, v12

    const v12, -0x536af415

    xor-int/2addr v8, v12

    move v7, v8

    move v8, v9

    goto/16 :goto_0

    :sswitch_7
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    .line 878
    invoke-static {v8, v0}, Ll/֨֫;->ܺܰ۬(II)I

    move-result v1

    sget v9, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v9, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v9, "\u06ec\u1a74"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v5

    mul-int/lit8 v9, v9, -0x1d

    xor-int v12, v9, v6

    mul-int/lit16 v12, v12, -0x284b

    const v13, -0x6f7d1282

    xor-int/2addr v12, v13

    const v13, 0x7cb78239

    goto/16 :goto_8

    :sswitch_8
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    sget-boolean v9, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v9, :cond_5

    goto :goto_3

    :cond_5
    const-string v9, "\u0733\u0736"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v6

    xor-int v12, v9, v5

    mul-int/lit16 v12, v12, -0x4c0b

    const v13, -0x6d0d5b2d

    xor-int/2addr v12, v13

    const v13, 0x1acabffc

    goto/16 :goto_8

    :sswitch_9
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    .line 317
    sget v9, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v9, :cond_6

    :goto_3
    const-string v9, "\u073a\u06d6"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v6

    xor-int v12, v9, v5

    mul-int/lit16 v12, v12, -0x3861

    const v13, 0x4fc7d7fe

    xor-int/2addr v12, v13

    const v13, -0x7eeaad2c

    goto/16 :goto_8

    :cond_6
    const-string v9, "\u1a74\u1a75"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v6, v9

    mul-int/lit8 v9, v9, 0x19

    xor-int v12, v9, v5

    mul-int/lit16 v12, v12, -0x355b

    const v13, 0x3809d0a0

    xor-int/2addr v12, v13

    const v13, -0x5cfa0407

    goto/16 :goto_8

    :sswitch_a
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    .line 630
    sget v9, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v9, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v9, "\u1a74\u06dc"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v5

    xor-int v12, v9, v6

    mul-int/lit16 v12, v12, 0x4011

    const v13, 0x4d63cf4d    # 2.3887586E8f

    xor-int/2addr v12, v13

    const v13, 0x248bd354

    goto/16 :goto_8

    :sswitch_b
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    .line 706
    sget v9, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v9, :cond_8

    goto :goto_4

    :cond_8
    const-string v9, "\u06e7\u06e0"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v6

    mul-int/lit8 v9, v9, -0x7b

    xor-int v12, v9, v5

    mul-int/lit16 v12, v12, -0x383f

    const v13, 0x68772e55

    xor-int/2addr v12, v13

    const v13, 0x6594f74f

    goto/16 :goto_8

    :sswitch_c
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    sget v9, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v9, :cond_9

    :goto_4
    const-string v9, "\u073f\u073d"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v5

    mul-int/lit8 v9, v9, -0x33

    xor-int v12, v9, v6

    mul-int/lit16 v12, v12, 0x5805

    const v13, -0x1f92c71f

    xor-int/2addr v12, v13

    const v13, 0x19626823

    goto/16 :goto_8

    :cond_9
    const-string v9, "\u1a74\u06ec"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v5

    xor-int v12, v9, v6

    mul-int/lit16 v12, v12, 0x2569

    const v13, 0x44b37972

    xor-int/2addr v12, v13

    const v13, -0x37eaccfd

    goto/16 :goto_8

    :sswitch_d
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    .line 678
    sget-boolean v9, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v9, :cond_a

    :goto_5
    const-string v9, "\u06d9\u1a76"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v6

    xor-int v12, v9, v5

    mul-int/lit16 v12, v12, 0x52ff

    const v13, 0x1dc38afd

    xor-int/2addr v12, v13

    const v13, 0x2303e38d

    goto/16 :goto_8

    :cond_a
    const-string v9, "\u1a79\u0733"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v5

    xor-int v12, v9, v6

    mul-int/lit16 v12, v12, -0x2891

    const v13, 0x740a7545

    xor-int/2addr v12, v13

    const v13, 0x532f107e

    goto/16 :goto_8

    :sswitch_e
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    .line 443
    sget-boolean v9, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v9, :cond_b

    goto :goto_6

    :cond_b
    const-string v9, "\u06e7\u06dc"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v6

    mul-int/lit8 v9, v9, -0x7f

    xor-int v12, v9, v5

    mul-int/lit16 v12, v12, -0x7225

    const v13, 0x12f811a4

    xor-int/2addr v12, v13

    const v13, -0x13b49433

    goto :goto_8

    :sswitch_f
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    sget v9, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v9, :cond_c

    :goto_6
    const-string v9, "\u05a1\u05ab"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v6

    xor-int v12, v9, v5

    mul-int/lit16 v12, v12, -0xd65

    const v13, -0x53e8b12e

    xor-int/2addr v12, v13

    const v13, 0x6059963b

    goto :goto_8

    :cond_c
    const-string v9, "\u0730\u06d7"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v6

    xor-int v12, v9, v5

    mul-int/lit16 v12, v12, 0x47ab

    const v13, -0x474bcd50

    xor-int/2addr v12, v13

    const v13, -0xd1eaf5a

    goto :goto_8

    :sswitch_10
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    .line 321
    sget v9, Ll/ۗ;->֨۬ۖ:I

    if-ltz v9, :cond_d

    :goto_7
    const-string v9, "\u06db\u06eb"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v5

    xor-int v12, v9, v6

    mul-int/lit16 v12, v12, 0x385f

    const v13, -0x21ed1cde

    xor-int/2addr v12, v13

    const v13, -0x1768f1c3

    goto :goto_8

    :cond_d
    const-string v9, "\u1a76\u05a8"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v5

    xor-int v12, v9, v6

    mul-int/lit16 v12, v12, -0x3853

    const v13, 0x72185b1b

    xor-int/2addr v12, v13

    const v13, -0xeb3af22

    :goto_8
    xor-int/2addr v9, v13

    move v7, v9

    move v8, v12

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7dfee779 -> :sswitch_0
        -0x71068594 -> :sswitch_10
        -0x6cda378a -> :sswitch_1
        -0x6569b962 -> :sswitch_f
        -0x63924970 -> :sswitch_4
        -0x612118e9 -> :sswitch_3
        -0x5fcefd83 -> :sswitch_5
        -0x4437b3d8 -> :sswitch_7
        -0x43eb07f1 -> :sswitch_6
        -0x423b7c0e -> :sswitch_4
        -0x3ea4c85a -> :sswitch_2
        -0x39fe7c61 -> :sswitch_a
        -0x32161d69 -> :sswitch_1
        -0x2bcea10a -> :sswitch_f
        -0x29cf6989 -> :sswitch_d
        -0x23710b6d -> :sswitch_8
        -0x21fb0e02 -> :sswitch_9
        -0x1297c1df -> :sswitch_b
        -0xe6a1418 -> :sswitch_e
        -0xc3d38bf -> :sswitch_d
        -0x4f902c0 -> :sswitch_a
        0xde3844 -> :sswitch_6
        0x1f6de66 -> :sswitch_9
        0xa7b6389 -> :sswitch_2
        0xd97f8be -> :sswitch_5
        0x15a5be62 -> :sswitch_c
        0x1be48fbf -> :sswitch_8
        0x1f75d94e -> :sswitch_b
        0x3865d379 -> :sswitch_3
        0x53e3a0b6 -> :sswitch_e
        0x699299aa -> :sswitch_10
        0x6d55839d -> :sswitch_7
        0x6e28314a -> :sswitch_0
        0x76521c7e -> :sswitch_c
    .end sparse-switch
.end method

.method public static synthetic ۙ(Ll/֫ۨ᩹;II[BI[JI)V
    .locals 22

    move/from16 v0, p6

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const v11, -0x1d855219

    sget v12, Ll/ۗ᩺;->ۢۜ᩶:I

    sget v13, Ll/ۖۗ;->᩶۫ۗ:I

    const-string v14, "\u05a1\u0733"

    invoke-static {v14}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x25

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x3a3f

    const v16, -0x9c68ad7

    xor-int v15, v15, v16

    const v16, 0x38a7ef6d

    xor-int v14, v14, v16

    :goto_0
    xor-int/2addr v11, v13

    mul-int/lit16 v11, v11, 0xedb

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    .line 662
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    goto :goto_1

    :sswitch_0
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v14

    if-nez v14, :cond_0

    :goto_1
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    move-wide/from16 v18, v2

    move/from16 v3, p2

    goto/16 :goto_4

    :cond_0
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    move-wide/from16 v18, v2

    move/from16 v3, p2

    goto/16 :goto_6

    .line 68
    :sswitch_1
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    sget v14, Ll/ۗ;->֨۬ۖ:I

    if-gez v14, :cond_2

    :cond_1
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    move-wide/from16 v18, v2

    move/from16 v3, p2

    goto/16 :goto_5

    :cond_2
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    goto :goto_2

    .line 846
    :sswitch_2
    sget v14, Ll/֡֡;->᩶ۤ۠:I

    if-lez v14, :cond_1

    goto :goto_1

    .line 758
    :sswitch_3
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    return-void

    :sswitch_4
    sub-int v0, v1, p4

    sub-int v1, v8, v1

    move-object/from16 v14, p3

    .line 912
    invoke-static {v9, v10, v14, v0, v1}, Ll/ۗᩳ;->ۖۧ᩶(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int v8, v8, p4

    move-object/from16 v15, p5

    .line 914
    invoke-static {v0, v8, v15}, Ll/ۚۖ᩹;->ۙ(II[J)V

    return-void

    :sswitch_5
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    int-to-long v8, v7

    add-long/2addr v8, v4

    .line 910
    invoke-static {v2, v3, v8, v9}, Ll/֡֡;->᩹ᩳ֨(JJ)J

    move-result-wide v8

    long-to-int v8, v8

    .line 912
    invoke-static {v6}, Ll/ۛۨ᩹;->ۙ(Ll/ۛۨ᩹;)[B

    move-result-object v9

    sub-int v10, v1, v0

    .line 341
    sget v16, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v16, :cond_3

    :goto_2
    const-string v16, "\u06d9\u06e1"

    invoke-static/range {v16 .. v16}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v16

    sub-int v16, v13, v16

    mul-int/lit8 v16, v16, 0x4b

    move/from16 v17, v1

    xor-int v1, v16, v12

    mul-int/lit16 v1, v1, -0x7873

    const v18, 0x20b0602f

    xor-int v1, v1, v18

    const v18, 0x65ffe8f3

    xor-int v16, v16, v18

    move v15, v1

    move/from16 v14, v16

    move/from16 v1, v17

    goto/16 :goto_0

    :cond_3
    move/from16 v17, v1

    const-string v1, "\u1a79\u06dc"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v12

    move-wide/from16 v18, v2

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, -0x3bcb

    const v3, 0x2d7d5417    # 1.4400057E-11f

    xor-int/2addr v2, v3

    const v3, 0x319bcbd9

    xor-int/2addr v1, v3

    move v14, v1

    move v15, v2

    move/from16 v1, v17

    move-wide/from16 v2, v18

    goto/16 :goto_0

    :sswitch_6
    move/from16 v1, p1

    move-object/from16 v14, p3

    move-object/from16 v15, p5

    .line 909
    invoke-static {v1, v0}, Ll/֨֫;->ܺܰ۬(II)I

    move-result v2

    move/from16 v3, p2

    int-to-long v4, v3

    int-to-long v6, v0

    move-object/from16 v0, p0

    .line 910
    iget-object v1, v0, Ll/֫ۨ᩹;->ۨ:Ll/ۛۨ᩹;

    .line 911
    invoke-static {v1}, Ll/֨ۢ;->ۡܳۨ(Ljava/lang/Object;)I

    move-result v16

    .line 881
    sget v17, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v17, :cond_4

    move-wide/from16 v18, v4

    move-wide v4, v6

    move/from16 v7, v16

    move-object v6, v1

    move v1, v2

    goto/16 :goto_7

    :cond_4
    const-string v17, "\u1a76\u06e7"

    invoke-static/range {v17 .. v17}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v13

    xor-int v0, v17, v12

    mul-int/lit16 v0, v0, -0x7e89

    const v18, -0x1995becb

    xor-int v0, v0, v18

    const v18, 0x23be28fb

    xor-int v17, v17, v18

    move v15, v0

    move/from16 v14, v17

    move/from16 v0, p6

    move-wide/from16 v20, v6

    move-object v6, v1

    move v1, v2

    move-wide v2, v4

    move-wide/from16 v4, v20

    move/from16 v7, v16

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    move-wide/from16 v18, v2

    move/from16 v3, p2

    sget v0, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v0, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v0, "\u06e1\u06e0"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x6fcd

    const v2, 0x12f0bb7c

    xor-int/2addr v1, v2

    const v2, 0x45dcea51

    goto/16 :goto_8

    :sswitch_8
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    move-wide/from16 v18, v2

    move/from16 v3, p2

    .line 25
    sget-boolean v0, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v0, :cond_6

    :goto_3
    move/from16 v1, v17

    goto/16 :goto_7

    :cond_6
    const-string v0, "\u06e7\u05ab"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x67

    xor-int v1, v0, v12

    mul-int/lit16 v1, v1, -0x1061

    const v2, -0x94128f2

    xor-int/2addr v1, v2

    const v2, -0x3bec39b3

    goto/16 :goto_8

    :sswitch_9
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    move-wide/from16 v18, v2

    move/from16 v3, p2

    .line 701
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v0

    if-ltz v0, :cond_7

    goto :goto_4

    :cond_7
    const-string v0, "\u1a75\u073a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v12

    mul-int/lit16 v1, v1, -0x255d

    const v2, -0x87539d5

    xor-int/2addr v1, v2

    const v2, 0x5af3a428

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    move-wide/from16 v18, v2

    move/from16 v3, p2

    .line 598
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_3

    :cond_8
    const-string v0, "\u06e7\u06d8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x3345

    const v2, -0x70fceded

    xor-int/2addr v1, v2

    const v2, -0x42edaee4

    goto/16 :goto_8

    :sswitch_b
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    move-wide/from16 v18, v2

    move/from16 v3, p2

    sget v0, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v0, :cond_9

    :goto_4
    const-string v0, "\u06dc\u06d9"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v12

    mul-int/lit16 v1, v1, -0x66cb

    const v2, 0xcc6b726

    xor-int/2addr v1, v2

    const v2, -0x7a242cbb

    goto/16 :goto_8

    :cond_9
    const-string v0, "\u0730\u1a76"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v12

    mul-int/lit16 v1, v1, -0x2967

    const v2, 0x375e271e

    xor-int/2addr v1, v2

    const v2, -0xde99dc2

    goto/16 :goto_8

    :sswitch_c
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    move-wide/from16 v18, v2

    move/from16 v3, p2

    .line 389
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v0

    if-eqz v0, :cond_a

    :goto_5
    const-string v0, "\u0733\u05a8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v12

    mul-int/lit8 v0, v0, -0x4f

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x324d

    const v2, -0x1da0010b

    xor-int/2addr v1, v2

    const v2, -0x7b7427d1

    goto/16 :goto_8

    :cond_a
    const-string v0, "\u05a8\u1a75"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x2805

    const v2, -0x48805352

    xor-int/2addr v1, v2

    const v2, -0x26434195

    goto/16 :goto_8

    :sswitch_d
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    move-wide/from16 v18, v2

    move/from16 v3, p2

    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v0

    if-eqz v0, :cond_b

    :goto_6
    const-string v0, "\u0730\u06db"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x347

    const v2, -0x696557e2

    xor-int/2addr v1, v2

    const v2, 0x6eb859f2

    goto :goto_8

    :cond_b
    const-string v0, "\u06e8\u1a73"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x7d

    xor-int v1, v0, v12

    mul-int/lit16 v1, v1, -0x70ed

    const v2, -0x4e162725

    xor-int/2addr v1, v2

    const v2, 0x42714360

    goto :goto_8

    :sswitch_e
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    move-wide/from16 v18, v2

    move/from16 v3, p2

    .line 297
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_3

    :goto_7
    const-string v0, "\u0733\u06df"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    mul-int/lit8 v0, v0, 0x15

    xor-int v2, v0, v13

    mul-int/lit16 v2, v2, -0x1651

    const v16, 0x64028450    # 9.630443E21f

    xor-int v2, v2, v16

    const v16, -0x6b09ce6b

    xor-int v0, v0, v16

    move v14, v0

    move v15, v2

    goto :goto_9

    :cond_c
    const-string v0, "\u06df\u1a73"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v12

    mul-int/lit8 v0, v0, -0x19

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x74fb

    const v2, -0x64cde5ab

    xor-int/2addr v1, v2

    const v2, -0x2a1c0afa

    :goto_8
    xor-int/2addr v0, v2

    move v14, v0

    move v15, v1

    move/from16 v1, v17

    :goto_9
    move-wide/from16 v2, v18

    move/from16 v0, p6

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79a3b447 -> :sswitch_b
        -0x67416c55 -> :sswitch_e
        -0x656c31de -> :sswitch_8
        -0x6193a75a -> :sswitch_b
        -0x571050a6 -> :sswitch_9
        -0x4dcb6be3 -> :sswitch_4
        -0x4586aab1 -> :sswitch_a
        -0x3c7ef2fc -> :sswitch_d
        -0x1d0d4e2e -> :sswitch_9
        -0x1c2bf694 -> :sswitch_e
        -0x1c21bd5b -> :sswitch_5
        -0x130946aa -> :sswitch_8
        0x1ff455e -> :sswitch_c
        0x1a3c0a51 -> :sswitch_6
        0x1c33716a -> :sswitch_0
        0x1c972dbb -> :sswitch_2
        0x21577830 -> :sswitch_6
        0x31588046 -> :sswitch_1
        0x3275ca17 -> :sswitch_a
        0x39274e3e -> :sswitch_2
        0x417b9bc0 -> :sswitch_3
        0x45b85957 -> :sswitch_3
        0x4987d21a -> :sswitch_0
        0x4d87f3cc -> :sswitch_c
        0x53e0ee1e -> :sswitch_7
        0x5adeb624 -> :sswitch_7
        0x6e78cc45 -> :sswitch_4
        0x6fd7ade5 -> :sswitch_1
        0x76e14ba3 -> :sswitch_d
        0x7c69daa7 -> :sswitch_5
    .end sparse-switch
.end method

.method public static synthetic ۙ(Ll/֫ۨ᩹;II[JII)V
    .locals 17

    move/from16 v0, p5

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const v8, -0x2f67affe

    sget v9, Ll/֫ۚ;->ܽ۠᩹:I

    sget v10, Ll/ۧ;->֫۠ᩴ:I

    const-string v11, "\u1a79\u06e0"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x37

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x2993

    const v13, 0x2d6d6700

    xor-int/2addr v12, v13

    const v13, 0x3afb9809

    xor-int/2addr v11, v13

    :goto_0
    xor-int/2addr v8, v9

    mul-int/lit16 v8, v8, -0x5759

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v8, v12

    xor-int/2addr v8, v11

    sparse-switch v8, :sswitch_data_0

    .line 758
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    sget v11, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v11, :cond_2

    goto :goto_1

    :sswitch_0
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    sget-boolean v11, Ll/֨۟;->ܿ᩻۫:Z

    if-nez v11, :cond_1

    :cond_0
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    goto/16 :goto_4

    :cond_1
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    goto/16 :goto_2

    .line 875
    :sswitch_1
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    sget-boolean v11, Ll/ۗܳ;->ۤᩴۗ:Z

    if-nez v11, :cond_0

    :goto_1
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    goto/16 :goto_3

    :cond_2
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    goto/16 :goto_6

    :sswitch_2
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    goto :goto_1

    .line 850
    :sswitch_3
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    return-void

    :sswitch_4
    long-to-int v0, v6

    sub-int v1, v1, p4

    sub-int v0, v0, p4

    move-object/from16 v11, p3

    .line 944
    invoke-static {v1, v0, v11}, Ll/ۚۖ᩹;->ۙ(II[J)V

    return-void

    :sswitch_5
    move-object/from16 v12, p0

    move-object/from16 v11, p3

    .line 942
    iget-object v6, v12, Ll/֫ۨ᩹;->ۨ:Ll/ۛۨ᩹;

    .line 943
    invoke-static {v6}, Ll/֨֫;->ܿ֡ۜ(Ljava/lang/Object;)I

    move-result v6

    int-to-long v6, v6

    add-long/2addr v6, v4

    .line 942
    invoke-static {v2, v3, v6, v7}, Ll/֡֡;->᩹ᩳ֨(JJ)J

    move-result-wide v6

    .line 889
    sget v13, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v13, :cond_3

    move/from16 v13, p1

    move/from16 v14, p2

    goto/16 :goto_5

    :cond_3
    const-string v13, "\u06eb\u06d7"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v10

    mul-int/lit8 v13, v13, -0x49

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, 0x2beb

    const v15, 0x337074e6

    xor-int/2addr v14, v15

    const v15, 0x70bda311

    xor-int/2addr v13, v15

    move v11, v13

    move v12, v14

    goto/16 :goto_0

    :sswitch_6
    move-object/from16 v12, p0

    move/from16 v13, p1

    move-object/from16 v11, p3

    .line 941
    invoke-static {v13, v0}, Ll/֨֫;->ܺܰ۬(II)I

    move-result v1

    move/from16 v14, p2

    int-to-long v2, v14

    int-to-long v4, v0

    .line 638
    sget v15, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v15, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v15, "\u06d7\u1a77"

    invoke-static {v15}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v15

    sub-int v15, v9, v15

    mul-int/lit8 v15, v15, 0x11

    xor-int v0, v15, v10

    mul-int/lit16 v0, v0, -0x689d

    const v16, 0x2b1007fe

    xor-int v0, v0, v16

    const v16, -0x41efa93b    # -0.140956f

    xor-int v15, v15, v16

    move v12, v0

    move v11, v15

    goto/16 :goto_8

    :sswitch_7
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    .line 33
    sget v0, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v0, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v0, "\u06e1\u06e1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v9

    xor-int v15, v0, v10

    mul-int/lit16 v15, v15, -0x6e5

    const v16, -0x5d49fc39

    xor-int v15, v15, v16

    const v16, 0x317b09b7

    goto/16 :goto_7

    :sswitch_8
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    .line 420
    sget v0, Ll/۟;->ۨᩴۛ:I

    if-ltz v0, :cond_6

    :goto_2
    const-string v0, "\u06d6\u06e1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v9

    mul-int/lit8 v0, v0, -0x33

    xor-int v15, v0, v10

    mul-int/lit16 v15, v15, -0xe13

    const v16, -0x534d5cba

    xor-int v15, v15, v16

    const v16, -0x597b8b82

    goto/16 :goto_7

    :cond_6
    const-string v0, "\u1a77\u06e4"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v10

    mul-int/lit8 v0, v0, -0x9

    xor-int v15, v0, v9

    mul-int/lit16 v15, v15, 0x1325

    const v16, 0x58b5669d

    xor-int v15, v15, v16

    const v16, 0x7a5227e

    goto/16 :goto_7

    :sswitch_9
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    .line 574
    sget v0, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v0, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v0, "\u1a77\u06d9"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v9, v0

    mul-int/lit8 v0, v0, -0x31

    xor-int v15, v0, v10

    mul-int/lit16 v15, v15, -0x27ed

    const v16, 0x24b66a66

    xor-int v15, v15, v16

    const v16, 0x36eba7ac

    goto/16 :goto_7

    :sswitch_a
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    .line 592
    sget-boolean v0, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v0, :cond_8

    :goto_3
    const-string v0, "\u06d9\u0730"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v9

    xor-int v15, v0, v10

    mul-int/lit16 v15, v15, 0xc0f

    const v16, 0x1c437758

    xor-int v15, v15, v16

    const v16, -0x77a29fd5

    goto/16 :goto_7

    :cond_8
    const-string v0, "\u06e0\u1a75"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v10, v0

    mul-int/lit8 v0, v0, 0x29

    xor-int v15, v0, v9

    mul-int/lit16 v15, v15, -0x4ab1

    const v16, -0x37aa6d49

    xor-int v15, v15, v16

    const v16, -0x3190a748

    goto/16 :goto_7

    :sswitch_b
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    .line 697
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v0

    if-eqz v0, :cond_9

    :goto_4
    const-string v0, "\u073a\u1a7a"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v10

    xor-int v15, v0, v9

    mul-int/lit16 v15, v15, -0x5285

    const v16, -0x7de80cff

    xor-int v15, v15, v16

    const v16, -0x7657b432

    goto/16 :goto_7

    :cond_9
    const-string v0, "\u06e0\u1a78"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v9

    xor-int v15, v0, v10

    mul-int/lit16 v15, v15, -0x2023

    const v16, 0xf664306

    xor-int v15, v15, v16

    const v16, 0x2edf0550

    goto/16 :goto_7

    :sswitch_c
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    sget v0, Ll/۟;->ۨᩴۛ:I

    if-ltz v0, :cond_a

    :goto_5
    const-string v0, "\u1a77\u1a77"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v10

    xor-int v15, v0, v9

    mul-int/lit16 v15, v15, 0xdb7

    const v16, -0x22523a4f

    xor-int v15, v15, v16

    const v16, -0x16f4b190

    goto/16 :goto_7

    :cond_a
    const-string v0, "\u06dc\u06e8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v10, v0

    mul-int/lit8 v0, v0, -0x39

    xor-int v15, v0, v9

    mul-int/lit16 v15, v15, -0x586f

    const v16, -0x33ea7aae    # -3.9195976E7f

    xor-int v15, v15, v16

    const v16, 0x593198c7

    goto :goto_7

    :sswitch_d
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    sget v0, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v0, :cond_b

    goto :goto_6

    :cond_b
    const-string v0, "\u073f\u06eb"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v10, v0

    mul-int/lit8 v0, v0, -0x3f

    xor-int v15, v0, v9

    mul-int/lit16 v15, v15, 0x11b5

    const v16, 0x3d8c87e2

    xor-int v15, v15, v16

    const v16, -0x6212a5e7

    goto :goto_7

    :sswitch_e
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    .line 647
    sget v0, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v0, :cond_c

    :goto_6
    const-string v0, "\u06ec\u0733"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v10

    mul-int/lit8 v0, v0, 0x55

    xor-int v15, v0, v9

    mul-int/lit16 v15, v15, 0x25bf

    const v16, -0x5349deac

    xor-int v15, v15, v16

    const v16, -0x1f066a3f

    goto :goto_7

    :cond_c
    const-string v0, "\u05a8\u06d9"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v9

    mul-int/lit8 v0, v0, 0x51

    xor-int v15, v0, v10

    mul-int/lit16 v15, v15, -0x7067

    const v16, -0x111e3d82

    xor-int v15, v15, v16

    const v16, 0x24832e74

    :goto_7
    xor-int v0, v0, v16

    move v11, v0

    move v12, v15

    :goto_8
    move/from16 v0, p5

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x73f718a5 -> :sswitch_2
        -0x6d222e26 -> :sswitch_5
        -0x615313b7 -> :sswitch_1
        -0x4e0b6c0d -> :sswitch_8
        -0x4bf72bf7 -> :sswitch_a
        -0x4aa38f4f -> :sswitch_d
        -0x4a853a47 -> :sswitch_e
        -0x47d635dd -> :sswitch_1
        -0x3ef7c3f0 -> :sswitch_a
        -0x397903f7 -> :sswitch_6
        -0x38f84e53 -> :sswitch_d
        -0x32ad75a9 -> :sswitch_c
        -0x2ff6bf60 -> :sswitch_3
        -0x2e5128e1 -> :sswitch_0
        -0x2153fcb1 -> :sswitch_6
        -0x121d2423 -> :sswitch_b
        -0x816b640 -> :sswitch_4
        0x2125369e -> :sswitch_b
        0x2ea59fe6 -> :sswitch_8
        0x30506bbd -> :sswitch_e
        0x3f14a265 -> :sswitch_4
        0x41374a8b -> :sswitch_9
        0x4856c833 -> :sswitch_7
        0x4f1cddd4 -> :sswitch_7
        0x4f2cd131 -> :sswitch_2
        0x53553b1d -> :sswitch_5
        0x560cfcfb -> :sswitch_0
        0x59c956fe -> :sswitch_9
        0x60138706 -> :sswitch_c
        0x678a6d84 -> :sswitch_3
    .end sparse-switch
.end method

.method private ۨ(II)J
    .locals 48

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const v33, -0x16398085    # -2.9996165E25f

    sget v34, Ll/֫ܽ;->֡ᩴܶ:I

    sget v35, Ll/ۖۧ;->ܺۚۖ:I

    const-string v36, "\u06da\u05ab"

    invoke-static/range {v36 .. v36}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v36

    sub-int v36, v34, v36

    mul-int/lit8 v36, v36, 0x4b

    xor-int v3, v36, v35

    mul-int/lit16 v3, v3, 0x4ce3

    const v38, 0x6e79c2f1

    xor-int v3, v3, v38

    const v38, -0x35d64a2b

    xor-int v36, v36, v38

    move-wide/from16 v38, v12

    const/4 v0, 0x0

    const/16 v37, 0x0

    move-wide/from16 v42, v8

    const/4 v8, 0x0

    move-wide/from16 v44, v10

    const/4 v11, 0x0

    move-wide/from16 v9, v26

    move-wide/from16 v27, v44

    move-wide/from16 v25, v24

    move-wide/from16 v23, v22

    move-wide/from16 v21, v42

    move-wide/from16 v46, v6

    move-wide/from16 v6, v18

    move-wide/from16 v17, v46

    :goto_0
    xor-int v12, v33, v35

    mul-int/lit16 v12, v12, -0x7ff1

    shr-int/lit8 v12, v12, 0x1f

    and-int/2addr v3, v12

    xor-int v33, v36, v3

    sparse-switch v33, :sswitch_data_0

    move/from16 v19, v0

    move-wide/from16 v40, v6

    move-wide/from16 v12, v38

    long-to-int v0, v12

    move v14, v0

    goto/16 :goto_9

    .line 348
    :sswitch_0
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    sget v3, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v3, :cond_0

    :goto_1
    move/from16 v19, v0

    move-wide/from16 v40, v6

    :goto_2
    move-wide/from16 v12, v38

    goto/16 :goto_d

    :cond_0
    move/from16 v19, v0

    move-wide/from16 v40, v6

    goto/16 :goto_7

    :sswitch_1
    sget-boolean v3, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v3, :cond_1

    goto :goto_4

    :cond_1
    move/from16 v19, v0

    move-wide/from16 v40, v6

    :goto_3
    move-wide/from16 v12, v38

    goto/16 :goto_b

    :sswitch_2
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    sget v3, Ll/֡ۚ;->ۢܰ᩸:I

    if-gez v3, :cond_3

    goto :goto_1

    .line 844
    :sswitch_3
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    goto :goto_1

    .line 648
    :sswitch_4
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    const-wide/16 v0, 0x0

    return-wide v0

    :sswitch_5
    int-to-long v0, v11

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    or-long v0, v0, v31

    return-wide v0

    :sswitch_6
    const/16 v3, 0x20

    shl-long v31, v29, v3

    .line 947
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u06d8\u06d9"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v34, v3

    mul-int/lit8 v3, v3, 0x19

    xor-int v12, v3, v35

    mul-int/lit16 v12, v12, 0x790b

    const v13, 0x71026ebd

    xor-int/2addr v12, v13

    const v13, -0x69485a74

    goto/16 :goto_8

    .line 1002
    :sswitch_7
    invoke-static {v6, v7, v9, v10}, Ll/֨᩸;->᩷ܺ֨(JJ)J

    move-result-wide v11

    long-to-int v11, v11

    int-to-long v12, v0

    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_4

    move-wide/from16 v29, v12

    :cond_3
    :goto_4
    const-string v3, "\u06e1\u0736"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    xor-int v12, v3, v34

    mul-int/lit16 v12, v12, 0x4139

    const v13, -0x365712a3

    xor-int/2addr v12, v13

    const v13, 0x3451a368

    goto/16 :goto_8

    :cond_4
    const-string v3, "\u06e1\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    move/from16 v19, v0

    xor-int v0, v3, v34

    mul-int/lit16 v0, v0, -0x47d3

    const v29, 0x4be7edab    # 3.0399318E7f

    xor-int v0, v0, v29

    const v29, -0x2cdc3644

    xor-int v36, v3, v29

    move v3, v0

    move-wide/from16 v29, v12

    goto :goto_6

    :sswitch_8
    move/from16 v19, v0

    add-long v9, v23, v25

    sget v0, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v0, :cond_5

    move-object/from16 v1, p0

    move/from16 v0, v19

    :goto_5
    move-wide/from16 v12, v38

    goto/16 :goto_f

    :cond_5
    const-string v0, "\u1a75\u073f"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v34

    mul-int/lit8 v0, v0, -0xf

    xor-int v3, v0, v35

    mul-int/lit16 v3, v3, 0x6efb

    const v12, -0x64d43b92

    xor-int/2addr v3, v12

    const v12, 0x59608954

    xor-int v36, v0, v12

    :goto_6
    move/from16 v0, v19

    goto/16 :goto_0

    :sswitch_9
    move/from16 v19, v0

    int-to-long v12, v8

    .line 1003
    invoke-static {v5}, Ll/֨֫;->ܿ֡ۜ(Ljava/lang/Object;)I

    move-result v0

    move-wide/from16 v40, v6

    int-to-long v6, v0

    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v0

    if-ltz v0, :cond_6

    move-wide/from16 v25, v6

    move-wide/from16 v23, v12

    goto/16 :goto_3

    :cond_6
    const-string v0, "\u06db\u1a78"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v34

    xor-int v3, v0, v35

    mul-int/lit16 v3, v3, 0x2be9

    const v23, 0x12c9d0f3

    xor-int v3, v3, v23

    const v23, -0x4991837a

    xor-int v36, v0, v23

    move-wide/from16 v25, v6

    move-wide/from16 v23, v12

    goto/16 :goto_13

    :sswitch_a
    move/from16 v19, v0

    move-wide/from16 v40, v6

    add-int v0, v16, v20

    invoke-virtual {v4, v0}, Ll/ۨۖ᩹;->ۨ(I)I

    move-result v8

    .line 552
    sget v0, Ll/ۗ;->֨۬ۖ:I

    if-ltz v0, :cond_7

    goto/16 :goto_2

    :cond_7
    const-string v0, "\u1a73\u06d8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v35, v0

    mul-int/lit8 v0, v0, -0x4b

    xor-int v3, v0, v34

    mul-int/lit16 v3, v3, 0x1e13

    const v6, 0x7bec5fb7

    xor-int/2addr v3, v6

    const v6, -0x20095374

    goto/16 :goto_a

    :sswitch_b
    move/from16 v19, v0

    move-wide/from16 v40, v6

    const/16 v20, -0x1

    sget v0, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v0, :cond_8

    :goto_7
    const-string v0, "\u073a\u073f"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v34

    mul-int/lit8 v0, v0, 0x33

    xor-int v3, v0, v35

    mul-int/lit16 v3, v3, -0x7e8b

    const v6, -0x57c16576

    xor-int/2addr v3, v6

    const v6, -0x5eb29f77

    goto/16 :goto_a

    :cond_8
    const-string v0, "\u06e1\u0733"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v35, v0

    mul-int/lit8 v0, v0, 0x2f

    xor-int v3, v0, v34

    mul-int/lit16 v3, v3, 0x2153

    const v6, 0x71f985da

    xor-int/2addr v3, v6

    const v6, -0x4f69596f

    goto/16 :goto_a

    .line 1001
    :sswitch_c
    invoke-virtual {v4, v15}, Ll/ۨۖ᩹;->ۨ(I)I

    move-result v0

    invoke-static {v1, v0}, Ll/֨ۢ;->᩹᩸֫(II)I

    move-result v0

    int-to-long v6, v2

    .line 191
    sget v3, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v3, :cond_9

    move-object/from16 v1, p0

    goto/16 :goto_5

    :cond_9
    const-string v3, "\u1a7a\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v34

    xor-int v12, v3, v35

    mul-int/lit16 v12, v12, -0x4e15

    const v13, -0x1068e780

    xor-int/2addr v12, v13

    const v13, 0x5287f7d

    :goto_8
    xor-int v36, v3, v13

    move v3, v12

    goto/16 :goto_0

    :sswitch_d
    move/from16 v19, v0

    move-wide/from16 v40, v6

    .line 996
    invoke-static {v4, v14}, Ll/ۨۖ᩹;->ۙ(Ll/ۨۖ᩹;I)I

    move-result v15

    .line 997
    invoke-static {v4, v2}, Ll/ۨۖ᩹;->ۙ(Ll/ۨۖ᩹;I)I

    move-result v0

    if-lt v15, v0, :cond_a

    move-object/from16 v1, p0

    move/from16 v16, v0

    move-wide/from16 v12, v38

    goto/16 :goto_e

    :cond_a
    const-string v3, "\u06db\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v34, v3

    mul-int/lit8 v3, v3, -0x3d

    xor-int v6, v3, v35

    mul-int/lit16 v6, v6, -0x27b1

    const v7, 0x4e82daab

    xor-int/2addr v6, v7

    const v7, 0x2131faad

    xor-int v36, v3, v7

    move/from16 v16, v0

    move v3, v6

    goto/16 :goto_13

    :sswitch_e
    move/from16 v19, v0

    move-wide/from16 v40, v6

    const/high16 v0, -0x80000000

    move-wide/from16 v12, v38

    const/high16 v14, -0x80000000

    :goto_9
    const-string v0, "\u06e8\u06e1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    mul-int/lit8 v0, v0, 0x25

    xor-int v3, v0, v34

    mul-int/lit16 v3, v3, -0x2919

    const v6, -0x357b8c45    # -4340189.5f

    xor-int/2addr v3, v6

    const v6, 0x50c095d1

    goto/16 :goto_c

    :sswitch_f
    move/from16 v19, v0

    move-wide/from16 v40, v6

    const-wide/16 v6, 0x1

    add-long v38, v27, v6

    const-wide/32 v6, -0x80000000

    cmp-long v0, v38, v6

    if-gez v0, :cond_b

    const-string v0, "\u1a79\u06d8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v34

    mul-int/lit8 v0, v0, 0x69

    xor-int v3, v0, v35

    mul-int/lit16 v3, v3, 0x618f

    const v6, 0x1430d78b

    xor-int/2addr v3, v6

    const v6, -0x5e4fdc1d

    goto :goto_a

    :cond_b
    const-string v0, "\u06d9\u073d"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v35

    mul-int/lit8 v0, v0, -0x19

    xor-int v3, v0, v34

    mul-int/lit16 v3, v3, -0x7ded

    const v6, 0x5cffd750

    xor-int/2addr v3, v6

    const v6, -0x79fd7dae

    :goto_a
    xor-int v36, v0, v6

    goto/16 :goto_13

    :sswitch_10
    move/from16 v19, v0

    move-wide/from16 v40, v6

    move-wide/from16 v12, v38

    sub-long v27, v17, v21

    .line 824
    sget v0, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v0, :cond_c

    :goto_b
    const-string v0, "\u1a76\u0730"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v34, v0

    mul-int/lit8 v0, v0, -0x3b

    xor-int v3, v0, v35

    mul-int/lit16 v3, v3, 0x235

    const v6, -0x4245783b

    xor-int/2addr v3, v6

    const v6, -0x12eb3f46

    goto :goto_c

    :cond_c
    const-string v0, "\u1a77\u1a75"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v3, v0, v34

    mul-int/lit16 v3, v3, -0x5a2b

    const v6, 0x7bc7c99f

    xor-int/2addr v3, v6

    const v6, -0x9536102

    :goto_c
    xor-int v36, v0, v6

    goto/16 :goto_12

    :sswitch_11
    move/from16 v19, v0

    move-wide/from16 v40, v6

    move-wide/from16 v12, v38

    int-to-long v6, v1

    .line 994
    invoke-static {v5}, Ll/֨֫;->ܿ֡ۜ(Ljava/lang/Object;)I

    move-result v0

    int-to-long v0, v0

    .line 204
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v3

    if-nez v3, :cond_d

    move-wide/from16 v21, v0

    move-wide/from16 v17, v6

    :goto_d
    const-string v0, "\u1a7b\u06db"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    mul-int/lit8 v0, v0, -0x49

    xor-int v1, v0, v34

    mul-int/lit16 v1, v1, -0x3c2b

    const v3, -0x521f47e5

    xor-int/2addr v3, v1

    const v1, -0x103180f3

    xor-int v36, v0, v1

    goto/16 :goto_11

    :cond_d
    const-string v3, "\u06df\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v34

    move-wide/from16 v17, v0

    xor-int v0, v3, v35

    mul-int/lit16 v0, v0, -0x2a37

    const v1, 0x5c5df636

    xor-int/2addr v0, v1

    const v1, -0x6bd17ce0

    xor-int v36, v3, v1

    move/from16 v1, p1

    move v3, v0

    move-wide/from16 v38, v12

    move-wide/from16 v21, v17

    move/from16 v0, v19

    move-wide/from16 v17, v6

    goto/16 :goto_14

    :sswitch_12
    move/from16 v19, v0

    move-wide/from16 v40, v6

    move-wide/from16 v12, v38

    .line 990
    move-object/from16 v4, v37

    check-cast v4, Ll/ۨۖ᩹;

    invoke-static {v4}, Ll/ۨۖ᩹;->ܰ(Ll/ۨۖ᩹;)I

    move-result v0

    move-object/from16 v1, p0

    .line 991
    iget-object v5, v1, Ll/֫ۨ᩹;->ۨ:Ll/ۛۨ᩹;

    invoke-static {v5}, Ll/֨֫;->ܿ֡ۜ(Ljava/lang/Object;)I

    move-result v3

    if-eq v0, v3, :cond_e

    goto :goto_e

    :cond_e
    const-string v0, "\u05a8\u06dc"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v3, v0, v34

    mul-int/lit16 v3, v3, 0x73ad

    const v6, 0x1ed084dd

    xor-int/2addr v3, v6

    const v6, 0x21086aab

    goto/16 :goto_10

    :sswitch_13
    move-object/from16 v1, p0

    const-wide/16 v2, -0x1

    return-wide v2

    :sswitch_14
    move-object/from16 v1, p0

    move/from16 v19, v0

    move-wide/from16 v40, v6

    move-wide/from16 v12, v38

    .line 990
    iget-object v0, v1, Ll/֫ۨ᩹;->ۖ:Ll/ܰۖ᩹;

    instance-of v3, v0, Ll/ۨۖ᩹;

    if-eqz v3, :cond_f

    const-string v3, "\u1a78\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v34, v3

    mul-int/lit8 v3, v3, 0x7

    xor-int v6, v3, v35

    mul-int/lit16 v6, v6, 0x2467

    const v7, -0x3b427d8f

    xor-int/2addr v6, v7

    const v7, -0x609ec34d

    xor-int v36, v3, v7

    move/from16 v1, p1

    move-object/from16 v37, v0

    move v3, v6

    goto :goto_12

    :cond_f
    move-object/from16 v37, v0

    :goto_e
    const-string v0, "\u05a8\u1a7b"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v35, v0

    mul-int/lit8 v0, v0, -0x79

    xor-int v3, v0, v34

    mul-int/lit16 v3, v3, 0x6f9b

    const v6, 0x65924de9

    xor-int/2addr v3, v6

    const v6, -0x2d50ea39

    goto :goto_10

    :sswitch_15
    move-object/from16 v1, p0

    move/from16 v19, v0

    move-wide/from16 v40, v6

    move-wide/from16 v12, v38

    .line 663
    sget-boolean v0, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v0, :cond_10

    move/from16 v0, v19

    move-wide/from16 v6, v40

    :goto_f
    const-string v3, "\u0733\u06ec"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    move/from16 v19, v0

    xor-int v0, v3, v34

    mul-int/lit16 v0, v0, 0x49bd

    const v36, -0x3ea072fe

    xor-int v0, v0, v36

    const v36, -0x7d8b57c7

    xor-int v36, v3, v36

    move/from16 v1, p1

    move v3, v0

    move-wide/from16 v38, v12

    goto/16 :goto_6

    :cond_10
    const-string v0, "\u06e7\u1a78"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v34

    mul-int/lit8 v0, v0, -0x5b

    xor-int v3, v0, v35

    mul-int/lit16 v3, v3, 0x53f7

    const v6, -0x2e55402c

    xor-int/2addr v3, v6

    const v6, 0x196e900d

    :goto_10
    xor-int v36, v0, v6

    :goto_11
    move/from16 v1, p1

    :goto_12
    move-wide/from16 v38, v12

    :goto_13
    move/from16 v0, v19

    :goto_14
    move-wide/from16 v6, v40

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e8970f9 -> :sswitch_11
        -0x79612932 -> :sswitch_f
        -0x6c1a4f00 -> :sswitch_5
        -0x696236aa -> :sswitch_6
        -0x5cedecd2 -> :sswitch_6
        -0x568764e4 -> :sswitch_12
        -0x3a20c9df -> :sswitch_15
        -0x289e2dfa -> :sswitch_c
        -0x1fe5abed -> :sswitch_b
        -0x1d445025 -> :sswitch_14
        -0x19a16f0b -> :sswitch_1
        -0x128ecfab -> :sswitch_12
        -0x119d0d11 -> :sswitch_4
        -0x1168c9ed -> :sswitch_b
        -0xdbab732 -> :sswitch_0
        -0xa9ef2e0 -> :sswitch_c
        -0x8990ef1 -> :sswitch_4
        -0x29c7c8f -> :sswitch_9
        0x42a997e -> :sswitch_0
        0x102fb32f -> :sswitch_e
        0x11f13768 -> :sswitch_3
        0x1243b64b -> :sswitch_8
        0x17631544 -> :sswitch_a
        0x20d1e030 -> :sswitch_f
        0x2253ef63 -> :sswitch_13
        0x22c84ade -> :sswitch_15
        0x2556f8cb -> :sswitch_d
        0x28416a55 -> :sswitch_a
        0x2a923f01 -> :sswitch_14
        0x2b9c0bfa -> :sswitch_13
        0x3c15c38b -> :sswitch_5
        0x40214476 -> :sswitch_9
        0x415b6445 -> :sswitch_2
        0x446079f3 -> :sswitch_3
        0x4f75c50e -> :sswitch_7
        0x5139da71 -> :sswitch_11
        0x5377da5a -> :sswitch_e
        0x57dc7d71 -> :sswitch_1
        0x5dd2e716 -> :sswitch_8
        0x5f9a4c05 -> :sswitch_2
        0x67f41082 -> :sswitch_d
        0x753fcd88 -> :sswitch_10
        0x76a42a33 -> :sswitch_7
        0x7f922da8 -> :sswitch_10
    .end sparse-switch
.end method


# virtual methods
.method public final ۙ()J
    .locals 2

    .line 966
    iget-object v0, p0, Ll/֫ۨ᩹;->ۖ:Ll/ܰۖ᩹;

    invoke-virtual {v0}, Ll/ܰۖ᩹;->ۙ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۙ(II[J)V
    .locals 16

    move-object/from16 v6, p0

    move/from16 v5, p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const v8, 0xfaccd75

    sget v9, Ll/֫֡;->ۡ᩹ۗ:I

    sget v10, Ll/ۖܽ;->ܳ۠᩹:I

    const-string v11, "\u0730\u06d9"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x209d

    const v13, 0xbaa82e9

    xor-int/2addr v12, v13

    const v13, 0x7adfa45c

    xor-int/2addr v11, v13

    const/4 v0, 0x0

    const v1, 0xfaccd75

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    xor-int/2addr v1, v9

    mul-int/lit16 v1, v1, -0x6c9

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v12

    xor-int/2addr v1, v11

    sparse-switch v1, :sswitch_data_0

    move/from16 v12, p2

    move-object/from16 v11, p3

    .line 21
    sget v13, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v13, :cond_7

    const-string v13, "\u06df\u0733"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v10, v13

    mul-int/lit8 v13, v13, 0x7f

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, 0x20bb

    const v15, 0x6b142f98

    xor-int/2addr v14, v15

    const v15, -0x31aaf373

    goto/16 :goto_8

    .line 526
    :sswitch_0
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    sget v11, Ll/֡֡;->᩶ۤ۠:I

    if-lez v11, :cond_1

    :cond_0
    :goto_1
    move/from16 v12, p2

    move-object/from16 v11, p3

    goto/16 :goto_5

    :cond_1
    move/from16 v12, p2

    move-object/from16 v11, p3

    goto/16 :goto_7

    .line 616
    :sswitch_1
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    sget v11, Ll/ۗ;->֨۬ۖ:I

    if-gez v11, :cond_2

    goto :goto_1

    :cond_2
    move/from16 v12, p2

    move-object/from16 v11, p3

    goto/16 :goto_4

    .line 57
    :sswitch_2
    sget v11, Ll/ۖܽ;->ܳ۠᩹:I

    if-lez v11, :cond_0

    :goto_2
    move/from16 v12, p2

    move-object/from16 v11, p3

    goto/16 :goto_6

    .line 4
    :sswitch_3
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    goto :goto_2

    :sswitch_4
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    return-void

    :sswitch_5
    sub-int/2addr v4, v5

    sub-int/2addr v0, v5

    move-object/from16 v11, p3

    .line 936
    invoke-static {v4, v0, v11}, Ll/ۚۖ᩹;->ۙ(II[J)V

    return-void

    :sswitch_6
    move-object/from16 v11, p3

    const/16 v0, 0x20

    ushr-long v12, v2, v0

    long-to-int v4, v12

    long-to-int v0, v2

    .line 485
    sget v12, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v12, :cond_3

    move/from16 v12, p2

    goto/16 :goto_6

    :cond_3
    const-string v12, "\u06eb\u06e8"

    invoke-static {v12}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v9

    mul-int/lit8 v12, v12, 0x1d

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, -0xcdb

    const v14, 0x20b6351b

    xor-int/2addr v13, v14

    const v14, 0x2950a9fe

    goto :goto_3

    :sswitch_7
    move-object/from16 v11, p3

    .line 939
    iget-object v12, v6, Ll/֫ۨ᩹;->ۨ:Ll/ۛۨ᩹;

    invoke-static {v12}, Ll/֨֫;->ܿ֡ۜ(Ljava/lang/Object;)I

    move-result v12

    new-instance v13, Ll/ܳۨ᩹;

    sget-boolean v14, Ll/᩶;->ۚۤۘ:Z

    if-eqz v14, :cond_4

    move/from16 v12, p2

    goto/16 :goto_7

    :cond_4
    move-object v0, v13

    move-object/from16 v1, p0

    move v2, v7

    move v3, v8

    move-object/from16 v4, p3

    move/from16 v5, p1

    invoke-direct/range {v0 .. v5}, Ll/ܳۨ᩹;-><init>(Ll/֫ۨ᩹;II[JI)V

    iget-object v0, v6, Ll/֫ۨ᩹;->ۖ:Ll/ܰۖ᩹;

    invoke-virtual {v0, v7, v8, v12, v13}, Ll/ܰۖ᩹;->ۙ(IIILl/ܺۨ᩹;)V

    :sswitch_8
    return-void

    :sswitch_9
    move-object/from16 v11, p3

    .line 932
    invoke-direct {v6, v7, v8}, Ll/֫ۨ᩹;->ۨ(II)J

    move-result-wide v2

    const-wide/16 v12, -0x1

    cmp-long v14, v2, v12

    if-eqz v14, :cond_5

    const-string v12, "\u05ab\u06eb"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    mul-int/lit8 v12, v12, 0x59

    xor-int v13, v12, v9

    mul-int/lit16 v13, v13, -0x2fc1

    const v14, -0x47a5ecc2

    xor-int/2addr v13, v14

    const v14, -0x38ef72ae

    goto :goto_3

    :cond_5
    const-string v12, "\u06e7\u0730"

    invoke-static {v12}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v12

    add-int/2addr v12, v9

    mul-int/lit8 v12, v12, -0x77

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, -0xc09

    const v14, 0x3835111c

    xor-int/2addr v13, v14

    const v14, 0x66a32870

    :goto_3
    xor-int/2addr v12, v14

    move v11, v12

    move v12, v13

    goto/16 :goto_0

    :sswitch_a
    move-object/from16 v11, p3

    .line 927
    iget v7, v6, Ll/֫ۨ᩹;->ܰ:I

    invoke-static {v5, v7}, Ll/֨֫;->ܺܰ۬(II)I

    move-result v7

    .line 928
    iget v8, v6, Ll/֫ۨ᩹;->ۙ:I

    move/from16 v12, p2

    invoke-static {v12, v8}, Ll/֡ۛ;->᩶ۡۖ(II)I

    move-result v8

    if-lt v7, v8, :cond_6

    const-string v13, "\u06e4\u06e1"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v10

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, -0x933

    const v15, 0x79b82043

    xor-int/2addr v14, v15

    const v15, 0x4898fe57

    goto/16 :goto_8

    :cond_6
    const-string v13, "\u06e0\u05a8"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v9

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, 0x39cf

    const v15, -0x7e4401a7

    xor-int/2addr v14, v15

    const v15, 0x20db2c3

    goto/16 :goto_8

    :cond_7
    const-string v13, "\u1a78\u06da"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v9

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, 0x139

    const v15, 0x50e73ae2

    xor-int/2addr v14, v15

    const v15, -0x7d520916

    goto/16 :goto_8

    :sswitch_b
    move/from16 v12, p2

    move-object/from16 v11, p3

    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v13

    if-nez v13, :cond_8

    :goto_4
    const-string v13, "\u1a7b\u06d6"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v9

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, -0x4547

    const v15, 0x2c0eb996

    xor-int/2addr v14, v15

    const v15, -0x3da037ea

    goto/16 :goto_8

    :cond_8
    const-string v13, "\u0736\u06d9"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v10, v13

    mul-int/lit8 v13, v13, -0x65

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, -0x2bbd

    const v15, -0x71aba4e7

    xor-int/2addr v14, v15

    const v15, -0x6ec17baf

    goto/16 :goto_8

    :sswitch_c
    move/from16 v12, p2

    move-object/from16 v11, p3

    .line 11
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v13

    if-ltz v13, :cond_9

    goto :goto_5

    :cond_9
    const-string v13, "\u06da\u0733"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v9

    mul-int/lit8 v13, v13, 0x35

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, 0x5bc7

    const v15, -0x28bbe64d

    xor-int/2addr v14, v15

    const v15, -0x261fd6a1

    goto/16 :goto_8

    :sswitch_d
    move/from16 v12, p2

    move-object/from16 v11, p3

    sget-boolean v13, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v13, :cond_a

    goto/16 :goto_7

    :cond_a
    const-string v13, "\u0733\u06ec"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v10

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, 0x7daf

    const v15, -0x615e2771

    xor-int/2addr v14, v15

    const v15, -0x24f38b11

    goto/16 :goto_8

    :sswitch_e
    move/from16 v12, p2

    move-object/from16 v11, p3

    .line 871
    sget-boolean v13, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v13, :cond_b

    goto :goto_5

    :cond_b
    const-string v13, "\u06d9\u06d6"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v10, v13

    mul-int/lit8 v13, v13, -0x43

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, 0x629

    const v15, 0x5124a175

    xor-int/2addr v14, v15

    const v15, -0xf6aedf2

    goto/16 :goto_8

    :sswitch_f
    move/from16 v12, p2

    move-object/from16 v11, p3

    sget-boolean v13, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v13, :cond_c

    :goto_5
    const-string v13, "\u06db\u06e4"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v10

    mul-int/lit8 v13, v13, -0x7f

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, 0x2581

    const v15, 0x26e6119f

    xor-int/2addr v14, v15

    const v15, -0x6f053879

    goto/16 :goto_8

    :cond_c
    const-string v13, "\u06d9\u06e0"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v9

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, -0x39ef

    const v15, 0x98923b5

    xor-int/2addr v14, v15

    const v15, -0xa5c565c

    goto :goto_8

    :sswitch_10
    move/from16 v12, p2

    move-object/from16 v11, p3

    .line 261
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v13

    if-eqz v13, :cond_d

    :goto_6
    const-string v13, "\u1a77\u06d9"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v10

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, 0x4ef5

    const v15, -0x7bb00122

    xor-int/2addr v14, v15

    const v15, 0x436a7841

    goto :goto_8

    :cond_d
    const-string v13, "\u05ab\u06d9"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v9

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, -0x42df

    const v15, -0x15f8cbdd

    xor-int/2addr v14, v15

    const v15, -0x20169ff5

    goto :goto_8

    :sswitch_11
    move/from16 v12, p2

    move-object/from16 v11, p3

    .line 803
    sget-boolean v13, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v13, :cond_e

    :goto_7
    const-string v13, "\u06d6\u05ab"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v9, v13

    mul-int/lit8 v13, v13, 0x7d

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, -0x93d

    const v15, -0x3533f414    # -6686198.0f

    xor-int/2addr v14, v15

    const v15, 0x69ce9e71

    goto :goto_8

    :cond_e
    const-string v13, "\u1a78\u05a1"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v10

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, 0x4b31

    const v15, 0x57967a48

    xor-int/2addr v14, v15

    const v15, 0x16ab36b9

    :goto_8
    xor-int/2addr v13, v15

    move v11, v13

    move v12, v14

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x787314da -> :sswitch_f
        -0x71d55ca4 -> :sswitch_7
        -0x71531fa6 -> :sswitch_b
        -0x713efbd6 -> :sswitch_a
        -0x6b3cefcd -> :sswitch_b
        -0x6a7e31aa -> :sswitch_11
        -0x65c631f2 -> :sswitch_2
        -0x658f6a39 -> :sswitch_8
        -0x5239b0e0 -> :sswitch_e
        -0x51feec45 -> :sswitch_3
        -0x4c1ddc14 -> :sswitch_0
        -0x43d5cff5 -> :sswitch_e
        -0x3ecfcfac -> :sswitch_3
        -0x3b681734 -> :sswitch_c
        -0x2e22293d -> :sswitch_c
        -0x2ab7eb71 -> :sswitch_1
        -0x25340fd5 -> :sswitch_a
        -0x24e83386 -> :sswitch_7
        -0x1cb02e0e -> :sswitch_f
        -0xca825b8 -> :sswitch_d
        -0x6e10f90 -> :sswitch_4
        0xa1f0a -> :sswitch_2
        0x93376aa -> :sswitch_10
        0x2adad538 -> :sswitch_5
        0x3a3aacd8 -> :sswitch_6
        0x3b77d64f -> :sswitch_5
        0x3c3b968e -> :sswitch_9
        0x40ca44a7 -> :sswitch_1
        0x4a1d4967 -> :sswitch_d
        0x55f29252 -> :sswitch_10
        0x57035810 -> :sswitch_8
        0x5a6855a8 -> :sswitch_9
        0x5b5081f1 -> :sswitch_6
        0x5cf23939 -> :sswitch_4
        0x63e16877 -> :sswitch_0
        0x65443bcf -> :sswitch_11
    .end sparse-switch
.end method

.method public final ۙ(I[BII)V
    .locals 25

    move-object/from16 v7, p0

    move/from16 v6, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v8, 0x0

    const/4 v5, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const v17, -0x3430e819    # -2.7144142E7f

    sget v18, Ll/֫֡;->ۡ᩹ۗ:I

    sget v19, Ll/֨᩺;->۬᩺ܰ:I

    const-string v20, "\u1a75\u073f"

    invoke-static/range {v20 .. v20}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v20

    xor-int v20, v20, v18

    mul-int/lit8 v20, v20, 0x55

    xor-int v0, v20, v19

    mul-int/lit16 v0, v0, 0x6e55

    const v22, -0x4af3e97c

    xor-int v0, v0, v22

    const v22, 0x45c6469c

    xor-int v20, v20, v22

    move-object v10, v5

    move-object v13, v12

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v21, 0x0

    move-wide v11, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_0
    xor-int v3, v17, v19

    mul-int/lit16 v3, v3, 0x68e9

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v0, v3

    xor-int v17, v20, v0

    sparse-switch v17, :sswitch_data_0

    .line 876
    invoke-static {v2}, Ll/֨ۢ;->ۡܳۨ(Ljava/lang/Object;)I

    move-result v7

    new-instance v11, Ll/᩻ۨ᩹;

    move-object v0, v11

    move-object/from16 v1, p0

    move v2, v8

    move v3, v9

    move-object/from16 v4, p2

    move/from16 v5, p4

    move/from16 v6, p1

    invoke-direct/range {v0 .. v6}, Ll/᩻ۨ᩹;-><init>(Ll/֫ۨ᩹;II[BII)V

    invoke-virtual {v10, v8, v9, v7, v11}, Ll/ܰۖ᩹;->ۙ(IIILl/ܺۨ᩹;)V

    return-void

    .line 508
    :sswitch_0
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_1
    move/from16 v3, p3

    goto/16 :goto_9

    :cond_1
    move/from16 v3, p3

    move/from16 v20, v1

    goto/16 :goto_8

    :sswitch_1
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    sget v0, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v0, :cond_0

    :goto_2
    move/from16 v3, p3

    move/from16 v20, v1

    goto/16 :goto_b

    .line 425
    :sswitch_2
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    sget v0, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v0, :cond_2

    goto :goto_2

    :cond_2
    const-string v0, "\u06e0\u05a1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v19

    mul-int/lit8 v0, v0, -0x33

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x6b3d

    const v20, -0x4aa492e0

    xor-int v3, v3, v20

    const v20, 0x2a0c50c1

    goto/16 :goto_4

    .line 716
    :sswitch_3
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    goto :goto_2

    .line 794
    :sswitch_4
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    return-void

    .line 872
    :sswitch_5
    invoke-static {v2}, Ll/ۛۨ᩹;->ۙ(Ll/ۛۨ᩹;)[B

    move-result-object v0

    add-int v2, p4, v1

    sub-int/2addr v2, v6

    sub-int/2addr v5, v1

    move-object/from16 v3, p2

    invoke-static {v7, v0, v2, v3, v5}, Ll/ۚۖ᩹;->ۙ(I[BI[BI)V

    return-void

    :sswitch_6
    move-object/from16 v3, p2

    add-int v0, v16, v15

    move v7, v0

    goto :goto_3

    :sswitch_7
    move-object/from16 v3, p2

    xor-int v0, v14, v15

    shr-int/lit8 v0, v0, 0x1f

    or-int/2addr v0, v4

    if-lez v0, :cond_3

    move/from16 v7, v16

    goto :goto_3

    :cond_3
    const-string v0, "\u1a7a\u06e8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v19

    mul-int/lit16 v3, v3, 0x1199

    const v20, -0x5fb3233d

    xor-int v3, v3, v20

    xor-int/lit16 v0, v0, -0x281d

    move/from16 v20, v0

    goto :goto_5

    .line 870
    :sswitch_8
    invoke-static {v13}, Ll/ۨۖ᩹;->ۙ(Ll/ۨۖ᩹;)I

    move-result v0

    sub-int v14, v1, v0

    .line 871
    invoke-static {v2}, Ll/֨ۢ;->ۡܳۨ(Ljava/lang/Object;)I

    move-result v15

    .line 0
    rem-int v16, v14, v15

    if-nez v16, :cond_4

    move/from16 v7, v21

    :goto_3
    const-string v0, "\u06ec\u06ec"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x33

    xor-int v3, v0, v19

    mul-int/lit16 v3, v3, 0xcff

    const v20, -0x1ee57a87

    xor-int v3, v3, v20

    const v20, -0xb32a0d5

    goto :goto_4

    :cond_4
    const-string v0, "\u1a78\u1a75"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v19

    mul-int/lit8 v0, v0, -0x4b

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x3eb1

    const v20, 0x6971bc35

    xor-int v3, v3, v20

    const v20, -0x4eb5df4a

    goto :goto_4

    :sswitch_9
    const/16 v0, 0x20

    ushr-long v0, v11, v0

    long-to-int v1, v0

    long-to-int v5, v11

    .line 870
    move-object v13, v10

    check-cast v13, Ll/ۨۖ᩹;

    .line 421
    sget v0, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v0, :cond_5

    goto/16 :goto_1

    :cond_5
    const-string v0, "\u06da\u06e7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x592d

    const v20, 0x2d1d1183

    xor-int v3, v3, v20

    const v20, -0x1319c6d

    :goto_4
    xor-int v20, v0, v20

    :goto_5
    move v0, v3

    goto/16 :goto_0

    :sswitch_a
    add-int v0, p4, v8

    sub-int v6, v0, v6

    .line 862
    invoke-static {v2}, Ll/ۛۨ᩹;->ۙ(Ll/ۛۨ᩹;)[B

    move-result-object v0

    aget-byte v5, v0, v21

    move-object/from16 v0, p0

    iget-object v1, v0, Ll/֫ۨ᩹;->ۖ:Ll/ܰۖ᩹;

    move-object/from16 v2, p2

    move v3, v8

    move v4, v9

    invoke-virtual/range {v1 .. v6}, Ll/ܰۖ᩹;->ۙ([BIIBI)V

    return-void

    :sswitch_b
    move-object/from16 v0, p0

    .line 866
    invoke-direct {v0, v8, v9}, Ll/֫ۨ᩹;->ۨ(II)J

    move-result-wide v11

    const-wide/16 v22, -0x1

    .line 867
    iget-object v10, v0, Ll/֫ۨ᩹;->ۖ:Ll/ܰۖ᩹;

    cmp-long v3, v11, v22

    if-eqz v3, :cond_6

    const-string v3, "\u06e0\u05ab"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v18

    mul-int/lit8 v3, v3, 0x55

    move/from16 v20, v1

    xor-int v1, v3, v19

    mul-int/lit16 v1, v1, -0x692b

    const v22, -0x16590931

    xor-int v1, v1, v22

    const v22, -0x424048f6

    xor-int v3, v3, v22

    move v0, v1

    move/from16 v1, v20

    move/from16 v20, v3

    goto/16 :goto_0

    :cond_6
    move/from16 v20, v1

    const-string v1, "\u06da\u1a7b"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x3b

    xor-int v3, v1, v19

    mul-int/lit16 v3, v3, 0x5c03

    const v22, 0x36ece2c3

    xor-int v3, v3, v22

    const v22, -0x343cbe20    # -2.5592768E7f

    goto :goto_6

    :sswitch_c
    move-object/from16 v0, p0

    return-void

    :sswitch_d
    move-object/from16 v0, p0

    move/from16 v20, v1

    .line 861
    iget-object v2, v0, Ll/֫ۨ᩹;->ۨ:Ll/ۛۨ᩹;

    invoke-static {v2}, Ll/֨֫;->ܿ֡ۜ(Ljava/lang/Object;)I

    move-result v1

    const/16 v21, 0x0

    const/4 v4, 0x1

    if-ne v1, v4, :cond_7

    const-string v1, "\u05a8\u1a74"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x489d

    const v22, -0x30d1129a

    xor-int v3, v3, v22

    const v22, -0x4455527f

    goto :goto_6

    :cond_7
    const-string v1, "\u06dc\u06e4"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x31

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x4c4d

    const v22, 0x414ee40a

    xor-int v3, v3, v22

    const v22, 0x3cf6b0bc

    :goto_6
    xor-int v1, v1, v22

    move v0, v3

    goto :goto_7

    :sswitch_e
    move-object/from16 v0, p0

    move/from16 v20, v1

    .line 856
    iget v1, v0, Ll/֫ۨ᩹;->ܰ:I

    invoke-static {v6, v1}, Ll/֨֫;->ܺܰ۬(II)I

    move-result v8

    .line 857
    iget v1, v0, Ll/֫ۨ᩹;->ۙ:I

    move/from16 v3, p3

    invoke-static {v3, v1}, Ll/֡۠;->ܺ۬ܺ(II)I

    move-result v9

    if-lt v8, v9, :cond_8

    const-string v1, "\u0733\u1a76"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x27

    xor-int v0, v1, v19

    mul-int/lit16 v0, v0, 0x1207

    const v22, 0x15bbcc4b

    xor-int v0, v0, v22

    const v22, -0x7444b759

    xor-int v1, v1, v22

    :goto_7
    move/from16 v24, v20

    move/from16 v20, v1

    goto/16 :goto_d

    :cond_8
    const-string v0, "\u1a74\u1a73"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x69

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x6dd

    const v22, 0x402a27a8

    xor-int v1, v1, v22

    const v22, -0x26885e24

    goto/16 :goto_c

    :sswitch_f
    move/from16 v3, p3

    move/from16 v20, v1

    .line 814
    sget v0, Ll/ۗ;->֨۬ۖ:I

    if-ltz v0, :cond_9

    goto/16 :goto_a

    :cond_9
    const-string v0, "\u06dc\u06d7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    mul-int/lit8 v0, v0, 0x57

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x14e7

    const v22, -0x3c7f9f58

    xor-int v1, v1, v22

    const v22, 0x106cf286

    goto/16 :goto_c

    :sswitch_10
    move/from16 v3, p3

    move/from16 v20, v1

    .line 416
    sget v0, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v0, :cond_a

    goto :goto_8

    :cond_a
    const-string v0, "\u06eb\u1a75"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x6b

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x6167

    const v22, 0x3e37fd19

    xor-int v1, v1, v22

    const v22, -0x69dfa7f6

    goto/16 :goto_c

    :sswitch_11
    move/from16 v3, p3

    move/from16 v20, v1

    .line 830
    sget v0, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v0, :cond_b

    goto :goto_8

    :cond_b
    const-string v0, "\u0733\u1a74"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v19

    mul-int/lit8 v0, v0, 0x21

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x26f

    const v22, -0x6c7c5fdd

    xor-int v1, v1, v22

    const v22, -0x2a67e54e

    goto/16 :goto_c

    :sswitch_12
    move/from16 v3, p3

    move/from16 v20, v1

    sget v0, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v0, :cond_c

    :goto_8
    const-string v0, "\u1a7a\u06e1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x13d5

    const v22, 0x49409722    # 788850.1f

    xor-int v1, v1, v22

    const v22, -0x787a5892

    goto/16 :goto_c

    :cond_c
    const-string v0, "\u06e0\u06e2"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x2487

    const v22, 0x769f6cad

    xor-int v1, v1, v22

    const v22, -0x76880931

    goto/16 :goto_c

    :sswitch_13
    move/from16 v3, p3

    move/from16 v20, v1

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v0

    if-nez v0, :cond_d

    move/from16 v1, v20

    :goto_9
    const-string v0, "\u06da\u1a74"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    move/from16 v20, v1

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, -0x5bc7

    const v22, 0x1abdd2ac

    xor-int v1, v1, v22

    const v22, 0x4b32e734    # 1.1724596E7f

    goto/16 :goto_c

    :cond_d
    const-string v0, "\u06d6\u05a8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v19

    mul-int/lit8 v0, v0, -0x5f

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x2235

    const v22, -0x201bc776

    xor-int v1, v1, v22

    const v22, -0x4e209258

    goto/16 :goto_c

    :sswitch_14
    move/from16 v3, p3

    move/from16 v20, v1

    .line 485
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v0

    if-gtz v0, :cond_e

    goto/16 :goto_b

    :cond_e
    const-string v0, "\u06e2\u0730"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x67

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x743

    const v22, 0x58ecabe0

    xor-int v1, v1, v22

    const v22, -0x7b291ed4

    goto/16 :goto_c

    :sswitch_15
    move/from16 v3, p3

    move/from16 v20, v1

    .line 48
    sget v0, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v0, :cond_f

    goto :goto_a

    :cond_f
    const-string v0, "\u1a79\u0730"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0xc27

    const v22, -0x4b0447c7

    xor-int v1, v1, v22

    const v22, 0x2a82607d

    goto :goto_c

    :sswitch_16
    move/from16 v3, p3

    move/from16 v20, v1

    .line 49
    sget-boolean v0, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v0, :cond_10

    :goto_a
    const-string v0, "\u1a75\u1a78"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x7519

    const v22, -0x7287186c

    xor-int v1, v1, v22

    const v22, -0x7ec8527e

    goto :goto_c

    :cond_10
    const-string v0, "\u1a79\u05a1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0xf

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x3ed5

    const v22, 0x72bdf0d0

    xor-int v1, v1, v22

    const v22, -0x3136792f

    goto :goto_c

    :sswitch_17
    move/from16 v3, p3

    move/from16 v20, v1

    .line 290
    sget v0, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v0, :cond_11

    :goto_b
    const-string v0, "\u073f\u06e8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v19, v0

    mul-int/lit8 v0, v0, -0x7b

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x771b

    const v22, 0x7ac6a89

    xor-int v1, v1, v22

    const v22, 0x5e5ab72d

    goto :goto_c

    :cond_11
    const-string v0, "\u1a79\u073a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x5c29

    const v22, 0x75f5e7e7

    xor-int v1, v1, v22

    const v22, -0x3203df9

    :goto_c
    xor-int v0, v0, v22

    move/from16 v24, v20

    move/from16 v20, v0

    move v0, v1

    :goto_d
    move/from16 v1, v24

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d4d44da -> :sswitch_d
        -0x7b67d5f1 -> :sswitch_f
        -0x7634532f -> :sswitch_e
        -0x67d9ee4a -> :sswitch_17
        -0x64952ce5 -> :sswitch_f
        -0x58662e12 -> :sswitch_6
        -0x55c5e635 -> :sswitch_14
        -0x4c7c8d53 -> :sswitch_e
        -0x4599cedd -> :sswitch_8
        -0x43355011 -> :sswitch_9
        -0x30da7a2a -> :sswitch_5
        -0x2eede892 -> :sswitch_11
        -0x2790ca6b -> :sswitch_7
        -0x26ae217e -> :sswitch_0
        -0x258d7104 -> :sswitch_0
        -0x20c12f12 -> :sswitch_b
        -0x1edea1be -> :sswitch_10
        -0x1ba65474 -> :sswitch_9
        -0x1a4cd7ce -> :sswitch_6
        -0x5575c4c -> :sswitch_13
        -0x554300e -> :sswitch_3
        -0x3d6dcf3 -> :sswitch_c
        -0xdead30 -> :sswitch_14
        -0xbe9db2 -> :sswitch_a
        0x2d00618 -> :sswitch_4
        0x894d324 -> :sswitch_12
        0x1357344d -> :sswitch_2
        0x13c1bcf6 -> :sswitch_c
        0x142b7837 -> :sswitch_13
        0x1b7d8d15 -> :sswitch_12
        0x1c260621 -> :sswitch_17
        0x1f297fea -> :sswitch_15
        0x251e1ebf -> :sswitch_4
        0x26358920 -> :sswitch_7
        0x297cf09c -> :sswitch_16
        0x29a32b2f -> :sswitch_15
        0x2b6eb1a4 -> :sswitch_8
        0x3f91ecbe -> :sswitch_11
        0x41466773 -> :sswitch_16
        0x4c68c0bb -> :sswitch_1
        0x522695b3 -> :sswitch_1
        0x5afed8fe -> :sswitch_3
        0x5c597cc9 -> :sswitch_10
        0x66a34be0 -> :sswitch_d
        0x689a38d2 -> :sswitch_5
        0x6e0a6d37 -> :sswitch_a
        0x7578f999 -> :sswitch_b
        0x7f5e904a -> :sswitch_2
    .end sparse-switch
.end method

.method public final ۙ(Ljava/io/DataOutputStream;III)V
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v20, 0x56e63509

    sget v21, Ll/֫ۚ;->ܽ۠᩹:I

    sget v22, Ll/ۗᩳ;->ۚۤ֡:I

    const-string v23, "\u05a8\u06e1"

    invoke-static/range {v23 .. v23}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v23

    xor-int v23, v23, v21

    xor-int v3, v23, v22

    mul-int/lit16 v3, v3, -0x3999

    const v25, -0x2d29379c

    xor-int v3, v3, v25

    const v25, -0xb913f9e

    xor-int v23, v23, v25

    move-wide/from16 v24, v8

    move-wide v13, v12

    move-object/from16 v6, v16

    const/4 v0, 0x0

    const/4 v4, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v26, 0x0

    move-object/from16 v16, v5

    move-object v8, v7

    move-wide v11, v10

    const/4 v5, 0x0

    const/4 v7, 0x0

    :goto_0
    xor-int v9, v20, v22

    mul-int/lit16 v9, v9, -0x5115

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v3, v9

    xor-int v20, v23, v3

    sparse-switch v20, :sswitch_data_0

    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v19, v17

    move/from16 v17, v0

    move/from16 v0, v26

    add-int/lit16 v1, v0, 0x1f8

    mul-int v1, v1, v1

    sub-int v1, v1, v18

    if-gtz v1, :cond_b

    const-string v1, "\u05a1\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, 0x6f

    xor-int v2, v1, v21

    mul-int/lit16 v2, v2, 0x40f9

    const v23, -0x1d231f9

    xor-int v2, v2, v23

    const v23, -0x7e55ba50

    goto/16 :goto_14

    .line 367
    :sswitch_0
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    sget v3, Ll/֨ܶ;->ۛۛۛ:I

    if-lez v3, :cond_0

    :goto_1
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v19, v17

    move/from16 v17, v0

    :goto_2
    move/from16 v0, v26

    goto/16 :goto_12

    :cond_0
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    :goto_3
    move/from16 v19, v17

    move/from16 v17, v0

    :goto_4
    move/from16 v0, v26

    goto/16 :goto_13

    .line 1043
    :sswitch_1
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    sget-boolean v3, Ll/ۘۛ;->ۧᩴ۠:Z

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    :goto_5
    move/from16 v19, v17

    move/from16 v17, v0

    move/from16 v0, v26

    goto/16 :goto_10

    .line 1019
    :sswitch_2
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    sget v3, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u06db\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v22, v3

    mul-int/lit8 v3, v3, 0x9

    xor-int v9, v3, v21

    mul-int/lit16 v9, v9, -0x596b

    const v10, -0x2ef5466

    xor-int/2addr v9, v10

    const v10, 0x40e5e127

    xor-int v23, v3, v10

    goto/16 :goto_a

    .line 92
    :sswitch_3
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    goto :goto_1

    .line 1089
    :sswitch_4
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    return-void

    :sswitch_5
    move/from16 v3, p4

    .line 1017
    invoke-static {v1, v3}, Ll/ۖ᩸;->ۨۢܽ(Ljava/lang/Object;I)V

    sub-int v0, v4, v2

    .line 1018
    invoke-static {v1, v0}, Ll/֨ܰ;->ܰܶ᩵(Ljava/lang/Object;I)V

    sub-int/2addr v5, v4

    .line 1019
    invoke-static {v1, v5}, Ll/֨ܰ;->ܰܶ᩵(Ljava/lang/Object;I)V

    .line 1020
    invoke-virtual {v6, v1, v2}, Ll/ܰۖ᩹;->ۙ(Ljava/io/DataOutputStream;I)V

    return-void

    .line 1015
    :sswitch_6
    new-instance v0, Ljava/io/IOException;

    sget-object v1, Ll/֫ۨ᩹;->ܺۗۡ:[S

    const/16 v2, 0x1d

    const/16 v3, 0x22

    invoke-static {v1, v2, v3, v7}, Ll/ۗ᩺;->ۧۤ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_7
    move/from16 v3, p4

    .line 1014
    invoke-virtual {v6}, Ll/ܰۖ᩹;->ۨ()I

    move-result v9

    if-eqz v9, :cond_3

    const-string v9, "\u06eb\u0733"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v21

    xor-int v10, v9, v22

    mul-int/lit16 v10, v10, -0x3ff

    const v19, -0x1c20c015

    xor-int v10, v10, v19

    const v19, 0x60cbbc30

    goto :goto_6

    :cond_3
    const-string v9, "\u0730\u1a7b"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v22

    xor-int v10, v9, v21

    mul-int/lit16 v10, v10, -0x2f9b

    const v19, 0x3969d8ca

    xor-int v10, v10, v19

    const v19, -0x73f3db87

    :goto_6
    xor-int v23, v9, v19

    goto/16 :goto_b

    :sswitch_8
    move/from16 v3, p4

    .line 1159
    invoke-static {}, Ll/᩷ۨ᩹;->ۖ()Ll/᩷ۨ᩹;

    move-result-object v6

    goto :goto_7

    :sswitch_9
    move/from16 v3, p4

    .line 1161
    new-array v9, v0, [I

    const/4 v10, 0x0

    .line 1162
    filled-new-array {v10}, [I

    move-result-object v10

    .line 1163
    new-instance v1, Ll/ۗۨ᩹;

    .line 63
    sget v19, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v19, :cond_4

    move-object/from16 v9, p0

    move/from16 v10, p3

    goto/16 :goto_5

    .line 1163
    :cond_4
    invoke-direct {v1, v9, v10}, Ll/ۗۨ᩹;-><init>([I[I)V

    invoke-virtual {v8, v15, v5, v1}, Ll/ܰۖ᩹;->ۙ(IILl/ܺۨ᩹;)V

    .line 1164
    invoke-static {v0, v9}, Ll/ܰۖ᩹;->ۙ(I[I)Ll/ܰۖ᩹;

    move-result-object v1

    move-object v6, v1

    goto :goto_7

    :sswitch_a
    move/from16 v3, p4

    if-nez v0, :cond_5

    const-string v1, "\u1a76\u06df"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v21, v1

    mul-int/lit8 v1, v1, 0x7d

    xor-int v9, v1, v22

    mul-int/lit16 v9, v9, 0x33e1

    const v10, 0x42bf6ae3

    xor-int/2addr v9, v10

    const v10, -0x1bff9095

    goto/16 :goto_9

    :cond_5
    const-string v1, "\u073a\u1a78"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    mul-int/lit8 v1, v1, -0x77

    xor-int v9, v1, v21

    mul-int/lit16 v9, v9, 0x59fb

    const v10, -0x53356b78

    xor-int/2addr v9, v10

    const v10, 0x4e677a5a    # 9.708888E8f

    goto/16 :goto_9

    :sswitch_b
    move/from16 v3, p4

    .line 1154
    invoke-virtual {v8, v15, v5}, Ll/ܰۖ᩹;->ۙ(II)I

    move-result v0

    .line 1155
    invoke-virtual {v8}, Ll/ܰۖ᩹;->ۨ()I

    move-result v1

    if-ne v0, v1, :cond_6

    move-object v6, v8

    :goto_7
    const-string v1, "\u06d6\u06e0"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v21, v1

    mul-int/lit8 v1, v1, 0x13

    xor-int v9, v1, v22

    mul-int/lit16 v9, v9, 0x470f

    const v10, -0x218c9955

    xor-int/2addr v9, v10

    const v10, 0x62ec207f

    goto :goto_9

    :cond_6
    const-string v1, "\u06db\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v9, v1, v22

    mul-int/lit16 v9, v9, 0x26a9

    const v10, -0x5c25d9db

    xor-int/2addr v9, v10

    const v10, 0x6cd88376

    goto :goto_9

    :sswitch_c
    move/from16 v3, p4

    const/high16 v1, -0x80000000

    const/high16 v15, -0x80000000

    goto :goto_8

    :sswitch_d
    move/from16 v3, p4

    long-to-int v1, v13

    move v15, v1

    :goto_8
    const-string v1, "\u073f\u06d6"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v9, v1, v21

    mul-int/lit16 v9, v9, 0x339b

    const v10, -0x23a4453

    xor-int/2addr v9, v10

    const v10, -0x27afb4b8

    goto :goto_9

    :sswitch_e
    move/from16 v3, p4

    add-long v13, v24, v11

    const-wide/32 v9, -0x80000000

    cmp-long v1, v13, v9

    if-gtz v1, :cond_7

    const-string v1, "\u06e8\u1a75"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v22, v1

    mul-int/lit8 v1, v1, 0x6f

    xor-int v9, v1, v21

    mul-int/lit16 v9, v9, -0x6ec1

    const v10, 0x4b923cc1    # 1.9167618E7f

    xor-int/2addr v9, v10

    const v10, 0x6bd0150b

    goto :goto_9

    :cond_7
    const-string v1, "\u06da\u1a7a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, -0x5d

    xor-int v9, v1, v22

    mul-int/lit16 v9, v9, -0x3fe7

    const v10, 0x7a171c8e

    xor-int/2addr v9, v10

    const v10, 0x3f1ce708

    :goto_9
    xor-int v23, v1, v10

    move-object/from16 v1, p1

    :goto_a
    move v3, v9

    goto/16 :goto_0

    :sswitch_f
    move/from16 v3, p4

    int-to-long v9, v4

    move/from16 v1, v17

    int-to-long v11, v1

    sub-long v24, v9, v11

    const-wide/16 v11, 0x1

    .line 1011
    sget v9, Ll/ۗ;->֨۬ۖ:I

    if-ltz v9, :cond_8

    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v17, v0

    move/from16 v19, v1

    goto/16 :goto_4

    :cond_8
    const-string v9, "\u06d6\u06eb"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v22

    xor-int v10, v9, v21

    mul-int/lit16 v10, v10, -0x1143

    const v17, 0x6283ffd1

    xor-int v10, v10, v17

    const v17, 0xbf2ed51

    xor-int v23, v9, v17

    move/from16 v17, v1

    move v3, v10

    goto/16 :goto_f

    :sswitch_10
    move/from16 v3, p4

    .line 1013
    invoke-static/range {v16 .. v16}, Ll/֨ۢ;->ۡܳۨ(Ljava/lang/Object;)I

    move-result v17

    move-object/from16 v9, p0

    .line 1012
    iget-object v8, v9, Ll/֫ۨ᩹;->ۖ:Ll/ܰۖ᩹;

    invoke-static {v8}, Ll/֡ܽ;->ۢۤᩴ(Ljava/lang/Object;)Ljava/lang/Class;

    .line 124
    sget v1, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v1, :cond_9

    move/from16 v10, p3

    goto/16 :goto_3

    :cond_9
    const-string v1, "\u06df\u06e7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v10, v1, v22

    mul-int/lit16 v10, v10, -0x13db

    const v19, -0x6f93efc4    # -4.65553E-29f

    xor-int v10, v10, v19

    const v19, -0x12981f29

    xor-int v23, v1, v19

    move-object/from16 v1, p1

    :goto_b
    move v3, v10

    goto/16 :goto_0

    :sswitch_11
    move-object/from16 v9, p0

    move/from16 v3, p4

    move/from16 v1, v17

    .line 1010
    iget v4, v9, Ll/֫ۨ᩹;->ܰ:I

    invoke-static {v2, v4}, Ll/֨֫;->ܺܰ۬(II)I

    move-result v4

    .line 1011
    iget v5, v9, Ll/֫ۨ᩹;->ۙ:I

    move/from16 v10, p3

    invoke-static {v10, v5}, Ll/֡ۛ;->᩶ۡۖ(II)I

    move-result v5

    move/from16 v17, v0

    .line 1012
    iget-object v0, v9, Ll/֫ۨ᩹;->ۨ:Ll/ۛۨ᩹;

    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v16

    if-nez v16, :cond_a

    move-object/from16 v16, v0

    move/from16 v19, v1

    goto/16 :goto_2

    :cond_a
    const-string v16, "\u1a76\u05ab"

    invoke-static/range {v16 .. v16}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v21

    move-object/from16 v19, v0

    xor-int v0, v16, v22

    mul-int/lit16 v0, v0, 0x6781

    const v23, -0x6ebfd344

    xor-int v0, v0, v23

    const v23, -0x4c631211

    xor-int v23, v16, v23

    move v3, v0

    move/from16 v0, v17

    move-object/from16 v16, v19

    move/from16 v17, v1

    goto/16 :goto_f

    :sswitch_12
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v1, v17

    move/from16 v17, v0

    const/16 v0, 0x5aa1

    const/16 v7, 0x5aa1

    goto :goto_c

    :sswitch_13
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v1, v17

    move/from16 v17, v0

    const v0, 0x92aa

    const v7, 0x92aa

    :goto_c
    const-string v0, "\u06e4\u073f"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    move/from16 v19, v1

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, -0x73c7

    const v23, -0x4f976eef

    xor-int v1, v1, v23

    const v23, 0x16d2b64f

    xor-int v23, v0, v23

    goto/16 :goto_e

    :cond_b
    const-string v1, "\u06e2\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v21, v1

    mul-int/lit8 v1, v1, 0x45

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, -0xd85

    const v23, -0x7915bed4

    xor-int v2, v2, v23

    const v23, -0x4c7937e9

    goto/16 :goto_14

    :sswitch_14
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v19, v17

    move/from16 v17, v0

    move/from16 v0, v26

    mul-int v26, v0, v0

    const v1, 0x3e040

    add-int v26, v26, v1

    add-int v18, v26, v26

    .line 616
    sget v1, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v1, :cond_c

    goto/16 :goto_13

    :cond_c
    const-string v1, "\u073d\u06dc"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x29

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, 0x19b

    const v23, 0x6e6b8708

    xor-int v2, v2, v23

    const v23, -0x470f99be

    goto/16 :goto_14

    :sswitch_15
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v19, v17

    move/from16 v17, v0

    sget-object v0, Ll/֫ۨ᩹;->ܺۗۡ:[S

    const/16 v1, 0x1c

    aget-short v26, v0, v1

    .line 137
    sget-boolean v0, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v0, :cond_d

    goto/16 :goto_11

    :cond_d
    const-string v0, "\u06d8\u0736"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, 0xf

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, -0x4f33

    const v2, 0x8d6fdf1

    xor-int/2addr v1, v2

    const v2, -0x67968583

    :goto_d
    xor-int v23, v0, v2

    move/from16 v2, p2

    :goto_e
    move v3, v1

    move/from16 v0, v17

    move/from16 v17, v19

    :goto_f
    move-object/from16 v1, p1

    goto/16 :goto_0

    :sswitch_16
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v19, v17

    move/from16 v17, v0

    move/from16 v0, v26

    .line 600
    sget v1, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v1, :cond_e

    :goto_10
    const-string v1, "\u1a7b\u06d7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v21

    mul-int/lit8 v1, v1, -0x53

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, 0x7e65

    const v23, 0x5e41532a

    xor-int v2, v2, v23

    const v23, -0x67dfd2f9

    goto/16 :goto_14

    :cond_e
    const-string v1, "\u05a1\u06d9"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v2, v1, v21

    mul-int/lit16 v2, v2, 0x58d1

    const v23, -0x6f63a2d4

    xor-int v2, v2, v23

    const v23, -0x2b35f177

    goto/16 :goto_14

    :sswitch_17
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v19, v17

    move/from16 v17, v0

    move/from16 v0, v26

    .line 1030
    sget-boolean v1, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v1, :cond_f

    move/from16 v26, v0

    :goto_11
    const-string v0, "\u05a8\u073f"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, 0x1f

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, -0x5643

    const v2, -0xd2b569d

    xor-int/2addr v1, v2

    const v2, -0x1269b330

    goto :goto_d

    :cond_f
    const-string v1, "\u06e2\u1a73"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v21, v1

    mul-int/lit8 v1, v1, -0x9

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, -0x74c3

    const v23, -0x36aac147

    xor-int v2, v2, v23

    const v23, 0xc2750a3

    goto/16 :goto_14

    :sswitch_18
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v19, v17

    move/from16 v17, v0

    move/from16 v0, v26

    sget v1, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v1, :cond_10

    :goto_12
    const-string v1, "\u1a77\u06d7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v2, v1, v21

    mul-int/lit16 v2, v2, -0x1937

    const v23, -0x430421f8

    xor-int v2, v2, v23

    const v23, -0x3639d47c    # -1623408.5f

    goto :goto_14

    :cond_10
    const-string v1, "\u0736\u073f"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, 0xba1

    const v23, 0x35608ddc

    xor-int v2, v2, v23

    const v23, 0x28d6248

    goto :goto_14

    :sswitch_19
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v19, v17

    move/from16 v17, v0

    move/from16 v0, v26

    .line 329
    sget v1, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v1, :cond_11

    :goto_13
    const-string v1, "\u1a76\u06d7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v21

    mul-int/lit8 v1, v1, -0x37

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, 0x663f

    const v23, 0x21536807

    xor-int v2, v2, v23

    const v23, -0x1920de51

    goto :goto_14

    :cond_11
    const-string v1, "\u06da\u06e8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, 0x3b

    xor-int v2, v1, v21

    mul-int/lit16 v2, v2, -0x4ff1

    const v23, 0x3791cde5

    xor-int v2, v2, v23

    const v23, -0x1d449ef5

    :goto_14
    xor-int v23, v1, v23

    move-object/from16 v1, p1

    move/from16 v26, v0

    move v3, v2

    move/from16 v0, v17

    move/from16 v17, v19

    move/from16 v2, p2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7cf071ef -> :sswitch_a
        -0x77525411 -> :sswitch_13
        -0x772edf0c -> :sswitch_18
        -0x772d64d5 -> :sswitch_11
        -0x72bdfb02 -> :sswitch_12
        -0x70e348c0 -> :sswitch_5
        -0x6ecffdd2 -> :sswitch_1
        -0x6a0d39c5 -> :sswitch_e
        -0x62a94f9e -> :sswitch_16
        -0x5ff743ef -> :sswitch_d
        -0x5c2728fd -> :sswitch_2
        -0x51e76a8b -> :sswitch_7
        -0x5055e495 -> :sswitch_1
        -0x3c620ced -> :sswitch_9
        -0x311adb3e -> :sswitch_3
        -0x306e9af8 -> :sswitch_0
        -0x2eede5d3 -> :sswitch_15
        -0x2e197095 -> :sswitch_0
        -0x2597ca2e -> :sswitch_14
        -0x1f0f5249 -> :sswitch_8
        -0x1e338b60 -> :sswitch_d
        -0x162f6e5b -> :sswitch_c
        -0x14ca35bb -> :sswitch_7
        -0x12a5ada7 -> :sswitch_17
        -0x9a28398 -> :sswitch_14
        -0x12f94e8 -> :sswitch_8
        0x2b0ede7 -> :sswitch_f
        0x31dd8b8 -> :sswitch_13
        0x63997eb -> :sswitch_17
        0x6a0a970 -> :sswitch_f
        0x97e8c6e -> :sswitch_c
        0x120c2c8d -> :sswitch_6
        0x1777bb57 -> :sswitch_12
        0x17c852ac -> :sswitch_a
        0x1bb9a083 -> :sswitch_19
        0x299f4658 -> :sswitch_18
        0x2beef180 -> :sswitch_e
        0x3f901bec -> :sswitch_4
        0x3fa35835 -> :sswitch_19
        0x43bfd6e6 -> :sswitch_11
        0x46505d80 -> :sswitch_b
        0x4aca4a6e -> :sswitch_15
        0x53719f9d -> :sswitch_b
        0x54f11bdd -> :sswitch_16
        0x57c5e17b -> :sswitch_4
        0x5be7931b -> :sswitch_6
        0x5c4802c2 -> :sswitch_10
        0x669f4fd9 -> :sswitch_3
        0x67e17bb0 -> :sswitch_9
        0x6d3b2eee -> :sswitch_2
        0x79380bec -> :sswitch_10
        0x7d2f3664 -> :sswitch_5
    .end sparse-switch
.end method

.method public final ۙ([BII[J)V
    .locals 23

    move-object/from16 v7, p0

    move/from16 v5, p2

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v15, 0x731fd928

    sget v16, Ll/ۖܽ;->ܳ۠᩹:I

    sget v17, Ll/֨᩹;->᩻ᩳ֨:I

    const-string v18, "\u1a79\u05ab"

    invoke-static/range {v18 .. v18}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v17

    mul-int/lit8 v18, v18, 0x47

    xor-int v0, v18, v16

    mul-int/lit16 v0, v0, 0x633b

    const v20, -0x3493e68a    # -1.5473014E7f

    xor-int v0, v0, v20

    const v20, -0x4734ddeb

    xor-int v18, v18, v20

    move-object v11, v10

    move/from16 v19, v18

    const/4 v1, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v18, 0x731fd928

    move-object v10, v4

    const/4 v4, 0x0

    :goto_0
    xor-int v7, v18, v16

    mul-int/lit16 v7, v7, -0x97f

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v0, v7

    xor-int v18, v19, v0

    sparse-switch v18, :sswitch_data_0

    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    .line 88
    sget-boolean v0, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v0, :cond_b

    goto/16 :goto_8

    .line 785
    :sswitch_0
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v0

    if-lez v0, :cond_0

    :goto_1
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    goto/16 :goto_a

    :cond_0
    move-object/from16 v7, p1

    :goto_2
    move/from16 v19, v4

    move/from16 v4, p3

    goto/16 :goto_b

    .line 479
    :sswitch_1
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    sget-boolean v0, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v0, :cond_2

    :cond_1
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    goto/16 :goto_9

    :cond_2
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    goto/16 :goto_7

    .line 381
    :sswitch_2
    sget-boolean v0, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v0, :cond_1

    goto :goto_1

    .line 484
    :sswitch_3
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    return-void

    .line 902
    :sswitch_5
    invoke-static {v6}, Ll/ۛۨ᩹;->ۙ(Ll/ۛۨ᩹;)[B

    move-result-object v0

    sub-int v2, v1, v5

    sub-int v1, v4, v1

    move-object/from16 v7, p1

    invoke-static {v15, v0, v2, v7, v1}, Ll/ۚۖ᩹;->ۙ(I[BI[BI)V

    sub-int/2addr v4, v5

    move-object/from16 v0, p4

    .line 904
    invoke-static {v2, v4, v0}, Ll/ۚۖ᩹;->ۙ(II[J)V

    return-void

    :sswitch_6
    move-object/from16 v7, p1

    move-object/from16 v0, p4

    add-int v15, v14, v13

    goto :goto_3

    :sswitch_7
    move-object/from16 v7, p1

    move-object/from16 v0, p4

    const/4 v15, 0x0

    goto :goto_3

    :sswitch_8
    move-object/from16 v7, p1

    move-object/from16 v0, p4

    xor-int v19, v12, v13

    shr-int/lit8 v19, v19, 0x1f

    or-int/lit8 v19, v19, 0x1

    if-lez v19, :cond_3

    move v15, v14

    :goto_3
    const-string v19, "\u06e0\u0730"

    invoke-static/range {v19 .. v19}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v16

    mul-int/lit8 v19, v19, -0x55

    xor-int v0, v19, v17

    mul-int/lit16 v0, v0, -0x6069

    const v20, 0x7b8c1a18

    xor-int v0, v0, v20

    const v20, 0x7b3797e0

    xor-int v19, v19, v20

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u05a8\u06d7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    move/from16 v19, v4

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, 0x39cb

    const v20, 0xced66ef

    xor-int v4, v4, v20

    const v20, -0x690663df

    goto :goto_4

    :sswitch_9
    move-object/from16 v7, p1

    move/from16 v19, v4

    .line 900
    invoke-static {v11}, Ll/ۨۖ᩹;->ۙ(Ll/ۨۖ᩹;)I

    move-result v0

    sub-int v12, v1, v0

    .line 901
    invoke-static {v6}, Ll/֨ۢ;->ۡܳۨ(Ljava/lang/Object;)I

    move-result v13

    .line 0
    rem-int v14, v12, v13

    if-nez v14, :cond_4

    const-string v0, "\u06e1\u0736"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, 0x3bb7

    const v20, -0x702d9b31

    xor-int v4, v4, v20

    const v20, 0x7467ffbc

    goto :goto_4

    :cond_4
    const-string v0, "\u0730\u06d7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, -0x320d

    const v20, -0x45b868b3

    xor-int v4, v4, v20

    const v20, -0x2f2eaa17

    :goto_4
    xor-int v0, v0, v20

    move/from16 v22, v19

    move/from16 v19, v0

    move v0, v4

    goto/16 :goto_5

    :sswitch_a
    move-object/from16 v7, p1

    const/16 v0, 0x20

    ushr-long v0, v2, v0

    long-to-int v1, v0

    long-to-int v4, v2

    .line 900
    move-object v11, v10

    check-cast v11, Ll/ۨۖ᩹;

    sget v0, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v0, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v0, "\u06e7\u06e2"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x77

    move/from16 v19, v1

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x2881

    const v20, 0x577b30d1

    xor-int v1, v1, v20

    const v20, 0x1a2c3b68

    xor-int v0, v0, v20

    move/from16 v22, v19

    move/from16 v19, v0

    move v0, v1

    move/from16 v1, v22

    goto/16 :goto_0

    :sswitch_b
    move-object/from16 v7, p1

    .line 907
    invoke-static {v6}, Ll/֨֫;->ܿ֡ۜ(Ljava/lang/Object;)I

    move-result v11

    new-instance v12, Ll/ۧۨ᩹;

    move-object v0, v12

    move-object/from16 v1, p0

    move v2, v8

    move v3, v9

    move-object/from16 v4, p1

    move/from16 v5, p2

    move-object/from16 v6, p4

    invoke-direct/range {v0 .. v6}, Ll/ۧۨ᩹;-><init>(Ll/֫ۨ᩹;II[BI[J)V

    invoke-virtual {v10, v8, v9, v11, v12}, Ll/ܰۖ᩹;->ۙ(IIILl/ܺۨ᩹;)V

    :sswitch_c
    return-void

    :sswitch_d
    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move/from16 v19, v4

    .line 896
    invoke-direct {v0, v8, v9}, Ll/֫ۨ᩹;->ۨ(II)J

    move-result-wide v2

    const-wide/16 v20, -0x1

    .line 897
    iget-object v10, v0, Ll/֫ۨ᩹;->ۖ:Ll/ܰۖ᩹;

    iget-object v6, v0, Ll/֫ۨ᩹;->ۨ:Ll/ۛۨ᩹;

    cmp-long v4, v2, v20

    if-eqz v4, :cond_6

    const-string v4, "\u06d9\u1a7a"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int v4, v4, v16

    mul-int/lit8 v4, v4, 0x3b

    move/from16 v20, v1

    xor-int v1, v4, v17

    mul-int/lit16 v1, v1, 0x3351

    const v21, -0x6408e01f

    xor-int v1, v1, v21

    const v21, -0x4e1eb589

    xor-int v4, v4, v21

    move v0, v1

    move/from16 v1, v20

    move/from16 v22, v19

    move/from16 v19, v4

    :goto_5
    move/from16 v4, v22

    goto/16 :goto_0

    :cond_6
    move/from16 v20, v1

    const-string v1, "\u1a73\u06d8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x77

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0xfe5

    const v21, 0x7765e5a5

    xor-int v4, v4, v21

    const v21, -0x5a40cb22

    xor-int v1, v1, v21

    move v0, v4

    goto :goto_6

    :sswitch_e
    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    .line 891
    iget v1, v0, Ll/֫ۨ᩹;->ܰ:I

    invoke-static {v5, v1}, Ll/֨֫;->ܺܰ۬(II)I

    move-result v8

    .line 892
    iget v1, v0, Ll/֫ۨ᩹;->ۙ:I

    move/from16 v4, p3

    invoke-static {v4, v1}, Ll/֡ۛ;->᩶ۡۖ(II)I

    move-result v9

    if-lt v8, v9, :cond_7

    const-string v1, "\u05a8\u06df"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x69

    xor-int v0, v1, v17

    mul-int/lit16 v0, v0, -0x28f5

    const v21, 0x67582233

    xor-int v0, v0, v21

    const v21, 0x3badd4f9

    xor-int v1, v1, v21

    :goto_6
    move/from16 v4, v19

    move/from16 v19, v1

    goto/16 :goto_d

    :cond_7
    const-string v0, "\u06d9\u073d"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x4b

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x13bb

    const v21, -0x4bf41334

    xor-int v1, v1, v21

    const v21, -0x2a735670

    goto/16 :goto_c

    :sswitch_f
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    .line 249
    sget v0, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v0, :cond_8

    const-string v0, "\u06e2\u1a74"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x5b

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x13db

    const v21, 0x3f683754

    xor-int v1, v1, v21

    const v21, -0x6af85d2f

    goto/16 :goto_c

    :cond_8
    const-string v0, "\u0736\u06e8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x37

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0xeab

    const v21, 0x5297fbd4

    xor-int v1, v1, v21

    const v21, -0x599bdb0

    goto/16 :goto_c

    :sswitch_10
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    sget v0, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v0, :cond_9

    :goto_7
    const-string v0, "\u05a8\u0736"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x35

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x24b

    const v21, 0x4c81f0d7    # 6.812639E7f

    xor-int v1, v1, v21

    const v21, 0x4ac0e941    # 6321312.5f

    goto/16 :goto_c

    :cond_9
    const-string v0, "\u1a7b\u073a"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x69

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x2195

    const v21, 0x55072f21

    xor-int v1, v1, v21

    const v21, 0x1dc0a610

    goto/16 :goto_c

    :sswitch_11
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    .line 319
    sget v0, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v0, :cond_a

    :goto_8
    move/from16 v1, v20

    goto/16 :goto_b

    :cond_a
    const-string v0, "\u05a8\u073a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x4d

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x2d1

    const v21, -0xd298adc

    xor-int v1, v1, v21

    const v21, 0x3d8086c4

    goto/16 :goto_c

    :cond_b
    const-string v0, "\u0736\u1a77"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x48e1

    const v21, -0x2f837615

    xor-int v1, v1, v21

    const v21, -0x26b7d1fa    # -3.5216E15f

    goto/16 :goto_c

    :sswitch_12
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_8

    :cond_c
    const-string v0, "\u06e8\u073d"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x4fcf

    const v21, 0x2cef747a

    xor-int v1, v1, v21

    const v21, -0x4459ceca

    goto/16 :goto_c

    :sswitch_13
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    sget v0, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v0, :cond_d

    :goto_9
    const-string v0, "\u1a76\u06e0"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x2c89

    const v21, -0x56a4220b

    xor-int v1, v1, v21

    const v21, -0x7bb208c4

    goto/16 :goto_c

    :cond_d
    const-string v0, "\u1a76\u06ec"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x6631

    const v21, -0x1e67daab

    xor-int v1, v1, v21

    const v21, 0x6f9ee284

    goto/16 :goto_c

    :sswitch_14
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    .line 607
    sget v0, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v0, :cond_e

    goto :goto_a

    :cond_e
    const-string v0, "\u06d8\u05a8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0x41

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x349b

    const v21, 0x4eb370c2    # 1.5052557E9f

    xor-int v1, v1, v21

    const v21, 0x6ba610d8

    goto/16 :goto_c

    :sswitch_15
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    move-result v0

    if-gtz v0, :cond_f

    :goto_a
    const-string v0, "\u06e4\u06da"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x5f

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x53b9

    const v21, -0x5847512

    xor-int v1, v1, v21

    const v21, 0x6b98593d

    goto :goto_c

    :cond_f
    const-string v0, "\u1a78\u0730"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x611f

    const v21, -0x6a3e6f00

    xor-int v1, v1, v21

    const v21, -0x3ced122e

    goto :goto_c

    :sswitch_16
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    .line 299
    sget v0, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v0, :cond_10

    goto/16 :goto_8

    :goto_b
    const-string v0, "\u1a7a\u05ab"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x3d

    move/from16 v20, v1

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x7dc9

    const v21, 0x6390f202

    xor-int v1, v1, v21

    const v21, -0x14758fbc

    goto :goto_c

    :cond_10
    const-string v0, "\u06eb\u06e7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x75

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x3b35

    const v21, 0x753fd7b1

    xor-int v1, v1, v21

    const v21, 0x3e91f29d

    :goto_c
    xor-int v0, v0, v21

    move/from16 v4, v19

    move/from16 v19, v0

    move v0, v1

    :goto_d
    move/from16 v1, v20

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x762458fe -> :sswitch_7
        -0x7078dad0 -> :sswitch_15
        -0x69577e70 -> :sswitch_4
        -0x68be48c6 -> :sswitch_d
        -0x642a49d4 -> :sswitch_3
        -0x5eb6ee7a -> :sswitch_2
        -0x422254d4 -> :sswitch_11
        -0x4213e00d -> :sswitch_6
        -0x40f1f8cf -> :sswitch_14
        -0x3a3cd39c -> :sswitch_0
        -0x392c51c3 -> :sswitch_11
        -0x237553b0 -> :sswitch_14
        -0x1283dc55 -> :sswitch_f
        -0x110103f7 -> :sswitch_b
        -0x10aa9104 -> :sswitch_e
        -0xbba04dd -> :sswitch_5
        -0x7128452 -> :sswitch_a
        -0x599d6d2 -> :sswitch_5
        -0x43b7a4d -> :sswitch_8
        0x368379b -> :sswitch_0
        0x1d6ef900 -> :sswitch_9
        0x1e43941d -> :sswitch_13
        0x1f6c7f61 -> :sswitch_4
        0x23243ed3 -> :sswitch_c
        0x30ee4fc2 -> :sswitch_15
        0x31445ec5 -> :sswitch_12
        0x3205abe4 -> :sswitch_6
        0x32b49a52 -> :sswitch_c
        0x36f98bde -> :sswitch_8
        0x3f68877f -> :sswitch_9
        0x43a3f7bc -> :sswitch_10
        0x4459a677 -> :sswitch_e
        0x4488ec4f -> :sswitch_12
        0x486025e2 -> :sswitch_f
        0x4bbabb4e -> :sswitch_2
        0x4bd57b9c -> :sswitch_16
        0x4ca3780d -> :sswitch_10
        0x5d42250c -> :sswitch_3
        0x5f1b0c26 -> :sswitch_b
        0x66a71f2b -> :sswitch_a
        0x6bfc59f3 -> :sswitch_7
        0x6ccd219b -> :sswitch_1
        0x6de4aa32 -> :sswitch_13
        0x773714d7 -> :sswitch_1
        0x7f55467b -> :sswitch_d
        0x7fc411ab -> :sswitch_16
    .end sparse-switch
.end method

.method public final ۙ(II)Z
    .locals 19

    move-object/from16 v0, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const v13, 0x4172ce8b

    sget v14, Ll/ۘۗ;->ۖۧ۬:I

    sget v15, Ll/ۖۗ;->᩶۫ۗ:I

    const-string v16, "\u073a\u073a"

    invoke-static/range {v16 .. v16}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v16

    add-int v16, v16, v15

    mul-int/lit8 v16, v16, 0x37

    xor-int v1, v16, v14

    mul-int/lit16 v1, v1, -0x3203

    const v18, -0x16831d0a

    xor-int v1, v1, v18

    const v18, 0x1bddf931

    xor-int v16, v16, v18

    move-wide v11, v10

    move/from16 v17, v16

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v13, 0x0

    const v16, 0x4172ce8b

    const/16 v18, 0x0

    move-wide v9, v8

    move-wide v7, v6

    move-object v6, v5

    const/4 v5, 0x0

    :goto_0
    xor-int v2, v16, v14

    mul-int/lit16 v2, v2, 0x6e67

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v1, v2

    xor-int v16, v17, v1

    sparse-switch v16, :sswitch_data_0

    sub-long v1, v7, v9

    const-wide/16 v11, 0x1

    add-long/2addr v11, v1

    .line 751
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_3

    :sswitch_0
    sget v1, Ll/֨ܰ;->ۢ᩷۟:I

    if-lez v1, :cond_a

    goto :goto_2

    .line 685
    :sswitch_1
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    sget v1, Ll/ۗ᩺;->ۢۜ᩶:I

    if-lez v1, :cond_1

    :cond_0
    :goto_1
    move/from16 v17, v18

    goto/16 :goto_b

    :cond_1
    :goto_2
    const-string v1, "\u06d8\u05a8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x497d

    const v17, 0x158bdc0a

    xor-int v2, v2, v17

    const v17, 0x31b30c49

    goto/16 :goto_5

    .line 54
    :sswitch_2
    sget v1, Ll/ۘ֡;->ܰ֡ܽ:I

    if-gez v1, :cond_0

    :goto_3
    move/from16 v17, v18

    goto/16 :goto_9

    .line 589
    :sswitch_3
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    goto :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    const/4 v1, 0x0

    return v1

    :sswitch_5
    const/4 v1, 0x1

    return v1

    .line 1147
    :sswitch_6
    invoke-virtual {v6, v13, v4}, Ll/ܰۖ᩹;->ۙ(II)I

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "\u06e0\u1a79"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v15

    mul-int/lit16 v2, v2, -0x5409

    const v17, -0xb7106a3

    xor-int v2, v2, v17

    const v17, -0x45ef1caf

    goto/16 :goto_5

    :cond_2
    move/from16 v2, v18

    goto/16 :goto_6

    :sswitch_7
    const/high16 v1, -0x80000000

    const/high16 v13, -0x80000000

    goto :goto_4

    :sswitch_8
    long-to-int v1, v11

    move v13, v1

    :goto_4
    const-string v1, "\u06e7\u1a7b"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x5b

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x2337

    const v17, -0x67f98e8d

    xor-int v2, v2, v17

    const v17, -0x612e5313

    goto/16 :goto_5

    :sswitch_9
    const-wide/32 v1, -0x80000000

    cmp-long v17, v11, v1

    if-gtz v17, :cond_3

    const-string v1, "\u1a77\u1a77"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v15

    mul-int/lit8 v2, v2, -0x35

    const v17, 0x7305d832

    xor-int v2, v2, v17

    const v17, -0x78ffcc82

    goto/16 :goto_5

    :cond_3
    const-string v1, "\u06da\u1a74"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, 0x7

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, 0x2233

    const v17, 0xea51aef

    xor-int v2, v2, v17

    const v17, -0x468e439f

    goto/16 :goto_5

    :cond_4
    const-string v1, "\u1a73\u1a77"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v15

    mul-int/lit16 v2, v2, 0x37a9

    const v17, -0x72926e16

    xor-int v2, v2, v17

    const v17, 0x2d56811

    goto :goto_5

    :sswitch_a
    int-to-long v7, v3

    int-to-long v9, v5

    .line 966
    sget v1, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v1, :cond_5

    move/from16 v17, v18

    goto/16 :goto_a

    :cond_5
    const-string v1, "\u06dc\u073f"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, 0x4739

    const v17, 0x30816132

    xor-int v2, v2, v17

    const v17, 0x7ce4ab8c

    goto :goto_5

    .line 954
    :sswitch_b
    invoke-static {v6}, Ll/֡ܽ;->ۢۤᩴ(Ljava/lang/Object;)Ljava/lang/Class;

    .line 1108
    sget v1, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v1, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v1, "\u06e4\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v15

    mul-int/lit16 v2, v2, -0xcd3

    const v17, -0x6e40c5a3

    xor-int v2, v2, v17

    const v17, -0x2869a009

    goto :goto_5

    .line 953
    :sswitch_c
    iget-object v1, v0, Ll/֫ۨ᩹;->ۨ:Ll/ۛۨ᩹;

    .line 954
    invoke-static {v1}, Ll/֨ۢ;->ۡܳۨ(Ljava/lang/Object;)I

    move-result v5

    iget-object v6, v0, Ll/֫ۨ᩹;->ۖ:Ll/ܰۖ᩹;

    .line 876
    sget v1, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v1, :cond_7

    goto/16 :goto_1

    :cond_7
    const-string v1, "\u0736\u073f"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x1b

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x4427

    const v17, 0x1f084b78

    xor-int v2, v2, v17

    const v17, 0x5dea4ebb

    :goto_5
    xor-int v17, v1, v17

    goto :goto_7

    :sswitch_d
    const/4 v1, 0x0

    return v1

    :sswitch_e
    move/from16 v1, p1

    move/from16 v2, v18

    .line 951
    invoke-static {v1, v2}, Ll/֨ۢ;->᩹᩸֫(II)I

    move-result v3

    .line 952
    iget v4, v0, Ll/֫ۨ᩹;->ۙ:I

    move/from16 v1, p2

    invoke-static {v1, v4}, Ll/֡ۛ;->᩶ۡۖ(II)I

    move-result v4

    if-ge v3, v4, :cond_8

    const-string v17, "\u1a74\u06d6"

    invoke-static/range {v17 .. v17}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v14

    xor-int v1, v17, v15

    mul-int/lit16 v1, v1, -0x3f83

    const v18, -0x1be69859

    xor-int v1, v1, v18

    const v18, -0x13833b36

    xor-int v17, v17, v18

    move/from16 v18, v2

    goto/16 :goto_0

    :cond_8
    :goto_6
    const-string v1, "\u05a8\u06e0"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x47

    move/from16 v17, v2

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x1ac3

    const v18, 0x3d10524a

    xor-int v2, v2, v18

    const v18, -0x203fe91c

    xor-int v1, v1, v18

    move/from16 v18, v17

    move/from16 v17, v1

    :goto_7
    move v1, v2

    goto/16 :goto_0

    .line 951
    :sswitch_f
    iget v1, v0, Ll/֫ۨ᩹;->ܰ:I

    .line 467
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v2

    if-gtz v2, :cond_9

    move/from16 v18, v1

    goto :goto_8

    :cond_9
    const-string v2, "\u06d8\u073f"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v15

    mul-int/lit8 v2, v2, -0x67

    xor-int v0, v2, v14

    mul-int/lit16 v0, v0, 0x6519

    const v17, -0x1c0b7dcd

    xor-int v0, v0, v17

    const v17, 0xb9162cb    # 5.6000616E-32f

    xor-int v17, v2, v17

    move/from16 v18, v1

    move v1, v0

    goto/16 :goto_d

    :sswitch_10
    move/from16 v17, v18

    .line 421
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    move-result v0

    if-gtz v0, :cond_b

    move/from16 v18, v17

    :cond_a
    :goto_8
    const-string v0, "\u06e0\u06d9"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x5b9b

    const v2, 0x339bf61c

    xor-int/2addr v1, v2

    const v2, 0x75a527f

    xor-int v17, v0, v2

    goto/16 :goto_d

    :cond_b
    const-string v0, "\u073d\u0733"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0xd

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x238f

    const v2, 0x62f5ad9

    xor-int/2addr v1, v2

    const v2, -0x2f7b14fa

    goto/16 :goto_c

    :sswitch_11
    move/from16 v17, v18

    sget v0, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v0, :cond_c

    goto :goto_9

    :cond_c
    const-string v0, "\u1a79\u06e8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x4165

    const v2, 0x15e64f13

    xor-int/2addr v1, v2

    const v2, -0x10456546

    goto/16 :goto_c

    :sswitch_12
    move/from16 v17, v18

    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v0

    if-nez v0, :cond_d

    :goto_9
    const-string v0, "\u06da\u06dc"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x69d3

    const v2, -0x4db71da5    # -1.16929995E-8f

    xor-int/2addr v1, v2

    const v2, 0x5e56225

    goto :goto_c

    :cond_d
    const-string v0, "\u05ab\u06e7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x7d

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x3b55

    const v2, -0x19d9808f

    xor-int/2addr v1, v2

    const v2, -0x3495d603    # -1.5346173E7f

    goto :goto_c

    :sswitch_13
    move/from16 v17, v18

    sget v0, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v0, :cond_e

    :goto_a
    const-string v0, "\u1a74\u06da"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x4f29

    const v2, 0x6d06c8f1

    xor-int/2addr v1, v2

    const v2, -0xc0ef9f0

    goto :goto_c

    :cond_e
    const-string v0, "\u0733\u05a1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x7769

    const v2, -0x5ca07a6d

    xor-int/2addr v1, v2

    const v2, 0x59565976

    goto :goto_c

    :sswitch_14
    move/from16 v17, v18

    sget v0, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v0, :cond_f

    :goto_b
    const-string v0, "\u1a75\u06e8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x7f

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x62d5

    const v2, -0x31f0ffce

    xor-int/2addr v1, v2

    const v2, 0x195224

    goto :goto_c

    :cond_f
    const-string v0, "\u05a8\u06e4"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x349b

    const v2, -0x239430b9

    xor-int/2addr v1, v2

    const v2, 0x2fe0db64

    :goto_c
    xor-int/2addr v0, v2

    move/from16 v18, v17

    move/from16 v17, v0

    :goto_d
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6fcd81a8 -> :sswitch_3
        -0x6f0b573b -> :sswitch_1
        -0x6efb5d01 -> :sswitch_3
        -0x6e085714 -> :sswitch_13
        -0x6db467dc -> :sswitch_4
        -0x6a87f8ca -> :sswitch_9
        -0x66ca1329 -> :sswitch_12
        -0x6628ec2b -> :sswitch_4
        -0x63df68d3 -> :sswitch_e
        -0x60bf84f8 -> :sswitch_2
        -0x5792d58b -> :sswitch_5
        -0x4e1b84d5 -> :sswitch_7
        -0x47b1b3e5 -> :sswitch_13
        -0x3fa48508 -> :sswitch_10
        -0x2d3041a6 -> :sswitch_c
        -0x256e99d3 -> :sswitch_6
        -0x13dd8cd4 -> :sswitch_14
        -0x122b37fd -> :sswitch_e
        -0xe2f7b0a -> :sswitch_2
        -0x43ef18e -> :sswitch_8
        -0x28d38a4 -> :sswitch_6
        0x10ad5cdd -> :sswitch_7
        0x177ba353 -> :sswitch_b
        0x18760ace -> :sswitch_0
        0x190b61d0 -> :sswitch_1
        0x2dbe2d8b -> :sswitch_5
        0x2e1bd01d -> :sswitch_a
        0x2fdaf05a -> :sswitch_10
        0x33916d99 -> :sswitch_0
        0x3b38c588 -> :sswitch_11
        0x40388ea6 -> :sswitch_a
        0x4e55d4a8 -> :sswitch_14
        0x503cf53d -> :sswitch_d
        0x50998dd8 -> :sswitch_b
        0x55f982a7 -> :sswitch_11
        0x5612880a -> :sswitch_12
        0x5e9d0354 -> :sswitch_9
        0x63679803 -> :sswitch_f
        0x6c0f75ec -> :sswitch_f
        0x71c3ec6d -> :sswitch_8
        0x7b81f64b -> :sswitch_d
        0x7bd1df6b -> :sswitch_c
    .end sparse-switch
.end method

.method public final ۙ(Ll/᩶ۨ᩹;)Z
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0xe328834

    sget v3, Ll/֨ۧ;->֫۠֡:I

    sget v4, Ll/֫;->ܶܺ᩻:I

    const-string v5, "\u05a1\u06e1"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xa57

    const v7, 0x3d306286

    xor-int/2addr v6, v7

    const v7, 0x6c381fed

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x5bd7

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 606
    sget v5, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v5, :cond_5

    goto/16 :goto_3

    .line 645
    :sswitch_0
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    sget v5, Ll/֫ᩳ;->۬֨᩸:I

    if-lez v5, :cond_a

    goto :goto_1

    :sswitch_1
    sget-boolean v5, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    const-string v5, "\u06d9\u1a7a"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3b3f

    const v7, 0x2c3461fd

    xor-int/2addr v6, v7

    const v7, 0x3aa71c8d

    goto :goto_0

    :sswitch_2
    sget v5, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v5, :cond_c

    goto :goto_1

    .line 450
    :sswitch_3
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    :goto_1
    const-string v5, "\u1a78\u06eb"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2669

    const v7, -0x7efd0495

    xor-int/2addr v6, v7

    const v7, 0x1f782213

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    const/4 p1, 0x0

    return p1

    :sswitch_5
    const/4 p1, 0x1

    return p1

    .line 984
    :sswitch_6
    iget-object v5, p0, Ll/֫ۨ᩹;->ۖ:Ll/ܰۖ᩹;

    iget-object v6, v0, Ll/֫ۨ᩹;->ۖ:Ll/ܰۖ᩹;

    .line 985
    invoke-virtual {v5, v6}, Ll/ܰۖ᩹;->ۙ(Ll/ܰۖ᩹;)Z

    move-result v5

    if-eqz v5, :cond_2

    const-string v5, "\u1a74\u06d7"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0xd

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5c6f

    const v7, 0x2e54d857

    xor-int/2addr v6, v7

    const v7, -0x8394c91

    goto :goto_0

    .line 984
    :sswitch_7
    iget-object v5, v0, Ll/֫ۨ᩹;->ۨ:Ll/ۛۨ᩹;

    invoke-static {v5}, Ll/֨ۢ;->ۡܳۨ(Ljava/lang/Object;)I

    move-result v5

    if-ne v1, v5, :cond_2

    const-string v5, "\u06d7\u06e8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3bc7

    const v7, -0x30bec654

    xor-int/2addr v6, v7

    const v7, 0x481d30d6

    goto/16 :goto_0

    .line 981
    :sswitch_8
    iget-object v1, p0, Ll/֫ۨ᩹;->ۨ:Ll/ۛۨ᩹;

    .line 984
    invoke-static {v1}, Ll/֨ۢ;->ۡܳۨ(Ljava/lang/Object;)I

    move-result v1

    .line 929
    sget v5, Ll/֫;->ܶܺ᩻:I

    if-ltz v5, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v5, "\u1a79\u1a78"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x37

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x181d

    const v7, 0x7480c5ca

    xor-int/2addr v6, v7

    const v7, -0x6194e395

    goto/16 :goto_0

    .line 981
    :sswitch_9
    iget v5, p0, Ll/֫ۨ᩹;->ۙ:I

    iget v6, v0, Ll/֫ۨ᩹;->ۙ:I

    if-ne v5, v6, :cond_2

    const-string v5, "\u05ab\u06e0"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1079

    const v7, 0x6c942392

    xor-int/2addr v6, v7

    const v7, 0x16df904a

    goto/16 :goto_0

    :sswitch_a
    move-object v0, p1

    check-cast v0, Ll/֫ۨ᩹;

    iget v5, p0, Ll/֫ۨ᩹;->ܰ:I

    iget v6, v0, Ll/֫ۨ᩹;->ܰ:I

    if-ne v5, v6, :cond_2

    const-string v5, "\u06e8\u06d6"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5fd5

    const v7, 0x3ddb21b0

    xor-int/2addr v6, v7

    const v7, -0x324b297a

    goto/16 :goto_0

    :sswitch_b
    const/4 p1, 0x0

    return p1

    .line 985
    :sswitch_c
    instance-of v5, p1, Ll/֫ۨ᩹;

    if-eqz v5, :cond_2

    const-string v5, "\u1a7a\u06e7"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2bab

    const v7, -0x71d93c29

    xor-int/2addr v6, v7

    const v7, 0x5ba72869

    goto/16 :goto_0

    :cond_2
    const-string v5, "\u1a76\u06e1"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x17

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1731

    const v7, 0x38ea2460

    xor-int/2addr v6, v7

    const v7, -0x477d8d3d

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v5

    if-ltz v5, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v5, "\u1a7b\u06e1"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x29

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6b6f

    const v7, 0x666860a7

    xor-int/2addr v6, v7

    const v7, 0x65cbd36

    goto/16 :goto_0

    .line 306
    :sswitch_e
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    move-result v5

    if-eqz v5, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v5, "\u06d7\u06ec"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x13

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x205b

    const v7, 0x75a5f12d

    xor-int/2addr v6, v7

    const v7, -0x9e4ad97

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u1a79\u073d"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x3d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x387b

    const v7, 0x696e42a8

    xor-int/2addr v6, v7

    const v7, 0x36772fc4

    goto/16 :goto_0

    :sswitch_f
    sget v5, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v5, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v5, "\u06e7\u1a75"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xe25

    const v7, -0x68dcdbdc

    xor-int/2addr v6, v7

    const v7, 0x615f08f

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v5

    if-gtz v5, :cond_7

    goto :goto_2

    :cond_7
    const-string v5, "\u06d9\u0736"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x33

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1279

    const v7, -0x58595738

    xor-int/2addr v6, v7

    const v7, -0x4190e950

    goto/16 :goto_0

    :sswitch_11
    sget-boolean v5, Ll/᩶;->ۚۤۘ:Z

    if-eqz v5, :cond_8

    goto :goto_3

    :cond_8
    const-string v5, "\u06df\u0730"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x49

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x51df

    const v7, -0x35cad716    # -2968122.5f

    xor-int/2addr v6, v7

    const v7, -0x13a2a627

    goto/16 :goto_0

    .line 749
    :sswitch_12
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    move-result v5

    if-eqz v5, :cond_9

    :goto_2
    const-string v5, "\u06da\u06e2"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4089

    const v7, 0x2c87ecb9

    xor-int/2addr v6, v7

    const v7, 0x4c84e5ad    # 6.967639E7f

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u05a8\u05ab"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x25a9

    const v7, -0x19d498bc

    xor-int/2addr v6, v7

    const v7, -0x2dae7dc

    goto/16 :goto_0

    :sswitch_13
    sget v5, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v5, :cond_b

    :cond_a
    :goto_3
    const-string v5, "\u06e1\u06d9"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x33ed

    const v7, -0x5a7ca7b9

    xor-int/2addr v6, v7

    const v7, -0x20ec51e1

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u073f\u1a7a"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x168d

    const v7, -0x68c7909

    xor-int/2addr v6, v7

    const v7, 0x7c4e0d6f

    goto/16 :goto_0

    .line 323
    :sswitch_14
    sget v5, Ll/֫;->ܶܺ᩻:I

    if-ltz v5, :cond_d

    :cond_c
    :goto_4
    const-string v5, "\u06eb\u06dc"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4021

    const v7, 0x189cbf62

    xor-int/2addr v6, v7

    const v7, 0x697d311

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u06e2\u06e0"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x6b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x16ff

    const v7, -0x40918cb9

    xor-int/2addr v6, v7

    const v7, 0x35553e24

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ed83d3a -> :sswitch_c
        -0x7b1d46ea -> :sswitch_d
        -0x77f71ae4 -> :sswitch_6
        -0x7556bea0 -> :sswitch_8
        -0x71863443 -> :sswitch_7
        -0x6f76ed54 -> :sswitch_12
        -0x6dcca06e -> :sswitch_e
        -0x67a78c3e -> :sswitch_12
        -0x65b2c94a -> :sswitch_d
        -0x634f8484 -> :sswitch_b
        -0x57f7dcfa -> :sswitch_9
        -0x576d44ad -> :sswitch_0
        -0x54363c5b -> :sswitch_b
        -0x53f4906f -> :sswitch_6
        -0x485f9ba8 -> :sswitch_9
        -0x4550a497 -> :sswitch_1
        -0x42ed3ae1 -> :sswitch_c
        -0x4249fa22 -> :sswitch_7
        -0x404d698e -> :sswitch_a
        -0x2fe008ba -> :sswitch_11
        -0x2b58eee0 -> :sswitch_2
        -0x228ab2ba -> :sswitch_5
        -0x214e8806 -> :sswitch_2
        -0x1f935d12 -> :sswitch_1
        -0x11cba044 -> :sswitch_10
        -0xd365c97 -> :sswitch_8
        -0x5c8e09b -> :sswitch_10
        -0x492632a -> :sswitch_4
        0x537139f -> :sswitch_f
        0x98483e3 -> :sswitch_14
        0x19332891 -> :sswitch_11
        0x1ef3d71e -> :sswitch_5
        0x217df09e -> :sswitch_4
        0x236cb2d5 -> :sswitch_13
        0x28ed7ae5 -> :sswitch_3
        0x292c8782 -> :sswitch_a
        0x33b43106 -> :sswitch_f
        0x4f5049b4 -> :sswitch_13
        0x632b272e -> :sswitch_3
        0x6eefb8ce -> :sswitch_e
        0x79f7541a -> :sswitch_0
        0x7e84f31d -> :sswitch_14
    .end sparse-switch
.end method

.method public final ۚ()J
    .locals 9

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const v3, -0x7651a85e

    sget v4, Ll/֡ܳ;->֡۠ۧ:I

    sget v5, Ll/֫ܽ;->֡ᩴܶ:I

    const-string v6, "\u06e8\u06d8"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4ef9

    const v8, -0x640683b8

    xor-int/2addr v7, v8

    const v8, -0x47cb6661

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, -0x5b2b

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 920
    sget v6, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v6, :cond_b

    goto/16 :goto_4

    .line 199
    :sswitch_0
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    sget v6, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-lez v6, :cond_5

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    move-result v6

    if-eqz v6, :cond_8

    goto/16 :goto_4

    .line 275
    :sswitch_2
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v6

    if-lez v6, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v6, "\u1a76\u06da"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3993

    const v8, 0x5b1060e2

    xor-int/2addr v7, v8

    const v8, -0x7f0192a1

    goto :goto_0

    .line 49
    :sswitch_3
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    goto/16 :goto_4

    .line 37
    :sswitch_4
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    const-wide/16 v0, 0x0

    return-wide v0

    :sswitch_5
    const-wide/16 v3, 0x10

    add-long/2addr v1, v3

    return-wide v1

    .line 960
    :sswitch_6
    invoke-virtual {v0}, Ll/ܰۖ᩹;->ܰ()J

    move-result-wide v1

    .line 321
    sget v6, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v6, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v6, "\u06d6\u06d6"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x17

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7683

    const v8, 0x67c0fcd9

    xor-int/2addr v7, v8

    const v8, -0x3b7a66b6

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    const-string v6, "\u073a\u06d9"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x6f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x2729

    const v8, 0x57865bd

    xor-int/2addr v7, v8

    const v8, 0x643ac754

    goto/16 :goto_0

    .line 38
    :sswitch_8
    sget v6, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v6, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v6, "\u06e7\u05a1"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x22af

    const v8, 0x2374292f

    xor-int/2addr v7, v8

    const v8, 0x47ebfa31

    goto/16 :goto_0

    .line 257
    :sswitch_9
    sget-boolean v6, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v6, :cond_4

    goto :goto_2

    :cond_4
    const-string v6, "\u06df\u1a7a"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x2f

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7d39

    const v8, 0x19ed5b97

    xor-int/2addr v7, v8

    const v8, -0x7d4a12ad

    goto/16 :goto_0

    .line 442
    :sswitch_a
    sget-boolean v6, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v6, :cond_6

    :cond_5
    :goto_1
    const-string v6, "\u06d7\u06df"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x147

    const v8, -0x367565ac    # -1135434.5f

    xor-int/2addr v7, v8

    const v8, -0x33a735d1    # -5.683014E7f

    goto/16 :goto_0

    :cond_6
    const-string v6, "\u0730\u0733"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x1cf7

    const v8, 0x3833acf6

    xor-int/2addr v7, v8

    const v8, -0x6174f1ac

    goto/16 :goto_0

    :sswitch_b
    sget v6, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v6, :cond_7

    goto :goto_2

    :cond_7
    const-string v6, "\u06e8\u1a74"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1c11

    const v8, 0x2ba6e97f

    xor-int/2addr v7, v8

    const v8, -0x12fcbb6a

    goto/16 :goto_0

    .line 695
    :sswitch_c
    sget v6, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v6, :cond_9

    :cond_8
    :goto_2
    const-string v6, "\u073d\u05a8"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x1b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x517d

    const v8, 0x72dd8bfb

    xor-int/2addr v7, v8

    const v8, -0x7f271b3d

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u0730\u06e4"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x7f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5b79

    const v8, 0x23a395cc

    xor-int/2addr v7, v8

    const v8, -0x6620cc24

    goto/16 :goto_0

    :sswitch_d
    sget v6, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v6, :cond_a

    :goto_3
    const-string v6, "\u06db\u06dc"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x33

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4a01

    const v8, 0x528d7de6

    xor-int/2addr v7, v8

    const v8, -0x68b1a9d

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u06d7\u05ab"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0xd

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x49fd

    const v8, 0x19191ed

    xor-int/2addr v7, v8

    const v8, 0x6a4b517e

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u06eb\u1a76"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x67b5

    const v8, 0x16892933

    xor-int/2addr v7, v8

    const v8, 0x6df9d0fb

    goto/16 :goto_0

    .line 960
    :sswitch_e
    iget-object v0, p0, Ll/֫ۨ᩹;->ۖ:Ll/ܰۖ᩹;

    sget v6, Ll/֫;->ܶܺ᩻:I

    if-ltz v6, :cond_c

    :goto_4
    const-string v6, "\u06e0\u05a8"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x52eb

    const v8, 0x397727d8

    xor-int/2addr v7, v8

    const v8, -0x5d1ab69f

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06e4\u05a1"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4853

    const v8, -0x4dafe766

    xor-int/2addr v7, v8

    const v8, 0x13b1ef4c

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ce2f173 -> :sswitch_b
        -0x7cb5e000 -> :sswitch_4
        -0x7b510422 -> :sswitch_3
        -0x79baaa83 -> :sswitch_d
        -0x6bc55820 -> :sswitch_1
        -0x5e77129c -> :sswitch_a
        -0x5c3b6f03 -> :sswitch_2
        -0x4a9efcc3 -> :sswitch_a
        -0x4646c8cd -> :sswitch_2
        -0x4119c531 -> :sswitch_b
        -0x3aea58a7 -> :sswitch_8
        -0x1fa90db8 -> :sswitch_e
        -0x578db72 -> :sswitch_4
        -0x2b4ee9b -> :sswitch_d
        0x42af6cc -> :sswitch_6
        0xfe24907 -> :sswitch_0
        0x157852bf -> :sswitch_5
        0x1f89968c -> :sswitch_7
        0x2438ff16 -> :sswitch_e
        0x3536effc -> :sswitch_c
        0x369b4ddc -> :sswitch_6
        0x48bcfa93 -> :sswitch_7
        0x62feb4a6 -> :sswitch_1
        0x63ba4da2 -> :sswitch_0
        0x65b7305d -> :sswitch_9
        0x6b0e5b35 -> :sswitch_8
        0x6b412316 -> :sswitch_3
        0x6d206985 -> :sswitch_c
        0x75379d3a -> :sswitch_9
        0x7d62faec -> :sswitch_5
    .end sparse-switch
.end method

.method public final ܰ(II)J
    .locals 40

    move-object/from16 v0, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const v31, -0x4ffda069

    sget v32, Ll/֫۟;->᩸ᩴܿ:I

    sget v33, Ll/֡᩶;->ۗ֨ܺ:I

    const-string v34, "\u06d8\u1a73"

    invoke-static/range {v34 .. v34}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v34

    add-int v34, v34, v33

    mul-int/lit8 v34, v34, 0xf

    xor-int v1, v34, v32

    mul-int/lit16 v1, v1, -0x3efb

    const v36, -0x16c8d574

    xor-int v1, v1, v36

    const v36, 0x2323e407

    xor-int v34, v34, v36

    move-wide v13, v12

    move-wide/from16 v19, v18

    move-wide/from16 v30, v29

    move/from16 v35, v34

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v15, 0x0

    const v34, -0x4ffda069

    move-wide v11, v10

    move-wide/from16 v17, v16

    move-wide/from16 v28, v27

    move-object/from16 v16, v3

    move-wide v9, v8

    move-wide/from16 v26, v25

    const/4 v3, 0x0

    move-wide/from16 v38, v6

    move-object v6, v5

    move-wide/from16 v7, v23

    const/4 v5, 0x0

    move-wide/from16 v24, v38

    move-wide/from16 v22, v21

    const/16 v21, 0x0

    :goto_0
    xor-int v0, v34, v32

    mul-int/lit16 v0, v0, 0x5fdf

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v1

    xor-int v34, v35, v0

    sparse-switch v34, :sswitch_data_0

    const-wide/16 v0, 0x40

    add-long v0, v30, v0

    .line 1197
    invoke-static {v7, v8, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    return-wide v0

    :sswitch_0
    sget v0, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v0, :cond_d

    :cond_0
    :goto_1
    move-object/from16 v0, p0

    move/from16 v35, v3

    move/from16 v1, v21

    move/from16 v21, v2

    goto/16 :goto_6

    .line 53
    :sswitch_1
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    sget-boolean v0, Ll/ۘۛ;->ۧᩴ۠:Z

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_2
    move/from16 v35, v3

    move/from16 v36, v21

    move/from16 v3, p1

    move/from16 v21, v2

    move/from16 v2, p2

    goto/16 :goto_9

    :sswitch_2
    sget-boolean v0, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    move/from16 v35, v3

    move/from16 v36, v21

    move/from16 v3, p1

    move/from16 v21, v2

    move/from16 v2, p2

    goto/16 :goto_8

    .line 575
    :sswitch_3
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    :goto_3
    const-string v0, "\u06eb\u06d7"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0x4a1

    const v35, 0x186a511e

    xor-int v1, v1, v35

    const v35, 0x1a64662d

    goto/16 :goto_5

    :sswitch_5
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    const-wide/16 v0, 0x0

    return-wide v0

    :sswitch_6
    int-to-long v0, v4

    mul-long v0, v0, v17

    add-long v0, v0, v19

    return-wide v0

    .line 1189
    :sswitch_7
    invoke-virtual {v6}, Ll/ܰۖ᩹;->ۙ()J

    move-result-wide v0

    return-wide v0

    :sswitch_8
    return-wide v7

    :sswitch_9
    mul-long v30, v28, v26

    .line 343
    sget-boolean v0, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    const-string v0, "\u073f\u06e0"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    mul-int/lit8 v0, v0, -0x19

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, -0x3ff7

    const v35, -0x63ad3d1b

    xor-int v1, v1, v35

    const v35, -0x38781cd5

    goto/16 :goto_5

    :sswitch_a
    sub-long v0, v22, v11

    const-wide/16 v26, 0x8

    .line 1196
    div-long v28, v0, v26

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v0

    if-nez v0, :cond_4

    move-object/from16 v0, p0

    move/from16 v35, v3

    move/from16 v1, v21

    move/from16 v3, p1

    move/from16 v21, v2

    move/from16 v2, p2

    goto/16 :goto_7

    :cond_4
    const-string v0, "\u06e1\u05a1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, 0x18f9

    const v35, 0x14972a17

    xor-int v1, v1, v35

    const v35, 0xff35e00

    goto/16 :goto_5

    :sswitch_b
    return-wide v19

    :sswitch_c
    int-to-long v0, v4

    mul-long v0, v0, v17

    add-long v0, v0, v19

    return-wide v0

    :sswitch_d
    if-gt v4, v2, :cond_5

    const-string v0, "\u0733\u06e1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    mul-int/lit8 v0, v0, -0x4d

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, -0x4103

    const v35, 0x6bb092fa

    xor-int v1, v1, v35

    const v35, 0x49ee5761

    goto/16 :goto_5

    :cond_5
    const-string v0, "\u06ec\u06e2"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v33

    mul-int/lit8 v0, v0, 0x61

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, 0x63af

    const v35, -0x495600ba

    xor-int v1, v1, v35

    const v35, 0x2b608c58

    goto/16 :goto_5

    :sswitch_e
    int-to-long v0, v4

    mul-long v22, v0, v17

    add-long v7, v22, v19

    if-gt v4, v2, :cond_6

    const-string v0, "\u06e4\u1a77"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, 0x30f5

    const v35, -0x62c52e16

    xor-int v1, v1, v35

    const v35, -0x12c3589b

    goto/16 :goto_5

    :cond_6
    const-string v0, "\u06eb\u06e7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    mul-int/lit8 v0, v0, -0x5d

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, -0x5419

    const v35, 0x5faac

    xor-int v1, v1, v35

    const v35, 0x5a16376d

    goto/16 :goto_5

    :sswitch_f
    const/4 v0, 0x3

    if-lt v4, v0, :cond_7

    const-string v0, "\u05ab\u1a79"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0x403f

    const v35, 0x5c48e1a

    xor-int v1, v1, v35

    const v35, 0x22e18813

    goto/16 :goto_5

    :cond_7
    const-string v0, "\u05ab\u05a1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, 0x39ef

    const v35, -0x18ac492a

    xor-int v1, v1, v35

    const v35, 0x54101e5b

    goto/16 :goto_5

    .line 1185
    :sswitch_10
    instance-of v0, v6, Ll/۟ۨ᩹;

    const/16 v2, 0x40

    if-eqz v0, :cond_8

    const-string v0, "\u0733\u06db"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v32, v0

    mul-int/lit8 v0, v0, 0x25

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, 0x14b9

    const v35, -0x4575ae0a

    xor-int v1, v1, v35

    const v35, -0x5ea68002

    goto/16 :goto_5

    :cond_8
    const-string v0, "\u05a8\u073d"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, -0x33e5

    const v35, -0x271ff0a5

    xor-int v1, v1, v35

    const v35, -0x5a8414e4

    goto/16 :goto_5

    .line 1178
    :sswitch_11
    invoke-virtual {v6}, Ll/ܰۖ᩹;->ۙ()J

    move-result-wide v0

    return-wide v0

    .line 1180
    :sswitch_12
    instance-of v0, v6, Ll/ۨۖ᩹;

    const-wide/16 v17, 0x4

    const-wide/16 v19, 0x30

    if-eqz v0, :cond_9

    const-string v0, "\u06e4\u06e7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v32

    mul-int/lit8 v0, v0, 0xd

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0x190b

    const v35, 0xd8e43fa

    xor-int v1, v1, v35

    const v35, -0x361f940f

    goto/16 :goto_5

    :cond_9
    const-string v0, "\u06d8\u05ab"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, -0x413b

    const v35, -0x6320615d

    xor-int v1, v1, v35

    const v35, -0x4e5777d

    goto/16 :goto_5

    :sswitch_13
    const-wide/16 v0, 0x0

    return-wide v0

    .line 1177
    :sswitch_14
    invoke-virtual {v6}, Ll/ܰۖ᩹;->ۨ()I

    move-result v0

    if-ne v4, v0, :cond_a

    const-string v0, "\u1a75\u1a77"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, 0xaef

    const v35, -0x3cbe3bad

    xor-int v1, v1, v35

    const v35, 0xba68378

    goto/16 :goto_5

    :cond_a
    const-string v0, "\u06d6\u073d"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, -0x248d

    const v35, 0x266b7b5

    xor-int v1, v1, v35

    const v35, 0x7253d16d

    goto/16 :goto_5

    .line 1173
    :sswitch_15
    invoke-virtual {v6, v15, v3}, Ll/ܰۖ᩹;->ۙ(II)I

    move-result v4

    if-nez v4, :cond_b

    const-string v0, "\u1a75\u06e1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, 0x37e9

    const v35, -0x1c3f3c6c

    xor-int v1, v1, v35

    const v35, -0x571c220c

    goto/16 :goto_5

    :cond_b
    const-string v0, "\u0736\u1a73"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, 0x7745

    const v35, -0x1648a304

    xor-int v1, v1, v35

    const v35, -0x21ea114d

    goto/16 :goto_5

    :sswitch_16
    const/high16 v0, -0x80000000

    const/high16 v15, -0x80000000

    goto :goto_4

    :sswitch_17
    long-to-int v0, v13

    move v15, v0

    :goto_4
    const-string v0, "\u06e7\u06e8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0x135f

    const v35, -0x45063a1

    xor-int v1, v1, v35

    const v35, -0x398b99f2

    goto :goto_5

    :sswitch_18
    const-wide/16 v11, 0x1

    add-long v13, v9, v11

    const-wide/32 v0, -0x80000000

    cmp-long v35, v13, v0

    if-gtz v35, :cond_c

    const-string v0, "\u06d9\u1a76"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, -0x60b7

    const v35, 0xc2eba25

    xor-int v1, v1, v35

    const v35, -0x39ab3bb

    goto :goto_5

    :cond_c
    const-string v0, "\u06da\u06e8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0x25f3

    const v35, -0x69db7379

    xor-int v1, v1, v35

    const v35, -0x499b480b

    goto :goto_5

    :sswitch_19
    int-to-long v0, v5

    sub-long v9, v24, v0

    .line 109
    sget v0, Ll/֨ۧ;->֫۠֡:I

    if-gtz v0, :cond_e

    :cond_d
    const-string v0, "\u1a77\u06d8"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v32, v0

    mul-int/lit8 v0, v0, -0x2d

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, 0x65a1

    const v35, 0x23b69bd7

    xor-int v1, v1, v35

    const v35, 0x5884626e

    goto :goto_5

    :cond_e
    const-string v0, "\u073a\u06dc"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0x623d

    const v35, 0x5e42590

    xor-int v1, v1, v35

    const v35, -0x6e5905cb

    :goto_5
    xor-int v35, v0, v35

    goto/16 :goto_0

    :sswitch_1a
    move-object/from16 v0, p0

    .line 974
    iget-object v6, v0, Ll/֫ۨ᩹;->ۖ:Ll/ܰۖ᩹;

    invoke-static {v6}, Ll/֡ܽ;->ۢۤᩴ(Ljava/lang/Object;)Ljava/lang/Class;

    move/from16 v35, v3

    move/from16 v1, v21

    move/from16 v21, v2

    int-to-long v2, v1

    .line 38
    sget v24, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v24, :cond_f

    move-wide/from16 v24, v2

    :goto_6
    const-string v2, "\u1a77\u06e4"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v33

    mul-int/lit8 v2, v2, 0x5d

    xor-int v3, v2, v32

    mul-int/lit16 v3, v3, -0xd79

    const v36, 0x34c828b1

    xor-int v3, v3, v36

    const v36, 0x18ab1bdb

    xor-int v2, v2, v36

    move/from16 v38, v21

    move/from16 v21, v1

    move v1, v3

    move/from16 v3, v35

    move/from16 v35, v2

    move/from16 v2, v38

    goto/16 :goto_0

    :cond_f
    const-string v24, "\u05a1\u1a7a"

    invoke-static/range {v24 .. v24}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v24

    xor-int v24, v24, v33

    mul-int/lit8 v24, v24, 0x45

    move/from16 v36, v1

    xor-int v1, v24, v32

    mul-int/lit16 v1, v1, 0x4319

    const v25, 0x2c7b2517

    xor-int v1, v1, v25

    const v25, 0x4d0c8221    # 1.4733365E8f

    xor-int v24, v24, v25

    move-wide/from16 v38, v2

    move/from16 v2, v21

    move/from16 v3, v35

    move/from16 v21, v36

    move/from16 v35, v24

    move-wide/from16 v24, v38

    goto/16 :goto_0

    :sswitch_1b
    move-object/from16 v0, p0

    move/from16 v35, v3

    move/from16 v36, v21

    move/from16 v21, v2

    .line 975
    invoke-static/range {v16 .. v16}, Ll/֨֫;->ܿ֡ۜ(Ljava/lang/Object;)I

    move-result v5

    .line 280
    sget v1, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v1, :cond_10

    move/from16 v3, p1

    move/from16 v2, p2

    move/from16 v1, v36

    goto/16 :goto_7

    :cond_10
    const-string v1, "\u073a\u0736"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v32

    xor-int v2, v1, v33

    mul-int/lit16 v2, v2, 0x772f

    const v3, 0x63c56dd

    xor-int/2addr v2, v3

    const v3, -0x50da702e

    xor-int/2addr v1, v3

    move/from16 v3, v35

    move/from16 v35, v1

    move v1, v2

    move/from16 v2, v21

    move/from16 v21, v36

    goto/16 :goto_0

    :sswitch_1c
    move-object/from16 v0, p0

    move/from16 v36, v21

    move/from16 v21, v2

    .line 973
    iget v1, v0, Ll/֫ۨ᩹;->ۙ:I

    move/from16 v2, p2

    invoke-static {v2, v1}, Ll/֡۠;->ܺ۬ܺ(II)I

    move-result v3

    .line 974
    iget-object v1, v0, Ll/֫ۨ᩹;->ۨ:Ll/ۛۨ᩹;

    .line 684
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v16

    if-gtz v16, :cond_11

    move-object/from16 v16, v1

    move/from16 v35, v3

    move/from16 v3, p1

    goto/16 :goto_8

    :cond_11
    const-string v16, "\u06d9\u06db"

    invoke-static/range {v16 .. v16}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v33

    move-object/from16 v35, v1

    xor-int v1, v16, v32

    mul-int/lit16 v1, v1, 0x30a7

    const v37, -0x43222ec

    xor-int v1, v1, v37

    const v37, 0x23f08530

    xor-int v16, v16, v37

    move/from16 v2, v21

    move/from16 v21, v36

    move-object/from16 v38, v35

    move/from16 v35, v16

    move-object/from16 v16, v38

    goto/16 :goto_0

    :sswitch_1d
    move-object/from16 v0, p0

    move/from16 v21, v2

    move/from16 v35, v3

    move/from16 v2, p2

    .line 972
    iget v1, v0, Ll/֫ۨ᩹;->ܰ:I

    move/from16 v3, p1

    invoke-static {v3, v1}, Ll/֨ۢ;->᩹᩸֫(II)I

    move-result v1

    .line 677
    sget-boolean v36, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v36, :cond_12

    :goto_7
    const-string v36, "\u06ec\u06df"

    invoke-static/range {v36 .. v36}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v36

    xor-int v36, v36, v32

    mul-int/lit8 v36, v36, -0x73

    xor-int v0, v36, v33

    mul-int/lit16 v0, v0, 0x48b5

    const v37, 0x65f4a6ae

    xor-int v0, v0, v37

    const v37, 0x75dd13f6

    xor-int v36, v36, v37

    move/from16 v2, v21

    move/from16 v3, v35

    move/from16 v35, v36

    move/from16 v21, v1

    move v1, v0

    goto/16 :goto_0

    :cond_12
    const-string v0, "\u06e8\u0736"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v32

    mul-int/lit8 v0, v0, -0x7d

    move/from16 v36, v1

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0xcef

    const v37, 0x567f07ee

    xor-int v1, v1, v37

    const v37, -0x23d74fc0

    goto/16 :goto_a

    :sswitch_1e
    move/from16 v35, v3

    move/from16 v36, v21

    move/from16 v3, p1

    move/from16 v21, v2

    move/from16 v2, p2

    .line 422
    sget-boolean v0, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v0, :cond_13

    :goto_8
    const-string v0, "\u073a\u073a"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, 0x159f

    const v37, 0x66d27bb8

    xor-int v1, v1, v37

    const v37, -0x668aa6d5

    goto/16 :goto_a

    :cond_13
    const-string v0, "\u1a78\u05a1"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v33

    mul-int/lit8 v0, v0, -0x17

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, 0x595b

    const v37, 0x1174dcb5

    xor-int v1, v1, v37

    const v37, 0x2d6bf275

    goto :goto_a

    :sswitch_1f
    move/from16 v35, v3

    move/from16 v36, v21

    move/from16 v3, p1

    move/from16 v21, v2

    move/from16 v2, p2

    .line 812
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v0

    if-eqz v0, :cond_14

    goto :goto_9

    :cond_14
    const-string v0, "\u06e0\u073f"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v32, v0

    mul-int/lit8 v0, v0, -0x49

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, 0x6757

    const v37, 0x76930170

    xor-int v1, v1, v37

    const v37, -0x30069b9e

    goto :goto_a

    :sswitch_20
    move/from16 v35, v3

    move/from16 v36, v21

    move/from16 v3, p1

    move/from16 v21, v2

    move/from16 v2, p2

    .line 519
    sget v0, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v0, :cond_15

    :goto_9
    const-string v0, "\u073d\u0733"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, -0x5fc5

    const v37, 0x49976dfd

    xor-int v1, v1, v37

    const v37, -0x5c62f20d

    goto :goto_a

    :cond_15
    const-string v0, "\u1a74\u05a1"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v33

    mul-int/lit8 v0, v0, 0x33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, 0x5763

    const v37, 0x2bb25eb3

    xor-int v1, v1, v37

    const v37, 0x6b811247

    :goto_a
    xor-int v0, v0, v37

    move/from16 v2, v21

    move/from16 v3, v35

    move/from16 v21, v36

    move/from16 v35, v0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e397ef6 -> :sswitch_0
        -0x7994ca71 -> :sswitch_16
        -0x74f97161 -> :sswitch_10
        -0x72e1a802 -> :sswitch_5
        -0x711d03d3 -> :sswitch_1b
        -0x6c6b3a11 -> :sswitch_7
        -0x67a99515 -> :sswitch_8
        -0x67769781 -> :sswitch_9
        -0x638c0b38 -> :sswitch_14
        -0x6320debb -> :sswitch_11
        -0x5541c75b -> :sswitch_a
        -0x4f5bc673 -> :sswitch_b
        -0x4f0dc55f -> :sswitch_2
        -0x4c1f49c4 -> :sswitch_0
        -0x4b95f93c -> :sswitch_1f
        -0x4a64515e -> :sswitch_b
        -0x49eb72b3 -> :sswitch_e
        -0x444deac4 -> :sswitch_c
        -0x43ae9a77 -> :sswitch_3
        -0x3c0a6d4e -> :sswitch_17
        -0x3806609d -> :sswitch_2
        -0x34c87b43 -> :sswitch_1
        -0x32853876 -> :sswitch_14
        -0x2b5928f9 -> :sswitch_1c
        -0x1f18b654 -> :sswitch_e
        -0x1e8da7a6 -> :sswitch_1c
        -0x1b832d67 -> :sswitch_4
        -0x197205bc -> :sswitch_d
        -0x178a7e6c -> :sswitch_10
        -0x10f58dc4 -> :sswitch_16
        -0x96df92b -> :sswitch_15
        0xb8d296 -> :sswitch_20
        0x1c839a2 -> :sswitch_1e
        0x3748288 -> :sswitch_a
        0x3cd1269 -> :sswitch_5
        0x6dcf048 -> :sswitch_18
        0x771b014 -> :sswitch_1
        0x86079f6 -> :sswitch_4
        0xaf0b18b -> :sswitch_9
        0xe0f52f4 -> :sswitch_3
        0x1a30285c -> :sswitch_20
        0x211e8024 -> :sswitch_17
        0x2a28da33 -> :sswitch_18
        0x2b4c0a9b -> :sswitch_1d
        0x2ffa96dc -> :sswitch_13
        0x309f8ed6 -> :sswitch_1b
        0x3285b08e -> :sswitch_1e
        0x341c2ea3 -> :sswitch_1f
        0x385f8471 -> :sswitch_1a
        0x3f9a0a67 -> :sswitch_13
        0x45fb8c2d -> :sswitch_d
        0x477f7bc9 -> :sswitch_c
        0x48387d8f -> :sswitch_12
        0x4ef6d427 -> :sswitch_f
        0x510e5670 -> :sswitch_15
        0x5763fa45 -> :sswitch_1a
        0x5998a2b8 -> :sswitch_6
        0x613cda8e -> :sswitch_12
        0x61810a79 -> :sswitch_19
        0x6dc1f6c0 -> :sswitch_1d
        0x6e62d25f -> :sswitch_6
        0x6eedf561 -> :sswitch_11
        0x71fd0a50 -> :sswitch_19
        0x76d28fa2 -> :sswitch_7
        0x78a95d4b -> :sswitch_f
        0x7a46bbe9 -> :sswitch_8
    .end sparse-switch
.end method
