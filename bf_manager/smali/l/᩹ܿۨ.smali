.class public final Ll/᩹ܿۨ;
.super Ljava/lang/Object;
.source "760C"

# interfaces
.implements Ll/ۖܿۨ;


# instance fields
.field public ۖ:I

.field public ۙ:I

.field public final ۚ:Ljava/util/Random;

.field public ۨ:[I

.field public ܰ:Ljava/util/HashSet;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x385baa83

    sget v3, Ll/ۗ᩺;->ۢۜ᩶:I

    sget v4, Ll/֫ۚ;->ܽ۠᩹:I

    .line 711
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v5, "\u06e1\u1a79"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x769

    const v7, -0x48e577b5

    xor-int/2addr v6, v7

    const v7, 0x17267a6f

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x49e1

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    sget v5, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v5, :cond_b

    goto/16 :goto_4

    .line 199
    :sswitch_0
    sget v5, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-lez v5, :cond_6

    goto/16 :goto_3

    .line 228
    :sswitch_1
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    sget-boolean v5, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v5, :cond_8

    goto/16 :goto_1

    .line 5
    :sswitch_2
    sget v5, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v5, :cond_a

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    goto/16 :goto_1

    .line 418
    :sswitch_4
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    const/4 p1, 0x1

    .line 714
    invoke-direct {p0, p1}, Ll/᩹ܿۨ;->ۙ(I)V

    return-void

    .line 705
    :sswitch_6
    iput-object v1, p0, Ll/᩹ܿۨ;->ܰ:Ljava/util/HashSet;

    .line 712
    iput-object p1, p0, Ll/᩹ܿۨ;->᩹:Ljava/lang/String;

    .line 33
    sget v5, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v5, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v5, "\u1a73\u1a77"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x71b5

    const v7, 0x20722e74

    xor-int/2addr v6, v7

    const v7, -0x77c6c6ee

    goto :goto_0

    .line 705
    :sswitch_7
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    sget v5, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v5, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v5, "\u06db\u06db"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x3d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1179

    const v7, -0x7c0ea523

    xor-int/2addr v6, v7

    const v7, 0x5a78d2a4

    goto :goto_0

    .line 697
    :sswitch_8
    iput-object v0, p0, Ll/᩹ܿۨ;->ۚ:Ljava/util/Random;

    .line 650
    sget v5, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v5, :cond_2

    goto :goto_1

    :cond_2
    const-string v5, "\u1a74\u073d"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2b3f

    const v7, 0x723d27ad

    xor-int/2addr v6, v7

    const v7, -0x2415e40

    goto/16 :goto_0

    .line 607
    :sswitch_9
    sget v5, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v5, :cond_3

    goto :goto_1

    :cond_3
    const-string v5, "\u0736\u073d"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x13c1

    const v7, -0x748ff4c2

    xor-int/2addr v6, v7

    const v7, -0x14075c82

    goto/16 :goto_0

    :sswitch_a
    sget v5, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v5, :cond_4

    goto :goto_2

    :cond_4
    const-string v5, "\u073a\u0733"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0xd

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x359b

    const v7, 0x423ed8fa

    xor-int/2addr v6, v7

    const v7, 0x776e6eec

    goto/16 :goto_0

    .line 296
    :sswitch_b
    sget v5, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v5, :cond_5

    :goto_1
    const-string v5, "\u06d6\u1a76"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x35

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x523f

    const v7, -0x6551d655

    xor-int/2addr v6, v7

    const v7, -0x39fdeeaf

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u05ab\u06da"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x77b5

    const v7, 0x18401f52

    xor-int/2addr v6, v7

    const v7, -0x5d3a2fc2

    goto/16 :goto_0

    .line 401
    :sswitch_c
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    move-result v5

    if-gtz v5, :cond_7

    :cond_6
    :goto_2
    const-string v5, "\u1a7b\u06e7"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7a8f

    const v7, -0x77e1fa64

    xor-int/2addr v6, v7

    const v7, 0x4940f5e4    # 790366.25f

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u06df\u073d"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3547

    const v7, 0x1457284a

    xor-int/2addr v6, v7

    const v7, -0x4c7bf121

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v5, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v5, :cond_9

    :cond_8
    :goto_3
    const-string v5, "\u1a76\u1a75"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x235f

    const v7, 0x4aa2d2a9    # 5335380.5f

    xor-int/2addr v6, v7

    const v7, 0x22c92fcd

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u0730\u06e7"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xa23

    const v7, -0xcd2522f

    xor-int/2addr v6, v7

    const v7, -0x269ffbc3

    goto/16 :goto_0

    :cond_a
    :goto_4
    const-string v5, "\u1a7b\u1a74"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xb59

    const v7, -0x1ec9b6c9

    xor-int/2addr v6, v7

    const v7, 0x2fc17a86

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u073a\u06e7"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x39

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x39f7

    const v7, -0x4574ac79

    xor-int/2addr v6, v7

    const v7, -0x70a2a945

    goto/16 :goto_0

    .line 697
    :sswitch_e
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 448
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v5

    if-gtz v5, :cond_c

    :goto_5
    const-string v5, "\u073d\u06db"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x5b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7e2f

    const v7, 0x37fb57e4

    xor-int/2addr v6, v7

    const v7, -0x5938b416

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u05ab\u06e4"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x603d

    const v7, 0x2757dc43

    xor-int/2addr v6, v7

    const v7, -0x11f5226a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d100419 -> :sswitch_6
        -0x6facba79 -> :sswitch_6
        -0x6b20d49e -> :sswitch_4
        -0x69842a1b -> :sswitch_5
        -0x5da2596a -> :sswitch_7
        -0x5bb70822 -> :sswitch_3
        -0x5a8445ff -> :sswitch_9
        -0x4a7df545 -> :sswitch_b
        -0x49930cec -> :sswitch_a
        -0x3fea1cf9 -> :sswitch_3
        -0x3dbc483d -> :sswitch_d
        -0x3a5b467f -> :sswitch_9
        -0x32e24856 -> :sswitch_2
        -0x1679c218 -> :sswitch_d
        -0x13ad1537 -> :sswitch_7
        -0x139b1102 -> :sswitch_b
        -0xa25fb7a -> :sswitch_0
        -0x79df490 -> :sswitch_1
        -0x2daa552 -> :sswitch_a
        0x42f9361 -> :sswitch_8
        0x4441933 -> :sswitch_c
        0x11ba158b -> :sswitch_2
        0x16a3f237 -> :sswitch_1
        0x1f89851a -> :sswitch_4
        0x36b73752 -> :sswitch_c
        0x386b9b94 -> :sswitch_e
        0x48c6a9c8 -> :sswitch_e
        0x4c3f261b -> :sswitch_0
        0x603b945f -> :sswitch_8
        0x67eda1ae -> :sswitch_5
    .end sparse-switch
.end method

.method private ۙ(I)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const v12, 0x49d185c8    # 1716409.0f

    sget v13, Ll/۟;->ۨᩴۛ:I

    sget v14, Ll/֨ۧ;->֫۠֡:I

    const-string v15, "\u05a1\u1a73"

    invoke-static {v15}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v14

    xor-int v2, v15, v13

    mul-int/lit16 v2, v2, -0x3ceb

    const v17, -0x3cc71584

    xor-int v2, v2, v17

    const v17, -0xce4d530

    xor-int v15, v15, v17

    move-object v4, v3

    move-wide v10, v9

    move/from16 v16, v15

    const/4 v3, 0x0

    const/4 v12, 0x0

    const v15, 0x49d185c8    # 1716409.0f

    move-wide v8, v7

    move-wide v6, v5

    const/4 v5, 0x0

    :goto_0
    xor-int/2addr v15, v13

    mul-int/lit16 v15, v15, 0x7861

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v2, v15

    xor-int v15, v16, v2

    sparse-switch v15, :sswitch_data_0

    .line 701
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v2

    if-nez v2, :cond_0

    :goto_1
    move/from16 v16, v15

    goto/16 :goto_2

    :cond_0
    move/from16 v16, v15

    goto/16 :goto_4

    .line 115
    :sswitch_0
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    sget v2, Ll/ۗ;->֨۬ۖ:I

    if-ltz v2, :cond_1

    goto :goto_1

    :cond_1
    move/from16 v16, v15

    goto/16 :goto_5

    .line 337
    :sswitch_1
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    invoke-static {}, Ll/֫;->ۛۖۤ()I

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    const-string v2, "\u1a79\u06db"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    move/from16 v16, v15

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, 0x13d

    const v17, 0x49700e7d

    xor-int v15, v15, v17

    const v17, -0x6b1935c8

    goto/16 :goto_6

    :sswitch_2
    move/from16 v16, v15

    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    return-void

    .line 720
    :sswitch_4
    iput v12, v0, Ll/᩹ܿۨ;->ۖ:I

    .line 721
    iget-object v1, v0, Ll/᩹ܿۨ;->ܰ:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    return-void

    :sswitch_5
    move/from16 v16, v15

    double-to-int v12, v10

    .line 534
    sget-boolean v2, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v2, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v2, "\u0733\u073f"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v13, v2

    mul-int/lit8 v2, v2, -0x4f

    xor-int v15, v2, v14

    mul-int/lit16 v15, v15, -0x55af

    const v17, -0x4e72689f

    xor-int v15, v15, v17

    const v17, 0x6dbe92be

    goto/16 :goto_6

    :sswitch_6
    move/from16 v16, v15

    .line 720
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v10

    .line 292
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result v2

    if-eqz v2, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v2, "\u1a74\u06d9"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v14

    mul-int/lit8 v2, v2, 0xf

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, 0x6dbf

    const v17, -0xe66c6c4

    xor-int v15, v15, v17

    const v17, -0x689bcc0a

    goto/16 :goto_6

    :sswitch_7
    move/from16 v16, v15

    int-to-double v6, v5

    int-to-double v8, v1

    .line 418
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v2

    if-gtz v2, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v2, "\u06ec\u05ab"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, 0x3681

    const v17, -0x30cab951

    xor-int v15, v15, v17

    const v17, -0x47d3e18

    goto/16 :goto_6

    :sswitch_8
    move/from16 v16, v15

    .line 720
    invoke-static {v4}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v5

    .line 143
    sget v2, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v2, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v2, "\u05a8\u06e7"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v15, v2, v14

    mul-int/lit16 v15, v15, -0x7c73

    const v17, 0x35f397e2

    xor-int v15, v15, v17

    const v17, -0x7721a970

    goto/16 :goto_6

    :sswitch_9
    move/from16 v16, v15

    .line 719
    iput-object v3, v0, Ll/᩹ܿۨ;->ۨ:[I

    .line 720
    iget-object v4, v0, Ll/᩹ܿۨ;->᩹:Ljava/lang/String;

    sget v2, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v2, :cond_7

    goto :goto_2

    :cond_7
    const-string v2, "\u06db\u05a8"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v15, v2, v14

    mul-int/lit16 v15, v15, 0x1665

    const v17, 0x2ff1c22b

    xor-int v15, v15, v17

    const v17, 0x31547790

    goto/16 :goto_6

    :sswitch_a
    move/from16 v16, v15

    .line 719
    new-array v3, v1, [I

    .line 503
    sget-boolean v2, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v2, :cond_8

    :goto_2
    const-string v2, "\u073a\u06df"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v15, v2, v14

    mul-int/lit16 v15, v15, 0x2bdd

    const v17, 0x742db183

    xor-int v15, v15, v17

    const v17, 0x37b911f6

    goto/16 :goto_6

    :cond_8
    const-string v2, "\u05a8\u05a1"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v14

    mul-int/lit8 v2, v2, -0x63

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, 0x7c21

    const v17, -0x67251dba

    xor-int v15, v15, v17

    const v17, -0x71758029

    goto/16 :goto_6

    :sswitch_b
    move/from16 v16, v15

    .line 718
    iput v1, v0, Ll/᩹ܿۨ;->ۙ:I

    .line 347
    sget v2, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v2, :cond_9

    goto :goto_4

    :cond_9
    const-string v2, "\u1a76\u06d7"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, -0xa27

    const v17, 0x341d07f4

    xor-int v15, v15, v17

    const v17, -0x647ed47c

    goto/16 :goto_6

    :sswitch_c
    move/from16 v16, v15

    sget v2, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v2, :cond_a

    :goto_3
    const-string v2, "\u0730\u0736"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, 0x11d9

    const v17, -0x5105bfc2

    xor-int v15, v15, v17

    const v17, -0x2a32d09c

    goto/16 :goto_6

    :cond_a
    const-string v2, "\u06d9\u1a74"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v15, v2, v14

    mul-int/lit16 v15, v15, 0x611f

    const v17, 0x17d944

    xor-int v15, v15, v17

    const v17, -0x430a2d8e    # -0.030007575f

    goto :goto_6

    :sswitch_d
    move/from16 v16, v15

    .line 487
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    move-result v2

    if-gtz v2, :cond_b

    :goto_4
    const-string v2, "\u05ab\u06db"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v14

    mul-int/lit8 v2, v2, 0x17

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, -0x1ded

    const v17, 0x7ec1c53e

    xor-int v15, v15, v17

    const v17, 0x2a6913e8

    goto :goto_6

    :cond_b
    const-string v2, "\u06da\u06ec"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, -0x524f

    const v17, 0x4e33e987    # 7.546065E8f

    xor-int v15, v15, v17

    const v17, 0x561fb6f7

    goto :goto_6

    :sswitch_e
    move/from16 v16, v15

    .line 90
    sget-boolean v2, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v2, :cond_c

    :goto_5
    const-string v2, "\u0730\u0733"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v15, v2, v14

    mul-int/lit16 v15, v15, 0xa1

    const v17, 0x32f94301

    xor-int v15, v15, v17

    const v17, -0x1f8d06a7

    goto :goto_6

    :cond_c
    const-string v2, "\u06e8\u073d"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v15, v2, v14

    mul-int/lit16 v15, v15, 0x713b

    const v17, 0x781d81b8

    xor-int v15, v15, v17

    const v17, -0x277edd

    :goto_6
    xor-int v2, v2, v17

    move/from16 v18, v16

    move/from16 v16, v2

    move v2, v15

    move/from16 v15, v18

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x773edcfc -> :sswitch_7
        -0x7029f50a -> :sswitch_1
        -0x695834b4 -> :sswitch_e
        -0x63d8f561 -> :sswitch_e
        -0x61c1cb47 -> :sswitch_6
        -0x59f8e7d5 -> :sswitch_3
        -0x5619dc67 -> :sswitch_5
        -0x55f71e3f -> :sswitch_4
        -0x1911bc93 -> :sswitch_4
        -0xea6272c -> :sswitch_2
        -0x4cf076e -> :sswitch_8
        -0x2225dc4 -> :sswitch_3
        -0x1c1c635 -> :sswitch_a
        0x9910c3a -> :sswitch_0
        0x1f080168 -> :sswitch_6
        0x1f39983e -> :sswitch_9
        0x297f81fc -> :sswitch_9
        0x2a07ca25 -> :sswitch_8
        0x2a164a75 -> :sswitch_1
        0x2b30f66f -> :sswitch_c
        0x2c6c36e4 -> :sswitch_b
        0x33a344cb -> :sswitch_c
        0x35bc0959 -> :sswitch_d
        0x42bab580 -> :sswitch_7
        0x6152d32b -> :sswitch_5
        0x6ba77b7d -> :sswitch_d
        0x6eed5e5f -> :sswitch_a
        0x729f23c3 -> :sswitch_0
        0x769169e6 -> :sswitch_b
        0x7aae0ade -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final declared-synchronized ۙ()Ljava/lang/String;
    .locals 9

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 732
    :try_start_0
    iget-object v1, p0, Ll/᩹ܿۨ;->ܰ:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    move-result v1

    iget v2, p0, Ll/᩹ܿۨ;->ۖ:I

    if-lt v1, v2, :cond_0

    .line 733
    iget v1, p0, Ll/᩹ܿۨ;->ۙ:I

    add-int/lit8 v1, v1, 0x1

    invoke-direct {p0, v1}, Ll/᩹ܿۨ;->ۙ(I)V

    .line 736
    :cond_0
    iget-object v1, p0, Ll/᩹ܿۨ;->᩹:Ljava/lang/String;

    invoke-static {v1}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v1

    .line 737
    iget-object v2, p0, Ll/᩹ܿۨ;->ۨ:[I

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/16 v5, 0x3e8

    const/4 v6, -0x1

    if-ge v4, v5, :cond_2

    const/4 v5, 0x0

    const/4 v7, 0x0

    .line 743
    :goto_1
    array-length v8, v2

    if-ge v5, v8, :cond_1

    .line 744
    iget-object v8, p0, Ll/᩹ܿۨ;->ۚ:Ljava/util/Random;

    invoke-virtual {v8, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v8

    .line 745
    aput v8, v2, v5

    mul-int v7, v7, v1

    add-int/2addr v7, v8

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 748
    :cond_1
    iget-object v5, p0, Ll/᩹ܿۨ;->ܰ:Ljava/util/HashSet;

    invoke-static {v7}, Ll/ۖ᩸;->᩷֡ۗ(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Ll/ۗ᩺;->֡ܽᩴ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v7, -0x1

    :cond_3
    if-ne v7, v6, :cond_6

    const/4 v4, 0x0

    .line 755
    :goto_2
    iget v5, p0, Ll/᩹ܿۨ;->ۖ:I

    if-ge v4, v5, :cond_6

    .line 756
    iget-object v5, p0, Ll/᩹ܿۨ;->ܰ:Ljava/util/HashSet;

    invoke-static {v4}, Ll/ۖ᩸;->᩷֡ۗ(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Ll/֨᩹;->᩻ۢۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    .line 758
    array-length v5, v2

    add-int/lit8 v5, v5, -0x1

    move v7, v4

    :goto_3
    if-ltz v5, :cond_4

    .line 759
    rem-int v8, v7, v1

    aput v8, v2, v5

    .line 760
    div-int/2addr v7, v1

    add-int/lit8 v5, v5, -0x1

    goto :goto_3

    :cond_4
    move v7, v4

    goto :goto_4

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_6
    :goto_4
    if-eq v7, v6, :cond_8

    .line 768
    iget-object v1, p0, Ll/᩹ܿۨ;->ܰ:Ljava/util/HashSet;

    invoke-static {v7}, Ll/֨ܰ;->᩸ܽ֨(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Ll/֡᩸;->᩵۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 770
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 772
    array-length v4, v2

    :goto_5
    if-ge v3, v4, :cond_7

    aget v5, v2, v3

    .line 773
    iget-object v6, p0, Ll/᩹ܿۨ;->᩹:Ljava/lang/String;

    invoke-static {v6, v5}, Ll/֫ᩳ;->ᩳܺ᩻(Ljava/lang/Object;I)C

    move-result v5

    invoke-static {v1, v5}, Ll/᩶;->ۧܰ۬(Ljava/lang/Object;C)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    .line 776
    :cond_7
    invoke-static {v1}, Ll/֨ۖ;->ܳۤۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    .line 767
    :cond_8
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    :catchall_0
    move-exception v1

    .line 776
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
