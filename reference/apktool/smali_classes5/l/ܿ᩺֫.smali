.class public final Ll/ܿ᩺֫;
.super Ljava/lang/Object;
.source "K3YN"

# interfaces
.implements Lbin/mt/plugin/api/preference/PluginPreference$List$Item;


# instance fields
.field public ۙ:Ll/᩶᩺֫;

.field public ۤ:Ljava/lang/CharSequence;

.field public ᩷:Ljava/lang/CharSequence;

.field public ᩸:Ljava/lang/String;


# virtual methods
.method public final addItem(Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$List$Item;
    .locals 6

    const v0, 0x5c630a40

    sget v1, Ll/ۖ֨;->֨ۨۧ:I

    sget v2, Ll/ۘܶ;->ܶ᩵ۢ:I

    const-string v3, "\u06e0\u06d9"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x9

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x791f

    const v5, -0x1ba387cb

    xor-int/2addr v4, v5

    const v5, 0x3d561953

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x2147

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 29
    sget v3, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v3, :cond_3

    goto/16 :goto_2

    .line 26
    :sswitch_0
    sget v3, Ll/ۗܶ;->ᩴ֫۫:I

    if-lez v3, :cond_a

    goto/16 :goto_2

    .line 13
    :sswitch_1
    sget v3, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v3, :cond_4

    goto :goto_1

    :sswitch_2
    sget-boolean v3, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-nez v3, :cond_1

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    goto/16 :goto_2

    .line 20
    :sswitch_4
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    const/4 p1, 0x0

    return-object p1

    .line 30
    :sswitch_5
    iget-object v0, p0, Ll/ܿ᩺֫;->ۙ:Ll/᩶᩺֫;

    invoke-virtual {v0, p1, p2}, Ll/᩶᩺֫;->addItem(Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$List$Item;

    move-result-object p1

    return-object p1

    .line 8
    :sswitch_6
    sget v3, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u073d\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7c41

    const v5, -0x29c96498

    xor-int/2addr v4, v5

    const v5, 0x49659d23

    goto :goto_0

    .line 7
    :sswitch_7
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v3

    if-nez v3, :cond_2

    :cond_1
    :goto_1
    const-string v3, "\u06da\u05ab"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x63

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7ffb

    const v5, -0x32654d50

    xor-int/2addr v4, v5

    const v5, -0x7ed359c9

    goto :goto_0

    :cond_2
    const-string v3, "\u06e8\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4f35

    const v5, -0x5192355c

    xor-int/2addr v4, v5

    const v5, 0x7901e13a

    goto :goto_0

    :cond_3
    const-string v3, "\u073f\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x6f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x149f

    const v5, -0x4f5832ef

    xor-int/2addr v4, v5

    const v5, -0x729204d5

    goto/16 :goto_0

    .line 15
    :sswitch_8
    sget v3, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v3, :cond_5

    :cond_4
    const-string v3, "\u06ec\u1a7a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x72d9

    const v5, -0x21f3c431

    xor-int/2addr v4, v5

    const v5, 0xf3f3f31

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e2\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x54e7

    const v5, -0x7272f41

    xor-int/2addr v4, v5

    const v5, 0x7091fa9c

    goto/16 :goto_0

    .line 13
    :sswitch_9
    sget v3, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v3, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v3, "\u05a1\u1a79"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4fd3

    const v5, 0x6e5a3ce1

    xor-int/2addr v4, v5

    const v5, -0x55ec9987

    goto/16 :goto_0

    .line 2
    :sswitch_a
    sget v3, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u073a\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5e45

    const v5, 0x2a2fbc90

    xor-int/2addr v4, v5

    const v5, -0x4357a02

    goto/16 :goto_0

    .line 6
    :sswitch_b
    sget v3, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v3, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v3, "\u1a7b\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7603

    const v5, 0x6aceee45

    xor-int/2addr v4, v5

    const v5, 0x1847e1c8

    goto/16 :goto_0

    .line 20
    :sswitch_c
    sget v3, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v3, :cond_9

    :goto_2
    const-string v3, "\u073a\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x457f

    const v5, 0x4e4ab555    # 8.5022035E8f

    xor-int/2addr v4, v5

    const v5, 0x31a6f72c

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a7b\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x67b5

    const v5, -0x43a72fe1

    xor-int/2addr v4, v5

    const v5, -0x5fd9aa4f

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v3

    if-nez v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u1a7b\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5d17

    const v5, -0x1a633dd2

    xor-int/2addr v4, v5

    const v5, -0x4a2e9475

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u0736\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x33f7

    const v5, 0x6c655f93

    xor-int/2addr v4, v5

    const v5, 0x659dd649

    goto/16 :goto_0

    .line 25
    :sswitch_e
    sget v3, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v3, :cond_c

    :goto_4
    const-string v3, "\u1a79\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4d77

    const v5, -0x1ac2ce3f

    xor-int/2addr v4, v5

    const v5, -0x66f9ed80

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d6\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xab5

    const v5, -0x4810fd43

    xor-int/2addr v4, v5

    const v5, -0x43c10f38

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6fbe4f19 -> :sswitch_c
        -0x510c1f06 -> :sswitch_a
        -0x50b2e866 -> :sswitch_3
        -0x41fbea59 -> :sswitch_9
        -0x2e628000 -> :sswitch_a
        -0xa78a4df -> :sswitch_8
        -0x944209d -> :sswitch_4
        -0x2db8d0 -> :sswitch_5
        0x36519f9 -> :sswitch_1
        0xa50a582 -> :sswitch_2
        0xa891727 -> :sswitch_d
        0x159a9405 -> :sswitch_6
        0x19457e97 -> :sswitch_b
        0x2832cc9f -> :sswitch_3
        0x39143bc7 -> :sswitch_2
        0x3b7692c8 -> :sswitch_d
        0x421755a1 -> :sswitch_e
        0x46104baf -> :sswitch_7
        0x4d7d5e3f -> :sswitch_9
        0x4f372259 -> :sswitch_0
        0x512efb61 -> :sswitch_e
        0x522bf6c0 -> :sswitch_7
        0x57ffcef8 -> :sswitch_6
        0x60e05a0a -> :sswitch_1
        0x657446e8 -> :sswitch_0
        0x6c0a24cb -> :sswitch_c
        0x761762f0 -> :sswitch_b
        0x7abd2792 -> :sswitch_5
        0x7c21a5d8 -> :sswitch_8
        0x7c2b8e50 -> :sswitch_4
    .end sparse-switch
.end method

.method public final summary(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/preference/PluginPreference$List$Item;
    .locals 0

    .line 24
    iput-object p1, p0, Ll/ܿ᩺֫;->ۤ:Ljava/lang/CharSequence;

    return-object p0
.end method
