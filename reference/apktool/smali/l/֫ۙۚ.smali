.class public Ll/֫ۙۚ;
.super Ljava/lang/Object;
.source "5990"


# instance fields
.field public ۙ:I

.field public ۤ:I

.field public ᩴ:I

.field public ᩷:I

.field public ᩸:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x17

    invoke-static {v0}, Ll/᩹֡֫;->ۗ۟᩸(I)V

    return-void
.end method

.method private ۤ()I
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, 0x76892484

    sget v9, Ll/ۖۖ;->᩵ۜ֨:I

    sget v10, Ll/ۖ;->ܿۚ֡:I

    const-string v11, "\u1a7a\u0733"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x61

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x5de5

    const v13, 0x14c35d49

    xor-int/2addr v12, v13

    const v13, 0x60279e50

    :goto_0
    xor-int/2addr v11, v13

    xor-int/2addr v8, v9

    mul-int/lit16 v8, v8, 0x42d1

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v8, v12

    xor-int/2addr v8, v11

    sparse-switch v8, :sswitch_data_0

    .line 20
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v11

    if-nez v11, :cond_d

    goto/16 :goto_4

    .line 42
    :sswitch_0
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    sget v11, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v11, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v11, "\u06dc\u06da"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x53

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x7ebf

    const v13, 0x45dc0d55

    xor-int/2addr v12, v13

    const v13, -0x357a51c5    # -4380445.5f

    goto :goto_0

    .line 145
    :sswitch_1
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    sget v11, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v11, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v11, "\u1a78\u05a1"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x3085

    const v13, 0x5a4df2e1

    xor-int/2addr v12, v13

    const v13, 0x7ccea532

    goto :goto_0

    .line 165
    :sswitch_2
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v11

    if-eqz v11, :cond_8

    goto/16 :goto_3

    .line 143
    :sswitch_3
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    const/4 v0, 0x0

    return v0

    :sswitch_5
    add-int/lit8 v4, v4, -0x1

    goto/16 :goto_1

    .line 181
    :sswitch_6
    iget-object v11, p0, Ll/֫ۙۚ;->᩸:[I

    aget v11, v11, v4

    if-nez v11, :cond_4

    const-string v11, "\u06ec\u06d6"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x1d

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x3c7b

    const v13, -0x40939f1f

    xor-int/2addr v12, v13

    const v13, -0x56528c14

    goto/16 :goto_0

    :sswitch_7
    add-int/lit8 v5, v5, 0x1

    .line 184
    iput v5, p0, Ll/֫ۙۚ;->᩷:I

    return v7

    :sswitch_8
    add-int v7, v5, v6

    .line 29
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v11

    if-nez v11, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v11, "\u06e8\u1a7b"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v10, v11

    mul-int/lit8 v11, v11, 0x33

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x2d3

    const v13, -0x7210250f

    xor-int/2addr v12, v13

    const v13, 0x7507a5ea

    goto/16 :goto_0

    :sswitch_9
    sub-int v5, v3, v4

    const/4 v6, -0x1

    sget v11, Ll/֫֡;->֫ۙۖ:I

    if-gtz v11, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v11, "\u0736\u0736"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x2b

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x25b7

    const v13, -0x19bbbb67

    xor-int/2addr v12, v13

    const v13, 0x48a4d9fc

    goto/16 :goto_0

    :sswitch_a
    if-ltz v4, :cond_4

    const-string v11, "\u06d8\u1a79"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x66b7

    const v13, 0x62c2bec2

    xor-int/2addr v12, v13

    const v13, -0x33786188    # -7.110342E7f

    goto/16 :goto_0

    :cond_4
    const-string v11, "\u073d\u06d8"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x5f5b

    const v13, -0xdcd3fd9

    xor-int/2addr v12, v13

    const v13, -0x7ef31214

    goto/16 :goto_0

    :sswitch_b
    add-int/lit8 v4, v3, -0x1

    :goto_1
    const-string v11, "\u05a1\u06df"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x27

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x5ca3

    const v13, 0x77dbc462

    xor-int/2addr v12, v13

    const v13, 0x173a333

    goto/16 :goto_0

    .line 180
    :sswitch_c
    iget-object v3, p0, Ll/֫ۙۚ;->᩸:[I

    array-length v3, v3

    .line 100
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    move-result v11

    if-gtz v11, :cond_5

    goto :goto_2

    :cond_5
    const-string v11, "\u1a79\u06dc"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x61

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x3cc5

    const v13, 0xf9cc317

    xor-int/2addr v12, v13

    const v13, -0x616d3483

    goto/16 :goto_0

    :sswitch_d
    return v2

    :sswitch_e
    add-int v2, v0, v1

    const/4 v11, -0x2

    if-ne v2, v11, :cond_6

    const-string v11, "\u0730\u1a79"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0xe2d

    const v13, -0x734ddae6

    xor-int/2addr v12, v13

    const v13, 0x37fd49b3

    goto/16 :goto_0

    :cond_6
    const-string v11, "\u073a\u0736"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v10, v11

    mul-int/lit8 v11, v11, -0x47

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x39ed

    const v13, -0x328b7f80    # -2.5637888E8f

    xor-int/2addr v12, v13

    const v13, 0x62d1461f

    goto/16 :goto_0

    :sswitch_f
    const/4 v1, -0x2

    .line 181
    sget v11, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v11, :cond_7

    goto :goto_3

    :cond_7
    const-string v11, "\u06ec\u073a"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x15

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x56ad

    const v13, -0xa35f0dd

    xor-int/2addr v12, v13

    const v13, -0xbd77a5

    goto/16 :goto_0

    :sswitch_10
    sget v11, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v11, :cond_9

    :cond_8
    :goto_2
    const-string v11, "\u05a8\u1a77"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x3b

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x758f

    const v13, -0x3ce9e105

    xor-int/2addr v12, v13

    const v13, -0x363cadc6    # -1600071.2f

    goto/16 :goto_0

    :cond_9
    const-string v11, "\u06d9\u06e8"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x4281

    const v13, -0x6808de22

    xor-int/2addr v12, v13

    const v13, -0x1541356

    goto/16 :goto_0

    .line 27
    :sswitch_11
    sget v11, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v11, :cond_a

    goto :goto_3

    :cond_a
    const-string v11, "\u06d9\u06df"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x1c4f

    const v13, 0x12a9024d

    xor-int/2addr v12, v13

    const v13, 0x7ab79a05

    goto/16 :goto_0

    .line 79
    :sswitch_12
    sget v11, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v11, :cond_b

    :goto_3
    const-string v11, "\u06eb\u06e0"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x507f

    const v13, -0x59ef2e9b

    xor-int/2addr v12, v13

    const v13, 0x64c3f4a4

    goto/16 :goto_0

    :cond_b
    const-string v11, "\u0736\u1a77"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x3421

    const v13, -0x7da10f84    # -1.6379E-37f

    xor-int/2addr v12, v13

    const v13, -0x1399befb

    goto/16 :goto_0

    .line 114
    :sswitch_13
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v11

    if-eqz v11, :cond_c

    goto :goto_4

    :cond_c
    const-string v11, "\u05a8\u0730"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x6ea3

    const v13, 0x1c503afe

    xor-int/2addr v12, v13

    const v13, -0x7267db0e

    goto/16 :goto_0

    :cond_d
    const-string v11, "\u06d7\u06e0"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x18f

    const v13, -0x763c6d1c

    xor-int/2addr v12, v13

    const v13, -0x5d3c6b4c

    goto/16 :goto_0

    .line 174
    :sswitch_14
    iget v0, p0, Ll/֫ۙۚ;->᩷:I

    sget v11, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v11, :cond_e

    :goto_4
    const-string v11, "\u06df\u06da"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x23b3

    const v13, 0x4f97858f

    xor-int/2addr v12, v13

    const v13, 0x16754ee6

    goto/16 :goto_0

    :cond_e
    const-string v11, "\u1a75\u073d"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0xf

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x5bd9

    const v13, -0x6597e142

    xor-int/2addr v12, v13

    const v13, -0x68d47cb4    # -5.54188E-25f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d0bc68e -> :sswitch_a
        -0x70782a17 -> :sswitch_11
        -0x706c1b21 -> :sswitch_3
        -0x699df4cc -> :sswitch_0
        -0x5933347f -> :sswitch_14
        -0x58624696 -> :sswitch_c
        -0x55be4462 -> :sswitch_5
        -0x46224700 -> :sswitch_c
        -0x3049bdaf -> :sswitch_4
        -0x1b2b4808 -> :sswitch_4
        -0x19407235 -> :sswitch_b
        -0x15f4fb6e -> :sswitch_14
        -0x129164a7 -> :sswitch_13
        -0x10bdc703 -> :sswitch_a
        -0xe7cd498 -> :sswitch_7
        -0xbf64df8 -> :sswitch_3
        -0xb299ee2 -> :sswitch_b
        -0xb277383 -> :sswitch_f
        -0x8ec8494 -> :sswitch_8
        -0x5e1cd13 -> :sswitch_1
        -0x55f20d6 -> :sswitch_10
        -0x325feee -> :sswitch_2
        0xb22d69d -> :sswitch_0
        0xca8a642 -> :sswitch_5
        0x116c0347 -> :sswitch_9
        0x1b620b3a -> :sswitch_d
        0x1df89bea -> :sswitch_12
        0x1e1dd9d9 -> :sswitch_1
        0x28b072ed -> :sswitch_e
        0x31e01b0a -> :sswitch_9
        0x32a347cd -> :sswitch_13
        0x34473063 -> :sswitch_2
        0x36c3b068 -> :sswitch_10
        0x4ae5ae54 -> :sswitch_8
        0x4c90eed0 -> :sswitch_6
        0x52580539 -> :sswitch_12
        0x54f4632b -> :sswitch_d
        0x5758bd23 -> :sswitch_e
        0x6c71250d -> :sswitch_11
        0x6ecb3e15 -> :sswitch_f
        0x71e1a71a -> :sswitch_6
        0x7d05864f -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public ۙ()I
    .locals 26

    move-object/from16 v0, p0

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

    const v20, -0x628f2e4d

    sget v21, Ll/ۖ֨;->֨ۨۧ:I

    sget v22, Ll/ۖܰ;->۟֫ܽ:I

    const-string v23, "\u06e0\u06e8"

    invoke-static/range {v23 .. v23}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v23

    sub-int v23, v22, v23

    mul-int/lit8 v23, v23, -0x45

    xor-int v1, v23, v21

    mul-int/lit16 v1, v1, 0x2f09

    const v25, 0x32fc7559

    xor-int v1, v1, v25

    const v25, 0x5168eb4d

    xor-int v23, v23, v25

    move-object/from16 v25, v4

    const/4 v3, 0x0

    const/16 v16, 0x0

    const/16 v24, 0x0

    :goto_0
    xor-int v4, v20, v21

    mul-int/lit16 v4, v4, 0x3e87

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v1, v4

    xor-int v20, v23, v1

    sparse-switch v20, :sswitch_data_0

    .line 90
    iget-object v1, v0, Ll/֫ۙۚ;->᩸:[I

    aget v1, v1, v3

    if-nez v1, :cond_3

    const-string v1, "\u073a\u06d7"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x15

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, -0x18b9

    const v23, -0x16656f97

    xor-int v4, v4, v23

    const v23, -0x393d20ae

    goto/16 :goto_b

    :sswitch_0
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    sget-boolean v1, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-nez v1, :cond_12

    goto/16 :goto_3

    .line 553
    :sswitch_1
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    sget v1, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v1, :cond_14

    goto :goto_2

    .line 404
    :sswitch_2
    sget v1, Ll/ۖ֨;->֨ۨۧ:I

    if-gez v1, :cond_0

    goto :goto_1

    :cond_0
    const-string v1, "\u073d\u06da"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x77

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, 0x22e9

    const v23, 0x60fdcbb8

    xor-int v4, v4, v23

    const v23, 0x6684282a

    goto/16 :goto_b

    .line 656
    :sswitch_3
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v1

    if-nez v1, :cond_b

    goto :goto_2

    .line 620
    :sswitch_4
    sget v1, Ll/֨ܿ;->᩹᩻۟:I

    if-gez v1, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    const-string v1, "\u1a78\u05ab"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v22, v1

    mul-int/lit8 v1, v1, 0x27

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, 0x1061

    const v23, -0x7ca5ac9c

    xor-int v4, v4, v23

    const v23, 0x7b13a829

    goto/16 :goto_b

    :sswitch_5
    sget v1, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v1, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    const-string v1, "\u06da\u06dc"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v21, v1

    mul-int/lit8 v1, v1, 0x3

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, 0x77dd

    const v23, -0x14b53ec7

    xor-int v4, v4, v23

    const v23, 0x5ec6174a

    goto/16 :goto_b

    .line 896
    :sswitch_6
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    :goto_3
    const-string v1, "\u05a8\u06e7"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, -0x6c9f

    const v23, 0x674e0edc

    xor-int v4, v4, v23

    const v23, 0x7e4fefe

    goto/16 :goto_b

    :sswitch_7
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    const/4 v1, 0x0

    return v1

    :sswitch_8
    add-int/lit8 v3, v3, 0x1

    move/from16 v17, v19

    goto/16 :goto_5

    :sswitch_9
    const/4 v1, 0x1

    const/16 v19, 0x1

    goto :goto_4

    :sswitch_a
    const/4 v1, 0x0

    const/16 v19, 0x0

    :goto_4
    const-string v1, "\u05a1\u06df"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, 0x5b

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, 0x6b9

    const v23, 0x3e20a29e

    xor-int v4, v4, v23

    const v23, 0x4d170a18    # 1.5837632E8f

    goto/16 :goto_b

    :cond_3
    const-string v1, "\u05ab\u05a1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, 0x508f

    const v23, 0x3ef33175

    xor-int v4, v4, v23

    const v23, -0x1ca992af

    goto/16 :goto_b

    :sswitch_b
    add-int/lit8 v1, v14, -0x1

    goto/16 :goto_7

    :sswitch_c
    if-eqz v17, :cond_4

    const-string v1, "\u06d6\u073d"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    mul-int/lit8 v1, v1, -0x15

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, 0x2137

    const v23, 0x5753ff23

    xor-int v4, v4, v23

    const v23, -0x322d4067

    goto/16 :goto_b

    :sswitch_d
    if-eqz v17, :cond_6

    const-string v1, "\u06e1\u1a76"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v22, v1

    mul-int/lit8 v1, v1, 0x55

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, -0x1cb3

    const v23, -0x4dd11eda

    xor-int v4, v4, v23

    const v23, -0x41b1a52f

    goto/16 :goto_b

    :sswitch_e
    if-ge v3, v5, :cond_4

    const-string v1, "\u06eb\u073d"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, -0x6423

    const v23, 0x3564e30d

    xor-int v4, v4, v23

    const v23, 0x21a57086

    goto/16 :goto_b

    :cond_4
    const-string v1, "\u06e2\u06e1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, 0x2ef1

    const v23, 0x647bf9ad

    xor-int v4, v4, v23

    const v23, -0xff020f0

    goto/16 :goto_b

    :sswitch_f
    const/4 v1, 0x1

    move/from16 v17, v18

    const/4 v3, 0x1

    :goto_5
    const-string v1, "\u1a73\u06dc"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, -0xd79

    const v23, 0x6f0c4f47

    xor-int v4, v4, v23

    const v23, -0x1ba36499

    goto/16 :goto_b

    :sswitch_10
    const/4 v1, 0x1

    const/16 v18, 0x1

    goto :goto_6

    :sswitch_11
    const/4 v1, 0x0

    const/16 v18, 0x0

    :goto_6
    const-string v1, "\u073f\u1a73"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, -0x54eb

    const v23, -0x43d8b381

    xor-int v4, v4, v23

    const v23, -0x4d2291a1

    goto/16 :goto_b

    :sswitch_12
    add-int/lit8 v1, v15, 0x1

    .line 97
    iput v1, v0, Ll/֫ۙۚ;->ۙ:I

    return v15

    .line 88
    :sswitch_13
    iget-object v1, v0, Ll/֫ۙۚ;->᩸:[I

    aget v1, v1, v6

    invoke-static {v1}, Ljava/lang/Integer;->bitCount(I)I

    move-result v1

    if-ne v1, v2, :cond_5

    const-string v1, "\u06db\u06da"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x5b

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, 0x2faf

    const v23, -0x4c9263db

    xor-int v4, v4, v23

    const v23, 0x36ab3277

    goto/16 :goto_b

    :cond_5
    const-string v1, "\u06da\u073a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v22, v1

    mul-int/lit8 v1, v1, 0x63

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, -0x7e81

    const v23, 0x7e3a40f9

    xor-int v4, v4, v23

    const v23, 0x54ea4099

    goto/16 :goto_b

    :sswitch_14
    add-int v14, v13, v9

    .line 86
    iget v1, v0, Ll/֫ۙۚ;->ᩴ:I

    if-gez v1, :cond_6

    const-string v1, "\u1a7a\u073d"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, 0x39c7

    const v23, -0x735bb82f

    xor-int v4, v4, v23

    const v23, -0x58c338d2

    goto/16 :goto_b

    :cond_6
    move v1, v14

    :goto_7
    move v15, v1

    goto/16 :goto_9

    :sswitch_15
    sub-int v13, v12, v11

    .line 145
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v1

    if-nez v1, :cond_7

    goto/16 :goto_8

    :cond_7
    const-string v1, "\u1a7b\u073a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, 0x4685

    const v23, 0x76e7812b

    xor-int v4, v4, v23

    const v23, -0x3b8739cd

    goto/16 :goto_b

    .line 1134
    :sswitch_16
    invoke-static {v10}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v11

    const/16 v12, 0x20

    .line 691
    sget v1, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v1, :cond_8

    goto :goto_8

    :cond_8
    const-string v1, "\u05ab\u06eb"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, 0x603f

    const v23, 0x25753565

    xor-int v4, v4, v23

    const v23, 0x7a1b95a

    goto/16 :goto_b

    :sswitch_17
    shl-int v9, v7, v8

    .line 85
    aget v10, v25, v6

    .line 394
    sget v1, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v1, :cond_9

    goto/16 :goto_a

    :cond_9
    const-string v1, "\u06d6\u06e8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, 0x53

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, -0x1d41

    const v23, 0x6d858f68

    xor-int v4, v4, v23

    const v23, -0x48d0b93c

    goto/16 :goto_b

    :sswitch_18
    const/4 v8, 0x5

    .line 32
    sget v1, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v1, :cond_a

    goto/16 :goto_a

    :cond_a
    const-string v1, "\u1a7a\u1a78"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v21, v1

    mul-int/lit8 v1, v1, 0x53

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, 0x1deb

    const v23, -0x4722c7a5

    xor-int v4, v4, v23

    const v23, -0x778a5ac0

    goto/16 :goto_b

    :sswitch_19
    add-int/lit8 v7, v5, -0x1

    sget v1, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v1, :cond_c

    :cond_b
    :goto_8
    const-string v1, "\u05ab\u073d"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x37

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, -0x5e79

    const v23, -0x5b9ef52

    xor-int v4, v4, v23

    const v23, -0x14d92612

    goto/16 :goto_b

    :cond_c
    const-string v1, "\u073d\u06db"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, 0x7b25

    const v23, -0x6d7cd44f

    xor-int v4, v4, v23

    const v23, 0x3b2aac3c

    goto/16 :goto_b

    .line 80
    :sswitch_1a
    iget-object v1, v0, Ll/֫ۙۚ;->᩸:[I

    array-length v5, v1

    if-nez v5, :cond_d

    move-object/from16 v25, v1

    const/4 v6, 0x0

    const/4 v15, 0x0

    :goto_9
    const-string v1, "\u06d7\u0730"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x43

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, 0x4a4f

    const v23, -0x38d32b74

    xor-int v4, v4, v23

    const v23, 0x7e9d6906

    goto/16 :goto_b

    :cond_d
    const-string v4, "\u06d7\u1a73"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int v4, v4, v22

    mul-int/lit8 v4, v4, -0x1b

    xor-int v6, v4, v21

    mul-int/lit16 v6, v6, 0x66d

    const v25, 0x3fc91933

    xor-int v6, v6, v25

    const v25, 0x601b20d5

    xor-int v4, v4, v25

    move-object/from16 v25, v1

    move/from16 v23, v4

    move v1, v6

    const/4 v6, 0x0

    goto/16 :goto_0

    :sswitch_1b
    return v16

    :sswitch_1c
    sub-int v1, v24, v2

    const/4 v4, -0x1

    if-ne v1, v4, :cond_e

    const-string v4, "\u1a75\u1a76"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int v4, v4, v21

    mul-int/lit8 v4, v4, -0x4d

    move/from16 v16, v1

    xor-int v1, v4, v22

    mul-int/lit16 v1, v1, 0x3c65

    const v23, -0x148b5307

    xor-int v1, v1, v23

    const v23, 0x775ec5fc

    xor-int v23, v4, v23

    goto/16 :goto_0

    :cond_e
    move/from16 v16, v1

    const-string v1, "\u06dc\u1a73"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, -0x3539

    const v23, 0x189dd20d

    xor-int v4, v4, v23

    const v23, 0x754bac77

    goto/16 :goto_b

    :sswitch_1d
    const/4 v2, 0x1

    .line 66
    sget v1, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v1, :cond_f

    goto :goto_a

    :cond_f
    const-string v1, "\u06ec\u073f"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x19

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, 0x5d11

    const v23, -0x66742974

    xor-int v4, v4, v23

    const v23, -0x546cb503

    goto/16 :goto_b

    .line 471
    :sswitch_1e
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v1

    if-nez v1, :cond_10

    goto/16 :goto_c

    :cond_10
    const-string v1, "\u0730\u06d9"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v21, v1

    mul-int/lit8 v1, v1, 0x29

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, -0x1f2f

    const v23, -0x39de06fe

    xor-int v4, v4, v23

    const v23, 0x3ec433f3

    goto :goto_b

    .line 810
    :sswitch_1f
    sget-boolean v1, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v1, :cond_11

    :goto_a
    const-string v1, "\u1a7b\u05a1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v4, v1, v22

    mul-int/lit16 v4, v4, -0x6809

    const v23, -0x7bf30d8b

    xor-int v4, v4, v23

    const v23, 0x710626a8

    goto :goto_b

    :cond_11
    const-string v1, "\u06dc\u06da"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, -0x25

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, 0x2765

    const v23, 0x62ae7a6f

    xor-int v4, v4, v23

    const v23, 0x773d0993

    goto :goto_b

    :sswitch_20
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v1

    if-nez v1, :cond_13

    :cond_12
    const-string v1, "\u0730\u073f"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, 0x5dc3

    const v23, 0x69b71854

    xor-int v4, v4, v23

    const v23, 0x23d667be

    goto :goto_b

    :cond_13
    const-string v1, "\u1a7a\u05a1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, 0xdf3

    const v23, 0x779fa36c

    xor-int v4, v4, v23

    const v23, -0x31f7aa80

    :goto_b
    xor-int v23, v1, v23

    move v1, v4

    goto/16 :goto_0

    .line 78
    :sswitch_21
    iget v1, v0, Ll/֫ۙۚ;->ۙ:I

    .line 16
    sget v4, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v4, :cond_15

    move/from16 v24, v1

    :cond_14
    :goto_c
    const-string v1, "\u06db\u06e8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v4, v1, v21

    mul-int/lit16 v4, v4, 0x4445

    const v23, -0x6526a113

    xor-int v4, v4, v23

    const v23, 0x3505cfd0

    goto :goto_b

    :cond_15
    const-string v4, "\u06d8\u1a7a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v21, v4

    mul-int/lit8 v4, v4, -0x5d

    xor-int v0, v4, v22

    mul-int/lit16 v0, v0, -0x6799

    const v23, 0x538e5fc9

    xor-int v0, v0, v23

    const v23, -0x6b99fb00

    xor-int v23, v4, v23

    move/from16 v24, v1

    move v1, v0

    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fe68ea7 -> :sswitch_14
        -0x7e3ffa9b -> :sswitch_17
        -0x7a117f9f -> :sswitch_e
        -0x799a77a5 -> :sswitch_1f
        -0x7974c4c5 -> :sswitch_7
        -0x78c6ca1f -> :sswitch_1e
        -0x74728edb -> :sswitch_21
        -0x73eae270 -> :sswitch_14
        -0x73a8d091 -> :sswitch_13
        -0x71b62733 -> :sswitch_1c
        -0x6b13ff85 -> :sswitch_c
        -0x6af58c31 -> :sswitch_1b
        -0x61b486b5 -> :sswitch_16
        -0x5bb16b7b -> :sswitch_20
        -0x5ac975cf -> :sswitch_1a
        -0x58c8e889 -> :sswitch_0
        -0x53ceb9ee -> :sswitch_e
        -0x4e3b205a -> :sswitch_b
        -0x4d32ff7e -> :sswitch_b
        -0x3fdfa029 -> :sswitch_8
        -0x3cd8e3af -> :sswitch_1f
        -0x35d645bc -> :sswitch_2
        -0x34ecad32 -> :sswitch_16
        -0x2e6cfb5d -> :sswitch_15
        -0x29478086 -> :sswitch_4
        -0x24d47cb9 -> :sswitch_11
        -0x23aa78f1 -> :sswitch_6
        -0x22b77c73 -> :sswitch_1d
        -0x1952d5ce -> :sswitch_1a
        -0x1828271f -> :sswitch_d
        -0x171266ad -> :sswitch_19
        -0x103f99ad -> :sswitch_4
        -0xf1a3ef3 -> :sswitch_1e
        -0xd442dda -> :sswitch_8
        -0x8d51470 -> :sswitch_3
        -0x8685993 -> :sswitch_c
        -0x6aca67f -> :sswitch_17
        -0x54c8d09 -> :sswitch_f
        -0x2c79758 -> :sswitch_18
        0x121c2c67 -> :sswitch_1
        0x12b3311f -> :sswitch_10
        0x237eb55e -> :sswitch_3
        0x263d0876 -> :sswitch_d
        0x2b3e3331 -> :sswitch_21
        0x2f0ecf4d -> :sswitch_f
        0x3392a3a3 -> :sswitch_20
        0x3564d35e -> :sswitch_a
        0x388a16c3 -> :sswitch_6
        0x3c2f48cd -> :sswitch_19
        0x3d25a4dc -> :sswitch_1b
        0x416b8fb1 -> :sswitch_1c
        0x4f8aaf7d -> :sswitch_7
        0x51640e8e -> :sswitch_12
        0x530f0c37 -> :sswitch_9
        0x54efa486 -> :sswitch_9
        0x5664ee4d -> :sswitch_11
        0x5897f5d6 -> :sswitch_10
        0x5a09e8d6 -> :sswitch_a
        0x5cb2db87 -> :sswitch_0
        0x648de254 -> :sswitch_5
        0x6bb8660d -> :sswitch_1
        0x6e72273d -> :sswitch_15
        0x710df074 -> :sswitch_13
        0x71d1e026 -> :sswitch_12
        0x731b3ac3 -> :sswitch_1d
        0x7344acbe -> :sswitch_18
        0x7374c7f6 -> :sswitch_5
        0x7d6bf301 -> :sswitch_2
    .end sparse-switch
.end method

.method public final ۙ(I)I
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, -0x5768087b

    sget v6, Ll/֡ܳ;->֨ᩳۢ:I

    sget v7, Ll/ۗ᩸;->ۧ۫ᩴ:I

    const-string v8, "\u1a77\u06e7"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x1b

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x7f15

    const v10, -0x49a04282

    xor-int/2addr v9, v10

    const v10, -0x3482e120    # -1.6588512E7f

    :goto_0
    xor-int/2addr v8, v10

    xor-int/2addr v5, v6

    mul-int/lit16 v5, v5, -0x1479

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    const/4 v3, -0x1

    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v8

    if-eqz v8, :cond_3

    goto/16 :goto_1

    :sswitch_0
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v8

    if-eqz v8, :cond_10

    goto/16 :goto_2

    .line 5
    :sswitch_1
    sget v8, Ll/ۗ֨;->᩹ۜۡ:I

    if-gez v8, :cond_9

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    sget v8, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v8, :cond_e

    goto/16 :goto_2

    .line 17
    :sswitch_3
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    const/4 p1, 0x0

    return p1

    :sswitch_5
    neg-int p1, v4

    return p1

    :sswitch_6
    not-int p1, v4

    return p1

    :sswitch_7
    const/4 p1, -0x1

    return p1

    :sswitch_8
    return v0

    :sswitch_9
    return v4

    .line 153
    :sswitch_a
    invoke-direct {p0}, Ll/֫ۙۚ;->ۤ()I

    move-result v8

    if-gt p1, v8, :cond_0

    const-string v8, "\u05ab\u06e7"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x1ff9

    const v10, -0x1162e7ee

    xor-int/2addr v9, v10

    const v10, 0x7942694f

    goto :goto_0

    :cond_0
    const-string v8, "\u06e2\u073a"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x6f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x266f

    const v10, 0x64cfc350

    xor-int/2addr v9, v10

    const v10, -0x54ead561

    goto :goto_0

    .line 135
    :sswitch_b
    iget v8, p0, Ll/֫ۙۚ;->ᩴ:I

    if-gez v8, :cond_1

    const-string v8, "\u1a77\u05a8"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x3b

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x38a3

    const v10, 0x6b977e37

    xor-int/2addr v9, v10

    const v10, -0x755d81c8

    goto/16 :goto_0

    :cond_1
    const-string v8, "\u06e0\u1a74"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x5dd

    const v10, 0x75f700c7

    xor-int/2addr v9, v10

    const v10, 0x4850460e

    goto/16 :goto_0

    :sswitch_c
    add-int v4, v2, v3

    .line 150
    aget v4, v1, v4

    .line 152
    iget v8, p0, Ll/֫ۙۚ;->ᩴ:I

    if-ltz v8, :cond_2

    const-string v8, "\u06dc\u1a74"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x7f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x18f5

    const v10, 0x3944792c

    xor-int/2addr v9, v10

    const v10, -0x6cc4c6fb

    goto/16 :goto_0

    :cond_2
    const-string v8, "\u06dc\u1a77"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x5f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0xf05

    const v10, -0x75c82477

    xor-int/2addr v9, v10

    const v10, 0x344d6aba

    goto/16 :goto_0

    :cond_3
    const-string v8, "\u06d7\u06e1"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x19

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x1f5d

    const v10, 0x2897f995

    xor-int/2addr v9, v10

    const v10, 0x36795e2a

    goto/16 :goto_0

    .line 150
    :sswitch_d
    array-length v2, v1

    sub-int/2addr v2, p1

    sget-boolean v8, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v8, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v8, "\u06e2\u06e7"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x63

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x6953

    const v10, -0x6d69ae9

    xor-int/2addr v9, v10

    const v10, -0xe5b5ece

    goto/16 :goto_0

    :sswitch_e
    return v0

    .line 147
    :sswitch_f
    iget-object v1, p0, Ll/֫ۙۚ;->᩸:[I

    array-length v8, v1

    if-lt p1, v8, :cond_5

    const-string v8, "\u0736\u073a"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x1f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x4b0b

    const v10, 0x17ad3282

    xor-int/2addr v9, v10

    const v10, 0x1deff865

    goto/16 :goto_0

    :cond_5
    const-string v8, "\u06d8\u06df"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x17c7

    const v10, -0x32deffd9    # -1.6882136E8f

    xor-int/2addr v9, v10

    const v10, -0x3fed7b27

    goto/16 :goto_0

    :sswitch_10
    const/4 v0, 0x0

    if-gez p1, :cond_6

    const-string v8, "\u05a1\u06da"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x51

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x4109

    const v10, -0x6e92c1c4

    xor-int/2addr v9, v10

    const v10, -0x6e3f7189

    goto/16 :goto_0

    :cond_6
    const-string v8, "\u06db\u1a78"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x6b

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x47fd

    const v10, -0x6ffb32bb

    xor-int/2addr v9, v10

    const v10, -0x32926dcb

    goto/16 :goto_0

    :sswitch_11
    sget v8, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v8, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v8, "\u073a\u06df"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x17

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x4323

    const v10, -0x20bc1620

    xor-int/2addr v9, v10

    const v10, 0x7f463ec2    # 2.63513E38f

    goto/16 :goto_0

    .line 130
    :sswitch_12
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v8

    if-nez v8, :cond_8

    goto/16 :goto_3

    :cond_8
    const-string v8, "\u073a\u0736"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x2bdf

    const v10, -0x306c92d7

    xor-int/2addr v9, v10

    const v10, 0x6a93d2f9

    goto/16 :goto_0

    .line 47
    :sswitch_13
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v8

    if-eqz v8, :cond_a

    :cond_9
    const-string v8, "\u06e0\u0730"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x51

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x8b7

    const v10, 0x6949973c

    xor-int/2addr v9, v10

    const v10, 0x3799c3dc

    goto/16 :goto_0

    :cond_a
    const-string v8, "\u06e7\u06ec"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x3b

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x4083

    const v10, -0x5e305a9d

    xor-int/2addr v9, v10

    const v10, 0x64850811

    goto/16 :goto_0

    .line 65
    :sswitch_14
    sget v8, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v8, :cond_b

    :goto_1
    const-string v8, "\u1a76\u0733"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x39

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x5aab

    const v10, 0x60a623f4

    xor-int/2addr v9, v10

    const v10, -0x61c9c3e6

    goto/16 :goto_0

    :cond_b
    const-string v8, "\u1a75\u073d"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x43

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x3601

    const v10, 0x444cbb55

    xor-int/2addr v9, v10

    const v10, 0xccae1f8

    goto/16 :goto_0

    :sswitch_15
    sget v8, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v8, :cond_c

    :goto_2
    const-string v8, "\u06df\u073f"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x5a97

    const v10, 0x15de866

    xor-int/2addr v9, v10

    const v10, -0x36dcc3b8    # -668612.5f

    goto/16 :goto_0

    :cond_c
    const-string v8, "\u0733\u1a7a"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x2797

    const v10, -0x293d9e2f

    xor-int/2addr v9, v10

    const v10, -0x42a21ef8

    goto/16 :goto_0

    :sswitch_16
    sget v8, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v8, :cond_d

    goto :goto_3

    :cond_d
    const-string v8, "\u06dc\u1a7a"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x1f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x5d09

    const v10, -0x66b8db9

    xor-int/2addr v9, v10

    const v10, 0x21550baa

    goto/16 :goto_0

    :sswitch_17
    sget-boolean v8, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v8, :cond_f

    :cond_e
    :goto_3
    const-string v8, "\u073f\u06da"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x2969

    const v10, -0x1cd1f91d

    xor-int/2addr v9, v10

    const v10, 0x3200fc8f

    goto/16 :goto_0

    :cond_f
    const-string v8, "\u06e4\u06e0"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x5035

    const v10, -0x54de6bb9

    xor-int/2addr v9, v10

    const v10, 0x5fa70f85

    goto/16 :goto_0

    :sswitch_18
    sget v8, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v8, :cond_11

    :cond_10
    const-string v8, "\u073f\u06d9"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x2bad

    const v10, 0x6a0c7305

    xor-int/2addr v9, v10

    const v10, 0x2b8c833d

    goto/16 :goto_0

    :cond_11
    const-string v8, "\u1a7b\u06d9"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x11

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x7167

    const v10, -0x36dec24b

    xor-int/2addr v9, v10

    const v10, -0x67ba2bb9

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c51a631 -> :sswitch_14
        -0x7af19f00 -> :sswitch_e
        -0x7594d1fa -> :sswitch_4
        -0x68d0971f -> :sswitch_a
        -0x685adce3 -> :sswitch_7
        -0x655ad09b -> :sswitch_5
        -0x651fa433 -> :sswitch_13
        -0x5d17c7ac -> :sswitch_0
        -0x5d080a9c -> :sswitch_2
        -0x533202da -> :sswitch_18
        -0x4e4362ff -> :sswitch_8
        -0x4a4a747b -> :sswitch_17
        -0x40d44050 -> :sswitch_11
        -0x3ae89f36 -> :sswitch_3
        -0x34d29e3f -> :sswitch_b
        -0x3293d8cb -> :sswitch_9
        -0x2fb4c688 -> :sswitch_13
        -0x2b66a244 -> :sswitch_f
        -0x28de786a -> :sswitch_10
        -0x2453dd97 -> :sswitch_14
        -0x195fba4a -> :sswitch_12
        -0x82f5e98 -> :sswitch_4
        -0x699417e -> :sswitch_f
        -0x682707a -> :sswitch_17
        -0x11ee142 -> :sswitch_d
        0x87e64dc -> :sswitch_15
        0xbce0d33 -> :sswitch_7
        0x1216e989 -> :sswitch_9
        0x13b36e50 -> :sswitch_c
        0x157f2527 -> :sswitch_1
        0x1aabab5f -> :sswitch_c
        0x201dba25 -> :sswitch_e
        0x25715cec -> :sswitch_3
        0x2bdedf68 -> :sswitch_12
        0x35608820 -> :sswitch_d
        0x47880bd9 -> :sswitch_a
        0x47b19eb3 -> :sswitch_5
        0x4825ef2f -> :sswitch_b
        0x48d694e1 -> :sswitch_16
        0x514275a1 -> :sswitch_15
        0x52f10930 -> :sswitch_2
        0x546074a5 -> :sswitch_11
        0x5f21ee82 -> :sswitch_8
        0x60309d8a -> :sswitch_16
        0x62b88c6f -> :sswitch_0
        0x64041f79 -> :sswitch_10
        0x68823870 -> :sswitch_18
        0x764e3278 -> :sswitch_1
        0x7d54f81f -> :sswitch_6
        0x7efa656f -> :sswitch_6
    .end sparse-switch
.end method

.method public native ۙ(Ll/֫ۙۚ;)Z
.end method

.method public ᩷()I
    .locals 13

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, -0x206a056f

    sget v8, Ll/֡۟;->᩶᩺ܰ:I

    sget v9, Ll/֨᩻;->ۛ֫ܶ:I

    const-string v10, "\u05ab\u06d9"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x27

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x533

    const v12, 0x1921c016

    xor-int/2addr v11, v12

    const v12, -0x65c52c2e

    :goto_0
    xor-int/2addr v10, v12

    xor-int/2addr v7, v9

    mul-int/lit16 v7, v7, -0x66f5

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    const/4 v1, -0x2

    sget v10, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v10, :cond_6

    goto/16 :goto_6

    :sswitch_0
    sget v10, Ll/ۗ᩵;->ᩳܶۤ:I

    if-lez v10, :cond_0

    goto :goto_1

    :cond_0
    const-string v10, "\u1a74\u1a78"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x50b1

    const v12, -0xd8483e3    # -4.98117E30f

    xor-int/2addr v11, v12

    const v12, 0x169c891b

    goto :goto_0

    .line 54
    :sswitch_1
    sget v10, Ll/ۗ᩵;->ᩳܶۤ:I

    if-lez v10, :cond_9

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    sget v10, Ll/ۗܰ;->ܶۜ۬:I

    if-gez v10, :cond_1

    goto/16 :goto_7

    :cond_1
    :goto_1
    const-string v10, "\u05ab\u05ab"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x51

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x1011

    const v12, -0x32e630f8

    xor-int/2addr v11, v12

    const v12, -0x5519bf58

    goto :goto_0

    .line 14
    :sswitch_3
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    goto/16 :goto_7

    .line 77
    :sswitch_4
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    const/4 v0, 0x0

    return v0

    :sswitch_5
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_3

    .line 121
    :sswitch_6
    invoke-static {v4}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    move-result v5

    add-int/2addr v5, v6

    goto :goto_2

    :sswitch_7
    shl-int/lit8 v6, v3, 0x5

    .line 50
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v10

    if-gtz v10, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v10, "\u06dc\u1a7a"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x7ddd

    const v12, -0x29ff9b08

    xor-int/2addr v11, v12

    const v12, 0x81d6a2c

    goto :goto_0

    :sswitch_8
    add-int/lit8 v2, v5, 0x2

    .line 123
    iput v2, p0, Ll/֫ۙۚ;->ۤ:I

    move v2, v5

    goto/16 :goto_4

    .line 119
    :sswitch_9
    invoke-virtual {p0, v3}, Ll/֫ۙۚ;->ۙ(I)I

    move-result v4

    if-nez v4, :cond_3

    const-string v10, "\u06e1\u05a1"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x25

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x7717

    const v12, 0x266b487f

    xor-int/2addr v11, v12

    const v12, 0x77517bae

    goto/16 :goto_0

    :cond_3
    const-string v10, "\u05a1\u06d8"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x64c5

    const v12, -0x76fa71e0

    xor-int/2addr v11, v12

    const v12, -0xfeffcd5

    goto/16 :goto_0

    :sswitch_a
    const/4 v5, -0x1

    :goto_2
    const-string v10, "\u1a73\u05a1"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, -0x1f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x65d1

    const v12, -0x226c3828

    xor-int/2addr v11, v12

    const v12, -0x36cd2376

    goto/16 :goto_0

    :sswitch_b
    const/4 v3, 0x0

    :goto_3
    const-string v10, "\u06e0\u1a75"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x17

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x6955

    const v12, -0x1f4a417c

    xor-int/2addr v11, v12

    const v12, -0x65bb4bc8

    goto/16 :goto_0

    .line 114
    :sswitch_c
    iget v10, p0, Ll/֫ۙۚ;->ᩴ:I

    if-nez v10, :cond_4

    const-string v10, "\u06e8\u06eb"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x4405

    const v12, -0x4cada896

    xor-int/2addr v11, v12

    const v12, 0x6847e6a2

    goto/16 :goto_0

    :cond_4
    const-string v10, "\u06ec\u06d8"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x205f

    const v12, 0x3efff619    # 0.49992445f

    xor-int/2addr v11, v12

    const v12, -0x559fd58f

    goto/16 :goto_0

    :sswitch_d
    return v2

    :sswitch_e
    add-int v10, v0, v1

    const/4 v11, -0x2

    if-ne v10, v11, :cond_5

    const-string v10, "\u1a75\u1a75"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x5f25

    const v12, -0x30be6ed5

    xor-int/2addr v11, v12

    const v12, 0x27190f56

    goto/16 :goto_0

    :cond_5
    move v2, v10

    :goto_4
    const-string v10, "\u1a75\u1a79"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, -0x41

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x2bf5

    const v12, -0x240b5fab

    xor-int/2addr v11, v12

    const v12, 0x2f8a3402

    goto/16 :goto_0

    :cond_6
    const-string v10, "\u0730\u06df"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x9

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x31af

    const v12, -0x7c0d42b5

    xor-int/2addr v11, v12

    const v12, -0x504cbf1

    goto/16 :goto_0

    .line 94
    :sswitch_f
    sget-boolean v10, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v10, :cond_7

    goto/16 :goto_7

    :cond_7
    const-string v10, "\u06e7\u0733"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x13

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x614d

    const v12, 0x179e3653

    xor-int/2addr v11, v12

    const v12, 0x2a0d22dd

    goto/16 :goto_0

    .line 41
    :sswitch_10
    sget-boolean v10, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v10, :cond_8

    goto/16 :goto_6

    :cond_8
    const-string v10, "\u1a78\u06d9"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x7d63

    const v12, -0x5890fa84

    xor-int/2addr v11, v12

    const v12, -0x7d7bb9d0

    goto/16 :goto_0

    :sswitch_11
    sget-boolean v10, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v10, :cond_a

    :cond_9
    :goto_5
    const-string v10, "\u073d\u06e2"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x61ef

    const v12, -0x43b3d663

    xor-int/2addr v11, v12

    const v12, 0x19c0a7dc

    goto/16 :goto_0

    :cond_a
    const-string v10, "\u1a76\u1a73"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x6f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x575d

    const v12, -0x45d9f52c

    xor-int/2addr v11, v12

    const v12, -0x671bea83

    goto/16 :goto_0

    .line 71
    :sswitch_12
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v10

    if-eqz v10, :cond_b

    goto/16 :goto_7

    :cond_b
    const-string v10, "\u05ab\u1a75"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x4f45

    const v12, -0x7bbd4352

    xor-int/2addr v11, v12

    const v12, -0xe3cecc4

    goto/16 :goto_0

    .line 78
    :sswitch_13
    sget v10, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v10, :cond_c

    goto :goto_7

    :cond_c
    const-string v10, "\u1a75\u06dc"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x31

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x740f

    const v12, -0x461a4798

    xor-int/2addr v11, v12

    const v12, -0x78249adc

    goto/16 :goto_0

    .line 42
    :sswitch_14
    sget v10, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v10, :cond_d

    goto :goto_7

    :cond_d
    const-string v10, "\u06eb\u06dc"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x7f19

    const v12, 0x587a12ca

    xor-int/2addr v11, v12

    const v12, 0x16355a9f

    goto/16 :goto_0

    .line 31
    :sswitch_15
    sget v10, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v10, :cond_e

    :goto_6
    const-string v10, "\u1a77\u06e4"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, -0x77

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x4fb7

    const v12, -0x1a2f16cd

    xor-int/2addr v11, v12

    const v12, -0x38586a68

    goto/16 :goto_0

    :cond_e
    const-string v10, "\u1a7a\u06e2"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x254d

    const v12, -0x4ab4f8b7

    xor-int/2addr v11, v12

    const v12, 0x486f833c

    goto/16 :goto_0

    .line 111
    :sswitch_16
    iget v0, p0, Ll/֫ۙۚ;->ۤ:I

    .line 46
    sget v10, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v10, :cond_f

    :goto_7
    const-string v10, "\u06d7\u05ab"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x1a77

    const v12, 0xf1f5c5f

    xor-int/2addr v11, v12

    const v12, -0x57416b65

    goto/16 :goto_0

    :cond_f
    const-string v10, "\u06da\u06df"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x45

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x82d

    const v12, 0x29e3ef4c

    xor-int/2addr v11, v12

    const v12, 0x50ff79e5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ad990fe -> :sswitch_b
        -0x78072ad0 -> :sswitch_4
        -0x73c04b44 -> :sswitch_12
        -0x6da88377 -> :sswitch_15
        -0x5d163552 -> :sswitch_2
        -0x53ffe8d2 -> :sswitch_7
        -0x48c65462 -> :sswitch_a
        -0x36b4e80f -> :sswitch_13
        -0x361ea860 -> :sswitch_1
        -0x2b6b9771 -> :sswitch_6
        -0x289ceaf3 -> :sswitch_6
        -0x25f3e9e6 -> :sswitch_0
        -0x217abef7 -> :sswitch_11
        -0x20a9d19d -> :sswitch_7
        -0x1f921bef -> :sswitch_9
        -0x1da347e7 -> :sswitch_3
        -0x19ea9f17 -> :sswitch_11
        -0x11a3f25e -> :sswitch_5
        -0x79b2e37 -> :sswitch_c
        0x220002a -> :sswitch_14
        0x396290c -> :sswitch_15
        0x18aa055b -> :sswitch_4
        0x245190d5 -> :sswitch_e
        0x275b461c -> :sswitch_10
        0x322d76a5 -> :sswitch_a
        0x347d6731 -> :sswitch_f
        0x358a0073 -> :sswitch_16
        0x365ee232 -> :sswitch_13
        0x3686d886 -> :sswitch_2
        0x39225c1b -> :sswitch_8
        0x428fc8f0 -> :sswitch_d
        0x532730ec -> :sswitch_0
        0x53785831 -> :sswitch_e
        0x5660713b -> :sswitch_16
        0x57b475d1 -> :sswitch_8
        0x5af96fa2 -> :sswitch_9
        0x5b6ac321 -> :sswitch_1
        0x5d892a8b -> :sswitch_5
        0x5df9ed6e -> :sswitch_f
        0x672a208b -> :sswitch_14
        0x6e3e63a7 -> :sswitch_d
        0x6f13881d -> :sswitch_12
        0x71abba39 -> :sswitch_10
        0x7be6c1d7 -> :sswitch_b
        0x7d77c363 -> :sswitch_3
        0x7f600f62 -> :sswitch_c
    .end sparse-switch
.end method

.method public ᩷(I)I
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, 0x68af12e8

    sget v6, Ll/ۗ֨;->᩹ۜۡ:I

    sget v7, Ll/ۘܽ;->᩹ۧۚ:I

    const-string v8, "\u06e1\u06db"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x927

    const v10, 0x7a9b1fa6

    xor-int/2addr v9, v10

    const v10, 0x63bce519

    :goto_0
    xor-int/2addr v8, v10

    xor-int/2addr v5, v7

    mul-int/lit16 v5, v5, 0x7aa3

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    .line 22
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    sget-boolean v8, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v8, :cond_e

    goto/16 :goto_2

    .line 99
    :sswitch_0
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v8

    if-nez v8, :cond_b

    goto :goto_1

    :sswitch_1
    sget v8, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v8, :cond_8

    goto :goto_1

    .line 131
    :sswitch_2
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    :goto_1
    const-string v8, "\u05a1\u06e4"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x577f

    const v10, 0x66d9c0aa

    xor-int/2addr v9, v10

    const v10, 0x7f29ee3b

    goto :goto_0

    .line 13
    :sswitch_3
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    const/4 p1, 0x0

    return p1

    :sswitch_4
    neg-int p1, v4

    return p1

    :sswitch_5
    not-int p1, v4

    return p1

    :sswitch_6
    const/4 p1, -0x1

    return p1

    :sswitch_7
    return v0

    :sswitch_8
    return v4

    .line 165
    :sswitch_9
    invoke-direct {p0}, Ll/֫ۙۚ;->ۤ()I

    move-result v8

    if-gt p1, v8, :cond_0

    const-string v8, "\u0730\u06ec"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x25

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x5f61

    const v10, -0xbbe82fc

    xor-int/2addr v9, v10

    const v10, -0x44991bd8

    goto :goto_0

    :cond_0
    const-string v8, "\u05a1\u06d8"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x2327

    const v10, -0x256a1d41

    xor-int/2addr v9, v10

    const v10, 0x525697b

    goto :goto_0

    .line 135
    :sswitch_a
    iget v8, p0, Ll/֫ۙۚ;->ᩴ:I

    if-gez v8, :cond_1

    const-string v8, "\u06e1\u0736"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x4d

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x36f3

    const v10, -0x343d19e2    # -2.5545788E7f

    xor-int/2addr v9, v10

    const v10, 0x345fcb98

    goto/16 :goto_0

    :cond_1
    const-string v8, "\u1a76\u06d8"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x76d7

    const v10, 0x5683c182

    xor-int/2addr v9, v10

    const v10, 0x6068d020

    goto/16 :goto_0

    :sswitch_b
    add-int v4, v2, v3

    .line 162
    aget v4, v1, v4

    .line 164
    iget v8, p0, Ll/֫ۙۚ;->ᩴ:I

    if-ltz v8, :cond_2

    const-string v8, "\u06df\u1a78"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x49

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x57bf

    const v10, -0x566d984a

    xor-int/2addr v9, v10

    const v10, 0x24c1f6f4

    goto/16 :goto_0

    :cond_2
    const-string v8, "\u1a73\u0736"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x23

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x6c4b

    const v10, -0x13b6f2d6

    xor-int/2addr v9, v10

    const v10, 0x41c4281

    goto/16 :goto_0

    :sswitch_c
    const/4 v3, -0x1

    .line 148
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result v8

    if-eqz v8, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v8, "\u073f\u1a7a"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x11

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x99f

    const v10, 0x51f5591a

    xor-int/2addr v9, v10

    const v10, 0x360f18ac

    goto/16 :goto_0

    .line 162
    :sswitch_d
    array-length v2, v1

    sub-int/2addr v2, p1

    .line 101
    sget v8, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v8, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v8, "\u06e4\u06e0"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x45

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x3d95

    const v10, 0x359583b8

    xor-int/2addr v9, v10

    const v10, 0xc43df35

    goto/16 :goto_0

    :sswitch_e
    return v0

    .line 159
    :sswitch_f
    iget-object v1, p0, Ll/֫ۙۚ;->᩸:[I

    array-length v8, v1

    if-lt p1, v8, :cond_5

    const-string v8, "\u06d7\u073a"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x2aa7

    const v10, 0x50f6cf61

    xor-int/2addr v9, v10

    const v10, -0x7ec68075

    goto/16 :goto_0

    :cond_5
    const-string v8, "\u06d8\u073f"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x5531

    const v10, -0x1c0ab0bc

    xor-int/2addr v9, v10

    const v10, -0x4d4c5dfe

    goto/16 :goto_0

    :sswitch_10
    const/4 v0, 0x0

    if-gez p1, :cond_6

    const-string v8, "\u05ab\u073a"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x6f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0xb3b

    const v10, 0x141c27b8

    xor-int/2addr v9, v10

    const v10, -0x629a5ca8

    goto/16 :goto_0

    :cond_6
    const-string v8, "\u0730\u06da"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x23

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x1d8d

    const v10, -0x412905c

    xor-int/2addr v9, v10

    const v10, -0x715ed5f0

    goto/16 :goto_0

    :sswitch_11
    sget v8, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v8, :cond_7

    goto :goto_3

    :cond_7
    const-string v8, "\u1a77\u1a7a"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x65

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x23b1

    const v10, -0x5fe72043

    xor-int/2addr v9, v10

    const v10, 0x2dda1640

    goto/16 :goto_0

    .line 61
    :sswitch_12
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v8

    if-nez v8, :cond_9

    :cond_8
    :goto_2
    const-string v8, "\u05ab\u0733"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, 0x5f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x275d

    const v10, -0x625bee9

    xor-int/2addr v9, v10

    const v10, -0x28778de

    goto/16 :goto_0

    :cond_9
    const-string v8, "\u1a78\u05a8"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x15

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0xc0b

    const v10, 0x66d3eb7b

    xor-int/2addr v9, v10

    const v10, 0x6b2d65f2

    goto/16 :goto_0

    .line 151
    :sswitch_13
    sget v8, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v8, :cond_a

    goto :goto_4

    :cond_a
    const-string v8, "\u06e7\u06e8"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x582b

    const v10, -0x1390f221

    xor-int/2addr v9, v10

    const v10, -0x5c6c170

    goto/16 :goto_0

    :sswitch_14
    sget v8, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v8, :cond_c

    :cond_b
    :goto_3
    const-string v8, "\u073a\u06df"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x2d

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x73f1

    const v10, 0x23917c25

    xor-int/2addr v9, v10

    const v10, -0x4b5cf4a2

    goto/16 :goto_0

    :cond_c
    const-string v8, "\u06e4\u073f"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x25dd

    const v10, 0x2f1bb31a

    xor-int/2addr v9, v10

    const v10, 0x2e35d175

    goto/16 :goto_0

    .line 57
    :sswitch_15
    sget v8, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v8, :cond_d

    goto :goto_4

    :cond_d
    const-string v8, "\u073f\u06e8"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x2b5d

    const v10, -0x11d6c282

    xor-int/2addr v9, v10

    const v10, 0x4b8031d0    # 1.680272E7f

    goto/16 :goto_0

    .line 33
    :sswitch_16
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result v8

    if-eqz v8, :cond_f

    :cond_e
    :goto_4
    const-string v8, "\u06ec\u1a7a"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x5ccb

    const v10, -0x242bc324

    xor-int/2addr v9, v10

    const v10, -0x4901d4c5

    goto/16 :goto_0

    :cond_f
    const-string v8, "\u06d6\u0736"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x31

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x20dd

    const v10, -0x6f1c8789

    xor-int/2addr v9, v10

    const v10, -0x39960497

    goto/16 :goto_0

    :sswitch_17
    sget v8, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v8, :cond_10

    goto :goto_5

    :cond_10
    const-string v8, "\u1a75\u073d"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x248f

    const v10, 0x40fd9838

    xor-int/2addr v9, v10

    const v10, -0x6caab38b

    goto/16 :goto_0

    :sswitch_18
    sget v8, Ll/ۧ;->ۨۗܰ:I

    if-ltz v8, :cond_11

    :goto_5
    const-string v8, "\u1a74\u1a73"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x3f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x592d

    const v10, -0x4b3a2dfc

    xor-int/2addr v9, v10

    const v10, -0x32eb2571

    goto/16 :goto_0

    :cond_11
    const-string v8, "\u1a73\u1a78"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x69

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x29cf

    const v10, 0x28056f67

    xor-int/2addr v9, v10

    const v10, 0x710d59a1    # 6.9993186E29f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7989dea9 -> :sswitch_17
        -0x78f825c2 -> :sswitch_9
        -0x765f3179 -> :sswitch_18
        -0x7588e37a -> :sswitch_7
        -0x710ac503 -> :sswitch_f
        -0x6da29ae0 -> :sswitch_1
        -0x6a693e4d -> :sswitch_d
        -0x5a65e423 -> :sswitch_a
        -0x56501840 -> :sswitch_8
        -0x47c1af21 -> :sswitch_0
        -0x47aacabe -> :sswitch_a
        -0x45e23ab0 -> :sswitch_5
        -0x3ddb2b4a -> :sswitch_16
        -0x3bd605d6 -> :sswitch_13
        -0x3b226d3a -> :sswitch_8
        -0x37f7721d -> :sswitch_0
        -0x317b2848 -> :sswitch_6
        -0x2165a29c -> :sswitch_12
        -0x1c3f750e -> :sswitch_6
        -0x17979209 -> :sswitch_15
        -0x13e1cee0 -> :sswitch_c
        -0x10e9078c -> :sswitch_10
        -0xd3a8ee2 -> :sswitch_17
        0x644b854 -> :sswitch_9
        0x90d700d -> :sswitch_15
        0x1220e215 -> :sswitch_3
        0x1d037ec6 -> :sswitch_2
        0x1dd26190 -> :sswitch_e
        0x21866339 -> :sswitch_5
        0x30fe087a -> :sswitch_14
        0x37acaaf2 -> :sswitch_18
        0x3f1c032e -> :sswitch_13
        0x422c31dd -> :sswitch_b
        0x57891027 -> :sswitch_4
        0x57b65671 -> :sswitch_11
        0x583ec18b -> :sswitch_12
        0x58af8ee1 -> :sswitch_d
        0x5b8ae44d -> :sswitch_3
        0x5c8f2303 -> :sswitch_c
        0x5e928faf -> :sswitch_7
        0x69007b23 -> :sswitch_b
        0x6a0789fb -> :sswitch_11
        0x6d684630 -> :sswitch_4
        0x6e46bca2 -> :sswitch_2
        0x6ecbf317 -> :sswitch_1
        0x6f23694c -> :sswitch_14
        0x7088a522 -> :sswitch_f
        0x7361d0e3 -> :sswitch_10
        0x794a8099 -> :sswitch_16
        0x7fd4f03e -> :sswitch_e
    .end sparse-switch
.end method
