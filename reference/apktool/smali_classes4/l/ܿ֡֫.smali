.class public final synthetic Ll/ܿ֡֫;
.super Ljava/lang/Object;
.source "K185"


# direct methods
.method public static ۙ(Ll/۟֡֫;)Ll/۟֡֫;
    .locals 6

    const v0, 0x420f059

    sget v1, Ll/ۖۙ;->ۤۧۤ:I

    sget v2, Ll/ۖᩳ;->᩹ۧܳ:I

    const-string v3, "\u1a73\u073a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x39d9

    const v5, 0x6f8872e3

    xor-int/2addr v4, v5

    const v5, -0x4bb42bea

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x70b1

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 9
    new-instance p0, Ll/۠ܶ᩸;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0

    :sswitch_0
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    sget v3, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v3, :cond_6

    goto :goto_1

    .line 3
    :sswitch_1
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v3

    if-gtz v3, :cond_a

    goto :goto_3

    .line 8
    :sswitch_2
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    sget v3, Ll/ۗ֨;->᩹ۜۡ:I

    if-gez v3, :cond_4

    goto :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    goto :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    const/4 p0, 0x0

    return-object p0

    .line 11
    :sswitch_5
    new-instance v3, Ll/֡֡֫;

    .line 1
    sget v4, Ll/ۧ;->ۨۗܰ:I

    if-ltz v4, :cond_0

    goto :goto_2

    .line 9
    :cond_0
    sget v4, Ll/۬;->᩸ۜ᩹:I

    if-eqz v4, :cond_1

    goto/16 :goto_4

    .line 8
    :cond_1
    sget v4, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v4, :cond_2

    goto :goto_2

    .line 1
    :cond_2
    sget v4, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v4, :cond_3

    goto/16 :goto_4

    .line 8
    :cond_3
    sget v4, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v4, :cond_5

    :cond_4
    :goto_1
    const-string v3, "\u1a78\u0733"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x501b

    const v5, 0x4e7d39de

    xor-int/2addr v4, v5

    const v5, -0x2b49f941

    goto :goto_0

    .line 7
    :cond_5
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v4

    if-eqz v4, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u1a7a\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x21

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4787

    const v5, 0x71a2db74

    xor-int/2addr v4, v5

    const v5, 0x6e4aa3c9

    goto :goto_0

    :cond_7
    sget v4, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v4, :cond_8

    :goto_3
    const-string v3, "\u06ec\u073f"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x7b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x24e9

    const v5, -0x64d48004

    xor-int/2addr v4, v5

    const v5, 0x2e49e41f

    goto/16 :goto_0

    :cond_8
    sget v4, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v4, :cond_9

    goto :goto_4

    .line 4
    :cond_9
    sget v4, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v4, :cond_b

    :cond_a
    const-string v3, "\u1a78\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5a8b

    const v5, -0x111c0b73

    xor-int/2addr v4, v5

    const v5, -0x28d1de8c

    goto/16 :goto_0

    .line 8
    :cond_b
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v4

    if-nez v4, :cond_c

    :goto_4
    const-string v3, "\u0730\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x19

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5ab

    const v5, 0x787f34ac

    xor-int/2addr v4, v5

    const v5, -0x7fb40751

    goto/16 :goto_0

    .line 11
    :cond_c
    invoke-direct {v3, p0}, Ll/֡֡֫;-><init>(Ll/۟֡֫;)V

    return-object v3

    :sswitch_6
    if-nez p0, :cond_d

    const-string v3, "\u06e4\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x27

    xor-int v4, v3, v2

    mul-int/lit8 v4, v4, 0x41

    const v5, 0x682452b4

    xor-int/2addr v4, v5

    const v5, 0x6a08a3f3

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u0730\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6eb9

    const v5, -0x3bbddbf1

    xor-int/2addr v4, v5

    const v5, 0x14068a68

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6403772c -> :sswitch_3
        -0x41d8f17d -> :sswitch_0
        -0x1d221df7 -> :sswitch_6
        -0x1a01300b -> :sswitch_1
        -0x613f24f -> :sswitch_3
        -0x4fea51f -> :sswitch_6
        0x6687575 -> :sswitch_1
        0xf8e35e3 -> :sswitch_5
        0x2c16dbfb -> :sswitch_0
        0x3c30a601 -> :sswitch_2
        0x408c8522 -> :sswitch_4
        0x6fb5766b -> :sswitch_2
        0x700a6d55 -> :sswitch_5
        0x73471a95 -> :sswitch_4
    .end sparse-switch
.end method
