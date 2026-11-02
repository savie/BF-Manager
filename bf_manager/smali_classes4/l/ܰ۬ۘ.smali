.class public final Ll/ܰ۬ۘ;
.super Ljava/lang/Object;
.source "K3YN"

# interfaces
.implements Lbin/mt/plugin/api/preference/PluginPreference$List$Item;


# instance fields
.field public ۖ:Ljava/lang/String;

.field public ۙ:Ll/ۙ۬ۘ;

.field public ۨ:Ljava/lang/CharSequence;

.field public ܰ:Ljava/lang/CharSequence;


# virtual methods
.method public final addItem(Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$List$Item;
    .locals 6

    const v0, 0x3ce59c5a

    sget v1, Ll/֨ܰ;->ۢ᩷۟:I

    sget v2, Ll/֨ܶ;->ۛۛۛ:I

    const-string v3, "\u06d7\u0736"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3b7d

    const v5, 0x4231f62e

    xor-int/2addr v4, v5

    const v5, 0x141648b

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x734b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֨ۧ;->֫۠֡:I

    if-gtz v3, :cond_6

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    move-result v3

    if-eqz v3, :cond_a

    goto/16 :goto_5

    :sswitch_1
    sget v3, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v3, :cond_8

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    sget v3, Ll/֨ܶ;->ۛۛۛ:I

    if-lez v3, :cond_2

    goto/16 :goto_5

    :sswitch_3
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    goto/16 :goto_5

    .line 26
    :sswitch_4
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    const/4 p1, 0x0

    return-object p1

    .line 30
    :sswitch_5
    iget-object v0, p0, Ll/ܰ۬ۘ;->ۙ:Ll/ۙ۬ۘ;

    invoke-virtual {v0, p1, p2}, Ll/ۙ۬ۘ;->addItem(Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$List$Item;

    move-result-object p1

    return-object p1

    :sswitch_6
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v3

    if-gtz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06e8\u06da"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4e2f

    const v5, 0x1918674b

    xor-int/2addr v4, v5

    const v5, 0x153487a3

    goto :goto_0

    .line 3
    :sswitch_7
    sget v3, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u073a\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x15a1

    const v5, 0x7d45ea14

    xor-int/2addr v4, v5

    const v5, 0xbcaaf1c

    goto :goto_0

    .line 18
    :sswitch_8
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v3

    if-eqz v3, :cond_3

    :cond_2
    :goto_1
    const-string v3, "\u05a1\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x15

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4f29

    const v5, -0x48127f7d

    xor-int/2addr v4, v5

    const v5, -0x54c721b1

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u1a7b\u06e2"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2b47

    const v5, -0x7c49d592

    xor-int/2addr v4, v5

    const v5, -0x6c527145

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v3, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u0733\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x47

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xdf5

    const v5, 0x79af38a

    xor-int/2addr v4, v5

    const v5, -0x5f172777

    goto/16 :goto_0

    .line 12
    :sswitch_a
    sget v3, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v3, :cond_5

    goto :goto_3

    :cond_5
    const-string v3, "\u05a8\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x39

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x63d3

    const v5, -0xab82a7e

    xor-int/2addr v4, v5

    const v5, 0x7b085f92

    goto/16 :goto_0

    :goto_2
    const-string v3, "\u06e4\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x25f5

    const v5, -0x5f8637e

    xor-int/2addr v4, v5

    const v5, 0x562b9200

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06e0\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x150b

    const v5, 0x240ad121

    xor-int/2addr v4, v5

    const v5, 0x7ed118da

    goto/16 :goto_0

    .line 21
    :sswitch_b
    sget v3, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v3, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v3, "\u1a7b\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x33

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4397

    const v5, 0x46430152

    xor-int/2addr v4, v5

    const v5, -0x136f8495

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v3, Ll/᩶;->ۚۤۘ:Z

    if-eqz v3, :cond_9

    :cond_8
    :goto_3
    const-string v3, "\u073d\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7887

    const v5, 0x7f662a23

    xor-int/2addr v4, v5

    const v5, -0x3bfb9462

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u05ab\u073f"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x509

    const v5, 0x74d4140a

    xor-int/2addr v4, v5

    const v5, 0x3f59bf11

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_b

    :cond_a
    :goto_4
    const-string v3, "\u1a75\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x101d

    const v5, 0x37c1d179

    xor-int/2addr v4, v5

    const v5, -0x734fe3c5

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06d9\u06d6"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x19

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x26b3

    const v5, 0xe690535

    xor-int/2addr v4, v5

    const v5, -0x2373497a

    goto/16 :goto_0

    .line 2
    :sswitch_e
    sget v3, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v3, :cond_c

    :goto_5
    const-string v3, "\u06dc\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x49b

    const v5, -0x485f2a34

    xor-int/2addr v4, v5

    const v5, -0x459a9bf3

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a77\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x43

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x73df

    const v5, -0x5a19ce7a

    xor-int/2addr v4, v5

    const v5, -0x15089d5a

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x781aa07a -> :sswitch_c
        -0x6e0bc43a -> :sswitch_b
        -0x5bfb6714 -> :sswitch_c
        -0x44482e11 -> :sswitch_2
        -0x35dcfa47 -> :sswitch_4
        -0x35681a5a -> :sswitch_8
        -0x2cbc1999 -> :sswitch_d
        -0x2ca1d40d -> :sswitch_9
        -0x2a6a4d9f -> :sswitch_5
        -0x224684ad -> :sswitch_6
        -0x171b33e0 -> :sswitch_a
        -0x81cc7cf -> :sswitch_1
        -0x3ef0236 -> :sswitch_4
        -0x30a6027 -> :sswitch_1
        0x1629ffc -> :sswitch_a
        0x1f1c1a6d -> :sswitch_3
        0x266df4e7 -> :sswitch_0
        0x2d052f48 -> :sswitch_3
        0x2eadb223 -> :sswitch_7
        0x36183c66 -> :sswitch_8
        0x40ea5402 -> :sswitch_b
        0x6a8706b6 -> :sswitch_5
        0x6b521f65 -> :sswitch_0
        0x730b64b8 -> :sswitch_e
        0x73c4388a -> :sswitch_7
        0x7668fd62 -> :sswitch_d
        0x797f258c -> :sswitch_2
        0x7b6f0cc7 -> :sswitch_9
        0x7b8cefad -> :sswitch_6
        0x7ef2e253 -> :sswitch_e
    .end sparse-switch
.end method

.method public final summary(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/preference/PluginPreference$List$Item;
    .locals 0

    .line 24
    iput-object p1, p0, Ll/ܰ۬ۘ;->ۨ:Ljava/lang/CharSequence;

    return-object p0
.end method
