.class public final Ll/۬᩷ۧ;
.super Ljava/lang/Object;
.source "K7FD"


# direct methods
.method public static ۙ(Landroid/content/Context;IZ)Landroid/content/Context;
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, -0x5295b0a0

    sget v5, Ll/ۖܰ;->۟֫ܽ:I

    sget v6, Ll/֡ܳ;->֨ᩳۢ:I

    const-string v7, "\u073a\u1a76"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x4d

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x3ad

    const v9, 0x25bda6c5

    xor-int/2addr v8, v9

    const v9, 0x1c269c3f

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v5

    mul-int/lit16 v4, v4, 0x953

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 89
    sget v7, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v7, :cond_4

    goto/16 :goto_3

    .line 24
    :sswitch_0
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v7

    if-nez v7, :cond_6

    goto/16 :goto_3

    .line 47
    :sswitch_1
    sget v7, Ll/ۗ᩵;->ᩳܶۤ:I

    if-lez v7, :cond_9

    goto/16 :goto_4

    .line 109
    :sswitch_2
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    sget v7, Ll/ۖ֡;->ۚۛᩳ:I

    if-lez v7, :cond_b

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    goto/16 :goto_4

    .line 105
    :sswitch_4
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    const/4 p0, 0x0

    return-object p0

    :sswitch_5
    return-object v0

    .line 47
    :sswitch_6
    iput v3, v2, Landroid/content/res/Configuration;->fontScale:F

    .line 48
    invoke-static {v2, p1}, Ll/ۗۡ֫;->ۙ(Landroid/content/res/Configuration;I)V

    .line 49
    invoke-virtual {v0, v2}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object v1

    goto/16 :goto_2

    .line 45
    :sswitch_7
    new-instance v2, Landroid/content/res/Configuration;

    invoke-direct {v2}, Landroid/content/res/Configuration;-><init>()V

    const/4 v3, 0x0

    sget v7, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v7, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v7, "\u073d\u1a7a"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x2581

    const v9, 0x1932a2df

    xor-int/2addr v8, v9

    const v9, 0x3eef47fd

    goto :goto_0

    .line 78
    :sswitch_8
    invoke-static {}, Ll/ۗۡ֫;->᩷()Z

    move-result v7

    if-eqz v7, :cond_2

    goto/16 :goto_1

    .line 42
    :sswitch_9
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v7

    invoke-static {v7, p1}, Ll/ۗۡ֫;->᩷(Landroid/content/res/Configuration;I)Z

    move-result v7

    if-eqz v7, :cond_1

    const-string v7, "\u06e4\u06db"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x3295

    const v9, 0x6ba3c7c2

    xor-int/2addr v8, v9

    const v9, 0x37118a7f

    goto/16 :goto_0

    :cond_1
    const-string v7, "\u1a75\u06d9"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0xbed

    const v9, -0x62fbfdbd

    xor-int/2addr v8, v9

    const v9, -0x3812cf0

    goto/16 :goto_0

    :sswitch_a
    const/16 v7, -0x64

    if-ne p1, v7, :cond_2

    const-string v7, "\u06d9\u0736"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x6259

    const v9, -0x1fd0e018

    xor-int/2addr v8, v9

    const v9, -0x304d591

    goto/16 :goto_0

    :cond_2
    const-string v7, "\u06d9\u05a8"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x6459

    const v9, 0x699408af

    xor-int/2addr v8, v9

    const v9, -0x1779c1d1

    goto/16 :goto_0

    .line 147
    :sswitch_b
    sget-object v7, Ll/᩶᩷ۧ;->ܳ:Landroid/content/SharedPreferences;

    const/4 v7, -0x1

    if-eq p1, v7, :cond_3

    const-string v7, "\u1a75\u06e7"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x79

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x5679

    const v9, -0x17acfeaa

    xor-int/2addr v8, v9

    const v9, 0x62a3e7d1

    goto/16 :goto_0

    .line 39
    :sswitch_c
    sget v7, Ll/ۗۡ֫;->᩹ۙ:I

    .line 147
    sget-object v7, Ll/᩶᩷ۧ;->ܳ:Landroid/content/SharedPreferences;

    if-eqz v7, :cond_3

    const-string v7, "\u06df\u05a1"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x3ac7

    const v9, 0xdeca018

    xor-int/2addr v8, v9

    const v9, -0x6d233787

    goto/16 :goto_0

    :sswitch_d
    return-object v1

    .line 38
    :sswitch_e
    invoke-static {p0}, Ll/ۙ۠֫;->ۤ(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    if-eqz p2, :cond_3

    const-string v7, "\u073d\u06da"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x235f

    const v9, 0xea77582

    xor-int/2addr v8, v9

    const v9, -0x184e1b14

    goto/16 :goto_0

    :cond_3
    :goto_1
    move-object v1, v0

    :goto_2
    const-string v7, "\u1a76\u06df"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x6eff

    const v9, 0x16cd3c65

    xor-int/2addr v8, v9

    const v9, -0x5e7278b9

    goto/16 :goto_0

    :cond_4
    const-string v7, "\u06d8\u0730"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x3b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x3709

    const v9, -0x70496ed2

    xor-int/2addr v8, v9

    const v9, 0x4aa5e23a    # 5435677.0f

    goto/16 :goto_0

    .line 29
    :sswitch_f
    sget v7, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v7, :cond_5

    goto :goto_3

    :cond_5
    const-string v7, "\u073a\u06e1"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x4f

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0xa05

    const v9, 0x29f717e3

    xor-int/2addr v8, v9

    const v9, 0x76075d35

    goto/16 :goto_0

    .line 72
    :sswitch_10
    sget-boolean v7, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v7, :cond_7

    :cond_6
    const-string v7, "\u06da\u06e8"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x7ea1

    const v9, -0x1eaf4232

    xor-int/2addr v8, v9

    const v9, 0x6725f5a5

    goto/16 :goto_0

    :cond_7
    const-string v7, "\u06eb\u06e1"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x5d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x2b97

    const v9, 0x2b785e75

    xor-int/2addr v8, v9

    const v9, -0x5461bdad

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v7

    if-ltz v7, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v7, "\u1a76\u06e0"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x9

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x11eb

    const v9, 0x5022f77f

    xor-int/2addr v8, v9

    const v9, 0x169056b8

    goto/16 :goto_0

    .line 68
    :sswitch_12
    sget v7, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v7, :cond_a

    :cond_9
    :goto_3
    const-string v7, "\u073a\u1a7b"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x79

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x174d

    const v9, 0x25fc313c

    xor-int/2addr v8, v9

    const v9, 0x2ba3a009

    goto/16 :goto_0

    :cond_a
    const-string v7, "\u05a1\u1a75"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x51

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x16b3

    const v9, -0x598d1507

    xor-int/2addr v8, v9

    const v9, -0x3c1b10ab

    goto/16 :goto_0

    :sswitch_13
    sget v7, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v7, :cond_c

    :cond_b
    const-string v7, "\u06ec\u05a1"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x51

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x5931

    const v9, 0x68fc96ff

    xor-int/2addr v8, v9

    const v9, 0x2abb39cb

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u06da\u06dc"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x7387

    const v9, 0x498627ba    # 1098999.2f

    xor-int/2addr v8, v9

    const v9, 0x2cb7146

    goto/16 :goto_0

    :sswitch_14
    sget-boolean v7, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v7, :cond_d

    goto :goto_4

    :cond_d
    const-string v7, "\u06e1\u06e4"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x4285

    const v9, 0x46cb323

    xor-int/2addr v8, v9

    const v9, 0x20aefcf0

    goto/16 :goto_0

    :sswitch_15
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v7

    if-gtz v7, :cond_e

    :goto_4
    const-string v7, "\u1a73\u06e7"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x2319

    const v9, 0x48825090    # 266884.5f

    xor-int/2addr v8, v9

    const v9, -0x58721262

    goto/16 :goto_0

    :cond_e
    const-string v7, "\u06d9\u06e0"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x13

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x5ca1

    const v9, -0x54562648

    xor-int/2addr v8, v9

    const v9, -0x48ec4faf

    goto/16 :goto_0

    .line 120
    :sswitch_16
    sget v7, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v7, :cond_f

    :goto_5
    const-string v7, "\u06db\u06db"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x19d7

    const v9, -0x194f0804

    xor-int/2addr v8, v9

    const v9, 0x309833f

    goto/16 :goto_0

    :cond_f
    const-string v7, "\u1a76\u1a74"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x4bd9

    const v9, -0x1d4b095b

    xor-int/2addr v8, v9

    const v9, -0x215cc325

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c803672 -> :sswitch_f
        -0x7a52aa3d -> :sswitch_b
        -0x7928ddf5 -> :sswitch_10
        -0x77bf4769 -> :sswitch_a
        -0x73b89890 -> :sswitch_e
        -0x6c71af0b -> :sswitch_14
        -0x6bd18040 -> :sswitch_9
        -0x69316a27 -> :sswitch_15
        -0x656c9352 -> :sswitch_10
        -0x64a33c8f -> :sswitch_b
        -0x5f17ff84 -> :sswitch_9
        -0x5b505d85 -> :sswitch_0
        -0x56f59907 -> :sswitch_11
        -0x51c17f1a -> :sswitch_16
        -0x50201b93 -> :sswitch_c
        -0x4f006fae -> :sswitch_4
        -0x4b6ae952 -> :sswitch_8
        -0x3fa4106e -> :sswitch_3
        -0x3f613d5a -> :sswitch_2
        -0x3e235e51 -> :sswitch_7
        -0x356a5bce -> :sswitch_4
        -0x2d8ae086 -> :sswitch_e
        -0x263ad930 -> :sswitch_11
        -0x161fa42e -> :sswitch_d
        -0x14f350f4 -> :sswitch_7
        -0x127e62f0 -> :sswitch_12
        -0x8871f3c -> :sswitch_d
        0x46adaad -> :sswitch_f
        0xa6b3afc -> :sswitch_14
        0x10e196d3 -> :sswitch_16
        0x1133d3eb -> :sswitch_a
        0x15baed1c -> :sswitch_12
        0x1953ebba -> :sswitch_6
        0x1a250b91 -> :sswitch_13
        0x20601110 -> :sswitch_5
        0x2f4bc957 -> :sswitch_1
        0x321ded28 -> :sswitch_c
        0x3788f5e3 -> :sswitch_5
        0x4471482d -> :sswitch_2
        0x4b67bfe3 -> :sswitch_0
        0x4be12937 -> :sswitch_8
        0x602e914f -> :sswitch_1
        0x68c0c76f -> :sswitch_13
        0x6d3d1176 -> :sswitch_15
        0x7304e0e2 -> :sswitch_3
        0x76815a9c -> :sswitch_6
    .end sparse-switch
.end method

.method public static ۙ(Landroid/app/Activity;IZ)V
    .locals 6

    const v0, 0x6a189c46

    sget v1, Ll/ۗ֨;->᩹ۜۡ:I

    sget v2, Ll/֡᩵;->ۤܳ۬:I

    const-string v3, "\u073f\u06e8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6885

    const v5, 0x245505a2

    xor-int/2addr v4, v5

    const v5, 0x383275a3

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x7a9f

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 147
    sget v3, Ll/ۗۡ֫;->᩹ۙ:I

    sget-object v3, Ll/᩶᩷ۧ;->ܳ:Landroid/content/SharedPreferences;

    if-eqz v3, :cond_2

    const-string v3, "\u06da\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x4f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x376b

    const v5, 0x7259da1b

    xor-int/2addr v4, v5

    const v5, 0x323fddf7

    goto :goto_0

    .line 148
    :sswitch_0
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    sget v3, Ll/ۖ֡;->ۚۛᩳ:I

    if-lez v3, :cond_c

    goto/16 :goto_5

    .line 77
    :sswitch_1
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-lez v3, :cond_e

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v3

    if-nez v3, :cond_9

    goto/16 :goto_2

    .line 126
    :sswitch_3
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    goto/16 :goto_2

    .line 86
    :sswitch_4
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    return-void

    .line 156
    :sswitch_5
    invoke-virtual {p0}, Landroid/app/Activity;->recreate()V

    goto/16 :goto_1

    .line 153
    :sswitch_6
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    invoke-static {v3, p1}, Ll/ۗۡ֫;->᩷(Landroid/content/res/Configuration;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "\u06d6\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x15

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x46a1

    const v5, 0x32dafc90

    xor-int/2addr v4, v5

    const v5, -0x11c02122

    goto :goto_0

    .line 150
    :sswitch_7
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u1a7a\u1a7b"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x33

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2045

    const v5, -0x7c22f451

    xor-int/2addr v4, v5

    const v5, 0x6d77cac0

    goto/16 :goto_0

    .line 147
    :sswitch_8
    sget-object v3, Ll/᩶᩷ۧ;->ܳ:Landroid/content/SharedPreferences;

    .line 150
    invoke-static {p0}, Ll/ۗ֫;->᩹ۚ֨(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "\u06d6\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x13

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x781b

    const v5, -0x660cbda3

    xor-int/2addr v4, v5

    const v5, -0x5937a7df

    goto/16 :goto_0

    :sswitch_9
    return-void

    :sswitch_a
    if-eqz p2, :cond_2

    const-string v3, "\u1a79\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2a63

    const v5, -0x63bc7d49

    xor-int/2addr v4, v5

    const v5, 0x44330cf4

    goto/16 :goto_0

    :cond_2
    :goto_1
    const-string v3, "\u06e0\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1057

    const v5, 0x63355ec9

    xor-int/2addr v4, v5

    const v5, 0x2ac5f11c

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v3, :cond_3

    const-string v3, "\u06d8\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x47

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x431

    const v5, -0x2cdb8bd2

    xor-int/2addr v4, v5

    const v5, 0x310910cd

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u1a79\u06db"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6487

    const v5, 0x1c7e5b9a

    xor-int/2addr v4, v5

    const v5, -0x2ddae502

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u06eb\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x52cf

    const v5, 0x7dc028fe

    xor-int/2addr v4, v5

    const v5, -0x353d1d8f    # -6385976.5f

    goto/16 :goto_0

    .line 125
    :sswitch_d
    sget v3, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u06dc\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x65f5

    const v5, -0x3a44d3f2

    xor-int/2addr v4, v5

    const v5, -0x62c00a48

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u1a79\u0730"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x45

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5e55

    const v5, 0x1998eebd

    xor-int/2addr v4, v5

    const v5, 0x2fdb0cc2

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    move-result v3

    if-ltz v3, :cond_7

    :goto_2
    const-string v3, "\u06dc\u1a74"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6f0f

    const v5, -0x2a6c58ed

    xor-int/2addr v4, v5

    const v5, 0x29225ede

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a77\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x29

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4ebb

    const v5, 0x40683d7d

    xor-int/2addr v4, v5

    const v5, -0x19779502

    goto/16 :goto_0

    .line 152
    :sswitch_10
    sget-boolean v3, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u06da\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x43

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x364d

    const v5, 0x2f468abc

    xor-int/2addr v4, v5

    const v5, -0x6aa40ddc

    goto/16 :goto_0

    .line 64
    :sswitch_11
    sget v3, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u06e1\u06eb"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x63d9

    const v5, -0x39f29d8e

    xor-int/2addr v4, v5

    const v5, 0x6ea43489

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a74\u1a74"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x337b

    const v5, -0x3a7b31d7

    xor-int/2addr v4, v5

    const v5, 0x4c7eacca    # 6.676151E7f

    goto/16 :goto_0

    .line 86
    :sswitch_12
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_4

    :cond_b
    const-string v3, "\u06d9\u1a7a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x74f3

    const v5, 0x62440102

    xor-int/2addr v4, v5

    const v5, 0x6dbf0781

    goto/16 :goto_0

    :sswitch_13
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v3

    if-gtz v3, :cond_d

    :cond_c
    :goto_4
    const-string v3, "\u06e2\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4647

    const v5, 0x22469068

    xor-int/2addr v4, v5

    const v5, 0x48d8a643

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u0733\u05a8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x35

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4a97

    const v5, -0x607fe059

    xor-int/2addr v4, v5

    const v5, 0x624e99fa

    goto/16 :goto_0

    .line 59
    :sswitch_14
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_f

    :cond_e
    :goto_5
    const-string v3, "\u06d7\u1a76"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x72bf

    const v5, 0xfc9311a

    xor-int/2addr v4, v5

    const v5, 0x8a9f91

    goto/16 :goto_0

    :cond_f
    const-string v3, "\u073d\u06dc"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5a2d

    const v5, 0x399db136

    xor-int/2addr v4, v5

    const v5, -0x62b29b85

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4e09503f -> :sswitch_0
        -0x40a106a9 -> :sswitch_14
        -0x3f261700 -> :sswitch_9
        -0x3df21009 -> :sswitch_1
        -0x3cc1b9be -> :sswitch_4
        -0x390fa86e -> :sswitch_7
        -0x36d9fa01 -> :sswitch_6
        -0x319c32ca -> :sswitch_a
        -0x2acd9d4b -> :sswitch_e
        -0x2538fc53 -> :sswitch_11
        -0x20b6a84e -> :sswitch_5
        -0x1cebe753 -> :sswitch_13
        -0x1b8e82af -> :sswitch_3
        -0x1581663f -> :sswitch_12
        -0x15697996 -> :sswitch_2
        -0x13e4cbc7 -> :sswitch_2
        -0x11db613b -> :sswitch_b
        -0x8331daf -> :sswitch_d
        -0x5cd19ea -> :sswitch_14
        0x68c1a23 -> :sswitch_4
        0xb6e222f -> :sswitch_10
        0x15ed2aff -> :sswitch_8
        0x17eaba0f -> :sswitch_c
        0x1b170e30 -> :sswitch_c
        0x1e405f2f -> :sswitch_1
        0x208cbe60 -> :sswitch_8
        0x214d53d7 -> :sswitch_9
        0x22daf4b9 -> :sswitch_e
        0x2de3f0df -> :sswitch_3
        0x2ff2491b -> :sswitch_f
        0x37349963 -> :sswitch_d
        0x3805adca -> :sswitch_11
        0x383ad6f8 -> :sswitch_a
        0x38726df0 -> :sswitch_f
        0x4017876e -> :sswitch_b
        0x4e53853c -> :sswitch_10
        0x5ffd1711 -> :sswitch_6
        0x6071d9e7 -> :sswitch_0
        0x627c1144 -> :sswitch_13
        0x6749f5e9 -> :sswitch_12
        0x72bf5fce -> :sswitch_5
        0x785ea914 -> :sswitch_7
    .end sparse-switch
.end method

.method public static ۙ(Landroid/content/Context;)V
    .locals 0

    .line 138
    invoke-static {p0}, Ll/۬᩷ۧ;->᩷(Landroid/content/Context;)V

    .line 139
    invoke-static {}, Ll/ۛܳۚ;->ۧ()V

    return-void
.end method

.method public static ۙ(Landroid/content/res/Configuration;IZ)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x635fbc9e

    sget v3, Ll/ۖ᩹;->۫ܽۗ:I

    sget v4, Ll/ۘܽ;->᩹ۧۚ:I

    const-string v5, "\u06ec\u05a1"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x71fb

    const v7, 0x32ac5f91

    xor-int/2addr v6, v7

    const v7, -0x420dfd1d

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0xe9d

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    goto :goto_1

    .line 54
    :sswitch_0
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v5

    if-nez v5, :cond_8

    goto/16 :goto_7

    .line 127
    :sswitch_1
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v5

    if-eqz v5, :cond_e

    goto/16 :goto_5

    .line 103
    :sswitch_2
    sget v5, Ll/֡᩻;->᩷ۧ᩺:I

    if-lez v5, :cond_a

    :goto_1
    const-string v5, "\u06d9\u06eb"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x71

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3683

    const v7, -0x75d13a09

    xor-int/2addr v6, v7

    const v7, 0x771ef2df

    goto :goto_0

    .line 84
    :sswitch_3
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    return-void

    .line 78
    :sswitch_4
    invoke-static {}, Ll/ۗۡ֫;->᩷()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_2

    .line 71
    :sswitch_5
    invoke-static {p0, p1}, Ll/ۗۡ֫;->ۙ(Landroid/content/res/Configuration;I)V

    return-void

    :sswitch_6
    const/16 v5, -0x64

    if-ne p1, v5, :cond_0

    const-string v5, "\u06ec\u1a74"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5f5f

    const v7, 0x76fc1ab8

    xor-int/2addr v6, v7

    const v7, 0x679b5241

    goto :goto_0

    :cond_0
    const-string v5, "\u1a73\u05a8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x5b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2dd7

    const v7, -0x5bdc2581

    xor-int/2addr v6, v7

    const v7, -0xa90b606

    goto :goto_0

    :sswitch_7
    and-int v5, v0, v1

    .line 69
    iput v5, p0, Landroid/content/res/Configuration;->uiMode:I

    goto/16 :goto_3

    :sswitch_8
    iget v0, p0, Landroid/content/res/Configuration;->uiMode:I

    const/16 v1, -0x31

    .line 51
    sget v5, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v5, :cond_1

    goto/16 :goto_6

    :cond_1
    const-string v5, "\u1a77\u06d9"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x29

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xf93

    const v7, -0x1d49eda9

    xor-int/2addr v6, v7

    const v7, -0x543dcf12

    goto/16 :goto_0

    .line 147
    :sswitch_9
    sget-object v5, Ll/᩶᩷ۧ;->ܳ:Landroid/content/SharedPreferences;

    const/4 v5, -0x1

    if-eq p1, v5, :cond_2

    const-string v5, "\u06ec\u1a78"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2251

    const v7, -0xe9efef6

    xor-int/2addr v6, v7

    const v7, -0x790375e9

    goto/16 :goto_0

    :cond_2
    :goto_2
    const-string v5, "\u06ec\u0730"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x1b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3115

    const v7, 0x9243cb0

    xor-int/2addr v6, v7

    const v7, 0x264cf82

    goto/16 :goto_0

    .line 64
    :sswitch_a
    sget v5, Ll/ۗۡ֫;->᩹ۙ:I

    .line 147
    sget-object v5, Ll/᩶᩷ۧ;->ܳ:Landroid/content/SharedPreferences;

    if-eqz v5, :cond_3

    const-string v5, "\u06ec\u0733"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xc03

    const v7, -0x2e075e9a

    xor-int/2addr v6, v7

    const v7, -0x5f999e06

    goto/16 :goto_0

    :sswitch_b
    return-void

    :sswitch_c
    if-eqz p2, :cond_3

    const-string v5, "\u1a7a\u1a73"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0xb

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3419

    const v7, -0x25f70c05

    xor-int/2addr v6, v7

    const v7, -0x4e7ea649

    goto/16 :goto_0

    :cond_3
    :goto_3
    const-string v5, "\u06d9\u0736"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x5b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6dbd

    const v7, 0x551c85ea

    xor-int/2addr v6, v7

    const v7, -0x61de709d

    goto/16 :goto_0

    :sswitch_d
    sget v5, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v5, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v5, "\u1a7b\u073f"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x37b1

    const v7, 0x429b769c

    xor-int/2addr v6, v7

    const v7, 0x79c2598d

    goto/16 :goto_0

    .line 20
    :sswitch_e
    sget v5, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v5, :cond_5

    goto/16 :goto_7

    :cond_5
    const-string v5, "\u06d9\u06e2"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x15

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4c0f

    const v7, -0x4439249

    xor-int/2addr v6, v7

    const v7, -0x1502af11

    goto/16 :goto_0

    .line 14
    :sswitch_f
    sget v5, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v5, :cond_6

    goto :goto_4

    :cond_6
    const-string v5, "\u1a78\u1a7a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x79

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6163

    const v7, -0x7c897566

    xor-int/2addr v6, v7

    const v7, 0x2812cf1c

    goto/16 :goto_0

    :sswitch_10
    sget v5, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v5, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v5, "\u05a1\u06e8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x47

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x31f7

    const v7, -0x610e6c1f

    xor-int/2addr v6, v7

    const v7, -0x16055251

    goto/16 :goto_0

    .line 31
    :sswitch_11
    sget v5, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v5, :cond_9

    :cond_8
    :goto_4
    const-string v5, "\u06eb\u06e2"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7e6f

    const v7, 0x1c0e6828

    xor-int/2addr v6, v7

    const v7, 0x10ea4f39

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u06da\u073a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7d4b

    const v7, -0x29a44051

    xor-int/2addr v6, v7

    const v7, -0x34649b03    # -2.0367866E7f

    goto/16 :goto_0

    :sswitch_12
    sget-boolean v5, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v5, :cond_b

    :cond_a
    :goto_5
    const-string v5, "\u06db\u06da"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1e5d

    const v7, 0x2ee634ff

    xor-int/2addr v6, v7

    const v7, -0x1c895040

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u0730\u1a7a"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x65

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7bcf

    const v7, 0x1ad9b0b2

    xor-int/2addr v6, v7

    const v7, 0x5c32b040

    goto/16 :goto_0

    .line 142
    :sswitch_13
    sget v5, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v5, :cond_c

    goto :goto_7

    :cond_c
    const-string v5, "\u0733\u1a77"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x2d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x508b

    const v7, -0x22c0cb87

    xor-int/2addr v6, v7

    const v7, 0x315d257c

    goto/16 :goto_0

    .line 127
    :sswitch_14
    sget-boolean v5, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v5, :cond_d

    :goto_6
    const-string v5, "\u073f\u06e2"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6e7

    const v7, 0x7874cdbf

    xor-int/2addr v6, v7

    const v7, 0x76efa24d

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u05a1\u1a74"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7f61

    const v7, -0x53d8a2ff

    xor-int/2addr v6, v7

    const v7, -0x233449e6

    goto/16 :goto_0

    .line 79
    :sswitch_15
    sget v5, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v5, :cond_f

    :cond_e
    :goto_7
    const-string v5, "\u06d9\u06da"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x77eb

    const v7, 0x71d146e0

    xor-int/2addr v6, v7

    const v7, 0x552a5450

    goto/16 :goto_0

    :cond_f
    const-string v5, "\u1a79\u06e0"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x6b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3877

    const v7, 0x68732991

    xor-int/2addr v6, v7

    const v7, -0x5873bb83

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ea6e6dd -> :sswitch_7
        -0x7b3afcd8 -> :sswitch_9
        -0x7803b5c3 -> :sswitch_e
        -0x75a2d369 -> :sswitch_11
        -0x720aa853 -> :sswitch_1
        -0x71b8a10b -> :sswitch_a
        -0x66ae9e3d -> :sswitch_15
        -0x64389795 -> :sswitch_b
        -0x5e9fadb3 -> :sswitch_11
        -0x5da03bf2 -> :sswitch_6
        -0x5b01c7ea -> :sswitch_3
        -0x44c8a99d -> :sswitch_d
        -0x37cab54e -> :sswitch_2
        -0x35a9f9bf -> :sswitch_14
        -0x35a3123d -> :sswitch_15
        -0x20b6f3f7 -> :sswitch_8
        -0x1b215f96 -> :sswitch_c
        -0x18ba4d74 -> :sswitch_7
        -0x176033fd -> :sswitch_3
        -0xd61836f -> :sswitch_14
        -0xd3ade96 -> :sswitch_1
        -0x9746e4f -> :sswitch_d
        -0x7973e04 -> :sswitch_13
        -0x57b9976 -> :sswitch_4
        -0x1237b5f -> :sswitch_8
        0x22f0171 -> :sswitch_a
        0x5c62ea3 -> :sswitch_10
        0x632f97b -> :sswitch_f
        0x186b79c1 -> :sswitch_e
        0x233bdda4 -> :sswitch_c
        0x2c22fb68 -> :sswitch_5
        0x2ed9c2d7 -> :sswitch_0
        0x329b0ca0 -> :sswitch_b
        0x3f991c33 -> :sswitch_f
        0x41c191a1 -> :sswitch_12
        0x5037637d -> :sswitch_9
        0x524cfadb -> :sswitch_0
        0x56847a9e -> :sswitch_10
        0x576fb806 -> :sswitch_13
        0x63fa0902 -> :sswitch_6
        0x68a73550 -> :sswitch_4
        0x69698d11 -> :sswitch_2
        0x6ab6916e -> :sswitch_12
        0x6cb0c988 -> :sswitch_5
    .end sparse-switch
.end method

.method public static ۙ(Ll/ܽܿ֫;)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x5c5191ad

    sget v3, Ll/ۗܶ;->ᩴ֫۫:I

    sget v4, Ll/ۗܰ;->ܶۜ۬:I

    const-string v5, "\u073d\u06db"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x33

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x54a9

    const v7, -0x4634f90f

    xor-int/2addr v6, v7

    const v7, 0x2b6821f6

    :goto_0
    xor-int/2addr v5, v7

    move-object v7, v0

    :goto_1
    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x59e5

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 44
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result v5

    if-eqz v5, :cond_5

    goto/16 :goto_4

    .line 65
    :sswitch_0
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    move-result v5

    if-ltz v5, :cond_9

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v5

    if-nez v5, :cond_b

    goto/16 :goto_2

    .line 49
    :sswitch_2
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    return-void

    .line 89
    :sswitch_4
    invoke-static {p0, v1}, Ll/ۙ۠֫;->ۙ(Landroid/content/ContextWrapper;Ljava/lang/String;)V

    .line 92
    invoke-static {p0}, Ll/ۙ۠֫;->ۙ(Landroid/content/ContextWrapper;)V

    return-void

    :sswitch_5
    const/4 v1, 0x0

    .line 6
    sget v5, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v5, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v5, "\u06e8\u06eb"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x29

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5359

    const v8, -0x780fcebf

    xor-int/2addr v6, v8

    const v8, 0x5592a07e

    goto/16 :goto_5

    .line 88
    :sswitch_6
    invoke-static {v7}, Ll/ۗۡ֫;->ۙ(Ll/۫ܿ֫;)V

    .line 90
    invoke-static {p0}, Ll/۬᩷ۧ;->᩷(Landroid/content/Context;)V

    .line 32
    sget v5, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v5, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v5, "\u0730\u06e1"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x17

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3f5f

    const v8, -0x431e37e7

    xor-int/2addr v6, v8

    const v8, -0x1b164db

    goto/16 :goto_5

    .line 88
    :sswitch_7
    new-instance v7, Ll/۫ܿ֫;

    .line 89
    sget v5, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v5, :cond_2

    goto/16 :goto_3

    :cond_2
    const/4 v5, 0x3

    .line 88
    invoke-direct {v7, v5}, Ll/۫ܿ֫;-><init>(I)V

    .line 54
    sget-boolean v5, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v5, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v5, "\u06e4\u1a77"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xc29

    const v8, -0x127eafa5

    xor-int/2addr v6, v8

    const v8, -0x62ab1c58

    goto/16 :goto_5

    .line 87
    :sswitch_8
    invoke-static {}, Ll/ۗۡ֫;->᩸()V

    sget v5, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v5, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v5, "\u06ec\u073f"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5d4b

    const v8, -0x7785505e

    xor-int/2addr v6, v8

    const v8, -0x447fdb06

    goto/16 :goto_5

    .line 55
    :sswitch_9
    sget-boolean v5, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v5, :cond_6

    :cond_5
    const-string v5, "\u073a\u06e1"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x41

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2087

    const v8, -0x3d247e4d

    xor-int/2addr v6, v8

    const v8, -0x4150571e

    goto/16 :goto_5

    :cond_6
    const-string v5, "\u06df\u1a73"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5833

    const v8, 0x128e5988

    xor-int/2addr v6, v8

    const v8, 0x35beed5

    goto/16 :goto_5

    .line 21
    :sswitch_a
    sget v5, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v5, :cond_7

    :goto_2
    const-string v5, "\u1a79\u06da"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x55

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x14bf

    const v8, -0x3e7c31c4

    xor-int/2addr v6, v8

    const v8, 0x432c9989

    goto/16 :goto_5

    :cond_7
    const-string v5, "\u1a77\u05ab"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x31

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xf53

    const v8, -0x10e73c85

    xor-int/2addr v6, v8

    const v8, 0x6c84bb4d

    goto/16 :goto_5

    :sswitch_b
    sget v5, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v5, :cond_8

    :goto_3
    const-string v5, "\u06dc\u1a79"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7ba3

    const v7, 0x585969cf

    xor-int/2addr v6, v7

    const v7, -0x64ee42c6

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06d9\u06e8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x19

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x66d1

    const v8, -0x1adaac69

    xor-int/2addr v6, v8

    const v8, -0x4c49a158

    goto :goto_5

    .line 0
    :sswitch_c
    sget v5, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v5, :cond_a

    :cond_9
    :goto_4
    const-string v5, "\u073a\u06e0"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0xd

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5f5d

    const v8, -0x7dcbe979

    xor-int/2addr v6, v8

    const v8, -0xc8f192b

    goto :goto_5

    :cond_a
    const-string v5, "\u1a7b\u06db"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x9

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4e7f

    const v8, -0x1282a49b

    xor-int/2addr v6, v8

    const v8, -0x1d234e6b

    goto :goto_5

    .line 86
    :sswitch_d
    invoke-static {p0}, Ll/ۙ۠֫;->ۙ(Ll/ܽܿ֫;)V

    .line 58
    sget-boolean v5, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v5, :cond_c

    :cond_b
    const-string v5, "\u0730\u073a"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3333

    const v8, 0x53c6babf

    xor-int/2addr v6, v8

    const v8, -0x7473faee

    goto :goto_5

    :cond_c
    const-string v5, "\u073f\u0730"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0xfa9

    const v8, 0x5d6c79e8

    xor-int/2addr v6, v8

    const v8, -0x74dbe62c

    :goto_5
    xor-int/2addr v5, v8

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x6785802f -> :sswitch_2
        -0x672d9d34 -> :sswitch_c
        -0x6392467c -> :sswitch_3
        -0x5f9f97aa -> :sswitch_7
        -0x5c3ce2d7 -> :sswitch_1
        -0x57899a20 -> :sswitch_7
        -0x540f1ab6 -> :sswitch_c
        -0x4a3b5184 -> :sswitch_3
        -0x376639a9 -> :sswitch_0
        -0x3759c67d -> :sswitch_b
        -0x355de803 -> :sswitch_5
        -0x32f4a643 -> :sswitch_9
        -0x2d64f4b9 -> :sswitch_d
        -0x19fa46bd -> :sswitch_9
        -0x14ed42f9 -> :sswitch_8
        -0x10049112 -> :sswitch_8
        -0x18020da -> :sswitch_5
        -0xba9a87 -> :sswitch_a
        0x1f012e47 -> :sswitch_b
        0x281d3362 -> :sswitch_6
        0x38c23c15 -> :sswitch_1
        0x40bb5bde -> :sswitch_a
        0x50c552b0 -> :sswitch_0
        0x673021d2 -> :sswitch_4
        0x6ff99f8f -> :sswitch_2
        0x751daf1d -> :sswitch_6
        0x79c35367 -> :sswitch_d
        0x7fad9915 -> :sswitch_4
    .end sparse-switch
.end method

.method public static ۤ(Landroid/app/Activity;IZ)V
    .locals 6

    const v0, -0x12adf26b

    sget v1, Ll/ۖ֨;->֨ۨۧ:I

    sget v2, Ll/ۖ᩹;->۫ܽۗ:I

    const-string v3, "\u05a1\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3db5

    const v5, 0x1657c3aa

    xor-int/2addr v4, v5

    const v5, -0x2da3fa67

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x1027

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget-boolean v3, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v3, :cond_6

    goto/16 :goto_3

    .line 93
    :sswitch_0
    sget v3, Ll/ۗ֨;->᩹ۜۡ:I

    if-gez v3, :cond_9

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_1
    const-string v3, "\u1a75\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5d9

    const v5, -0xcf3322c

    xor-int/2addr v4, v5

    const v5, 0x21f982b1

    goto :goto_0

    :sswitch_2
    sget v3, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v3, :cond_b

    goto/16 :goto_2

    .line 29
    :sswitch_3
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    goto/16 :goto_2

    .line 61
    :sswitch_4
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    return-void

    .line 112
    :sswitch_5
    invoke-static {p0}, Ll/ۙ۠֫;->ۙ(Landroid/content/ContextWrapper;)V

    .line 113
    invoke-static {p0, p1, p2}, Ll/۬᩷ۧ;->ۙ(Landroid/app/Activity;IZ)V

    return-void

    .line 59
    :sswitch_6
    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_1

    const-string v3, "\u06da\u06e4"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3afb

    const v5, 0x883ac5a

    xor-int/2addr v4, v5

    const v5, 0x788cc3ce

    goto :goto_0

    :cond_1
    const-string v3, "\u06e8\u073d"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5ea7

    const v5, -0x4c774b03

    xor-int/2addr v4, v5

    const v5, -0x4c3228a2

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    const-string v3, "\u1a78\u06e4"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x30b7

    const v5, 0x3f22ad52

    xor-int/2addr v4, v5

    const v5, 0x40cd3ba2

    goto/16 :goto_0

    .line 8
    :sswitch_8
    sget v3, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u06df\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3c27

    const v5, -0x4967e0b6

    xor-int/2addr v4, v5

    const v5, -0x77b777a5

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v3

    if-eqz v3, :cond_4

    :goto_2
    const-string v3, "\u06e7\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1eab

    const v5, -0x4037a791

    xor-int/2addr v4, v5

    const v5, -0x4abe0fa5    # -7.2247866E-7f

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e1\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6b0b

    const v5, 0x458f8573

    xor-int/2addr v4, v5

    const v5, 0x3591d8

    goto/16 :goto_0

    .line 13
    :sswitch_a
    sget v3, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u1a79\u073f"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x78b3

    const v5, 0x1bd9d9e5

    xor-int/2addr v4, v5

    const v5, 0x3750c832

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u1a78\u1a7b"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x11

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5711

    const v5, -0x18174c70

    xor-int/2addr v4, v5

    const v5, -0x9565cc8

    goto/16 :goto_0

    .line 69
    :sswitch_b
    sget v3, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u1a78\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4285

    const v5, 0x3c6bc821

    xor-int/2addr v4, v5

    const v5, -0x497215ca

    goto/16 :goto_0

    .line 70
    :sswitch_c
    sget v3, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u06df\u06d9"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6cdb

    const v5, 0x17a3d707

    xor-int/2addr v4, v5

    const v5, -0x252c7c17

    goto/16 :goto_0

    .line 23
    :sswitch_d
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v3

    if-eqz v3, :cond_a

    :cond_9
    const-string v3, "\u0733\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x3

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2043

    const v5, -0x5109e659

    xor-int/2addr v4, v5

    const v5, 0x24142ac8

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e4\u06df"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x59

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x68d

    const v5, 0x636f29d4

    xor-int/2addr v4, v5

    const v5, -0x7373179b

    goto/16 :goto_0

    .line 50
    :sswitch_e
    sget v3, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_3
    const-string v3, "\u06eb\u06e1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5fdb

    const v5, 0x38092991

    xor-int/2addr v4, v5

    const v5, 0x74aeaa9

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073d\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x25a9

    const v5, -0x6d132b5f

    xor-int/2addr v4, v5

    const v5, 0x22b89430

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6fc33ae2 -> :sswitch_1
        -0x65aa0dc4 -> :sswitch_3
        -0x62d577f2 -> :sswitch_8
        -0x5ea1ab72 -> :sswitch_2
        -0x582290a5 -> :sswitch_4
        -0x55b3c9e9 -> :sswitch_9
        -0x544b87d7 -> :sswitch_3
        -0x4fcaa9d3 -> :sswitch_b
        -0x405854d8 -> :sswitch_d
        -0x36eb63a8 -> :sswitch_8
        -0x25722a42 -> :sswitch_9
        -0x1a6c22b9 -> :sswitch_0
        -0x13fb193c -> :sswitch_7
        -0xc9b051c -> :sswitch_e
        -0x8374d15 -> :sswitch_2
        -0x135f3f3 -> :sswitch_0
        0x346205f -> :sswitch_6
        0x42f9c60 -> :sswitch_d
        0x46a5cb7 -> :sswitch_c
        0x46ec635 -> :sswitch_e
        0xaf7953c -> :sswitch_5
        0xcb74a0b -> :sswitch_1
        0xce1536a -> :sswitch_b
        0x2ed2cfc8 -> :sswitch_5
        0x30dd5cdc -> :sswitch_a
        0x55d7f2db -> :sswitch_a
        0x5ac684c3 -> :sswitch_6
        0x5e7a58e1 -> :sswitch_7
        0x63730b6d -> :sswitch_4
        0x6bf326c0 -> :sswitch_c
    .end sparse-switch
.end method

.method public static ᩷(Landroid/app/Activity;IZ)V
    .locals 6

    const v0, 0x6e18de34

    sget v1, Ll/֡᩻;->᩷ۧ᩺:I

    sget v2, Ll/֨ۚ;->֡᩸ۛ:I

    const-string v3, "\u1a77\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xd43

    const v5, -0x307341d5

    xor-int/2addr v4, v5

    const v5, 0xce5174a

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x1923

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 91
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v3

    if-eqz v3, :cond_9

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    sget v3, Ll/֡ۖ;->۫ۙ᩶:I

    if-lez v3, :cond_b

    goto/16 :goto_3

    .line 126
    :sswitch_1
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    sget v3, Ll/ۗ᩺;->֡ۙۜ:I

    if-gez v3, :cond_7

    goto/16 :goto_2

    .line 77
    :sswitch_2
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    sget v3, Ll/֡᩻;->᩷ۧ᩺:I

    if-lez v3, :cond_5

    goto/16 :goto_4

    .line 120
    :sswitch_3
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    return-void

    .line 130
    :sswitch_5
    invoke-static {p0}, Ll/ۙ۠֫;->ۙ(Landroid/content/ContextWrapper;)V

    .line 131
    invoke-static {p0, p1, p2}, Ll/۬᩷ۧ;->ۙ(Landroid/app/Activity;IZ)V

    return-void

    :sswitch_6
    sget v3, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "\u1a74\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7fd7

    const v5, -0x15bcd244

    xor-int/2addr v4, v5

    const v5, -0x7d5e32b7

    goto :goto_0

    :sswitch_7
    sget v3, Ll/۬;->᩸ۜ᩹:I

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u1a79\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7ec1

    const v5, -0x74282953

    xor-int/2addr v4, v5

    const v5, 0xab53489

    goto :goto_0

    .line 81
    :sswitch_8
    sget v3, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u0733\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x31

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x30fd

    const v5, -0x68a66f01

    xor-int/2addr v4, v5

    const v5, 0x7ca6a4c2

    goto/16 :goto_0

    .line 129
    :sswitch_9
    sget v3, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v3, :cond_3

    :goto_1
    const-string v3, "\u1a73\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x21

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6c81

    const v5, -0x774ab772

    xor-int/2addr v4, v5

    const v5, -0x16b92147

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06e7\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x55

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1a1b

    const v5, 0x5b7cb012

    xor-int/2addr v4, v5

    const v5, 0x16aad9b2

    goto/16 :goto_0

    .line 66
    :sswitch_a
    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u06e2\u06dc"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x75db

    const v5, -0x60945a66

    xor-int/2addr v4, v5

    const v5, -0x4eefd323

    goto/16 :goto_0

    .line 127
    :sswitch_b
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v3

    if-eqz v3, :cond_6

    :cond_5
    :goto_2
    const-string v3, "\u0730\u06df"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x19

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4601

    const v5, -0x223abb69

    xor-int/2addr v4, v5

    const v5, 0x22b3d7b

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06db\u05ab"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x10a7

    const v5, 0x582ad9f0

    xor-int/2addr v4, v5

    const v5, -0x6a051e78

    goto/16 :goto_0

    .line 27
    :sswitch_c
    sget-boolean v3, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v3, :cond_8

    :cond_7
    :goto_3
    const-string v3, "\u06e0\u073a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x77c1

    const v5, -0x5c06a892

    xor-int/2addr v4, v5

    const v5, -0x352ba283    # -6958782.5f

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e4\u06db"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x71

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x18b1

    const v5, -0x3a91e8a1

    xor-int/2addr v4, v5

    const v5, -0xc4588f7

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06dc\u1a75"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x43

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x301b

    const v5, 0x4d8534f4    # 2.79355E8f

    xor-int/2addr v4, v5

    const v5, -0x242840a4

    goto/16 :goto_0

    .line 66
    :sswitch_d
    sget v3, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v3, :cond_a

    :goto_4
    const-string v3, "\u06db\u0736"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5a53

    const v5, -0x5218ca8

    xor-int/2addr v4, v5

    const v5, -0xfabf200

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u0736\u06e7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x371f

    const v5, 0x306702a0

    xor-int/2addr v4, v5

    const v5, -0x2c671ac9

    goto/16 :goto_0

    .line 1
    :sswitch_e
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u06d8\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x69

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7b55

    const v5, -0x7db61774

    xor-int/2addr v4, v5

    const v5, -0x4abbdbc4

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e7\u06ec"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6389

    const v5, -0x2555396

    xor-int/2addr v4, v5

    const v5, -0x33556d20    # -8.942976E7f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x73f2adff -> :sswitch_2
        -0x7371a533 -> :sswitch_7
        -0x6beee417 -> :sswitch_b
        -0x6a33b0a5 -> :sswitch_7
        -0x690077ad -> :sswitch_d
        -0x6262668e -> :sswitch_6
        -0x6040f6f1 -> :sswitch_5
        -0x4c30d682 -> :sswitch_0
        -0x4c26c02b -> :sswitch_4
        -0x4bfe06a5 -> :sswitch_c
        -0x47b50672 -> :sswitch_2
        -0x3d9f610f -> :sswitch_6
        -0x31e9f687 -> :sswitch_1
        -0x31cf8bbe -> :sswitch_b
        -0x2b5892ab -> :sswitch_a
        -0x1ad297c8 -> :sswitch_3
        -0x15eb5ded -> :sswitch_d
        -0x149c88cc -> :sswitch_9
        -0xfc3049c -> :sswitch_5
        0x263b66cb -> :sswitch_9
        0x276269ca -> :sswitch_8
        0x29bff33d -> :sswitch_e
        0x33bb0be3 -> :sswitch_3
        0x3bc8e86c -> :sswitch_a
        0x4a6f58cd -> :sswitch_1
        0x5bdbf1f5 -> :sswitch_c
        0x677f4397 -> :sswitch_4
        0x696d4e2d -> :sswitch_8
        0x6a8861e0 -> :sswitch_0
        0x7e7854a2 -> :sswitch_e
    .end sparse-switch
.end method

.method public static ᩷(Landroid/content/Context;)V
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, 0x64a826b9

    sget v8, Ll/֫֨;->᩶ܺۡ:I

    sget v9, Ll/ۖۙ;->ۤۧۤ:I

    const-string v10, "\u06ec\u073d"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x1761

    const v12, 0x1c6e3f08

    xor-int/2addr v11, v12

    const v12, -0xf95f583

    :goto_0
    xor-int/2addr v10, v12

    move-object v12, v3

    :goto_1
    xor-int/2addr v7, v8

    mul-int/lit16 v7, v7, 0x5099

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    if-eq v4, v5, :cond_a

    const-string v10, "\u05a1\u06da"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x2f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0xd49

    const v13, 0x4f4da484

    xor-int/2addr v11, v13

    const v13, -0x20edb118

    goto/16 :goto_a

    .line 103
    :sswitch_0
    sget v10, Ll/᩺;->۫۬۫:I

    if-gtz v10, :cond_11

    goto/16 :goto_9

    .line 11
    :sswitch_1
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    sget v10, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-lez v10, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v10, "\u1a7b\u06eb"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x5b37

    const v13, -0x201ea218

    xor-int/2addr v11, v13

    const v13, 0x58b563d2

    goto/16 :goto_a

    :sswitch_2
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    sget v10, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v10, :cond_13

    goto/16 :goto_8

    :sswitch_3
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v10

    if-lez v10, :cond_f

    goto/16 :goto_5

    .line 16
    :sswitch_4
    sget v10, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v10, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v10, "\u1a76\u06dc"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x7d

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x73db

    const v13, -0x6a6fd1f1

    xor-int/2addr v11, v13

    const v13, 0xd2203d7

    goto/16 :goto_a

    :sswitch_5
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    sget v10, Ll/ۖ֨;->֨ۨۧ:I

    if-gez v10, :cond_3

    goto/16 :goto_7

    .line 22
    :sswitch_6
    sget v10, Ll/۬;->᩸ۜ᩹:I

    if-nez v10, :cond_c

    goto/16 :goto_5

    :sswitch_7
    sget-boolean v10, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v10, :cond_8

    goto :goto_2

    :sswitch_8
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    :goto_2
    const-string v10, "\u06df\u06e2"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x3

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x2397

    const v13, -0x20cacd1c

    xor-int/2addr v11, v13

    const v13, -0x7aa516e3

    goto/16 :goto_a

    :sswitch_9
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    return-void

    .line 184
    :sswitch_a
    :try_start_0
    new-instance v10, Landroid/content/res/Configuration;

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v11

    invoke-direct {v10, v11}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 185
    invoke-static {v10, v2}, Ll/ۗۡ֫;->ۙ(Landroid/content/res/Configuration;I)V

    .line 186
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v11

    invoke-virtual {v4, v10, v11}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_6

    :sswitch_b
    if-eqz v6, :cond_2

    goto/16 :goto_6

    :cond_2
    const-string v10, "\u06db\u06db"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x7c7

    const v13, 0x161c26e3

    xor-int/2addr v11, v13

    const v13, -0xb28f401

    goto/16 :goto_a

    .line 181
    :sswitch_c
    :try_start_1
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v10

    invoke-static {v10, v2}, Ll/ۗۡ֫;->᩷(Landroid/content/res/Configuration;I)Z

    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v10, "\u0733\u06d6"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x60ff

    const v13, -0x6025c9b0

    xor-int/2addr v11, v13

    const v13, 0x32697281

    goto/16 :goto_a

    .line 169
    :sswitch_d
    :try_start_2
    invoke-static {}, Ll/᩶᩷ۧ;->ۗ()Landroid/content/res/Resources;

    move-result-object v4

    .line 170
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v10, "\u1a78\u06ec"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x7e65

    const v13, -0x19183343

    xor-int/2addr v11, v13

    const v13, -0x70bcb953

    goto/16 :goto_a

    .line 185
    :sswitch_e
    invoke-static {v12, v2}, Ll/ۗۡ֫;->ۙ(Landroid/content/res/Configuration;I)V

    .line 186
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v10

    invoke-virtual {v0, v12, v10}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    goto :goto_4

    .line 184
    :sswitch_f
    new-instance v12, Landroid/content/res/Configuration;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v10

    .line 14
    sget v11, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v11, :cond_4

    :cond_3
    :goto_3
    const-string v10, "\u06e1\u06d7"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x795b

    const v12, -0x1a48fcb7

    xor-int/2addr v11, v12

    const v12, 0x78aebbf2

    goto/16 :goto_0

    .line 184
    :cond_4
    invoke-direct {v12, v10}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    sget v10, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v10, :cond_5

    const-string v10, "\u06e1\u06dc"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x4b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x6d5

    const v13, -0x2a496722

    xor-int/2addr v11, v13

    const v13, 0x14781ee

    goto/16 :goto_a

    :cond_5
    const-string v10, "\u1a79\u06eb"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x37

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x6497

    const v13, 0x6dc96366

    xor-int/2addr v11, v13

    const v13, -0x2399bc6f

    goto/16 :goto_a

    :sswitch_10
    const/16 v2, -0x64

    .line 181
    invoke-static {v1, v2}, Ll/ۗۡ֫;->᩷(Landroid/content/res/Configuration;I)Z

    move-result v10

    if-eqz v10, :cond_6

    :goto_4
    const-string v10, "\u05ab\u06ec"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x49

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x1c25

    const v13, -0x5aaef7ac

    xor-int/2addr v11, v13

    const v13, -0x6016ae53

    goto/16 :goto_a

    :cond_6
    const-string v10, "\u06da\u06d6"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x65

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x4fb9

    const v13, -0x6a2cbc8c

    xor-int/2addr v11, v13

    const v13, -0x1ca12b6b

    goto/16 :goto_a

    :sswitch_11
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    sget v10, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v10, :cond_7

    goto/16 :goto_9

    :cond_7
    const-string v10, "\u06e0\u1a73"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0xf1b

    const v13, -0x3877454f    # -70005.38f

    xor-int/2addr v11, v13

    const v13, -0x6a05886d

    goto/16 :goto_a

    .line 147
    :sswitch_12
    sget-object v0, Ll/᩶᩷ۧ;->ܳ:Landroid/content/SharedPreferences;

    .line 167
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v10, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v10, :cond_9

    :cond_8
    :goto_5
    const-string v10, "\u06e1\u05a1"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x45

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x1e6d

    const v13, 0x6f63ff73

    xor-int/2addr v11, v13

    const v13, -0x2df0503a

    goto/16 :goto_a

    :cond_9
    const-string v10, "\u06e4\u06e8"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x5af

    const v13, 0x112c1c58

    xor-int/2addr v11, v13

    const v13, -0x70dc8c05

    goto/16 :goto_a

    :sswitch_13
    return-void

    .line 147
    :sswitch_14
    sget-object v10, Ll/᩶᩷ۧ;->ܳ:Landroid/content/SharedPreferences;

    if-eqz v10, :cond_a

    const-string v10, "\u06e0\u06db"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x45

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x30b3

    const v13, -0x61ac57df

    xor-int/2addr v11, v13

    const v13, -0x1cf5b322

    goto/16 :goto_a

    :catchall_0
    :cond_a
    :goto_6
    const-string v10, "\u06e2\u1a77"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x57

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x4f79

    const v13, -0x125c1220

    xor-int/2addr v11, v13

    const v13, 0x67a746ba

    goto/16 :goto_a

    :sswitch_15
    sget v10, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v10, :cond_b

    goto :goto_8

    :cond_b
    const-string v10, "\u06d7\u06da"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x79f3

    const v13, -0x3f48ac3b

    xor-int/2addr v11, v13

    const v13, 0xf37e15e    # 9.066001E-30f

    goto/16 :goto_a

    .line 97
    :sswitch_16
    sget-boolean v10, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v10, :cond_d

    :cond_c
    :goto_7
    const-string v10, "\u06d7\u0730"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x6bd3

    const v13, -0x50ee36ca

    xor-int/2addr v11, v13

    const v13, 0x2dbae573

    goto/16 :goto_a

    :cond_d
    const-string v10, "\u1a74\u06df"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x9

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x207

    const v13, -0x3be0ae39

    xor-int/2addr v11, v13

    const v13, -0x56233dee

    goto/16 :goto_a

    .line 62
    :sswitch_17
    sget v10, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v10, :cond_e

    goto/16 :goto_9

    :cond_e
    const-string v10, "\u06e4\u06d9"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x31

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x288f

    const v13, -0x6207f6eb

    xor-int/2addr v11, v13

    const v13, -0x3cc91197

    goto/16 :goto_a

    :sswitch_18
    sget v10, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v10, :cond_10

    :cond_f
    :goto_8
    const-string v10, "\u0736\u06db"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x6b

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x3eaf

    const v13, 0x74f57689

    xor-int/2addr v11, v13

    const v13, 0x41c98f2a

    goto/16 :goto_a

    :cond_10
    const-string v10, "\u0733\u06e7"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x57

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x43ad

    const v13, 0x40be625c

    xor-int/2addr v11, v13

    const v13, 0x5be8deed

    goto :goto_a

    :sswitch_19
    sget v10, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v10, :cond_12

    :cond_11
    const-string v10, "\u05a8\u06e4"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x7d

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x6ddf

    const v13, 0x3755f029

    xor-int/2addr v11, v13

    const v13, -0xfb9bb3c

    goto :goto_a

    :cond_12
    const-string v10, "\u1a77\u06ec"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x27

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x2def

    const v13, -0x6ba48b1c

    xor-int/2addr v11, v13

    const v13, -0x2d881df0

    goto :goto_a

    .line 164
    :sswitch_1a
    sget v10, Ll/ۗۡ֫;->᩹ۙ:I

    .line 8
    sget v10, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v10, :cond_14

    :cond_13
    :goto_9
    const-string v10, "\u1a78\u1a7b"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x23

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x33c1

    const v13, -0x2df4881c

    xor-int/2addr v11, v13

    const v13, -0x73085866

    goto :goto_a

    :cond_14
    const-string v10, "\u1a7a\u1a78"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x27

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x10d1

    const v13, -0x7481d2ca

    xor-int/2addr v11, v13

    const v13, 0x208f373c

    :goto_a
    xor-int/2addr v10, v13

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x78bf05c9 -> :sswitch_14
        -0x77dbdb59 -> :sswitch_11
        -0x73d65fb9 -> :sswitch_19
        -0x6a6a3e5f -> :sswitch_d
        -0x5a320040 -> :sswitch_7
        -0x5a1770e4 -> :sswitch_14
        -0x58771b3a -> :sswitch_1a
        -0x534342af -> :sswitch_5
        -0x5142b22d -> :sswitch_0
        -0x4b8fcfac -> :sswitch_f
        -0x4aa55eab -> :sswitch_6
        -0x43daff2d -> :sswitch_16
        -0x328bd60a -> :sswitch_7
        -0x310d5df0 -> :sswitch_13
        -0x2f3e6678 -> :sswitch_2
        -0x2ba38417 -> :sswitch_1
        -0x27cfa608 -> :sswitch_12
        -0x274486e7 -> :sswitch_8
        -0x230087b2 -> :sswitch_19
        -0x19573c64 -> :sswitch_15
        -0x15cb9a47 -> :sswitch_1
        -0x156f2e21 -> :sswitch_9
        -0x13e53fd7 -> :sswitch_10
        -0xa4bb134 -> :sswitch_11
        -0x7e9258b -> :sswitch_4
        -0x5ee5147 -> :sswitch_0
        -0x533595b -> :sswitch_e
        0x2398657 -> :sswitch_6
        0xd58a21a -> :sswitch_17
        0x10e08f5b -> :sswitch_b
        0x11c923d0 -> :sswitch_13
        0x1969e991 -> :sswitch_2
        0x1ba5d5e9 -> :sswitch_18
        0x1d8d598a -> :sswitch_10
        0x23df2c58 -> :sswitch_16
        0x2424e4dd -> :sswitch_3
        0x2b106cab -> :sswitch_12
        0x2b20b01b -> :sswitch_18
        0x2ef062bb -> :sswitch_c
        0x35b60853 -> :sswitch_f
        0x3849b9ab -> :sswitch_d
        0x3be51935 -> :sswitch_3
        0x3c57904e -> :sswitch_1a
        0x3e14635b -> :sswitch_8
        0x48fe7531 -> :sswitch_b
        0x53c399d3 -> :sswitch_5
        0x5a2dda47 -> :sswitch_15
        0x5e4e2d1f -> :sswitch_c
        0x6078fdb3 -> :sswitch_9
        0x618bfbc1 -> :sswitch_17
        0x66811927 -> :sswitch_a
        0x74caf5bc -> :sswitch_e
        0x7c122d22 -> :sswitch_4
        0x7ca01115 -> :sswitch_a
    .end sparse-switch
.end method
