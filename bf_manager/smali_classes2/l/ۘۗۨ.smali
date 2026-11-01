.class public final Ll/ۘۗۨ;
.super Ljava/lang/Object;
.source "J7HQ"


# direct methods
.method public static ۙ(IILjava/lang/String;)I
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x23d0bfa9

    sget v4, Ll/ۘۧ;->ܳ᩷᩸:I

    sget v5, Ll/֨ܰ;->ۢ᩷۟:I

    const-string v6, "\u1a73\u1a75"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1803

    const v8, 0x2e765b2f

    xor-int/2addr v7, v8

    const v8, -0x6cb12ac4

    :goto_0
    xor-int/2addr v6, v8

    :goto_1
    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, -0x5d55

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 43
    sget v6, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v6, :cond_4

    goto/16 :goto_4

    .line 11
    :sswitch_0
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    sget v6, Ll/֨ۢ;->ۢ۬ۧ:I

    if-gez v6, :cond_8

    goto/16 :goto_7

    :sswitch_1
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    sget v6, Ll/֫;->ܶܺ᩻:I

    if-gez v6, :cond_a

    goto/16 :goto_6

    .line 26
    :sswitch_2
    sget-boolean v6, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v6, :cond_f

    goto/16 :goto_6

    .line 121
    :sswitch_3
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    goto/16 :goto_6

    .line 203
    :sswitch_4
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    const/4 p0, 0x0

    return p0

    :sswitch_5
    add-int/lit8 v2, v2, 0x1

    return v2

    :sswitch_6
    return v0

    .line 236
    :sswitch_7
    sget-object v2, Ll/۬ۗۨ;->۫:Ll/۬ۗۨ;

    invoke-static {p2, p0, p1, v2}, Ll/ۘۗۨ;->ۙ(Ljava/lang/String;IILl/۬ۗۨ;)I

    move-result v2

    if-eq v2, v0, :cond_0

    const-string v6, "\u06e4\u06df"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x4b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4771

    const v8, 0xb393276

    xor-int/2addr v7, v8

    const v8, 0x6cf2734a

    goto :goto_0

    :cond_0
    const-string v6, "\u06d8\u0730"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x61

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x19af

    const v8, 0x3c31f3a1

    xor-int/2addr v7, v8

    const v8, -0x621a7a66

    goto :goto_0

    .line 231
    :sswitch_8
    sget-object v6, Ll/۬ۗۨ;->֡:Ll/۬ۗۨ;

    invoke-static {p2, p0, p1, v6}, Ll/ۘۗۨ;->ۙ(Ljava/lang/String;IILl/۬ۗۨ;)I

    move-result v6

    if-eq v6, v0, :cond_1

    goto :goto_2

    :cond_1
    const-string v6, "\u0730\u06dc"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x1d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3a59

    const v8, 0x6509ed68

    xor-int/2addr v7, v8

    const v8, 0x29e4a2cb

    goto/16 :goto_0

    .line 226
    :sswitch_9
    sget-object v6, Ll/۬ۗۨ;->ܽ:Ll/۬ۗۨ;

    invoke-static {p2, p0, p1, v6}, Ll/ۘۗۨ;->ۙ(Ljava/lang/String;IILl/۬ۗۨ;)I

    move-result v6

    if-eq v6, v0, :cond_2

    :goto_2
    move v1, v6

    goto :goto_3

    :cond_2
    const-string v6, "\u1a77\u06db"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x61

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7521

    const v8, -0x67ddd8c2

    xor-int/2addr v7, v8

    const v8, -0x2e6070da

    goto/16 :goto_0

    :sswitch_a
    add-int/lit8 v1, v1, 0x1

    return v1

    .line 221
    :sswitch_b
    sget-object v0, Ll/۬ۗۨ;->᩶:Ll/۬ۗۨ;

    invoke-static {p2, p0, p1, v0}, Ll/ۘۗۨ;->ۙ(Ljava/lang/String;IILl/۬ۗۨ;)I

    move-result v0

    const/4 v6, -0x1

    if-eq v0, v6, :cond_3

    move v1, v0

    const/4 v0, -0x1

    :goto_3
    const-string v6, "\u06dc\u06e2"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x27

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x369f

    const v8, 0x47e33a89

    xor-int/2addr v7, v8

    const v8, 0x5d3a409b

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e8\u1a78"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v5

    mul-int/lit8 v0, v0, 0x2f

    xor-int v7, v0, v4

    mul-int/lit16 v7, v7, 0x4c01

    const v8, 0x5653aeed

    xor-int/2addr v7, v8

    const v8, 0x5e8803bc

    xor-int/2addr v0, v8

    move v6, v0

    const/4 v0, -0x1

    goto/16 :goto_1

    :cond_4
    const-string v6, "\u06eb\u06df"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x17

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x33c3

    const v8, 0x607a4125

    xor-int/2addr v7, v8

    const v8, 0x300c3a45

    goto/16 :goto_0

    :sswitch_c
    sget v6, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v6, :cond_5

    goto :goto_5

    :cond_5
    const-string v6, "\u06df\u06e7"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x442f

    const v8, -0x4dfc0f8c

    xor-int/2addr v7, v8

    const v8, 0x4b32b1ff    # 1.1710975E7f

    goto/16 :goto_0

    .line 139
    :sswitch_d
    sget-boolean v6, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v6, :cond_6

    :goto_4
    const-string v6, "\u05ab\u06e0"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x225d

    const v8, -0x6ba1f17e

    xor-int/2addr v7, v8

    const v8, 0x6bccc214

    goto/16 :goto_0

    :cond_6
    const-string v6, "\u06e7\u073f"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5ac3

    const v8, -0xc544f9b

    xor-int/2addr v7, v8

    const v8, 0x4b1994ef    # 1.0065135E7f

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    move-result v6

    if-eqz v6, :cond_7

    goto/16 :goto_7

    :cond_7
    const-string v6, "\u1a76\u06e8"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x75

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x63b7

    const v8, 0x63e21ed

    xor-int/2addr v7, v8

    const v8, -0x48ed5c28

    goto/16 :goto_0

    .line 122
    :sswitch_f
    sget v6, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v6, :cond_9

    :cond_8
    :goto_5
    const-string v6, "\u06d7\u06e4"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x4d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x5b37

    const v8, 0x224a0289

    xor-int/2addr v7, v8

    const v8, -0x43199437

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u1a74\u0736"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x246b

    const v8, 0x1bf3b69

    xor-int/2addr v7, v8

    const v8, -0x4466311a

    goto/16 :goto_0

    .line 172
    :sswitch_10
    sget v6, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v6, :cond_b

    :cond_a
    const-string v6, "\u1a7a\u1a78"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5aa1

    const v8, -0x38f967a7

    xor-int/2addr v7, v8

    const v8, -0x7eb6bf5

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u06ec\u06ec"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3f8d

    const v8, 0x49ef18a9

    xor-int/2addr v7, v8

    const v8, -0x230b287b

    goto/16 :goto_0

    :sswitch_11
    sget v6, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v6, :cond_c

    :goto_6
    const-string v6, "\u06e0\u0736"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x530b

    const v8, -0x7628b0b8

    xor-int/2addr v7, v8

    const v8, 0x653bb01a

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u1a73\u1a74"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7153

    const v8, 0x333a72f4

    xor-int/2addr v7, v8

    const v8, -0x4f6094dc

    goto/16 :goto_0

    .line 77
    :sswitch_12
    sget v6, Ll/֨ۧ;->֫۠֡:I

    if-gtz v6, :cond_d

    goto :goto_7

    :cond_d
    const-string v6, "\u06e7\u06ec"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x483f

    const v8, -0x5e56e60f

    xor-int/2addr v7, v8

    const v8, -0x7499ba72

    goto/16 :goto_0

    :sswitch_13
    sget-boolean v6, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v6, :cond_e

    goto :goto_7

    :cond_e
    const-string v6, "\u06d6\u0733"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x3

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7c5b

    const v8, 0x734be3ad

    xor-int/2addr v7, v8

    const v8, 0x14fbe179

    goto/16 :goto_0

    .line 131
    :sswitch_14
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v6

    if-ltz v6, :cond_10

    :cond_f
    :goto_7
    const-string v6, "\u06dc\u1a75"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1a4d

    const v8, 0x7732ccf4

    xor-int/2addr v7, v8

    const v8, 0x30b3ba96

    goto/16 :goto_0

    :cond_10
    const-string v6, "\u1a78\u06d7"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0xdcb

    const v8, 0x1096c27

    xor-int/2addr v7, v8

    const v8, 0x637073b5

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x71adc318 -> :sswitch_12
        -0x5d84343a -> :sswitch_0
        -0x5cb8a81e -> :sswitch_f
        -0x5b899c4a -> :sswitch_b
        -0x5b63307e -> :sswitch_e
        -0x57776bb3 -> :sswitch_3
        -0x518baecf -> :sswitch_2
        -0x4e1f931c -> :sswitch_11
        -0x493d680a -> :sswitch_b
        -0x4779510a -> :sswitch_14
        -0x3ad1eea6 -> :sswitch_14
        -0x360b7ce6 -> :sswitch_d
        -0x30d0875e -> :sswitch_10
        -0x2ba8f105 -> :sswitch_1
        -0x22faec91 -> :sswitch_11
        -0x12068060 -> :sswitch_e
        -0x5b999ea -> :sswitch_5
        -0x6f7f4e -> :sswitch_6
        0xa482d70 -> :sswitch_10
        0x147f2966 -> :sswitch_0
        0x187ad921 -> :sswitch_8
        0x1a8831ab -> :sswitch_4
        0x1d21e9b8 -> :sswitch_5
        0x21efe246 -> :sswitch_6
        0x25f41425 -> :sswitch_13
        0x275de26b -> :sswitch_2
        0x2c926465 -> :sswitch_9
        0x2dd64355 -> :sswitch_9
        0x2f73a532 -> :sswitch_f
        0x32e959de -> :sswitch_d
        0x34aa1430 -> :sswitch_c
        0x3510c2ee -> :sswitch_13
        0x3a48e684 -> :sswitch_c
        0x50750755 -> :sswitch_a
        0x531caeda -> :sswitch_4
        0x5ed33c64 -> :sswitch_7
        0x66ccc381 -> :sswitch_7
        0x66d0df8b -> :sswitch_3
        0x6be17597 -> :sswitch_12
        0x6d6f4f6e -> :sswitch_8
        0x73bb6514 -> :sswitch_1
        0x741b2a55 -> :sswitch_a
    .end sparse-switch
