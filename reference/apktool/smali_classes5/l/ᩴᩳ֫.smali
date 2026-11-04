.class public final synthetic Ll/ᩴᩳ֫;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/util/function/ToLongFunction;


# virtual methods
.method public final applyAsLong(Ljava/lang/Object;)J
    .locals 7

    const/4 v0, 0x0

    const v1, 0x7a1b851d

    sget v2, Ll/ۘܽ;->᩹ۧۚ:I

    sget v3, Ll/ۗ᩵;->ᩳܶۤ:I

    const-string v4, "\u06e8\u0736"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0xf

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4db

    const v6, 0x57fd4641

    xor-int/2addr v5, v6

    const v6, -0x366d3779

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x2c97

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v4, :cond_6

    goto/16 :goto_4

    .line 421
    :sswitch_0
    sget v4, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v4, :cond_2

    goto/16 :goto_2

    .line 1599
    :sswitch_1
    sget v4, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v4, :cond_8

    goto/16 :goto_3

    .line 633
    :sswitch_2
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    sget v4, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-gez v4, :cond_a

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    goto :goto_1

    .line 1282
    :sswitch_4
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    const-wide/16 v0, 0x0

    return-wide v0

    .line 4
    :sswitch_5
    sget p1, Ll/۟ۢ֫;->ۡ᩷:I

    .line 2366
    iget-wide v0, v0, Ll/᩵ۢ֫;->ۙ:J

    return-wide v0

    .line 2
    :sswitch_6
    move-object v0, p1

    check-cast v0, Ll/᩵ۢ֫;

    .line 816
    sget v4, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v4, "\u06e7\u0730"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xb73

    const v6, -0x19e048ba

    xor-int/2addr v5, v6

    const v6, -0x1f1ee9c2

    goto :goto_0

    .line 764
    :sswitch_7
    sget v4, Ll/᩺;->۫۬۫:I

    if-gtz v4, :cond_1

    :goto_1
    const-string v4, "\u05ab\u06d6"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x78db

    const v6, -0x74b64f41

    xor-int/2addr v5, v6

    const v6, -0x4b44121e

    goto :goto_0

    :cond_1
    const-string v4, "\u06e0\u1a75"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x75

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x64df

    const v6, 0x6ba56833    # 3.9992965E26f

    xor-int/2addr v5, v6

    const v6, 0x47b0026

    goto :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v4

    if-ltz v4, :cond_3

    :cond_2
    const-string v4, "\u0736\u06d6"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x45

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7a59

    const v6, -0x7e962759

    xor-int/2addr v5, v6

    const v6, -0x5d860cd4

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06d6\u1a75"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x45

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1947

    const v6, -0x1d7f3f22

    xor-int/2addr v5, v6

    const v6, 0x6457a298

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v4

    if-ltz v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u06d7\u06e8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7dfd

    const v6, -0x174f98a9

    xor-int/2addr v5, v6

    const v6, -0x71c7dfc3

    goto/16 :goto_0

    .line 790
    :sswitch_a
    sget v4, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v4, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v4, "\u06ec\u1a73"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x19

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x505f

    const v6, -0x2277782b

    xor-int/2addr v5, v6

    const v6, 0x6062b9b2

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u073a\u06db"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x3b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6c4f

    const v6, 0x35dd0735

    xor-int/2addr v5, v6

    const v6, -0x316ed2a

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v4, :cond_7

    goto :goto_3

    :cond_7
    const-string v4, "\u05a8\u06db"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6d7d

    const v6, 0xcf68648

    xor-int/2addr v5, v6

    const v6, 0x79cec73

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v4, :cond_9

    :cond_8
    :goto_2
    const-string v4, "\u1a7a\u1a7a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x71

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3e91

    const v6, 0x77bf5169

    xor-int/2addr v5, v6

    const v6, -0x1ee94374

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u05ab\u06dc"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x28cf

    const v6, 0x1b381786

    xor-int/2addr v5, v6

    const v6, -0x49fea07a

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v4, :cond_b

    :cond_a
    :goto_3
    const-string v4, "\u1a7a\u06d7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x71f3

    const v6, 0x19121829

    xor-int/2addr v5, v6

    const v6, 0x6633ce8a

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06dc\u06da"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x5

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4a17

    const v6, 0x1ebea5f6

    xor-int/2addr v5, v6

    const v6, -0x55c8d42c

    goto/16 :goto_0

    .line 2169
    :sswitch_e
    sget v4, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v4, :cond_c

    :goto_4
    const-string v4, "\u06d9\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5877

    const v6, 0x6939d533

    xor-int/2addr v5, v6

    const v6, 0x7efbeab4

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06da\u05a8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2ef1

    const v6, 0x685f82bc

    xor-int/2addr v5, v6

    const v6, 0x42222791

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x72913ed6 -> :sswitch_a
        -0x71680ef6 -> :sswitch_9
        -0x6fe71b84 -> :sswitch_4
        -0x60f5594b -> :sswitch_a
        -0x5564ba27 -> :sswitch_8
        -0x54f31f23 -> :sswitch_5
        -0x449fbf11 -> :sswitch_e
        -0x427eefa5 -> :sswitch_1
        -0x2ca2c7b7 -> :sswitch_b
        -0x2bc0ff09 -> :sswitch_d
        -0x197eba1d -> :sswitch_6
        -0x15f22c1d -> :sswitch_7
        -0x2133d23 -> :sswitch_b
        0xa2269db -> :sswitch_9
        0xf3a92bf -> :sswitch_e
        0x104b9c19 -> :sswitch_5
        0x137aaf95 -> :sswitch_7
        0x18a060ef -> :sswitch_c
        0x29f42c60 -> :sswitch_2
        0x2ddddedd -> :sswitch_3
        0x2e6ef04c -> :sswitch_c
        0x334016e7 -> :sswitch_4
        0x3a2944ae -> :sswitch_3
        0x45ec2aa6 -> :sswitch_6
        0x5a58bb1e -> :sswitch_0
        0x5e2becb7 -> :sswitch_1
        0x652cdc66 -> :sswitch_2
        0x6681428a -> :sswitch_d
        0x7b15734d -> :sswitch_0
        0x7ea49bf8 -> :sswitch_8
    .end sparse-switch
.end method
