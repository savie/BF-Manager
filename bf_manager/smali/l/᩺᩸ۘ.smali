.class public final synthetic Ll/᩺᩸ۘ;
.super Ljava/lang/Object;
.source "JAJI"

# interfaces
.implements Ljava/util/function/Function;


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۘ᩻ᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const v1, 0x13d73913

    sget v2, Ll/ۖ᩸;->ۨܽ۬:I

    sget v3, Ll/ۗ᩺;->ۢۜ᩶:I

    const-string v4, "\u06eb\u0730"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x7f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7661

    const v6, 0x3066ee6a

    xor-int/2addr v5, v6

    const v6, -0x5463cab4

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0xca9

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    const/4 p1, 0x0

    return-object p1

    :sswitch_0
    sget v4, Ll/ۗᩳ;->ۚۤ֡:I

    if-gez v4, :cond_a

    goto/16 :goto_3

    .line 2
    :sswitch_1
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v4

    if-nez v4, :cond_4

    goto :goto_1

    .line 4
    :sswitch_2
    sget v4, Ll/֨ۢ;->ۢ۬ۧ:I

    if-gez v4, :cond_7

    goto :goto_1

    .line 0
    :sswitch_3
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    :goto_1
    const-string v4, "\u0733\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x15

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7a1

    const v6, -0x1406d096

    xor-int/2addr v5, v6

    const v6, 0x75440761

    goto :goto_0

    :sswitch_4
    sget p1, Ll/᩶᩸ۘ;->ᩳܰ:I

    new-instance p1, Ll/ۤ᩸ۘ;

    invoke-direct {p1, v0}, Ll/ۤ᩸ۘ;-><init>(Ljava/lang/String;)V

    return-object p1

    :sswitch_5
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v4

    if-gtz v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v4, "\u06df\u06e2"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x14b7

    const v6, 0x5a0baeca

    xor-int/2addr v5, v6

    const v6, -0x7e1e7319

    goto :goto_0

    :sswitch_6
    sget-boolean v4, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v4, :cond_1

    goto :goto_2

    :cond_1
    const-string v4, "\u05ab\u06da"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x73

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x367f

    const v6, -0xb7f9dcd

    xor-int/2addr v5, v6

    const v6, 0x4d4e91e8    # 2.1660429E8f

    goto/16 :goto_0

    :sswitch_7
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v4

    if-nez v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u06e2\u06e1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x74cf

    const v6, 0x4b5d0105    # 1.4483717E7f

    xor-int/2addr v5, v6

    const v6, 0x724951b

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v4, :cond_3

    goto :goto_3

    :cond_3
    const-string v4, "\u06d7\u0730"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x3b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7ed9

    const v6, -0x4e4dac1b

    xor-int/2addr v5, v6

    const v6, -0x4c198b9

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v4, :cond_5

    :cond_4
    :goto_2
    const-string v4, "\u06eb\u1a76"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x7f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7bad

    const v6, -0x1e988de8

    xor-int/2addr v5, v6

    const v6, 0x7b607f10

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06e2\u06d7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x67

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xa49

    const v6, 0x479a9d1d

    xor-int/2addr v5, v6

    const v6, -0x463dc9ef

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v4, :cond_6

    goto :goto_3

    :cond_6
    const-string v4, "\u06e8\u06e8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x27f7

    const v6, 0x614e3167

    xor-int/2addr v5, v6

    const v6, 0x3fe56391

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v4, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v4, :cond_8

    :cond_7
    :goto_3
    const-string v4, "\u1a76\u06e1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2c7

    const v6, -0x71c0c865

    xor-int/2addr v5, v6

    const v6, -0x2fde325e

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06d8\u06d6"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x16cb

    const v6, -0x50d37a06

    xor-int/2addr v5, v6

    const v6, -0x395f9867

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/֫;->ܶܺ᩻:I

    if-ltz v4, :cond_9

    goto :goto_4

    :cond_9
    const-string v4, "\u1a79\u0730"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3097

    const v6, 0x417c2f21

    xor-int/2addr v5, v6

    const v6, 0x10833b1f

    goto/16 :goto_0

    .line 1
    :sswitch_d
    sget v4, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v4, :cond_b

    :cond_a
    const-string v4, "\u06e8\u06d6"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5885

    const v6, -0x2a32a4c2

    xor-int/2addr v5, v6

    const v6, 0x9a27515

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u05a1\u1a79"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6fc5

    const v6, -0x1e1b192d

    xor-int/2addr v5, v6

    const v6, -0x6fa91b1

    goto/16 :goto_0

    .line 3
    :sswitch_e
    sget v4, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v4, :cond_c

    :goto_4
    const-string v4, "\u1a79\u1a78"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7d95

    const v6, 0x5095b5e

    xor-int/2addr v5, v6

    const v6, 0x5cc540c8

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a77\u1a74"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x27

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2119

    const v6, -0x7760050e

    xor-int/2addr v5, v6

    const v6, -0x23f41482

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f859b06 -> :sswitch_2
        -0x7ab649b0 -> :sswitch_1
        -0x703d356a -> :sswitch_3
        -0x6d5253a1 -> :sswitch_3
        -0x638c59e1 -> :sswitch_8
        -0x60868e78 -> :sswitch_e
        -0x5c266e48 -> :sswitch_5
        -0x591a6558 -> :sswitch_c
        -0x56134e08 -> :sswitch_9
        -0x2453ebca -> :sswitch_e
        -0x23b3bcd3 -> :sswitch_1
        -0x1cf506d0 -> :sswitch_c
        -0x1252bbd8 -> :sswitch_a
        -0x1234df2c -> :sswitch_6
        -0x7d890e8 -> :sswitch_0
        -0x4b06f48 -> :sswitch_b
        0x1665aa5 -> :sswitch_7
        0x32633c8 -> :sswitch_0
        0x134e57b1 -> :sswitch_a
        0x141a2de4 -> :sswitch_2
        0x2b023043 -> :sswitch_d
        0x38e95de2 -> :sswitch_4
        0x4a833dcc -> :sswitch_7
        0x4b3816d3 -> :sswitch_d
        0x4f603cd7 -> :sswitch_b
        0x540fbdd2 -> :sswitch_4
        0x54fa2b28 -> :sswitch_8
        0x58c4753b -> :sswitch_6
        0x6005828e -> :sswitch_9
        0x6faa6ff1 -> :sswitch_5
    .end sparse-switch
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۘ᩻ᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
