.class public final synthetic Ll/ܺܺۘ;
.super Ljava/lang/Object;
.source "02QQ"

# interfaces
.implements Ll/ۙ᩶۠;


# virtual methods
.method public final ۙ()Ljava/lang/Object;
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const v8, -0x2f5153f5

    sget v9, Ll/֫ܳ;->᩶ۧۛ:I

    sget v10, Ll/ۗܺ;->ۨ᩺۠:I

    const-string v11, "\u06d9\u06e8"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x5ae3

    const v13, -0x4dec05b7

    xor-int/2addr v12, v13

    const v13, 0xc71b912

    :goto_0
    xor-int/2addr v11, v13

    xor-int/2addr v8, v9

    mul-int/lit16 v8, v8, 0x3d2d

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v8, v12

    xor-int/2addr v8, v11

    sparse-switch v8, :sswitch_data_0

    sget v11, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v11, :cond_9

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    sget v11, Ll/֫;->ܶܺ᩻:I

    if-gez v11, :cond_0

    goto :goto_1

    :cond_0
    const-string v11, "\u05a8\u06e7"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, -0x3d

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x65cf

    const v13, 0x6826e069

    xor-int/2addr v12, v13

    const v13, -0x76bc3e45

    goto :goto_0

    .line 30
    :sswitch_1
    sget v11, Ll/֫ܳ;->᩶ۧۛ:I

    if-gez v11, :cond_b

    goto :goto_1

    .line 7
    :sswitch_2
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    sget v11, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v11, :cond_8

    goto :goto_1

    .line 27
    :sswitch_3
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    :goto_1
    const-string v11, "\u06d8\u073a"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x6d

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x578b

    const v13, -0x7fd72342

    xor-int/2addr v12, v13

    const v13, -0x6dce0354

    goto :goto_0

    .line 12
    :sswitch_4
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    const/4 v0, 0x0

    return-object v0

    .line 64
    :sswitch_5
    new-instance v11, Ll/᩻ۡۘ;

    sget v12, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v12, :cond_1

    goto/16 :goto_2

    .line 14
    :cond_1
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 64
    invoke-virtual {v0, v11}, Ll/ۖۗ۠;->ۙ(Ll/֫ۢ۠;)V

    .line 67
    invoke-virtual {v0}, Ll/ۖۗ۠;->ۙ()Ll/ۚۗ۠;

    move-result-object v0

    return-object v0

    .line 63
    :sswitch_6
    invoke-virtual {v0, v6, v7}, Ll/ۖۗ۠;->ۙ(J)V

    sget v11, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v11, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v11, "\u073d\u06e7"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x1f

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x4d47

    const v13, 0x680e4d87

    xor-int/2addr v12, v13

    const v13, 0x4e26bf38    # 6.993874E8f

    goto/16 :goto_0

    .line 62
    :sswitch_7
    invoke-virtual {v0, v4, v5, v1}, Ll/ۖۗ۠;->ܰ(JLjava/util/concurrent/TimeUnit;)V

    const-wide/16 v6, 0x19

    .line 18
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v11

    if-gtz v11, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v11, "\u05a8\u06d8"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x7a03

    const v13, 0x1af1e762    # 1.0004908E-22f

    xor-int/2addr v12, v13

    const v13, 0x5ef1b896

    goto/16 :goto_0

    :sswitch_8
    const-wide/16 v4, 0xf

    sget v11, Ll/֨ۧ;->֫۠֡:I

    if-gtz v11, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v11, "\u1a75\u06db"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x37

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x413b

    const v13, -0x2790ce0b

    xor-int/2addr v12, v13

    const v13, -0x6e9825f

    goto/16 :goto_0

    .line 60
    :sswitch_9
    invoke-virtual {v0, v2, v3, v1}, Ll/ۖۗ۠;->ۙ(JLjava/util/concurrent/TimeUnit;)V

    .line 61
    invoke-virtual {v0, v2, v3, v1}, Ll/ۖۗ۠;->ۨ(JLjava/util/concurrent/TimeUnit;)V

    sget-boolean v11, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v11, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v11, "\u06d7\u06e7"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, 0x59

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x45d3

    const v13, 0x5f1a0108

    xor-int/2addr v12, v13

    const v13, 0x5eb046d

    goto/16 :goto_0

    :sswitch_a
    const-wide/16 v2, 0xa

    .line 40
    sget v11, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v11, :cond_6

    goto :goto_3

    :cond_6
    const-string v11, "\u06e1\u0730"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x7747

    const v13, -0x77fa9782

    xor-int/2addr v12, v13

    const v13, 0x7811eac1

    goto/16 :goto_0

    .line 60
    :sswitch_b
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 31
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result v11

    if-eqz v11, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v11, "\u06eb\u06e7"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v10, v11

    mul-int/lit8 v11, v11, -0x49

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x1697

    const v13, 0x1fbdc05f

    xor-int/2addr v12, v13

    const v13, -0x38b86505

    goto/16 :goto_0

    :cond_8
    :goto_2
    const-string v11, "\u0730\u06e8"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0xf

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x4503

    const v13, 0x52ff3df8

    xor-int/2addr v12, v13

    const v13, 0x1c0d7c47

    goto/16 :goto_0

    :cond_9
    const-string v11, "\u1a78\u06d6"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x3d

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x1b5b

    const v13, 0x1eab81d0

    xor-int/2addr v12, v13

    const v13, -0x4fc28649

    goto/16 :goto_0

    .line 33
    :sswitch_c
    sget v11, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v11, :cond_a

    :goto_3
    const-string v11, "\u1a77\u06d8"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x744b

    const v13, 0x10fedcb3

    xor-int/2addr v12, v13

    const v13, -0x591ec264

    goto/16 :goto_0

    :cond_a
    const-string v11, "\u1a73\u1a78"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x71

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x6207

    const v13, 0x74085b5f

    xor-int/2addr v12, v13

    const v13, 0x617c3329

    goto/16 :goto_0

    .line 59
    :sswitch_d
    invoke-static {}, Ll/۟᩻᩺;->ۙ()Ll/ۖۗ۠;

    move-result-object v0

    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v11

    if-eqz v11, :cond_c

    :cond_b
    :goto_4
    const-string v11, "\u06dc\u073a"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x3cf3

    const v13, 0x480af8dd

    xor-int/2addr v12, v13

    const v13, -0x150d6310

    goto/16 :goto_0

    :cond_c
    const-string v11, "\u05a8\u05ab"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x1e55

    const v13, -0x3599a78f

    xor-int/2addr v12, v13

    const v13, 0x77d6db33

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x72316f44 -> :sswitch_b
        -0x6ea67081 -> :sswitch_5
        -0x63188263 -> :sswitch_c
        -0x61cd1e41 -> :sswitch_6
        -0x5c4b7543 -> :sswitch_2
        -0x4a3fe2f5 -> :sswitch_6
        -0x4778fbeb -> :sswitch_4
        -0x471187a4 -> :sswitch_7
        -0x453147b0 -> :sswitch_b
        -0x39d74228 -> :sswitch_8
        -0x27b827cc -> :sswitch_9
        -0x241fe884 -> :sswitch_3
        -0x23b6e556 -> :sswitch_a
        -0x10752df6 -> :sswitch_d
        -0x105b34b2 -> :sswitch_0
        -0x103cd4af -> :sswitch_a
        -0xb833dc7 -> :sswitch_7
        0x4d16ae2 -> :sswitch_5
        0x81a9e00 -> :sswitch_2
        0x2b185eef -> :sswitch_1
        0x3157fb3d -> :sswitch_9
        0x4281ba7e -> :sswitch_8
        0x4537afae -> :sswitch_d
        0x498cca31 -> :sswitch_4
        0x59491b53 -> :sswitch_c
        0x66f1117c -> :sswitch_3
        0x6f66dfc8 -> :sswitch_0
        0x7c3a7d71 -> :sswitch_1
    .end sparse-switch
.end method
