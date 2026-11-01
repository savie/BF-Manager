.class public final synthetic Ll/᩷ᩳۘ;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/util/function/ToLongFunction;


# virtual methods
.method public final applyAsLong(Ljava/lang/Object;)J
    .locals 7

    const/4 v0, 0x0

    const v1, 0x412cc97e

    sget v2, Ll/֡᩶;->ۗ֨ܺ:I

    sget v3, Ll/֨ܰ;->ۢ᩷۟:I

    const-string v4, "\u06db\u06db"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x49

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6825

    const v6, 0x4fbcf104

    xor-int/2addr v5, v6

    const v6, -0x53c0239d

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x1757

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 450
    sget v4, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v4, :cond_8

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    sget v4, Ll/֫ۚ;->ܽ۠᩹:I

    if-gez v4, :cond_6

    goto/16 :goto_1

    .line 1962
    :sswitch_1
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    sget-boolean v4, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-eqz v4, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v4, "\u06e7\u06db"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0xb

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1dc1

    const v6, 0x75d92a5f

    xor-int/2addr v5, v6

    const v6, -0x5da5be11

    goto :goto_0

    .line 270
    :sswitch_2
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v4

    if-ltz v4, :cond_9

    goto/16 :goto_1

    .line 1915
    :sswitch_3
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    goto/16 :goto_1

    .line 887
    :sswitch_4
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    const-wide/16 v0, 0x0

    return-wide v0

    .line 2280
    :sswitch_5
    iget-object p1, v0, Ll/ܽᩴۘ;->᩺:Landroid/content/pm/PackageInfo;

    .line 2258
    iget-wide v0, p1, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    neg-long v0, v0

    return-wide v0

    .line 4
    :sswitch_6
    sget v4, Ll/ۙ۠ۘ;->᩻ܰ:I

    sget v4, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u1a7a\u1a76"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xe23

    const v6, -0x6d2d4869

    xor-int/2addr v5, v6

    const v6, 0x60f4155

    goto :goto_0

    .line 2
    :sswitch_7
    move-object v0, p1

    check-cast v0, Ll/ܽᩴۘ;

    .line 768
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "\u06e4\u06e8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x75

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4161

    const v6, -0x5ca80f37

    xor-int/2addr v5, v6

    const v6, 0x2a881f2

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_1

    :cond_3
    const-string v4, "\u1a79\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x6d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2cb9

    const v6, 0x29010576

    xor-int/2addr v5, v6

    const v6, 0x18895e4d

    goto/16 :goto_0

    .line 501
    :sswitch_9
    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v4, :cond_4

    goto :goto_1

    :cond_4
    const-string v4, "\u06d7\u0733"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5fe1

    const v6, 0x150f02e5

    xor-int/2addr v5, v6

    const v6, 0x72c75e68

    goto/16 :goto_0

    .line 855
    :sswitch_a
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v4

    if-nez v4, :cond_5

    :goto_1
    const-string v4, "\u1a7a\u06eb"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x69

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1f77

    const v6, 0x37619a28

    xor-int/2addr v5, v6

    const v6, -0x706c4814

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u0736\u1a74"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2c6f

    const v6, 0x54dcdf99

    xor-int/2addr v5, v6

    const v6, 0x7226d8db

    goto/16 :goto_0

    .line 457
    :sswitch_b
    sget v4, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v4, :cond_7

    :cond_6
    :goto_2
    const-string v4, "\u06e4\u06dc"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1d19

    const v6, 0x5a37f60e

    xor-int/2addr v5, v6

    const v6, -0x37a148d7

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u0733\u1a78"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x6d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4fcb

    const v6, 0x599bf74d

    xor-int/2addr v5, v6

    const v6, -0x67fdb530

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u05ab\u1a74"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x7

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5f93

    const v6, -0x753cb686

    xor-int/2addr v5, v6

    const v6, 0x7d7d6541

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v4

    if-eqz v4, :cond_a

    :cond_9
    const-string v4, "\u0730\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2573

    const v6, -0x336a60a9    # -7.844524E7f

    xor-int/2addr v5, v6

    const v6, 0x4cce2a51    # 1.0808999E8f

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06da\u06da"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x47

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6b0d

    const v6, 0x451d4ef3

    xor-int/2addr v5, v6

    const v6, -0x20cd59b9

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_3

    :cond_b
    const-string v4, "\u06d9\u05a8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3911

    const v6, 0x12033142

    xor-int/2addr v5, v6

    const v6, 0x2fbbd38e

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v4, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v4, :cond_c

    :goto_3
    const-string v4, "\u1a78\u06d6"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4e9

    const v6, 0x29a04015

    xor-int/2addr v5, v6

    const v6, -0x14a43fce

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06da\u06e2"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x3b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5d8f

    const v6, 0x6841c5d3

    xor-int/2addr v5, v6

    const v6, 0x70b0e849

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b61805b -> :sswitch_1
        -0x69e6e869 -> :sswitch_8
        -0x677baaf9 -> :sswitch_5
        -0x5ff63315 -> :sswitch_6
        -0x5b00d2e1 -> :sswitch_e
        -0x512bb28f -> :sswitch_3
        -0x4ee5048a -> :sswitch_9
        -0x4812c94a -> :sswitch_1
        -0x47e0607a -> :sswitch_0
        -0x47816a53 -> :sswitch_d
        -0x2f524036 -> :sswitch_4
        -0xb886b50 -> :sswitch_c
        -0xa227bdb -> :sswitch_d
        -0x818e14e -> :sswitch_a
        -0x7c8d458 -> :sswitch_0
        -0x781a569 -> :sswitch_2
        -0x6b85c09 -> :sswitch_b
        -0x9443e1 -> :sswitch_b
        0xd74d8b3 -> :sswitch_8
        0xd957cc2 -> :sswitch_9
        0x1563dead -> :sswitch_5
        0x21a92b63 -> :sswitch_a
        0x29ff2e61 -> :sswitch_6
        0x39a476a2 -> :sswitch_e
        0x50085786 -> :sswitch_c
        0x5a8d009a -> :sswitch_7
        0x5db2d52b -> :sswitch_7
        0x5fa11f3a -> :sswitch_3
        0x779fc55f -> :sswitch_2
        0x7b7cf510 -> :sswitch_4
    .end sparse-switch
.end method
