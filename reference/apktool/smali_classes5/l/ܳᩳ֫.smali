.class public final synthetic Ll/ܳᩳ֫;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/util/function/ToLongFunction;


# virtual methods
.method public final applyAsLong(Ljava/lang/Object;)J
    .locals 7

    const/4 v0, 0x0

    const v1, 0x7c353c2e

    sget v2, Ll/ۘ֡;->᩹ܶ۬:I

    sget v3, Ll/֨ۢ;->۬ܿܺ:I

    const-string v4, "\u1a7a\u06e7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x2f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4377

    const v6, -0x1abf6001

    xor-int/2addr v5, v6

    const v6, -0x8874de5

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x7db9

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 481
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    sget-boolean v4, Ll/֡ᩴ;->۬֡᩺:Z

    if-nez v4, :cond_b

    goto/16 :goto_2

    .line 1579
    :sswitch_0
    sget v4, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v4, :cond_9

    goto/16 :goto_4

    .line 965
    :sswitch_1
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v4

    if-lez v4, :cond_2

    goto/16 :goto_2

    .line 381
    :sswitch_2
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    goto/16 :goto_2

    .line 431
    :sswitch_3
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    const-wide/16 v0, 0x0

    return-wide v0

    .line 2369
    :sswitch_4
    iget-object p1, v0, Ll/᩵ۢ֫;->᩻:Landroid/content/pm/PackageInfo;

    .line 2347
    iget-wide v0, p1, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    neg-long v0, v0

    return-wide v0

    .line 4
    :sswitch_5
    sget v4, Ll/۟ۢ֫;->ۡ᩷:I

    .line 871
    sget v4, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v4, :cond_0

    const-string v4, "\u0730\u073f"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x159

    const v6, 0x3d2cee90

    xor-int/2addr v5, v6

    const v6, 0x6c5eafe4

    goto :goto_0

    :cond_0
    const-string v4, "\u06dc\u1a7a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x3b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5d4b

    const v6, -0x18488a96

    xor-int/2addr v5, v6

    const v6, -0x2fe286a3

    goto :goto_0

    .line 2
    :sswitch_6
    move-object v0, p1

    check-cast v0, Ll/᩵ۢ֫;

    .line 1628
    sget v4, Ll/ۧ;->ۨۗܰ:I

    if-ltz v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v4, "\u0733\u06df"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0xb

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x467b

    const v6, 0x6a29400d

    xor-int/2addr v5, v6

    const v6, 0x2fe11f65

    goto/16 :goto_0

    .line 622
    :sswitch_7
    sget v4, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v4, :cond_3

    :cond_2
    :goto_1
    const-string v4, "\u05a8\u1a76"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x86d

    const v6, -0x1deae879

    xor-int/2addr v5, v6

    const v6, 0x1e307186

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06dc\u06d6"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7283

    const v6, 0x12c9b503

    xor-int/2addr v5, v6

    const v6, -0x241ad1c3

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u06d6\u1a79"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2a11

    const v6, -0x2c7c54da

    xor-int/2addr v5, v6

    const v6, 0x2bbee209

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v4, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v4, "\u0733\u1a74"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x3f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2cbb

    const v6, -0x1c1607e2

    xor-int/2addr v5, v6

    const v6, 0x453e8046

    goto/16 :goto_0

    .line 532
    :sswitch_a
    sget v4, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u06db\u1a77"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x55e5

    const v6, 0x1cc44762

    xor-int/2addr v5, v6

    const v6, -0x64d78613

    goto/16 :goto_0

    .line 2239
    :sswitch_b
    sget v4, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v4, :cond_7

    goto :goto_2

    :cond_7
    const-string v4, "\u06d6\u06dc"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0xf

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xfc3

    const v6, -0x1a53a21b

    xor-int/2addr v5, v6

    const v6, 0xcf357ac

    goto/16 :goto_0

    .line 281
    :sswitch_c
    sget v4, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v4, :cond_8

    :goto_2
    const-string v4, "\u1a7b\u05a8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x41

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7bbf

    const v6, -0x2243ea78

    xor-int/2addr v5, v6

    const v6, -0x4e28da38

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e4\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x7d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6e6b

    const v6, -0x1928b5d5

    xor-int/2addr v5, v6

    const v6, -0x6531d9e0

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v4

    if-nez v4, :cond_a

    :cond_9
    :goto_3
    const-string v4, "\u06df\u1a75"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2af1

    const v6, 0x2bf1d672

    xor-int/2addr v5, v6

    const v6, 0x7c919c2a

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u073f\u06df"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x324d

    const v6, -0x77f91f87

    xor-int/2addr v5, v6

    const v6, -0x7f09e735

    goto/16 :goto_0

    .line 574
    :sswitch_e
    sget v4, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u1a79\u1a7a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x73

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x28cf

    const v6, 0x4434ca79

    xor-int/2addr v5, v6

    const v6, 0x1f92edc3

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06ec\u06db"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6435

    const v6, -0x6c112b1d

    xor-int/2addr v5, v6

    const v6, 0x579c388c

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x75ce01f5 -> :sswitch_b
        -0x73054cf5 -> :sswitch_d
        -0x70188438 -> :sswitch_1
        -0x65fdef29 -> :sswitch_4
        -0x56915983 -> :sswitch_c
        -0x4d4f31d9 -> :sswitch_9
        -0x419bb2ec -> :sswitch_e
        -0x3aa91160 -> :sswitch_2
        -0x39e55ab3 -> :sswitch_d
        -0x33a3ce9a -> :sswitch_6
        -0x2f51f1d7 -> :sswitch_7
        -0x280e9ee2 -> :sswitch_a
        -0x2157a14b -> :sswitch_3
        -0xf27a57e -> :sswitch_7
        -0xd82538f -> :sswitch_6
        0x163e4e4 -> :sswitch_0
        0x15896e8f -> :sswitch_a
        0x2a48941a -> :sswitch_b
        0x3e99f9be -> :sswitch_c
        0x40e6a4be -> :sswitch_e
        0x42bac611 -> :sswitch_5
        0x44adae0f -> :sswitch_8
        0x45c610dd -> :sswitch_0
        0x464ed201 -> :sswitch_4
        0x4b80541c -> :sswitch_1
        0x4be92df7 -> :sswitch_2
        0x50cb242f -> :sswitch_9
        0x57932daa -> :sswitch_5
        0x6051b42a -> :sswitch_8
        0x74bbd216 -> :sswitch_3
    .end sparse-switch
.end method
