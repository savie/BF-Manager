.class public final synthetic Ll/᩶᩹ۘ;
.super Ljava/lang/Object;
.source "GA31"

# interfaces
.implements Ljava/lang/Runnable;


# virtual methods
.method public final run()V
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, 0x599af147

    sget v6, Ll/ۗ۬;->ۤᩴ᩻:I

    sget v7, Ll/֫᩺;->᩺۟ۘ:I

    const-string v8, "\u073f\u1a76"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x3f35

    const v10, 0x4ab57440    # 5945888.0f

    xor-int/2addr v9, v10

    const v10, 0x2ecced3c

    :goto_0
    xor-int/2addr v8, v10

    xor-int/2addr v5, v7

    mul-int/lit16 v5, v5, 0x7e49

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    sget v8, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v8, :cond_6

    goto/16 :goto_3

    .line 63
    :sswitch_0
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    sget v8, Ll/֫ۚ;->ܽ۠᩹:I

    if-gez v8, :cond_c

    goto/16 :goto_5

    :sswitch_1
    sget-boolean v8, Ll/֫ܶ;->ۧ᩵۫:Z

    if-eqz v8, :cond_8

    goto :goto_1

    .line 27
    :sswitch_2
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    sget v8, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v8, :cond_a

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    :goto_1
    const-string v8, "\u06e7\u06da"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x29

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x510b

    const v10, 0x645ec134

    xor-int/2addr v9, v10

    const v10, -0x809d507

    goto :goto_0

    .line 41
    :sswitch_4
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    return-void

    .line 77
    :sswitch_5
    invoke-virtual {v4}, Ll/ۨ᩹ۘ;->۠()I

    move-result v8

    invoke-virtual {v3}, Ll/ᩴ֨ۘ;->۠()I

    move-result v9

    if-lt v8, v9, :cond_f

    goto :goto_2

    .line 78
    :sswitch_6
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    const/4 v2, 0x1

    goto/16 :goto_7

    .line 83
    :sswitch_7
    sget-object v8, Ll/ܽ᩹ۘ;->ۙ:Ljava/util/List;

    invoke-static {v8}, Ll/ܽ᩹ۘ;->ۙ(Ljava/util/List;)V

    goto/16 :goto_8

    .line 76
    :sswitch_8
    invoke-static {v3}, Ll/۟;->ܰܿۚ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ܿۚۘ;->ۨ(Ljava/lang/String;)Ll/ۨ᩹ۘ;

    move-result-object v4

    if-eqz v4, :cond_0

    const-string v8, "\u1a75\u06d6"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x65

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x4bb1

    const v10, -0x7a0adc8b

    xor-int/2addr v9, v10

    const v10, 0x7e662394

    goto :goto_0

    :cond_0
    :goto_2
    const-string v8, "\u0733\u06d9"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x696f

    const v10, -0x2cb4f22a

    xor-int/2addr v9, v10

    const v10, -0x7d3504c1

    goto/16 :goto_0

    :sswitch_9
    sget v8, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v8, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v8, "\u1a76\u06d6"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x2f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x68a3

    const v10, 0x4c1d4aad    # 4.1233076E7f

    xor-int/2addr v9, v10

    const v10, 0x38b0326e

    goto/16 :goto_0

    .line 79
    :sswitch_a
    sget v8, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v8, :cond_2

    goto :goto_3

    :cond_2
    const-string v8, "\u0736\u06e7"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x15

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x14ab

    const v10, -0x281f6a31

    xor-int/2addr v9, v10

    const v10, -0x5a111ca4

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v8, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v8, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v8, "\u06ec\u06da"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x7d

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x12e9

    const v10, 0x50f4088e

    xor-int/2addr v9, v10

    const v10, -0x4db3d5a1

    goto/16 :goto_0

    :sswitch_c
    sget v8, Ll/֨ۧ;->֫۠֡:I

    if-gtz v8, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v8, "\u06d7\u06da"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x247b

    const v10, 0x5b691569

    xor-int/2addr v9, v10

    const v10, 0x40967476

    goto/16 :goto_0

    :sswitch_d
    sget v8, Ll/ۗ;->֨۬ۖ:I

    if-ltz v8, :cond_5

    goto :goto_4

    :cond_5
    const-string v8, "\u06eb\u06eb"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x23bb

    const v10, -0x4673563d

    xor-int/2addr v9, v10

    const v10, -0x26408ec

    goto/16 :goto_0

    :goto_3
    const-string v8, "\u1a74\u06e1"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x6c7f

    const v10, 0xcdb5b36

    xor-int/2addr v9, v10

    const v10, -0x39c5b434

    goto/16 :goto_0

    :cond_6
    const-string v8, "\u06e7\u1a73"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x9

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x6f59

    const v10, -0x6d6a696f

    xor-int/2addr v9, v10

    const v10, 0x488e5e74    # 291571.62f

    goto/16 :goto_0

    .line 57
    :sswitch_e
    sget v8, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v8, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v8, "\u0736\u06da"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x63

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x53fb

    const v10, -0x4353f649    # -0.021000726f

    xor-int/2addr v9, v10

    const v10, -0x2aa3f532

    goto/16 :goto_0

    :sswitch_f
    sget v8, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v8, :cond_9

    :cond_8
    :goto_4
    const-string v8, "\u06e7\u06e0"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x37b9

    const v10, 0x3087695b

    xor-int/2addr v9, v10

    const v10, 0x68a4f408

    goto/16 :goto_0

    :cond_9
    const-string v8, "\u06db\u1a77"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x77

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0xe85

    const v10, -0x5127c375

    xor-int/2addr v9, v10

    const v10, 0xb891e03

    goto/16 :goto_0

    .line 20
    :sswitch_10
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v8

    if-eqz v8, :cond_b

    :cond_a
    :goto_5
    const-string v8, "\u1a78\u073d"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x3

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0xe4d

    const v10, -0x98d058e

    xor-int/2addr v9, v10

    const v10, -0x5f0ea37c

    goto/16 :goto_0

    :cond_b
    const-string v8, "\u1a75\u05ab"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x35

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x2bf3

    const v10, -0x5fb95135

    xor-int/2addr v9, v10

    const v10, -0x63b2c5e0

    goto/16 :goto_0

    .line 75
    :sswitch_11
    invoke-static {v1}, Ll/֡۠;->ۗۛۖ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴ֨ۘ;

    .line 1
    sget v8, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v8, :cond_d

    :cond_c
    :goto_6
    const-string v8, "\u0730\u05a1"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x2c11

    const v10, 0x3139cf85

    xor-int/2addr v9, v10

    const v10, -0x80f1965

    goto/16 :goto_0

    :cond_d
    const-string v8, "\u06e7\u06d9"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x78bd

    const v10, 0xd0c51bd

    xor-int/2addr v9, v10

    const v10, 0x3a1b772e

    goto/16 :goto_0

    :sswitch_12
    if-eqz v2, :cond_10

    const-string v8, "\u0736\u073d"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x6d

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x26ab

    const v10, 0x3f086f8b

    xor-int/2addr v9, v10

    const v10, -0x10b1d46a

    goto/16 :goto_0

    :sswitch_13
    return-void

    .line 74
    :sswitch_14
    invoke-static {v1}, Ll/֫ۘ;->ۡۘᩴ(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_e

    const-string v8, "\u073a\u06e7"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x15

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x7b1d

    const v10, -0x7a533b6

    xor-int/2addr v9, v10

    const v10, -0xb9a970c

    goto/16 :goto_0

    :cond_e
    const-string v8, "\u1a78\u0730"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x69

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x7b5

    const v10, 0x7f1c6e9b

    xor-int/2addr v9, v10

    const v10, -0x44089c6

    goto/16 :goto_0

    :sswitch_15
    invoke-static {v0}, Ll/ۗ۬;->ۜܿ᩹(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :cond_f
    :goto_7
    const-string v8, "\u06d6\u05a8"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x65

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x45b1

    const v10, 0x699c1cec

    xor-int/2addr v9, v10

    const v10, 0x762677cf

    goto/16 :goto_0

    .line 70
    :sswitch_16
    sget-object v0, Ll/ܽ᩹ۘ;->ۙ:Ljava/util/List;

    if-nez v0, :cond_11

    :cond_10
    :goto_8
    const-string v8, "\u06dc\u06db"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x7f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x25a5

    const v10, 0x7daee835

    xor-int/2addr v9, v10

    const v10, 0x5b8c042a

    goto/16 :goto_0

    :cond_11
    const-string v8, "\u06ec\u1a74"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x5

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x19f9

    const v10, -0x4d07ff2f

    xor-int/2addr v9, v10

    const v10, 0x76140f5a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f947b1f -> :sswitch_1
        -0x7031fc64 -> :sswitch_16
        -0x6b56fc5a -> :sswitch_5
        -0x69464438 -> :sswitch_9
        -0x66911c70 -> :sswitch_15
        -0x5ecafcd9 -> :sswitch_f
        -0x429ed3ca -> :sswitch_4
        -0x3ea42e80 -> :sswitch_11
        -0x3659c29a -> :sswitch_2
        -0x3507372a -> :sswitch_7
        -0x2010e655 -> :sswitch_15
        -0x1179bee8 -> :sswitch_8
        -0xfc302aa -> :sswitch_14
        -0xd5050fe -> :sswitch_6
        -0xc0a56e4 -> :sswitch_f
        0x207b93e -> :sswitch_2
        0x39be462 -> :sswitch_7
        0xcc7e053 -> :sswitch_12
        0xce7487c -> :sswitch_10
        0xd44d96a -> :sswitch_a
        0xe369f5e -> :sswitch_13
        0x119a7bf9 -> :sswitch_1
        0x14004845 -> :sswitch_16
        0x140e45c4 -> :sswitch_13
        0x2002008b -> :sswitch_4
        0x2237eb71 -> :sswitch_0
        0x23c8088e -> :sswitch_6
        0x23ffe110 -> :sswitch_e
        0x2626cd82 -> :sswitch_12
        0x2c3c934e -> :sswitch_a
        0x34c4d457 -> :sswitch_11
        0x370d289e -> :sswitch_b
        0x3a6c5eac -> :sswitch_b
        0x43fea8f0 -> :sswitch_3
        0x4985ec29 -> :sswitch_8
        0x4a415f92 -> :sswitch_d
        0x4d802df7 -> :sswitch_10
        0x5124b766 -> :sswitch_5
        0x52d138b4 -> :sswitch_c
        0x5b3deb48 -> :sswitch_14
        0x5c993fc3 -> :sswitch_c
        0x5fd8e4e3 -> :sswitch_e
        0x673b6496 -> :sswitch_0
        0x6a3a0570 -> :sswitch_9
        0x7b6530b1 -> :sswitch_3
        0x7ce11ce3 -> :sswitch_d
    .end sparse-switch
.end method
