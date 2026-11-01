.class public final synthetic Ll/᩵ۢۨ;
.super Ljava/lang/Object;
.source "D60A"

# interfaces
.implements Ljava/util/function/Function;


# static fields
.field private static final ۘۘܰ:[S


# instance fields
.field public final synthetic ܺ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic ᩶:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩵ۢۨ;->ۘۘܰ:[S

    return-void

    :array_0
    .array-data 2
        0x1612s
        0x7284s
        0x72a3s
        0x72a5s
        0x72bes
        0x72b9s
        0x72b0s
        0x72f7s
    .end array-data
.end method

.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicInteger;Ljava/lang/String;)V
    .locals 6

    const v0, -0x14b7e0d0

    sget v1, Ll/֫ۚ;->ܽ۠᩹:I

    sget v2, Ll/ۗᩳ;->ۚۤ֡:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06e1\u06d6"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2627

    const v5, 0x688498e9

    xor-int/2addr v4, v5

    const v5, -0x7f886a10

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x1f35

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    iput-object p2, p0, Ll/᩵ۢۨ;->᩶:Ljava/lang/String;

    return-void

    :sswitch_0
    sget v3, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v3, :cond_6

    goto/16 :goto_4

    .line 2
    :sswitch_1
    sget v3, Ll/֫ܽ;->֡ᩴܶ:I

    if-gez v3, :cond_9

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    sget v3, Ll/֫ܽ;->֡ᩴܶ:I

    if-gez v3, :cond_b

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    :goto_1
    const-string v3, "\u073d\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3ffd

    const v5, 0x27c9e943

    xor-int/2addr v4, v5

    const v5, 0x5fb3b4a

    goto :goto_0

    .line 0
    :sswitch_4
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_2

    :cond_0
    const-string v3, "\u0733\u1a76"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x43

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x325

    const v5, 0x2f311fa3

    xor-int/2addr v4, v5

    const v5, 0x224fb4c6

    goto :goto_0

    :sswitch_6
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u06da\u06eb"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4d3d

    const v5, 0x2d087999

    xor-int/2addr v4, v5

    const v5, 0x73922731

    goto :goto_0

    .line 1
    :sswitch_7
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_2
    const-string v3, "\u1a77\u06e7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x55

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x504b

    const v5, 0x35f4884c

    xor-int/2addr v4, v5

    const v5, 0x50e32c34

    goto/16 :goto_0

    :cond_2
    const-string v3, "\u073a\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x42bd

    const v5, -0x50574140

    xor-int/2addr v4, v5

    const v5, -0x42727e3a

    goto/16 :goto_0

    .line 3
    :sswitch_8
    sget v3, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u06d7\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3795

    const v5, -0x64c2997d

    xor-int/2addr v4, v5

    const v5, -0x5f127658

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    const-string v3, "\u05a8\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6c43

    const v5, -0x77843147

    xor-int/2addr v4, v5

    const v5, 0x257f6517

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_3

    :cond_5
    const-string v3, "\u05a8\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x119b

    const v5, -0x1147150d

    xor-int/2addr v4, v5

    const v5, 0x1aa38338

    goto/16 :goto_0

    .line 0
    :sswitch_b
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v3

    if-eqz v3, :cond_7

    :cond_6
    :goto_3
    const-string v3, "\u06df\u06d7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x1d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1b79

    const v5, 0x1bc87d88

    xor-int/2addr v4, v5

    const v5, 0x1e591cf4

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06ec\u06e1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x18d9

    const v5, -0x6ec9bced

    xor-int/2addr v4, v5

    const v5, 0x2396a3f8

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/֨ۧ;->֫۠֡:I

    if-gtz v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "\u1a74\u06dc"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x766d

    const v5, -0x412392df

    xor-int/2addr v4, v5

    const v5, 0x184721be

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۗ;->֨۬ۖ:I

    if-ltz v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u073a\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x69

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x67d3

    const v5, -0x1a8f5689

    xor-int/2addr v4, v5

    const v5, 0x770bcee2

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06db\u06d6"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2e0f

    const v5, -0x20c69ce6

    xor-int/2addr v4, v5

    const v5, 0x113cea0b

    goto/16 :goto_0

    :sswitch_e
    iput-object p1, p0, Ll/᩵ۢۨ;->ܺ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    move-result v3

    if-gtz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u05a1\u073f"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6683

    const v5, -0x499c26ba

    xor-int/2addr v4, v5

    const v5, -0x51340996

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a73\u05a8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1649

    const v5, 0x2817e49f

    xor-int/2addr v4, v5

    const v5, 0x7dabfb2f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b9a489c -> :sswitch_d
        -0x6cdb9a9d -> :sswitch_a
        -0x55e5df3b -> :sswitch_1
        -0x51740f93 -> :sswitch_6
        -0x50c6aa7e -> :sswitch_8
        -0x4a81d693 -> :sswitch_0
        -0x426970ce -> :sswitch_a
        -0x2d21736d -> :sswitch_5
        -0x1c57ccfb -> :sswitch_d
        -0x15d3f5f1 -> :sswitch_4
        -0x11c91aef -> :sswitch_e
        -0xca1d484 -> :sswitch_0
        -0x86c3272 -> :sswitch_b
        -0x1141878 -> :sswitch_c
        0x5fe15c4 -> :sswitch_9
        0xc3da85f -> :sswitch_7
        0x1cca0cd4 -> :sswitch_8
        0x1e77b85a -> :sswitch_e
        0x2f3742f0 -> :sswitch_5
        0x30cbb26b -> :sswitch_3
        0x350565f4 -> :sswitch_1
        0x3eeda32b -> :sswitch_7
        0x46f0e2d1 -> :sswitch_2
        0x525ab2af -> :sswitch_6
        0x5752de5e -> :sswitch_4
        0x5b280b16 -> :sswitch_c
        0x5c850fd8 -> :sswitch_3
        0x6478e8e9 -> :sswitch_2
        0x67be40f3 -> :sswitch_9
        0x75bfdf4c -> :sswitch_b
    .end sparse-switch
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۘ᩻ᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    const/4 v2, 0x0

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

    const v14, 0x28ac25f8

    sget v15, Ll/֡֡;->᩶ۤ۠:I

    sget v16, Ll/ۘۗ;->ۖۧ۬:I

    const-string v17, "\u06d6\u05ab"

    invoke-static/range {v17 .. v17}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v16

    mul-int/lit8 v17, v17, -0x1f

    xor-int v1, v17, v15

    mul-int/lit16 v1, v1, 0x3c87

    const v19, 0x22e7aa45

    xor-int v1, v1, v19

    const v19, 0x7731d5d4

    xor-int v17, v17, v19

    move-object/from16 v20, v4

    move-object v13, v12

    move/from16 v18, v17

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const v17, 0x28ac25f8

    move-object v4, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v5, v17, v15

    mul-int/lit16 v5, v5, 0x574f

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v1, v5

    xor-int v17, v18, v1

    sparse-switch v17, :sswitch_data_0

    aget-short v7, v20, v6

    add-int/lit16 v8, v7, 0xb10

    .line 9
    sget-boolean v1, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v1, :cond_8

    goto/16 :goto_6

    .line 41
    :sswitch_0
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    sget v1, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v1, :cond_c

    goto :goto_1

    .line 7
    :sswitch_2
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v1

    if-gtz v1, :cond_6

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    goto :goto_1

    .line 5
    :sswitch_4
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    const/4 v1, 0x0

    return-object v1

    .line 101
    :sswitch_5
    new-instance v1, Ll/ܶۜᩴ;

    invoke-direct {v1}, Ll/ܶۜᩴ;-><init>()V

    invoke-virtual {v3, v1}, Ll/᩺ۗۨ;->ۙ(Ll/ܶۜᩴ;)V

    return-object v3

    .line 24
    :sswitch_6
    new-instance v3, Ll/᩺ۗۨ;

    const/4 v1, 0x0

    iget-object v5, v0, Ll/᩵ۢۨ;->᩶:Ljava/lang/String;

    .line 8
    sget-boolean v18, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v18, :cond_0

    goto/16 :goto_6

    .line 24
    :cond_0
    invoke-direct {v3, v5, v2, v4, v1}, Ll/᩺ۗۨ;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 44
    sget-boolean v1, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v1, :cond_1

    :goto_1
    const-string v1, "\u06e1\u06d6"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x6f09

    const v18, 0x7416a371

    xor-int v5, v5, v18

    const v18, 0x1313dcbf

    goto/16 :goto_7

    :cond_1
    const-string v1, "\u05ab\u06e2"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x2f

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x2383

    const v18, -0x4695b9bb

    xor-int v5, v5, v18

    const v18, 0x3103bb90

    goto/16 :goto_7

    :sswitch_7
    const/4 v1, 0x7

    .line 99
    invoke-static {v13, v14, v1, v12}, Ll/֫ᩳ;->᩵ۡ᩻([SIII)Ljava/lang/String;

    move-result-object v1

    .line 0
    invoke-static {v2, v1}, Ll/ۗ᩺;->ۧ᩺ۖ(ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 2
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    const-string v1, "\u05a8\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x49

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x4e05

    const v18, 0x77049e47

    xor-int v5, v5, v18

    const v18, 0x5c237919

    goto/16 :goto_7

    .line 99
    :sswitch_8
    sget-object v13, Ll/᩵ۢۨ;->ۘۘܰ:[S

    const/4 v14, 0x1

    sget-boolean v1, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v1, :cond_3

    :goto_2
    const-string v1, "\u073a\u0733"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x67

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x3bad

    const v18, 0x5ce9399f

    xor-int v5, v5, v18

    const v18, -0x12279470

    goto/16 :goto_7

    :cond_3
    const-string v1, "\u06ec\u06d9"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x7a95

    const v18, 0x7249ead6    # 3.9993847E30f

    xor-int v5, v5, v18

    const v18, 0x733b9807

    goto/16 :goto_7

    .line 2
    :sswitch_9
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    .line 99
    iget-object v1, v0, Ll/᩵ۢۨ;->ܺ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {v1}, Ll/ۘۗ;->֫᩺۟(Ljava/lang/Object;)I

    move-result v2

    sget-boolean v1, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v1, :cond_4

    goto :goto_4

    :cond_4
    const-string v1, "\u073a\u06d7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x4f4f

    const v18, -0xf77d9f6

    xor-int v5, v5, v18

    const v18, -0x6bfc87d0

    goto/16 :goto_7

    :sswitch_a
    const/16 v1, 0x4d43

    const/16 v12, 0x4d43

    goto :goto_3

    :sswitch_b
    const/16 v1, 0x72d7

    const/16 v12, 0x72d7

    :goto_3
    const-string v1, "\u06e7\u06d6"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x2d43

    const v18, 0x2870d6e5

    xor-int v5, v5, v18

    const v18, 0x18ce2b98

    goto/16 :goto_7

    :sswitch_c
    add-int v1, v10, v11

    add-int/2addr v1, v1

    sub-int v1, v9, v1

    if-gtz v1, :cond_5

    const-string v1, "\u1a73\u0733"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x7571

    const v18, -0x4dd98faf

    xor-int v5, v5, v18

    const v18, -0x4b367b42

    goto/16 :goto_7

    :cond_5
    const-string v1, "\u06da\u06e4"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x59

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x394b

    const v18, 0x2ec29f36

    xor-int v5, v5, v18

    const v18, 0x19c17785    # 2.0004006E-23f

    goto/16 :goto_7

    :sswitch_d
    mul-int v9, v8, v8

    mul-int v10, v7, v7

    const v11, 0x7a6100

    .line 6
    sget v1, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v1, :cond_7

    :cond_6
    :goto_4
    const-string v1, "\u05a1\u1a77"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x653b

    const v18, 0x3414aa2c

    xor-int v5, v5, v18

    const v18, -0x70e3cf0d

    goto/16 :goto_7

    :cond_7
    const-string v1, "\u06e8\u05a1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x20b5

    const v18, 0x478100b3

    xor-int v5, v5, v18

    const v18, -0x36269b76

    goto/16 :goto_7

    :cond_8
    const-string v1, "\u0730\u06df"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x37

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x36e9

    const v18, -0x49836374

    xor-int v5, v5, v18

    const v18, -0x34bf4dfa

    goto/16 :goto_7

    :sswitch_e
    const/4 v6, 0x0

    sget v1, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v1, :cond_9

    goto :goto_5

    :cond_9
    const-string v1, "\u0736\u1a75"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x6991

    const v18, 0x4da5cb37    # 3.4769482E8f

    xor-int v5, v5, v18

    const v18, -0x41719443

    goto :goto_7

    :sswitch_f
    sget-object v20, Ll/᩵ۢۨ;->ۘۘܰ:[S

    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v1

    if-eqz v1, :cond_b

    :cond_a
    :goto_5
    const-string v1, "\u06d7\u0733"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x77

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x70dd

    const v18, 0x20f31d59

    xor-int v5, v5, v18

    const v18, 0x3ff2ca97

    goto :goto_7

    :cond_b
    const-string v1, "\u06da\u0733"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x47

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x34c3

    const v18, -0x739ab9af

    xor-int v5, v5, v18

    const v18, -0x23392aef

    goto :goto_7

    .line 40
    :sswitch_10
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v1

    if-eqz v1, :cond_d

    :cond_c
    :goto_6
    const-string v1, "\u06e0\u06d8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x3575

    const v5, -0x603d6d7f

    xor-int/2addr v3, v5

    const v5, -0x37fb3b3a

    xor-int v18, v1, v5

    move v1, v3

    const/4 v3, 0x0

    goto/16 :goto_0

    :cond_d
    const-string v1, "\u1a73\u05a1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x2b

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x6a4f

    const v18, -0x6dc3484

    xor-int v5, v5, v18

    const v18, 0xa2423c3

    :goto_7
    xor-int v18, v1, v18

    move v1, v5

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fef7591 -> :sswitch_e
        -0x7bd17923 -> :sswitch_2
        -0x64242237 -> :sswitch_8
        -0x60d32254 -> :sswitch_b
        -0x5d777ece -> :sswitch_d
        -0x5801749c -> :sswitch_2
        -0x425b4462 -> :sswitch_1
        -0x3b20004c -> :sswitch_10
        -0x3a268ba4 -> :sswitch_9
        -0x2901f43e -> :sswitch_10
        -0x71fd983 -> :sswitch_b
        0x3adbfae -> :sswitch_8
        0x48e5d44 -> :sswitch_3
        0x88defe4 -> :sswitch_5
        0x17e5e56a -> :sswitch_5
        0x18b2d946 -> :sswitch_3
        0x1bcc5a32 -> :sswitch_6
        0x26f45190 -> :sswitch_c
        0x2932a2e4 -> :sswitch_f
        0x347d3f65 -> :sswitch_4
        0x3c81453b -> :sswitch_e
        0x3ca32300 -> :sswitch_a
        0x3f11dc89 -> :sswitch_7
        0x48c16226 -> :sswitch_0
        0x54e46eb4 -> :sswitch_9
        0x5dea655a -> :sswitch_a
        0x5e779e70 -> :sswitch_c
        0x5f399949 -> :sswitch_4
        0x5fa2ca11 -> :sswitch_d
        0x681f7f28 -> :sswitch_0
        0x6e353bf0 -> :sswitch_7
        0x703709ac -> :sswitch_f
        0x7337878d -> :sswitch_6
        0x7aecd4c5 -> :sswitch_1
    .end sparse-switch
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۘ᩻ᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