.end method

.method public static ۙ(ILjava/lang/String;)I
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, -0x511d31ee

    sget v6, Ll/֨ۢ;->ۢ۬ۧ:I

    sget v7, Ll/ۗ;->֨۬ۖ:I

    const-string v8, "\u06e0\u1a7a"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x57

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x4003

    const v10, -0x343a4ba2    # -2.5913532E7f

    xor-int/2addr v9, v10

    const v10, 0x588a34bf

    :goto_0
    xor-int/2addr v8, v10

    xor-int/2addr v5, v6

    mul-int/lit16 v5, v5, 0x6931

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    const/4 p0, 0x0

    return p0

    :sswitch_0
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    sget-boolean v8, Ll/᩶;->ۚۤۘ:Z

    if-nez v8, :cond_e

    goto/16 :goto_3

    :sswitch_1
    sget v8, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v8, :cond_8

    goto/16 :goto_2

    .line 29
    :sswitch_2
    sget-boolean v8, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v8, :cond_c

    goto/16 :goto_2

    .line 32
    :sswitch_3
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    const/4 p0, 0x0

    return p0

    :sswitch_5
    add-int/lit8 v4, p0, 0x1

    goto :goto_1

    .line 214
    :sswitch_6
    invoke-static {v3}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v8

    if-eqz v8, :cond_0

    const-string v8, "\u06df\u05a8"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x55

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x6ddd

    const v10, -0x7e03c690

    xor-int/2addr v9, v10

    const v10, -0x194d68d6

    goto :goto_0

    :sswitch_7
    return v4

    :sswitch_8
    return v0

    .line 213
    :sswitch_9
    invoke-static {p1, p0}, Ll/ۗ;->᩶᩺ܶ(Ljava/lang/Object;I)C

    move-result v3

    .line 214
    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v8

    if-eqz v8, :cond_0

    const-string v8, "\u06dc\u06d6"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x25

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x1a85

    const v10, -0x1238f242

    xor-int/2addr v9, v10

    const v10, 0x2c65dcf2

    goto :goto_0

    :cond_0
    move v4, p0

    :goto_1
    const-string v8, "\u06dc\u073a"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x7f69

    const v10, 0x38f68aad

    xor-int/2addr v9, v10

    const v10, 0x20d771d4

    goto/16 :goto_0

    .line 212
    :sswitch_a
    invoke-static {p1, v1}, Ll/֫ᩳ;->ᩳܺ᩻(Ljava/lang/Object;I)C

    move-result v2

    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    move-result v8

    if-nez v8, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v8, "\u06e0\u06e0"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x15

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x7b09

    const v10, -0x6e1400cf

    xor-int/2addr v9, v10

    const v10, 0x2d411a63

    goto/16 :goto_0

    :sswitch_b
    add-int/lit8 v1, p0, -0x1

    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v8

    if-ltz v8, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v8, "\u06dc\u06d9"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x7eaf

    const v10, -0x3e56760c

    xor-int/2addr v9, v10

    const v10, 0x72d1665a

    goto/16 :goto_0

    :sswitch_c
    if-lt p0, v0, :cond_3

    const-string v8, "\u1a73\u1a78"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x61

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x9f9

    const v10, -0x23bc5431

    xor-int/2addr v9, v10

    const v10, 0x1e07f2fa

    goto/16 :goto_0

    :cond_3
    const-string v8, "\u06d6\u06d6"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x7599

    const v10, -0x3b245f2f

    xor-int/2addr v9, v10

    const v10, 0x46ba0028

    goto/16 :goto_0

    .line 205
    :sswitch_d
    invoke-static {p1}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v0

    if-gtz p0, :cond_4

    const-string v8, "\u06eb\u05a8"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x19

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x723f

    const v10, 0x4a26c65a    # 2732438.5f

    xor-int/2addr v9, v10

    const v10, -0x4d3c6740

    goto/16 :goto_0

    :cond_4
    const-string v8, "\u1a76\u06e1"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x10ed

    const v10, -0x84eb252

    xor-int/2addr v9, v10

    const v10, -0xbb779e1

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v8, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v8, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v8, "\u06e2\u06e2"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x5eb1

    const v10, 0x7d0e7fa

    xor-int/2addr v9, v10

    const v10, 0x2fe31e3a

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v8

    if-nez v8, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v8, "\u1a79\u06e7"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x49

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x5ccd

    const v10, 0x79da92d5

    xor-int/2addr v9, v10

    const v10, 0x2906c0e4

    goto/16 :goto_0

    .line 136
    :sswitch_10
    sget-boolean v8, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v8, :cond_7

    :goto_2
    const-string v8, "\u05ab\u073f"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x4471

    const v10, 0x3e9a6408

    xor-int/2addr v9, v10

    const v10, 0x5947e29c

    goto/16 :goto_0

    :cond_7
    const-string v8, "\u1a76\u06e8"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x13e7

    const v10, 0x123e6338

    xor-int/2addr v9, v10

    const v10, -0x670328a

    goto/16 :goto_0

    .line 83
    :sswitch_11
    sget-boolean v8, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v8, :cond_9

    :cond_8
    :goto_3
    const-string v8, "\u1a7a\u06da"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x1b

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x5673

    const v10, 0x2d9f460

    xor-int/2addr v9, v10

    const v10, -0x3b969270

    goto/16 :goto_0

    :cond_9
    const-string v8, "\u1a7b\u05a1"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x221f

    const v10, 0x416ddaa2

    xor-int/2addr v9, v10

    const v10, 0x3e67836a

    goto/16 :goto_0

    .line 77
    :sswitch_12
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    move-result v8

    if-gtz v8, :cond_a

    goto/16 :goto_6

    :cond_a
    const-string v8, "\u05a1\u0733"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x6267

    const v10, -0x395b5ef8

    xor-int/2addr v9, v10

    const v10, 0x1d8afbfd

    goto/16 :goto_0

    :sswitch_13
    sget v8, Ll/֨ۧ;->֫۠֡:I

    if-gtz v8, :cond_b

    :goto_4
    const-string v8, "\u06e2\u0736"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x2f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x4659

    const v10, 0x6612f4e

    xor-int/2addr v9, v10

    const v10, 0x19e65135

    goto/16 :goto_0

    :cond_b
    const-string v8, "\u073a\u073d"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x3c59

    const v10, 0x6a03c657

    xor-int/2addr v9, v10

    const v10, -0x11d3a6f0

    goto/16 :goto_0

    .line 11
    :sswitch_14
    sget-boolean v8, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v8, :cond_d

    :cond_c
    :goto_5
    const-string v8, "\u1a7a\u06d8"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x4d

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x7a1d

    const v10, -0x34ef6512    # -9476846.0f

    xor-int/2addr v9, v10

    const v10, -0xae9a2dd

    goto/16 :goto_0

    :cond_d
    const-string v8, "\u06da\u06d8"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x6b

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x70eb

    const v10, -0x354ce45

    xor-int/2addr v9, v10

    const v10, 0x762536eb

    goto/16 :goto_0

    .line 175
    :sswitch_15
    sget v8, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v8, :cond_f

    :cond_e
    :goto_6
    const-string v8, "\u06da\u05a1"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x3d

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x16ed

    const v10, -0x7f04c72d

    xor-int/2addr v9, v10

    const v10, 0x74a90c7b

    goto/16 :goto_0

    :cond_f
    const-string v8, "\u0736\u0736"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x3665

    const v10, 0x6bcda6dc

    xor-int/2addr v9, v10

    const v10, -0x13092744

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x76095f59 -> :sswitch_4
        -0x6dd8477a -> :sswitch_7
        -0x69f4d1d9 -> :sswitch_b
        -0x68d2725c -> :sswitch_10
        -0x5e075ede -> :sswitch_6
        -0x52db6f84 -> :sswitch_15
        -0x4be1fbe0 -> :sswitch_1
        -0x4735473f -> :sswitch_a
        -0x4369aa7b -> :sswitch_13
        -0x3fde5055 -> :sswitch_a
        -0x32c44580 -> :sswitch_11
        -0x31cdbb7b -> :sswitch_1
        -0x319beea0 -> :sswitch_3
        -0x2c8f8e8a -> :sswitch_e
        -0x248a7843 -> :sswitch_b
        -0x1bc05334 -> :sswitch_2
        -0x1ae4e75e -> :sswitch_d
        -0x13faa264 -> :sswitch_0
        -0x12841b97 -> :sswitch_8
        -0x112ab2dd -> :sswitch_10
        -0xf29f86a -> :sswitch_4
        -0xc2afcd4 -> :sswitch_8
        -0x6784bf9 -> :sswitch_f
        -0x5fe39db -> :sswitch_6
        -0x53a2ba5 -> :sswitch_2
        -0xadc94b -> :sswitch_d
        -0x821a50 -> :sswitch_7
        0x2a72918b -> :sswitch_9
        0x2e4ab9c0 -> :sswitch_14
        0x3c47cab3 -> :sswitch_14
        0x3ff3464d -> :sswitch_0
        0x428ac4f5 -> :sswitch_13
        0x46bbafb8 -> :sswitch_c
        0x4b7ce4c8 -> :sswitch_f
        0x4e781703 -> :sswitch_3
        0x520a3388 -> :sswitch_12
        0x5cdcacdf -> :sswitch_12
        0x5da6da0d -> :sswitch_5
        0x689271a9 -> :sswitch_15
        0x6b4864ae -> :sswitch_c
        0x7020e68b -> :sswitch_5
        0x74d514da -> :sswitch_e
        0x7e0be381 -> :sswitch_11
        0x7f219ce7 -> :sswitch_9
    .end sparse-switch
