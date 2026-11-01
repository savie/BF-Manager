.class public final synthetic Ll/ܺᩳۘ;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/util/function/ToLongFunction;


# virtual methods
.method public final applyAsLong(Ljava/lang/Object;)J
    .locals 7

    const/4 v0, 0x0

    const v1, -0x50d5bca4

    sget v2, Ll/ۗ۬;->ۤᩴ᩻:I

    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    const-string v4, "\u06d7\u1a79"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3249

    const v6, -0x607d455a

    xor-int/2addr v5, v6

    const v6, 0x23f42279

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x6d3d

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 2
    move-object v0, p1

    check-cast v0, Ll/ܽᩴۘ;

    sget v4, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v4, :cond_1

    goto/16 :goto_1

    .line 2184
    :sswitch_0
    sget v4, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v4, :cond_b

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    sget v4, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v4, :cond_3

    goto/16 :goto_3

    .line 69
    :sswitch_2
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    sget v4, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v4, :cond_9

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    goto/16 :goto_2

    .line 709
    :sswitch_4
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    const-wide/16 v0, 0x0

    return-wide v0

    .line 2283
    :sswitch_5
    iget-object p1, v0, Ll/ܽᩴۘ;->᩺:Landroid/content/pm/PackageInfo;

    iget-wide v0, p1, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    neg-long v0, v0

    return-wide v0

    .line 4
    :sswitch_6
    sget v4, Ll/ۙ۠ۘ;->᩻ܰ:I

    sget v4, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v4, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v4, "\u06e8\u06da"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x3b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3695

    const v6, -0x1ea193aa

    xor-int/2addr v5, v6

    const v6, 0x307fc0f2

    goto :goto_0

    :cond_1
    const-string v4, "\u06eb\u1a7b"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x22e9

    const v6, 0x3613ba10

    xor-int/2addr v5, v6

    const v6, -0x4ef95712

    goto :goto_0

    .line 1080
    :sswitch_7
    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    const-string v4, "\u05a8\u06d8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x35

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x62b3

    const v6, -0x620cdbbe

    xor-int/2addr v5, v6

    const v6, -0x4c27fdb2

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v4, :cond_4

    :cond_3
    const-string v4, "\u1a76\u06df"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7c1d

    const v6, -0x7e672fdb

    xor-int/2addr v5, v6

    const v6, -0x1479d266

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06d9\u1a75"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x4b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7391

    const v6, -0x1c7b1fee

    xor-int/2addr v5, v6

    const v6, -0x4002f69d

    goto/16 :goto_0

    .line 792
    :sswitch_9
    sget v4, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v4, :cond_5

    :goto_1
    const-string v4, "\u05ab\u06da"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x13

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6505

    const v6, 0x7dc5d2e3

    xor-int/2addr v5, v6

    const v6, 0x66727c8f

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06e8\u0736"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x5f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x24f9

    const v6, 0x73a5e2dd

    xor-int/2addr v5, v6

    const v6, 0x39a3b8ea

    goto/16 :goto_0

    .line 2055
    :sswitch_a
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v4

    if-eqz v4, :cond_6

    :goto_2
    const-string v4, "\u1a7a\u06d8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x57

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x50e5

    const v6, -0x16dac37c

    xor-int/2addr v5, v6

    const v6, 0x78d4835

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u1a74\u1a76"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x1b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x50df

    const v6, -0x1facf247

    xor-int/2addr v5, v6

    const v6, 0x210e6561

    goto/16 :goto_0

    .line 1374
    :sswitch_b
    sget-boolean v4, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v4, :cond_7

    goto :goto_4

    :cond_7
    const-string v4, "\u05a1\u06db"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x5d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7321

    const v6, -0x2fd98a06

    xor-int/2addr v5, v6

    const v6, -0x3c99c220

    goto/16 :goto_0

    .line 1005
    :sswitch_c
    sget v4, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v4, :cond_8

    goto :goto_4

    :cond_8
    const-string v4, "\u06db\u06d7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x54eb

    const v6, -0x5516c1bd

    xor-int/2addr v5, v6

    const v6, -0x5079e35

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v4, :cond_a

    :cond_9
    :goto_3
    const-string v4, "\u1a7a\u06e7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0xd

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xf15

    const v6, 0x1883216a

    xor-int/2addr v5, v6

    const v6, -0x270b0b87

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a7a\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4355

    const v6, 0x40a4ffd0

    xor-int/2addr v5, v6

    const v6, -0x1a2b67a2

    goto/16 :goto_0

    .line 1489
    :sswitch_e
    sget v4, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u05a1\u06e8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3f19

    const v6, -0x528c965

    xor-int/2addr v5, v6

    const v6, -0x44ab42cf

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e8\u1a75"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x1b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x71f5

    const v6, -0x4c9bb2bb

    xor-int/2addr v5, v6

    const v6, 0x29b8fa0d

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x79d71e84 -> :sswitch_1
        -0x6bc00d36 -> :sswitch_5
        -0x56c6f2f9 -> :sswitch_d
        -0x468c8a03 -> :sswitch_4
        -0x4583aefc -> :sswitch_c
        -0x416db407 -> :sswitch_a
        -0x416aa060 -> :sswitch_e
        -0x31d2976f -> :sswitch_3
        -0x3104de97 -> :sswitch_2
        -0x2aec9f0b -> :sswitch_b
        -0x221803e0 -> :sswitch_d
        -0x207972b3 -> :sswitch_b
        -0x1416d2e0 -> :sswitch_a
        -0xf837d5e -> :sswitch_6
        0x68afb21 -> :sswitch_e
        0xa4e2995 -> :sswitch_3
        0x10044da9 -> :sswitch_6
        0x1a561de1 -> :sswitch_1
        0x223ec200 -> :sswitch_2
        0x2560089c -> :sswitch_9
        0x2b094042 -> :sswitch_0
        0x2c454bfe -> :sswitch_8
        0x2c59b2dc -> :sswitch_9
        0x3961a0e2 -> :sswitch_4
        0x44d5b64c -> :sswitch_c
        0x6abf9e57 -> :sswitch_0
        0x6bdd7aa4 -> :sswitch_7
        0x76b8aea7 -> :sswitch_5
        0x795bfe25 -> :sswitch_7
        0x7cf3e9a8 -> :sswitch_8
    .end sparse-switch
.end method
