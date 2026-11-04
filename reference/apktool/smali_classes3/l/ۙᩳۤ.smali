.class public final Ll/ۙᩳۤ;
.super Ljava/lang/Object;
.source "760C"

# interfaces
.implements Ll/ۜ۟ۤ;


# instance fields
.field public ۙ:I

.field public ۤ:[I

.field public final ܳ:Ljava/lang/String;

.field public final ᩴ:Ljava/util/Random;

.field public ᩷:Ljava/util/HashSet;

.field public ᩸:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x3b40d280

    sget v3, Ll/֡ۢ;->۟֡᩻:I

    sget v4, Ll/֡᩵;->ۤܳ۬:I

    .line 711
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v5, "\u06e8\u06d7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x20d9

    const v7, 0x72e33425    # 9.0004654E30f

    xor-int/2addr v6, v7

    const v7, -0x7351e15c

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x30cb

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 542
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v5

    if-gtz v5, :cond_7

    goto/16 :goto_2

    .line 548
    :sswitch_0
    sget v5, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v5, :cond_2

    goto/16 :goto_2

    .line 680
    :sswitch_1
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result v5

    if-nez v5, :cond_b

    goto/16 :goto_3

    .line 667
    :sswitch_2
    sget v5, Ll/ۧ;->ۨۗܰ:I

    if-ltz v5, :cond_9

    goto/16 :goto_2

    .line 536
    :sswitch_3
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    const/4 p1, 0x1

    .line 714
    invoke-direct {p0, p1}, Ll/ۙᩳۤ;->ۙ(I)V

    return-void

    .line 705
    :sswitch_6
    iput-object v1, p0, Ll/ۙᩳۤ;->᩷:Ljava/util/HashSet;

    .line 712
    iput-object p1, p0, Ll/ۙᩳۤ;->ܳ:Ljava/lang/String;

    sget v5, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v5, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v5, "\u1a7b\u06e2"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x23

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4491

    const v7, -0x51bbdee6

    xor-int/2addr v6, v7

    const v7, -0x3a6b1f4f

    goto :goto_0

    .line 705
    :sswitch_7
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 506
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v5

    if-gtz v5, :cond_1

    goto :goto_1

    :cond_1
    const-string v5, "\u0733\u1a75"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x45

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1091

    const v7, -0x154fc28b

    xor-int/2addr v6, v7

    const v7, 0x109a03b9

    goto/16 :goto_0

    .line 697
    :sswitch_8
    iput-object v0, p0, Ll/ۙᩳۤ;->ᩴ:Ljava/util/Random;

    .line 611
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    const-string v5, "\u06ec\u06d7"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1a03

    const v7, 0x2c4550d5

    xor-int/2addr v6, v7

    const v7, 0x2fd389df

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u1a76\u1a73"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7317

    const v7, -0x62472c6

    xor-int/2addr v6, v7

    const v7, -0x19fb9af4

    goto/16 :goto_0

    .line 209
    :sswitch_9
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result v5

    if-eqz v5, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v5, "\u0733\u1a7a"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x6d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6899

    const v7, -0x3769bd

    xor-int/2addr v6, v7

    const v7, 0x29878510

    goto/16 :goto_0

    :sswitch_a
    sget v5, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v5, :cond_5

    :goto_1
    const-string v5, "\u06eb\u1a78"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x79

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6b29

    const v7, -0x5966f28a

    xor-int/2addr v6, v7

    const v7, -0x6543d027

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u073a\u1a74"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x56cf

    const v7, 0x60cf368

    xor-int/2addr v6, v7

    const v7, -0x38bb5155

    goto/16 :goto_0

    .line 550
    :sswitch_b
    sget v5, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v5, :cond_6

    goto :goto_2

    :cond_6
    const-string v5, "\u05a8\u06d7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x41

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x72fb

    const v7, 0x4f33e69f

    xor-int/2addr v6, v7

    const v7, -0x336a3628    # -7.853229E7f

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u073d\u06dc"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x19

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x21eb

    const v7, -0x3186c4f8

    xor-int/2addr v6, v7

    const v7, 0x190bab1d

    goto/16 :goto_0

    .line 577
    :sswitch_c
    sget-boolean v5, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v5, :cond_8

    :goto_2
    const-string v5, "\u06d7\u06e1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x3f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2c67

    const v7, 0x5c9482d3

    xor-int/2addr v6, v7

    const v7, -0x7e58bc69

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u1a73\u1a74"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x59d9

    const v7, -0x45af5c44

    xor-int/2addr v6, v7

    const v7, 0x396d30b6

    goto/16 :goto_0

    :sswitch_d
    sget v5, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v5, :cond_a

    :cond_9
    :goto_3
    const-string v5, "\u1a75\u06e2"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x48a1

    const v7, -0x7a3d4a06

    xor-int/2addr v6, v7

    const v7, -0x9188ba6

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u1a75\u06df"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x5d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6bad

    const v7, -0x79eba5c9

    xor-int/2addr v6, v7

    const v7, -0x2a3ae80f

    goto/16 :goto_0

    .line 697
    :sswitch_e
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sget-boolean v5, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v5, :cond_c

    :cond_b
    :goto_4
    const-string v5, "\u06e8\u06ec"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x7f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5d55

    const v7, -0x3e93cd52

    xor-int/2addr v6, v7

    const v7, 0x6db89c3

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06d7\u1a76"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x5d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x66eb

    const v7, 0x304d957a

    xor-int/2addr v6, v7

    const v7, -0x12d7be79

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d5a5c42 -> :sswitch_d
        -0x793ddd48 -> :sswitch_5
        -0x77e6e7d2 -> :sswitch_4
        -0x73742d3b -> :sswitch_a
        -0x7162af16 -> :sswitch_d
        -0x682c62e8 -> :sswitch_b
        -0x670e0b1f -> :sswitch_9
        -0x5d5e2d54 -> :sswitch_8
        -0x5af93eba -> :sswitch_1
        -0x52541344 -> :sswitch_a
        -0x50560962 -> :sswitch_c
        -0x477d2912 -> :sswitch_6
        -0x442d28f0 -> :sswitch_4
        -0x308dfd7e -> :sswitch_b
        -0x2c472a82 -> :sswitch_7
        -0x18acc1b2 -> :sswitch_c
        -0xd0455e2 -> :sswitch_9
        -0x63b8171 -> :sswitch_3
        -0x20e7e35 -> :sswitch_0
        0x67b57b9 -> :sswitch_e
        0xaff459d -> :sswitch_0
        0x13178d62 -> :sswitch_e
        0x34dca135 -> :sswitch_8
        0x3f56b350 -> :sswitch_5
        0x442986c4 -> :sswitch_7
        0x50f5b588 -> :sswitch_2
        0x5dae084b -> :sswitch_2
        0x6278b16d -> :sswitch_1
        0x6ce703d8 -> :sswitch_6
        0x7c31daa5 -> :sswitch_3
    .end sparse-switch
.end method

.method private ۙ(I)V
    .locals 22

    move-object/from16 v0, p0

    move/from16 v1, p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const v12, -0x60ba818e

    sget v13, Ll/ۧ;->ۨۗܰ:I

    sget v14, Ll/ۘ֡;->᩹ܶ۬:I

    const-string v15, "\u073d\u1a73"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    sub-int v15, v14, v15

    mul-int/lit8 v15, v15, -0x6f

    xor-int v2, v15, v13

    mul-int/lit16 v2, v2, -0x4565

    const v17, 0x2017be92

    xor-int v2, v2, v17

    const v17, 0x1b250136

    xor-int v15, v15, v17

    move-object v4, v3

    move-wide v10, v9

    move/from16 v16, v15

    const/4 v3, 0x0

    const/4 v12, 0x0

    const v15, -0x60ba818e

    move-wide v8, v7

    move-wide v6, v5

    const/4 v5, 0x0

    :goto_0
    xor-int/2addr v15, v13

    mul-int/lit16 v15, v15, 0x783d

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v2, v15

    xor-int v15, v16, v2

    sparse-switch v15, :sswitch_data_0

    move-wide/from16 v18, v6

    move-wide/from16 v16, v10

    .line 297
    sget v2, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v2, :cond_c

    goto/16 :goto_9

    :sswitch_0
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    sget-boolean v2, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-nez v2, :cond_1

    :cond_0
    move-wide/from16 v16, v10

    goto/16 :goto_4

    :cond_1
    :goto_1
    move-wide/from16 v18, v6

    move-wide/from16 v16, v10

    goto/16 :goto_8

    .line 351
    :sswitch_1
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    sget v2, Ll/ۘܽ;->᩹ۧۚ:I

    if-lez v2, :cond_0

    :cond_2
    move-wide/from16 v18, v6

    move-wide/from16 v16, v10

    goto/16 :goto_7

    .line 70
    :sswitch_2
    sget v2, Ll/ۧ;->ۨۗܰ:I

    if-ltz v2, :cond_2

    :goto_2
    move-wide/from16 v18, v6

    goto/16 :goto_6

    .line 281
    :sswitch_3
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    goto :goto_2

    :sswitch_4
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    return-void

    .line 720
    :sswitch_5
    iput v12, v0, Ll/ۙᩳۤ;->᩸:I

    .line 721
    iget-object v1, v0, Ll/ۙᩳۤ;->᩷:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    return-void

    :sswitch_6
    double-to-int v12, v10

    .line 695
    sget v2, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v2, :cond_3

    goto :goto_1

    :cond_3
    const-string v2, "\u06d8\u06e1"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v14

    mul-int/lit8 v2, v2, 0x69

    move-wide/from16 v16, v10

    xor-int v10, v2, v13

    mul-int/lit16 v10, v10, -0x65ff

    const v11, 0x1c229913

    xor-int/2addr v10, v11

    const v11, 0x38ee7418

    goto :goto_5

    .line 720
    :sswitch_7
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v10

    sget v2, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v2, :cond_4

    goto :goto_2

    :cond_4
    const-string v2, "\u1a74\u1a77"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    move-wide/from16 v18, v6

    xor-int v6, v2, v14

    mul-int/lit16 v6, v6, 0x6c1f

    const v7, 0x40b35561

    xor-int/2addr v6, v7

    const v7, -0x33bc93ab    # -5.1229012E7f

    :goto_3
    xor-int v16, v2, v7

    goto/16 :goto_b

    :sswitch_8
    move-wide/from16 v16, v10

    int-to-double v6, v5

    int-to-double v8, v1

    .line 17
    sget v2, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v2, :cond_5

    :goto_4
    const-string v2, "\u06e1\u05ab"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v10, v2, v13

    mul-int/lit16 v10, v10, -0x5ecb

    const v11, 0x772b0881

    xor-int/2addr v10, v11

    const v11, -0x7b9258f7

    goto :goto_5

    :cond_5
    const-string v2, "\u06db\u0736"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v10, v2, v13

    mul-int/lit16 v10, v10, 0x10eb

    const v11, -0x63cbb3d5

    xor-int/2addr v10, v11

    const v11, 0x30a9849

    :goto_5
    xor-int/2addr v2, v11

    move-wide/from16 v20, v16

    move/from16 v16, v2

    move v2, v10

    move-wide/from16 v10, v20

    goto/16 :goto_0

    :sswitch_9
    move-wide/from16 v18, v6

    move-wide/from16 v16, v10

    .line 720
    invoke-static {v4}, Ll/ۖ᩹;->ᩳ᩶ۖ(Ljava/lang/Object;)I

    move-result v5

    sget v2, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v2, :cond_6

    goto/16 :goto_9

    :cond_6
    const-string v2, "\u073a\u06dc"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    mul-int/lit8 v2, v2, 0x3b

    xor-int v6, v2, v14

    mul-int/lit16 v6, v6, 0x363f

    const v7, 0x7c10fff1

    xor-int/2addr v6, v7

    const v7, 0x5255e854

    goto/16 :goto_a

    :sswitch_a
    move-wide/from16 v18, v6

    move-wide/from16 v16, v10

    .line 719
    iput-object v3, v0, Ll/ۙᩳۤ;->ۤ:[I

    .line 720
    iget-object v4, v0, Ll/ۙᩳۤ;->ܳ:Ljava/lang/String;

    sget-boolean v2, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v2, :cond_7

    goto/16 :goto_9

    :cond_7
    const-string v2, "\u06e0\u1a77"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    mul-int/lit8 v2, v2, -0x4d

    xor-int v6, v2, v14

    mul-int/lit16 v6, v6, -0x759

    const v7, -0x1fdbf231

    xor-int/2addr v6, v7

    const v7, 0x35efb6ea

    goto/16 :goto_a

    :sswitch_b
    move-wide/from16 v18, v6

    move-wide/from16 v16, v10

    .line 719
    new-array v3, v1, [I

    .line 60
    sget v2, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v2, :cond_8

    goto/16 :goto_9

    :cond_8
    const-string v2, "\u06d7\u06d7"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    mul-int/lit8 v2, v2, -0x13

    xor-int v6, v2, v13

    mul-int/lit16 v6, v6, 0x5933

    const v7, -0x4816a44d

    xor-int/2addr v6, v7

    const v7, 0x4112893f

    goto/16 :goto_a

    :sswitch_c
    move-wide/from16 v18, v6

    move-wide/from16 v16, v10

    .line 718
    iput v1, v0, Ll/ۙᩳۤ;->ۙ:I

    .line 246
    sget v2, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v2, :cond_9

    move-wide/from16 v10, v16

    :goto_6
    const-string v2, "\u06e4\u0733"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    mul-int/lit8 v2, v2, -0x51

    xor-int v6, v2, v14

    mul-int/lit16 v6, v6, -0x4751

    const v7, 0x78badd4d

    xor-int/2addr v6, v7

    const v7, -0x24da40e4

    goto/16 :goto_3

    :cond_9
    const-string v2, "\u06e0\u0733"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v6, v2, v14

    mul-int/lit16 v6, v6, 0x50f

    const v7, -0xc24d73d

    xor-int/2addr v6, v7

    const v7, -0x716a869c

    goto/16 :goto_a

    :sswitch_d
    move-wide/from16 v18, v6

    move-wide/from16 v16, v10

    .line 449
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v2

    if-eqz v2, :cond_a

    :goto_7
    const-string v2, "\u05ab\u1a7b"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v6, v2, v13

    mul-int/lit16 v6, v6, 0x6c9b

    const v7, 0x25d535a6

    xor-int/2addr v6, v7

    const v7, -0x73cfc123

    goto :goto_a

    :cond_a
    const-string v2, "\u06e8\u1a76"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v6, v2, v13

    mul-int/lit16 v6, v6, 0x73c1

    const v7, -0x3226dd2b

    xor-int/2addr v6, v7

    const v7, -0x3f9b9a9d

    goto :goto_a

    :sswitch_e
    move-wide/from16 v18, v6

    move-wide/from16 v16, v10

    .line 680
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v2

    if-eqz v2, :cond_b

    :goto_8
    const-string v2, "\u06d8\u1a78"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v13, v2

    mul-int/lit8 v2, v2, -0x35

    xor-int v6, v2, v14

    mul-int/lit16 v6, v6, 0x3ed

    const v7, 0x1722239

    xor-int/2addr v6, v7

    const v7, -0xaa96b0c

    goto :goto_a

    :cond_b
    const-string v2, "\u06eb\u06da"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v6, v2, v13

    mul-int/lit16 v6, v6, 0x787

    const v7, 0x4f16efa3

    xor-int/2addr v6, v7

    const v7, 0x1a4d8b1a

    goto :goto_a

    :goto_9
    const-string v2, "\u05ab\u06e1"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v6, v2, v14

    mul-int/lit16 v6, v6, -0x1cb1

    const v7, 0x793b0ec4

    xor-int/2addr v6, v7

    const v7, 0x2b9b4f46

    goto :goto_a

    :cond_c
    const-string v2, "\u06d6\u06d9"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    mul-int/lit8 v2, v2, -0x25

    xor-int v6, v2, v14

    mul-int/lit16 v6, v6, -0x3aaf

    const v7, 0x62a96f74

    xor-int/2addr v6, v7

    const v7, -0x3394e63a    # -6.163023E7f

    :goto_a
    xor-int/2addr v2, v7

    move-wide/from16 v10, v16

    move/from16 v16, v2

    :goto_b
    move v2, v6

    move-wide/from16 v6, v18

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x77ed575a -> :sswitch_8
        -0x7561df4d -> :sswitch_1
        -0x71ece081 -> :sswitch_b
        -0x6dc5c784 -> :sswitch_2
        -0x6b6953a1 -> :sswitch_5
        -0x5a575225 -> :sswitch_3
        -0x574341df -> :sswitch_a
        -0x520adb2b -> :sswitch_2
        -0x4686357c -> :sswitch_0
        -0x4163ce25 -> :sswitch_3
        -0x2ed4d824 -> :sswitch_6
        -0x1d088ed4 -> :sswitch_a
        -0x1bd3d04d -> :sswitch_9
        -0x18ab0795 -> :sswitch_8
        -0x16033325 -> :sswitch_c
        0x18d1ae9 -> :sswitch_4
        0x95f24eb -> :sswitch_e
        0x1c779663 -> :sswitch_b
        0x21df3215 -> :sswitch_9
        0x2a921ac4 -> :sswitch_7
        0x2fa04f0c -> :sswitch_0
        0x33d50f63 -> :sswitch_d
        0x373819cf -> :sswitch_5
        0x447b337b -> :sswitch_d
        0x4c8f3814 -> :sswitch_e
        0x4f2321e2 -> :sswitch_c
        0x5d1790e9 -> :sswitch_4
        0x5ea21182 -> :sswitch_6
        0x620a5248 -> :sswitch_1
        0x721884dc -> :sswitch_7
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
    iget-object v1, p0, Ll/ۙᩳۤ;->᩷:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    move-result v1

    iget v2, p0, Ll/ۙᩳۤ;->᩸:I

    if-lt v1, v2, :cond_0

    .line 733
    iget v1, p0, Ll/ۙᩳۤ;->ۙ:I

    add-int/lit8 v1, v1, 0x1

    invoke-direct {p0, v1}, Ll/ۙᩳۤ;->ۙ(I)V

    .line 736
    :cond_0
    iget-object v1, p0, Ll/ۙᩳۤ;->ܳ:Ljava/lang/String;

    invoke-static {v1}, Ll/ۖ᩹;->ᩳ᩶ۖ(Ljava/lang/Object;)I

    move-result v1

    .line 737
    iget-object v2, p0, Ll/ۙᩳۤ;->ۤ:[I

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
    iget-object v8, p0, Ll/ۙᩳۤ;->ᩴ:Ljava/util/Random;

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
    iget-object v5, p0, Ll/ۙᩳۤ;->᩷:Ljava/util/HashSet;

    invoke-static {v7}, Ll/֡᩻;->ۚ᩹ܶ(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Ll/᩶;->ۜ᩶ܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget v5, p0, Ll/ۙᩳۤ;->᩸:I

    if-ge v4, v5, :cond_6

    .line 756
    iget-object v5, p0, Ll/ۙᩳۤ;->᩷:Ljava/util/HashSet;

    invoke-static {v4}, Ll/֡᩻;->ۚ᩹ܶ(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Ll/֡ܳ;->ۖ۟۟(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Ll/ۙᩳۤ;->᩷:Ljava/util/HashSet;

    invoke-static {v7}, Ll/֡᩻;->ۚ᩹ܶ(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Ll/֨ۖ;->۫ۘܿ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 770
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 772
    array-length v4, v2

    :goto_5
    if-ge v3, v4, :cond_7

    aget v5, v2, v3

    .line 773
    iget-object v6, p0, Ll/ۙᩳۤ;->ܳ:Ljava/lang/String;

    invoke-static {v6, v5}, Ll/֨ᩳ;->֡᩶ۖ(Ljava/lang/Object;I)C

    move-result v5

    invoke-static {v1, v5}, Ll/֫ܺ;->ۤᩳᩴ(Ljava/lang/Object;C)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    .line 776
    :cond_7
    invoke-static {v1}, Ll/֫ܺ;->ۛۗۛ(Ljava/lang/Object;)Ljava/lang/String;

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
