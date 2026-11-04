.class public final synthetic Ll/۫ᩳ֫;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/util/function/ToLongFunction;


# virtual methods
.method public final applyAsLong(Ljava/lang/Object;)J
    .locals 7

    const/4 v0, 0x0

    const v1, -0x3af8aa6d

    sget v2, Ll/ۗܶ;->ᩴ֫۫:I

    sget v3, Ll/ۖۖ;->᩵ۜ֨:I

    const-string v4, "\u06db\u1a73"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x79

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2b6d

    const v6, -0x7c0dfb6

    xor-int/2addr v5, v6

    const v6, 0x78bdc838

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x4a89

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 4
    sget v4, Ll/۟ۢ֫;->ۡ᩷:I

    .line 1787
    sget v4, Ll/֫֡;->֫ۙۖ:I

    if-gtz v4, :cond_0

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    sget v4, Ll/ۖ᩹;->۫ܽۗ:I

    if-gez v4, :cond_5

    goto/16 :goto_2

    .line 1871
    :sswitch_1
    sget-boolean v4, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v4, :cond_a

    goto/16 :goto_1

    .line 2077
    :sswitch_2
    sget v4, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v4, :cond_7

    goto/16 :goto_2

    .line 1622
    :sswitch_3
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    goto/16 :goto_2

    .line 17
    :sswitch_4
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    const-wide/16 v0, 0x0

    return-wide v0

    .line 2372
    :sswitch_5
    iget-object p1, v0, Ll/᩵ۢ֫;->᩻:Landroid/content/pm/PackageInfo;

    iget-wide v0, p1, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    neg-long v0, v0

    return-wide v0

    :cond_0
    const-string v4, "\u0730\u1a7b"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x71

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1ea5

    const v6, 0xa14e475

    xor-int/2addr v5, v6

    const v6, 0x58fe9fb1

    goto :goto_0

    .line 2
    :sswitch_6
    move-object v0, p1

    check-cast v0, Ll/᩵ۢ֫;

    .line 2324
    sget v4, Ll/֫֡;->֫ۙۖ:I

    if-gtz v4, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v4, "\u06d7\u1a7a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x45c7

    const v6, -0x72bfdc8

    xor-int/2addr v5, v6

    const v6, -0x233caba4

    goto :goto_0

    :sswitch_7
    sget v4, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "\u1a78\u06e4"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xd81

    const v6, -0xeccd5aa

    xor-int/2addr v5, v6

    const v6, -0x7118a102

    goto/16 :goto_0

    .line 134
    :sswitch_8
    sget v4, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v4, :cond_3

    goto :goto_1

    :cond_3
    const-string v4, "\u0730\u06da"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x15

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7ccd

    const v6, 0x36adb296

    xor-int/2addr v5, v6

    const v6, 0x18ccc202

    goto/16 :goto_0

    .line 258
    :sswitch_9
    sget v4, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u05a1\u06db"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0xd

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x45b7

    const v6, 0x6c96d16c

    xor-int/2addr v5, v6

    const v6, 0x6b6e9798

    goto/16 :goto_0

    .line 1336
    :sswitch_a
    sget v4, Ll/ۖ;->ܿۚ֡:I

    if-ltz v4, :cond_6

    :cond_5
    const-string v4, "\u06e8\u1a76"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x75

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5cad

    const v6, 0x3019fb74

    xor-int/2addr v5, v6

    const v6, 0x46b524d9

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u0736\u06e1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x441

    const v6, -0x7d6b45aa

    xor-int/2addr v5, v6

    const v6, -0x1a36e26

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/᩺;->۫۬۫:I

    if-gtz v4, :cond_8

    :cond_7
    :goto_1
    const-string v4, "\u1a74\u05ab"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x63

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x16d

    const v6, -0x34f947bd    # -8828995.0f

    xor-int/2addr v5, v6

    const v6, -0x6caf30d8

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u1a74\u06d7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x17

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x60db

    const v6, 0x107dac4d

    xor-int/2addr v5, v6

    const v6, 0x5a1d1ebb

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result v4

    if-gtz v4, :cond_9

    :goto_2
    const-string v4, "\u1a77\u073d"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5b97

    const v6, 0x7a137aa7

    xor-int/2addr v5, v6

    const v6, -0x31b0ac5

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06db\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3bf1

    const v6, -0x76c23b73

    xor-int/2addr v5, v6

    const v6, -0x2f924ad8

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v4, :cond_b

    :cond_a
    :goto_3
    const-string v4, "\u073f\u0730"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x7d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x19b5

    const v6, 0x149b8518

    xor-int/2addr v5, v6

    const v6, -0x52fdedc8

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u05a8\u073d"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7f11

    const v6, -0x3e881aee

    xor-int/2addr v5, v6

    const v6, 0x71df9000

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result v4

    if-nez v4, :cond_c

    :goto_4
    const-string v4, "\u06e4\u06dc"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x33

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x49a5

    const v6, 0x70aeabb2

    xor-int/2addr v5, v6

    const v6, -0x275bef00

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06eb\u06d9"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x55

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4f59

    const v6, 0x42a8cb7f

    xor-int/2addr v5, v6

    const v6, -0x88fb857

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x68ee8bef -> :sswitch_8
        -0x62ed06a5 -> :sswitch_6
        -0x477cf59c -> :sswitch_4
        -0x450b503d -> :sswitch_3
        -0x423cb6cd -> :sswitch_1
        -0x3c640d70 -> :sswitch_b
        -0x31db024b -> :sswitch_b
        -0x2fa8c3c7 -> :sswitch_9
        -0x24d2fa51 -> :sswitch_a
        -0x23fce3bb -> :sswitch_5
        -0x22aaf243 -> :sswitch_0
        -0x1e40d0fb -> :sswitch_c
        -0x1dcb30e6 -> :sswitch_5
        -0x18725e9d -> :sswitch_c
        -0x10eeadac -> :sswitch_4
        -0x7eec520 -> :sswitch_1
        0x92dfed0 -> :sswitch_2
        0x12580880 -> :sswitch_2
        0x1f6eb1a2 -> :sswitch_8
        0x274d3f61 -> :sswitch_7
        0x30c05d3c -> :sswitch_7
        0x444e59e0 -> :sswitch_e
        0x57b3867a -> :sswitch_d
        0x59a36bfa -> :sswitch_3
        0x5db470ce -> :sswitch_a
        0x62291297 -> :sswitch_e
        0x66a6014e -> :sswitch_d
        0x6877dd0e -> :sswitch_0
        0x6e3c7e21 -> :sswitch_9
        0x7b9b5546 -> :sswitch_6
    .end sparse-switch
.end method