.end method

.method public static ۙ(Ljava/lang/String;IILl/۬ۗۨ;)I
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x2f9f0843

    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    sget v4, Ll/֡֡;->᩶ۤ۠:I

    const-string v5, "\u06db\u0733"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2431

    const v7, -0x59158901

    xor-int/2addr v6, v7

    const v7, 0x6ed26a9

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x1875

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 118
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    move-result v5

    if-nez v5, :cond_9

    goto/16 :goto_2

    .line 112
    :sswitch_0
    sget-boolean v5, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v5, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v5, "\u06d8\u073f"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7475

    const v7, -0x61236f07

    xor-int/2addr v6, v7

    const v7, 0x5d6ac6dd

    goto :goto_0

    .line 62
    :sswitch_1
    sget-boolean v5, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-eqz v5, :cond_a

    goto/16 :goto_5

    .line 149
    :sswitch_2
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    sget v5, Ll/֫ܳ;->᩶ۧۛ:I

    if-gez v5, :cond_8

    goto/16 :goto_5

    .line 91
    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    goto/16 :goto_5

    :sswitch_4
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    const/4 p0, 0x0

    return p0

    :sswitch_5
    return v1

    .line 246
    :sswitch_6
    invoke-static {p0, v1}, Ll/֫ᩳ;->ᩳܺ᩻(Ljava/lang/Object;I)C

    move-result v5

    .line 247
    invoke-virtual {p3, v5}, Ll/۬ۗۨ;->ۙ(C)Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v5, "\u06d7\u05a8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x49

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3667

    const v7, -0x55065473

    xor-int/2addr v6, v7

    const v7, 0x34f2aca8

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_1

    :sswitch_7
    const/4 p0, -0x1

    return p0

    :sswitch_8
    add-int/lit8 v1, v0, -0x1

    if-le v1, p1, :cond_2

    const-string v5, "\u06e7\u06d7"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x1d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x18af

    const v7, 0x4fcc320c

    xor-int/2addr v6, v7

    const v7, -0x2c7c6b9e

    goto/16 :goto_0

    :cond_2
    const-string v5, "\u05ab\u1a7a"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1931

    const v7, -0x5902ba72

    xor-int/2addr v6, v7

    const v7, -0x67f4ac62

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v5, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v5, :cond_3

    goto/16 :goto_4

    :cond_3
    move v0, p2

    :goto_1
    const-string v5, "\u05a1\u06ec"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x10ef

    const v7, 0x185a51af

    xor-int/2addr v6, v7

    const v7, 0x213af882

    goto/16 :goto_0

    .line 33
    :sswitch_a
    sget v5, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v5, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v5, "\u073a\u06e4"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4ddb

    const v7, 0x394741a

    xor-int/2addr v6, v7

    const v7, 0x44913da0

    goto/16 :goto_0

    .line 129
    :sswitch_b
    sget-boolean v5, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v5, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v5, "\u073f\u06da"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x37c1

    const v7, 0x2b2132fe

    xor-int/2addr v6, v7

    const v7, -0x21162efe

    goto/16 :goto_0

    .line 242
    :sswitch_c
    sget v5, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v5, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v5, "\u06d9\u06e2"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x75c5

    const v7, -0xbd02716

    xor-int/2addr v6, v7

    const v7, -0x178e309d

    goto/16 :goto_0

    .line 39
    :sswitch_d
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result v5

    if-eqz v5, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v5, "\u1a79\u06da"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x524d

    const v7, -0xad79a93

    xor-int/2addr v6, v7

    const v7, 0x30b02451

    goto/16 :goto_0

    :cond_8
    :goto_2
    const-string v5, "\u1a74\u06d8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x51

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7489

    const v7, 0x47c84fee

    xor-int/2addr v6, v7

    const v7, 0x1ee3fd95

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u05a1\u06d6"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x7d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7df3

    const v7, -0x33a326a2    # -5.7894264E7f

    xor-int/2addr v6, v7

    const v7, 0x13769cd0

    goto/16 :goto_0

    .line 67
    :sswitch_e
    sget-boolean v5, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v5, :cond_b

    :cond_a
    :goto_3
    const-string v5, "\u06e7\u06e0"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x13

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x53b

    const v7, -0x6b0cae01

    xor-int/2addr v6, v7

    const v7, 0x296f95ca

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u1a78\u06e8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x39

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x21ff

    const v7, 0x1133b0af

    xor-int/2addr v6, v7

    const v7, 0x4d32c168    # 1.8743872E8f

    goto/16 :goto_0

    :sswitch_f
    sget v5, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v5, :cond_c

    goto :goto_5

    :cond_c
    const-string v5, "\u1a75\u06d6"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x77

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7d23

    const v7, -0x2c3fe186

    xor-int/2addr v6, v7

    const v7, -0x2e72e014

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v5

    if-gtz v5, :cond_d

    :goto_4
    const-string v5, "\u06e8\u1a7b"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x55

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x601

    const v7, -0x1818c9c7

    xor-int/2addr v6, v7

    const v7, -0x3702a30f

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u1a75\u06e2"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x31

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x21ad

    const v7, 0x1d1253a4

    xor-int/2addr v6, v7

    const v7, -0x25553c0d

    goto/16 :goto_0

    :sswitch_11
    sget v5, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v5, :cond_e

    :goto_5
    const-string v5, "\u06d7\u06eb"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1e45

    const v7, -0x2373ff58

    xor-int/2addr v6, v7

    const v7, -0x2107d1b1

    goto/16 :goto_0

    :cond_e
    const-string v5, "\u06df\u06e8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x330b

    const v7, 0x526c64fc

    xor-int/2addr v6, v7

    const v7, 0x3eca8af2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x73010436 -> :sswitch_5
        -0x71a9a5c2 -> :sswitch_2
        -0x6d3c5066 -> :sswitch_a
        -0x696a02d5 -> :sswitch_0
        -0x68f49b7e -> :sswitch_2
        -0x6841c6d8 -> :sswitch_4
        -0x65c7d814 -> :sswitch_4
        -0x616226ab -> :sswitch_6
        -0x5ec82627 -> :sswitch_b
        -0x5e9a2d0f -> :sswitch_9
        -0x5b411ccb -> :sswitch_11
        -0x516ef620 -> :sswitch_8
        -0x2bdeffae -> :sswitch_7
        -0x28622d0d -> :sswitch_7
        -0x227e9aad -> :sswitch_f
        -0x1640b7b3 -> :sswitch_6
        -0x84b8350 -> :sswitch_5
        -0x336f569 -> :sswitch_10
        0x2ed0fb8 -> :sswitch_3
        0x8bb42a9 -> :sswitch_9
        0x11408459 -> :sswitch_1
        0x186c55b0 -> :sswitch_f
        0x2211c1dd -> :sswitch_c
        0x24efc523 -> :sswitch_1
        0x2b638868 -> :sswitch_d
        0x31c0b132 -> :sswitch_3
        0x37773ad1 -> :sswitch_a
        0x473f15e8 -> :sswitch_e
        0x48ecf0c9 -> :sswitch_e
        0x4fab3082 -> :sswitch_11
        0x60ea02b0 -> :sswitch_b
        0x63d08193 -> :sswitch_0
        0x687c807a -> :sswitch_8
        0x72e0c8f8 -> :sswitch_10
        0x789832a9 -> :sswitch_d
        0x7c998633 -> :sswitch_c
    .end sparse-switch
.end method

