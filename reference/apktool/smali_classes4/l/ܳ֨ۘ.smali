.class public final Ll/ܳ֨ۘ;
.super Ll/ۗ֨ۘ;
.source "G3YB"

# interfaces
.implements Lbin/mt/plugin/api/preference/PluginPreference$Header;


# virtual methods
.method public final enable(Z)Lbin/mt/plugin/api/preference/PluginPreference$Header;
    .locals 0

    .line 50
    iput-boolean p1, p0, Ll/ۗ֨ۘ;->ۙ:Z

    return-object p0
.end method

.method public final visible(Z)Lbin/mt/plugin/api/preference/PluginPreference$Header;
    .locals 0

    .line 44
    iput-boolean p1, p0, Ll/ۗ֨ۘ;->֨:Z

    return-object p0
.end method

.method public final ۙ()Ll/ۢ֨ۘ;
    .locals 1

    .line 27
    sget-object v0, Ll/ۢ֨ۘ;->᩶:Ll/ۢ֨ۘ;

    return-object v0
.end method

.method public final ۙ(Lbin/mt/plugin/api/LocalString;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x490a282e    # 565890.9f

    sget v2, Ll/ۖܽ;->ܳ۠᩹:I

    sget v3, Ll/֨᩹;->᩻ᩳ֨:I

    const-string v4, "\u1a76\u1a77"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x74e3

    const v6, 0x131ef81c

    xor-int/2addr v5, v6

    const v6, 0x22cf20f

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x2ba9

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 23
    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v4, :cond_8

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    sget v4, Ll/֨ܶ;->ۛۛۛ:I

    if-lez v4, :cond_3

    goto/16 :goto_4

    .line 12
    :sswitch_1
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v4

    if-ltz v4, :cond_a

    goto/16 :goto_5

    .line 1
    :sswitch_2
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    sget v4, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v4, :cond_c

    goto/16 :goto_2

    .line 0
    :sswitch_3
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    goto/16 :goto_2

    .line 19
    :sswitch_4
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    return-void

    .line 32
    :sswitch_5
    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 33
    invoke-static {p1, v4}, Ll/֡֨ۘ;->ۙ(Lbin/mt/plugin/api/LocalString;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Ll/ۗ֨ۘ;->᩹:Ljava/lang/CharSequence;

    goto :goto_1

    :sswitch_6
    return-void

    .line 32
    :sswitch_7
    iget-object v0, p0, Ll/ۗ֨ۘ;->᩹:Ljava/lang/CharSequence;

    instance-of v4, v0, Ljava/lang/String;

    if-eqz v4, :cond_0

    const-string v4, "\u06d6\u06d6"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x7

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x579b

    const v6, 0x62b78f5

    xor-int/2addr v5, v6

    const v6, 0x28e04b83

    goto :goto_0

    :cond_0
    :goto_1
    const-string v4, "\u06da\u1a79"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x55

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1eb1

    const v6, -0x59a5600f

    xor-int/2addr v5, v6

    const v6, -0x3d554cf

    goto :goto_0

    .line 5
    :sswitch_8
    sget-boolean v4, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u1a75\u06d8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x73

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6fe1

    const v6, 0x35a42638

    xor-int/2addr v5, v6

    const v6, 0x2562d056

    goto/16 :goto_0

    .line 21
    :sswitch_9
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v4

    if-gtz v4, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v4, "\u1a78\u06ec"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x79

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2087

    const v6, 0x6e67fd7b

    xor-int/2addr v5, v6

    const v6, 0x42a33347

    goto/16 :goto_0

    .line 27
    :sswitch_a
    sget v4, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v4, :cond_4

    :cond_3
    const-string v4, "\u06d6\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x4b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5077

    const v6, 0x25b2c160

    xor-int/2addr v5, v6

    const v6, -0x3318a5f5

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06e4\u1a79"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4b1

    const v6, 0x2a961185

    xor-int/2addr v5, v6

    const v6, -0x6afc0091

    goto/16 :goto_0

    .line 14
    :sswitch_b
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v4

    if-eqz v4, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v4, "\u06df\u073f"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7301

    const v6, -0x6456ab13

    xor-int/2addr v5, v6

    const v6, -0x21f2b2b8

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v4

    if-gtz v4, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v4, "\u1a73\u0730"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x586b

    const v6, 0x64087487

    xor-int/2addr v5, v6

    const v6, 0x1cdd3926

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v4, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v4, :cond_7

    goto :goto_2

    :cond_7
    const-string v4, "\u06db\u1a7b"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7be5

    const v6, -0x8ed5055

    xor-int/2addr v5, v6

    const v6, -0x276b0d29

    goto/16 :goto_0

    :goto_2
    const-string v4, "\u1a73\u1a78"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x643f

    const v6, 0x2327df44

    xor-int/2addr v5, v6

    const v6, 0xd316813

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u1a79\u1a7b"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x3f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6bb1

    const v6, -0x22b96b42

    xor-int/2addr v5, v6

    const v6, 0x25bea5fc

    goto/16 :goto_0

    .line 15
    :sswitch_e
    sget v4, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v4, :cond_9

    :goto_3
    const-string v4, "\u06da\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x6d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x35cb

    const v6, -0x66274d3b

    xor-int/2addr v5, v6

    const v6, 0x5f73b288

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a77\u073d"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6a6d

    const v6, 0x581f3533

    xor-int/2addr v5, v6

    const v6, 0x159eacf

    goto/16 :goto_0

    .line 12
    :sswitch_f
    sget v4, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v4, :cond_b

    :cond_a
    :goto_4
    const-string v4, "\u06e2\u0736"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x3f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2ba9

    const v6, 0x21390550

    xor-int/2addr v5, v6

    const v6, -0x19646243

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06e2\u1a76"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x4d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x19ab

    const v6, 0x60aa7abe

    xor-int/2addr v5, v6

    const v6, -0x18305b91

    goto/16 :goto_0

    .line 28
    :sswitch_10
    sget-boolean v4, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v4, :cond_d

    :cond_c
    :goto_5
    const-string v4, "\u1a75\u0730"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x49

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3fab

    const v6, 0x2212d34a

    xor-int/2addr v5, v6

    const v6, -0x2b054274

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06d6\u06ec"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6ac7

    const v6, -0x55d35e73

    xor-int/2addr v5, v6

    const v6, -0x25ba6db3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b184f78 -> :sswitch_0
        -0x75678ac0 -> :sswitch_9
        -0x73d49eba -> :sswitch_10
        -0x71b9177e -> :sswitch_c
        -0x5dd59792 -> :sswitch_8
        -0x5211e36d -> :sswitch_1
        -0x3a21cd5f -> :sswitch_f
        -0x31bf8cf5 -> :sswitch_9
        -0x2e65c89f -> :sswitch_a
        -0x2ba6028d -> :sswitch_0
        -0x296fe6db -> :sswitch_3
        -0x20de5651 -> :sswitch_7
        -0x1c2ead30 -> :sswitch_8
        -0xff83468 -> :sswitch_b
        -0xc7ed7d6 -> :sswitch_c
        -0xae75b0b -> :sswitch_a
        -0x6566213 -> :sswitch_4
        0xb012bd -> :sswitch_1
        0x3457801 -> :sswitch_b
        0x9a16db1 -> :sswitch_d
        0xa5ed2a9 -> :sswitch_5
        0x1252d7a0 -> :sswitch_d
        0x125d3a3a -> :sswitch_e
        0x14079ccd -> :sswitch_7
        0x17848a8b -> :sswitch_3
        0x1db4c6f4 -> :sswitch_10
        0x21d5996f -> :sswitch_2
        0x2627138b -> :sswitch_4
        0x2de6d6ba -> :sswitch_6
        0x391d2da1 -> :sswitch_e
        0x3edb1d71 -> :sswitch_5
        0x4d949687 -> :sswitch_6
        0x599ac138 -> :sswitch_2
        0x748386e5 -> :sswitch_f
    .end sparse-switch
.end method

.method public final ۙ(Lbin/mt/plugin/api/PluginContext;)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x570bbede

    sget v4, Ll/֨᩺;->۬᩺ܰ:I

    sget v5, Ll/ۧ;->֫۠ᩴ:I

    const-string v6, "\u05a1\u05a1"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x6af9

    const v8, -0x249c3881

    xor-int/2addr v7, v8

    const v8, -0x12089c08

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, 0x2a4f

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    sget-boolean v6, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v6, :cond_2

    goto/16 :goto_2

    .line 4
    :sswitch_0
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    move-result v6

    if-lez v6, :cond_c

    goto/16 :goto_3

    .line 80
    :sswitch_1
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    sget v6, Ll/֫ܽ;->֡ᩴܶ:I

    if-gez v6, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v6, "\u06db\u1a73"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x7

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1d05

    const v8, 0x11c1095

    xor-int/2addr v7, v8

    const v8, -0x1f664e27

    goto :goto_0

    .line 60
    :sswitch_2
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    sget v6, Ll/֡ۚ;->ۢܰ᩸:I

    if-gez v6, :cond_8

    goto/16 :goto_3

    .line 140
    :sswitch_3
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    return-void

    .line 172
    :sswitch_5
    invoke-static {p1, v2}, Ll/֫ᩳ;->᩺֨۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    goto/16 :goto_1

    :sswitch_6
    const/4 v6, 0x1

    .line 0
    invoke-static {v6, v2}, Ll/֡۠;->ۡܰ۫(ILjava/lang/Object;)C

    move-result v6

    const/16 v7, 0x7d

    if-ne v6, v7, :cond_1

    const-string v6, "\u073f\u06d6"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6ff5

    const v8, 0x38ac9944

    xor-int/2addr v7, v8

    const v8, -0x52c3f8ad

    goto :goto_0

    :sswitch_7
    const/4 v6, 0x0

    .line 171
    invoke-static {v2, v6}, Ll/ۗ;->᩶᩺ܶ(Ljava/lang/Object;I)C

    move-result v6

    const/16 v7, 0x7b

    if-ne v6, v7, :cond_1

    const-string v6, "\u06d6\u06db"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x57

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x230d

    const v8, 0x2c7a9900

    xor-int/2addr v7, v8

    const v8, 0x3eaf5409

    goto/16 :goto_0

    :sswitch_8
    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v6

    const/4 v7, 0x3

    if-lt v6, v7, :cond_1

    const-string v6, "\u1a73\u06da"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x14e1

    const v8, 0x615b5ec8

    xor-int/2addr v7, v8

    const v8, -0x51a3e3a9

    goto/16 :goto_0

    .line 39
    :sswitch_9
    iput-object v1, p0, Ll/ۗ֨ۘ;->᩹:Ljava/lang/CharSequence;

    return-void

    :sswitch_a
    iget-object v0, p0, Ll/ۗ֨ۘ;->᩹:Ljava/lang/CharSequence;

    .line 171
    instance-of v6, v0, Ljava/lang/String;

    if-eqz v6, :cond_1

    const-string v6, "\u1a75\u06e2"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x25

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x42bb

    const v8, -0x3beb0550

    xor-int/2addr v7, v8

    const v8, 0x6fdaae27

    goto/16 :goto_0

    :cond_1
    move-object v1, v0

    :goto_1
    const-string v6, "\u0733\u05a1"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x9eb

    const v8, 0x5f9142da

    xor-int/2addr v7, v8

    const v8, -0x41e83d8f

    goto/16 :goto_0

    :cond_2
    const-string v6, "\u1a75\u073d"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x5bdd

    const v8, 0x1628236a

    xor-int/2addr v7, v8

    const v8, 0x261e59d9

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_2

    :cond_3
    const-string v6, "\u1a73\u1a7a"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x33

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x3ba3

    const v8, -0xc40dc92

    xor-int/2addr v7, v8

    const v8, -0x58899a5a

    goto/16 :goto_0

    .line 136
    :sswitch_c
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_3

    :cond_4
    const-string v6, "\u06dc\u06d8"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x7

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x6a47

    const v8, 0x38ffa7c

    xor-int/2addr v7, v8

    const v8, -0xf15a860

    goto/16 :goto_0

    .line 124
    :sswitch_d
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v6

    if-eqz v6, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v6, "\u06ec\u05a1"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x51

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x596d

    const v8, 0x7bf089c8

    xor-int/2addr v7, v8

    const v8, 0x6e66cbc1

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v6, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v6, :cond_6

    :goto_2
    const-string v6, "\u1a79\u1a75"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x3e03

    const v8, 0x5244ea0b

    xor-int/2addr v7, v8

    const v8, -0x25a962b2

    goto/16 :goto_0

    :cond_6
    const-string v6, "\u0730\u0730"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x75

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x448b

    const v8, 0xe6090f3

    xor-int/2addr v7, v8

    const v8, 0x4701207b

    goto/16 :goto_0

    .line 161
    :sswitch_f
    sget v6, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v6, :cond_7

    :goto_3
    const-string v6, "\u1a73\u0730"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x20f1

    const v8, 0x5016c584

    xor-int/2addr v7, v8

    const v8, 0x2b6ae1e1

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u06da\u1a73"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x42eb

    const v8, -0x5d174dff

    xor-int/2addr v7, v8

    const v8, 0x480ba13f

    goto/16 :goto_0

    .line 132
    :sswitch_10
    sget-boolean v6, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v6, :cond_9

    :cond_8
    :goto_4
    const-string v6, "\u073f\u06ec"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2b77

    const v8, -0x10e6d533

    xor-int/2addr v7, v8

    const v8, -0x7a35bdc6

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u073f\u0730"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x49

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x174d

    const v8, -0x2f9c6fd1

    xor-int/2addr v7, v8

    const v8, 0x30eabd48

    goto/16 :goto_0

    .line 57
    :sswitch_11
    sget v6, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v6, :cond_a

    goto :goto_5

    :cond_a
    const-string v6, "\u1a75\u06e4"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x55

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x4497

    const v8, -0x440978d4

    xor-int/2addr v7, v8

    const v8, -0xd4e24c7

    goto/16 :goto_0

    :sswitch_12
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v6

    if-ltz v6, :cond_b

    goto :goto_5

    :cond_b
    const-string v6, "\u073d\u1a73"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x7f

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4ef3

    const v8, 0x27cef387

    xor-int/2addr v7, v8

    const v8, -0x7da5d2b

    goto/16 :goto_0

    :sswitch_13
    sget v6, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v6, :cond_d

    :cond_c
    :goto_5
    const-string v6, "\u06e8\u1a75"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x3f

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7105

    const v8, -0x15cffa65

    xor-int/2addr v7, v8

    const v8, -0x590db143

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u06eb\u073d"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x39

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x759b

    const v8, -0x15465d9

    xor-int/2addr v7, v8

    const v8, -0x77d7fb6b

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d489afc -> :sswitch_0
        -0x66e66126 -> :sswitch_a
        -0x62e4ac56 -> :sswitch_9
        -0x6254b964 -> :sswitch_e
        -0x5ff5ab76 -> :sswitch_13
        -0x503b849b -> :sswitch_8
        -0x3ce1edcc -> :sswitch_7
        -0x3ad96a40 -> :sswitch_11
        -0x3883504b -> :sswitch_12
        -0x3673fcc5 -> :sswitch_a
        -0x363d4f0f -> :sswitch_b
        -0x2bac8aa7 -> :sswitch_6
        -0x29022479 -> :sswitch_6
        -0x1858bb13 -> :sswitch_12
        -0x148a4fb0 -> :sswitch_d
        -0xc8ce40b -> :sswitch_e
        -0xb65a34f -> :sswitch_8
        -0xb4c566b -> :sswitch_3
        -0xab15a9e -> :sswitch_d
        -0x67a49c2 -> :sswitch_c
        -0x1362c7a -> :sswitch_4
        -0x1b6088 -> :sswitch_f
        0xff5db28 -> :sswitch_0
        0x1083597f -> :sswitch_10
        0x12381c4f -> :sswitch_5
        0x186b5095 -> :sswitch_5
        0x1cd03c1b -> :sswitch_2
        0x25f14c75 -> :sswitch_f
        0x309a90b6 -> :sswitch_4
        0x37ff7ac7 -> :sswitch_2
        0x3857dea2 -> :sswitch_13
        0x3ace59dc -> :sswitch_3
        0x58f29ddb -> :sswitch_1
        0x60db10f5 -> :sswitch_10
        0x64eb9ff2 -> :sswitch_c
        0x68a806cc -> :sswitch_1
        0x6bb72fc5 -> :sswitch_9
        0x6d12731a -> :sswitch_11
        0x79256e9e -> :sswitch_b
        0x7bff2fea -> :sswitch_7
    .end sparse-switch
.end method
