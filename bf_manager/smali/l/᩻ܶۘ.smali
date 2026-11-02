.class public final Ll/᩻ܶۘ;
.super Ll/᩵֨;
.source "4649"


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x64a6fe2f

    sget v4, Ll/ۘۧ;->ܳ᩷᩸:I

    sget v5, Ll/ۗ᩺;->ۢۜ᩶:I

    const-string v6, "\u06eb\u1a79"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x31

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7249

    const v8, 0x25ed052a

    xor-int/2addr v7, v8

    const v8, 0x742a0271

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x3417

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 49
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    sget v6, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v6, :cond_8

    goto :goto_1

    :sswitch_0
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v6

    if-nez v6, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v6, "\u06e4\u1a78"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x13

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4583

    const v8, 0x2e98607

    xor-int/2addr v7, v8

    const v8, -0x28b8003e

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v6

    if-eqz v6, :cond_d

    goto/16 :goto_4

    .line 14
    :sswitch_2
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    goto/16 :goto_4

    .line 54
    :sswitch_3
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    return-void

    .line 96
    :sswitch_4
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void

    :sswitch_5
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 97
    throw v2

    .line 93
    :sswitch_6
    :try_start_0
    sget-object v6, Ll/᩻ۜ᩺;->᩶:Landroid/graphics/ColorMatrixColorFilter;

    invoke-virtual {v0, v6}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 94
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v6, "\u05a1\u06e2"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7917

    const v8, 0x6db5225a

    xor-int/2addr v7, v8

    const v8, 0x68aaae91

    goto :goto_0

    :catchall_0
    move-exception v2

    const-string v6, "\u1a79\u06e4"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x33

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4cbb

    const v8, -0x70014f81

    xor-int/2addr v7, v8

    const v8, 0x2098cca4

    goto/16 :goto_0

    .line 88
    :sswitch_7
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void

    .line 91
    :sswitch_8
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getColorFilter()Landroid/graphics/ColorFilter;

    move-result-object v1

    const-string v6, "\u1a7b\u06e0"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x63

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x2629

    const v8, -0x683dcf12

    xor-int/2addr v7, v8

    const v8, 0x79ab5de4

    goto/16 :goto_0

    :sswitch_9
    return-void

    .line 87
    :sswitch_a
    invoke-static {}, Ll/᩶᩵ۘ;->ܰ()Z

    move-result v6

    if-nez v6, :cond_1

    const-string v6, "\u0733\u1a74"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x5bc5

    const v8, 0x4e7167a1    # 1.0125251E9f

    xor-int/2addr v7, v8

    const v8, 0x7fd181c8

    goto/16 :goto_0

    :cond_1
    const-string v6, "\u06e1\u06dc"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x3d87

    const v8, -0x22ef458b

    xor-int/2addr v7, v8

    const v8, -0x7448079f

    goto/16 :goto_0

    .line 83
    :sswitch_b
    invoke-virtual {p0}, Ll/᩵֨;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v6, "\u06dc\u073a"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x25

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5555

    const v8, -0x4c14e09f

    xor-int/2addr v7, v8

    const v8, 0x22c10ccc

    goto/16 :goto_0

    :cond_2
    const-string v6, "\u0730\u1a75"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x1b9b

    const v8, -0x29980ca3

    xor-int/2addr v7, v8

    const v8, 0x6ee71e36

    goto/16 :goto_0

    :sswitch_c
    sget v6, Ll/֫;->ܶܺ᩻:I

    if-ltz v6, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v6, "\u1a76\u1a73"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x75

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x2097

    const v8, 0x485f2fd5

    xor-int/2addr v7, v8

    const v8, 0x2ecb0f16

    goto/16 :goto_0

    :sswitch_d
    sget v6, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v6, :cond_4

    goto :goto_2

    :cond_4
    const-string v6, "\u073a\u06e0"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4a19

    const v8, -0x5a29b985

    xor-int/2addr v7, v8

    const v8, 0xb8b5c38

    goto/16 :goto_0

    .line 63
    :sswitch_e
    sget v6, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v6, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v6, "\u073d\u06e8"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x2b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x3ad

    const v8, -0x3bba64f4

    xor-int/2addr v7, v8

    const v8, -0x2c91b853

    goto/16 :goto_0

    .line 30
    :sswitch_f
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v6

    if-ltz v6, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v6, "\u1a79\u06df"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x63

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x366f

    const v8, -0x7a2a18f8

    xor-int/2addr v7, v8

    const v8, 0x405018de

    goto/16 :goto_0

    :sswitch_10
    sget v6, Ll/ۗ;->֨۬ۖ:I

    if-ltz v6, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v6, "\u073a\u05a8"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x5b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5bdf

    const v8, -0x51aca51e

    xor-int/2addr v7, v8

    const v8, 0x546494a9

    goto/16 :goto_0

    .line 18
    :sswitch_11
    sget v6, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v6, :cond_9

    :cond_8
    :goto_2
    const-string v6, "\u1a75\u073f"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x359f

    const v8, -0x700b109e

    xor-int/2addr v7, v8

    const v8, -0x1aaf2310

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u1a77\u06ec"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x23

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x2e31

    const v8, -0x1d7dcb3e

    xor-int/2addr v7, v8

    const v8, -0x4155f112

    goto/16 :goto_0

    .line 53
    :sswitch_12
    sget v6, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v6, :cond_a

    :goto_3
    const-string v6, "\u06eb\u06eb"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3181

    const v8, 0x668cd7a5

    xor-int/2addr v7, v8

    const v8, -0xcd13d5c

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u06e1\u06d8"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x51

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x29b

    const v8, 0x758fddd0

    xor-int/2addr v7, v8

    const v8, 0x73aa724

    goto/16 :goto_0

    .line 30
    :sswitch_13
    sget v6, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v6, :cond_b

    :goto_4
    const-string v6, "\u06e8\u05ab"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1b49

    const v8, -0x3bc220e1

    xor-int/2addr v7, v8

    const v8, -0x1e9be12f

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u06ec\u06da"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4c8b

    const v8, -0x7544d117

    xor-int/2addr v7, v8

    const v8, 0x371f1357

    goto/16 :goto_0

    :sswitch_14
    sget v6, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v6, :cond_c

    goto :goto_5

    :cond_c
    const-string v6, "\u0733\u06e1"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4e1f

    const v8, 0x5121f39

    xor-int/2addr v7, v8

    const v8, 0x46114443

    goto/16 :goto_0

    :sswitch_15
    sget-boolean v6, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v6, :cond_e

    :cond_d
    :goto_5
    const-string v6, "\u073d\u06e2"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0xf

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0xb45

    const v8, 0x6d29f875

    xor-int/2addr v7, v8

    const v8, 0x5da3af5f

    goto/16 :goto_0

    :cond_e
    const-string v6, "\u06e1\u073a"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x17

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2765

    const v8, 0x1be0f838

    xor-int/2addr v7, v8

    const v8, -0x698f9250

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7cbfdfd9 -> :sswitch_a
        -0x6bdc7f2a -> :sswitch_6
        -0x6040ed76 -> :sswitch_f
        -0x5e8227b2 -> :sswitch_9
        -0x549be8f5 -> :sswitch_e
        -0x544af1f5 -> :sswitch_8
        -0x51b14fea -> :sswitch_d
        -0x4ccf9262 -> :sswitch_0
        -0x4cabaeb9 -> :sswitch_b
        -0x49ebed7c -> :sswitch_14
        -0x48f8b0ea -> :sswitch_3
        -0x3c2d2ffb -> :sswitch_13
        -0x360673fc -> :sswitch_11
        -0x2b585d32 -> :sswitch_d
        -0x222b5182 -> :sswitch_8
        -0x1fd5756f -> :sswitch_3
        -0x1e28df11 -> :sswitch_f
        -0x16e197d9 -> :sswitch_5
        -0x16839a10 -> :sswitch_9
        -0x15a18618 -> :sswitch_10
        -0x4434b9e -> :sswitch_6
        0x3ca8662 -> :sswitch_b
        0xb61fa5a -> :sswitch_14
        0x10722849 -> :sswitch_13
        0x163682eb -> :sswitch_1
        0x1b027c14 -> :sswitch_c
        0x20314476 -> :sswitch_7
        0x2e2d3850 -> :sswitch_15
        0x3107db6c -> :sswitch_a
        0x34df11ac -> :sswitch_5
        0x352aa4ed -> :sswitch_1
        0x374a27ef -> :sswitch_4
        0x3a7a81ad -> :sswitch_12
        0x471b432d -> :sswitch_0
        0x51020e32 -> :sswitch_11
        0x52410c18 -> :sswitch_2
        0x54e689f7 -> :sswitch_15
        0x5d4ca5ca -> :sswitch_10
        0x5de830da -> :sswitch_c
        0x5e631462 -> :sswitch_e
        0x617c443d -> :sswitch_12
        0x626903bf -> :sswitch_4
        0x6d1ab125 -> :sswitch_2
        0x6edca409 -> :sswitch_7
    .end sparse-switch
.end method