.method public static ۙ(Ljava/lang/String;ILbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;)Ljava/util/List;
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

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

    const v15, -0x3e25f95c

    sget v16, Ll/ۧ;->֫۠ᩴ:I

    sget v17, Ll/۟;->ۨᩴۛ:I

    const-string v18, "\u06eb\u06ec"

    invoke-static/range {v18 .. v18}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v16

    xor-int v3, v18, v17

    mul-int/lit16 v3, v3, -0x3091

    const v20, 0x6ddf8ec0

    xor-int v3, v3, v20

    const v20, -0x1c244de2

    xor-int v18, v18, v20

    move-object v5, v4

    move/from16 v19, v18

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

    const v18, -0x3e25f95c

    const/16 v20, 0x0

    :goto_0
    xor-int v4, v18, v17

    mul-int/lit16 v4, v4, -0x3bb1

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v3, v4

    xor-int v18, v19, v3

    sparse-switch v18, :sswitch_data_0

    move/from16 v19, v20

    .line 2
    sget v3, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v3, :cond_16

    goto/16 :goto_c

    .line 79
    :sswitch_0
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v3

    if-gtz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u0730\u06e8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x5ecf

    const v19, 0x116380ba

    xor-int v4, v4, v19

    const v19, 0x597db9c7

    goto/16 :goto_9

    .line 30
    :sswitch_1
    sget-boolean v3, Ll/֨۟;->ܿ᩻۫:Z

    if-nez v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u1a77\u06e1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x5f8f

    const v19, 0x2354044e

    xor-int v4, v4, v19

    const v19, 0x1841f763

    goto/16 :goto_9

    :sswitch_2
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    sget v3, Ll/֡ۚ;->ۢܰ᩸:I

    if-gez v3, :cond_2

    goto :goto_2

    :cond_2
    move/from16 v19, v20

    goto/16 :goto_e

    :sswitch_3
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    sget v3, Ll/֫ܳ;->᩶ۧۛ:I

    if-gez v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u073a\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0x3e0d

    const v19, 0x78783aed

    xor-int v4, v4, v19

    const v19, 0x71570cba

    goto/16 :goto_9

    .line 58
    :sswitch_4
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_5

    :cond_4
    move/from16 v19, v20

    goto/16 :goto_b

    :cond_5
    :goto_1
    const-string v3, "\u05a1\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x49bb

    const v19, -0x6de90631

    xor-int v4, v4, v19

    const v19, -0x61e5f9e0

    goto/16 :goto_9

    :sswitch_5
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    sget v3, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v3, :cond_6

    goto :goto_2

    :cond_6
    move/from16 v19, v20

    goto/16 :goto_d

    :sswitch_6
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_2

    :sswitch_7
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    :goto_2
    const-string v3, "\u1a79\u06d9"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v17

    mul-int/lit8 v3, v3, 0x3

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x76d

    const v19, -0x6aad93a

    xor-int v4, v4, v19

    const v19, -0x30f8e6b6

    goto/16 :goto_9

    .line 55
    :sswitch_8
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_9
    if-eq v15, v8, :cond_7

    move v11, v15

    goto/16 :goto_5

    :cond_7
    move v11, v10

    goto/16 :goto_5

    .line 61
    :sswitch_a
    invoke-static {v0, v7, v14}, Ll/ۘۛ;->ۖ᩸᩶(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Ll/ۘۗ;->ܽۛܶ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move v7, v14

    goto/16 :goto_7

    :sswitch_b
    add-int v3, v12, v13

    if-le v3, v1, :cond_8

    const-string v3, "\u1a7a\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x1d1b

    const v19, 0x69f256e0

    xor-int v4, v4, v19

    const v19, -0x51a6087b

    goto/16 :goto_9

    :cond_8
    move v12, v3

    move v9, v10

    move v15, v9

    goto/16 :goto_6

    .line 52
    :sswitch_c
    invoke-static {v0, v7, v6}, Ll/ۖܽ;->۠᩹ۖ(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Ll/ۘۗ;->ܽۛܶ(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v5

    .line 56
    :sswitch_d
    invoke-static {v7, v11, v0}, Ll/ۘۗۨ;->ۙ(IILjava/lang/String;)I

    move-result v3

    if-gt v3, v7, :cond_9

    move v14, v11

    goto :goto_3

    :cond_9
    move v14, v3

    :goto_3
    const-string v3, "\u0736\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v17, v3

    mul-int/lit8 v3, v3, -0x9

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x25c9

    const v19, 0x655fdac0

    xor-int v4, v4, v19

    const v19, 0x6ace57f2

    goto/16 :goto_9

    :sswitch_e
    sub-int v3, v10, v9

    goto :goto_4

    .line 76
    :sswitch_f
    invoke-static {v0, v9, v10}, Ll/ۖܽ;->۠᩹ۖ(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v3

    .line 81
    invoke-interface {v2, v3}, Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;->calculate(Ljava/lang/String;)I

    move-result v3

    :goto_4
    move v13, v3

    const-string v3, "\u06ec\u06d9"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x3e5d

    const v19, 0x606deb14

    xor-int v4, v4, v19

    const v19, -0x382788fe

    goto/16 :goto_9

    :sswitch_10
    if-ne v11, v6, :cond_a

    const-string v3, "\u06ec\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x849

    const v19, 0x13d8e9aa

    xor-int v4, v4, v19

    const v19, 0x5ea93a47

    goto/16 :goto_9

    :cond_a
    const-string v3, "\u1a78\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    mul-int/lit8 v3, v3, 0x71

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x249

    const v19, 0x17bc3077

    xor-int v4, v4, v19

    const v19, 0x945d5aa

    goto/16 :goto_9

    .line 87
    :sswitch_11
    invoke-virtual {v0, v9}, Ljava/lang/String;->codePointAt(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    move-result v3

    add-int v10, v3, v9

    if-nez v2, :cond_b

    const-string v3, "\u06e8\u06d7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    mul-int/lit8 v3, v3, 0xd

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x63d9

    const v19, 0x412ff215

    xor-int v4, v4, v19

    const v19, 0x96e1e9f

    goto/16 :goto_9

    :cond_b
    const-string v3, "\u0733\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    mul-int/lit8 v3, v3, 0x45

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x4d39

    const v19, 0x31fe98ed

    xor-int v4, v4, v19

    const v19, -0xafb89cf

    goto/16 :goto_9

    :sswitch_12
    if-ge v9, v6, :cond_c

    const-string v3, "\u05ab\u1a75"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v16, v3

    mul-int/lit8 v3, v3, -0x7

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x5081

    const v19, -0x1c443bec

    xor-int v4, v4, v19

    const v19, 0x554b896e

    goto/16 :goto_9

    :cond_c
    move v11, v9

    :goto_5
    const-string v3, "\u06e0\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x7d09

    const v19, 0x7e5a3818

    xor-int v4, v4, v19

    const v19, 0x7cf06801

    goto/16 :goto_9

    :sswitch_13
    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v8, -0x1

    move v9, v7

    const/4 v8, -0x1

    const/4 v12, 0x0

    const/4 v15, -0x1

    :goto_6
    const-string v3, "\u06e2\u06e2"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v17, v3

    mul-int/lit8 v3, v3, -0x59

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x3461

    const v19, -0x1936ce93

    xor-int v4, v4, v19

    const v19, -0x5b975fa7

    goto/16 :goto_9

    :sswitch_14
    return-object v5

    :sswitch_15
    if-ge v7, v6, :cond_d

    const-string v3, "\u06da\u073f"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x7755

    const v19, 0x4c6a2623    # 6.1380748E7f

    xor-int v4, v4, v19

    const v19, 0xe937e59

    goto/16 :goto_9

    :cond_d
    const-string v3, "\u06d7\u073f"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v16, v3

    mul-int/lit8 v3, v3, 0x3

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0x3515

    const v19, 0x1f3ea0fe

    xor-int v4, v4, v19

    const v19, -0x2874897e

    goto/16 :goto_9

    .line 29
    :sswitch_16
    invoke-static/range {p0 .. p0}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v3

    const/4 v4, 0x0

    move v6, v3

    const/4 v7, 0x0

    :goto_7
    const-string v3, "\u06df\u0736"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v17

    mul-int/lit8 v3, v3, 0xf

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0xfff

    const v19, 0x2f6adbc3

    xor-int v4, v4, v19

    const v19, -0xae3a47e

    goto :goto_9

    .line 27
    :sswitch_17
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 23
    sget v3, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v3, :cond_e

    move/from16 v19, v20

    goto/16 :goto_c

    :cond_e
    const-string v3, "\u1a79\u06e2"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x4f43

    const v19, -0x12b5ec1

    xor-int v4, v4, v19

    const v19, 0x66efefc2

    goto :goto_9

    :sswitch_18
    move/from16 v3, v20

    if-gt v3, v1, :cond_f

    move/from16 v19, v3

    goto/16 :goto_a

    :cond_f
    const-string v4, "\u0733\u05a8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v17, v4

    mul-int/lit8 v4, v4, 0x3d

    move/from16 v19, v3

    xor-int v3, v4, v16

    mul-int/lit16 v3, v3, 0x4d79

    const v20, -0x2c4e246e

    xor-int v3, v3, v20

    const v20, 0x3ccd5e3d

    xor-int v4, v4, v20

    move/from16 v20, v19

    move/from16 v19, v4

    goto/16 :goto_0

    .line 81
    :sswitch_19
    invoke-interface {v2, v0}, Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;->calculate(Ljava/lang/String;)I

    move-result v3

    goto :goto_8

    .line 83
    :sswitch_1a
    invoke-static/range {p0 .. p0}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v3

    :goto_8
    move/from16 v20, v3

    const-string v3, "\u0730\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    mul-int/lit8 v3, v3, -0x31

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0x234d

    const v19, 0x3b6da3af

    xor-int v4, v4, v19

    const v19, -0x461c795b

    :goto_9
    xor-int v19, v3, v19

    goto/16 :goto_10

    :sswitch_1b
    move/from16 v19, v20

    if-eqz v2, :cond_10

    const-string v3, "\u073a\u0736"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x847

    const v20, 0x552628ac

    xor-int v4, v4, v20

    const v20, -0x57fc0403

    goto/16 :goto_f

    :cond_10
    const-string v3, "\u1a7a\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0x2021

    const v20, -0xbf5bbf3

    xor-int v4, v4, v20

    const v20, 0x53eec112

    goto/16 :goto_f

    .line 24
    :sswitch_1c
    invoke-static/range {p0 .. p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :sswitch_1d
    move/from16 v19, v20

    if-lez v1, :cond_11

    const-string v3, "\u06db\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x25e1

    const v20, -0x7846fa79

    xor-int v4, v4, v20

    const v20, 0x74a66a22

    goto/16 :goto_f

    :cond_11
    :goto_a
    const-string v3, "\u073f\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x30a1

    const v20, -0x6b91653c

    xor-int v4, v4, v20

    const v20, 0x486d777b

    goto/16 :goto_f

    :sswitch_1e
    move/from16 v19, v20

    .line 50
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_12

    goto :goto_b

    :cond_12
    const-string v3, "\u1a77\u06db"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x37f9

    const v20, 0x255bda86

    xor-int v4, v4, v20

    const v20, -0x1bcdd23a

    goto/16 :goto_f

    :sswitch_1f
    move/from16 v19, v20

    .line 56
    sget v3, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v3, :cond_13

    goto/16 :goto_d

    :cond_13
    const-string v3, "\u1a77\u06d8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    mul-int/lit8 v3, v3, -0x71

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0x60bf

    const v20, -0xc9b1433

    xor-int v4, v4, v20

    const v20, -0x7ba6fc72

    goto/16 :goto_f

    :sswitch_20
    move/from16 v19, v20

    sget-boolean v3, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v3, :cond_14

    goto/16 :goto_e

    :cond_14
    const-string v3, "\u073a\u1a76"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v17

    mul-int/lit8 v3, v3, 0x13

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x3993

    const v20, -0x5141cfa4

    xor-int v4, v4, v20

    const v20, 0x12d6a251

    goto/16 :goto_f

    :sswitch_21
    move/from16 v19, v20

    .line 86
    sget v3, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v3, :cond_15

    :goto_b
    const-string v3, "\u06e4\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x762f

    const v20, 0x51e866b

    xor-int v4, v4, v20

    const v20, 0x3a560957

    goto/16 :goto_f

    :cond_15
    const-string v3, "\u06e8\u1a79"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    mul-int/lit8 v3, v3, 0x41

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x6903

    const v20, -0x5daff0d5

    xor-int v4, v4, v20

    const v20, -0x7790973e

    goto/16 :goto_f

    :goto_c
    const-string v3, "\u0730\u06d6"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    mul-int/lit8 v3, v3, -0x6f

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x108f

    const v20, -0x8e57227

    xor-int v4, v4, v20

    const v20, -0x4a9b16bc

    goto/16 :goto_f

    :cond_16
    const-string v3, "\u06e7\u073f"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x6d51

    const v20, -0x79d4d239

    xor-int v4, v4, v20

    const v20, -0x2315c7be

    goto/16 :goto_f

    :sswitch_22
    move/from16 v19, v20

    .line 35
    sget v3, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v3, :cond_17

    goto :goto_e

    :cond_17
    const-string v3, "\u05a8\u06d6"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v16

    mul-int/lit8 v3, v3, 0x23

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0x6719

    const v20, 0x55a5d6ea

    xor-int v4, v4, v20

    const v20, -0x18dc0e49

    goto/16 :goto_f

    :sswitch_23
    move/from16 v19, v20

    .line 41
    sget v3, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v3, :cond_18

    goto :goto_d

    :cond_18
    const-string v3, "\u05a8\u05a1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x5d05

    const v20, 0x4dcac115    # 4.2520643E8f

    xor-int v4, v4, v20

    const v20, -0x76925e14

    goto :goto_f

    :sswitch_24
    move/from16 v19, v20

    sget-boolean v3, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v3, :cond_19

    :goto_d
    const-string v3, "\u06db\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x75e1

    const v20, -0x223b0735

    xor-int v4, v4, v20

    const v20, -0x27491a7a

    goto :goto_f

    :cond_19
    const-string v3, "\u1a76\u1a75"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x1e27

    const v20, -0x5a783692

    xor-int v4, v4, v20

    const v20, 0x3687e285

    goto :goto_f

    :sswitch_25
    move/from16 v19, v20

    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v3, :cond_1a

    :goto_e
    const-string v3, "\u06d8\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x5273

    const v20, 0x71c995be

    xor-int v4, v4, v20

    const v20, 0x2ac9cb2f

    goto :goto_f

    :cond_1a
    const-string v3, "\u06e8\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v16

    mul-int/lit8 v3, v3, 0x19

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x3ab3

    const v20, -0x40a54aa3

    xor-int v4, v4, v20

    const v20, -0x3399e90a    # -6.031663E7f

    :goto_f
    xor-int v3, v3, v20

    move/from16 v20, v19

    move/from16 v19, v3

    :goto_10
    move v3, v4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7aadfad7 -> :sswitch_7
        -0x77b0b2c7 -> :sswitch_a
        -0x76b1b486 -> :sswitch_c
        -0x74cc6223 -> :sswitch_0
        -0x6fce54b9 -> :sswitch_8
        -0x6c56d6a9 -> :sswitch_11
        -0x6a322621 -> :sswitch_3
        -0x58971df6 -> :sswitch_19
        -0x53926154 -> :sswitch_1e
        -0x4e68a669 -> :sswitch_13
        -0x4dc71896 -> :sswitch_1
        -0x496b1927 -> :sswitch_10
        -0x46591330 -> :sswitch_1c
        -0x45a447d5 -> :sswitch_e
        -0x413d1bae -> :sswitch_1b
        -0x36277a03 -> :sswitch_18
        -0x35c43e38 -> :sswitch_9
        -0x31acf558 -> :sswitch_4
        -0x2f276c16 -> :sswitch_21
        -0x2dd966fa -> :sswitch_2
        -0x2b7144a9 -> :sswitch_14
        -0x2617d7e0 -> :sswitch_16
        -0x1e52c8db -> :sswitch_c
        -0x1a8edb3a -> :sswitch_6
        -0x19865fec -> :sswitch_1
        -0x1578ea15 -> :sswitch_14
        -0x141e8204 -> :sswitch_20
        -0x13a6cd91 -> :sswitch_1d
        -0x1316f980 -> :sswitch_1a
        -0xa118f2a -> :sswitch_0
        -0x4e63ef4 -> :sswitch_17
        -0x31f06eb -> :sswitch_23
        0x15f3b63 -> :sswitch_12
        0x3d9cfa2 -> :sswitch_4
        0x57c9b4f -> :sswitch_17
        0x70254b0 -> :sswitch_12
        0xc8a8d55 -> :sswitch_11
        0xf544e74 -> :sswitch_10
        0x115e44af -> :sswitch_9
        0x12d25e56 -> :sswitch_6
        0x17524be0 -> :sswitch_1f
        0x17605576 -> :sswitch_d
        0x189d9df5 -> :sswitch_b
        0x1a359f67 -> :sswitch_18
        0x1ce0ad3c -> :sswitch_5
        0x2339d16e -> :sswitch_1b
        0x2567a459 -> :sswitch_a
        0x25866d92 -> :sswitch_1f
        0x29c815f8 -> :sswitch_1e
        0x2d0493d4 -> :sswitch_15
        0x2ef1bf78 -> :sswitch_15
        0x31ff0eb8 -> :sswitch_23
        0x3391c401 -> :sswitch_13
        0x391a15d6 -> :sswitch_20
        0x3b6dbc9e -> :sswitch_22
        0x4309403a -> :sswitch_22
        0x430b5913 -> :sswitch_8
        0x49c9133f -> :sswitch_f
        0x546027b8 -> :sswitch_16
        0x547ee6bd -> :sswitch_5
        0x5b35eae9 -> :sswitch_1d
        0x5cdf9314 -> :sswitch_25
        0x5e2c49d4 -> :sswitch_1c
        0x5ec69d89 -> :sswitch_d
        0x5f975adf -> :sswitch_25
        0x626749ee -> :sswitch_19
        0x63ee1911 -> :sswitch_21
        0x6bf42df9 -> :sswitch_24
        0x6cecd8c4 -> :sswitch_24
        0x7331372e -> :sswitch_1a
        0x74a35a9a -> :sswitch_2
        0x7541fb4c -> :sswitch_3
        0x7597389d -> :sswitch_7
        0x78203c63 -> :sswitch_f
        0x78dc5604 -> :sswitch_b
        0x7cd8255d -> :sswitch_e
    .end sparse-switch
.end method

.method public static ۙ(Ljava/lang/String;Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;)Ljava/util/List;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

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

    const v16, -0x375ac6d7

    sget v17, Ll/֡᩶;->ۗ֨ܺ:I

    sget v18, Ll/ۗܺ;->ۨ᩺۠:I

    const-string v19, "\u06da\u0730"

    invoke-static/range {v19 .. v19}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v17

    mul-int/lit8 v19, v19, 0x75

    xor-int v2, v19, v18

    mul-int/lit16 v2, v2, 0x4bd7

    const v21, -0x7d0d4a49

    xor-int v2, v2, v21

    const v21, 0x6a2f8823

    xor-int v19, v19, v21

    move/from16 v20, v19

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const v19, -0x375ac6d7

    const/16 v21, 0x0

    :goto_0
    xor-int v7, v19, v18

    mul-int/lit16 v7, v7, -0x4f6d

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v2, v7

    xor-int v19, v20, v2

    sparse-switch v19, :sswitch_data_0

    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    goto :goto_3

    .line 79
    :sswitch_0
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    move-result v2

    if-lez v2, :cond_0

    goto :goto_1

    :cond_0
    move/from16 v20, v21

    goto/16 :goto_11

    .line 176
    :sswitch_1
    sget-boolean v2, Ll/ۗܳ;->ۤᩴۗ:Z

    if-nez v2, :cond_b

    :cond_1
    move/from16 v20, v21

    goto/16 :goto_13

    .line 16
    :sswitch_2
    sget v2, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v2, :cond_2

    goto :goto_5

    :cond_2
    :goto_1
    const-string v2, "\u1a74\u073d"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x3b51

    const v20, -0x5b894002

    xor-int v7, v7, v20

    const v20, 0x51704180

    goto/16 :goto_b

    .line 145
    :sswitch_3
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    sget-boolean v2, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v2, :cond_3

    goto :goto_4

    :cond_3
    :goto_2
    move/from16 v20, v21

    goto/16 :goto_c

    .line 9
    :sswitch_4
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    sget v2, Ll/ۖۧ;->ܺۚۖ:I

    if-lez v2, :cond_4

    :goto_3
    move/from16 v20, v21

    goto/16 :goto_10

    :cond_4
    :goto_4
    const-string v2, "\u06df\u1a78"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0x475b

    const v20, 0x4341d919

    xor-int v7, v7, v20

    const v20, 0x5e7f5ced

    goto/16 :goto_b

    :sswitch_5
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    sget v2, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v2, :cond_5

    goto :goto_5

    :cond_5
    move/from16 v20, v21

    goto/16 :goto_12

    :sswitch_6
    sget v2, Ll/֨ۢ;->ۢ۬ۧ:I

    if-gez v2, :cond_6

    goto :goto_3

    :cond_6
    :goto_5
    const-string v2, "\u05a1\u06e7"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v18, v2

    mul-int/lit8 v2, v2, -0x13

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x60c7

    const v20, -0x1ad1232b

    xor-int v7, v7, v20

    const v20, -0x5f9d17b0

    goto/16 :goto_b

    .line 158
    :sswitch_7
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_3

    :sswitch_8
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_9
    add-int/lit8 v2, v14, -0x1

    .line 167
    invoke-static {v2, v0}, Ll/ۘۗۨ;->ܰ(ILjava/lang/String;)I

    move-result v2

    move v10, v2

    goto/16 :goto_a

    .line 87
    :sswitch_a
    invoke-virtual {v0, v5}, Ljava/lang/String;->codePointAt(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    move-result v2

    add-int/2addr v2, v5

    goto :goto_6

    .line 129
    :sswitch_b
    invoke-static {v0, v5, v6}, Ll/ۖܽ;->۠᩹ۖ(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Ll/ۘۗ;->ܽۛܶ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move v5, v6

    move/from16 v20, v21

    goto/16 :goto_f

    .line 177
    :sswitch_c
    invoke-interface/range {p1 .. p1}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->reset()V

    .line 178
    invoke-static {v0, v5, v14}, Ll/ۘۛ;->ۖ᩸᩶(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->tryAdd(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    move v9, v14

    goto/16 :goto_a

    :cond_7
    const-string v2, "\u1a73\u1a7b"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x4435

    const v20, 0x4f08592e

    xor-int v7, v7, v20

    const v20, 0xf54473

    goto/16 :goto_b

    .line 123
    :sswitch_d
    invoke-static {v15, v0}, Ll/ۘۗۨ;->ۙ(ILjava/lang/String;)I

    move-result v2

    if-gt v2, v5, :cond_8

    const-string v2, "\u06dc\u06e8"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v17, v2

    mul-int/lit8 v2, v2, 0x67

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x2c09

    const v20, 0x10f7337a

    xor-int v7, v7, v20

    const v20, 0x5d00f1ec

    goto/16 :goto_b

    :cond_8
    :goto_6
    move v6, v2

    const-string v2, "\u06e1\u073a"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v18

    mul-int/lit8 v2, v2, 0xf

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x73c9

    const v20, -0x508f6c32

    xor-int v7, v7, v20

    const v20, 0xf74914b

    goto/16 :goto_b

    :sswitch_e
    add-int/lit8 v2, v9, 0x1

    .line 157
    invoke-static {v2, v0}, Ll/ۘۗۨ;->ۙ(ILjava/lang/String;)I

    move-result v2

    goto :goto_7

    :sswitch_f
    if-le v14, v10, :cond_9

    goto/16 :goto_9

    :cond_9
    const-string v2, "\u1a79\u073d"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    mul-int/lit8 v2, v2, 0x45

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x5963

    const v20, 0x163a2a9b

    xor-int v7, v7, v20

    const v20, 0x71616af

    goto/16 :goto_b

    :sswitch_10
    ushr-int/lit8 v2, v13, 0x1

    .line 155
    invoke-static {v2, v0}, Ll/ۘۗۨ;->ܰ(ILjava/lang/String;)I

    move-result v2

    if-gt v2, v9, :cond_a

    const-string v2, "\u06db\u1a74"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x2a3d

    const v20, -0x17417d50

    xor-int v7, v7, v20

    const v20, -0x6362ac86

    goto/16 :goto_b

    :cond_a
    :goto_7
    move v14, v2

    const-string v2, "\u1a73\u1a74"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x6857

    const v20, 0x3dc8d778

    xor-int v7, v7, v20

    const v20, -0x6bd7d859

    goto/16 :goto_b

    :sswitch_11
    add-int v13, v11, v12

    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v2

    if-gtz v2, :cond_c

    :cond_b
    const-string v2, "\u073d\u1a7a"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v17

    mul-int/lit8 v2, v2, 0x6d

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x3ae5

    const v20, 0x2bdcb603

    xor-int v7, v7, v20

    const v20, 0x7b7c38ff

    goto/16 :goto_b

    :cond_c
    const-string v2, "\u1a7a\u0736"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x4745

    const v20, 0x6818c621

    xor-int v7, v7, v20

    const v20, -0xa30147e

    goto/16 :goto_b

    :sswitch_12
    add-int v11, v9, v10

    const/4 v12, 0x1

    .line 7
    sget v2, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v2, :cond_d

    goto/16 :goto_2

    :cond_d
    const-string v2, "\u073a\u1a73"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    mul-int/lit8 v2, v2, 0x21

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x5789

    const v20, 0x1a4702c3

    xor-int v7, v7, v20

    const v20, 0x2e6be028

    goto/16 :goto_b

    .line 113
    :sswitch_13
    invoke-static {v0, v5, v4}, Ll/ۖܽ;->۠᩹ۖ(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Ll/ۘۗ;->ܽۛܶ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move/from16 v20, v21

    goto/16 :goto_e

    .line 117
    :sswitch_14
    invoke-static {v5, v8, v0}, Ll/ۘۗۨ;->ۙ(IILjava/lang/String;)I

    move-result v2

    if-gt v2, v5, :cond_e

    move v15, v8

    goto :goto_8

    :cond_e
    move v15, v2

    :goto_8
    const-string v2, "\u0730\u1a74"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0xe8f

    const v20, -0x2d84584c

    xor-int v7, v7, v20

    const v20, -0x450a0b34

    goto/16 :goto_b

    :sswitch_15
    if-ge v9, v10, :cond_f

    const-string v2, "\u06d8\u06e0"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    mul-int/lit8 v2, v2, -0x17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x22d

    const v20, -0x548497c9

    xor-int v7, v7, v20

    const v20, 0x182a7c26

    goto/16 :goto_b

    :cond_f
    :goto_9
    move v8, v9

    move/from16 v20, v21

    goto/16 :goto_d

    :sswitch_16
    if-ne v8, v4, :cond_10

    const-string v2, "\u0736\u06d6"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0x5fb7

    const v20, -0x570b4891

    xor-int v7, v7, v20

    const v20, -0x11f5942

    goto/16 :goto_b

    :cond_10
    const-string v2, "\u06e8\u06e0"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v17, v2

    mul-int/lit8 v2, v2, -0x4b

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x202b

    const v20, -0x1a5b7b96

    xor-int v7, v7, v20

    const v20, 0x3c380f90

    goto/16 :goto_b

    .line 152
    :sswitch_17
    invoke-static/range {p0 .. p0}, Ll/֫ᩳ;->ܶ᩷᩺(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    move/from16 v9, v21

    :goto_a
    const-string v2, "\u06e1\u06ec"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x3cbf

    const v20, -0x15c54d54

    xor-int v7, v7, v20

    const v20, 0x739b0c2f

    goto :goto_b

    .line 177
    :sswitch_18
    invoke-interface/range {p1 .. p1}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->reset()V

    move/from16 v2, v21

    .line 178
    invoke-static {v0, v5, v2}, Ll/ۖܽ;->۠᩹ۖ(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v1, v7}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->tryAdd(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_11

    move v8, v2

    move/from16 v20, v8

    goto/16 :goto_d

    :cond_11
    const-string v7, "\u1a79\u06ec"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    add-int v7, v7, v17

    mul-int/lit8 v7, v7, 0x7f

    move/from16 v20, v2

    xor-int v2, v7, v18

    mul-int/lit16 v2, v2, -0x3a07

    const v21, -0x320dac5b    # -5.08196E8f

    xor-int v2, v2, v21

    const v21, 0x21908729

    xor-int v7, v7, v21

    move/from16 v21, v20

    move/from16 v20, v7

    goto/16 :goto_0

    :sswitch_19
    add-int v21, v16, v5

    .line 7
    sget v2, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v2, :cond_12

    const-string v2, "\u1a75\u1a74"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v18

    mul-int/lit8 v2, v2, 0x11

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0x11c5

    const v20, -0x7c0f89b7

    xor-int v7, v7, v20

    const v20, -0x230accb9

    goto :goto_b

    :cond_12
    const-string v2, "\u0730\u06e8"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v17, v2

    mul-int/lit8 v2, v2, -0x43

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x4fa1

    const v20, 0xcf5a6b5

    xor-int v7, v7, v20

    const v20, 0x519fcd29

    :goto_b
    xor-int v20, v2, v20

    goto/16 :goto_15

    :sswitch_1a
    move/from16 v20, v21

    .line 87
    invoke-virtual {v0, v5}, Ljava/lang/String;->codePointAt(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    move-result v16

    .line 143
    sget v2, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v2, :cond_13

    :goto_c
    const-string v2, "\u073f\u073d"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    mul-int/lit8 v2, v2, 0x63

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x5bff

    const v21, 0x284e2d30

    xor-int v7, v7, v21

    const v21, 0x97ccb9d

    goto/16 :goto_14

    :cond_13
    const-string v2, "\u06db\u1a73"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v18

    mul-int/lit8 v2, v2, 0x1d

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x2ab1

    const v21, -0x4598cdd2

    xor-int v7, v7, v21

    const v21, -0x4d002c1b

    goto/16 :goto_14

    :sswitch_1b
    move/from16 v20, v21

    .line 177
    invoke-interface/range {p1 .. p1}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->reset()V

    .line 178
    invoke-static {v0, v5, v4}, Ll/ۖܽ;->۠᩹ۖ(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->tryAdd(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_14

    move v8, v4

    :goto_d
    const-string v2, "\u06d8\u0733"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x7b53

    const v21, -0x4d0daf

    xor-int v7, v7, v21

    const v21, -0x5f774364

    goto/16 :goto_14

    :cond_14
    const-string v2, "\u05a8\u06e4"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x16d

    const v21, 0x2559737b

    xor-int v7, v7, v21

    const v21, 0x7e2c827c

    goto/16 :goto_14

    .line 134
    :sswitch_1c
    invoke-interface/range {p1 .. p1}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->reset()V

    return-object v3

    :sswitch_1d
    move/from16 v20, v21

    if-ge v5, v4, :cond_15

    const-string v2, "\u05a1\u06e2"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v18

    mul-int/lit8 v2, v2, -0x4f

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0xbb3

    const v21, 0x359a792c

    xor-int v7, v7, v21

    const v21, 0x3417aa70

    goto/16 :goto_14

    :cond_15
    :goto_e
    const-string v2, "\u06d8\u05a8"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x7131

    const v21, -0x214a0969

    xor-int v7, v7, v21

    const v21, 0x1211d0ee

    goto/16 :goto_14

    .line 99
    :sswitch_1e
    invoke-static/range {p0 .. p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :sswitch_1f
    move/from16 v20, v21

    .line 104
    invoke-static/range {p0 .. p0}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v2

    const/4 v4, 0x0

    move v4, v2

    const/4 v5, 0x0

    :goto_f
    const-string v2, "\u1a7a\u073a"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v18

    mul-int/lit8 v2, v2, -0x51

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0x3d63

    const v21, 0x4b5fa52c    # 1.4656812E7f

    xor-int v7, v7, v21

    const v21, 0x5768316

    goto/16 :goto_14

    :sswitch_20
    move/from16 v20, v21

    .line 102
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    sget v2, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v2, :cond_16

    :goto_10
    const-string v2, "\u0736\u1a7b"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v18

    mul-int/lit8 v2, v2, -0x51

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0xa51

    const v21, -0x161acd47

    xor-int v7, v7, v21

    const v21, -0x5909c0f8

    goto/16 :goto_14

    :cond_16
    const-string v2, "\u06e7\u06e1"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    mul-int/lit8 v2, v2, -0x33

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x76a3

    const v21, 0x7b8c9ae4

    xor-int v7, v7, v21

    const v21, 0x113c3133

    goto/16 :goto_14

    .line 93
    :sswitch_21
    invoke-static/range {p0 .. p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :sswitch_22
    move/from16 v20, v21

    .line 97
    invoke-interface/range {p1 .. p1}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->reset()V

    .line 98
    invoke-interface {v1, v0}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->tryAdd(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_17

    const-string v2, "\u073f\u06e4"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v17

    mul-int/lit8 v2, v2, 0x43

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x5f21

    const v21, 0x465426ca

    xor-int v7, v7, v21

    const v21, 0x16029d70

    goto/16 :goto_14

    :cond_17
    const-string v2, "\u06e8\u1a7a"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v17, v2

    mul-int/lit8 v2, v2, -0x77

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x1ab5

    const v21, 0x47b97fa3

    xor-int v7, v7, v21

    const v21, 0x62c73273

    goto/16 :goto_14

    :sswitch_23
    move/from16 v20, v21

    .line 92
    invoke-static/range {p0 .. p0}, Ll/ۖۗ;->ᩳܶ۫(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_18

    const-string v2, "\u06e2\u1a79"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v18, v2

    mul-int/lit8 v2, v2, -0x7b

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0x63a5

    const v21, 0x1a321876

    xor-int v7, v7, v21

    const v21, 0x38038e02

    goto/16 :goto_14

    :cond_18
    const-string v2, "\u06d7\u1a75"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v17

    mul-int/lit8 v2, v2, 0x1f

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0xfc3

    const v21, -0x6058b0eb

    xor-int v7, v7, v21

    const v21, 0x317ea35

    goto/16 :goto_14

    :sswitch_24
    move/from16 v20, v21

    .line 107
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v2

    if-gtz v2, :cond_19

    goto :goto_11

    :cond_19
    const-string v2, "\u05ab\u06d8"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    mul-int/lit8 v2, v2, 0x5d

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0x4e25

    const v21, 0x3f7dbf00

    xor-int v7, v7, v21

    const v21, 0x4d371592    # 1.9197776E8f

    goto/16 :goto_14

    :sswitch_25
    move/from16 v20, v21

    .line 90
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    move-result v2

    if-nez v2, :cond_1a

    :goto_11
    const-string v2, "\u06e2\u0730"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v18

    mul-int/lit8 v2, v2, 0x19

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0x4f03

    const v21, 0x1c248dbb

    xor-int v7, v7, v21

    const v21, -0x23a15629

    goto/16 :goto_14

    :cond_1a
    const-string v2, "\u05a8\u06d6"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0x2719

    const v21, 0x288854e5

    xor-int v7, v7, v21

    const v21, -0x3191534

    goto/16 :goto_14

    :sswitch_26
    move/from16 v20, v21

    .line 57
    sget v2, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v2, :cond_1b

    goto :goto_13

    :cond_1b
    const-string v2, "\u0736\u06e1"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v17, v2

    mul-int/lit8 v2, v2, 0x15

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x2bdb

    const v21, 0x680d21d8

    xor-int v7, v7, v21

    const v21, -0x6ef951

    goto :goto_14

    :sswitch_27
    move/from16 v20, v21

    .line 55
    sget v2, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v2, :cond_1c

    :goto_12
    const-string v2, "\u05a8\u06df"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    mul-int/lit8 v2, v2, -0x1b

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x6761

    const v21, 0x7a5cc157

    xor-int v7, v7, v21

    const v21, -0x45d77fa6

    goto :goto_14

    :cond_1c
    const-string v2, "\u1a78\u1a77"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x7407

    const v21, 0x2a8ae50a

    xor-int v7, v7, v21

    const v21, 0xc92a0b9

    goto :goto_14

    :sswitch_28
    move/from16 v20, v21

    .line 37
    sget v2, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v2, :cond_1d

    :goto_13
    const-string v2, "\u0733\u06d6"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v17

    mul-int/lit8 v2, v2, 0xb

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x4365

    const v21, -0x49939e62

    xor-int v7, v7, v21

    const v21, -0x3c08232f

    goto :goto_14

    :cond_1d
    const-string v2, "\u1a75\u06d7"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    mul-int/lit8 v2, v2, -0xb

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0x52d7

    const v21, -0x644be44a

    xor-int v7, v7, v21

    const v21, -0x1e8eec3d

    :goto_14
    xor-int v2, v2, v21

    move/from16 v21, v20

    move/from16 v20, v2

    :goto_15
    move v2, v7

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7da20e26 -> :sswitch_3
        -0x79e8e8ce -> :sswitch_d
        -0x787c6800 -> :sswitch_17
        -0x749b40c2 -> :sswitch_4
        -0x74105ba7 -> :sswitch_28
        -0x735ba79c -> :sswitch_a
        -0x72817b6d -> :sswitch_4
        -0x70ae1f8e -> :sswitch_10
        -0x700d92b9 -> :sswitch_e
        -0x6fc46c67 -> :sswitch_27
        -0x6f9b4df0 -> :sswitch_26
        -0x6a4d054f -> :sswitch_20
        -0x68f4bf27 -> :sswitch_1e
        -0x5bff674b -> :sswitch_8
        -0x586b5727 -> :sswitch_22
        -0x4be5a1a5 -> :sswitch_2
        -0x4bb18406 -> :sswitch_9
        -0x4a5f6e8f -> :sswitch_24
        -0x49210ace -> :sswitch_1d
        -0x485972b3 -> :sswitch_13
        -0x4798490b -> :sswitch_18
        -0x46a118ef -> :sswitch_18
        -0x3a8c0f90 -> :sswitch_1a
        -0x353599e0 -> :sswitch_21
        -0x351b8495 -> :sswitch_1d
        -0x34b2ddd4 -> :sswitch_25
        -0x32466e32 -> :sswitch_0
        -0x2dae763f -> :sswitch_b
        -0x2c52538c -> :sswitch_23
        -0x2a50205d -> :sswitch_14
        -0x24753aef -> :sswitch_1f
        -0x22925bab -> :sswitch_f
        -0x21983b41 -> :sswitch_15
        -0x195cff46 -> :sswitch_10
        -0x1769c773 -> :sswitch_13
        -0x163155ac -> :sswitch_16
        -0xc920752 -> :sswitch_21
        -0xc708f69 -> :sswitch_7
        -0xc4c3fe5 -> :sswitch_d
        -0x45ecb12 -> :sswitch_1
        -0x3cec661 -> :sswitch_11
        -0x2077a6 -> :sswitch_19
        0x82a66b -> :sswitch_1e
        0x11eec15 -> :sswitch_0
        0x17ed9fa -> :sswitch_1c
        0x459247f -> :sswitch_19
        0x46bec41 -> :sswitch_28
        0x49480b8 -> :sswitch_5
        0x818a6ae -> :sswitch_12
        0x1399dadf -> :sswitch_9
        0x17397e07 -> :sswitch_5
        0x1835b75a -> :sswitch_3
        0x1ffe3e82 -> :sswitch_26
        0x2a86bc13 -> :sswitch_a
        0x2faedcf9 -> :sswitch_7
        0x36954477 -> :sswitch_f
        0x388f7406 -> :sswitch_27
        0x3ab57381 -> :sswitch_e
        0x3add1d97 -> :sswitch_15
        0x3b4d490f -> :sswitch_c
        0x3c7a8b72 -> :sswitch_2
        0x3dbbba5c -> :sswitch_1
        0x40cbd8d3 -> :sswitch_c
        0x444667ff -> :sswitch_b
        0x45e617bb -> :sswitch_24
        0x4898d34f -> :sswitch_17
        0x4968a405 -> :sswitch_6
        0x56f93cc4 -> :sswitch_1b
        0x592f8c8a -> :sswitch_12
        0x59af6162 -> :sswitch_23
        0x59b0c2cb -> :sswitch_22
        0x5bcea1e1 -> :sswitch_16
        0x5c66d502 -> :sswitch_11
        0x67883fe2 -> :sswitch_25
        0x6d43e484 -> :sswitch_1a
        0x6e751bba -> :sswitch_1c
        0x72469cac -> :sswitch_14
        0x7636bf46 -> :sswitch_1f
        0x76bfe7e0 -> :sswitch_8
        0x779bcf1e -> :sswitch_6
        0x77f7aa58 -> :sswitch_1b
        0x7a977957 -> :sswitch_20
    .end sparse-switch
.end method

.method public static ܰ(ILjava/lang/String;)I
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, 0x5097f395

    sget v5, Ll/֫۟;->᩸ᩴܿ:I

    sget v6, Ll/ۖۧ;->ܺۚۖ:I

    const-string v7, "\u06df\u06eb"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x71

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x26bd

    const v9, -0x3b51affa

    xor-int/2addr v8, v9

    const v9, 0x7486e155

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v5

    mul-int/lit16 v4, v4, 0x3877

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    const/4 p0, 0x0

    return p0

    .line 56
    :sswitch_0
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    sget v7, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v7, :cond_b

    goto/16 :goto_3

    .line 63
    :sswitch_1
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    sget v7, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v7, :cond_d

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v7

    if-eqz v7, :cond_8

    goto/16 :goto_3

    .line 108
    :sswitch_3
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    const/4 p0, 0x0

    return p0

    :sswitch_5
    return v1

    .line 195
    :sswitch_6
    invoke-static {v3}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v7

    if-eqz v7, :cond_0

    const-string v7, "\u0730\u06e0"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x53

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x7455

    const v9, -0x2f2c9472

    xor-int/2addr v8, v9

    const v9, -0x156941e3

    goto :goto_0

    :sswitch_7
    return p0

    :sswitch_8
    return v0

    .line 194
    :sswitch_9
    invoke-static {p1, p0}, Ll/ۗ;->᩶᩺ܶ(Ljava/lang/Object;I)C

    move-result v3

    .line 195
    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v7

    if-eqz v7, :cond_0

    const-string v7, "\u06eb\u06e1"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x1e05

    const v9, 0x5c3cbdbc

    xor-int/2addr v8, v9

    const v9, 0x6084d94d

    goto :goto_0

    :cond_0
    const-string v7, "\u06e4\u1a78"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x6d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x3f99

    const v9, 0x2ffebbe7

    xor-int/2addr v8, v9

    const v9, -0x5cd786e4

    goto/16 :goto_0

    .line 193
    :sswitch_a
    invoke-static {p1, v1}, Ll/֫ᩳ;->ᩳܺ᩻(Ljava/lang/Object;I)C

    move-result v2

    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v7

    if-ltz v7, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v7, "\u1a77\u073d"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x61

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x3823

    const v9, -0x5acbcf7c

    xor-int/2addr v8, v9

    const v9, 0x555ec928

    goto/16 :goto_0

    :sswitch_b
    add-int/lit8 v1, p0, -0x1

    .line 56
    sget v7, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v7, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v7, "\u06d6\u05a1"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x47e5

    const v9, 0x6633e925

    xor-int/2addr v8, v9

    const v9, 0x1ded7564

    goto/16 :goto_0

    :sswitch_c
    if-lt p0, v0, :cond_3

    const-string v7, "\u06d6\u06dc"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x480d

    const v9, 0x15b2025d

    xor-int/2addr v8, v9

    const v9, 0x2a00abf4

    goto/16 :goto_0

    :cond_3
    const-string v7, "\u1a79\u1a76"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x6be9

    const v9, 0x1a1b555c

    xor-int/2addr v8, v9

    const v9, 0x4c0b2aff    # 3.6482044E7f

    goto/16 :goto_0

    .line 186
    :sswitch_d
    invoke-static {p1}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v0

    if-gtz p0, :cond_4

    const-string v7, "\u1a7a\u073a"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x41

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7a49

    const v9, 0xb4c0058

    xor-int/2addr v8, v9

    const v9, 0x2615ec03

    goto/16 :goto_0

    :cond_4
    const-string v7, "\u06dc\u073a"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x69a9

    const v9, 0x1c945585

    xor-int/2addr v8, v9

    const v9, -0x59f2378

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v7

    if-gtz v7, :cond_5

    :goto_1
    const-string v7, "\u0730\u06d7"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x74d9

    const v9, 0x7ea06155

    xor-int/2addr v8, v9

    const v9, 0x4c5ed723    # 5.8416268E7f

    goto/16 :goto_0

    :cond_5
    const-string v7, "\u0730\u1a73"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x39

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x5b19

    const v9, -0x17f25496

    xor-int/2addr v8, v9

    const v9, -0x37485d39

    goto/16 :goto_0

    .line 45
    :sswitch_f
    sget-boolean v7, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v7, :cond_6

    goto/16 :goto_2

    :cond_6
    const-string v7, "\u06e7\u06eb"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x43

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x57c1

    const v9, 0x7820f559

    xor-int/2addr v8, v9

    const v9, -0x39d99988

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v7

    if-ltz v7, :cond_7

    goto :goto_2

    :cond_7
    const-string v7, "\u1a79\u1a7a"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x67

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x3d5d

    const v9, 0x5592ea82

    xor-int/2addr v8, v9

    const v9, 0x1bc5ed1b

    goto/16 :goto_0

    .line 114
    :sswitch_11
    sget v7, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v7, :cond_9

    :cond_8
    const-string v7, "\u06eb\u05ab"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x3c51

    const v9, -0x566ec1f

    xor-int/2addr v8, v9

    const v9, 0xa747ff

    goto/16 :goto_0

    :cond_9
    const-string v7, "\u06eb\u1a74"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x59

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x6efb

    const v9, 0x23ff1d41

    xor-int/2addr v8, v9

    const v9, 0x44ee539b

    goto/16 :goto_0

    .line 130
    :sswitch_12
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    move-result v7

    if-gtz v7, :cond_a

    goto :goto_2

    :cond_a
    const-string v7, "\u06e7\u1a7a"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x69

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x6adf

    const v9, -0x57e05e88    # -8.861286E-15f

    xor-int/2addr v8, v9

    const v9, -0x393758c8

    goto/16 :goto_0

    :sswitch_13
    sget v7, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v7, :cond_c

    :cond_b
    :goto_2
    const-string v7, "\u06d7\u06dc"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x1f

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x4cfd

    const v9, 0x1053fa04

    xor-int/2addr v8, v9

    const v9, -0x6455dcfd

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u1a7b\u06d8"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x5527

    const v9, 0x140ee24a

    xor-int/2addr v8, v9

    const v9, -0xb978eeb

    goto/16 :goto_0

    .line 175
    :sswitch_14
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v7

    if-eqz v7, :cond_e

    :cond_d
    const-string v7, "\u0730\u06eb"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x1b

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0xa5f

    const v9, -0x7b2f704d

    xor-int/2addr v8, v9

    const v9, -0x79c9a841

    goto/16 :goto_0

    :cond_e
    const-string v7, "\u06db\u1a75"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x11

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x15e1

    const v9, -0x1d263814

    xor-int/2addr v8, v9

    const v9, 0x97c6068

    goto/16 :goto_0

    .line 93
    :sswitch_15
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v7

    if-eqz v7, :cond_f

    :goto_3
    const-string v7, "\u06e8\u1a75"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x5c9d

    const v9, 0x23a0f1f2

    xor-int/2addr v8, v9

    const v9, 0x21283ae8

    goto/16 :goto_0

    :cond_f
    const-string v7, "\u06dc\u06eb"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x324b

    const v9, 0x6511d602

    xor-int/2addr v8, v9

    const v9, 0xfc9b232

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7a4df75c -> :sswitch_13
        -0x7096edb6 -> :sswitch_14
        -0x674c7ade -> :sswitch_14
        -0x4fe8d4bb -> :sswitch_13
        -0x4bb624d8 -> :sswitch_0
        -0x49add906 -> :sswitch_4
        -0x3a8e60b5 -> :sswitch_11
        -0x35bf687a -> :sswitch_a
        -0x336dc888 -> :sswitch_1
        -0x24db21e5 -> :sswitch_0
        -0x248d7683 -> :sswitch_b
        -0x1f2b6f6b -> :sswitch_b
        -0x1edff66f -> :sswitch_12
        -0x1ed9c812 -> :sswitch_f
        -0xfac7f02 -> :sswitch_e
        -0xc738790 -> :sswitch_15
        0x66dd393 -> :sswitch_d
        0x675d235 -> :sswitch_c
        0xe3be54b -> :sswitch_15
        0xe7f7614 -> :sswitch_1
        0x10b502f5 -> :sswitch_6
        0x1101a823 -> :sswitch_10
        0x18671a8a -> :sswitch_6
        0x236b7ed5 -> :sswitch_7
        0x31017383 -> :sswitch_7
        0x3104c771 -> :sswitch_9
        0x3e51f05f -> :sswitch_11
        0x3ecb4d12 -> :sswitch_f
        0x3f7c1dcc -> :sswitch_10
        0x4258fb02 -> :sswitch_2
        0x4330cb84 -> :sswitch_4
        0x4588a571 -> :sswitch_3
        0x54f87b34 -> :sswitch_8
        0x5a3177dc -> :sswitch_8
        0x5f45310e -> :sswitch_9
        0x6311a637 -> :sswitch_12
        0x64d5891a -> :sswitch_e
        0x694a8726 -> :sswitch_5
        0x6d1aebc9 -> :sswitch_c
        0x6ddcaa01 -> :sswitch_a
        0x70969d31 -> :sswitch_3
        0x72908dbb -> :sswitch_d
        0x7546f6db -> :sswitch_5
        0x7c3978c1 -> :sswitch_2
    .end sparse-switch
.end method
