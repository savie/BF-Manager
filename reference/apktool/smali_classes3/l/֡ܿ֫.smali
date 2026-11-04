.class public final Ll/֡ܿ֫;
.super Ll/᩹ۘ᩻;
.source "A1FQ"


# virtual methods
.method public final ۙ(Ll/ۙ֡ۨ;)F
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x6bb4b708

    sget v3, Ll/֡ۢ;->۟֡᩻:I

    sget v4, Ll/ۖ᩹;->۫ܽۗ:I

    const-string v5, "\u1a77\u06df"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4cc9

    const v7, -0x70cabd5e

    xor-int/2addr v6, v7

    const v7, -0x12324877

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x7227

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    const/high16 v1, 0x40000000    # 2.0f

    mul-float v1, v1, v0

    goto/16 :goto_1

    .line 244
    :sswitch_0
    sget v5, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v5, :cond_c

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    sget v5, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-lez v5, :cond_9

    goto/16 :goto_2

    .line 336
    :sswitch_2
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v5

    if-ltz v5, :cond_3

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    goto/16 :goto_3

    .line 63
    :sswitch_4
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    const/4 p1, 0x0

    return p1

    .line 419
    :sswitch_5
    invoke-static {p1}, Ll/ۗ᩺;->᩶᩶۠(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {p1}, Ll/ۙ֡ۨ;->ᩴ()Ll/ۙ֡ۨ;

    move-result-object v6

    invoke-static {v6}, Ll/ۗ᩺;->᩶᩶۠(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v6

    if-ne v5, v6, :cond_0

    const-string v5, "\u06ec\u1a73"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x50a1

    const v7, -0x66c5d687

    xor-int/2addr v6, v7

    const v7, 0x5cb0e362

    goto :goto_0

    .line 418
    :sswitch_6
    invoke-virtual {p1}, Ll/ۙ֡ۨ;->ᩴ()Ll/ۙ֡ۨ;

    move-result-object v5

    instance-of v5, v5, Ll/ۜܿۨ;

    if-eqz v5, :cond_0

    const-string v5, "\u06e4\u06eb"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5b1d

    const v7, -0x490d2d

    xor-int/2addr v6, v7

    const v7, 0x85b1cb0

    goto :goto_0

    :sswitch_7
    return v1

    .line 417
    :sswitch_8
    invoke-super {p0, p1}, Ll/᩹ۘ᩻;->ۙ(Ll/ۙ֡ۨ;)F

    move-result v0

    .line 418
    instance-of v5, p1, Ll/ۜܿۨ;

    if-eqz v5, :cond_0

    const-string v5, "\u05a1\u073d"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4e29

    const v7, -0x469e10c1

    xor-int/2addr v6, v7

    const v7, -0x13a8287f

    goto/16 :goto_0

    :cond_0
    move v1, v0

    :goto_1
    const-string v5, "\u0733\u06e4"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5285

    const v7, -0x6da6214f

    xor-int/2addr v6, v7

    const v7, 0x6332122a

    goto/16 :goto_0

    .line 132
    :sswitch_9
    sget-boolean v5, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v5, :cond_1

    const-string v5, "\u073a\u05ab"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1f4b

    const v7, -0x18666b3a

    xor-int/2addr v6, v7

    const v7, 0x55bfd45e

    goto/16 :goto_0

    :cond_1
    const-string v5, "\u1a78\u1a78"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x28dd

    const v7, 0x509b4751

    xor-int/2addr v6, v7

    const v7, -0x58e97d89

    goto/16 :goto_0

    .line 2
    :sswitch_a
    sget-boolean v5, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v5, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v5, "\u06e4\u06d7"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x38b3

    const v7, 0x161a5211

    xor-int/2addr v6, v7

    const v7, 0x43dff8f3

    goto/16 :goto_0

    .line 115
    :sswitch_b
    sget v5, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v5, :cond_4

    :cond_3
    :goto_2
    const-string v5, "\u06e4\u06ec"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x15

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7f25

    const v7, 0x2e1580dc

    xor-int/2addr v6, v7

    const v7, -0x7c670735

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u073d\u073a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x79

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4865

    const v7, -0x202f7120

    xor-int/2addr v6, v7

    const v7, -0x7b6bec3a

    goto/16 :goto_0

    .line 26
    :sswitch_c
    sget v5, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v5, :cond_5

    goto :goto_3

    :cond_5
    const-string v5, "\u1a78\u1a7a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3f25

    const v7, -0x31546f23

    xor-int/2addr v6, v7

    const v7, 0x55804ecd

    goto/16 :goto_0

    .line 216
    :sswitch_d
    sget v5, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v5, :cond_6

    :goto_3
    const-string v5, "\u06dc\u1a75"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x6f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1b21

    const v7, -0x50e1d8fb

    xor-int/2addr v6, v7

    const v7, -0x1d0d10d7

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u06e7\u06e4"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2721

    const v7, 0x1756f156

    xor-int/2addr v6, v7

    const v7, -0x672a1f75

    goto/16 :goto_0

    .line 81
    :sswitch_e
    sget v5, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v5, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v5, "\u06e2\u1a78"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x31

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6049

    const v7, -0x7ea5effd

    xor-int/2addr v6, v7

    const v7, -0x5d909d0b

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v5

    if-nez v5, :cond_8

    goto :goto_4

    :cond_8
    const-string v5, "\u06d9\u05ab"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x51dd

    const v7, 0x698e0f3d

    xor-int/2addr v6, v7

    const v7, 0x78bfa871

    goto/16 :goto_0

    :sswitch_10
    sget v5, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v5, :cond_a

    :cond_9
    :goto_4
    const-string v5, "\u06e8\u1a7b"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x27b

    const v7, -0x7e77cd1d

    xor-int/2addr v6, v7

    const v7, -0x47d4b62e

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u1a77\u06d6"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x21

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x421

    const v7, 0x6f65a073

    xor-int/2addr v6, v7

    const v7, -0x11b18ca5

    goto/16 :goto_0

    .line 210
    :sswitch_11
    sget v5, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v5, :cond_b

    goto :goto_5

    :cond_b
    const-string v5, "\u073f\u0733"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x31

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3011

    const v7, -0x24e90b4b

    xor-int/2addr v6, v7

    const v7, 0x75693e86

    goto/16 :goto_0

    .line 44
    :sswitch_12
    sget v5, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v5, :cond_d

    :cond_c
    :goto_5
    const-string v5, "\u06d8\u1a77"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3093

    const v7, 0x4b163cc2    # 9845954.0f

    xor-int/2addr v6, v7

    const v7, 0x5973f1b5

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u06ec\u06d7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x27

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x55ef

    const v7, -0x70b79c3d

    xor-int/2addr v6, v7

    const v7, 0x5ffba1d4

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b5877b8 -> :sswitch_3
        -0x75ac41bf -> :sswitch_8
        -0x6abbfa0c -> :sswitch_5
        -0x60e79329 -> :sswitch_b
        -0x52953d67 -> :sswitch_c
        -0x46cc8404 -> :sswitch_10
        -0x37633bf4 -> :sswitch_b
        -0x375f0bd4 -> :sswitch_0
        -0x278e8df2 -> :sswitch_12
        -0x249ef277 -> :sswitch_d
        -0x244311b2 -> :sswitch_1
        -0x1d9aa2fc -> :sswitch_2
        -0x1a5f4bc0 -> :sswitch_e
        -0x194d01ac -> :sswitch_7
        -0x7f87d5c -> :sswitch_11
        -0x5cd74c2 -> :sswitch_c
        0x2e0df4f -> :sswitch_4
        0x31bf0ab -> :sswitch_f
        0x96717c7 -> :sswitch_e
        0x1c391bf8 -> :sswitch_a
        0x251932f1 -> :sswitch_6
        0x25347c82 -> :sswitch_2
        0x267a5498 -> :sswitch_5
        0x312a77b5 -> :sswitch_f
        0x32dcbb4b -> :sswitch_0
        0x3a0a08b4 -> :sswitch_8
        0x4a93f9c9 -> :sswitch_a
        0x4ed25f42 -> :sswitch_d
        0x50dadf3f -> :sswitch_4
        0x568d0af4 -> :sswitch_7
        0x6035a8ec -> :sswitch_3
        0x64b4aa30 -> :sswitch_12
        0x67814439 -> :sswitch_10
        0x6ccce1e5 -> :sswitch_1
        0x6f9a2d02 -> :sswitch_11
        0x7148a7fe -> :sswitch_6
        0x7660da4f -> :sswitch_9
        0x7b5f2d93 -> :sswitch_9
    .end sparse-switch
.end method

.method public final ۙ(Ll/ᩴܳ᩹;)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x58ed39d1

    sget v4, Ll/ۘܶ;->ܶ᩵ۢ:I

    sget v5, Ll/֡ܳ;->֨ᩳۢ:I

    const-string v6, "\u1a78\u073d"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x76c9

    const v8, -0xd3abb8f

    xor-int/2addr v7, v8

    const v8, 0x65c785e2

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x5dcf

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    sget v6, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v6, :cond_6

    goto/16 :goto_2

    .line 299
    :sswitch_0
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v6

    if-lez v6, :cond_8

    goto :goto_1

    .line 151
    :sswitch_1
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v6

    if-nez v6, :cond_b

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    sget v6, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v6, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v6, "\u06e8\u0730"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x7d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3c4d

    const v8, 0x637c8b48

    xor-int/2addr v7, v8

    const v8, -0x50a41ec8    # -1.9997948E-10f

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    goto/16 :goto_3

    .line 317
    :sswitch_4
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    return-void

    .line 411
    :sswitch_5
    invoke-virtual {p1, v2}, Ll/ᩴܳ᩹;->᩸(I)V

    .line 412
    invoke-virtual {p1}, Ll/ᩴܳ᩹;->᩷()V

    return-void

    .line 411
    :sswitch_6
    invoke-static {v1}, Ll/ۗܶ;->ۚۢۨ(F)I

    move-result v2

    .line 227
    sget v6, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v6, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v6, "\u1a75\u06e1"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x27

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6eaf

    const v8, 0x4bac887d    # 2.2614266E7f

    xor-int/2addr v7, v8

    const v8, -0x3ef5bed

    goto :goto_0

    .line 410
    :sswitch_7
    invoke-virtual {p1, v0}, Ll/ᩴܳ᩹;->ۙ(I)V

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    move-result v6

    if-ltz v6, :cond_2

    goto :goto_2

    :cond_2
    const-string v6, "\u1a78\u06d7"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x196f

    const v8, 0x1d69c683

    xor-int/2addr v7, v8

    const v8, 0x2918bcba

    goto/16 :goto_0

    :sswitch_8
    const/high16 v0, 0x41400000    # 12.0f

    invoke-static {v0}, Ll/ۗܶ;->ۚۢۨ(F)I

    move-result v0

    .line 383
    sget v6, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v6, :cond_3

    goto :goto_2

    :cond_3
    const-string v6, "\u1a78\u06e7"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x2619

    const v8, -0x4a6bd41f

    xor-int/2addr v7, v8

    const v8, 0x7a42758c

    goto/16 :goto_0

    .line 409
    :sswitch_9
    invoke-super {p0, p1}, Ll/᩹ۘ᩻;->ۙ(Ll/ᩴܳ᩹;)V

    sget v6, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v6, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v6, "\u06e0\u06eb"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x6b93

    const v8, 0x25764f6b

    xor-int/2addr v7, v8

    const v8, -0x71a13832

    goto/16 :goto_0

    .line 318
    :sswitch_a
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_3

    :cond_5
    const-string v6, "\u06d7\u06e0"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1715

    const v8, 0x41fc9aa4

    xor-int/2addr v7, v8

    const v8, 0x37ac00ab

    goto/16 :goto_0

    :goto_2
    const-string v6, "\u06ec\u06e8"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x1d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5b27

    const v8, -0x7ac6ab9f

    xor-int/2addr v7, v8

    const v8, 0x8e711a7

    goto/16 :goto_0

    :cond_6
    const-string v6, "\u05a1\u1a76"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x55

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3027

    const v8, -0x57768f3f

    xor-int/2addr v7, v8

    const v8, -0x4a372cb5

    goto/16 :goto_0

    .line 90
    :sswitch_b
    sget v6, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v6, :cond_7

    :goto_3
    const-string v6, "\u06da\u073a"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x303d

    const v8, -0x6b2248f8

    xor-int/2addr v7, v8

    const v8, 0x24cb59fc

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u1a79\u1a75"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0xd

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x7487

    const v8, 0xdc612aa

    xor-int/2addr v7, v8

    const v8, -0x23bdd65a

    goto/16 :goto_0

    :sswitch_c
    sget v6, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v6, :cond_9

    :cond_8
    const-string v6, "\u06e7\u06d7"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0xf

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0xaff

    const v8, -0x1da8b31a

    xor-int/2addr v7, v8

    const v8, -0x17f54e9f

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u06e8\u0736"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x67

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x6389

    const v8, -0x10ec9b66

    xor-int/2addr v7, v8

    const v8, -0x3d47ffd

    goto/16 :goto_0

    .line 85
    :sswitch_d
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v6

    if-nez v6, :cond_a

    goto :goto_4

    :cond_a
    const-string v6, "\u06d8\u1a76"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x57f7

    const v8, -0x89fa83b

    xor-int/2addr v7, v8

    const v8, 0x7ac3d7a2

    goto/16 :goto_0

    :sswitch_e
    sget v6, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v6, :cond_c

    :cond_b
    :goto_4
    const-string v6, "\u0736\u06df"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x39

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3c31

    const v8, -0x5df48cca

    xor-int/2addr v7, v8

    const v8, 0x3a993bb9

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u1a75\u0736"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x29

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x27b

    const v8, 0x5e2ed177

    xor-int/2addr v7, v8

    const v8, 0x55b9ea6c

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fe8959f -> :sswitch_1
        -0x7ee41895 -> :sswitch_9
        -0x7037fdde -> :sswitch_e
        -0x6d83408b -> :sswitch_4
        -0x6d616767 -> :sswitch_b
        -0x5a576908 -> :sswitch_0
        -0x5626f908 -> :sswitch_5
        -0x33c15810 -> :sswitch_4
        -0x338bfbeb -> :sswitch_c
        -0x2a78f402 -> :sswitch_5
        -0x23aa145e -> :sswitch_d
        -0x22a61b89 -> :sswitch_9
        -0x125cc6c6 -> :sswitch_2
        -0x103799ca -> :sswitch_b
        -0x2f51a02 -> :sswitch_2
        0xeeb2735 -> :sswitch_8
        0x22dc47c8 -> :sswitch_3
        0x34ac8bc8 -> :sswitch_7
        0x35220253 -> :sswitch_a
        0x38e926ec -> :sswitch_8
        0x3e6ac0fd -> :sswitch_6
        0x44e81acc -> :sswitch_6
        0x45b038c0 -> :sswitch_0
        0x57cb41f7 -> :sswitch_c
        0x5ccc8cf6 -> :sswitch_1
        0x6ad9f5dd -> :sswitch_d
        0x6d3009fb -> :sswitch_7
        0x72b5f93f -> :sswitch_e
        0x738570c5 -> :sswitch_3
        0x7d9132d4 -> :sswitch_a
    .end sparse-switch
.end method
